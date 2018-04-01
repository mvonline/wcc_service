
package wcc.ucm.model.docinfo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import wcc.ucm.model.docinfo.root.DocInfoByIDResult;
import wcc.ucm.model.docinfo.root.DocInfoByNameResult;
import wcc.ucm.model.docinfo.root.IdcPropertyList;
import wcc.ucm.model.docinfo.root.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0-b170214.1743
 * Generated source version: 2.2
 *
 */
@WebService(name = "DocInfoSoap", targetNamespace = "http://www.stellent.com/DocInfo/")
@XmlSeeAlso({ ObjectFactory.class })
public interface DocInfoSoap {


    /**
     *
     * @param dID
     * @param extraProps
     * @return
     *     returns wcc.ucm.model.docinfo.root.DocInfoByIDResult
     */
    @WebMethod(operationName = "DocInfoByID", action = "http://www.stellent.com/DocInfo/")
    @WebResult(name = "DocInfoByIDResult", targetNamespace = "http://www.stellent.com/DocInfo/")
    @RequestWrapper(localName = "DocInfoByID", targetNamespace = "http://www.stellent.com/DocInfo/",
                    className = "wcc.ucm.model.docinfo.root.DocInfoByID")
    @ResponseWrapper(localName = "DocInfoByIDResponse", targetNamespace = "http://www.stellent.com/DocInfo/",
                     className = "wcc.ucm.model.docinfo.root.DocInfoByIDResponse")
    public DocInfoByIDResult docInfoByID(@WebParam(name = "dID", targetNamespace = "http://www.stellent.com/DocInfo/")
                                         Integer dID,
                                         @WebParam(name = "extraProps",
                                                   targetNamespace = "http://www.stellent.com/DocInfo/")
                                         IdcPropertyList extraProps);

    /**
     *
     * @param dDocName
     * @param extraProps
     * @return
     *     returns wcc.ucm.model.docinfo.root.DocInfoByNameResult
     */
    @WebMethod(operationName = "DocInfoByName", action = "http://www.stellent.com/DocInfo/")
    @WebResult(name = "DocInfoByNameResult", targetNamespace = "http://www.stellent.com/DocInfo/")
    @RequestWrapper(localName = "DocInfoByName", targetNamespace = "http://www.stellent.com/DocInfo/",
                    className = "wcc.ucm.model.docinfo.root.DocInfoByName")
    @ResponseWrapper(localName = "DocInfoByNameResponse", targetNamespace = "http://www.stellent.com/DocInfo/",
                     className = "wcc.ucm.model.docinfo.root.DocInfoByNameResponse")
    public DocInfoByNameResult docInfoByName(@WebParam(name = "dDocName",
                                                       targetNamespace = "http://www.stellent.com/DocInfo/")
                                             String dDocName,
                                             @WebParam(name = "extraProps",
                                                       targetNamespace = "http://www.stellent.com/DocInfo/")
                                             IdcPropertyList extraProps);

}
