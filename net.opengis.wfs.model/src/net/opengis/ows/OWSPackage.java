/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package net.opengis.ows;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This XML Schema Document encodes the parts of ISO 19115 used by the common "ServiceIdentification" and "ServiceProvider" sections of the GetCapabilities operation response, known as the service metadata XML document. The parts encoded here are the MD_Keywords, CI_ResponsibleParty, and related classes. This XML Schema largely follows the current draft for ISO 19139, with the addition of documentation text extracted and edited from Annex B of ISO 19115. The UML package prefixes were omitted from XML names, and the XML element names were all capitalized, for consistency with other OWS Schemas. Also, the optional smXML:id attributes were omitted, as not being useful in a service metadata document.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema Document includes and imports, directly and indirectly, all the XML Schemas defined by the OWS Common Implemetation Specification.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema Document defines the GetCapabilities operation request and response XML elements and types, which are common to all OWSs. This XML Schema shall be edited by each OWS, for example, to specify a specific value for the "service" attribute.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema Document encodes the Exception Report response to all OWS operations.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This schema document provides attribute declarations and
 * attribute group, complex type and simple type definitions which can be used in
 * the construction of user schemas to define the structure of particular linking
 * constructs, e.g.
 * 
 * <xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
 *            xmlns:xl="http://www.w3.org/1999/xlink">
 * 
 *  <xs:import namespace="http://www.w3.org/1999/xlink"
 *             location="http://www.w3.org/1999/xlink.xsd">
 * 
 *  <xs:element name="mySimple">
 *   <xs:complexType>
 *    ...
 *    <xs:attributeGroup ref="xl:simpleAttrs"/>
 *    ...
 *   </xs:complexType>
 *  </xs:element>
 *  ...
 * </xs:schema>
 * 
 *      
 *   <div xmlns="http://www.w3.org/1999/xhtml">
 *         
 *     <h1>About the XML namespace</h1>
 *         
 *     <div class="bodytext">
 *            
 *       <p>
 *       This schema document describes the XML namespace, in a form
 *       suitable for import by other schema documents.
 *      </p>
 *            
 *       <p>
 *               See 
 *         <a href="http://www.w3.org/XML/1998/namespace.html">
 *       http://www.w3.org/XML/1998/namespace.html</a>
 *          and
 *       
 *         <a href="http://www.w3.org/TR/REC-xml">
 *       http://www.w3.org/TR/REC-xml</a>
 *          for information 
 *       about this namespace.
 *      
 *       </p>
 *            
 *       <p>
 *       Note that local names in this namespace are intended to be
 *       defined only by the World Wide Web Consortium or its subgroups.
 *       The names currently defined in this namespace are listed below.
 *       They should not be used with conflicting semantics by any Working
 *       Group, specification, or document instance.
 *      </p>
 *            
 *       <p>
 *            
 *       See further below in this document for more information about 
 *         <a href="#usage">how to refer to this schema document from your own
 *       XSD schema documents</a>
 *          and about 
 *         <a href="#nsversioning">the
 *       namespace-versioning policy governing this schema document</a>
 *         .
 *      
 *       </p>
 *           
 *     </div>
 *        
 *   </div>
 *     
 * 
 * 
 *      
 *   <div xmlns="http://www.w3.org/1999/xhtml">
 *        
 *     
 *     <h3>Father (in any context at all)</h3>
 *      
 * 
 *     
 *     <div class="bodytext">
 *            
 *       <p>
 *       denotes Jon Bosak, the chair of 
 *       the original XML Working Group.  This name is reserved by 
 *       the following decision of the W3C XML Plenary and 
 *       XML Coordination groups:
 *      </p>
 *            
 *       <blockquote>
 *                
 *         <p>
 * 	In appreciation for his vision, leadership and
 * 	dedication the W3C XML Plenary on this 10th day of
 * 	February, 2000, reserves for Jon Bosak in perpetuity
 * 	the XML name "xml:Father".
 *        </p>
 *              
 *       </blockquote>
 *           
 *     </div>
 *        
 *   </div>
 *     
 * 
 * 
 *      
 *   <div id="usage" xml:id="usage" xmlns="http://www.w3.org/1999/xhtml">
 *         
 *     <h2>
 *       <a name="usage">About this schema document</a>
 *     </h2>
 *         
 *     <div class="bodytext">
 *            
 *       <p>
 *               This schema defines attributes and an attribute group suitable
 *       for use by schemas wishing to allow 
 *         <code>xml:base</code>
 *         ,
 *       
 *         <code>xml:lang</code>
 *         , 
 *         <code>xml:space</code>
 *          or
 *       
 *         <code>xml:id</code>
 *          attributes on elements they define.
 *      
 *       </p>
 *            
 *       <p>
 *       To enable this, such a schema must import this schema for
 *       the XML namespace, e.g. as follows:
 *      </p>
 *            
 *       <pre>
 *           &lt;schema . . .&gt;
 *            . . .
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 *      </pre>
 *            
 *       <p>
 *       or
 *      </p>
 *            
 *       <pre>
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2009/01/xml.xsd"/&gt;
 *      </pre>
 *            
 *       <p>
 *       Subsequently, qualified reference to any of the attributes or the
 *       group defined below will have the desired effect, e.g.
 *      </p>
 *            
 *       <pre>
 *           &lt;type . . .&gt;
 *            . . .
 *            &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *      </pre>
 *            
 *       <p>
 *       will define a type which will schema-validate an instance element
 *       with any of those attributes.
 *      </p>
 *           
 *     </div>
 *        
 *   </div>
 *     
 * 
 * 
 *      
 *   <div id="nsversioning" xml:id="nsversioning" xmlns="http://www.w3.org/1999/xhtml">
 *         
 *     <h2>
 *       <a name="nsversioning">Versioning policy for this schema document</a>
 *     </h2>
 *         
 *     <div class="bodytext">
 *            
 *       <p>
 *               In keeping with the XML Schema WG's standard versioning
 *       policy, this schema document will persist at
 *       
 *         <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd</a>
 *         .
 *      
 *       </p>
 *            
 *       <p>
 *               At the date of issue it can also be found at
 *       
 *         <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd</a>
 *         .
 *      
 *       </p>
 *            
 *       <p>
 *               The schema document at that URI may however change in the future,
 *       in order to remain compatible with the latest version of XML
 *       Schema itself, or with the XML namespace itself.  In other words,
 *       if the XML Schema or XML namespaces change, the version of this
 *       document at 
 *         <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd 
 *       </a>
 *          
 *       will change accordingly; the version at 
 *       
 *         <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd 
 *       </a>
 *          
 *       will not change.
 *      
 *       </p>
 *            
 *       <p>
 *       Previous dated (and unchanging) versions of this schema 
 *       document are at:
 *      </p>
 *            
 *       <ul>
 *               
 *         <li>
 *           <a href="http://www.w3.org/2009/01/xml.xsd">
 * 	http://www.w3.org/2009/01/xml.xsd</a>
 *         </li>
 *               
 *         <li>
 *           <a href="http://www.w3.org/2007/08/xml.xsd">
 * 	http://www.w3.org/2007/08/xml.xsd</a>
 *         </li>
 *               
 *         <li>
 *           <a href="http://www.w3.org/2004/10/xml.xsd">
 * 	http://www.w3.org/2004/10/xml.xsd</a>
 *         </li>
 *               
 *         <li>
 *           <a href="http://www.w3.org/2001/03/xml.xsd">
 * 	http://www.w3.org/2001/03/xml.xsd</a>
 *         </li>
 *              
 *       </ul>
 *           
 *     </div>
 *        
 *   </div>
 *     
 * 
 * <!-- end-model-doc -->
 * @see net.opengis.ows.OWSFactory
 * @model kind="package"
 *        annotation="http://www.w3.org/XML/1998/namespace lang='en'"
 * @generated
 */
