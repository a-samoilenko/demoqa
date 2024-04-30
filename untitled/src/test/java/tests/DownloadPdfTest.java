package tests;

import com.codeborne.pdftest.PDF;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Configuration.*;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.FileDownloadMode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


import static com.codeborne.selenide.Configuration.*;
import static org.assertj.core.api.Assertions.assertThat;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;


public class DownloadPdfTest {
    @Test
    void downloadPdf() throws Exception {
        Configuration.timeout = 50000;
//        Configuration.holdBrowserOpen = true;
        Configuration.fileDownload = FileDownloadMode.FOLDER;
        var login ="overload_user1";
        var password = "MiP#aith_9Riu1";
        open("https://platformauth-ift3.sc.dev.sbt/auth/realms/PlatformAuth/protocol/openid-connect/auth?client_id=PlatformAuth-Proxy&response_type=code&state=290ed7517894b132a014ca26d56b4e57&nonce=ffcd89ab8f16b2998d74b8aea7ff36d4&redirect_uri=https%3A%2F%2Fplatform-ift3.sc.dev.sbt%2Fopenid-connect-auth%2Fredirect_uri&scope=openid");
        $("#username").setValue(login);
        $("#password").setValue(password);
        $("#kc-login").click();
        $(withText("Overload")).click();
        $(withText("Load Tester")).click();
        $(".ant-table-row:nth-child(2) .ant-space-item:nth-child(4) svg").click();
        File downloadedPdf = $(".ant-btn:nth-child(2) > span").download();
        PDF content = new PDF(downloadedPdf);
        assertThat(content.text).contains("Jmeter pod launched");
    }
}
