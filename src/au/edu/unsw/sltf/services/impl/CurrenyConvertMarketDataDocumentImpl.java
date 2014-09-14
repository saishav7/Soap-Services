/*
 * An XML document type.
 * Localname: currenyConvertMarketData
 * Namespace: http://sltf.unsw.edu.au/services
 * Java type: au.edu.unsw.sltf.services.CurrenyConvertMarketDataDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services.impl;
/**
 * A document containing one currenyConvertMarketData(@http://sltf.unsw.edu.au/services) element.
 *
 * This is a complex type.
 */
public class CurrenyConvertMarketDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.CurrenyConvertMarketDataDocument
{
    
    public CurrenyConvertMarketDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENYCONVERTMARKETDATA$0 = 
        new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "currenyConvertMarketData");
    
    
    /**
     * Gets the "currenyConvertMarketData" element
     */
    public au.edu.unsw.sltf.services.CurrenyConvertMarketDataDocument.CurrenyConvertMarketData getCurrenyConvertMarketData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.CurrenyConvertMarketDataDocument.CurrenyConvertMarketData target = null;
            target = (au.edu.unsw.sltf.services.CurrenyConvertMarketDataDocument.CurrenyConvertMarketData)get_store().find_element_user(CURRENYCONVERTMARKETDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "currenyConvertMarketData" element
     */
    public void setCurrenyConvertMarketData(au.edu.unsw.sltf.services.CurrenyConvertMarketDataDocument.CurrenyConvertMarketData currenyConvertMarketData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.CurrenyConvertMarketDataDocument.CurrenyConvertMarketData target = null;
            target = (au.edu.unsw.sltf.services.CurrenyConvertMarketDataDocument.CurrenyConvertMarketData)get_store().find_element_user(CURRENYCONVERTMARKETDATA$0, 0);
            if (target == null)
            {
                target = (au.edu.unsw.sltf.services.CurrenyConvertMarketDataDocument.CurrenyConvertMarketData)get_store().add_element_user(CURRENYCONVERTMARKETDATA$0);
            }
            target.set(currenyConvertMarketData);
        }
    }
    
    /**
     * Appends and returns a new empty "currenyConvertMarketData" element
     */
    public au.edu.unsw.sltf.services.CurrenyConvertMarketDataDocument.CurrenyConvertMarketData addNewCurrenyConvertMarketData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.CurrenyConvertMarketDataDocument.CurrenyConvertMarketData target = null;
            target = (au.edu.unsw.sltf.services.CurrenyConvertMarketDataDocument.CurrenyConvertMarketData)get_store().add_element_user(CURRENYCONVERTMARKETDATA$0);
            return target;
        }
    }
    /**
     * An XML currenyConvertMarketData(@http://sltf.unsw.edu.au/services).
     *
     * This is a complex type.
     */
    public static class CurrenyConvertMarketDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.CurrenyConvertMarketDataDocument.CurrenyConvertMarketData
    {
        
        public CurrenyConvertMarketDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EVENTSETID$0 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "eventSetId");
        private static final javax.xml.namespace.QName TARGETCURRENCY$2 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "targetCurrency");
        
        
        /**
         * Gets the "eventSetId" element
         */
        public java.lang.String getEventSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSETID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "eventSetId" element
         */
        public org.apache.xmlbeans.XmlString xgetEventSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTSETID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "eventSetId" element
         */
        public void setEventSetId(java.lang.String eventSetId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSETID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTSETID$0);
                }
                target.setStringValue(eventSetId);
            }
        }
        
        /**
         * Sets (as xml) the "eventSetId" element
         */
        public void xsetEventSetId(org.apache.xmlbeans.XmlString eventSetId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTSETID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTSETID$0);
                }
                target.set(eventSetId);
            }
        }
        
        /**
         * Gets the "targetCurrency" element
         */
        public java.lang.String getTargetCurrency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETCURRENCY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "targetCurrency" element
         */
        public org.apache.xmlbeans.XmlString xgetTargetCurrency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETCURRENCY$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "targetCurrency" element
         */
        public void setTargetCurrency(java.lang.String targetCurrency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETCURRENCY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETCURRENCY$2);
                }
                target.setStringValue(targetCurrency);
            }
        }
        
        /**
         * Sets (as xml) the "targetCurrency" element
         */
        public void xsetTargetCurrency(org.apache.xmlbeans.XmlString targetCurrency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETCURRENCY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETCURRENCY$2);
                }
                target.set(targetCurrency);
            }
        }
    }
}
