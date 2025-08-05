/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package net.opengis.wms;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see net.opengis.wms.WMSFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = WMSPackage.eNS_URI, genModel = "/model/wms-capabilities.genmodel", genModelSourceLocations = {"model/wms-capabilities.genmodel","net.opengis.wms/model/wms-capabilities.genmodel"}, ecore="/model/wms-capabilities.ecore", ecoreSourceLocations="/model/wms-capabilities.ecore")
public interface WMSPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/wms";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WMSPackage eINSTANCE = net.opengis.wms.impl.WMSPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.AttributionTypeImpl <em>Attribution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.AttributionTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getAttributionType()
	 * @generated
	 */
	int ATTRIBUTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Online Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_TYPE__ONLINE_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Logo URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_TYPE__LOGO_URL = 2;

	/**
	 * The number of structural features of the '<em>Attribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.AuthorityURLTypeImpl <em>Authority URL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.AuthorityURLTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getAuthorityURLType()
	 * @generated
	 */
	int AUTHORITY_URL_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Online Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORITY_URL_TYPE__ONLINE_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORITY_URL_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Authority URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORITY_URL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Authority URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORITY_URL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.BoundingBoxTypeImpl <em>Bounding Box Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.BoundingBoxTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getBoundingBoxType()
	 * @generated
	 */
	int BOUNDING_BOX_TYPE = 2;

	/**
	 * The feature id for the '<em><b>CRS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX_TYPE__CRS = 0;

	/**
	 * The feature id for the '<em><b>Maxx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX_TYPE__MAXX = 1;

	/**
	 * The feature id for the '<em><b>Maxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX_TYPE__MAXY = 2;

	/**
	 * The feature id for the '<em><b>Minx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX_TYPE__MINX = 3;

	/**
	 * The feature id for the '<em><b>Miny</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX_TYPE__MINY = 4;

	/**
	 * The feature id for the '<em><b>Resx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX_TYPE__RESX = 5;

	/**
	 * The feature id for the '<em><b>Resy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX_TYPE__RESY = 6;

	/**
	 * The number of structural features of the '<em>Bounding Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Bounding Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.CapabilityTypeImpl <em>Capability Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.CapabilityTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getCapabilityType()
	 * @generated
	 */
	int CAPABILITY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_TYPE__REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_TYPE__EXCEPTION = 1;

	/**
	 * The feature id for the '<em><b>Extended Capabilities Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_TYPE__EXTENDED_CAPABILITIES_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Extended Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_TYPE__EXTENDED_CAPABILITIES = 3;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_TYPE__LAYER = 4;

	/**
	 * The number of structural features of the '<em>Capability Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Capability Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.ContactAddressTypeImpl <em>Contact Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.ContactAddressTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getContactAddressType()
	 * @generated
	 */
	int CONTACT_ADDRESS_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Address Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_ADDRESS_TYPE__ADDRESS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_ADDRESS_TYPE__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_ADDRESS_TYPE__CITY = 2;

	/**
	 * The feature id for the '<em><b>State Or Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_ADDRESS_TYPE__STATE_OR_PROVINCE = 3;

	/**
	 * The feature id for the '<em><b>Post Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_ADDRESS_TYPE__POST_CODE = 4;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_ADDRESS_TYPE__COUNTRY = 5;

	/**
	 * The number of structural features of the '<em>Contact Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_ADDRESS_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Contact Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_ADDRESS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.ContactInformationTypeImpl <em>Contact Information Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.ContactInformationTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getContactInformationType()
	 * @generated
	 */
	int CONTACT_INFORMATION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Contact Person Primary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION_TYPE__CONTACT_PERSON_PRIMARY = 0;

	/**
	 * The feature id for the '<em><b>Contact Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION_TYPE__CONTACT_POSITION = 1;

	/**
	 * The feature id for the '<em><b>Contact Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION_TYPE__CONTACT_ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Contact Voice Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION_TYPE__CONTACT_VOICE_TELEPHONE = 3;

	/**
	 * The feature id for the '<em><b>Contact Facsimile Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION_TYPE__CONTACT_FACSIMILE_TELEPHONE = 4;

	/**
	 * The feature id for the '<em><b>Contact Electronic Mail Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION_TYPE__CONTACT_ELECTRONIC_MAIL_ADDRESS = 5;

	/**
	 * The number of structural features of the '<em>Contact Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Contact Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.ContactPersonPrimaryTypeImpl <em>Contact Person Primary Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.ContactPersonPrimaryTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getContactPersonPrimaryType()
	 * @generated
	 */
	int CONTACT_PERSON_PRIMARY_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Contact Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_PERSON_PRIMARY_TYPE__CONTACT_PERSON = 0;

	/**
	 * The feature id for the '<em><b>Contact Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_PERSON_PRIMARY_TYPE__CONTACT_ORGANIZATION = 1;

	/**
	 * The number of structural features of the '<em>Contact Person Primary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_PERSON_PRIMARY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Contact Person Primary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_PERSON_PRIMARY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.DataURLTypeImpl <em>Data URL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.DataURLTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getDataURLType()
	 * @generated
	 */
	int DATA_URL_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_URL_TYPE__FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Online Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_URL_TYPE__ONLINE_RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>Data URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_URL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_URL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.DCPTypeTypeImpl <em>DCP Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.DCPTypeTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getDCPTypeType()
	 * @generated
	 */
	int DCP_TYPE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>HTTP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCP_TYPE_TYPE__HTTP = 0;

	/**
	 * The number of structural features of the '<em>DCP Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCP_TYPE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DCP Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCP_TYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.DimensionTypeImpl <em>Dimension Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.DimensionTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getDimensionType()
	 * @generated
	 */
	int DIMENSION_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE__CURRENT = 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE__DEFAULT = 2;

	/**
	 * The feature id for the '<em><b>Multiple Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE__MULTIPLE_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Nearest Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE__NEAREST_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE__UNITS = 6;

	/**
	 * The feature id for the '<em><b>Unit Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE__UNIT_SYMBOL = 7;

	/**
	 * The number of structural features of the '<em>Dimension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Dimension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.DocumentRootImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 10;

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
	 * The feature id for the '<em><b>Extended Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENDED_CAPABILITIES = 3;

	/**
	 * The feature id for the '<em><b>Extended Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENDED_OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT = 5;

	/**
	 * The feature id for the '<em><b>Access Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACCESS_CONSTRAINTS = 6;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDRESS = 7;

	/**
	 * The feature id for the '<em><b>Address Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDRESS_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Attribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ATTRIBUTION = 9;

	/**
	 * The feature id for the '<em><b>Authority URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTHORITY_URL = 10;

	/**
	 * The feature id for the '<em><b>Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOUNDING_BOX = 11;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAPABILITY = 12;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CITY = 13;

	/**
	 * The feature id for the '<em><b>Contact Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTACT_ADDRESS = 14;

	/**
	 * The feature id for the '<em><b>Contact Electronic Mail Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTACT_ELECTRONIC_MAIL_ADDRESS = 15;

	/**
	 * The feature id for the '<em><b>Contact Facsimile Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTACT_FACSIMILE_TELEPHONE = 16;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTACT_INFORMATION = 17;

	/**
	 * The feature id for the '<em><b>Contact Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTACT_ORGANIZATION = 18;

	/**
	 * The feature id for the '<em><b>Contact Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTACT_PERSON = 19;

	/**
	 * The feature id for the '<em><b>Contact Person Primary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTACT_PERSON_PRIMARY = 20;

	/**
	 * The feature id for the '<em><b>Contact Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTACT_POSITION = 21;

	/**
	 * The feature id for the '<em><b>Contact Voice Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTACT_VOICE_TELEPHONE = 22;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COUNTRY = 23;

	/**
	 * The feature id for the '<em><b>CRS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CRS = 24;

	/**
	 * The feature id for the '<em><b>Data URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_URL = 25;

	/**
	 * The feature id for the '<em><b>DCP Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DCP_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIMENSION = 27;

	/**
	 * The feature id for the '<em><b>EX Geographic Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EX_GEOGRAPHIC_BOUNDING_BOX = 28;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXCEPTION = 29;

	/**
	 * The feature id for the '<em><b>Feature List URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FEATURE_LIST_URL = 30;

	/**
	 * The feature id for the '<em><b>Fees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FEES = 31;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORMAT = 32;

	/**
	 * The feature id for the '<em><b>Get</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET = 33;

	/**
	 * The feature id for the '<em><b>Get Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CAPABILITIES = 34;

	/**
	 * The feature id for the '<em><b>Get Feature Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_FEATURE_INFO = 35;

	/**
	 * The feature id for the '<em><b>Get Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_MAP = 36;

	/**
	 * The feature id for the '<em><b>HTTP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HTTP = 37;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IDENTIFIER = 38;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEYWORD = 39;

	/**
	 * The feature id for the '<em><b>Keyword List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEYWORD_LIST = 40;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAYER = 41;

	/**
	 * The feature id for the '<em><b>Layer Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAYER_LIMIT = 42;

	/**
	 * The feature id for the '<em><b>Legend URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LEGEND_URL = 43;

	/**
	 * The feature id for the '<em><b>Logo URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOGO_URL = 44;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAX_HEIGHT = 45;

	/**
	 * The feature id for the '<em><b>Max Scale Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAX_SCALE_DENOMINATOR = 46;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAX_WIDTH = 47;

	/**
	 * The feature id for the '<em><b>Metadata URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METADATA_URL = 48;

	/**
	 * The feature id for the '<em><b>Min Scale Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIN_SCALE_DENOMINATOR = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME = 50;

	/**
	 * The feature id for the '<em><b>Online Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ONLINE_RESOURCE = 51;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POST = 52;

	/**
	 * The feature id for the '<em><b>Post Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POST_CODE = 53;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUEST = 54;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE = 55;

	/**
	 * The feature id for the '<em><b>State Or Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STATE_OR_PROVINCE = 56;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE = 57;

	/**
	 * The feature id for the '<em><b>Style Sheet URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE_SHEET_URL = 58;

	/**
	 * The feature id for the '<em><b>Style URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE_URL = 59;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE = 60;

	/**
	 * The feature id for the '<em><b>WMS Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WMS_CAPABILITIES = 61;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 62;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.ExceptionTypeImpl <em>Exception Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.ExceptionTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getExceptionType()
	 * @generated
	 */
	int EXCEPTION_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__FORMAT = 0;

	/**
	 * The number of structural features of the '<em>Exception Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exception Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.EXGeographicBoundingBoxTypeImpl <em>EX Geographic Bounding Box Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.EXGeographicBoundingBoxTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getEXGeographicBoundingBoxType()
	 * @generated
	 */
	int EX_GEOGRAPHIC_BOUNDING_BOX_TYPE = 12;

	/**
	 * The feature id for the '<em><b>West Bound Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__WEST_BOUND_LONGITUDE = 0;

	/**
	 * The feature id for the '<em><b>East Bound Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__EAST_BOUND_LONGITUDE = 1;

	/**
	 * The feature id for the '<em><b>South Bound Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__SOUTH_BOUND_LATITUDE = 2;

	/**
	 * The feature id for the '<em><b>North Bound Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__NORTH_BOUND_LATITUDE = 3;

	/**
	 * The number of structural features of the '<em>EX Geographic Bounding Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_GEOGRAPHIC_BOUNDING_BOX_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>EX Geographic Bounding Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_GEOGRAPHIC_BOUNDING_BOX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.FeatureListURLTypeImpl <em>Feature List URL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.FeatureListURLTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getFeatureListURLType()
	 * @generated
	 */
	int FEATURE_LIST_URL_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LIST_URL_TYPE__FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Online Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LIST_URL_TYPE__ONLINE_RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>Feature List URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LIST_URL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Feature List URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LIST_URL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.GetTypeImpl <em>Get Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.GetTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getGetType()
	 * @generated
	 */
	int GET_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Online Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TYPE__ONLINE_RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Get Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.HTTPTypeImpl <em>HTTP Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.HTTPTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getHTTPType()
	 * @generated
	 */
	int HTTP_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Get</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_TYPE__GET = 0;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_TYPE__POST = 1;

	/**
	 * The number of structural features of the '<em>HTTP Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>HTTP Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.IdentifierTypeImpl <em>Identifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.IdentifierTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getIdentifierType()
	 * @generated
	 */
	int IDENTIFIER_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_TYPE__AUTHORITY = 1;

	/**
	 * The number of structural features of the '<em>Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.KeywordListTypeImpl <em>Keyword List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.KeywordListTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getKeywordListType()
	 * @generated
	 */
	int KEYWORD_LIST_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_LIST_TYPE__KEYWORD = 0;

	/**
	 * The number of structural features of the '<em>Keyword List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Keyword List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.KeywordTypeImpl <em>Keyword Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.KeywordTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getKeywordType()
	 * @generated
	 */
	int KEYWORD_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Vocabulary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_TYPE__VOCABULARY = 1;

	/**
	 * The number of structural features of the '<em>Keyword Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Keyword Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.LayerTypeImpl <em>Layer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.LayerTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getLayerType()
	 * @generated
	 */
	int LAYER_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Keyword List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__KEYWORD_LIST = 3;

	/**
	 * The feature id for the '<em><b>CRS</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__CRS = 4;

	/**
	 * The feature id for the '<em><b>EX Geographic Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__EX_GEOGRAPHIC_BOUNDING_BOX = 5;

	/**
	 * The feature id for the '<em><b>Bounding Box</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__BOUNDING_BOX = 6;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__DIMENSION = 7;

	/**
	 * The feature id for the '<em><b>Attribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__ATTRIBUTION = 8;

	/**
	 * The feature id for the '<em><b>Authority URL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__AUTHORITY_URL = 9;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__IDENTIFIER = 10;

	/**
	 * The feature id for the '<em><b>Metadata URL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__METADATA_URL = 11;

	/**
	 * The feature id for the '<em><b>Data URL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__DATA_URL = 12;

	/**
	 * The feature id for the '<em><b>Feature List URL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__FEATURE_LIST_URL = 13;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__STYLE = 14;

	/**
	 * The feature id for the '<em><b>Min Scale Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__MIN_SCALE_DENOMINATOR = 15;

	/**
	 * The feature id for the '<em><b>Max Scale Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__MAX_SCALE_DENOMINATOR = 16;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__LAYER = 17;

	/**
	 * The feature id for the '<em><b>Cascaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__CASCADED = 18;

	/**
	 * The feature id for the '<em><b>Fixed Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__FIXED_HEIGHT = 19;

	/**
	 * The feature id for the '<em><b>Fixed Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__FIXED_WIDTH = 20;

	/**
	 * The feature id for the '<em><b>No Subsets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__NO_SUBSETS = 21;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__OPAQUE = 22;

	/**
	 * The feature id for the '<em><b>Queryable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE__QUERYABLE = 23;

	/**
	 * The number of structural features of the '<em>Layer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE_FEATURE_COUNT = 24;

	/**
	 * The number of operations of the '<em>Layer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.LegendURLTypeImpl <em>Legend URL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.LegendURLTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getLegendURLType()
	 * @generated
	 */
	int LEGEND_URL_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_URL_TYPE__FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Online Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_URL_TYPE__ONLINE_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_URL_TYPE__HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_URL_TYPE__WIDTH = 3;

	/**
	 * The number of structural features of the '<em>Legend URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_URL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Legend URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_URL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.LogoURLTypeImpl <em>Logo URL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.LogoURLTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getLogoURLType()
	 * @generated
	 */
	int LOGO_URL_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGO_URL_TYPE__FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Online Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGO_URL_TYPE__ONLINE_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGO_URL_TYPE__HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGO_URL_TYPE__WIDTH = 3;

	/**
	 * The number of structural features of the '<em>Logo URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGO_URL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Logo URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGO_URL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.MetadataURLTypeImpl <em>Metadata URL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.MetadataURLTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getMetadataURLType()
	 * @generated
	 */
	int METADATA_URL_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_URL_TYPE__FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Online Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_URL_TYPE__ONLINE_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_URL_TYPE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Metadata URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_URL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Metadata URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_URL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.OnlineResourceTypeImpl <em>Online Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.OnlineResourceTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getOnlineResourceType()
	 * @generated
	 */
	int ONLINE_RESOURCE_TYPE = 23;

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
	 * The meta object id for the '{@link net.opengis.wms.impl.OperationTypeImpl <em>Operation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.OperationTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getOperationType()
	 * @generated
	 */
	int OPERATION_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE__FORMAT = 0;

	/**
	 * The feature id for the '<em><b>DCP Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE__DCP_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.PostTypeImpl <em>Post Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.PostTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getPostType()
	 * @generated
	 */
	int POST_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Online Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TYPE__ONLINE_RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Post Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Post Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.RequestTypeImpl <em>Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.RequestTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getRequestType()
	 * @generated
	 */
	int REQUEST_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Get Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_TYPE__GET_CAPABILITIES = 0;

	/**
	 * The feature id for the '<em><b>Get Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_TYPE__GET_MAP = 1;

	/**
	 * The feature id for the '<em><b>Get Feature Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_TYPE__GET_FEATURE_INFO = 2;

	/**
	 * The feature id for the '<em><b>Extended Operation Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_TYPE__EXTENDED_OPERATION_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Extended Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_TYPE__EXTENDED_OPERATION = 4;

	/**
	 * The number of structural features of the '<em>Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.ServiceTypeImpl <em>Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.ServiceTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Keyword List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__KEYWORD_LIST = 3;

	/**
	 * The feature id for the '<em><b>Online Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__ONLINE_RESOURCE = 4;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__CONTACT_INFORMATION = 5;

	/**
	 * The feature id for the '<em><b>Fees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__FEES = 6;

	/**
	 * The feature id for the '<em><b>Access Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__ACCESS_CONSTRAINTS = 7;

	/**
	 * The feature id for the '<em><b>Layer Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__LAYER_LIMIT = 8;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__MAX_WIDTH = 9;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__MAX_HEIGHT = 10;

	/**
	 * The number of structural features of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.StyleSheetURLTypeImpl <em>Style Sheet URL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.StyleSheetURLTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getStyleSheetURLType()
	 * @generated
	 */
	int STYLE_SHEET_URL_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET_URL_TYPE__FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Online Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET_URL_TYPE__ONLINE_RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>Style Sheet URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET_URL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Style Sheet URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET_URL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.StyleTypeImpl <em>Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.StyleTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getStyleType()
	 * @generated
	 */
	int STYLE_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Legend URL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__LEGEND_URL = 3;

	/**
	 * The feature id for the '<em><b>Style Sheet URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__STYLE_SHEET_URL = 4;

	/**
	 * The feature id for the '<em><b>Style URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__STYLE_URL = 5;

	/**
	 * The number of structural features of the '<em>Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.StyleURLTypeImpl <em>Style URL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.StyleURLTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getStyleURLType()
	 * @generated
	 */
	int STYLE_URL_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_URL_TYPE__FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Online Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_URL_TYPE__ONLINE_RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>Style URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_URL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Style URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_URL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.impl.WMSCapabilitiesTypeImpl <em>Capabilities Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.WMSCapabilitiesTypeImpl
	 * @see net.opengis.wms.impl.WMSPackageImpl#getWMSCapabilitiesType()
	 * @generated
	 */
	int WMS_CAPABILITIES_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS_CAPABILITIES_TYPE__SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS_CAPABILITIES_TYPE__CAPABILITY = 1;

	/**
	 * The feature id for the '<em><b>Update Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS_CAPABILITIES_TYPE__UPDATE_SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS_CAPABILITIES_TYPE__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS_CAPABILITIES_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS_CAPABILITIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wms.NameType <em>Name Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.NameType
	 * @see net.opengis.wms.impl.WMSPackageImpl#getNameType()
	 * @generated
	 */
	int NAME_TYPE = 32;

	/**
	 * The meta object id for the '<em>Latitude Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.WMSPackageImpl#getLatitudeType()
	 * @generated
	 */
	int LATITUDE_TYPE = 33;

	/**
	 * The meta object id for the '<em>Latitude Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see net.opengis.wms.impl.WMSPackageImpl#getLatitudeTypeObject()
	 * @generated
	 */
	int LATITUDE_TYPE_OBJECT = 34;

	/**
	 * The meta object id for the '<em>Longitude Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.impl.WMSPackageImpl#getLongitudeType()
	 * @generated
	 */
	int LONGITUDE_TYPE = 35;

	/**
	 * The meta object id for the '<em>Longitude Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see net.opengis.wms.impl.WMSPackageImpl#getLongitudeTypeObject()
	 * @generated
	 */
	int LONGITUDE_TYPE_OBJECT = 36;

	/**
	 * The meta object id for the '<em>Name Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wms.NameType
	 * @see net.opengis.wms.impl.WMSPackageImpl#getNameTypeObject()
	 * @generated
	 */
	int NAME_TYPE_OBJECT = 37;


	/**
	 * Returns the meta object for class '{@link net.opengis.wms.AttributionType <em>Attribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribution Type</em>'.
	 * @see net.opengis.wms.AttributionType
	 * @generated
	 */
	EClass getAttributionType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.AttributionType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.wms.AttributionType#getTitle()
	 * @see #getAttributionType()
	 * @generated
	 */
	EAttribute getAttributionType_Title();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.AttributionType#getOnlineResource <em>Online Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Online Resource</em>'.
	 * @see net.opengis.wms.AttributionType#getOnlineResource()
	 * @see #getAttributionType()
	 * @generated
	 */
	EReference getAttributionType_OnlineResource();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.AttributionType#getLogoURL <em>Logo URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logo URL</em>'.
	 * @see net.opengis.wms.AttributionType#getLogoURL()
	 * @see #getAttributionType()
	 * @generated
	 */
	EReference getAttributionType_LogoURL();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.AuthorityURLType <em>Authority URL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authority URL Type</em>'.
	 * @see net.opengis.wms.AuthorityURLType
	 * @generated
	 */
	EClass getAuthorityURLType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.AuthorityURLType#getOnlineResource <em>Online Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Online Resource</em>'.
	 * @see net.opengis.wms.AuthorityURLType#getOnlineResource()
	 * @see #getAuthorityURLType()
	 * @generated
	 */
	EReference getAuthorityURLType_OnlineResource();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.AuthorityURLType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.wms.AuthorityURLType#getName()
	 * @see #getAuthorityURLType()
	 * @generated
	 */
	EAttribute getAuthorityURLType_Name();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.BoundingBoxType <em>Bounding Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounding Box Type</em>'.
	 * @see net.opengis.wms.BoundingBoxType
	 * @generated
	 */
	EClass getBoundingBoxType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.BoundingBoxType#getCRS <em>CRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CRS</em>'.
	 * @see net.opengis.wms.BoundingBoxType#getCRS()
	 * @see #getBoundingBoxType()
	 * @generated
	 */
	EAttribute getBoundingBoxType_CRS();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.BoundingBoxType#getMaxx <em>Maxx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxx</em>'.
	 * @see net.opengis.wms.BoundingBoxType#getMaxx()
	 * @see #getBoundingBoxType()
	 * @generated
	 */
	EAttribute getBoundingBoxType_Maxx();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.BoundingBoxType#getMaxy <em>Maxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxy</em>'.
	 * @see net.opengis.wms.BoundingBoxType#getMaxy()
	 * @see #getBoundingBoxType()
	 * @generated
	 */
	EAttribute getBoundingBoxType_Maxy();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.BoundingBoxType#getMinx <em>Minx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minx</em>'.
	 * @see net.opengis.wms.BoundingBoxType#getMinx()
	 * @see #getBoundingBoxType()
	 * @generated
	 */
	EAttribute getBoundingBoxType_Minx();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.BoundingBoxType#getMiny <em>Miny</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Miny</em>'.
	 * @see net.opengis.wms.BoundingBoxType#getMiny()
	 * @see #getBoundingBoxType()
	 * @generated
	 */
	EAttribute getBoundingBoxType_Miny();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.BoundingBoxType#getResx <em>Resx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resx</em>'.
	 * @see net.opengis.wms.BoundingBoxType#getResx()
	 * @see #getBoundingBoxType()
	 * @generated
	 */
	EAttribute getBoundingBoxType_Resx();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.BoundingBoxType#getResy <em>Resy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resy</em>'.
	 * @see net.opengis.wms.BoundingBoxType#getResy()
	 * @see #getBoundingBoxType()
	 * @generated
	 */
	EAttribute getBoundingBoxType_Resy();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.CapabilityType <em>Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Type</em>'.
	 * @see net.opengis.wms.CapabilityType
	 * @generated
	 */
	EClass getCapabilityType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.CapabilityType#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see net.opengis.wms.CapabilityType#getRequest()
	 * @see #getCapabilityType()
	 * @generated
	 */
	EReference getCapabilityType_Request();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.CapabilityType#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception</em>'.
	 * @see net.opengis.wms.CapabilityType#getException()
	 * @see #getCapabilityType()
	 * @generated
	 */
	EReference getCapabilityType_Exception();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wms.CapabilityType#getExtendedCapabilitiesGroup <em>Extended Capabilities Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extended Capabilities Group</em>'.
	 * @see net.opengis.wms.CapabilityType#getExtendedCapabilitiesGroup()
	 * @see #getCapabilityType()
	 * @generated
	 */
	EAttribute getCapabilityType_ExtendedCapabilitiesGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wms.CapabilityType#getExtendedCapabilities <em>Extended Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extended Capabilities</em>'.
	 * @see net.opengis.wms.CapabilityType#getExtendedCapabilities()
	 * @see #getCapabilityType()
	 * @generated
	 */
	EReference getCapabilityType_ExtendedCapabilities();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.CapabilityType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layer</em>'.
	 * @see net.opengis.wms.CapabilityType#getLayer()
	 * @see #getCapabilityType()
	 * @generated
	 */
	EReference getCapabilityType_Layer();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.ContactAddressType <em>Contact Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Address Type</em>'.
	 * @see net.opengis.wms.ContactAddressType
	 * @generated
	 */
	EClass getContactAddressType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.ContactAddressType#getAddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Type</em>'.
	 * @see net.opengis.wms.ContactAddressType#getAddressType()
	 * @see #getContactAddressType()
	 * @generated
	 */
	EAttribute getContactAddressType_AddressType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.ContactAddressType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see net.opengis.wms.ContactAddressType#getAddress()
	 * @see #getContactAddressType()
	 * @generated
	 */
	EAttribute getContactAddressType_Address();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.ContactAddressType#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see net.opengis.wms.ContactAddressType#getCity()
	 * @see #getContactAddressType()
	 * @generated
	 */
	EAttribute getContactAddressType_City();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.ContactAddressType#getStateOrProvince <em>State Or Province</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Or Province</em>'.
	 * @see net.opengis.wms.ContactAddressType#getStateOrProvince()
	 * @see #getContactAddressType()
	 * @generated
	 */
	EAttribute getContactAddressType_StateOrProvince();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.ContactAddressType#getPostCode <em>Post Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post Code</em>'.
	 * @see net.opengis.wms.ContactAddressType#getPostCode()
	 * @see #getContactAddressType()
	 * @generated
	 */
	EAttribute getContactAddressType_PostCode();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.ContactAddressType#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see net.opengis.wms.ContactAddressType#getCountry()
	 * @see #getContactAddressType()
	 * @generated
	 */
	EAttribute getContactAddressType_Country();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.ContactInformationType <em>Contact Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Information Type</em>'.
	 * @see net.opengis.wms.ContactInformationType
	 * @generated
	 */
	EClass getContactInformationType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.ContactInformationType#getContactPersonPrimary <em>Contact Person Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contact Person Primary</em>'.
	 * @see net.opengis.wms.ContactInformationType#getContactPersonPrimary()
	 * @see #getContactInformationType()
	 * @generated
	 */
	EReference getContactInformationType_ContactPersonPrimary();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.ContactInformationType#getContactPosition <em>Contact Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Position</em>'.
	 * @see net.opengis.wms.ContactInformationType#getContactPosition()
	 * @see #getContactInformationType()
	 * @generated
	 */
	EAttribute getContactInformationType_ContactPosition();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.ContactInformationType#getContactAddress <em>Contact Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contact Address</em>'.
	 * @see net.opengis.wms.ContactInformationType#getContactAddress()
	 * @see #getContactInformationType()
	 * @generated
	 */
	EReference getContactInformationType_ContactAddress();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.ContactInformationType#getContactVoiceTelephone <em>Contact Voice Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Voice Telephone</em>'.
	 * @see net.opengis.wms.ContactInformationType#getContactVoiceTelephone()
	 * @see #getContactInformationType()
	 * @generated
	 */
	EAttribute getContactInformationType_ContactVoiceTelephone();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.ContactInformationType#getContactFacsimileTelephone <em>Contact Facsimile Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Facsimile Telephone</em>'.
	 * @see net.opengis.wms.ContactInformationType#getContactFacsimileTelephone()
	 * @see #getContactInformationType()
	 * @generated
	 */
	EAttribute getContactInformationType_ContactFacsimileTelephone();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.ContactInformationType#getContactElectronicMailAddress <em>Contact Electronic Mail Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Electronic Mail Address</em>'.
	 * @see net.opengis.wms.ContactInformationType#getContactElectronicMailAddress()
	 * @see #getContactInformationType()
	 * @generated
	 */
	EAttribute getContactInformationType_ContactElectronicMailAddress();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.ContactPersonPrimaryType <em>Contact Person Primary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Person Primary Type</em>'.
	 * @see net.opengis.wms.ContactPersonPrimaryType
	 * @generated
	 */
	EClass getContactPersonPrimaryType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.ContactPersonPrimaryType#getContactPerson <em>Contact Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Person</em>'.
	 * @see net.opengis.wms.ContactPersonPrimaryType#getContactPerson()
	 * @see #getContactPersonPrimaryType()
	 * @generated
	 */
	EAttribute getContactPersonPrimaryType_ContactPerson();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.ContactPersonPrimaryType#getContactOrganization <em>Contact Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Organization</em>'.
	 * @see net.opengis.wms.ContactPersonPrimaryType#getContactOrganization()
	 * @see #getContactPersonPrimaryType()
	 * @generated
	 */
	EAttribute getContactPersonPrimaryType_ContactOrganization();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.DataURLType <em>Data URL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data URL Type</em>'.
	 * @see net.opengis.wms.DataURLType
	 * @generated
	 */
	EClass getDataURLType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DataURLType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see net.opengis.wms.DataURLType#getFormat()
	 * @see #getDataURLType()
	 * @generated
	 */
	EAttribute getDataURLType_Format();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DataURLType#getOnlineResource <em>Online Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Online Resource</em>'.
	 * @see net.opengis.wms.DataURLType#getOnlineResource()
	 * @see #getDataURLType()
	 * @generated
	 */
	EReference getDataURLType_OnlineResource();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.DCPTypeType <em>DCP Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCP Type Type</em>'.
	 * @see net.opengis.wms.DCPTypeType
	 * @generated
	 */
	EClass getDCPTypeType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DCPTypeType#getHTTP <em>HTTP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HTTP</em>'.
	 * @see net.opengis.wms.DCPTypeType#getHTTP()
	 * @see #getDCPTypeType()
	 * @generated
	 */
	EReference getDCPTypeType_HTTP();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.DimensionType <em>Dimension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension Type</em>'.
	 * @see net.opengis.wms.DimensionType
	 * @generated
	 */
	EClass getDimensionType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DimensionType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.wms.DimensionType#getValue()
	 * @see #getDimensionType()
	 * @generated
	 */
	EAttribute getDimensionType_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DimensionType#isCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current</em>'.
	 * @see net.opengis.wms.DimensionType#isCurrent()
	 * @see #getDimensionType()
	 * @generated
	 */
	EAttribute getDimensionType_Current();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DimensionType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see net.opengis.wms.DimensionType#getDefault()
	 * @see #getDimensionType()
	 * @generated
	 */
	EAttribute getDimensionType_Default();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DimensionType#isMultipleValues <em>Multiple Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Values</em>'.
	 * @see net.opengis.wms.DimensionType#isMultipleValues()
	 * @see #getDimensionType()
	 * @generated
	 */
	EAttribute getDimensionType_MultipleValues();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DimensionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.wms.DimensionType#getName()
	 * @see #getDimensionType()
	 * @generated
	 */
	EAttribute getDimensionType_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DimensionType#isNearestValue <em>Nearest Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nearest Value</em>'.
	 * @see net.opengis.wms.DimensionType#isNearestValue()
	 * @see #getDimensionType()
	 * @generated
	 */
	EAttribute getDimensionType_NearestValue();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DimensionType#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see net.opengis.wms.DimensionType#getUnits()
	 * @see #getDimensionType()
	 * @generated
	 */
	EAttribute getDimensionType_Units();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DimensionType#getUnitSymbol <em>Unit Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Symbol</em>'.
	 * @see net.opengis.wms.DimensionType#getUnitSymbol()
	 * @see #getDimensionType()
	 * @generated
	 */
	EAttribute getDimensionType_UnitSymbol();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.opengis.wms.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wms.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.wms.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.opengis.wms.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.opengis.wms.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.opengis.wms.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.opengis.wms.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getExtendedCapabilities <em>Extended Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Capabilities</em>'.
	 * @see net.opengis.wms.DocumentRoot#getExtendedCapabilities()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExtendedCapabilities();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getExtendedOperation <em>Extended Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Operation</em>'.
	 * @see net.opengis.wms.DocumentRoot#getExtendedOperation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExtendedOperation();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see net.opengis.wms.DocumentRoot#getAbstract()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getAccessConstraints <em>Access Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Constraints</em>'.
	 * @see net.opengis.wms.DocumentRoot#getAccessConstraints()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AccessConstraints();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see net.opengis.wms.DocumentRoot#getAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Address();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getAddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Type</em>'.
	 * @see net.opengis.wms.DocumentRoot#getAddressType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AddressType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getAttribution <em>Attribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribution</em>'.
	 * @see net.opengis.wms.DocumentRoot#getAttribution()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Attribution();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getAuthorityURL <em>Authority URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authority URL</em>'.
	 * @see net.opengis.wms.DocumentRoot#getAuthorityURL()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AuthorityURL();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getBoundingBox <em>Bounding Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounding Box</em>'.
	 * @see net.opengis.wms.DocumentRoot#getBoundingBox()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BoundingBox();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capability</em>'.
	 * @see net.opengis.wms.DocumentRoot#getCapability()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Capability();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see net.opengis.wms.DocumentRoot#getCity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_City();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getContactAddress <em>Contact Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contact Address</em>'.
	 * @see net.opengis.wms.DocumentRoot#getContactAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ContactAddress();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getContactElectronicMailAddress <em>Contact Electronic Mail Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Electronic Mail Address</em>'.
	 * @see net.opengis.wms.DocumentRoot#getContactElectronicMailAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ContactElectronicMailAddress();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getContactFacsimileTelephone <em>Contact Facsimile Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Facsimile Telephone</em>'.
	 * @see net.opengis.wms.DocumentRoot#getContactFacsimileTelephone()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ContactFacsimileTelephone();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getContactInformation <em>Contact Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contact Information</em>'.
	 * @see net.opengis.wms.DocumentRoot#getContactInformation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ContactInformation();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getContactOrganization <em>Contact Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Organization</em>'.
	 * @see net.opengis.wms.DocumentRoot#getContactOrganization()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ContactOrganization();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getContactPerson <em>Contact Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Person</em>'.
	 * @see net.opengis.wms.DocumentRoot#getContactPerson()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ContactPerson();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getContactPersonPrimary <em>Contact Person Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contact Person Primary</em>'.
	 * @see net.opengis.wms.DocumentRoot#getContactPersonPrimary()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ContactPersonPrimary();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getContactPosition <em>Contact Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Position</em>'.
	 * @see net.opengis.wms.DocumentRoot#getContactPosition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ContactPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getContactVoiceTelephone <em>Contact Voice Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Voice Telephone</em>'.
	 * @see net.opengis.wms.DocumentRoot#getContactVoiceTelephone()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ContactVoiceTelephone();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see net.opengis.wms.DocumentRoot#getCountry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Country();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getCRS <em>CRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CRS</em>'.
	 * @see net.opengis.wms.DocumentRoot#getCRS()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CRS();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getDataURL <em>Data URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data URL</em>'.
	 * @see net.opengis.wms.DocumentRoot#getDataURL()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataURL();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getDCPType <em>DCP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DCP Type</em>'.
	 * @see net.opengis.wms.DocumentRoot#getDCPType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DCPType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimension</em>'.
	 * @see net.opengis.wms.DocumentRoot#getDimension()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dimension();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getEXGeographicBoundingBox <em>EX Geographic Bounding Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EX Geographic Bounding Box</em>'.
	 * @see net.opengis.wms.DocumentRoot#getEXGeographicBoundingBox()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EXGeographicBoundingBox();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception</em>'.
	 * @see net.opengis.wms.DocumentRoot#getException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Exception();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getFeatureListURL <em>Feature List URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature List URL</em>'.
	 * @see net.opengis.wms.DocumentRoot#getFeatureListURL()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FeatureListURL();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getFees <em>Fees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fees</em>'.
	 * @see net.opengis.wms.DocumentRoot#getFees()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Fees();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see net.opengis.wms.DocumentRoot#getFormat()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Format();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getGet <em>Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get</em>'.
	 * @see net.opengis.wms.DocumentRoot#getGet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Get();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getGetCapabilities <em>Get Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Capabilities</em>'.
	 * @see net.opengis.wms.DocumentRoot#getGetCapabilities()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetCapabilities();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getGetFeatureInfo <em>Get Feature Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Feature Info</em>'.
	 * @see net.opengis.wms.DocumentRoot#getGetFeatureInfo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetFeatureInfo();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getGetMap <em>Get Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Map</em>'.
	 * @see net.opengis.wms.DocumentRoot#getGetMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetMap();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getHTTP <em>HTTP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HTTP</em>'.
	 * @see net.opengis.wms.DocumentRoot#getHTTP()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HTTP();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see net.opengis.wms.DocumentRoot#getIdentifier()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keyword</em>'.
	 * @see net.opengis.wms.DocumentRoot#getKeyword()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Keyword();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getKeywordList <em>Keyword List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keyword List</em>'.
	 * @see net.opengis.wms.DocumentRoot#getKeywordList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_KeywordList();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layer</em>'.
	 * @see net.opengis.wms.DocumentRoot#getLayer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Layer();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getLayerLimit <em>Layer Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer Limit</em>'.
	 * @see net.opengis.wms.DocumentRoot#getLayerLimit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LayerLimit();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getLegendURL <em>Legend URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legend URL</em>'.
	 * @see net.opengis.wms.DocumentRoot#getLegendURL()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LegendURL();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getLogoURL <em>Logo URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logo URL</em>'.
	 * @see net.opengis.wms.DocumentRoot#getLogoURL()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LogoURL();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getMaxHeight <em>Max Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Height</em>'.
	 * @see net.opengis.wms.DocumentRoot#getMaxHeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MaxHeight();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getMaxScaleDenominator <em>Max Scale Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Scale Denominator</em>'.
	 * @see net.opengis.wms.DocumentRoot#getMaxScaleDenominator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MaxScaleDenominator();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getMaxWidth <em>Max Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Width</em>'.
	 * @see net.opengis.wms.DocumentRoot#getMaxWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MaxWidth();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getMetadataURL <em>Metadata URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata URL</em>'.
	 * @see net.opengis.wms.DocumentRoot#getMetadataURL()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MetadataURL();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getMinScaleDenominator <em>Min Scale Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Scale Denominator</em>'.
	 * @see net.opengis.wms.DocumentRoot#getMinScaleDenominator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MinScaleDenominator();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.wms.DocumentRoot#getName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getOnlineResource <em>Online Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Online Resource</em>'.
	 * @see net.opengis.wms.DocumentRoot#getOnlineResource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OnlineResource();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post</em>'.
	 * @see net.opengis.wms.DocumentRoot#getPost()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Post();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getPostCode <em>Post Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post Code</em>'.
	 * @see net.opengis.wms.DocumentRoot#getPostCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PostCode();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see net.opengis.wms.DocumentRoot#getRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Request();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see net.opengis.wms.DocumentRoot#getService()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Service();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getStateOrProvince <em>State Or Province</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Or Province</em>'.
	 * @see net.opengis.wms.DocumentRoot#getStateOrProvince()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StateOrProvince();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see net.opengis.wms.DocumentRoot#getStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Style();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getStyleSheetURL <em>Style Sheet URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style Sheet URL</em>'.
	 * @see net.opengis.wms.DocumentRoot#getStyleSheetURL()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StyleSheetURL();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getStyleURL <em>Style URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style URL</em>'.
	 * @see net.opengis.wms.DocumentRoot#getStyleURL()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StyleURL();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.wms.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Title();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.DocumentRoot#getWMSCapabilities <em>WMS Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WMS Capabilities</em>'.
	 * @see net.opengis.wms.DocumentRoot#getWMSCapabilities()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WMSCapabilities();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.ExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Type</em>'.
	 * @see net.opengis.wms.ExceptionType
	 * @generated
	 */
	EClass getExceptionType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wms.ExceptionType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Format</em>'.
	 * @see net.opengis.wms.ExceptionType#getFormat()
	 * @see #getExceptionType()
	 * @generated
	 */
	EAttribute getExceptionType_Format();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.EXGeographicBoundingBoxType <em>EX Geographic Bounding Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EX Geographic Bounding Box Type</em>'.
	 * @see net.opengis.wms.EXGeographicBoundingBoxType
	 * @generated
	 */
	EClass getEXGeographicBoundingBoxType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.EXGeographicBoundingBoxType#getWestBoundLongitude <em>West Bound Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>West Bound Longitude</em>'.
	 * @see net.opengis.wms.EXGeographicBoundingBoxType#getWestBoundLongitude()
	 * @see #getEXGeographicBoundingBoxType()
	 * @generated
	 */
	EAttribute getEXGeographicBoundingBoxType_WestBoundLongitude();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.EXGeographicBoundingBoxType#getEastBoundLongitude <em>East Bound Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>East Bound Longitude</em>'.
	 * @see net.opengis.wms.EXGeographicBoundingBoxType#getEastBoundLongitude()
	 * @see #getEXGeographicBoundingBoxType()
	 * @generated
	 */
	EAttribute getEXGeographicBoundingBoxType_EastBoundLongitude();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.EXGeographicBoundingBoxType#getSouthBoundLatitude <em>South Bound Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>South Bound Latitude</em>'.
	 * @see net.opengis.wms.EXGeographicBoundingBoxType#getSouthBoundLatitude()
	 * @see #getEXGeographicBoundingBoxType()
	 * @generated
	 */
	EAttribute getEXGeographicBoundingBoxType_SouthBoundLatitude();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.EXGeographicBoundingBoxType#getNorthBoundLatitude <em>North Bound Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>North Bound Latitude</em>'.
	 * @see net.opengis.wms.EXGeographicBoundingBoxType#getNorthBoundLatitude()
	 * @see #getEXGeographicBoundingBoxType()
	 * @generated
	 */
	EAttribute getEXGeographicBoundingBoxType_NorthBoundLatitude();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.FeatureListURLType <em>Feature List URL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature List URL Type</em>'.
	 * @see net.opengis.wms.FeatureListURLType
	 * @generated
	 */
	EClass getFeatureListURLType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.FeatureListURLType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see net.opengis.wms.FeatureListURLType#getFormat()
	 * @see #getFeatureListURLType()
	 * @generated
	 */
	EAttribute getFeatureListURLType_Format();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.FeatureListURLType#getOnlineResource <em>Online Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Online Resource</em>'.
	 * @see net.opengis.wms.FeatureListURLType#getOnlineResource()
	 * @see #getFeatureListURLType()
	 * @generated
	 */
	EReference getFeatureListURLType_OnlineResource();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.GetType <em>Get Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Type</em>'.
	 * @see net.opengis.wms.GetType
	 * @generated
	 */
	EClass getGetType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.GetType#getOnlineResource <em>Online Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Online Resource</em>'.
	 * @see net.opengis.wms.GetType#getOnlineResource()
	 * @see #getGetType()
	 * @generated
	 */
	EReference getGetType_OnlineResource();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.HTTPType <em>HTTP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTP Type</em>'.
	 * @see net.opengis.wms.HTTPType
	 * @generated
	 */
	EClass getHTTPType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.HTTPType#getGet <em>Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get</em>'.
	 * @see net.opengis.wms.HTTPType#getGet()
	 * @see #getHTTPType()
	 * @generated
	 */
	EReference getHTTPType_Get();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.HTTPType#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post</em>'.
	 * @see net.opengis.wms.HTTPType#getPost()
	 * @see #getHTTPType()
	 * @generated
	 */
	EReference getHTTPType_Post();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.IdentifierType <em>Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier Type</em>'.
	 * @see net.opengis.wms.IdentifierType
	 * @generated
	 */
	EClass getIdentifierType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.IdentifierType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.wms.IdentifierType#getValue()
	 * @see #getIdentifierType()
	 * @generated
	 */
	EAttribute getIdentifierType_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.IdentifierType#getAuthority <em>Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority</em>'.
	 * @see net.opengis.wms.IdentifierType#getAuthority()
	 * @see #getIdentifierType()
	 * @generated
	 */
	EAttribute getIdentifierType_Authority();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.KeywordListType <em>Keyword List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword List Type</em>'.
	 * @see net.opengis.wms.KeywordListType
	 * @generated
	 */
	EClass getKeywordListType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wms.KeywordListType#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keyword</em>'.
	 * @see net.opengis.wms.KeywordListType#getKeyword()
	 * @see #getKeywordListType()
	 * @generated
	 */
	EReference getKeywordListType_Keyword();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.KeywordType <em>Keyword Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword Type</em>'.
	 * @see net.opengis.wms.KeywordType
	 * @generated
	 */
	EClass getKeywordType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.KeywordType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.wms.KeywordType#getValue()
	 * @see #getKeywordType()
	 * @generated
	 */
	EAttribute getKeywordType_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.KeywordType#getVocabulary <em>Vocabulary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vocabulary</em>'.
	 * @see net.opengis.wms.KeywordType#getVocabulary()
	 * @see #getKeywordType()
	 * @generated
	 */
	EAttribute getKeywordType_Vocabulary();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.LayerType <em>Layer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Type</em>'.
	 * @see net.opengis.wms.LayerType
	 * @generated
	 */
	EClass getLayerType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.LayerType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.wms.LayerType#getName()
	 * @see #getLayerType()
	 * @generated
	 */
	EAttribute getLayerType_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.LayerType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.wms.LayerType#getTitle()
	 * @see #getLayerType()
	 * @generated
	 */
	EAttribute getLayerType_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.LayerType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see net.opengis.wms.LayerType#getAbstract()
	 * @see #getLayerType()
	 * @generated
	 */
	EAttribute getLayerType_Abstract();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.LayerType#getKeywordList <em>Keyword List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keyword List</em>'.
	 * @see net.opengis.wms.LayerType#getKeywordList()
	 * @see #getLayerType()
	 * @generated
	 */
	EReference getLayerType_KeywordList();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wms.LayerType#getCRS <em>CRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>CRS</em>'.
	 * @see net.opengis.wms.LayerType#getCRS()
	 * @see #getLayerType()
	 * @generated
	 */
	EAttribute getLayerType_CRS();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.LayerType#getEXGeographicBoundingBox <em>EX Geographic Bounding Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EX Geographic Bounding Box</em>'.
	 * @see net.opengis.wms.LayerType#getEXGeographicBoundingBox()
	 * @see #getLayerType()
	 * @generated
	 */
	EReference getLayerType_EXGeographicBoundingBox();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wms.LayerType#getBoundingBox <em>Bounding Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bounding Box</em>'.
	 * @see net.opengis.wms.LayerType#getBoundingBox()
	 * @see #getLayerType()
	 * @generated
	 */
	EReference getLayerType_BoundingBox();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wms.LayerType#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimension</em>'.
	 * @see net.opengis.wms.LayerType#getDimension()
	 * @see #getLayerType()
	 * @generated
	 */
	EReference getLayerType_Dimension();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.LayerType#getAttribution <em>Attribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribution</em>'.
	 * @see net.opengis.wms.LayerType#getAttribution()
	 * @see #getLayerType()
	 * @generated
	 */
	EReference getLayerType_Attribution();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wms.LayerType#getAuthorityURL <em>Authority URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authority URL</em>'.
	 * @see net.opengis.wms.LayerType#getAuthorityURL()
	 * @see #getLayerType()
	 * @generated
	 */
	EReference getLayerType_AuthorityURL();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wms.LayerType#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifier</em>'.
	 * @see net.opengis.wms.LayerType#getIdentifier()
	 * @see #getLayerType()
	 * @generated
	 */
	EReference getLayerType_Identifier();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wms.LayerType#getMetadataURL <em>Metadata URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata URL</em>'.
	 * @see net.opengis.wms.LayerType#getMetadataURL()
	 * @see #getLayerType()
	 * @generated
	 */
	EReference getLayerType_MetadataURL();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wms.LayerType#getDataURL <em>Data URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data URL</em>'.
	 * @see net.opengis.wms.LayerType#getDataURL()
	 * @see #getLayerType()
	 * @generated
	 */
	EReference getLayerType_DataURL();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wms.LayerType#getFeatureListURL <em>Feature List URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature List URL</em>'.
	 * @see net.opengis.wms.LayerType#getFeatureListURL()
	 * @see #getLayerType()
	 * @generated
	 */
	EReference getLayerType_FeatureListURL();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wms.LayerType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Style</em>'.
	 * @see net.opengis.wms.LayerType#getStyle()
	 * @see #getLayerType()
	 * @generated
	 */
	EReference getLayerType_Style();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.LayerType#getMinScaleDenominator <em>Min Scale Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Scale Denominator</em>'.
	 * @see net.opengis.wms.LayerType#getMinScaleDenominator()
	 * @see #getLayerType()
	 * @generated
	 */
	EAttribute getLayerType_MinScaleDenominator();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.LayerType#getMaxScaleDenominator <em>Max Scale Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Scale Denominator</em>'.
	 * @see net.opengis.wms.LayerType#getMaxScaleDenominator()
	 * @see #getLayerType()
	 * @generated
	 */
	EAttribute getLayerType_MaxScaleDenominator();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wms.LayerType#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layer</em>'.
	 * @see net.opengis.wms.LayerType#getLayer()
	 * @see #getLayerType()
	 * @generated
	 */
	EReference getLayerType_Layer();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.LayerType#getCascaded <em>Cascaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascaded</em>'.
	 * @see net.opengis.wms.LayerType#getCascaded()
	 * @see #getLayerType()
	 * @generated
	 */
	EAttribute getLayerType_Cascaded();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.LayerType#getFixedHeight <em>Fixed Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Height</em>'.
	 * @see net.opengis.wms.LayerType#getFixedHeight()
	 * @see #getLayerType()
	 * @generated
	 */
	EAttribute getLayerType_FixedHeight();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.LayerType#getFixedWidth <em>Fixed Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Width</em>'.
	 * @see net.opengis.wms.LayerType#getFixedWidth()
	 * @see #getLayerType()
	 * @generated
	 */
	EAttribute getLayerType_FixedWidth();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.LayerType#isNoSubsets <em>No Subsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Subsets</em>'.
	 * @see net.opengis.wms.LayerType#isNoSubsets()
	 * @see #getLayerType()
	 * @generated
	 */
	EAttribute getLayerType_NoSubsets();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.LayerType#isOpaque <em>Opaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opaque</em>'.
	 * @see net.opengis.wms.LayerType#isOpaque()
	 * @see #getLayerType()
	 * @generated
	 */
	EAttribute getLayerType_Opaque();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.LayerType#isQueryable <em>Queryable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queryable</em>'.
	 * @see net.opengis.wms.LayerType#isQueryable()
	 * @see #getLayerType()
	 * @generated
	 */
	EAttribute getLayerType_Queryable();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.LegendURLType <em>Legend URL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legend URL Type</em>'.
	 * @see net.opengis.wms.LegendURLType
	 * @generated
	 */
	EClass getLegendURLType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.LegendURLType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see net.opengis.wms.LegendURLType#getFormat()
	 * @see #getLegendURLType()
	 * @generated
	 */
	EAttribute getLegendURLType_Format();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.LegendURLType#getOnlineResource <em>Online Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Online Resource</em>'.
	 * @see net.opengis.wms.LegendURLType#getOnlineResource()
	 * @see #getLegendURLType()
	 * @generated
	 */
	EReference getLegendURLType_OnlineResource();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.LegendURLType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see net.opengis.wms.LegendURLType#getHeight()
	 * @see #getLegendURLType()
	 * @generated
	 */
	EAttribute getLegendURLType_Height();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.LegendURLType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.opengis.wms.LegendURLType#getWidth()
	 * @see #getLegendURLType()
	 * @generated
	 */
	EAttribute getLegendURLType_Width();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.LogoURLType <em>Logo URL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logo URL Type</em>'.
	 * @see net.opengis.wms.LogoURLType
	 * @generated
	 */
	EClass getLogoURLType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.LogoURLType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see net.opengis.wms.LogoURLType#getFormat()
	 * @see #getLogoURLType()
	 * @generated
	 */
	EAttribute getLogoURLType_Format();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.LogoURLType#getOnlineResource <em>Online Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Online Resource</em>'.
	 * @see net.opengis.wms.LogoURLType#getOnlineResource()
	 * @see #getLogoURLType()
	 * @generated
	 */
	EReference getLogoURLType_OnlineResource();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.LogoURLType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see net.opengis.wms.LogoURLType#getHeight()
	 * @see #getLogoURLType()
	 * @generated
	 */
	EAttribute getLogoURLType_Height();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.LogoURLType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.opengis.wms.LogoURLType#getWidth()
	 * @see #getLogoURLType()
	 * @generated
	 */
	EAttribute getLogoURLType_Width();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.MetadataURLType <em>Metadata URL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata URL Type</em>'.
	 * @see net.opengis.wms.MetadataURLType
	 * @generated
	 */
	EClass getMetadataURLType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.MetadataURLType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see net.opengis.wms.MetadataURLType#getFormat()
	 * @see #getMetadataURLType()
	 * @generated
	 */
	EAttribute getMetadataURLType_Format();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.MetadataURLType#getOnlineResource <em>Online Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Online Resource</em>'.
	 * @see net.opengis.wms.MetadataURLType#getOnlineResource()
	 * @see #getMetadataURLType()
	 * @generated
	 */
	EReference getMetadataURLType_OnlineResource();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.MetadataURLType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.opengis.wms.MetadataURLType#getType()
	 * @see #getMetadataURLType()
	 * @generated
	 */
	EAttribute getMetadataURLType_Type();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.OnlineResourceType <em>Online Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Online Resource Type</em>'.
	 * @see net.opengis.wms.OnlineResourceType
	 * @generated
	 */
	EClass getOnlineResourceType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.OnlineResourceType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see net.opengis.wms.OnlineResourceType#getActuate()
	 * @see #getOnlineResourceType()
	 * @generated
	 */
	EAttribute getOnlineResourceType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.OnlineResourceType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see net.opengis.wms.OnlineResourceType#getArcrole()
	 * @see #getOnlineResourceType()
	 * @generated
	 */
	EAttribute getOnlineResourceType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.OnlineResourceType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see net.opengis.wms.OnlineResourceType#getHref()
	 * @see #getOnlineResourceType()
	 * @generated
	 */
	EAttribute getOnlineResourceType_Href();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.OnlineResourceType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see net.opengis.wms.OnlineResourceType#getRole()
	 * @see #getOnlineResourceType()
	 * @generated
	 */
	EAttribute getOnlineResourceType_Role();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.OnlineResourceType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see net.opengis.wms.OnlineResourceType#getShow()
	 * @see #getOnlineResourceType()
	 * @generated
	 */
	EAttribute getOnlineResourceType_Show();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.OnlineResourceType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.wms.OnlineResourceType#getTitle()
	 * @see #getOnlineResourceType()
	 * @generated
	 */
	EAttribute getOnlineResourceType_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.OnlineResourceType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.opengis.wms.OnlineResourceType#getType()
	 * @see #getOnlineResourceType()
	 * @generated
	 */
	EAttribute getOnlineResourceType_Type();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Type</em>'.
	 * @see net.opengis.wms.OperationType
	 * @generated
	 */
	EClass getOperationType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wms.OperationType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Format</em>'.
	 * @see net.opengis.wms.OperationType#getFormat()
	 * @see #getOperationType()
	 * @generated
	 */
	EAttribute getOperationType_Format();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wms.OperationType#getDCPType <em>DCP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DCP Type</em>'.
	 * @see net.opengis.wms.OperationType#getDCPType()
	 * @see #getOperationType()
	 * @generated
	 */
	EReference getOperationType_DCPType();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.PostType <em>Post Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Type</em>'.
	 * @see net.opengis.wms.PostType
	 * @generated
	 */
	EClass getPostType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.PostType#getOnlineResource <em>Online Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Online Resource</em>'.
	 * @see net.opengis.wms.PostType#getOnlineResource()
	 * @see #getPostType()
	 * @generated
	 */
	EReference getPostType_OnlineResource();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.RequestType <em>Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Type</em>'.
	 * @see net.opengis.wms.RequestType
	 * @generated
	 */
	EClass getRequestType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.RequestType#getGetCapabilities <em>Get Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Capabilities</em>'.
	 * @see net.opengis.wms.RequestType#getGetCapabilities()
	 * @see #getRequestType()
	 * @generated
	 */
	EReference getRequestType_GetCapabilities();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.RequestType#getGetMap <em>Get Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Map</em>'.
	 * @see net.opengis.wms.RequestType#getGetMap()
	 * @see #getRequestType()
	 * @generated
	 */
	EReference getRequestType_GetMap();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.RequestType#getGetFeatureInfo <em>Get Feature Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Feature Info</em>'.
	 * @see net.opengis.wms.RequestType#getGetFeatureInfo()
	 * @see #getRequestType()
	 * @generated
	 */
	EReference getRequestType_GetFeatureInfo();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wms.RequestType#getExtendedOperationGroup <em>Extended Operation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extended Operation Group</em>'.
	 * @see net.opengis.wms.RequestType#getExtendedOperationGroup()
	 * @see #getRequestType()
	 * @generated
	 */
	EAttribute getRequestType_ExtendedOperationGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wms.RequestType#getExtendedOperation <em>Extended Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extended Operation</em>'.
	 * @see net.opengis.wms.RequestType#getExtendedOperation()
	 * @see #getRequestType()
	 * @generated
	 */
	EReference getRequestType_ExtendedOperation();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Type</em>'.
	 * @see net.opengis.wms.ServiceType
	 * @generated
	 */
	EClass getServiceType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.ServiceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.wms.ServiceType#getName()
	 * @see #getServiceType()
	 * @generated
	 */
	EAttribute getServiceType_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.ServiceType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.wms.ServiceType#getTitle()
	 * @see #getServiceType()
	 * @generated
	 */
	EAttribute getServiceType_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.ServiceType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see net.opengis.wms.ServiceType#getAbstract()
	 * @see #getServiceType()
	 * @generated
	 */
	EAttribute getServiceType_Abstract();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.ServiceType#getKeywordList <em>Keyword List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keyword List</em>'.
	 * @see net.opengis.wms.ServiceType#getKeywordList()
	 * @see #getServiceType()
	 * @generated
	 */
	EReference getServiceType_KeywordList();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.ServiceType#getOnlineResource <em>Online Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Online Resource</em>'.
	 * @see net.opengis.wms.ServiceType#getOnlineResource()
	 * @see #getServiceType()
	 * @generated
	 */
	EReference getServiceType_OnlineResource();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.ServiceType#getContactInformation <em>Contact Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contact Information</em>'.
	 * @see net.opengis.wms.ServiceType#getContactInformation()
	 * @see #getServiceType()
	 * @generated
	 */
	EReference getServiceType_ContactInformation();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.ServiceType#getFees <em>Fees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fees</em>'.
	 * @see net.opengis.wms.ServiceType#getFees()
	 * @see #getServiceType()
	 * @generated
	 */
	EAttribute getServiceType_Fees();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.ServiceType#getAccessConstraints <em>Access Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Constraints</em>'.
	 * @see net.opengis.wms.ServiceType#getAccessConstraints()
	 * @see #getServiceType()
	 * @generated
	 */
	EAttribute getServiceType_AccessConstraints();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.ServiceType#getLayerLimit <em>Layer Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer Limit</em>'.
	 * @see net.opengis.wms.ServiceType#getLayerLimit()
	 * @see #getServiceType()
	 * @generated
	 */
	EAttribute getServiceType_LayerLimit();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.ServiceType#getMaxWidth <em>Max Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Width</em>'.
	 * @see net.opengis.wms.ServiceType#getMaxWidth()
	 * @see #getServiceType()
	 * @generated
	 */
	EAttribute getServiceType_MaxWidth();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.ServiceType#getMaxHeight <em>Max Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Height</em>'.
	 * @see net.opengis.wms.ServiceType#getMaxHeight()
	 * @see #getServiceType()
	 * @generated
	 */
	EAttribute getServiceType_MaxHeight();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.StyleSheetURLType <em>Style Sheet URL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Sheet URL Type</em>'.
	 * @see net.opengis.wms.StyleSheetURLType
	 * @generated
	 */
	EClass getStyleSheetURLType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.StyleSheetURLType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see net.opengis.wms.StyleSheetURLType#getFormat()
	 * @see #getStyleSheetURLType()
	 * @generated
	 */
	EAttribute getStyleSheetURLType_Format();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.StyleSheetURLType#getOnlineResource <em>Online Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Online Resource</em>'.
	 * @see net.opengis.wms.StyleSheetURLType#getOnlineResource()
	 * @see #getStyleSheetURLType()
	 * @generated
	 */
	EReference getStyleSheetURLType_OnlineResource();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.StyleType <em>Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Type</em>'.
	 * @see net.opengis.wms.StyleType
	 * @generated
	 */
	EClass getStyleType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.StyleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.wms.StyleType#getName()
	 * @see #getStyleType()
	 * @generated
	 */
	EAttribute getStyleType_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.StyleType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.wms.StyleType#getTitle()
	 * @see #getStyleType()
	 * @generated
	 */
	EAttribute getStyleType_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.StyleType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see net.opengis.wms.StyleType#getAbstract()
	 * @see #getStyleType()
	 * @generated
	 */
	EAttribute getStyleType_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wms.StyleType#getLegendURL <em>Legend URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legend URL</em>'.
	 * @see net.opengis.wms.StyleType#getLegendURL()
	 * @see #getStyleType()
	 * @generated
	 */
	EReference getStyleType_LegendURL();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.StyleType#getStyleSheetURL <em>Style Sheet URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style Sheet URL</em>'.
	 * @see net.opengis.wms.StyleType#getStyleSheetURL()
	 * @see #getStyleType()
	 * @generated
	 */
	EReference getStyleType_StyleSheetURL();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.StyleType#getStyleURL <em>Style URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style URL</em>'.
	 * @see net.opengis.wms.StyleType#getStyleURL()
	 * @see #getStyleType()
	 * @generated
	 */
	EReference getStyleType_StyleURL();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.StyleURLType <em>Style URL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style URL Type</em>'.
	 * @see net.opengis.wms.StyleURLType
	 * @generated
	 */
	EClass getStyleURLType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.StyleURLType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see net.opengis.wms.StyleURLType#getFormat()
	 * @see #getStyleURLType()
	 * @generated
	 */
	EAttribute getStyleURLType_Format();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.StyleURLType#getOnlineResource <em>Online Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Online Resource</em>'.
	 * @see net.opengis.wms.StyleURLType#getOnlineResource()
	 * @see #getStyleURLType()
	 * @generated
	 */
	EReference getStyleURLType_OnlineResource();

	/**
	 * Returns the meta object for class '{@link net.opengis.wms.WMSCapabilitiesType <em>Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capabilities Type</em>'.
	 * @see net.opengis.wms.WMSCapabilitiesType
	 * @generated
	 */
	EClass getWMSCapabilitiesType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.WMSCapabilitiesType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see net.opengis.wms.WMSCapabilitiesType#getService()
	 * @see #getWMSCapabilitiesType()
	 * @generated
	 */
	EReference getWMSCapabilitiesType_Service();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wms.WMSCapabilitiesType#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capability</em>'.
	 * @see net.opengis.wms.WMSCapabilitiesType#getCapability()
	 * @see #getWMSCapabilitiesType()
	 * @generated
	 */
	EReference getWMSCapabilitiesType_Capability();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.WMSCapabilitiesType#getUpdateSequence <em>Update Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Sequence</em>'.
	 * @see net.opengis.wms.WMSCapabilitiesType#getUpdateSequence()
	 * @see #getWMSCapabilitiesType()
	 * @generated
	 */
	EAttribute getWMSCapabilitiesType_UpdateSequence();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wms.WMSCapabilitiesType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.opengis.wms.WMSCapabilitiesType#getVersion()
	 * @see #getWMSCapabilitiesType()
	 * @generated
	 */
	EAttribute getWMSCapabilitiesType_Version();

	/**
	 * Returns the meta object for enum '{@link net.opengis.wms.NameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Name Type</em>'.
	 * @see net.opengis.wms.NameType
	 * @generated
	 */
	EEnum getNameType();

	/**
	 * Returns the meta object for data type '<em>Latitude Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Latitude Type</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='latitudeType' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='-90' maxInclusive='90'"
	 * @generated
	 */
	EDataType getLatitudeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Latitude Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Latitude Type Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='latitudeType:Object' baseType='latitudeType'"
	 * @generated
	 */
	EDataType getLatitudeTypeObject();

	/**
	 * Returns the meta object for data type '<em>Longitude Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Longitude Type</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='longitudeType' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='-180' maxInclusive='180'"
	 * @generated
	 */
	EDataType getLongitudeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Longitude Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Longitude Type Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='longitudeType:Object' baseType='longitudeType'"
	 * @generated
	 */
	EDataType getLongitudeTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.opengis.wms.NameType <em>Name Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Type Object</em>'.
	 * @see net.opengis.wms.NameType
	 * @model instanceClass="net.opengis.wms.NameType"
	 *        extendedMetaData="name='Name_._type:Object' baseType='Name_._type'"
	 * @generated
	 */
	EDataType getNameTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WMSFactory getWMSFactory();

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
		 * The meta object literal for the '{@link net.opengis.wms.impl.AttributionTypeImpl <em>Attribution Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.AttributionTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getAttributionType()
		 * @generated
		 */
		EClass ATTRIBUTION_TYPE = eINSTANCE.getAttributionType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTION_TYPE__TITLE = eINSTANCE.getAttributionType_Title();

		/**
		 * The meta object literal for the '<em><b>Online Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTION_TYPE__ONLINE_RESOURCE = eINSTANCE.getAttributionType_OnlineResource();

		/**
		 * The meta object literal for the '<em><b>Logo URL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTION_TYPE__LOGO_URL = eINSTANCE.getAttributionType_LogoURL();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.AuthorityURLTypeImpl <em>Authority URL Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.AuthorityURLTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getAuthorityURLType()
		 * @generated
		 */
		EClass AUTHORITY_URL_TYPE = eINSTANCE.getAuthorityURLType();

		/**
		 * The meta object literal for the '<em><b>Online Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORITY_URL_TYPE__ONLINE_RESOURCE = eINSTANCE.getAuthorityURLType_OnlineResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORITY_URL_TYPE__NAME = eINSTANCE.getAuthorityURLType_Name();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.BoundingBoxTypeImpl <em>Bounding Box Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.BoundingBoxTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getBoundingBoxType()
		 * @generated
		 */
		EClass BOUNDING_BOX_TYPE = eINSTANCE.getBoundingBoxType();

		/**
		 * The meta object literal for the '<em><b>CRS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDING_BOX_TYPE__CRS = eINSTANCE.getBoundingBoxType_CRS();

		/**
		 * The meta object literal for the '<em><b>Maxx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDING_BOX_TYPE__MAXX = eINSTANCE.getBoundingBoxType_Maxx();

		/**
		 * The meta object literal for the '<em><b>Maxy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDING_BOX_TYPE__MAXY = eINSTANCE.getBoundingBoxType_Maxy();

		/**
		 * The meta object literal for the '<em><b>Minx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDING_BOX_TYPE__MINX = eINSTANCE.getBoundingBoxType_Minx();

		/**
		 * The meta object literal for the '<em><b>Miny</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDING_BOX_TYPE__MINY = eINSTANCE.getBoundingBoxType_Miny();

		/**
		 * The meta object literal for the '<em><b>Resx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDING_BOX_TYPE__RESX = eINSTANCE.getBoundingBoxType_Resx();

		/**
		 * The meta object literal for the '<em><b>Resy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDING_BOX_TYPE__RESY = eINSTANCE.getBoundingBoxType_Resy();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.CapabilityTypeImpl <em>Capability Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.CapabilityTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getCapabilityType()
		 * @generated
		 */
		EClass CAPABILITY_TYPE = eINSTANCE.getCapabilityType();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_TYPE__REQUEST = eINSTANCE.getCapabilityType_Request();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_TYPE__EXCEPTION = eINSTANCE.getCapabilityType_Exception();

		/**
		 * The meta object literal for the '<em><b>Extended Capabilities Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY_TYPE__EXTENDED_CAPABILITIES_GROUP = eINSTANCE.getCapabilityType_ExtendedCapabilitiesGroup();

		/**
		 * The meta object literal for the '<em><b>Extended Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_TYPE__EXTENDED_CAPABILITIES = eINSTANCE.getCapabilityType_ExtendedCapabilities();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_TYPE__LAYER = eINSTANCE.getCapabilityType_Layer();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.ContactAddressTypeImpl <em>Contact Address Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.ContactAddressTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getContactAddressType()
		 * @generated
		 */
		EClass CONTACT_ADDRESS_TYPE = eINSTANCE.getContactAddressType();

		/**
		 * The meta object literal for the '<em><b>Address Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_ADDRESS_TYPE__ADDRESS_TYPE = eINSTANCE.getContactAddressType_AddressType();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_ADDRESS_TYPE__ADDRESS = eINSTANCE.getContactAddressType_Address();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_ADDRESS_TYPE__CITY = eINSTANCE.getContactAddressType_City();

		/**
		 * The meta object literal for the '<em><b>State Or Province</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_ADDRESS_TYPE__STATE_OR_PROVINCE = eINSTANCE.getContactAddressType_StateOrProvince();

		/**
		 * The meta object literal for the '<em><b>Post Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_ADDRESS_TYPE__POST_CODE = eINSTANCE.getContactAddressType_PostCode();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_ADDRESS_TYPE__COUNTRY = eINSTANCE.getContactAddressType_Country();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.ContactInformationTypeImpl <em>Contact Information Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.ContactInformationTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getContactInformationType()
		 * @generated
		 */
		EClass CONTACT_INFORMATION_TYPE = eINSTANCE.getContactInformationType();

		/**
		 * The meta object literal for the '<em><b>Contact Person Primary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_INFORMATION_TYPE__CONTACT_PERSON_PRIMARY = eINSTANCE.getContactInformationType_ContactPersonPrimary();

		/**
		 * The meta object literal for the '<em><b>Contact Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_INFORMATION_TYPE__CONTACT_POSITION = eINSTANCE.getContactInformationType_ContactPosition();

		/**
		 * The meta object literal for the '<em><b>Contact Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_INFORMATION_TYPE__CONTACT_ADDRESS = eINSTANCE.getContactInformationType_ContactAddress();

		/**
		 * The meta object literal for the '<em><b>Contact Voice Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_INFORMATION_TYPE__CONTACT_VOICE_TELEPHONE = eINSTANCE.getContactInformationType_ContactVoiceTelephone();

		/**
		 * The meta object literal for the '<em><b>Contact Facsimile Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_INFORMATION_TYPE__CONTACT_FACSIMILE_TELEPHONE = eINSTANCE.getContactInformationType_ContactFacsimileTelephone();

		/**
		 * The meta object literal for the '<em><b>Contact Electronic Mail Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_INFORMATION_TYPE__CONTACT_ELECTRONIC_MAIL_ADDRESS = eINSTANCE.getContactInformationType_ContactElectronicMailAddress();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.ContactPersonPrimaryTypeImpl <em>Contact Person Primary Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.ContactPersonPrimaryTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getContactPersonPrimaryType()
		 * @generated
		 */
		EClass CONTACT_PERSON_PRIMARY_TYPE = eINSTANCE.getContactPersonPrimaryType();

		/**
		 * The meta object literal for the '<em><b>Contact Person</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_PERSON_PRIMARY_TYPE__CONTACT_PERSON = eINSTANCE.getContactPersonPrimaryType_ContactPerson();

		/**
		 * The meta object literal for the '<em><b>Contact Organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_PERSON_PRIMARY_TYPE__CONTACT_ORGANIZATION = eINSTANCE.getContactPersonPrimaryType_ContactOrganization();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.DataURLTypeImpl <em>Data URL Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.DataURLTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getDataURLType()
		 * @generated
		 */
		EClass DATA_URL_TYPE = eINSTANCE.getDataURLType();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_URL_TYPE__FORMAT = eINSTANCE.getDataURLType_Format();

		/**
		 * The meta object literal for the '<em><b>Online Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_URL_TYPE__ONLINE_RESOURCE = eINSTANCE.getDataURLType_OnlineResource();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.DCPTypeTypeImpl <em>DCP Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.DCPTypeTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getDCPTypeType()
		 * @generated
		 */
		EClass DCP_TYPE_TYPE = eINSTANCE.getDCPTypeType();

		/**
		 * The meta object literal for the '<em><b>HTTP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCP_TYPE_TYPE__HTTP = eINSTANCE.getDCPTypeType_HTTP();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.DimensionTypeImpl <em>Dimension Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.DimensionTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getDimensionType()
		 * @generated
		 */
		EClass DIMENSION_TYPE = eINSTANCE.getDimensionType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_TYPE__VALUE = eINSTANCE.getDimensionType_Value();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_TYPE__CURRENT = eINSTANCE.getDimensionType_Current();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_TYPE__DEFAULT = eINSTANCE.getDimensionType_Default();

		/**
		 * The meta object literal for the '<em><b>Multiple Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_TYPE__MULTIPLE_VALUES = eINSTANCE.getDimensionType_MultipleValues();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_TYPE__NAME = eINSTANCE.getDimensionType_Name();

		/**
		 * The meta object literal for the '<em><b>Nearest Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_TYPE__NEAREST_VALUE = eINSTANCE.getDimensionType_NearestValue();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_TYPE__UNITS = eINSTANCE.getDimensionType_Units();

		/**
		 * The meta object literal for the '<em><b>Unit Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_TYPE__UNIT_SYMBOL = eINSTANCE.getDimensionType_UnitSymbol();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.DocumentRootImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Extended Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTENDED_CAPABILITIES = eINSTANCE.getDocumentRoot_ExtendedCapabilities();

		/**
		 * The meta object literal for the '<em><b>Extended Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTENDED_OPERATION = eINSTANCE.getDocumentRoot_ExtendedOperation();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ABSTRACT = eINSTANCE.getDocumentRoot_Abstract();

		/**
		 * The meta object literal for the '<em><b>Access Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ACCESS_CONSTRAINTS = eINSTANCE.getDocumentRoot_AccessConstraints();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ADDRESS = eINSTANCE.getDocumentRoot_Address();

		/**
		 * The meta object literal for the '<em><b>Address Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ADDRESS_TYPE = eINSTANCE.getDocumentRoot_AddressType();

		/**
		 * The meta object literal for the '<em><b>Attribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ATTRIBUTION = eINSTANCE.getDocumentRoot_Attribution();

		/**
		 * The meta object literal for the '<em><b>Authority URL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUTHORITY_URL = eINSTANCE.getDocumentRoot_AuthorityURL();

		/**
		 * The meta object literal for the '<em><b>Bounding Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BOUNDING_BOX = eINSTANCE.getDocumentRoot_BoundingBox();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CAPABILITY = eINSTANCE.getDocumentRoot_Capability();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CITY = eINSTANCE.getDocumentRoot_City();

		/**
		 * The meta object literal for the '<em><b>Contact Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONTACT_ADDRESS = eINSTANCE.getDocumentRoot_ContactAddress();

		/**
		 * The meta object literal for the '<em><b>Contact Electronic Mail Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CONTACT_ELECTRONIC_MAIL_ADDRESS = eINSTANCE.getDocumentRoot_ContactElectronicMailAddress();

		/**
		 * The meta object literal for the '<em><b>Contact Facsimile Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CONTACT_FACSIMILE_TELEPHONE = eINSTANCE.getDocumentRoot_ContactFacsimileTelephone();

		/**
		 * The meta object literal for the '<em><b>Contact Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONTACT_INFORMATION = eINSTANCE.getDocumentRoot_ContactInformation();

		/**
		 * The meta object literal for the '<em><b>Contact Organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CONTACT_ORGANIZATION = eINSTANCE.getDocumentRoot_ContactOrganization();

		/**
		 * The meta object literal for the '<em><b>Contact Person</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CONTACT_PERSON = eINSTANCE.getDocumentRoot_ContactPerson();

		/**
		 * The meta object literal for the '<em><b>Contact Person Primary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONTACT_PERSON_PRIMARY = eINSTANCE.getDocumentRoot_ContactPersonPrimary();

		/**
		 * The meta object literal for the '<em><b>Contact Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CONTACT_POSITION = eINSTANCE.getDocumentRoot_ContactPosition();

		/**
		 * The meta object literal for the '<em><b>Contact Voice Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CONTACT_VOICE_TELEPHONE = eINSTANCE.getDocumentRoot_ContactVoiceTelephone();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COUNTRY = eINSTANCE.getDocumentRoot_Country();

		/**
		 * The meta object literal for the '<em><b>CRS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CRS = eINSTANCE.getDocumentRoot_CRS();

		/**
		 * The meta object literal for the '<em><b>Data URL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATA_URL = eINSTANCE.getDocumentRoot_DataURL();

		/**
		 * The meta object literal for the '<em><b>DCP Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DCP_TYPE = eINSTANCE.getDocumentRoot_DCPType();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DIMENSION = eINSTANCE.getDocumentRoot_Dimension();

		/**
		 * The meta object literal for the '<em><b>EX Geographic Bounding Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EX_GEOGRAPHIC_BOUNDING_BOX = eINSTANCE.getDocumentRoot_EXGeographicBoundingBox();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXCEPTION = eINSTANCE.getDocumentRoot_Exception();

		/**
		 * The meta object literal for the '<em><b>Feature List URL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FEATURE_LIST_URL = eINSTANCE.getDocumentRoot_FeatureListURL();

		/**
		 * The meta object literal for the '<em><b>Fees</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FEES = eINSTANCE.getDocumentRoot_Fees();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FORMAT = eINSTANCE.getDocumentRoot_Format();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET = eINSTANCE.getDocumentRoot_Get();

		/**
		 * The meta object literal for the '<em><b>Get Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_CAPABILITIES = eINSTANCE.getDocumentRoot_GetCapabilities();

		/**
		 * The meta object literal for the '<em><b>Get Feature Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_FEATURE_INFO = eINSTANCE.getDocumentRoot_GetFeatureInfo();

		/**
		 * The meta object literal for the '<em><b>Get Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_MAP = eINSTANCE.getDocumentRoot_GetMap();

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
		 * The meta object literal for the '<em><b>Keyword</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KEYWORD = eINSTANCE.getDocumentRoot_Keyword();

		/**
		 * The meta object literal for the '<em><b>Keyword List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KEYWORD_LIST = eINSTANCE.getDocumentRoot_KeywordList();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LAYER = eINSTANCE.getDocumentRoot_Layer();

		/**
		 * The meta object literal for the '<em><b>Layer Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LAYER_LIMIT = eINSTANCE.getDocumentRoot_LayerLimit();

		/**
		 * The meta object literal for the '<em><b>Legend URL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LEGEND_URL = eINSTANCE.getDocumentRoot_LegendURL();

		/**
		 * The meta object literal for the '<em><b>Logo URL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOGO_URL = eINSTANCE.getDocumentRoot_LogoURL();

		/**
		 * The meta object literal for the '<em><b>Max Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MAX_HEIGHT = eINSTANCE.getDocumentRoot_MaxHeight();

		/**
		 * The meta object literal for the '<em><b>Max Scale Denominator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MAX_SCALE_DENOMINATOR = eINSTANCE.getDocumentRoot_MaxScaleDenominator();

		/**
		 * The meta object literal for the '<em><b>Max Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MAX_WIDTH = eINSTANCE.getDocumentRoot_MaxWidth();

		/**
		 * The meta object literal for the '<em><b>Metadata URL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__METADATA_URL = eINSTANCE.getDocumentRoot_MetadataURL();

		/**
		 * The meta object literal for the '<em><b>Min Scale Denominator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIN_SCALE_DENOMINATOR = eINSTANCE.getDocumentRoot_MinScaleDenominator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__NAME = eINSTANCE.getDocumentRoot_Name();

		/**
		 * The meta object literal for the '<em><b>Online Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ONLINE_RESOURCE = eINSTANCE.getDocumentRoot_OnlineResource();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__POST = eINSTANCE.getDocumentRoot_Post();

		/**
		 * The meta object literal for the '<em><b>Post Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__POST_CODE = eINSTANCE.getDocumentRoot_PostCode();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUEST = eINSTANCE.getDocumentRoot_Request();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE = eINSTANCE.getDocumentRoot_Service();

		/**
		 * The meta object literal for the '<em><b>State Or Province</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STATE_OR_PROVINCE = eINSTANCE.getDocumentRoot_StateOrProvince();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STYLE = eINSTANCE.getDocumentRoot_Style();

		/**
		 * The meta object literal for the '<em><b>Style Sheet URL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STYLE_SHEET_URL = eINSTANCE.getDocumentRoot_StyleSheetURL();

		/**
		 * The meta object literal for the '<em><b>Style URL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STYLE_URL = eINSTANCE.getDocumentRoot_StyleURL();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TITLE = eINSTANCE.getDocumentRoot_Title();

		/**
		 * The meta object literal for the '<em><b>WMS Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WMS_CAPABILITIES = eINSTANCE.getDocumentRoot_WMSCapabilities();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.ExceptionTypeImpl <em>Exception Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.ExceptionTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getExceptionType()
		 * @generated
		 */
		EClass EXCEPTION_TYPE = eINSTANCE.getExceptionType();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE__FORMAT = eINSTANCE.getExceptionType_Format();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.EXGeographicBoundingBoxTypeImpl <em>EX Geographic Bounding Box Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.EXGeographicBoundingBoxTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getEXGeographicBoundingBoxType()
		 * @generated
		 */
		EClass EX_GEOGRAPHIC_BOUNDING_BOX_TYPE = eINSTANCE.getEXGeographicBoundingBoxType();

		/**
		 * The meta object literal for the '<em><b>West Bound Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__WEST_BOUND_LONGITUDE = eINSTANCE.getEXGeographicBoundingBoxType_WestBoundLongitude();

		/**
		 * The meta object literal for the '<em><b>East Bound Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__EAST_BOUND_LONGITUDE = eINSTANCE.getEXGeographicBoundingBoxType_EastBoundLongitude();

		/**
		 * The meta object literal for the '<em><b>South Bound Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__SOUTH_BOUND_LATITUDE = eINSTANCE.getEXGeographicBoundingBoxType_SouthBoundLatitude();

		/**
		 * The meta object literal for the '<em><b>North Bound Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__NORTH_BOUND_LATITUDE = eINSTANCE.getEXGeographicBoundingBoxType_NorthBoundLatitude();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.FeatureListURLTypeImpl <em>Feature List URL Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.FeatureListURLTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getFeatureListURLType()
		 * @generated
		 */
		EClass FEATURE_LIST_URL_TYPE = eINSTANCE.getFeatureListURLType();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_LIST_URL_TYPE__FORMAT = eINSTANCE.getFeatureListURLType_Format();

		/**
		 * The meta object literal for the '<em><b>Online Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_LIST_URL_TYPE__ONLINE_RESOURCE = eINSTANCE.getFeatureListURLType_OnlineResource();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.GetTypeImpl <em>Get Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.GetTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getGetType()
		 * @generated
		 */
		EClass GET_TYPE = eINSTANCE.getGetType();

		/**
		 * The meta object literal for the '<em><b>Online Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_TYPE__ONLINE_RESOURCE = eINSTANCE.getGetType_OnlineResource();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.HTTPTypeImpl <em>HTTP Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.HTTPTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getHTTPType()
		 * @generated
		 */
		EClass HTTP_TYPE = eINSTANCE.getHTTPType();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_TYPE__GET = eINSTANCE.getHTTPType_Get();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_TYPE__POST = eINSTANCE.getHTTPType_Post();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.IdentifierTypeImpl <em>Identifier Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.IdentifierTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getIdentifierType()
		 * @generated
		 */
		EClass IDENTIFIER_TYPE = eINSTANCE.getIdentifierType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER_TYPE__VALUE = eINSTANCE.getIdentifierType_Value();

		/**
		 * The meta object literal for the '<em><b>Authority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER_TYPE__AUTHORITY = eINSTANCE.getIdentifierType_Authority();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.KeywordListTypeImpl <em>Keyword List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.KeywordListTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getKeywordListType()
		 * @generated
		 */
		EClass KEYWORD_LIST_TYPE = eINSTANCE.getKeywordListType();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEYWORD_LIST_TYPE__KEYWORD = eINSTANCE.getKeywordListType_Keyword();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.KeywordTypeImpl <em>Keyword Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.KeywordTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getKeywordType()
		 * @generated
		 */
		EClass KEYWORD_TYPE = eINSTANCE.getKeywordType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYWORD_TYPE__VALUE = eINSTANCE.getKeywordType_Value();

		/**
		 * The meta object literal for the '<em><b>Vocabulary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYWORD_TYPE__VOCABULARY = eINSTANCE.getKeywordType_Vocabulary();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.LayerTypeImpl <em>Layer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.LayerTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getLayerType()
		 * @generated
		 */
		EClass LAYER_TYPE = eINSTANCE.getLayerType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_TYPE__NAME = eINSTANCE.getLayerType_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_TYPE__TITLE = eINSTANCE.getLayerType_Title();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_TYPE__ABSTRACT = eINSTANCE.getLayerType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Keyword List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TYPE__KEYWORD_LIST = eINSTANCE.getLayerType_KeywordList();

		/**
		 * The meta object literal for the '<em><b>CRS</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_TYPE__CRS = eINSTANCE.getLayerType_CRS();

		/**
		 * The meta object literal for the '<em><b>EX Geographic Bounding Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TYPE__EX_GEOGRAPHIC_BOUNDING_BOX = eINSTANCE.getLayerType_EXGeographicBoundingBox();

		/**
		 * The meta object literal for the '<em><b>Bounding Box</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TYPE__BOUNDING_BOX = eINSTANCE.getLayerType_BoundingBox();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TYPE__DIMENSION = eINSTANCE.getLayerType_Dimension();

		/**
		 * The meta object literal for the '<em><b>Attribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TYPE__ATTRIBUTION = eINSTANCE.getLayerType_Attribution();

		/**
		 * The meta object literal for the '<em><b>Authority URL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TYPE__AUTHORITY_URL = eINSTANCE.getLayerType_AuthorityURL();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TYPE__IDENTIFIER = eINSTANCE.getLayerType_Identifier();

		/**
		 * The meta object literal for the '<em><b>Metadata URL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TYPE__METADATA_URL = eINSTANCE.getLayerType_MetadataURL();

		/**
		 * The meta object literal for the '<em><b>Data URL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TYPE__DATA_URL = eINSTANCE.getLayerType_DataURL();

		/**
		 * The meta object literal for the '<em><b>Feature List URL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TYPE__FEATURE_LIST_URL = eINSTANCE.getLayerType_FeatureListURL();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TYPE__STYLE = eINSTANCE.getLayerType_Style();

		/**
		 * The meta object literal for the '<em><b>Min Scale Denominator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_TYPE__MIN_SCALE_DENOMINATOR = eINSTANCE.getLayerType_MinScaleDenominator();

		/**
		 * The meta object literal for the '<em><b>Max Scale Denominator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_TYPE__MAX_SCALE_DENOMINATOR = eINSTANCE.getLayerType_MaxScaleDenominator();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TYPE__LAYER = eINSTANCE.getLayerType_Layer();

		/**
		 * The meta object literal for the '<em><b>Cascaded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_TYPE__CASCADED = eINSTANCE.getLayerType_Cascaded();

		/**
		 * The meta object literal for the '<em><b>Fixed Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_TYPE__FIXED_HEIGHT = eINSTANCE.getLayerType_FixedHeight();

		/**
		 * The meta object literal for the '<em><b>Fixed Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_TYPE__FIXED_WIDTH = eINSTANCE.getLayerType_FixedWidth();

		/**
		 * The meta object literal for the '<em><b>No Subsets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_TYPE__NO_SUBSETS = eINSTANCE.getLayerType_NoSubsets();

		/**
		 * The meta object literal for the '<em><b>Opaque</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_TYPE__OPAQUE = eINSTANCE.getLayerType_Opaque();

		/**
		 * The meta object literal for the '<em><b>Queryable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_TYPE__QUERYABLE = eINSTANCE.getLayerType_Queryable();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.LegendURLTypeImpl <em>Legend URL Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.LegendURLTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getLegendURLType()
		 * @generated
		 */
		EClass LEGEND_URL_TYPE = eINSTANCE.getLegendURLType();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGEND_URL_TYPE__FORMAT = eINSTANCE.getLegendURLType_Format();

		/**
		 * The meta object literal for the '<em><b>Online Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGEND_URL_TYPE__ONLINE_RESOURCE = eINSTANCE.getLegendURLType_OnlineResource();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGEND_URL_TYPE__HEIGHT = eINSTANCE.getLegendURLType_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGEND_URL_TYPE__WIDTH = eINSTANCE.getLegendURLType_Width();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.LogoURLTypeImpl <em>Logo URL Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.LogoURLTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getLogoURLType()
		 * @generated
		 */
		EClass LOGO_URL_TYPE = eINSTANCE.getLogoURLType();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGO_URL_TYPE__FORMAT = eINSTANCE.getLogoURLType_Format();

		/**
		 * The meta object literal for the '<em><b>Online Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGO_URL_TYPE__ONLINE_RESOURCE = eINSTANCE.getLogoURLType_OnlineResource();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGO_URL_TYPE__HEIGHT = eINSTANCE.getLogoURLType_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGO_URL_TYPE__WIDTH = eINSTANCE.getLogoURLType_Width();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.MetadataURLTypeImpl <em>Metadata URL Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.MetadataURLTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getMetadataURLType()
		 * @generated
		 */
		EClass METADATA_URL_TYPE = eINSTANCE.getMetadataURLType();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_URL_TYPE__FORMAT = eINSTANCE.getMetadataURLType_Format();

		/**
		 * The meta object literal for the '<em><b>Online Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_URL_TYPE__ONLINE_RESOURCE = eINSTANCE.getMetadataURLType_OnlineResource();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_URL_TYPE__TYPE = eINSTANCE.getMetadataURLType_Type();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.OnlineResourceTypeImpl <em>Online Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.OnlineResourceTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getOnlineResourceType()
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
		 * The meta object literal for the '{@link net.opengis.wms.impl.OperationTypeImpl <em>Operation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.OperationTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getOperationType()
		 * @generated
		 */
		EClass OPERATION_TYPE = eINSTANCE.getOperationType();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_TYPE__FORMAT = eINSTANCE.getOperationType_Format();

		/**
		 * The meta object literal for the '<em><b>DCP Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_TYPE__DCP_TYPE = eINSTANCE.getOperationType_DCPType();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.PostTypeImpl <em>Post Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.PostTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getPostType()
		 * @generated
		 */
		EClass POST_TYPE = eINSTANCE.getPostType();

		/**
		 * The meta object literal for the '<em><b>Online Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST_TYPE__ONLINE_RESOURCE = eINSTANCE.getPostType_OnlineResource();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.RequestTypeImpl <em>Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.RequestTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getRequestType()
		 * @generated
		 */
		EClass REQUEST_TYPE = eINSTANCE.getRequestType();

		/**
		 * The meta object literal for the '<em><b>Get Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_TYPE__GET_CAPABILITIES = eINSTANCE.getRequestType_GetCapabilities();

		/**
		 * The meta object literal for the '<em><b>Get Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_TYPE__GET_MAP = eINSTANCE.getRequestType_GetMap();

		/**
		 * The meta object literal for the '<em><b>Get Feature Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_TYPE__GET_FEATURE_INFO = eINSTANCE.getRequestType_GetFeatureInfo();

		/**
		 * The meta object literal for the '<em><b>Extended Operation Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_TYPE__EXTENDED_OPERATION_GROUP = eINSTANCE.getRequestType_ExtendedOperationGroup();

		/**
		 * The meta object literal for the '<em><b>Extended Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_TYPE__EXTENDED_OPERATION = eINSTANCE.getRequestType_ExtendedOperation();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.ServiceTypeImpl <em>Service Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.ServiceTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getServiceType()
		 * @generated
		 */
		EClass SERVICE_TYPE = eINSTANCE.getServiceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TYPE__NAME = eINSTANCE.getServiceType_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TYPE__TITLE = eINSTANCE.getServiceType_Title();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TYPE__ABSTRACT = eINSTANCE.getServiceType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Keyword List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TYPE__KEYWORD_LIST = eINSTANCE.getServiceType_KeywordList();

		/**
		 * The meta object literal for the '<em><b>Online Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TYPE__ONLINE_RESOURCE = eINSTANCE.getServiceType_OnlineResource();

		/**
		 * The meta object literal for the '<em><b>Contact Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TYPE__CONTACT_INFORMATION = eINSTANCE.getServiceType_ContactInformation();

		/**
		 * The meta object literal for the '<em><b>Fees</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TYPE__FEES = eINSTANCE.getServiceType_Fees();

		/**
		 * The meta object literal for the '<em><b>Access Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TYPE__ACCESS_CONSTRAINTS = eINSTANCE.getServiceType_AccessConstraints();

		/**
		 * The meta object literal for the '<em><b>Layer Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TYPE__LAYER_LIMIT = eINSTANCE.getServiceType_LayerLimit();

		/**
		 * The meta object literal for the '<em><b>Max Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TYPE__MAX_WIDTH = eINSTANCE.getServiceType_MaxWidth();

		/**
		 * The meta object literal for the '<em><b>Max Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TYPE__MAX_HEIGHT = eINSTANCE.getServiceType_MaxHeight();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.StyleSheetURLTypeImpl <em>Style Sheet URL Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.StyleSheetURLTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getStyleSheetURLType()
		 * @generated
		 */
		EClass STYLE_SHEET_URL_TYPE = eINSTANCE.getStyleSheetURLType();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_SHEET_URL_TYPE__FORMAT = eINSTANCE.getStyleSheetURLType_Format();

		/**
		 * The meta object literal for the '<em><b>Online Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_SHEET_URL_TYPE__ONLINE_RESOURCE = eINSTANCE.getStyleSheetURLType_OnlineResource();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.StyleTypeImpl <em>Style Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.StyleTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getStyleType()
		 * @generated
		 */
		EClass STYLE_TYPE = eINSTANCE.getStyleType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_TYPE__NAME = eINSTANCE.getStyleType_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_TYPE__TITLE = eINSTANCE.getStyleType_Title();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_TYPE__ABSTRACT = eINSTANCE.getStyleType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Legend URL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_TYPE__LEGEND_URL = eINSTANCE.getStyleType_LegendURL();

		/**
		 * The meta object literal for the '<em><b>Style Sheet URL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_TYPE__STYLE_SHEET_URL = eINSTANCE.getStyleType_StyleSheetURL();

		/**
		 * The meta object literal for the '<em><b>Style URL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_TYPE__STYLE_URL = eINSTANCE.getStyleType_StyleURL();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.StyleURLTypeImpl <em>Style URL Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.StyleURLTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getStyleURLType()
		 * @generated
		 */
		EClass STYLE_URL_TYPE = eINSTANCE.getStyleURLType();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_URL_TYPE__FORMAT = eINSTANCE.getStyleURLType_Format();

		/**
		 * The meta object literal for the '<em><b>Online Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_URL_TYPE__ONLINE_RESOURCE = eINSTANCE.getStyleURLType_OnlineResource();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.impl.WMSCapabilitiesTypeImpl <em>Capabilities Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.WMSCapabilitiesTypeImpl
		 * @see net.opengis.wms.impl.WMSPackageImpl#getWMSCapabilitiesType()
		 * @generated
		 */
		EClass WMS_CAPABILITIES_TYPE = eINSTANCE.getWMSCapabilitiesType();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WMS_CAPABILITIES_TYPE__SERVICE = eINSTANCE.getWMSCapabilitiesType_Service();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WMS_CAPABILITIES_TYPE__CAPABILITY = eINSTANCE.getWMSCapabilitiesType_Capability();

		/**
		 * The meta object literal for the '<em><b>Update Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WMS_CAPABILITIES_TYPE__UPDATE_SEQUENCE = eINSTANCE.getWMSCapabilitiesType_UpdateSequence();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WMS_CAPABILITIES_TYPE__VERSION = eINSTANCE.getWMSCapabilitiesType_Version();

		/**
		 * The meta object literal for the '{@link net.opengis.wms.NameType <em>Name Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.NameType
		 * @see net.opengis.wms.impl.WMSPackageImpl#getNameType()
		 * @generated
		 */
		EEnum NAME_TYPE = eINSTANCE.getNameType();

		/**
		 * The meta object literal for the '<em>Latitude Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.WMSPackageImpl#getLatitudeType()
		 * @generated
		 */
		EDataType LATITUDE_TYPE = eINSTANCE.getLatitudeType();

		/**
		 * The meta object literal for the '<em>Latitude Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see net.opengis.wms.impl.WMSPackageImpl#getLatitudeTypeObject()
		 * @generated
		 */
		EDataType LATITUDE_TYPE_OBJECT = eINSTANCE.getLatitudeTypeObject();

		/**
		 * The meta object literal for the '<em>Longitude Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.impl.WMSPackageImpl#getLongitudeType()
		 * @generated
		 */
		EDataType LONGITUDE_TYPE = eINSTANCE.getLongitudeType();

		/**
		 * The meta object literal for the '<em>Longitude Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see net.opengis.wms.impl.WMSPackageImpl#getLongitudeTypeObject()
		 * @generated
		 */
		EDataType LONGITUDE_TYPE_OBJECT = eINSTANCE.getLongitudeTypeObject();

		/**
		 * The meta object literal for the '<em>Name Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wms.NameType
		 * @see net.opengis.wms.impl.WMSPackageImpl#getNameTypeObject()
		 * @generated
		 */
		EDataType NAME_TYPE_OBJECT = eINSTANCE.getNameTypeObject();

	}

} //WMSPackage
