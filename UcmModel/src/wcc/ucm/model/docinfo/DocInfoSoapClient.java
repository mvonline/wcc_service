package wcc.ucm.model.docinfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;

import wcc.ucm.model.docinfo.root.DocInfoByIDResult;
// This source file is generated by Oracle tools.
// Contents may be subject to change.
// For reporting problems, use the following:
// Generated by Oracle JDeveloper 12c 12.2.1.3.0.0914
public class DocInfoSoapClient {
    public static void main(String[] args) {
        DocInfo docInfo = new DocInfo();
        DocInfoSoap docInfoSoap = docInfo.getDocInfoSoap();
        // Add your code to call the desired methods.
        BindingProvider binding = (BindingProvider) docInfoSoap;
        binding.getRequestContext().put(BindingProvider.USERNAME_PROPERTY , "weblogic");
        binding.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY , "weblogic1");
        DocInfoByIDResult byID = docInfoSoap.docInfoByID(new Integer(1005), null);
        byID.
    }
}