@ProviderType
@EPackage(uri = OWSPackage.eNS_URI, genModel = "/model/wfs.genmodel", genModelSourceLocations = {"model/wfs.genmodel","net.opengis.wfs.model/model/wfs.genmodel"}, ecore="/model/ows.ecore", ecoreSourceLocations="/model/ows.ecore")
public interface OWSPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ows";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/ows";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ows";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OWSPackage eINSTANCE = net.opengis.ows.impl.OWSPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.AcceptFormatsTypeImpl <em>Accept Formats Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.AcceptFormatsTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getAcceptFormatsType()
	 * @generated
	 */
	int ACCEPT_FORMATS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Output Format</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_FORMATS_TYPE__OUTPUT_FORMAT = 0;

	/**
	 * The number of structural features of the '<em>Accept Formats Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_FORMATS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Accept Formats Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_FORMATS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.AcceptVersionsTypeImpl <em>Accept Versions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.AcceptVersionsTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getAcceptVersionsType()
	 * @generated
	 */
	int ACCEPT_VERSIONS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_VERSIONS_TYPE__VERSION = 0;

	/**
	 * The number of structural features of the '<em>Accept Versions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_VERSIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Accept Versions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_VERSIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.AddressTypeImpl <em>Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.AddressTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getAddressType()
	 * @generated
	 */
	int ADDRESS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Delivery Point</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__DELIVERY_POINT = 0;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__CITY = 1;

	/**
	 * The feature id for the '<em><b>Administrative Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__ADMINISTRATIVE_AREA = 2;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__POSTAL_CODE = 3;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__COUNTRY = 4;

	/**
	 * The feature id for the '<em><b>Electronic Mail Address</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__ELECTRONIC_MAIL_ADDRESS = 5;

	/**
	 * The number of structural features of the '<em>Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.BoundingBoxTypeImpl <em>Bounding Box Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.BoundingBoxTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getBoundingBoxType()
	 * @generated
	 */
	int BOUNDING_BOX_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Lower Corner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX_TYPE__LOWER_CORNER = 0;

	/**
	 * The feature id for the '<em><b>Upper Corner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX_TYPE__UPPER_CORNER = 1;

	/**
	 * The feature id for the '<em><b>Crs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX_TYPE__CRS = 2;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX_TYPE__DIMENSIONS = 3;

	/**
	 * The number of structural features of the '<em>Bounding Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bounding Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.CapabilitiesBaseTypeImpl <em>Capabilities Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.CapabilitiesBaseTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getCapabilitiesBaseType()
	 * @generated
	 */
	int CAPABILITIES_BASE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Service Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_BASE_TYPE__SERVICE_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Service Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_BASE_TYPE__SERVICE_PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Operations Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_BASE_TYPE__OPERATIONS_METADATA = 2;

	/**
	 * The feature id for the '<em><b>Update Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_BASE_TYPE__UPDATE_SEQUENCE = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_BASE_TYPE__VERSION = 4;

	/**
	 * The number of structural features of the '<em>Capabilities Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_BASE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Capabilities Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_BASE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.CodeTypeImpl <em>Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.CodeTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getCodeType()
	 * @generated
	 */
	int CODE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Code Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__CODE_SPACE = 1;

	/**
	 * The number of structural features of the '<em>Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.ContactTypeImpl <em>Contact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.ContactTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getContactType()
	 * @generated
	 */
	int CONTACT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE__PHONE = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Online Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE__ONLINE_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Hours Of Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE__HOURS_OF_SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Contact Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE__CONTACT_INSTRUCTIONS = 4;

	/**
	 * The number of structural features of the '<em>Contact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Contact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.DCPTypeImpl <em>DCP Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.DCPTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getDCPType()
	 * @generated
	 */
	int DCP_TYPE = 7;

	/**
	 * The feature id for the '<em><b>HTTP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCP_TYPE__HTTP = 0;

	/**
	 * The number of structural features of the '<em>DCP Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCP_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DCP Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.DescriptionTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getDescriptionType()
	 * @generated
	 */
	int DESCRIPTION_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__ABSTRACT = 1;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__KEYWORDS = 2;

	/**
	 * The number of structural features of the '<em>Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.DocumentRootImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 9;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT = 3;

	/**
	 * The feature id for the '<em><b>Abstract Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_META_DATA = 4;

	/**
	 * The feature id for the '<em><b>Access Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACCESS_CONSTRAINTS = 5;

	/**
	 * The feature id for the '<em><b>Available CRS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AVAILABLE_CRS = 6;

	/**
	 * The feature id for the '<em><b>Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOUNDING_BOX = 7;

	/**
	 * The feature id for the '<em><b>Contact Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTACT_INFO = 8;

	/**
	 * The feature id for the '<em><b>DCP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DCP = 9;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXCEPTION = 10;

	/**
	 * The feature id for the '<em><b>Exception Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXCEPTION_REPORT = 11;

	/**
	 * The feature id for the '<em><b>Extended Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENDED_CAPABILITIES = 12;

	/**
	 * The feature id for the '<em><b>Fees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FEES = 13;

	/**
	 * The feature id for the '<em><b>Get Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CAPABILITIES = 14;

	/**
	 * The feature id for the '<em><b>HTTP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HTTP = 15;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IDENTIFIER = 16;

	/**
	 * The feature id for the '<em><b>Individual Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INDIVIDUAL_NAME = 17;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEYWORDS = 18;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LANGUAGE = 19;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METADATA = 20;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OPERATION = 21;

	/**
	 * The feature id for the '<em><b>Operations Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OPERATIONS_METADATA = 22;

	/**
	 * The feature id for the '<em><b>Organisation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANISATION_NAME = 23;

	/**
	 * The feature id for the '<em><b>Output Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OUTPUT_FORMAT = 24;

	/**
	 * The feature id for the '<em><b>Point Of Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POINT_OF_CONTACT = 25;

	/**
	 * The feature id for the '<em><b>Position Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POSITION_NAME = 26;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROLE = 27;

	/**
	 * The feature id for the '<em><b>Service Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_IDENTIFICATION = 28;

	/**
	 * The feature id for the '<em><b>Service Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_PROVIDER = 29;

	/**
	 * The feature id for the '<em><b>Supported CRS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUPPORTED_CRS = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE = 31;

	/**
	 * The feature id for the '<em><b>WGS84 Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WGS84_BOUNDING_BOX = 32;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 33;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.DomainTypeImpl <em>Domain Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.DomainTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getDomainType()
	 * @generated
	 */
	int DOMAIN_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE__METADATA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Domain Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Domain Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.ExceptionReportTypeImpl <em>Exception Report Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.ExceptionReportTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getExceptionReportType()
	 * @generated
	 */
	int EXCEPTION_REPORT_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_REPORT_TYPE__EXCEPTION = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_REPORT_TYPE__LANGUAGE = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_REPORT_TYPE__VERSION = 2;

	/**
	 * The number of structural features of the '<em>Exception Report Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_REPORT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Exception Report Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_REPORT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.ExceptionTypeImpl <em>Exception Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.ExceptionTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getExceptionType()
	 * @generated
	 */
	int EXCEPTION_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Exception Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__EXCEPTION_TEXT = 0;

	/**
	 * The feature id for the '<em><b>Exception Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__EXCEPTION_CODE = 1;

	/**
	 * The feature id for the '<em><b>Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__LOCATOR = 2;

	/**
	 * The number of structural features of the '<em>Exception Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Exception Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.GetCapabilitiesTypeImpl <em>Get Capabilities Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.GetCapabilitiesTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getGetCapabilitiesType()
	 * @generated
	 */
	int GET_CAPABILITIES_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Accept Versions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE__ACCEPT_VERSIONS = 0;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE__SECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Accept Formats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE__ACCEPT_FORMATS = 2;

	/**
	 * The feature id for the '<em><b>Update Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE__UPDATE_SEQUENCE = 3;

	/**
	 * The number of structural features of the '<em>Get Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Get Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.HTTPTypeImpl <em>HTTP Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.HTTPTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getHTTPType()
	 * @generated
	 */
	int HTTP_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Get</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_TYPE__GET = 1;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_TYPE__POST = 2;

	/**
	 * The number of structural features of the '<em>HTTP Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>HTTP Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.IdentificationTypeImpl <em>Identification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.IdentificationTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getIdentificationType()
	 * @generated
	 */
	int IDENTIFICATION_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TYPE__TITLE = DESCRIPTION_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TYPE__ABSTRACT = DESCRIPTION_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TYPE__KEYWORDS = DESCRIPTION_TYPE__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TYPE__IDENTIFIER = DESCRIPTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bounding Box Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TYPE__BOUNDING_BOX_GROUP = DESCRIPTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bounding Box</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TYPE__BOUNDING_BOX = DESCRIPTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Format</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TYPE__OUTPUT_FORMAT = DESCRIPTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Available CRS Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TYPE__AVAILABLE_CRS_GROUP = DESCRIPTION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Available CRS</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TYPE__AVAILABLE_CRS = DESCRIPTION_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TYPE__METADATA = DESCRIPTION_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Identification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TYPE_FEATURE_COUNT = DESCRIPTION_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Identification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_TYPE_OPERATION_COUNT = DESCRIPTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.KeywordsTypeImpl <em>Keywords Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.KeywordsTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getKeywordsType()
	 * @generated
	 */
	int KEYWORDS_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORDS_TYPE__KEYWORD = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORDS_TYPE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Keywords Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORDS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Keywords Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORDS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.MetadataTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getMetadataType()
	 * @generated
	 */
	int METADATA_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Abstract Meta Data Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__ABSTRACT_META_DATA_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__ABSTRACT_META_DATA = 1;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__ABOUT = 2;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__ACTUATE = 3;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__ARCROLE = 4;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__HREF = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__ROLE = 6;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__SHOW = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__TITLE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__TYPE = 9;

	/**
	 * The number of structural features of the '<em>Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.OnlineResourceTypeImpl <em>Online Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.OnlineResourceTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getOnlineResourceType()
	 * @generated
	 */
	int ONLINE_RESOURCE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE_TYPE__ACTUATE = 0;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE_TYPE__ARCROLE = 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE_TYPE__HREF = 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE_TYPE__ROLE = 3;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE_TYPE__SHOW = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE_TYPE__TITLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE_TYPE__TYPE = 6;

	/**
	 * The number of structural features of the '<em>Online Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Online Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.OperationsMetadataTypeImpl <em>Operations Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.OperationsMetadataTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getOperationsMetadataType()
	 * @generated
	 */
	int OPERATIONS_METADATA_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_METADATA_TYPE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_METADATA_TYPE__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_METADATA_TYPE__CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Extended Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_METADATA_TYPE__EXTENDED_CAPABILITIES = 3;

	/**
	 * The number of structural features of the '<em>Operations Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_METADATA_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Operations Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.OperationTypeImpl <em>Operation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.OperationTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getOperationType()
	 * @generated
	 */
	int OPERATION_TYPE = 20;

	/**
	 * The feature id for the '<em><b>DCP</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE__DCP = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE__CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE__METADATA = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.RequestMethodTypeImpl <em>Request Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.RequestMethodTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getRequestMethodType()
	 * @generated
	 */
	int REQUEST_METHOD_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_METHOD_TYPE__ACTUATE = ONLINE_RESOURCE_TYPE__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_METHOD_TYPE__ARCROLE = ONLINE_RESOURCE_TYPE__ARCROLE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_METHOD_TYPE__HREF = ONLINE_RESOURCE_TYPE__HREF;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_METHOD_TYPE__ROLE = ONLINE_RESOURCE_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_METHOD_TYPE__SHOW = ONLINE_RESOURCE_TYPE__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_METHOD_TYPE__TITLE = ONLINE_RESOURCE_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_METHOD_TYPE__TYPE = ONLINE_RESOURCE_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_METHOD_TYPE__CONSTRAINT = ONLINE_RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Request Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_METHOD_TYPE_FEATURE_COUNT = ONLINE_RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Request Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_METHOD_TYPE_OPERATION_COUNT = ONLINE_RESOURCE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.ResponsiblePartySubsetTypeImpl <em>Responsible Party Subset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.ResponsiblePartySubsetTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getResponsiblePartySubsetType()
	 * @generated
	 */
	int RESPONSIBLE_PARTY_SUBSET_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Individual Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY_SUBSET_TYPE__INDIVIDUAL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Position Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY_SUBSET_TYPE__POSITION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Contact Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY_SUBSET_TYPE__CONTACT_INFO = 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY_SUBSET_TYPE__ROLE = 3;

	/**
	 * The number of structural features of the '<em>Responsible Party Subset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY_SUBSET_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Responsible Party Subset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY_SUBSET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.ResponsiblePartyTypeImpl <em>Responsible Party Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.ResponsiblePartyTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getResponsiblePartyType()
	 * @generated
	 */
	int RESPONSIBLE_PARTY_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Individual Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY_TYPE__INDIVIDUAL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Organisation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY_TYPE__ORGANISATION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Position Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY_TYPE__POSITION_NAME = 2;

	/**
	 * The feature id for the '<em><b>Contact Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY_TYPE__CONTACT_INFO = 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY_TYPE__ROLE = 4;

	/**
	 * The number of structural features of the '<em>Responsible Party Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Responsible Party Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.SectionsTypeImpl <em>Sections Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.SectionsTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getSectionsType()
	 * @generated
	 */
	int SECTIONS_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Section</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTIONS_TYPE__SECTION = 0;

	/**
	 * The number of structural features of the '<em>Sections Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sections Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.ServiceIdentificationTypeImpl <em>Service Identification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.ServiceIdentificationTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getServiceIdentificationType()
	 * @generated
	 */
	int SERVICE_IDENTIFICATION_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_TYPE__TITLE = DESCRIPTION_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_TYPE__ABSTRACT = DESCRIPTION_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_TYPE__KEYWORDS = DESCRIPTION_TYPE__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_TYPE__SERVICE_TYPE = DESCRIPTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Type Version</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_TYPE__SERVICE_TYPE_VERSION = DESCRIPTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_TYPE__FEES = DESCRIPTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Access Constraints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_TYPE__ACCESS_CONSTRAINTS = DESCRIPTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Service Identification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_TYPE_FEATURE_COUNT = DESCRIPTION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Service Identification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_TYPE_OPERATION_COUNT = DESCRIPTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.ServiceProviderTypeImpl <em>Service Provider Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.ServiceProviderTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getServiceProviderType()
	 * @generated
	 */
	int SERVICE_PROVIDER_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_TYPE__PROVIDER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Provider Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_TYPE__PROVIDER_SITE = 1;

	/**
	 * The feature id for the '<em><b>Service Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_TYPE__SERVICE_CONTACT = 2;

	/**
	 * The number of structural features of the '<em>Service Provider Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Provider Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.TelephoneTypeImpl <em>Telephone Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.TelephoneTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getTelephoneType()
	 * @generated
	 */
	int TELEPHONE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Voice</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_TYPE__VOICE = 0;

	/**
	 * The feature id for the '<em><b>Facsimile</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_TYPE__FACSIMILE = 1;

	/**
	 * The number of structural features of the '<em>Telephone Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Telephone Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ows.impl.WGS84BoundingBoxTypeImpl <em>WGS84 Bounding Box Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ows.impl.WGS84BoundingBoxTypeImpl
	 * @see net.opengis.ows.impl.OWSPackageImpl#getWGS84BoundingBoxType()
	 * @generated
	 */
	int WGS84_BOUNDING_BOX_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Lower Corner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGS84_BOUNDING_BOX_TYPE__LOWER_CORNER = BOUNDING_BOX_TYPE__LOWER_CORNER;

	/**
	 * The feature id for the '<em><b>Upper Corner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGS84_BOUNDING_BOX_TYPE__UPPER_CORNER = BOUNDING_BOX_TYPE__UPPER_CORNER;

	/**
	 * The feature id for the '<em><b>Crs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGS84_BOUNDING_BOX_TYPE__CRS = BOUNDING_BOX_TYPE__CRS;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGS84_BOUNDING_BOX_TYPE__DIMENSIONS = BOUNDING_BOX_TYPE__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>WGS84 Bounding Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGS84_BOUNDING_BOX_TYPE_FEATURE_COUNT = BOUNDING_BOX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WGS84 Bounding Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGS84_BOUNDING_BOX_TYPE_OPERATION_COUNT = BOUNDING_BOX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Mime Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.ows.impl.OWSPackageImpl#getMimeType()
	 * @generated
	 */
	int MIME_TYPE = 29;

	/**
	 * The meta object id for the '<em>Position Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see net.opengis.ows.impl.OWSPackageImpl#getPositionType()
	 * @generated
	 */
	int POSITION_TYPE = 30;

	/**
	 * The meta object id for the '<em>Position Type2 D</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see net.opengis.ows.impl.OWSPackageImpl#getPositionType2D()
	 * @generated
	 */
	int POSITION_TYPE2_D = 31;

	/**
	 * The meta object id for the '<em>Service Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.ows.impl.OWSPackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 32;

	/**
	 * The meta object id for the '<em>Update Sequence Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.ows.impl.OWSPackageImpl#getUpdateSequenceType()
	 * @generated
	 */
	int UPDATE_SEQUENCE_TYPE = 33;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.ows.impl.OWSPackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 34;


	/**
	 * Returns the meta object for class '{@link net.opengis.ows.AcceptFormatsType <em>Accept Formats Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Formats Type</em>'.
	 * @see net.opengis.ows.AcceptFormatsType
	 * @generated
	 */
	EClass getAcceptFormatsType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ows.AcceptFormatsType#getOutputFormat <em>Output Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Output Format</em>'.
	 * @see net.opengis.ows.AcceptFormatsType#getOutputFormat()
	 * @see #getAcceptFormatsType()
	 * @generated
	 */
	EAttribute getAcceptFormatsType_OutputFormat();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.AcceptVersionsType <em>Accept Versions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Versions Type</em>'.
	 * @see net.opengis.ows.AcceptVersionsType
	 * @generated
	 */
	EClass getAcceptVersionsType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ows.AcceptVersionsType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Version</em>'.
	 * @see net.opengis.ows.AcceptVersionsType#getVersion()
	 * @see #getAcceptVersionsType()
	 * @generated
	 */
	EAttribute getAcceptVersionsType_Version();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Type</em>'.
	 * @see net.opengis.ows.AddressType
	 * @generated
	 */
	EClass getAddressType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ows.AddressType#getDeliveryPoint <em>Delivery Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Delivery Point</em>'.
	 * @see net.opengis.ows.AddressType#getDeliveryPoint()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_DeliveryPoint();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.AddressType#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see net.opengis.ows.AddressType#getCity()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_City();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.AddressType#getAdministrativeArea <em>Administrative Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Administrative Area</em>'.
	 * @see net.opengis.ows.AddressType#getAdministrativeArea()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_AdministrativeArea();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.AddressType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see net.opengis.ows.AddressType#getPostalCode()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.AddressType#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see net.opengis.ows.AddressType#getCountry()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Country();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ows.AddressType#getElectronicMailAddress <em>Electronic Mail Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Electronic Mail Address</em>'.
	 * @see net.opengis.ows.AddressType#getElectronicMailAddress()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_ElectronicMailAddress();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.BoundingBoxType <em>Bounding Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounding Box Type</em>'.
	 * @see net.opengis.ows.BoundingBoxType
	 * @generated
	 */
	EClass getBoundingBoxType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.BoundingBoxType#getLowerCorner <em>Lower Corner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Corner</em>'.
	 * @see net.opengis.ows.BoundingBoxType#getLowerCorner()
	 * @see #getBoundingBoxType()
	 * @generated
	 */
	EAttribute getBoundingBoxType_LowerCorner();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.BoundingBoxType#getUpperCorner <em>Upper Corner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Corner</em>'.
	 * @see net.opengis.ows.BoundingBoxType#getUpperCorner()
	 * @see #getBoundingBoxType()
	 * @generated
	 */
	EAttribute getBoundingBoxType_UpperCorner();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.BoundingBoxType#getCrs <em>Crs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crs</em>'.
	 * @see net.opengis.ows.BoundingBoxType#getCrs()
	 * @see #getBoundingBoxType()
	 * @generated
	 */
	EAttribute getBoundingBoxType_Crs();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.BoundingBoxType#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimensions</em>'.
	 * @see net.opengis.ows.BoundingBoxType#getDimensions()
	 * @see #getBoundingBoxType()
	 * @generated
	 */
	EAttribute getBoundingBoxType_Dimensions();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.CapabilitiesBaseType <em>Capabilities Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capabilities Base Type</em>'.
	 * @see net.opengis.ows.CapabilitiesBaseType
	 * @generated
	 */
	EClass getCapabilitiesBaseType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.CapabilitiesBaseType#getServiceIdentification <em>Service Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Identification</em>'.
	 * @see net.opengis.ows.CapabilitiesBaseType#getServiceIdentification()
	 * @see #getCapabilitiesBaseType()
	 * @generated
	 */
	EReference getCapabilitiesBaseType_ServiceIdentification();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.CapabilitiesBaseType#getServiceProvider <em>Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Provider</em>'.
	 * @see net.opengis.ows.CapabilitiesBaseType#getServiceProvider()
	 * @see #getCapabilitiesBaseType()
	 * @generated
	 */
	EReference getCapabilitiesBaseType_ServiceProvider();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.CapabilitiesBaseType#getOperationsMetadata <em>Operations Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operations Metadata</em>'.
	 * @see net.opengis.ows.CapabilitiesBaseType#getOperationsMetadata()
	 * @see #getCapabilitiesBaseType()
	 * @generated
	 */
	EReference getCapabilitiesBaseType_OperationsMetadata();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.CapabilitiesBaseType#getUpdateSequence <em>Update Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Sequence</em>'.
	 * @see net.opengis.ows.CapabilitiesBaseType#getUpdateSequence()
	 * @see #getCapabilitiesBaseType()
	 * @generated
	 */
	EAttribute getCapabilitiesBaseType_UpdateSequence();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.CapabilitiesBaseType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.opengis.ows.CapabilitiesBaseType#getVersion()
	 * @see #getCapabilitiesBaseType()
	 * @generated
	 */
	EAttribute getCapabilitiesBaseType_Version();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.CodeType <em>Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Type</em>'.
	 * @see net.opengis.ows.CodeType
	 * @generated
	 */
	EClass getCodeType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.CodeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.ows.CodeType#getValue()
	 * @see #getCodeType()
	 * @generated
	 */
	EAttribute getCodeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.CodeType#getCodeSpace <em>Code Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Space</em>'.
	 * @see net.opengis.ows.CodeType#getCodeSpace()
	 * @see #getCodeType()
	 * @generated
	 */
	EAttribute getCodeType_CodeSpace();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.ContactType <em>Contact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Type</em>'.
	 * @see net.opengis.ows.ContactType
	 * @generated
	 */
	EClass getContactType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.ContactType#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phone</em>'.
	 * @see net.opengis.ows.ContactType#getPhone()
	 * @see #getContactType()
	 * @generated
	 */
	EReference getContactType_Phone();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.ContactType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see net.opengis.ows.ContactType#getAddress()
	 * @see #getContactType()
	 * @generated
	 */
	EReference getContactType_Address();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.ContactType#getOnlineResource <em>Online Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Online Resource</em>'.
	 * @see net.opengis.ows.ContactType#getOnlineResource()
	 * @see #getContactType()
	 * @generated
	 */
	EReference getContactType_OnlineResource();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.ContactType#getHoursOfService <em>Hours Of Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours Of Service</em>'.
	 * @see net.opengis.ows.ContactType#getHoursOfService()
	 * @see #getContactType()
	 * @generated
	 */
	EAttribute getContactType_HoursOfService();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.ContactType#getContactInstructions <em>Contact Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Instructions</em>'.
	 * @see net.opengis.ows.ContactType#getContactInstructions()
	 * @see #getContactType()
	 * @generated
	 */
	EAttribute getContactType_ContactInstructions();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.DCPType <em>DCP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCP Type</em>'.
	 * @see net.opengis.ows.DCPType
	 * @generated
	 */
	EClass getDCPType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.DCPType#getHTTP <em>HTTP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HTTP</em>'.
	 * @see net.opengis.ows.DCPType#getHTTP()
	 * @see #getDCPType()
	 * @generated
	 */
	EReference getDCPType_HTTP();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Type</em>'.
	 * @see net.opengis.ows.DescriptionType
	 * @generated
	 */
	EClass getDescriptionType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.DescriptionType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.ows.DescriptionType#getTitle()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.DescriptionType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see net.opengis.ows.DescriptionType#getAbstract()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ows.DescriptionType#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keywords</em>'.
	 * @see net.opengis.ows.DescriptionType#getKeywords()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_Keywords();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.opengis.ows.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ows.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.ows.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.opengis.ows.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.opengis.ows.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.opengis.ows.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.opengis.ows.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.DocumentRoot#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see net.opengis.ows.DocumentRoot#getAbstract()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Abstract();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.DocumentRoot#getAbstractMetaData <em>Abstract Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Meta Data</em>'.
	 * @see net.opengis.ows.DocumentRoot#getAbstractMetaData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractMetaData();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.DocumentRoot#getAccessConstraints <em>Access Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Constraints</em>'.
	 * @see net.opengis.ows.DocumentRoot#getAccessConstraints()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AccessConstraints();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.DocumentRoot#getAvailableCRS <em>Available CRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available CRS</em>'.
	 * @see net.opengis.ows.DocumentRoot#getAvailableCRS()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AvailableCRS();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.DocumentRoot#getBoundingBox <em>Bounding Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounding Box</em>'.
	 * @see net.opengis.ows.DocumentRoot#getBoundingBox()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BoundingBox();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.DocumentRoot#getContactInfo <em>Contact Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contact Info</em>'.
	 * @see net.opengis.ows.DocumentRoot#getContactInfo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ContactInfo();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.DocumentRoot#getDCP <em>DCP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DCP</em>'.
	 * @see net.opengis.ows.DocumentRoot#getDCP()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DCP();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.DocumentRoot#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception</em>'.
	 * @see net.opengis.ows.DocumentRoot#getException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Exception();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.DocumentRoot#getExceptionReport <em>Exception Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception Report</em>'.
	 * @see net.opengis.ows.DocumentRoot#getExceptionReport()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExceptionReport();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.DocumentRoot#getExtendedCapabilities <em>Extended Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Capabilities</em>'.
	 * @see net.opengis.ows.DocumentRoot#getExtendedCapabilities()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExtendedCapabilities();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.DocumentRoot#getFees <em>Fees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fees</em>'.
	 * @see net.opengis.ows.DocumentRoot#getFees()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Fees();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.DocumentRoot#getGetCapabilities <em>Get Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Capabilities</em>'.
	 * @see net.opengis.ows.DocumentRoot#getGetCapabilities()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetCapabilities();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.DocumentRoot#getHTTP <em>HTTP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HTTP</em>'.
	 * @see net.opengis.ows.DocumentRoot#getHTTP()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HTTP();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.DocumentRoot#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see net.opengis.ows.DocumentRoot#getIdentifier()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.DocumentRoot#getIndividualName <em>Individual Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Individual Name</em>'.
	 * @see net.opengis.ows.DocumentRoot#getIndividualName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IndividualName();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.DocumentRoot#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keywords</em>'.
	 * @see net.opengis.ows.DocumentRoot#getKeywords()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Keywords();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.DocumentRoot#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see net.opengis.ows.DocumentRoot#getLanguage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Language();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.DocumentRoot#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see net.opengis.ows.DocumentRoot#getMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.DocumentRoot#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see net.opengis.ows.DocumentRoot#getOperation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.DocumentRoot#getOperationsMetadata <em>Operations Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operations Metadata</em>'.
	 * @see net.opengis.ows.DocumentRoot#getOperationsMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OperationsMetadata();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.DocumentRoot#getOrganisationName <em>Organisation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organisation Name</em>'.
	 * @see net.opengis.ows.DocumentRoot#getOrganisationName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OrganisationName();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.DocumentRoot#getOutputFormat <em>Output Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Format</em>'.
	 * @see net.opengis.ows.DocumentRoot#getOutputFormat()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OutputFormat();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.DocumentRoot#getPointOfContact <em>Point Of Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point Of Contact</em>'.
	 * @see net.opengis.ows.DocumentRoot#getPointOfContact()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PointOfContact();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.DocumentRoot#getPositionName <em>Position Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Name</em>'.
	 * @see net.opengis.ows.DocumentRoot#getPositionName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PositionName();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.DocumentRoot#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role</em>'.
	 * @see net.opengis.ows.DocumentRoot#getRole()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Role();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.DocumentRoot#getServiceIdentification <em>Service Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Identification</em>'.
	 * @see net.opengis.ows.DocumentRoot#getServiceIdentification()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceIdentification();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.DocumentRoot#getServiceProvider <em>Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Provider</em>'.
	 * @see net.opengis.ows.DocumentRoot#getServiceProvider()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceProvider();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.DocumentRoot#getSupportedCRS <em>Supported CRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supported CRS</em>'.
	 * @see net.opengis.ows.DocumentRoot#getSupportedCRS()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SupportedCRS();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.ows.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Title();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.DocumentRoot#getWGS84BoundingBox <em>WGS84 Bounding Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WGS84 Bounding Box</em>'.
	 * @see net.opengis.ows.DocumentRoot#getWGS84BoundingBox()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WGS84BoundingBox();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.DomainType <em>Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Type</em>'.
	 * @see net.opengis.ows.DomainType
	 * @generated
	 */
	EClass getDomainType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ows.DomainType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see net.opengis.ows.DomainType#getValue()
	 * @see #getDomainType()
	 * @generated
	 */
	EAttribute getDomainType_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ows.DomainType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see net.opengis.ows.DomainType#getMetadata()
	 * @see #getDomainType()
	 * @generated
	 */
	EReference getDomainType_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.DomainType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.ows.DomainType#getName()
	 * @see #getDomainType()
	 * @generated
	 */
	EAttribute getDomainType_Name();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.ExceptionReportType <em>Exception Report Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Report Type</em>'.
	 * @see net.opengis.ows.ExceptionReportType
	 * @generated
	 */
	EClass getExceptionReportType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ows.ExceptionReportType#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception</em>'.
	 * @see net.opengis.ows.ExceptionReportType#getException()
	 * @see #getExceptionReportType()
	 * @generated
	 */
	EReference getExceptionReportType_Exception();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.ExceptionReportType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see net.opengis.ows.ExceptionReportType#getLanguage()
	 * @see #getExceptionReportType()
	 * @generated
	 */
	EAttribute getExceptionReportType_Language();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.ExceptionReportType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.opengis.ows.ExceptionReportType#getVersion()
	 * @see #getExceptionReportType()
	 * @generated
	 */
	EAttribute getExceptionReportType_Version();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.ExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Type</em>'.
	 * @see net.opengis.ows.ExceptionType
	 * @generated
	 */
	EClass getExceptionType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ows.ExceptionType#getExceptionText <em>Exception Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exception Text</em>'.
	 * @see net.opengis.ows.ExceptionType#getExceptionText()
	 * @see #getExceptionType()
	 * @generated
	 */
	EAttribute getExceptionType_ExceptionText();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.ExceptionType#getExceptionCode <em>Exception Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Code</em>'.
	 * @see net.opengis.ows.ExceptionType#getExceptionCode()
	 * @see #getExceptionType()
	 * @generated
	 */
	EAttribute getExceptionType_ExceptionCode();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.ExceptionType#getLocator <em>Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locator</em>'.
	 * @see net.opengis.ows.ExceptionType#getLocator()
	 * @see #getExceptionType()
	 * @generated
	 */
	EAttribute getExceptionType_Locator();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.GetCapabilitiesType <em>Get Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Capabilities Type</em>'.
	 * @see net.opengis.ows.GetCapabilitiesType
	 * @generated
	 */
	EClass getGetCapabilitiesType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.GetCapabilitiesType#getAcceptVersions <em>Accept Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accept Versions</em>'.
	 * @see net.opengis.ows.GetCapabilitiesType#getAcceptVersions()
	 * @see #getGetCapabilitiesType()
	 * @generated
	 */
	EReference getGetCapabilitiesType_AcceptVersions();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.GetCapabilitiesType#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sections</em>'.
	 * @see net.opengis.ows.GetCapabilitiesType#getSections()
	 * @see #getGetCapabilitiesType()
	 * @generated
	 */
	EReference getGetCapabilitiesType_Sections();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.GetCapabilitiesType#getAcceptFormats <em>Accept Formats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accept Formats</em>'.
	 * @see net.opengis.ows.GetCapabilitiesType#getAcceptFormats()
	 * @see #getGetCapabilitiesType()
	 * @generated
	 */
	EReference getGetCapabilitiesType_AcceptFormats();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.GetCapabilitiesType#getUpdateSequence <em>Update Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Sequence</em>'.
	 * @see net.opengis.ows.GetCapabilitiesType#getUpdateSequence()
	 * @see #getGetCapabilitiesType()
	 * @generated
	 */
	EAttribute getGetCapabilitiesType_UpdateSequence();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.HTTPType <em>HTTP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTP Type</em>'.
	 * @see net.opengis.ows.HTTPType
	 * @generated
	 */
	EClass getHTTPType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ows.HTTPType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.opengis.ows.HTTPType#getGroup()
	 * @see #getHTTPType()
	 * @generated
	 */
	EAttribute getHTTPType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ows.HTTPType#getGet <em>Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Get</em>'.
	 * @see net.opengis.ows.HTTPType#getGet()
	 * @see #getHTTPType()
	 * @generated
	 */
	EReference getHTTPType_Get();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ows.HTTPType#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post</em>'.
	 * @see net.opengis.ows.HTTPType#getPost()
	 * @see #getHTTPType()
	 * @generated
	 */
	EReference getHTTPType_Post();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.IdentificationType <em>Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identification Type</em>'.
	 * @see net.opengis.ows.IdentificationType
	 * @generated
	 */
	EClass getIdentificationType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.IdentificationType#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see net.opengis.ows.IdentificationType#getIdentifier()
	 * @see #getIdentificationType()
	 * @generated
	 */
	EReference getIdentificationType_Identifier();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ows.IdentificationType#getBoundingBoxGroup <em>Bounding Box Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bounding Box Group</em>'.
	 * @see net.opengis.ows.IdentificationType#getBoundingBoxGroup()
	 * @see #getIdentificationType()
	 * @generated
	 */
	EAttribute getIdentificationType_BoundingBoxGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ows.IdentificationType#getBoundingBox <em>Bounding Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bounding Box</em>'.
	 * @see net.opengis.ows.IdentificationType#getBoundingBox()
	 * @see #getIdentificationType()
	 * @generated
	 */
	EReference getIdentificationType_BoundingBox();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ows.IdentificationType#getOutputFormat <em>Output Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Output Format</em>'.
	 * @see net.opengis.ows.IdentificationType#getOutputFormat()
	 * @see #getIdentificationType()
	 * @generated
	 */
	EAttribute getIdentificationType_OutputFormat();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ows.IdentificationType#getAvailableCRSGroup <em>Available CRS Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Available CRS Group</em>'.
	 * @see net.opengis.ows.IdentificationType#getAvailableCRSGroup()
	 * @see #getIdentificationType()
	 * @generated
	 */
	EAttribute getIdentificationType_AvailableCRSGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ows.IdentificationType#getAvailableCRS <em>Available CRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Available CRS</em>'.
	 * @see net.opengis.ows.IdentificationType#getAvailableCRS()
	 * @see #getIdentificationType()
	 * @generated
	 */
	EAttribute getIdentificationType_AvailableCRS();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ows.IdentificationType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see net.opengis.ows.IdentificationType#getMetadata()
	 * @see #getIdentificationType()
	 * @generated
	 */
	EReference getIdentificationType_Metadata();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.KeywordsType <em>Keywords Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keywords Type</em>'.
	 * @see net.opengis.ows.KeywordsType
	 * @generated
	 */
	EClass getKeywordsType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ows.KeywordsType#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keyword</em>'.
	 * @see net.opengis.ows.KeywordsType#getKeyword()
	 * @see #getKeywordsType()
	 * @generated
	 */
	EAttribute getKeywordsType_Keyword();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.KeywordsType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see net.opengis.ows.KeywordsType#getType()
	 * @see #getKeywordsType()
	 * @generated
	 */
	EReference getKeywordsType_Type();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.MetadataType <em>Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata Type</em>'.
	 * @see net.opengis.ows.MetadataType
	 * @generated
	 */
	EClass getMetadataType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ows.MetadataType#getAbstractMetaDataGroup <em>Abstract Meta Data Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Meta Data Group</em>'.
	 * @see net.opengis.ows.MetadataType#getAbstractMetaDataGroup()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_AbstractMetaDataGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.MetadataType#getAbstractMetaData <em>Abstract Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Meta Data</em>'.
	 * @see net.opengis.ows.MetadataType#getAbstractMetaData()
	 * @see #getMetadataType()
	 * @generated
	 */
	EReference getMetadataType_AbstractMetaData();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.MetadataType#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see net.opengis.ows.MetadataType#getAbout()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_About();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.MetadataType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see net.opengis.ows.MetadataType#getActuate()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.MetadataType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see net.opengis.ows.MetadataType#getArcrole()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.MetadataType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see net.opengis.ows.MetadataType#getHref()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_Href();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.MetadataType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see net.opengis.ows.MetadataType#getRole()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_Role();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.MetadataType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see net.opengis.ows.MetadataType#getShow()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_Show();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.MetadataType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.ows.MetadataType#getTitle()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.MetadataType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.opengis.ows.MetadataType#getType()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_Type();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.OnlineResourceType <em>Online Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Online Resource Type</em>'.
	 * @see net.opengis.ows.OnlineResourceType
	 * @generated
	 */
	EClass getOnlineResourceType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.OnlineResourceType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see net.opengis.ows.OnlineResourceType#getActuate()
	 * @see #getOnlineResourceType()
	 * @generated
	 */
	EAttribute getOnlineResourceType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.OnlineResourceType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see net.opengis.ows.OnlineResourceType#getArcrole()
	 * @see #getOnlineResourceType()
	 * @generated
	 */
	EAttribute getOnlineResourceType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.OnlineResourceType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see net.opengis.ows.OnlineResourceType#getHref()
	 * @see #getOnlineResourceType()
	 * @generated
	 */
	EAttribute getOnlineResourceType_Href();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.OnlineResourceType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see net.opengis.ows.OnlineResourceType#getRole()
	 * @see #getOnlineResourceType()
	 * @generated
	 */
	EAttribute getOnlineResourceType_Role();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.OnlineResourceType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see net.opengis.ows.OnlineResourceType#getShow()
	 * @see #getOnlineResourceType()
	 * @generated
	 */
	EAttribute getOnlineResourceType_Show();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.OnlineResourceType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.ows.OnlineResourceType#getTitle()
	 * @see #getOnlineResourceType()
	 * @generated
	 */
	EAttribute getOnlineResourceType_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.OnlineResourceType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.opengis.ows.OnlineResourceType#getType()
	 * @see #getOnlineResourceType()
	 * @generated
	 */
	EAttribute getOnlineResourceType_Type();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.OperationsMetadataType <em>Operations Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operations Metadata Type</em>'.
	 * @see net.opengis.ows.OperationsMetadataType
	 * @generated
	 */
	EClass getOperationsMetadataType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ows.OperationsMetadataType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see net.opengis.ows.OperationsMetadataType#getOperation()
	 * @see #getOperationsMetadataType()
	 * @generated
	 */
	EReference getOperationsMetadataType_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ows.OperationsMetadataType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see net.opengis.ows.OperationsMetadataType#getParameter()
	 * @see #getOperationsMetadataType()
	 * @generated
	 */
	EReference getOperationsMetadataType_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ows.OperationsMetadataType#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see net.opengis.ows.OperationsMetadataType#getConstraint()
	 * @see #getOperationsMetadataType()
	 * @generated
	 */
	EReference getOperationsMetadataType_Constraint();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.OperationsMetadataType#getExtendedCapabilities <em>Extended Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Capabilities</em>'.
	 * @see net.opengis.ows.OperationsMetadataType#getExtendedCapabilities()
	 * @see #getOperationsMetadataType()
	 * @generated
	 */
	EReference getOperationsMetadataType_ExtendedCapabilities();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Type</em>'.
	 * @see net.opengis.ows.OperationType
	 * @generated
	 */
	EClass getOperationType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ows.OperationType#getDCP <em>DCP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DCP</em>'.
	 * @see net.opengis.ows.OperationType#getDCP()
	 * @see #getOperationType()
	 * @generated
	 */
	EReference getOperationType_DCP();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ows.OperationType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see net.opengis.ows.OperationType#getParameter()
	 * @see #getOperationType()
	 * @generated
	 */
	EReference getOperationType_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ows.OperationType#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see net.opengis.ows.OperationType#getConstraint()
	 * @see #getOperationType()
	 * @generated
	 */
	EReference getOperationType_Constraint();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ows.OperationType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see net.opengis.ows.OperationType#getMetadata()
	 * @see #getOperationType()
	 * @generated
	 */
	EReference getOperationType_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.OperationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.ows.OperationType#getName()
	 * @see #getOperationType()
	 * @generated
	 */
	EAttribute getOperationType_Name();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.RequestMethodType <em>Request Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Method Type</em>'.
	 * @see net.opengis.ows.RequestMethodType
	 * @generated
	 */
	EClass getRequestMethodType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ows.RequestMethodType#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see net.opengis.ows.RequestMethodType#getConstraint()
	 * @see #getRequestMethodType()
	 * @generated
	 */
	EReference getRequestMethodType_Constraint();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.ResponsiblePartySubsetType <em>Responsible Party Subset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsible Party Subset Type</em>'.
	 * @see net.opengis.ows.ResponsiblePartySubsetType
	 * @generated
	 */
	EClass getResponsiblePartySubsetType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.ResponsiblePartySubsetType#getIndividualName <em>Individual Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Individual Name</em>'.
	 * @see net.opengis.ows.ResponsiblePartySubsetType#getIndividualName()
	 * @see #getResponsiblePartySubsetType()
	 * @generated
	 */
	EAttribute getResponsiblePartySubsetType_IndividualName();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.ResponsiblePartySubsetType#getPositionName <em>Position Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Name</em>'.
	 * @see net.opengis.ows.ResponsiblePartySubsetType#getPositionName()
	 * @see #getResponsiblePartySubsetType()
	 * @generated
	 */
	EAttribute getResponsiblePartySubsetType_PositionName();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.ResponsiblePartySubsetType#getContactInfo <em>Contact Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contact Info</em>'.
	 * @see net.opengis.ows.ResponsiblePartySubsetType#getContactInfo()
	 * @see #getResponsiblePartySubsetType()
	 * @generated
	 */
	EReference getResponsiblePartySubsetType_ContactInfo();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.ResponsiblePartySubsetType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role</em>'.
	 * @see net.opengis.ows.ResponsiblePartySubsetType#getRole()
	 * @see #getResponsiblePartySubsetType()
	 * @generated
	 */
	EReference getResponsiblePartySubsetType_Role();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.ResponsiblePartyType <em>Responsible Party Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsible Party Type</em>'.
	 * @see net.opengis.ows.ResponsiblePartyType
	 * @generated
	 */
	EClass getResponsiblePartyType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.ResponsiblePartyType#getIndividualName <em>Individual Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Individual Name</em>'.
	 * @see net.opengis.ows.ResponsiblePartyType#getIndividualName()
	 * @see #getResponsiblePartyType()
	 * @generated
	 */
	EAttribute getResponsiblePartyType_IndividualName();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.ResponsiblePartyType#getOrganisationName <em>Organisation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organisation Name</em>'.
	 * @see net.opengis.ows.ResponsiblePartyType#getOrganisationName()
	 * @see #getResponsiblePartyType()
	 * @generated
	 */
	EAttribute getResponsiblePartyType_OrganisationName();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.ResponsiblePartyType#getPositionName <em>Position Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Name</em>'.
	 * @see net.opengis.ows.ResponsiblePartyType#getPositionName()
	 * @see #getResponsiblePartyType()
	 * @generated
	 */
	EAttribute getResponsiblePartyType_PositionName();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.ResponsiblePartyType#getContactInfo <em>Contact Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contact Info</em>'.
	 * @see net.opengis.ows.ResponsiblePartyType#getContactInfo()
	 * @see #getResponsiblePartyType()
	 * @generated
	 */
	EReference getResponsiblePartyType_ContactInfo();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.ResponsiblePartyType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role</em>'.
	 * @see net.opengis.ows.ResponsiblePartyType#getRole()
	 * @see #getResponsiblePartyType()
	 * @generated
	 */
	EReference getResponsiblePartyType_Role();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.SectionsType <em>Sections Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sections Type</em>'.
	 * @see net.opengis.ows.SectionsType
	 * @generated
	 */
	EClass getSectionsType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ows.SectionsType#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Section</em>'.
	 * @see net.opengis.ows.SectionsType#getSection()
	 * @see #getSectionsType()
	 * @generated
	 */
	EAttribute getSectionsType_Section();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.ServiceIdentificationType <em>Service Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Identification Type</em>'.
	 * @see net.opengis.ows.ServiceIdentificationType
	 * @generated
	 */
	EClass getServiceIdentificationType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.ServiceIdentificationType#getServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Type</em>'.
	 * @see net.opengis.ows.ServiceIdentificationType#getServiceType()
	 * @see #getServiceIdentificationType()
	 * @generated
	 */
	EReference getServiceIdentificationType_ServiceType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ows.ServiceIdentificationType#getServiceTypeVersion <em>Service Type Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Service Type Version</em>'.
	 * @see net.opengis.ows.ServiceIdentificationType#getServiceTypeVersion()
	 * @see #getServiceIdentificationType()
	 * @generated
	 */
	EAttribute getServiceIdentificationType_ServiceTypeVersion();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.ServiceIdentificationType#getFees <em>Fees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fees</em>'.
	 * @see net.opengis.ows.ServiceIdentificationType#getFees()
	 * @see #getServiceIdentificationType()
	 * @generated
	 */
	EAttribute getServiceIdentificationType_Fees();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ows.ServiceIdentificationType#getAccessConstraints <em>Access Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Access Constraints</em>'.
	 * @see net.opengis.ows.ServiceIdentificationType#getAccessConstraints()
	 * @see #getServiceIdentificationType()
	 * @generated
	 */
	EAttribute getServiceIdentificationType_AccessConstraints();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.ServiceProviderType <em>Service Provider Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Provider Type</em>'.
	 * @see net.opengis.ows.ServiceProviderType
	 * @generated
	 */
	EClass getServiceProviderType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ows.ServiceProviderType#getProviderName <em>Provider Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Name</em>'.
	 * @see net.opengis.ows.ServiceProviderType#getProviderName()
	 * @see #getServiceProviderType()
	 * @generated
	 */
	EAttribute getServiceProviderType_ProviderName();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.ServiceProviderType#getProviderSite <em>Provider Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provider Site</em>'.
	 * @see net.opengis.ows.ServiceProviderType#getProviderSite()
	 * @see #getServiceProviderType()
	 * @generated
	 */
	EReference getServiceProviderType_ProviderSite();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ows.ServiceProviderType#getServiceContact <em>Service Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Contact</em>'.
	 * @see net.opengis.ows.ServiceProviderType#getServiceContact()
	 * @see #getServiceProviderType()
	 * @generated
	 */
	EReference getServiceProviderType_ServiceContact();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.TelephoneType <em>Telephone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telephone Type</em>'.
	 * @see net.opengis.ows.TelephoneType
	 * @generated
	 */
	EClass getTelephoneType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ows.TelephoneType#getVoice <em>Voice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Voice</em>'.
	 * @see net.opengis.ows.TelephoneType#getVoice()
	 * @see #getTelephoneType()
	 * @generated
	 */
	EAttribute getTelephoneType_Voice();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ows.TelephoneType#getFacsimile <em>Facsimile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Facsimile</em>'.
	 * @see net.opengis.ows.TelephoneType#getFacsimile()
	 * @see #getTelephoneType()
	 * @generated
	 */
	EAttribute getTelephoneType_Facsimile();

	/**
	 * Returns the meta object for class '{@link net.opengis.ows.WGS84BoundingBoxType <em>WGS84 Bounding Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WGS84 Bounding Box Type</em>'.
	 * @see net.opengis.ows.WGS84BoundingBoxType
	 * @generated
	 */
	EClass getWGS84BoundingBoxType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * XML encoded identifier of a standard MIME type, possibly a parameterized MIME type. 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Mime Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MimeType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='(application|audio|image|text|video|message|multipart|model)/.+(;\\s*.+=.+)*'"
	 * @generated
	 */
	EDataType getMimeType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Position instances hold the coordinates of a position in a coordinate reference system (CRS) referenced by the related "crs" attribute or elsewhere. For an angular coordinate axis that is physically continuous for multiple revolutions, but whose recorded values can be discontinuous, special conditions apply when the bounding box is continuous across the value discontinuity:
     * a)  If the bounding box is continuous clear around this angular axis, then ordinate values of minus and plus infinity shall be used.
     * b)  If the bounding box is continuous across the value discontinuity but is not continuous clear around this angular axis, then some non-normal value can be used if specified for a specific OWS use of the BoundingBoxType. For more information, see Subclauses 10.2.5 and C.13. 
     * This type is adapted from DirectPositionType and doubleList of GML 3.1. The adaptations include omission of all the attributes, since the needed information is included in the BoundingBoxType. 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Position Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='PositionType' itemType='http://www.eclipse.org/emf/2003/XMLType#double'"
	 * @generated
	 */
	EDataType getPositionType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Position Type2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Two-dimensional position instances hold the longitude and latitude coordinates of a position in the 2D WGS 84 coordinate reference system. The longitude value shall be listed first, followed by the latitude value, both in decimal degrees. Latitude values shall range from -90 to +90 degrees, and longitude values shall normally range from -180 to +180 degrees. For the longitude axis, special conditions apply when the bounding box is continuous across the +/- 180 degrees meridian longitude value discontinuity:
     * a)  If the bounding box is continuous clear around the Earth, then longitude values of minus and plus infinity shall be used.
     * b)  If the bounding box is continuous across the value discontinuity but is not continuous clear around the Earth, then some non-normal value can be used if specified for a specific OWS use of the WGS84BoundingBoxType. For more information, see Subclauses 10.4.5 and C.13. 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Position Type2 D</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='PositionType2D' baseType='PositionType' length='2'"
	 * @generated
	 */
	EDataType getPositionType2D();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Service type identifier, where the string value is the OWS type abbreviation, such as "WMS" or "WFS". 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Service Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ServiceType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getServiceType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Update Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Service metadata document version, having values that are "increased" whenever any change is made in service metadata document. Values are selected by each server, and are always opaque to clients. See updateSequence parameter use subclause for more information. 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Update Sequence Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='UpdateSequenceType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getUpdateSequenceType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specification version for OWS operation. The string value shall contain one x.y.z "version" value (e.g., "2.1.3"). A version number shall contain three non-negative integers separated by decimal points, in the form "x.y.z". The integers y and z shall not exceed 99. Each version shall be for the Implementation Specification (document) and the associated XML Schemas to which requested operations will conform. An Implementation Specification version normally specifies XML Schemas against which an XML encoded operation response must conform and should be validated. See Version negotiation subclause for more information. 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Version Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='VersionType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getVersionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OWSFactory getOWSFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.AcceptFormatsTypeImpl <em>Accept Formats Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.AcceptFormatsTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getAcceptFormatsType()
		 * @generated
		 */
		EClass ACCEPT_FORMATS_TYPE = eINSTANCE.getAcceptFormatsType();

		/**
		 * The meta object literal for the '<em><b>Output Format</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPT_FORMATS_TYPE__OUTPUT_FORMAT = eINSTANCE.getAcceptFormatsType_OutputFormat();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.AcceptVersionsTypeImpl <em>Accept Versions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.AcceptVersionsTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getAcceptVersionsType()
		 * @generated
		 */
		EClass ACCEPT_VERSIONS_TYPE = eINSTANCE.getAcceptVersionsType();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPT_VERSIONS_TYPE__VERSION = eINSTANCE.getAcceptVersionsType_Version();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.AddressTypeImpl <em>Address Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.AddressTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getAddressType()
		 * @generated
		 */
		EClass ADDRESS_TYPE = eINSTANCE.getAddressType();

		/**
		 * The meta object literal for the '<em><b>Delivery Point</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__DELIVERY_POINT = eINSTANCE.getAddressType_DeliveryPoint();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__CITY = eINSTANCE.getAddressType_City();

		/**
		 * The meta object literal for the '<em><b>Administrative Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__ADMINISTRATIVE_AREA = eINSTANCE.getAddressType_AdministrativeArea();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__POSTAL_CODE = eINSTANCE.getAddressType_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__COUNTRY = eINSTANCE.getAddressType_Country();

		/**
		 * The meta object literal for the '<em><b>Electronic Mail Address</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__ELECTRONIC_MAIL_ADDRESS = eINSTANCE.getAddressType_ElectronicMailAddress();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.BoundingBoxTypeImpl <em>Bounding Box Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.BoundingBoxTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getBoundingBoxType()
		 * @generated
		 */
		EClass BOUNDING_BOX_TYPE = eINSTANCE.getBoundingBoxType();

		/**
		 * The meta object literal for the '<em><b>Lower Corner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDING_BOX_TYPE__LOWER_CORNER = eINSTANCE.getBoundingBoxType_LowerCorner();

		/**
		 * The meta object literal for the '<em><b>Upper Corner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDING_BOX_TYPE__UPPER_CORNER = eINSTANCE.getBoundingBoxType_UpperCorner();

		/**
		 * The meta object literal for the '<em><b>Crs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDING_BOX_TYPE__CRS = eINSTANCE.getBoundingBoxType_Crs();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDING_BOX_TYPE__DIMENSIONS = eINSTANCE.getBoundingBoxType_Dimensions();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.CapabilitiesBaseTypeImpl <em>Capabilities Base Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.CapabilitiesBaseTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getCapabilitiesBaseType()
		 * @generated
		 */
		EClass CAPABILITIES_BASE_TYPE = eINSTANCE.getCapabilitiesBaseType();

		/**
		 * The meta object literal for the '<em><b>Service Identification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_BASE_TYPE__SERVICE_IDENTIFICATION = eINSTANCE.getCapabilitiesBaseType_ServiceIdentification();

		/**
		 * The meta object literal for the '<em><b>Service Provider</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_BASE_TYPE__SERVICE_PROVIDER = eINSTANCE.getCapabilitiesBaseType_ServiceProvider();

		/**
		 * The meta object literal for the '<em><b>Operations Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_BASE_TYPE__OPERATIONS_METADATA = eINSTANCE.getCapabilitiesBaseType_OperationsMetadata();

		/**
		 * The meta object literal for the '<em><b>Update Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITIES_BASE_TYPE__UPDATE_SEQUENCE = eINSTANCE.getCapabilitiesBaseType_UpdateSequence();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITIES_BASE_TYPE__VERSION = eINSTANCE.getCapabilitiesBaseType_Version();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.CodeTypeImpl <em>Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.CodeTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getCodeType()
		 * @generated
		 */
		EClass CODE_TYPE = eINSTANCE.getCodeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_TYPE__VALUE = eINSTANCE.getCodeType_Value();

		/**
		 * The meta object literal for the '<em><b>Code Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_TYPE__CODE_SPACE = eINSTANCE.getCodeType_CodeSpace();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.ContactTypeImpl <em>Contact Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.ContactTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getContactType()
		 * @generated
		 */
		EClass CONTACT_TYPE = eINSTANCE.getContactType();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_TYPE__PHONE = eINSTANCE.getContactType_Phone();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_TYPE__ADDRESS = eINSTANCE.getContactType_Address();

		/**
		 * The meta object literal for the '<em><b>Online Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_TYPE__ONLINE_RESOURCE = eINSTANCE.getContactType_OnlineResource();

		/**
		 * The meta object literal for the '<em><b>Hours Of Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_TYPE__HOURS_OF_SERVICE = eINSTANCE.getContactType_HoursOfService();

		/**
		 * The meta object literal for the '<em><b>Contact Instructions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_TYPE__CONTACT_INSTRUCTIONS = eINSTANCE.getContactType_ContactInstructions();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.DCPTypeImpl <em>DCP Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.DCPTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getDCPType()
		 * @generated
		 */
		EClass DCP_TYPE = eINSTANCE.getDCPType();

		/**
		 * The meta object literal for the '<em><b>HTTP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCP_TYPE__HTTP = eINSTANCE.getDCPType_HTTP();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.DescriptionTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getDescriptionType()
		 * @generated
		 */
		EClass DESCRIPTION_TYPE = eINSTANCE.getDescriptionType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_TYPE__TITLE = eINSTANCE.getDescriptionType_Title();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_TYPE__ABSTRACT = eINSTANCE.getDescriptionType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_TYPE__KEYWORDS = eINSTANCE.getDescriptionType_Keywords();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.DocumentRootImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ABSTRACT = eINSTANCE.getDocumentRoot_Abstract();

		/**
		 * The meta object literal for the '<em><b>Abstract Meta Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ABSTRACT_META_DATA = eINSTANCE.getDocumentRoot_AbstractMetaData();

		/**
		 * The meta object literal for the '<em><b>Access Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ACCESS_CONSTRAINTS = eINSTANCE.getDocumentRoot_AccessConstraints();

		/**
		 * The meta object literal for the '<em><b>Available CRS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__AVAILABLE_CRS = eINSTANCE.getDocumentRoot_AvailableCRS();

		/**
		 * The meta object literal for the '<em><b>Bounding Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BOUNDING_BOX = eINSTANCE.getDocumentRoot_BoundingBox();

		/**
		 * The meta object literal for the '<em><b>Contact Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONTACT_INFO = eINSTANCE.getDocumentRoot_ContactInfo();

		/**
		 * The meta object literal for the '<em><b>DCP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DCP = eINSTANCE.getDocumentRoot_DCP();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXCEPTION = eINSTANCE.getDocumentRoot_Exception();

		/**
		 * The meta object literal for the '<em><b>Exception Report</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXCEPTION_REPORT = eINSTANCE.getDocumentRoot_ExceptionReport();

		/**
		 * The meta object literal for the '<em><b>Extended Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTENDED_CAPABILITIES = eINSTANCE.getDocumentRoot_ExtendedCapabilities();

		/**
		 * The meta object literal for the '<em><b>Fees</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FEES = eINSTANCE.getDocumentRoot_Fees();

		/**
		 * The meta object literal for the '<em><b>Get Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_CAPABILITIES = eINSTANCE.getDocumentRoot_GetCapabilities();

		/**
		 * The meta object literal for the '<em><b>HTTP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HTTP = eINSTANCE.getDocumentRoot_HTTP();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IDENTIFIER = eINSTANCE.getDocumentRoot_Identifier();

		/**
		 * The meta object literal for the '<em><b>Individual Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__INDIVIDUAL_NAME = eINSTANCE.getDocumentRoot_IndividualName();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KEYWORDS = eINSTANCE.getDocumentRoot_Keywords();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LANGUAGE = eINSTANCE.getDocumentRoot_Language();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__METADATA = eINSTANCE.getDocumentRoot_Metadata();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OPERATION = eINSTANCE.getDocumentRoot_Operation();

		/**
		 * The meta object literal for the '<em><b>Operations Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OPERATIONS_METADATA = eINSTANCE.getDocumentRoot_OperationsMetadata();

		/**
		 * The meta object literal for the '<em><b>Organisation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ORGANISATION_NAME = eINSTANCE.getDocumentRoot_OrganisationName();

		/**
		 * The meta object literal for the '<em><b>Output Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__OUTPUT_FORMAT = eINSTANCE.getDocumentRoot_OutputFormat();

		/**
		 * The meta object literal for the '<em><b>Point Of Contact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__POINT_OF_CONTACT = eINSTANCE.getDocumentRoot_PointOfContact();

		/**
		 * The meta object literal for the '<em><b>Position Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__POSITION_NAME = eINSTANCE.getDocumentRoot_PositionName();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ROLE = eINSTANCE.getDocumentRoot_Role();

		/**
		 * The meta object literal for the '<em><b>Service Identification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_IDENTIFICATION = eINSTANCE.getDocumentRoot_ServiceIdentification();

		/**
		 * The meta object literal for the '<em><b>Service Provider</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_PROVIDER = eINSTANCE.getDocumentRoot_ServiceProvider();

		/**
		 * The meta object literal for the '<em><b>Supported CRS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SUPPORTED_CRS = eINSTANCE.getDocumentRoot_SupportedCRS();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TITLE = eINSTANCE.getDocumentRoot_Title();

		/**
		 * The meta object literal for the '<em><b>WGS84 Bounding Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WGS84_BOUNDING_BOX = eINSTANCE.getDocumentRoot_WGS84BoundingBox();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.DomainTypeImpl <em>Domain Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.DomainTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getDomainType()
		 * @generated
		 */
		EClass DOMAIN_TYPE = eINSTANCE.getDomainType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_TYPE__VALUE = eINSTANCE.getDomainType_Value();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_TYPE__METADATA = eINSTANCE.getDomainType_Metadata();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_TYPE__NAME = eINSTANCE.getDomainType_Name();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.ExceptionReportTypeImpl <em>Exception Report Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.ExceptionReportTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getExceptionReportType()
		 * @generated
		 */
		EClass EXCEPTION_REPORT_TYPE = eINSTANCE.getExceptionReportType();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_REPORT_TYPE__EXCEPTION = eINSTANCE.getExceptionReportType_Exception();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_REPORT_TYPE__LANGUAGE = eINSTANCE.getExceptionReportType_Language();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_REPORT_TYPE__VERSION = eINSTANCE.getExceptionReportType_Version();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.ExceptionTypeImpl <em>Exception Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.ExceptionTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getExceptionType()
		 * @generated
		 */
		EClass EXCEPTION_TYPE = eINSTANCE.getExceptionType();

		/**
		 * The meta object literal for the '<em><b>Exception Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE__EXCEPTION_TEXT = eINSTANCE.getExceptionType_ExceptionText();

		/**
		 * The meta object literal for the '<em><b>Exception Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE__EXCEPTION_CODE = eINSTANCE.getExceptionType_ExceptionCode();

		/**
		 * The meta object literal for the '<em><b>Locator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE__LOCATOR = eINSTANCE.getExceptionType_Locator();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.GetCapabilitiesTypeImpl <em>Get Capabilities Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.GetCapabilitiesTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getGetCapabilitiesType()
		 * @generated
		 */
		EClass GET_CAPABILITIES_TYPE = eINSTANCE.getGetCapabilitiesType();

		/**
		 * The meta object literal for the '<em><b>Accept Versions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_CAPABILITIES_TYPE__ACCEPT_VERSIONS = eINSTANCE.getGetCapabilitiesType_AcceptVersions();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_CAPABILITIES_TYPE__SECTIONS = eINSTANCE.getGetCapabilitiesType_Sections();

		/**
		 * The meta object literal for the '<em><b>Accept Formats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_CAPABILITIES_TYPE__ACCEPT_FORMATS = eINSTANCE.getGetCapabilitiesType_AcceptFormats();

		/**
		 * The meta object literal for the '<em><b>Update Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CAPABILITIES_TYPE__UPDATE_SEQUENCE = eINSTANCE.getGetCapabilitiesType_UpdateSequence();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.HTTPTypeImpl <em>HTTP Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.HTTPTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getHTTPType()
		 * @generated
		 */
		EClass HTTP_TYPE = eINSTANCE.getHTTPType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_TYPE__GROUP = eINSTANCE.getHTTPType_Group();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_TYPE__GET = eINSTANCE.getHTTPType_Get();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_TYPE__POST = eINSTANCE.getHTTPType_Post();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.IdentificationTypeImpl <em>Identification Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.IdentificationTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getIdentificationType()
		 * @generated
		 */
		EClass IDENTIFICATION_TYPE = eINSTANCE.getIdentificationType();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFICATION_TYPE__IDENTIFIER = eINSTANCE.getIdentificationType_Identifier();

		/**
		 * The meta object literal for the '<em><b>Bounding Box Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION_TYPE__BOUNDING_BOX_GROUP = eINSTANCE.getIdentificationType_BoundingBoxGroup();

		/**
		 * The meta object literal for the '<em><b>Bounding Box</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFICATION_TYPE__BOUNDING_BOX = eINSTANCE.getIdentificationType_BoundingBox();

		/**
		 * The meta object literal for the '<em><b>Output Format</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION_TYPE__OUTPUT_FORMAT = eINSTANCE.getIdentificationType_OutputFormat();

		/**
		 * The meta object literal for the '<em><b>Available CRS Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION_TYPE__AVAILABLE_CRS_GROUP = eINSTANCE.getIdentificationType_AvailableCRSGroup();

		/**
		 * The meta object literal for the '<em><b>Available CRS</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION_TYPE__AVAILABLE_CRS = eINSTANCE.getIdentificationType_AvailableCRS();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFICATION_TYPE__METADATA = eINSTANCE.getIdentificationType_Metadata();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.KeywordsTypeImpl <em>Keywords Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.KeywordsTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getKeywordsType()
		 * @generated
		 */
		EClass KEYWORDS_TYPE = eINSTANCE.getKeywordsType();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYWORDS_TYPE__KEYWORD = eINSTANCE.getKeywordsType_Keyword();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEYWORDS_TYPE__TYPE = eINSTANCE.getKeywordsType_Type();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.MetadataTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getMetadataType()
		 * @generated
		 */
		EClass METADATA_TYPE = eINSTANCE.getMetadataType();

		/**
		 * The meta object literal for the '<em><b>Abstract Meta Data Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__ABSTRACT_META_DATA_GROUP = eINSTANCE.getMetadataType_AbstractMetaDataGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Meta Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_TYPE__ABSTRACT_META_DATA = eINSTANCE.getMetadataType_AbstractMetaData();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__ABOUT = eINSTANCE.getMetadataType_About();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__ACTUATE = eINSTANCE.getMetadataType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__ARCROLE = eINSTANCE.getMetadataType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__HREF = eINSTANCE.getMetadataType_Href();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__ROLE = eINSTANCE.getMetadataType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__SHOW = eINSTANCE.getMetadataType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__TITLE = eINSTANCE.getMetadataType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__TYPE = eINSTANCE.getMetadataType_Type();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.OnlineResourceTypeImpl <em>Online Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.OnlineResourceTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getOnlineResourceType()
		 * @generated
		 */
		EClass ONLINE_RESOURCE_TYPE = eINSTANCE.getOnlineResourceType();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_RESOURCE_TYPE__ACTUATE = eINSTANCE.getOnlineResourceType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_RESOURCE_TYPE__ARCROLE = eINSTANCE.getOnlineResourceType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_RESOURCE_TYPE__HREF = eINSTANCE.getOnlineResourceType_Href();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_RESOURCE_TYPE__ROLE = eINSTANCE.getOnlineResourceType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_RESOURCE_TYPE__SHOW = eINSTANCE.getOnlineResourceType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_RESOURCE_TYPE__TITLE = eINSTANCE.getOnlineResourceType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_RESOURCE_TYPE__TYPE = eINSTANCE.getOnlineResourceType_Type();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.OperationsMetadataTypeImpl <em>Operations Metadata Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.OperationsMetadataTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getOperationsMetadataType()
		 * @generated
		 */
		EClass OPERATIONS_METADATA_TYPE = eINSTANCE.getOperationsMetadataType();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONS_METADATA_TYPE__OPERATION = eINSTANCE.getOperationsMetadataType_Operation();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONS_METADATA_TYPE__PARAMETER = eINSTANCE.getOperationsMetadataType_Parameter();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONS_METADATA_TYPE__CONSTRAINT = eINSTANCE.getOperationsMetadataType_Constraint();

		/**
		 * The meta object literal for the '<em><b>Extended Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONS_METADATA_TYPE__EXTENDED_CAPABILITIES = eINSTANCE.getOperationsMetadataType_ExtendedCapabilities();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.OperationTypeImpl <em>Operation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.OperationTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getOperationType()
		 * @generated
		 */
		EClass OPERATION_TYPE = eINSTANCE.getOperationType();

		/**
		 * The meta object literal for the '<em><b>DCP</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_TYPE__DCP = eINSTANCE.getOperationType_DCP();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_TYPE__PARAMETER = eINSTANCE.getOperationType_Parameter();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_TYPE__CONSTRAINT = eINSTANCE.getOperationType_Constraint();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_TYPE__METADATA = eINSTANCE.getOperationType_Metadata();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_TYPE__NAME = eINSTANCE.getOperationType_Name();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.RequestMethodTypeImpl <em>Request Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.RequestMethodTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getRequestMethodType()
		 * @generated
		 */
		EClass REQUEST_METHOD_TYPE = eINSTANCE.getRequestMethodType();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_METHOD_TYPE__CONSTRAINT = eINSTANCE.getRequestMethodType_Constraint();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.ResponsiblePartySubsetTypeImpl <em>Responsible Party Subset Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.ResponsiblePartySubsetTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getResponsiblePartySubsetType()
		 * @generated
		 */
		EClass RESPONSIBLE_PARTY_SUBSET_TYPE = eINSTANCE.getResponsiblePartySubsetType();

		/**
		 * The meta object literal for the '<em><b>Individual Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSIBLE_PARTY_SUBSET_TYPE__INDIVIDUAL_NAME = eINSTANCE.getResponsiblePartySubsetType_IndividualName();

		/**
		 * The meta object literal for the '<em><b>Position Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSIBLE_PARTY_SUBSET_TYPE__POSITION_NAME = eINSTANCE.getResponsiblePartySubsetType_PositionName();

		/**
		 * The meta object literal for the '<em><b>Contact Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBLE_PARTY_SUBSET_TYPE__CONTACT_INFO = eINSTANCE.getResponsiblePartySubsetType_ContactInfo();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBLE_PARTY_SUBSET_TYPE__ROLE = eINSTANCE.getResponsiblePartySubsetType_Role();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.ResponsiblePartyTypeImpl <em>Responsible Party Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.ResponsiblePartyTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getResponsiblePartyType()
		 * @generated
		 */
		EClass RESPONSIBLE_PARTY_TYPE = eINSTANCE.getResponsiblePartyType();

		/**
		 * The meta object literal for the '<em><b>Individual Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSIBLE_PARTY_TYPE__INDIVIDUAL_NAME = eINSTANCE.getResponsiblePartyType_IndividualName();

		/**
		 * The meta object literal for the '<em><b>Organisation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSIBLE_PARTY_TYPE__ORGANISATION_NAME = eINSTANCE.getResponsiblePartyType_OrganisationName();

		/**
		 * The meta object literal for the '<em><b>Position Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSIBLE_PARTY_TYPE__POSITION_NAME = eINSTANCE.getResponsiblePartyType_PositionName();

		/**
		 * The meta object literal for the '<em><b>Contact Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBLE_PARTY_TYPE__CONTACT_INFO = eINSTANCE.getResponsiblePartyType_ContactInfo();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBLE_PARTY_TYPE__ROLE = eINSTANCE.getResponsiblePartyType_Role();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.SectionsTypeImpl <em>Sections Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.SectionsTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getSectionsType()
		 * @generated
		 */
		EClass SECTIONS_TYPE = eINSTANCE.getSectionsType();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTIONS_TYPE__SECTION = eINSTANCE.getSectionsType_Section();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.ServiceIdentificationTypeImpl <em>Service Identification Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.ServiceIdentificationTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getServiceIdentificationType()
		 * @generated
		 */
		EClass SERVICE_IDENTIFICATION_TYPE = eINSTANCE.getServiceIdentificationType();

		/**
		 * The meta object literal for the '<em><b>Service Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_IDENTIFICATION_TYPE__SERVICE_TYPE = eINSTANCE.getServiceIdentificationType_ServiceType();

		/**
		 * The meta object literal for the '<em><b>Service Type Version</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_IDENTIFICATION_TYPE__SERVICE_TYPE_VERSION = eINSTANCE.getServiceIdentificationType_ServiceTypeVersion();

		/**
		 * The meta object literal for the '<em><b>Fees</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_IDENTIFICATION_TYPE__FEES = eINSTANCE.getServiceIdentificationType_Fees();

		/**
		 * The meta object literal for the '<em><b>Access Constraints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_IDENTIFICATION_TYPE__ACCESS_CONSTRAINTS = eINSTANCE.getServiceIdentificationType_AccessConstraints();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.ServiceProviderTypeImpl <em>Service Provider Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.ServiceProviderTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getServiceProviderType()
		 * @generated
		 */
		EClass SERVICE_PROVIDER_TYPE = eINSTANCE.getServiceProviderType();

		/**
		 * The meta object literal for the '<em><b>Provider Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROVIDER_TYPE__PROVIDER_NAME = eINSTANCE.getServiceProviderType_ProviderName();

		/**
		 * The meta object literal for the '<em><b>Provider Site</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROVIDER_TYPE__PROVIDER_SITE = eINSTANCE.getServiceProviderType_ProviderSite();

		/**
		 * The meta object literal for the '<em><b>Service Contact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROVIDER_TYPE__SERVICE_CONTACT = eINSTANCE.getServiceProviderType_ServiceContact();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.TelephoneTypeImpl <em>Telephone Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.TelephoneTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getTelephoneType()
		 * @generated
		 */
		EClass TELEPHONE_TYPE = eINSTANCE.getTelephoneType();

		/**
		 * The meta object literal for the '<em><b>Voice</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_TYPE__VOICE = eINSTANCE.getTelephoneType_Voice();

		/**
		 * The meta object literal for the '<em><b>Facsimile</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_TYPE__FACSIMILE = eINSTANCE.getTelephoneType_Facsimile();

		/**
		 * The meta object literal for the '{@link net.opengis.ows.impl.WGS84BoundingBoxTypeImpl <em>WGS84 Bounding Box Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ows.impl.WGS84BoundingBoxTypeImpl
		 * @see net.opengis.ows.impl.OWSPackageImpl#getWGS84BoundingBoxType()
		 * @generated
		 */
		EClass WGS84_BOUNDING_BOX_TYPE = eINSTANCE.getWGS84BoundingBoxType();

		/**
		 * The meta object literal for the '<em>Mime Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.ows.impl.OWSPackageImpl#getMimeType()
		 * @generated
		 */
		EDataType MIME_TYPE = eINSTANCE.getMimeType();

		/**
		 * The meta object literal for the '<em>Position Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see net.opengis.ows.impl.OWSPackageImpl#getPositionType()
		 * @generated
		 */
		EDataType POSITION_TYPE = eINSTANCE.getPositionType();

		/**
		 * The meta object literal for the '<em>Position Type2 D</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see net.opengis.ows.impl.OWSPackageImpl#getPositionType2D()
		 * @generated
		 */
		EDataType POSITION_TYPE2_D = eINSTANCE.getPositionType2D();

		/**
		 * The meta object literal for the '<em>Service Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.ows.impl.OWSPackageImpl#getServiceType()
		 * @generated
		 */
		EDataType SERVICE_TYPE = eINSTANCE.getServiceType();

		/**
		 * The meta object literal for the '<em>Update Sequence Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.ows.impl.OWSPackageImpl#getUpdateSequenceType()
		 * @generated
		 */
		EDataType UPDATE_SEQUENCE_TYPE = eINSTANCE.getUpdateSequenceType();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.ows.impl.OWSPackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //OWSPackage
