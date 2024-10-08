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
package net.opengis.wfs;


import net.opengis.fes.FESPackage;

import net.opengis.ows.OWSPackage;

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
 * This XML Schema Document includes and imports, 
 *       directly or indirectly, all the XML Schemas defined by the 
 *       Web Feature Service (WFS) Implementation Specification.
 * 
 *       WFS is an OGC Standard.
 *       Copyright (c) 2010, 2014 Open Geospatial Consortium.
 *       To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .     
 *       
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
 * 
 *          This XML Schema document includes and imports, directly or indirectly,
 *          all the XML Schema defined by the Filter Encoding Standard.
 * 
 *          Filter Encoding is an OGC Standard.
 *          Copyright (c) 2010, 2014 Open Geospatial Consortium.
 *          To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 *       
 * 
 *          Filter Encoding is an OGC Standard.
 *          Copyright (c) 2010, 2014 Open Geospatial Consortium.
 *          To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 *       
 * 
 *          Filter Encoding is an OGC Standard.
 *          Copyright (c) 2010, 2014 Open Geospatial Consortium.
 *          To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 *       
 * 
 *          Filter Encoding is an OGC Standard.
 *          Copyright (c) 2010, 2014 Open Geospatial Consortium.
 *          To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 *       
 * 
 *          Filter Encoding is an OGC Standard.
 *          Copyright (c) 2010, 2014 Open Geospatial Consortium.
 *          To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 *       
 * 
 *          This XML Schema defines OGC query filter capabilities documents.
 * 
 *          Filter Encoding is an OGC Standard.
 *          Copyright (c) 2010, 2014 Open Geospatial Consortium.
 *          To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 *       
 * This XML Schema Document includes and imports, directly and indirectly, all the XML Schemas defined by the OWS Common Implemetation Specification.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2006,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema Document encodes the GetResourceByID operation request message. This typical operation is specified as a base for profiling in specific OWS specifications. For information on the allowed changes and limitations in such profiling, see Subclause 9.4.1 of the OWS Common specification.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2006,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema Document encodes the Exception Report response to all OWS operations.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2006,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema Document encodes the allowed values (or domain) of a quantity, often for an input or output parameter to an OWS. Such a parameter is sometimes called a variable, quantity, literal, or typed literal. Such a parameter can use one of many data types, including double, integer, boolean, string, or URI. The allowed values can also be encoded for a quantity that is not explicit or not transferred, but is constrained by a server implementation.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2006,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema  Document encodes the typical Contents section of an OWS service metadata (Capabilities) document. This  Schema can be built upon to define the Contents section for a specific OWS. If the ContentsBaseType in this XML Schema cannot be restricted and extended to define the Contents section for a specific OWS, all other relevant parts defined in owsContents.xsd shall be used by the "ContentsType" in the wxsContents.xsd prepared for the specific OWS.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2006,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema Document specifies types and elements for input and output of operation data, allowing including multiple data items with each data item either included or referenced. The contents of each type and element specified here can be restricted and/or extended for each use in a specific OWS specification.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2006,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema Document specifies types and elements for document or resource references and for package manifests that contain multiple references. The contents of each type and element specified here can be restricted and/or extended for each use in a specific OWS specification.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2006,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema Document encodes the parts of the MD_DataIdentification class of ISO 19115 (OGC Abstract Specification Topic 11) which are expected to be used for most datasets. This Schema also encodes the parts of this class that are expected to be useful for other metadata. Both may be used within the Contents section of OWS service metadata (Capabilities) documents.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2006,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema Document encodes various parameters and parameter types that can be used in OWS operation requests and responses.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2006,2010 Open Geospatial Consortium.
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
 * This XML Schema Document defines the GetCapabilities operation request and response XML elements and types, which are common to all OWSs. This XML Schema shall be edited by each OWS, for example, to specify a specific value for the "service" attribute.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2006,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema Document encodes the common "ServiceIdentification" section of the GetCapabilities operation response, known as the Capabilities XML document. This section encodes the SV_ServiceIdentification class of ISO 19119 (OGC Abstract Specification Topic 12). 
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2006,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema Document encodes the common "ServiceProvider" section of the GetCapabilities operation response, known as the Capabilities XML document. This section encodes the SV_ServiceProvider class of ISO 19119 (OGC Abstract Specification Topic 12). 
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2006,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema Document encodes the basic contents of the "OperationsMetadata" section of the GetCapabilities operation response, also known as the Capabilities XML document.
 * 			
 * 			OWS is an OGC Standard.
 * 			Copyright (c) 2006,2010 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema Document encodes the parts of ISO 19115 used by the common "ServiceIdentification" and "ServiceProvider" sections of the GetCapabilities operation response, known as the service metadata XML document. The parts encoded here are the MD_Keywords, CI_ResponsibleParty, and related classes. The UML package prefixes were omitted from XML names, and the XML element names were all capitalized, for consistency with other OWS Schemas. This document also provides a simple coding of text in multiple languages, simplified from Annex J of ISO 19115.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2006,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * <!-- end-model-doc -->
 * @see net.opengis.wfs.WFSFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = WFSPackage.eNS_URI, genModel = "/model/wfs-2.0.genmodel", genModelSourceLocations = {"model/wfs-2.0.genmodel","net.opengis.wfs2.model/model/wfs-2.0.genmodel"}, ecore="/model/wfs-2.0.ecore", ecoreSourceLocations="/model/wfs-2.0.ecore")
public interface WFSPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wfs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/wfs/2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wfs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WFSPackage eINSTANCE = net.opengis.wfs.impl.WFSPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.AbstractTransactionActionTypeImpl <em>Abstract Transaction Action Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.AbstractTransactionActionTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getAbstractTransactionActionType()
	 * @generated
	 */
	int ABSTRACT_TRANSACTION_ACTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSACTION_ACTION_TYPE__HANDLE = 0;

	/**
	 * The number of structural features of the '<em>Abstract Transaction Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Transaction Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSACTION_ACTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.AbstractTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getAbstractType()
	 * @generated
	 */
	int ABSTRACT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE__LANG = 1;

	/**
	 * The number of structural features of the '<em>Abstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.ActionResultsTypeImpl <em>Action Results Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.ActionResultsTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getActionResultsType()
	 * @generated
	 */
	int ACTION_RESULTS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RESULTS_TYPE__FEATURE = 0;

	/**
	 * The number of structural features of the '<em>Action Results Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RESULTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action Results Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RESULTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.AdditionalObjectsTypeImpl <em>Additional Objects Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.AdditionalObjectsTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getAdditionalObjectsType()
	 * @generated
	 */
	int ADDITIONAL_OBJECTS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Value Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_OBJECTS_TYPE__VALUE_COLLECTION = 0;

	/**
	 * The feature id for the '<em><b>Simple Feature Collection Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_OBJECTS_TYPE__SIMPLE_FEATURE_COLLECTION_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Simple Feature Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_OBJECTS_TYPE__SIMPLE_FEATURE_COLLECTION = 2;

	/**
	 * The number of structural features of the '<em>Additional Objects Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_OBJECTS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Additional Objects Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_OBJECTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.AdditionalValuesTypeImpl <em>Additional Values Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.AdditionalValuesTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getAdditionalValuesType()
	 * @generated
	 */
	int ADDITIONAL_VALUES_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Value Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_VALUES_TYPE__VALUE_COLLECTION = 0;

	/**
	 * The feature id for the '<em><b>Simple Feature Collection Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_VALUES_TYPE__SIMPLE_FEATURE_COLLECTION_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Simple Feature Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_VALUES_TYPE__SIMPLE_FEATURE_COLLECTION = 2;

	/**
	 * The number of structural features of the '<em>Additional Values Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_VALUES_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Additional Values Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_VALUES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.BaseRequestTypeImpl <em>Base Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.BaseRequestTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getBaseRequestType()
	 * @generated
	 */
	int BASE_REQUEST_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_REQUEST_TYPE__HANDLE = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_REQUEST_TYPE__SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_REQUEST_TYPE__VERSION = 2;

	/**
	 * The number of structural features of the '<em>Base Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_REQUEST_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Base Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_REQUEST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.CreatedOrModifiedFeatureTypeImpl <em>Created Or Modified Feature Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.CreatedOrModifiedFeatureTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getCreatedOrModifiedFeatureType()
	 * @generated
	 */
	int CREATED_OR_MODIFIED_FEATURE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATED_OR_MODIFIED_FEATURE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Resource Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATED_OR_MODIFIED_FEATURE_TYPE__RESOURCE_ID = 1;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATED_OR_MODIFIED_FEATURE_TYPE__HANDLE = 2;

	/**
	 * The number of structural features of the '<em>Created Or Modified Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATED_OR_MODIFIED_FEATURE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Created Or Modified Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATED_OR_MODIFIED_FEATURE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.ExecutionStatusTypeImpl <em>Execution Status Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.ExecutionStatusTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getExecutionStatusType()
	 * @generated
	 */
	int EXECUTION_STATUS_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STATUS_TYPE__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Execution Status Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STATUS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Execution Status Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STATUS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.CreateStoredQueryResponseTypeImpl <em>Create Stored Query Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.CreateStoredQueryResponseTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getCreateStoredQueryResponseType()
	 * @generated
	 */
	int CREATE_STORED_QUERY_RESPONSE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_STORED_QUERY_RESPONSE_TYPE__STATUS = EXECUTION_STATUS_TYPE__STATUS;

	/**
	 * The number of structural features of the '<em>Create Stored Query Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_STORED_QUERY_RESPONSE_TYPE_FEATURE_COUNT = EXECUTION_STATUS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Stored Query Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_STORED_QUERY_RESPONSE_TYPE_OPERATION_COUNT = EXECUTION_STATUS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.CreateStoredQueryTypeImpl <em>Create Stored Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.CreateStoredQueryTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getCreateStoredQueryType()
	 * @generated
	 */
	int CREATE_STORED_QUERY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_STORED_QUERY_TYPE__HANDLE = BASE_REQUEST_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_STORED_QUERY_TYPE__SERVICE = BASE_REQUEST_TYPE__SERVICE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_STORED_QUERY_TYPE__VERSION = BASE_REQUEST_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Stored Query Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_STORED_QUERY_TYPE__STORED_QUERY_DEFINITION = BASE_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create Stored Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_STORED_QUERY_TYPE_FEATURE_COUNT = BASE_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Create Stored Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_STORED_QUERY_TYPE_OPERATION_COUNT = BASE_REQUEST_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.DeleteTypeImpl <em>Delete Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.DeleteTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getDeleteType()
	 * @generated
	 */
	int DELETE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TYPE__HANDLE = ABSTRACT_TRANSACTION_ACTION_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TYPE__FILTER = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TYPE__TYPE_NAME = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delete Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TYPE_FEATURE_COUNT = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Delete Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TYPE_OPERATION_COUNT = ABSTRACT_TRANSACTION_ACTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.DescribeFeatureTypeTypeImpl <em>Describe Feature Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.DescribeFeatureTypeTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getDescribeFeatureTypeType()
	 * @generated
	 */
	int DESCRIBE_FEATURE_TYPE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_FEATURE_TYPE_TYPE__HANDLE = BASE_REQUEST_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_FEATURE_TYPE_TYPE__SERVICE = BASE_REQUEST_TYPE__SERVICE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_FEATURE_TYPE_TYPE__VERSION = BASE_REQUEST_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_FEATURE_TYPE_TYPE__TYPE_NAME = BASE_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_FEATURE_TYPE_TYPE__OUTPUT_FORMAT = BASE_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Describe Feature Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_FEATURE_TYPE_TYPE_FEATURE_COUNT = BASE_REQUEST_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Describe Feature Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_FEATURE_TYPE_TYPE_OPERATION_COUNT = BASE_REQUEST_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.DescribeStoredQueriesResponseTypeImpl <em>Describe Stored Queries Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.DescribeStoredQueriesResponseTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getDescribeStoredQueriesResponseType()
	 * @generated
	 */
	int DESCRIBE_STORED_QUERIES_RESPONSE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Stored Query Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_STORED_QUERIES_RESPONSE_TYPE__STORED_QUERY_DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Describe Stored Queries Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_STORED_QUERIES_RESPONSE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Describe Stored Queries Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_STORED_QUERIES_RESPONSE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.DescribeStoredQueriesTypeImpl <em>Describe Stored Queries Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.DescribeStoredQueriesTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getDescribeStoredQueriesType()
	 * @generated
	 */
	int DESCRIBE_STORED_QUERIES_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_STORED_QUERIES_TYPE__HANDLE = BASE_REQUEST_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_STORED_QUERIES_TYPE__SERVICE = BASE_REQUEST_TYPE__SERVICE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_STORED_QUERIES_TYPE__VERSION = BASE_REQUEST_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Stored Query Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_STORED_QUERIES_TYPE__STORED_QUERY_ID = BASE_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Describe Stored Queries Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_STORED_QUERIES_TYPE_FEATURE_COUNT = BASE_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Describe Stored Queries Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_STORED_QUERIES_TYPE_OPERATION_COUNT = BASE_REQUEST_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.DocumentRootImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 13;

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
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT = 3;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_TRANSACTION_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Additional Objects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDITIONAL_OBJECTS = 5;

	/**
	 * The feature id for the '<em><b>Additional Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDITIONAL_VALUES = 6;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOUNDED_BY = 7;

	/**
	 * The feature id for the '<em><b>Create Stored Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREATE_STORED_QUERY = 8;

	/**
	 * The feature id for the '<em><b>Create Stored Query Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREATE_STORED_QUERY_RESPONSE = 9;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELETE = 10;

	/**
	 * The feature id for the '<em><b>Describe Feature Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIBE_FEATURE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Describe Stored Queries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIBE_STORED_QUERIES = 12;

	/**
	 * The feature id for the '<em><b>Describe Stored Queries Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIBE_STORED_QUERIES_RESPONSE = 13;

	/**
	 * The feature id for the '<em><b>Drop Stored Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DROP_STORED_QUERY = 14;

	/**
	 * The feature id for the '<em><b>Drop Stored Query Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DROP_STORED_QUERY_RESPONSE = 15;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Feature Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FEATURE_COLLECTION = 17;

	/**
	 * The feature id for the '<em><b>Simple Feature Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIMPLE_FEATURE_COLLECTION = 18;

	/**
	 * The feature id for the '<em><b>Feature Type List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FEATURE_TYPE_LIST = 19;

	/**
	 * The feature id for the '<em><b>Get Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CAPABILITIES = 20;

	/**
	 * The feature id for the '<em><b>Get Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_FEATURE = 21;

	/**
	 * The feature id for the '<em><b>Get Feature With Lock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_FEATURE_WITH_LOCK = 22;

	/**
	 * The feature id for the '<em><b>Get Property Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_PROPERTY_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INSERT = 24;

	/**
	 * The feature id for the '<em><b>List Stored Queries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_STORED_QUERIES = 25;

	/**
	 * The feature id for the '<em><b>List Stored Queries Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_STORED_QUERIES_RESPONSE = 26;

	/**
	 * The feature id for the '<em><b>Lock Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCK_FEATURE = 27;

	/**
	 * The feature id for the '<em><b>Lock Feature Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCK_FEATURE_RESPONSE = 28;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MEMBER = 29;

	/**
	 * The feature id for the '<em><b>Native</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NATIVE = 30;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY = 31;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_NAME = 32;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__QUERY = 33;

	/**
	 * The feature id for the '<em><b>Replace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REPLACE = 34;

	/**
	 * The feature id for the '<em><b>Stored Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STORED_QUERY = 35;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE = 36;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION = 37;

	/**
	 * The feature id for the '<em><b>Transaction Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION_RESPONSE = 38;

	/**
	 * The feature id for the '<em><b>Truncated Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRUNCATED_RESPONSE = 39;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TUPLE = 40;

	/**
	 * The feature id for the '<em><b>Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UPDATE = 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE = 42;

	/**
	 * The feature id for the '<em><b>Value Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE_COLLECTION = 43;

	/**
	 * The feature id for the '<em><b>Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE_LIST = 44;

	/**
	 * The feature id for the '<em><b>WFS Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WFS_CAPABILITIES = 45;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 46;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.DropStoredQueryTypeImpl <em>Drop Stored Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.DropStoredQueryTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getDropStoredQueryType()
	 * @generated
	 */
	int DROP_STORED_QUERY_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_STORED_QUERY_TYPE__HANDLE = BASE_REQUEST_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_STORED_QUERY_TYPE__SERVICE = BASE_REQUEST_TYPE__SERVICE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_STORED_QUERY_TYPE__VERSION = BASE_REQUEST_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_STORED_QUERY_TYPE__ID = BASE_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drop Stored Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_STORED_QUERY_TYPE_FEATURE_COUNT = BASE_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Drop Stored Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_STORED_QUERY_TYPE_OPERATION_COUNT = BASE_REQUEST_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.ElementTypeImpl <em>Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.ElementTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__METADATA = 0;

	/**
	 * The feature id for the '<em><b>Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__VALUE_LIST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.EmptyTypeImpl <em>Empty Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.EmptyTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getEmptyType()
	 * @generated
	 */
	int EMPTY_TYPE = 16;

	/**
	 * The number of structural features of the '<em>Empty Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Empty Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.EnvelopePropertyTypeImpl <em>Envelope Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.EnvelopePropertyTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getEnvelopePropertyType()
	 * @generated
	 */
	int ENVELOPE_PROPERTY_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVELOPE_PROPERTY_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Envelope Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVELOPE_PROPERTY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Envelope Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVELOPE_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.ExtendedDescriptionTypeImpl <em>Extended Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.ExtendedDescriptionTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getExtendedDescriptionType()
	 * @generated
	 */
	int EXTENDED_DESCRIPTION_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DESCRIPTION_TYPE__ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Extended Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DESCRIPTION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Extended Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DESCRIPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.SimpleFeatureCollectionTypeImpl <em>Simple Feature Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.SimpleFeatureCollectionTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getSimpleFeatureCollectionType()
	 * @generated
	 */
	int SIMPLE_FEATURE_COLLECTION_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_COLLECTION_TYPE__BOUNDED_BY = 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_COLLECTION_TYPE__MEMBER = 1;

	/**
	 * The number of structural features of the '<em>Simple Feature Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_COLLECTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Simple Feature Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_COLLECTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.FeatureCollectionTypeImpl <em>Feature Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.FeatureCollectionTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getFeatureCollectionType()
	 * @generated
	 */
	int FEATURE_COLLECTION_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__BOUNDED_BY = SIMPLE_FEATURE_COLLECTION_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__MEMBER = SIMPLE_FEATURE_COLLECTION_TYPE__MEMBER;

	/**
	 * The feature id for the '<em><b>Additional Objects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__ADDITIONAL_OBJECTS = SIMPLE_FEATURE_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Truncated Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__TRUNCATED_RESPONSE = SIMPLE_FEATURE_COLLECTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lock Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__LOCK_ID = SIMPLE_FEATURE_COLLECTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__NEXT = SIMPLE_FEATURE_COLLECTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Number Matched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__NUMBER_MATCHED = SIMPLE_FEATURE_COLLECTION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Number Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__NUMBER_RETURNED = SIMPLE_FEATURE_COLLECTION_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__PREVIOUS = SIMPLE_FEATURE_COLLECTION_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__TIME_STAMP = SIMPLE_FEATURE_COLLECTION_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Feature Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE_FEATURE_COUNT = SIMPLE_FEATURE_COLLECTION_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Feature Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE_OPERATION_COUNT = SIMPLE_FEATURE_COLLECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.FeaturesLockedTypeImpl <em>Features Locked Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.FeaturesLockedTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getFeaturesLockedType()
	 * @generated
	 */
	int FEATURES_LOCKED_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_LOCKED_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Resource Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_LOCKED_TYPE__RESOURCE_ID = 1;

	/**
	 * The number of structural features of the '<em>Features Locked Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_LOCKED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Features Locked Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_LOCKED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.FeaturesNotLockedTypeImpl <em>Features Not Locked Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.FeaturesNotLockedTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getFeaturesNotLockedType()
	 * @generated
	 */
	int FEATURES_NOT_LOCKED_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_NOT_LOCKED_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Resource Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_NOT_LOCKED_TYPE__RESOURCE_ID = 1;

	/**
	 * The number of structural features of the '<em>Features Not Locked Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_NOT_LOCKED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Features Not Locked Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_NOT_LOCKED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.FeatureTypeListTypeImpl <em>Feature Type List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.FeatureTypeListTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getFeatureTypeListType()
	 * @generated
	 */
	int FEATURE_TYPE_LIST_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Feature Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_LIST_TYPE__FEATURE_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Feature Type List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Feature Type List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.FeatureTypeTypeImpl <em>Feature Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.FeatureTypeTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getFeatureTypeType()
	 * @generated
	 */
	int FEATURE_TYPE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__KEYWORDS = 3;

	/**
	 * The feature id for the '<em><b>Default CRS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__DEFAULT_CRS = 4;

	/**
	 * The feature id for the '<em><b>Other CRS</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__OTHER_CRS = 5;

	/**
	 * The feature id for the '<em><b>No CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__NO_CRS = 6;

	/**
	 * The feature id for the '<em><b>Output Formats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__OUTPUT_FORMATS = 7;

	/**
	 * The feature id for the '<em><b>WGS84 Bounding Box</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__WGS84_BOUNDING_BOX = 8;

	/**
	 * The feature id for the '<em><b>Metadata URL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__METADATA_URL = 9;

	/**
	 * The feature id for the '<em><b>Extended Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__EXTENDED_DESCRIPTION = 10;

	/**
	 * The number of structural features of the '<em>Feature Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Feature Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.GetCapabilitiesTypeImpl <em>Get Capabilities Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.GetCapabilitiesTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getGetCapabilitiesType()
	 * @generated
	 */
	int GET_CAPABILITIES_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Accept Versions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE__ACCEPT_VERSIONS = OWSPackage.GET_CAPABILITIES_TYPE__ACCEPT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE__SECTIONS = OWSPackage.GET_CAPABILITIES_TYPE__SECTIONS;

	/**
	 * The feature id for the '<em><b>Accept Formats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE__ACCEPT_FORMATS = OWSPackage.GET_CAPABILITIES_TYPE__ACCEPT_FORMATS;

	/**
	 * The feature id for the '<em><b>Update Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE__UPDATE_SEQUENCE = OWSPackage.GET_CAPABILITIES_TYPE__UPDATE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE__SERVICE = OWSPackage.GET_CAPABILITIES_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE_FEATURE_COUNT = OWSPackage.GET_CAPABILITIES_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Get Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE_OPERATION_COUNT = OWSPackage.GET_CAPABILITIES_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.GetFeatureTypeImpl <em>Get Feature Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.GetFeatureTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getGetFeatureType()
	 * @generated
	 */
	int GET_FEATURE_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE__HANDLE = BASE_REQUEST_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE__SERVICE = BASE_REQUEST_TYPE__SERVICE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE__VERSION = BASE_REQUEST_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Abstract Query Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION_GROUP = BASE_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Query Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION = BASE_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE__COUNT = BASE_REQUEST_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE__OUTPUT_FORMAT = BASE_REQUEST_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resolve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE__RESOLVE = BASE_REQUEST_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resolve Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE__RESOLVE_DEPTH = BASE_REQUEST_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resolve Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE__RESOLVE_TIMEOUT = BASE_REQUEST_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE__RESULT_TYPE = BASE_REQUEST_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Start Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE__START_INDEX = BASE_REQUEST_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Get Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE_FEATURE_COUNT = BASE_REQUEST_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Get Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE_OPERATION_COUNT = BASE_REQUEST_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.GetFeatureWithLockTypeImpl <em>Get Feature With Lock Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.GetFeatureWithLockTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getGetFeatureWithLockType()
	 * @generated
	 */
	int GET_FEATURE_WITH_LOCK_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__HANDLE = GET_FEATURE_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__SERVICE = GET_FEATURE_TYPE__SERVICE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__VERSION = GET_FEATURE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Abstract Query Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__ABSTRACT_QUERY_EXPRESSION_GROUP = GET_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Query Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__ABSTRACT_QUERY_EXPRESSION = GET_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__COUNT = GET_FEATURE_TYPE__COUNT;

	/**
	 * The feature id for the '<em><b>Output Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__OUTPUT_FORMAT = GET_FEATURE_TYPE__OUTPUT_FORMAT;

	/**
	 * The feature id for the '<em><b>Resolve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__RESOLVE = GET_FEATURE_TYPE__RESOLVE;

	/**
	 * The feature id for the '<em><b>Resolve Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__RESOLVE_DEPTH = GET_FEATURE_TYPE__RESOLVE_DEPTH;

	/**
	 * The feature id for the '<em><b>Resolve Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__RESOLVE_TIMEOUT = GET_FEATURE_TYPE__RESOLVE_TIMEOUT;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__RESULT_TYPE = GET_FEATURE_TYPE__RESULT_TYPE;

	/**
	 * The feature id for the '<em><b>Start Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__START_INDEX = GET_FEATURE_TYPE__START_INDEX;

	/**
	 * The feature id for the '<em><b>Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__EXPIRY = GET_FEATURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lock Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__LOCK_ACTION = GET_FEATURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Get Feature With Lock Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE_FEATURE_COUNT = GET_FEATURE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Get Feature With Lock Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE_OPERATION_COUNT = GET_FEATURE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.GetPropertyValueTypeImpl <em>Get Property Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.GetPropertyValueTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getGetPropertyValueType()
	 * @generated
	 */
	int GET_PROPERTY_VALUE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_VALUE_TYPE__HANDLE = BASE_REQUEST_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_VALUE_TYPE__SERVICE = BASE_REQUEST_TYPE__SERVICE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_VALUE_TYPE__VERSION = BASE_REQUEST_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Abstract Query Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_VALUE_TYPE__ABSTRACT_QUERY_EXPRESSION_GROUP = BASE_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Query Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_VALUE_TYPE__ABSTRACT_QUERY_EXPRESSION = BASE_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_VALUE_TYPE__COUNT = BASE_REQUEST_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_VALUE_TYPE__OUTPUT_FORMAT = BASE_REQUEST_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resolve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_VALUE_TYPE__RESOLVE = BASE_REQUEST_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resolve Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_VALUE_TYPE__RESOLVE_DEPTH = BASE_REQUEST_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resolve Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_VALUE_TYPE__RESOLVE_PATH = BASE_REQUEST_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Resolve Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_VALUE_TYPE__RESOLVE_TIMEOUT = BASE_REQUEST_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_VALUE_TYPE__RESULT_TYPE = BASE_REQUEST_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Start Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_VALUE_TYPE__START_INDEX = BASE_REQUEST_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Value Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_VALUE_TYPE__VALUE_REFERENCE = BASE_REQUEST_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Get Property Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_VALUE_TYPE_FEATURE_COUNT = BASE_REQUEST_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Get Property Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_VALUE_TYPE_OPERATION_COUNT = BASE_REQUEST_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.InsertTypeImpl <em>Insert Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.InsertTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getInsertType()
	 * @generated
	 */
	int INSERT_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_TYPE__HANDLE = ABSTRACT_TRANSACTION_ACTION_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_TYPE__ANY = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_TYPE__INPUT_FORMAT = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Srs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_TYPE__SRS_NAME = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Insert Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_TYPE_FEATURE_COUNT = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Insert Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_TYPE_OPERATION_COUNT = ABSTRACT_TRANSACTION_ACTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.ListStoredQueriesResponseTypeImpl <em>List Stored Queries Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.ListStoredQueriesResponseTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getListStoredQueriesResponseType()
	 * @generated
	 */
	int LIST_STORED_QUERIES_RESPONSE_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Stored Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STORED_QUERIES_RESPONSE_TYPE__STORED_QUERY = 0;

	/**
	 * The number of structural features of the '<em>List Stored Queries Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STORED_QUERIES_RESPONSE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List Stored Queries Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STORED_QUERIES_RESPONSE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.ListStoredQueriesTypeImpl <em>List Stored Queries Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.ListStoredQueriesTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getListStoredQueriesType()
	 * @generated
	 */
	int LIST_STORED_QUERIES_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STORED_QUERIES_TYPE__HANDLE = BASE_REQUEST_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STORED_QUERIES_TYPE__SERVICE = BASE_REQUEST_TYPE__SERVICE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STORED_QUERIES_TYPE__VERSION = BASE_REQUEST_TYPE__VERSION;

	/**
	 * The number of structural features of the '<em>List Stored Queries Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STORED_QUERIES_TYPE_FEATURE_COUNT = BASE_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List Stored Queries Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STORED_QUERIES_TYPE_OPERATION_COUNT = BASE_REQUEST_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.LockFeatureResponseTypeImpl <em>Lock Feature Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.LockFeatureResponseTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getLockFeatureResponseType()
	 * @generated
	 */
	int LOCK_FEATURE_RESPONSE_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Features Locked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_RESPONSE_TYPE__FEATURES_LOCKED = 0;

	/**
	 * The feature id for the '<em><b>Features Not Locked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_RESPONSE_TYPE__FEATURES_NOT_LOCKED = 1;

	/**
	 * The feature id for the '<em><b>Lock Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_RESPONSE_TYPE__LOCK_ID = 2;

	/**
	 * The number of structural features of the '<em>Lock Feature Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_RESPONSE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Lock Feature Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_RESPONSE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.LockFeatureTypeImpl <em>Lock Feature Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.LockFeatureTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getLockFeatureType()
	 * @generated
	 */
	int LOCK_FEATURE_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_TYPE__HANDLE = BASE_REQUEST_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_TYPE__SERVICE = BASE_REQUEST_TYPE__SERVICE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_TYPE__VERSION = BASE_REQUEST_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Abstract Query Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION_GROUP = BASE_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Query Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION = BASE_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_TYPE__EXPIRY = BASE_REQUEST_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lock Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_TYPE__LOCK_ACTION = BASE_REQUEST_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lock Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_TYPE__LOCK_ID = BASE_REQUEST_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Lock Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_TYPE_FEATURE_COUNT = BASE_REQUEST_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Lock Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_TYPE_OPERATION_COUNT = BASE_REQUEST_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.MemberPropertyTypeImpl <em>Member Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.MemberPropertyTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getMemberPropertyType()
	 * @generated
	 */
	int MEMBER_PROPERTY_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_PROPERTY_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_PROPERTY_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_PROPERTY_TYPE__TUPLE = 2;

	/**
	 * The feature id for the '<em><b>Simple Feature Collection Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_PROPERTY_TYPE__SIMPLE_FEATURE_COLLECTION_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Simple Feature Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_PROPERTY_TYPE__SIMPLE_FEATURE_COLLECTION = 4;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_PROPERTY_TYPE__ACTUATE = 5;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_PROPERTY_TYPE__ARCROLE = 6;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_PROPERTY_TYPE__HREF = 7;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_PROPERTY_TYPE__ROLE = 8;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_PROPERTY_TYPE__SHOW = 9;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_PROPERTY_TYPE__STATE = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_PROPERTY_TYPE__TITLE = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_PROPERTY_TYPE__TYPE = 12;

	/**
	 * The number of structural features of the '<em>Member Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_PROPERTY_TYPE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Member Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.MetadataURLTypeImpl <em>Metadata URL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.MetadataURLTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getMetadataURLType()
	 * @generated
	 */
	int METADATA_URL_TYPE = 35;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_URL_TYPE__ABOUT = 0;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_URL_TYPE__ACTUATE = 1;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_URL_TYPE__ARCROLE = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_URL_TYPE__HREF = 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_URL_TYPE__ROLE = 4;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_URL_TYPE__SHOW = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_URL_TYPE__TITLE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_URL_TYPE__TYPE = 7;

	/**
	 * The number of structural features of the '<em>Metadata URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_URL_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Metadata URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_URL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.NativeTypeImpl <em>Native Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.NativeTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getNativeType()
	 * @generated
	 */
	int NATIVE_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__HANDLE = ABSTRACT_TRANSACTION_ACTION_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__MIXED = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__ANY = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Safe To Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__SAFE_TO_IGNORE = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vendor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__VENDOR_ID = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Native Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE_FEATURE_COUNT = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Native Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE_OPERATION_COUNT = ABSTRACT_TRANSACTION_ACTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.NoCRSTypeImpl <em>No CRS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.NoCRSTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getNoCRSType()
	 * @generated
	 */
	int NO_CRS_TYPE = 37;

	/**
	 * The number of structural features of the '<em>No CRS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CRS_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>No CRS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CRS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.OutputFormatListTypeImpl <em>Output Format List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.OutputFormatListTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getOutputFormatListType()
	 * @generated
	 */
	int OUTPUT_FORMAT_LIST_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FORMAT_LIST_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FORMAT_LIST_TYPE__FORMAT = 1;

	/**
	 * The number of structural features of the '<em>Output Format List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FORMAT_LIST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Output Format List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FORMAT_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.ParameterExpressionTypeImpl <em>Parameter Expression Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.ParameterExpressionTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getParameterExpressionType()
	 * @generated
	 */
	int PARAMETER_EXPRESSION_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXPRESSION_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXPRESSION_TYPE__ABSTRACT = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXPRESSION_TYPE__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXPRESSION_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXPRESSION_TYPE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Parameter Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXPRESSION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Parameter Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXPRESSION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.ParameterTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.PropertyNameTypeImpl <em>Property Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.PropertyNameTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getPropertyNameType()
	 * @generated
	 */
	int PROPERTY_NAME_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NAME_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Resolve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NAME_TYPE__RESOLVE = 1;

	/**
	 * The feature id for the '<em><b>Resolve Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NAME_TYPE__RESOLVE_DEPTH = 2;

	/**
	 * The feature id for the '<em><b>Resolve Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NAME_TYPE__RESOLVE_PATH = 3;

	/**
	 * The feature id for the '<em><b>Resolve Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NAME_TYPE__RESOLVE_TIMEOUT = 4;

	/**
	 * The number of structural features of the '<em>Property Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NAME_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Property Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.PropertyTypeImpl <em>Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.PropertyTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Value Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.QueryExpressionTextTypeImpl <em>Query Expression Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.QueryExpressionTextTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getQueryExpressionTextType()
	 * @generated
	 */
	int QUERY_EXPRESSION_TEXT_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION_TEXT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION_TEXT_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION_TEXT_TYPE__ANY1 = 2;

	/**
	 * The feature id for the '<em><b>Is Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION_TEXT_TYPE__IS_PRIVATE = 3;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION_TEXT_TYPE__LANGUAGE = 4;

	/**
	 * The feature id for the '<em><b>Return Feature Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION_TEXT_TYPE__RETURN_FEATURE_TYPES = 5;

	/**
	 * The number of structural features of the '<em>Query Expression Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION_TEXT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Query Expression Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION_TEXT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.QueryTypeImpl <em>Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.QueryTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getQueryType()
	 * @generated
	 */
	int QUERY_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__HANDLE = FESPackage.ABSTRACT_ADHOC_QUERY_EXPRESSION_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Abstract Projection Clause Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__ABSTRACT_PROJECTION_CLAUSE_GROUP = FESPackage.ABSTRACT_ADHOC_QUERY_EXPRESSION_TYPE__ABSTRACT_PROJECTION_CLAUSE_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Projection Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__ABSTRACT_PROJECTION_CLAUSE = FESPackage.ABSTRACT_ADHOC_QUERY_EXPRESSION_TYPE__ABSTRACT_PROJECTION_CLAUSE;

	/**
	 * The feature id for the '<em><b>Abstract Selection Clause Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__ABSTRACT_SELECTION_CLAUSE_GROUP = FESPackage.ABSTRACT_ADHOC_QUERY_EXPRESSION_TYPE__ABSTRACT_SELECTION_CLAUSE_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Selection Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__ABSTRACT_SELECTION_CLAUSE = FESPackage.ABSTRACT_ADHOC_QUERY_EXPRESSION_TYPE__ABSTRACT_SELECTION_CLAUSE;

	/**
	 * The feature id for the '<em><b>Abstract Sorting Clause Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__ABSTRACT_SORTING_CLAUSE_GROUP = FESPackage.ABSTRACT_ADHOC_QUERY_EXPRESSION_TYPE__ABSTRACT_SORTING_CLAUSE_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sorting Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__ABSTRACT_SORTING_CLAUSE = FESPackage.ABSTRACT_ADHOC_QUERY_EXPRESSION_TYPE__ABSTRACT_SORTING_CLAUSE;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__ALIASES = FESPackage.ABSTRACT_ADHOC_QUERY_EXPRESSION_TYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Type Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__TYPE_NAMES = FESPackage.ABSTRACT_ADHOC_QUERY_EXPRESSION_TYPE__TYPE_NAMES;

	/**
	 * The feature id for the '<em><b>Feature Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__FEATURE_VERSION = FESPackage.ABSTRACT_ADHOC_QUERY_EXPRESSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Srs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__SRS_NAME = FESPackage.ABSTRACT_ADHOC_QUERY_EXPRESSION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE_FEATURE_COUNT = FESPackage.ABSTRACT_ADHOC_QUERY_EXPRESSION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE_OPERATION_COUNT = FESPackage.ABSTRACT_ADHOC_QUERY_EXPRESSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.ReplaceTypeImpl <em>Replace Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.ReplaceTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getReplaceType()
	 * @generated
	 */
	int REPLACE_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_TYPE__HANDLE = ABSTRACT_TRANSACTION_ACTION_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_TYPE__ANY = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_TYPE__FILTER = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_TYPE__INPUT_FORMAT = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Srs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_TYPE__SRS_NAME = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Replace Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_TYPE_FEATURE_COUNT = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Replace Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_TYPE_OPERATION_COUNT = ABSTRACT_TRANSACTION_ACTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.StoredQueryDescriptionTypeImpl <em>Stored Query Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.StoredQueryDescriptionTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getStoredQueryDescriptionType()
	 * @generated
	 */
	int STORED_QUERY_DESCRIPTION_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_QUERY_DESCRIPTION_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_QUERY_DESCRIPTION_TYPE__ABSTRACT = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_QUERY_DESCRIPTION_TYPE__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_QUERY_DESCRIPTION_TYPE__PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Query Expression Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_QUERY_DESCRIPTION_TYPE__QUERY_EXPRESSION_TEXT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_QUERY_DESCRIPTION_TYPE__ID = 5;

	/**
	 * The number of structural features of the '<em>Stored Query Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_QUERY_DESCRIPTION_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Stored Query Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_QUERY_DESCRIPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.StoredQueryListItemTypeImpl <em>Stored Query List Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.StoredQueryListItemTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getStoredQueryListItemType()
	 * @generated
	 */
	int STORED_QUERY_LIST_ITEM_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_QUERY_LIST_ITEM_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Return Feature Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_QUERY_LIST_ITEM_TYPE__RETURN_FEATURE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_QUERY_LIST_ITEM_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Stored Query List Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_QUERY_LIST_ITEM_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Stored Query List Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_QUERY_LIST_ITEM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.StoredQueryTypeImpl <em>Stored Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.StoredQueryTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getStoredQueryType()
	 * @generated
	 */
	int STORED_QUERY_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_QUERY_TYPE__HANDLE = FESPackage.ABSTRACT_QUERY_EXPRESSION_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_QUERY_TYPE__PARAMETER = FESPackage.ABSTRACT_QUERY_EXPRESSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_QUERY_TYPE__ID = FESPackage.ABSTRACT_QUERY_EXPRESSION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stored Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_QUERY_TYPE_FEATURE_COUNT = FESPackage.ABSTRACT_QUERY_EXPRESSION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stored Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_QUERY_TYPE_OPERATION_COUNT = FESPackage.ABSTRACT_QUERY_EXPRESSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.TitleTypeImpl <em>Title Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.TitleTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getTitleType()
	 * @generated
	 */
	int TITLE_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__LANG = 1;

	/**
	 * The number of structural features of the '<em>Title Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Title Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.TransactionResponseTypeImpl <em>Transaction Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.TransactionResponseTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getTransactionResponseType()
	 * @generated
	 */
	int TRANSACTION_RESPONSE_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Transaction Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESPONSE_TYPE__TRANSACTION_SUMMARY = 0;

	/**
	 * The feature id for the '<em><b>Insert Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESPONSE_TYPE__INSERT_RESULTS = 1;

	/**
	 * The feature id for the '<em><b>Update Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESPONSE_TYPE__UPDATE_RESULTS = 2;

	/**
	 * The feature id for the '<em><b>Replace Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESPONSE_TYPE__REPLACE_RESULTS = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESPONSE_TYPE__VERSION = 4;

	/**
	 * The number of structural features of the '<em>Transaction Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESPONSE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transaction Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESPONSE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.TransactionSummaryTypeImpl <em>Transaction Summary Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.TransactionSummaryTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getTransactionSummaryType()
	 * @generated
	 */
	int TRANSACTION_SUMMARY_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Total Inserted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_SUMMARY_TYPE__TOTAL_INSERTED = 0;

	/**
	 * The feature id for the '<em><b>Total Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_SUMMARY_TYPE__TOTAL_UPDATED = 1;

	/**
	 * The feature id for the '<em><b>Total Replaced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_SUMMARY_TYPE__TOTAL_REPLACED = 2;

	/**
	 * The feature id for the '<em><b>Total Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_SUMMARY_TYPE__TOTAL_DELETED = 3;

	/**
	 * The number of structural features of the '<em>Transaction Summary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_SUMMARY_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Transaction Summary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_SUMMARY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.TransactionTypeImpl <em>Transaction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.TransactionTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getTransactionType()
	 * @generated
	 */
	int TRANSACTION_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__HANDLE = BASE_REQUEST_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__SERVICE = BASE_REQUEST_TYPE__SERVICE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__VERSION = BASE_REQUEST_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__GROUP = BASE_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Action Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__ABSTRACT_TRANSACTION_ACTION_GROUP = BASE_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__ABSTRACT_TRANSACTION_ACTION = BASE_REQUEST_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lock Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__LOCK_ID = BASE_REQUEST_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Release Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__RELEASE_ACTION = BASE_REQUEST_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Srs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__SRS_NAME = BASE_REQUEST_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Transaction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE_FEATURE_COUNT = BASE_REQUEST_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Transaction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE_OPERATION_COUNT = BASE_REQUEST_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.TruncatedResponseTypeImpl <em>Truncated Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.TruncatedResponseTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getTruncatedResponseType()
	 * @generated
	 */
	int TRUNCATED_RESPONSE_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Exception Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATED_RESPONSE_TYPE__EXCEPTION_REPORT = 0;

	/**
	 * The number of structural features of the '<em>Truncated Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATED_RESPONSE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Truncated Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATED_RESPONSE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.TupleTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getTupleType()
	 * @generated
	 */
	int TUPLE_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__MEMBER = 0;

	/**
	 * The number of structural features of the '<em>Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.UpdateTypeImpl <em>Update Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.UpdateTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getUpdateType()
	 * @generated
	 */
	int UPDATE_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__HANDLE = ABSTRACT_TRANSACTION_ACTION_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__PROPERTY = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__FILTER = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__INPUT_FORMAT = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Srs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__SRS_NAME = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__TYPE_NAME = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Update Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE_FEATURE_COUNT = ABSTRACT_TRANSACTION_ACTION_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Update Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE_OPERATION_COUNT = ABSTRACT_TRANSACTION_ACTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.ValueCollectionTypeImpl <em>Value Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.ValueCollectionTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getValueCollectionType()
	 * @generated
	 */
	int VALUE_COLLECTION_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COLLECTION_TYPE__MEMBER = 0;

	/**
	 * The feature id for the '<em><b>Additional Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COLLECTION_TYPE__ADDITIONAL_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Truncated Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COLLECTION_TYPE__TRUNCATED_RESPONSE = 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COLLECTION_TYPE__NEXT = 3;

	/**
	 * The feature id for the '<em><b>Number Matched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COLLECTION_TYPE__NUMBER_MATCHED = 4;

	/**
	 * The feature id for the '<em><b>Number Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COLLECTION_TYPE__NUMBER_RETURNED = 5;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COLLECTION_TYPE__PREVIOUS = 6;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COLLECTION_TYPE__TIME_STAMP = 7;

	/**
	 * The number of structural features of the '<em>Value Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COLLECTION_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Value Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COLLECTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.ValueListTypeImpl <em>Value List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.ValueListTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getValueListType()
	 * @generated
	 */
	int VALUE_LIST_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Value List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Value List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.ValueReferenceTypeImpl <em>Value Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.ValueReferenceTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getValueReferenceType()
	 * @generated
	 */
	int VALUE_REFERENCE_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_REFERENCE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_REFERENCE_TYPE__ACTION = 1;

	/**
	 * The number of structural features of the '<em>Value Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_REFERENCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Value Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_REFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.WFSCapabilitiesTypeImpl <em>Capabilities Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.WFSCapabilitiesTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getWFSCapabilitiesType()
	 * @generated
	 */
	int WFS_CAPABILITIES_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Service Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_CAPABILITIES_TYPE__SERVICE_IDENTIFICATION = OWSPackage.CAPABILITIES_BASE_TYPE__SERVICE_IDENTIFICATION;

	/**
	 * The feature id for the '<em><b>Service Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_CAPABILITIES_TYPE__SERVICE_PROVIDER = OWSPackage.CAPABILITIES_BASE_TYPE__SERVICE_PROVIDER;

	/**
	 * The feature id for the '<em><b>Operations Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_CAPABILITIES_TYPE__OPERATIONS_METADATA = OWSPackage.CAPABILITIES_BASE_TYPE__OPERATIONS_METADATA;

	/**
	 * The feature id for the '<em><b>Update Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_CAPABILITIES_TYPE__UPDATE_SEQUENCE = OWSPackage.CAPABILITIES_BASE_TYPE__UPDATE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_CAPABILITIES_TYPE__VERSION = OWSPackage.CAPABILITIES_BASE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>WSDL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_CAPABILITIES_TYPE__WSDL = OWSPackage.CAPABILITIES_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Type List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_CAPABILITIES_TYPE__FEATURE_TYPE_LIST = OWSPackage.CAPABILITIES_BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_CAPABILITIES_TYPE__FILTER_CAPABILITIES = OWSPackage.CAPABILITIES_BASE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_CAPABILITIES_TYPE_FEATURE_COUNT = OWSPackage.CAPABILITIES_BASE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_CAPABILITIES_TYPE_OPERATION_COUNT = OWSPackage.CAPABILITIES_BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.WSDLTypeImpl <em>WSDL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.WSDLTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getWSDLType()
	 * @generated
	 */
	int WSDL_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_TYPE__ACTUATE = 0;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_TYPE__ARCROLE = 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_TYPE__HREF = 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_TYPE__ROLE = 3;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_TYPE__SHOW = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_TYPE__TITLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_TYPE__TYPE = 6;

	/**
	 * The number of structural features of the '<em>WSDL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>WSDL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.AllSomeType <em>All Some Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.AllSomeType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getAllSomeType()
	 * @generated
	 */
	int ALL_SOME_TYPE = 62;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.NonNegativeIntegerOrUnknownMember0 <em>Non Negative Integer Or Unknown Member0</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.NonNegativeIntegerOrUnknownMember0
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getNonNegativeIntegerOrUnknownMember0()
	 * @generated
	 */
	int NON_NEGATIVE_INTEGER_OR_UNKNOWN_MEMBER0 = 63;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.ResolveValueType <em>Resolve Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.ResolveValueType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getResolveValueType()
	 * @generated
	 */
	int RESOLVE_VALUE_TYPE = 64;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.ResultTypeType <em>Result Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.ResultTypeType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getResultTypeType()
	 * @generated
	 */
	int RESULT_TYPE_TYPE = 65;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.StarStringType <em>Star String Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.StarStringType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getStarStringType()
	 * @generated
	 */
	int STAR_STRING_TYPE = 66;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.StateValueTypeMember0 <em>State Value Type Member0</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.StateValueTypeMember0
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getStateValueTypeMember0()
	 * @generated
	 */
	int STATE_VALUE_TYPE_MEMBER0 = 67;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.UpdateActionType <em>Update Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.UpdateActionType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getUpdateActionType()
	 * @generated
	 */
	int UPDATE_ACTION_TYPE = 68;

	/**
	 * The meta object id for the '<em>All Some Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.AllSomeType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getAllSomeTypeObject()
	 * @generated
	 */
	int ALL_SOME_TYPE_OBJECT = 69;

	/**
	 * The meta object id for the '<em>Non Negative Integer Or Unknown</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getNonNegativeIntegerOrUnknown()
	 * @generated
	 */
	int NON_NEGATIVE_INTEGER_OR_UNKNOWN = 70;

	/**
	 * The meta object id for the '<em>Non Negative Integer Or Unknown Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.NonNegativeIntegerOrUnknownMember0
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getNonNegativeIntegerOrUnknownMember0Object()
	 * @generated
	 */
	int NON_NEGATIVE_INTEGER_OR_UNKNOWN_MEMBER0_OBJECT = 71;

	/**
	 * The meta object id for the '<em>Non Negative Integer Or Unknown Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getNonNegativeIntegerOrUnknownMember1()
	 * @generated
	 */
	int NON_NEGATIVE_INTEGER_OR_UNKNOWN_MEMBER1 = 72;

	/**
	 * The meta object id for the '<em>Positive Integer With Star</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getPositiveIntegerWithStar()
	 * @generated
	 */
	int POSITIVE_INTEGER_WITH_STAR = 73;

	/**
	 * The meta object id for the '<em>Resolve Value Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.ResolveValueType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getResolveValueTypeObject()
	 * @generated
	 */
	int RESOLVE_VALUE_TYPE_OBJECT = 74;

	/**
	 * The meta object id for the '<em>Result Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.ResultTypeType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getResultTypeTypeObject()
	 * @generated
	 */
	int RESULT_TYPE_TYPE_OBJECT = 75;

	/**
	 * The meta object id for the '<em>Return Feature Types List Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getReturnFeatureTypesListType()
	 * @generated
	 */
	int RETURN_FEATURE_TYPES_LIST_TYPE = 76;

	/**
	 * The meta object id for the '<em>Star String Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.StarStringType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getStarStringTypeObject()
	 * @generated
	 */
	int STAR_STRING_TYPE_OBJECT = 77;

	/**
	 * The meta object id for the '<em>State Value Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getStateValueType()
	 * @generated
	 */
	int STATE_VALUE_TYPE = 78;

	/**
	 * The meta object id for the '<em>State Value Type Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.StateValueTypeMember0
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getStateValueTypeMember0Object()
	 * @generated
	 */
	int STATE_VALUE_TYPE_MEMBER0_OBJECT = 79;

	/**
	 * The meta object id for the '<em>State Value Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getStateValueTypeMember1()
	 * @generated
	 */
	int STATE_VALUE_TYPE_MEMBER1 = 80;

	/**
	 * The meta object id for the '<em>Update Action Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.UpdateActionType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getUpdateActionTypeObject()
	 * @generated
	 */
	int UPDATE_ACTION_TYPE_OBJECT = 81;

	/**
	 * The meta object id for the '<em>Version String Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getVersionStringType()
	 * @generated
	 */
	int VERSION_STRING_TYPE = 82;


	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.AbstractTransactionActionType <em>Abstract Transaction Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Transaction Action Type</em>'.
	 * @see net.opengis.wfs.AbstractTransactionActionType
	 * @generated
	 */
	EClass getAbstractTransactionActionType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.AbstractTransactionActionType#getHandle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle</em>'.
	 * @see net.opengis.wfs.AbstractTransactionActionType#getHandle()
	 * @see #getAbstractTransactionActionType()
	 * @generated
	 */
	EAttribute getAbstractTransactionActionType_Handle();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Type</em>'.
	 * @see net.opengis.wfs.AbstractType
	 * @generated
	 */
	EClass getAbstractType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.AbstractType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.wfs.AbstractType#getValue()
	 * @see #getAbstractType()
	 * @generated
	 */
	EAttribute getAbstractType_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.AbstractType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see net.opengis.wfs.AbstractType#getLang()
	 * @see #getAbstractType()
	 * @generated
	 */
	EAttribute getAbstractType_Lang();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.ActionResultsType <em>Action Results Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Results Type</em>'.
	 * @see net.opengis.wfs.ActionResultsType
	 * @generated
	 */
	EClass getActionResultsType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.ActionResultsType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see net.opengis.wfs.ActionResultsType#getFeature()
	 * @see #getActionResultsType()
	 * @generated
	 */
	EReference getActionResultsType_Feature();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.AdditionalObjectsType <em>Additional Objects Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Objects Type</em>'.
	 * @see net.opengis.wfs.AdditionalObjectsType
	 * @generated
	 */
	EClass getAdditionalObjectsType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.AdditionalObjectsType#getValueCollection <em>Value Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Collection</em>'.
	 * @see net.opengis.wfs.AdditionalObjectsType#getValueCollection()
	 * @see #getAdditionalObjectsType()
	 * @generated
	 */
	EReference getAdditionalObjectsType_ValueCollection();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.AdditionalObjectsType#getSimpleFeatureCollectionGroup <em>Simple Feature Collection Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Simple Feature Collection Group</em>'.
	 * @see net.opengis.wfs.AdditionalObjectsType#getSimpleFeatureCollectionGroup()
	 * @see #getAdditionalObjectsType()
	 * @generated
	 */
	EAttribute getAdditionalObjectsType_SimpleFeatureCollectionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.AdditionalObjectsType#getSimpleFeatureCollection <em>Simple Feature Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Feature Collection</em>'.
	 * @see net.opengis.wfs.AdditionalObjectsType#getSimpleFeatureCollection()
	 * @see #getAdditionalObjectsType()
	 * @generated
	 */
	EReference getAdditionalObjectsType_SimpleFeatureCollection();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.AdditionalValuesType <em>Additional Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Values Type</em>'.
	 * @see net.opengis.wfs.AdditionalValuesType
	 * @generated
	 */
	EClass getAdditionalValuesType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.AdditionalValuesType#getValueCollection <em>Value Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Collection</em>'.
	 * @see net.opengis.wfs.AdditionalValuesType#getValueCollection()
	 * @see #getAdditionalValuesType()
	 * @generated
	 */
	EReference getAdditionalValuesType_ValueCollection();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.AdditionalValuesType#getSimpleFeatureCollectionGroup <em>Simple Feature Collection Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Simple Feature Collection Group</em>'.
	 * @see net.opengis.wfs.AdditionalValuesType#getSimpleFeatureCollectionGroup()
	 * @see #getAdditionalValuesType()
	 * @generated
	 */
	EAttribute getAdditionalValuesType_SimpleFeatureCollectionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.AdditionalValuesType#getSimpleFeatureCollection <em>Simple Feature Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Feature Collection</em>'.
	 * @see net.opengis.wfs.AdditionalValuesType#getSimpleFeatureCollection()
	 * @see #getAdditionalValuesType()
	 * @generated
	 */
	EReference getAdditionalValuesType_SimpleFeatureCollection();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.BaseRequestType <em>Base Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Request Type</em>'.
	 * @see net.opengis.wfs.BaseRequestType
	 * @generated
	 */
	EClass getBaseRequestType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.BaseRequestType#getHandle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle</em>'.
	 * @see net.opengis.wfs.BaseRequestType#getHandle()
	 * @see #getBaseRequestType()
	 * @generated
	 */
	EAttribute getBaseRequestType_Handle();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.BaseRequestType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see net.opengis.wfs.BaseRequestType#getService()
	 * @see #getBaseRequestType()
	 * @generated
	 */
	EAttribute getBaseRequestType_Service();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.BaseRequestType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.opengis.wfs.BaseRequestType#getVersion()
	 * @see #getBaseRequestType()
	 * @generated
	 */
	EAttribute getBaseRequestType_Version();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.CreatedOrModifiedFeatureType <em>Created Or Modified Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Created Or Modified Feature Type</em>'.
	 * @see net.opengis.wfs.CreatedOrModifiedFeatureType
	 * @generated
	 */
	EClass getCreatedOrModifiedFeatureType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.CreatedOrModifiedFeatureType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.opengis.wfs.CreatedOrModifiedFeatureType#getGroup()
	 * @see #getCreatedOrModifiedFeatureType()
	 * @generated
	 */
	EAttribute getCreatedOrModifiedFeatureType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.CreatedOrModifiedFeatureType#getResourceId <em>Resource Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Id</em>'.
	 * @see net.opengis.wfs.CreatedOrModifiedFeatureType#getResourceId()
	 * @see #getCreatedOrModifiedFeatureType()
	 * @generated
	 */
	EReference getCreatedOrModifiedFeatureType_ResourceId();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.CreatedOrModifiedFeatureType#getHandle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle</em>'.
	 * @see net.opengis.wfs.CreatedOrModifiedFeatureType#getHandle()
	 * @see #getCreatedOrModifiedFeatureType()
	 * @generated
	 */
	EAttribute getCreatedOrModifiedFeatureType_Handle();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.CreateStoredQueryResponseType <em>Create Stored Query Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Stored Query Response Type</em>'.
	 * @see net.opengis.wfs.CreateStoredQueryResponseType
	 * @generated
	 */
	EClass getCreateStoredQueryResponseType();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.CreateStoredQueryType <em>Create Stored Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Stored Query Type</em>'.
	 * @see net.opengis.wfs.CreateStoredQueryType
	 * @generated
	 */
	EClass getCreateStoredQueryType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.CreateStoredQueryType#getStoredQueryDefinition <em>Stored Query Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stored Query Definition</em>'.
	 * @see net.opengis.wfs.CreateStoredQueryType#getStoredQueryDefinition()
	 * @see #getCreateStoredQueryType()
	 * @generated
	 */
	EReference getCreateStoredQueryType_StoredQueryDefinition();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.DeleteType <em>Delete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Type</em>'.
	 * @see net.opengis.wfs.DeleteType
	 * @generated
	 */
	EClass getDeleteType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DeleteType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see net.opengis.wfs.DeleteType#getFilter()
	 * @see #getDeleteType()
	 * @generated
	 */
	EReference getDeleteType_Filter();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.DeleteType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see net.opengis.wfs.DeleteType#getTypeName()
	 * @see #getDeleteType()
	 * @generated
	 */
	EAttribute getDeleteType_TypeName();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.DescribeFeatureTypeType <em>Describe Feature Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Describe Feature Type Type</em>'.
	 * @see net.opengis.wfs.DescribeFeatureTypeType
	 * @generated
	 */
	EClass getDescribeFeatureTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.DescribeFeatureTypeType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type Name</em>'.
	 * @see net.opengis.wfs.DescribeFeatureTypeType#getTypeName()
	 * @see #getDescribeFeatureTypeType()
	 * @generated
	 */
	EAttribute getDescribeFeatureTypeType_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.DescribeFeatureTypeType#getOutputFormat <em>Output Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Format</em>'.
	 * @see net.opengis.wfs.DescribeFeatureTypeType#getOutputFormat()
	 * @see #getDescribeFeatureTypeType()
	 * @generated
	 */
	EAttribute getDescribeFeatureTypeType_OutputFormat();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.DescribeStoredQueriesResponseType <em>Describe Stored Queries Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Describe Stored Queries Response Type</em>'.
	 * @see net.opengis.wfs.DescribeStoredQueriesResponseType
	 * @generated
	 */
	EClass getDescribeStoredQueriesResponseType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.DescribeStoredQueriesResponseType#getStoredQueryDescription <em>Stored Query Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stored Query Description</em>'.
	 * @see net.opengis.wfs.DescribeStoredQueriesResponseType#getStoredQueryDescription()
	 * @see #getDescribeStoredQueriesResponseType()
	 * @generated
	 */
	EReference getDescribeStoredQueriesResponseType_StoredQueryDescription();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.DescribeStoredQueriesType <em>Describe Stored Queries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Describe Stored Queries Type</em>'.
	 * @see net.opengis.wfs.DescribeStoredQueriesType
	 * @generated
	 */
	EClass getDescribeStoredQueriesType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.DescribeStoredQueriesType#getStoredQueryId <em>Stored Query Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Stored Query Id</em>'.
	 * @see net.opengis.wfs.DescribeStoredQueriesType#getStoredQueryId()
	 * @see #getDescribeStoredQueriesType()
	 * @generated
	 */
	EAttribute getDescribeStoredQueriesType_StoredQueryId();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.opengis.wfs.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.opengis.wfs.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.opengis.wfs.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getAbstract()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Abstract();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getAbstractTransactionAction <em>Abstract Transaction Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Transaction Action</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getAbstractTransactionAction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractTransactionAction();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getAdditionalObjects <em>Additional Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Objects</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getAdditionalObjects()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AdditionalObjects();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getAdditionalValues <em>Additional Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Values</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getAdditionalValues()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AdditionalValues();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getBoundedBy <em>Bounded By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounded By</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getBoundedBy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BoundedBy();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getCreateStoredQuery <em>Create Stored Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create Stored Query</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getCreateStoredQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CreateStoredQuery();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getCreateStoredQueryResponse <em>Create Stored Query Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create Stored Query Response</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getCreateStoredQueryResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CreateStoredQueryResponse();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delete</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getDelete()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Delete();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getDescribeFeatureType <em>Describe Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Describe Feature Type</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getDescribeFeatureType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DescribeFeatureType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getDescribeStoredQueries <em>Describe Stored Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Describe Stored Queries</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getDescribeStoredQueries()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DescribeStoredQueries();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getDescribeStoredQueriesResponse <em>Describe Stored Queries Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Describe Stored Queries Response</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getDescribeStoredQueriesResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DescribeStoredQueriesResponse();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getDropStoredQuery <em>Drop Stored Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drop Stored Query</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getDropStoredQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DropStoredQuery();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getDropStoredQueryResponse <em>Drop Stored Query Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drop Stored Query Response</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getDropStoredQueryResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DropStoredQueryResponse();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getElement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Element();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getFeatureCollection <em>Feature Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Collection</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getFeatureCollection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FeatureCollection();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getSimpleFeatureCollection <em>Simple Feature Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Feature Collection</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getSimpleFeatureCollection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SimpleFeatureCollection();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getFeatureTypeList <em>Feature Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Type List</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getFeatureTypeList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FeatureTypeList();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getGetCapabilities <em>Get Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Capabilities</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getGetCapabilities()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetCapabilities();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getGetFeature <em>Get Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Feature</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getGetFeature()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetFeature();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getGetFeatureWithLock <em>Get Feature With Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Feature With Lock</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getGetFeatureWithLock()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetFeatureWithLock();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getGetPropertyValue <em>Get Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Property Value</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getGetPropertyValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetPropertyValue();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insert</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getInsert()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Insert();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getListStoredQueries <em>List Stored Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Stored Queries</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getListStoredQueries()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListStoredQueries();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getListStoredQueriesResponse <em>List Stored Queries Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Stored Queries Response</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getListStoredQueriesResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListStoredQueriesResponse();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getLockFeature <em>Lock Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lock Feature</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getLockFeature()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LockFeature();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getLockFeatureResponse <em>Lock Feature Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lock Feature Response</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getLockFeatureResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LockFeatureResponse();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Member</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getMember()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Member();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getNative <em>Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Native</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getNative()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Native();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Property();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Name</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getPropertyName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyName();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Query();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getReplace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Replace</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getReplace()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Replace();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getStoredQuery <em>Stored Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stored Query</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getStoredQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StoredQuery();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Title();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getTransaction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Transaction();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getTransactionResponse <em>Transaction Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Response</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getTransactionResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransactionResponse();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getTruncatedResponse <em>Truncated Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Truncated Response</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getTruncatedResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TruncatedResponse();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getTuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getTuple()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Tuple();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getUpdate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Update();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Value();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getValueCollection <em>Value Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Collection</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getValueCollection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValueCollection();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getValueList <em>Value List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value List</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getValueList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValueList();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getWFSCapabilities <em>WFS Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WFS Capabilities</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getWFSCapabilities()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WFSCapabilities();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.DropStoredQueryType <em>Drop Stored Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Stored Query Type</em>'.
	 * @see net.opengis.wfs.DropStoredQueryType
	 * @generated
	 */
	EClass getDropStoredQueryType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.DropStoredQueryType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.opengis.wfs.DropStoredQueryType#getId()
	 * @see #getDropStoredQueryType()
	 * @generated
	 */
	EAttribute getDropStoredQueryType_Id();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Type</em>'.
	 * @see net.opengis.wfs.ElementType
	 * @generated
	 */
	EClass getElementType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.ElementType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see net.opengis.wfs.ElementType#getMetadata()
	 * @see #getElementType()
	 * @generated
	 */
	EReference getElementType_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.ElementType#getValueList <em>Value List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value List</em>'.
	 * @see net.opengis.wfs.ElementType#getValueList()
	 * @see #getElementType()
	 * @generated
	 */
	EReference getElementType_ValueList();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.ElementType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.wfs.ElementType#getName()
	 * @see #getElementType()
	 * @generated
	 */
	EAttribute getElementType_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.ElementType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.opengis.wfs.ElementType#getType()
	 * @see #getElementType()
	 * @generated
	 */
	EAttribute getElementType_Type();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.EmptyType <em>Empty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Type</em>'.
	 * @see net.opengis.wfs.EmptyType
	 * @generated
	 */
	EClass getEmptyType();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.EnvelopePropertyType <em>Envelope Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Envelope Property Type</em>'.
	 * @see net.opengis.wfs.EnvelopePropertyType
	 * @generated
	 */
	EClass getEnvelopePropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.EnvelopePropertyType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see net.opengis.wfs.EnvelopePropertyType#getAny()
	 * @see #getEnvelopePropertyType()
	 * @generated
	 */
	EAttribute getEnvelopePropertyType_Any();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.ExecutionStatusType <em>Execution Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Status Type</em>'.
	 * @see net.opengis.wfs.ExecutionStatusType
	 * @generated
	 */
	EClass getExecutionStatusType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.ExecutionStatusType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.opengis.wfs.ExecutionStatusType#getStatus()
	 * @see #getExecutionStatusType()
	 * @generated
	 */
	EAttribute getExecutionStatusType_Status();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.ExtendedDescriptionType <em>Extended Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Description Type</em>'.
	 * @see net.opengis.wfs.ExtendedDescriptionType
	 * @generated
	 */
	EClass getExtendedDescriptionType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.ExtendedDescriptionType#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see net.opengis.wfs.ExtendedDescriptionType#getElement()
	 * @see #getExtendedDescriptionType()
	 * @generated
	 */
	EReference getExtendedDescriptionType_Element();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.FeatureCollectionType <em>Feature Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Collection Type</em>'.
	 * @see net.opengis.wfs.FeatureCollectionType
	 * @generated
	 */
	EClass getFeatureCollectionType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.FeatureCollectionType#getAdditionalObjects <em>Additional Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Objects</em>'.
	 * @see net.opengis.wfs.FeatureCollectionType#getAdditionalObjects()
	 * @see #getFeatureCollectionType()
	 * @generated
	 */
	EReference getFeatureCollectionType_AdditionalObjects();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.FeatureCollectionType#getTruncatedResponse <em>Truncated Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Truncated Response</em>'.
	 * @see net.opengis.wfs.FeatureCollectionType#getTruncatedResponse()
	 * @see #getFeatureCollectionType()
	 * @generated
	 */
	EReference getFeatureCollectionType_TruncatedResponse();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.FeatureCollectionType#getLockId <em>Lock Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Id</em>'.
	 * @see net.opengis.wfs.FeatureCollectionType#getLockId()
	 * @see #getFeatureCollectionType()
	 * @generated
	 */
	EAttribute getFeatureCollectionType_LockId();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.FeatureCollectionType#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next</em>'.
	 * @see net.opengis.wfs.FeatureCollectionType#getNext()
	 * @see #getFeatureCollectionType()
	 * @generated
	 */
	EAttribute getFeatureCollectionType_Next();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.FeatureCollectionType#getNumberMatched <em>Number Matched</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Matched</em>'.
	 * @see net.opengis.wfs.FeatureCollectionType#getNumberMatched()
	 * @see #getFeatureCollectionType()
	 * @generated
	 */
	EAttribute getFeatureCollectionType_NumberMatched();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.FeatureCollectionType#getNumberReturned <em>Number Returned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Returned</em>'.
	 * @see net.opengis.wfs.FeatureCollectionType#getNumberReturned()
	 * @see #getFeatureCollectionType()
	 * @generated
	 */
	EAttribute getFeatureCollectionType_NumberReturned();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.FeatureCollectionType#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous</em>'.
	 * @see net.opengis.wfs.FeatureCollectionType#getPrevious()
	 * @see #getFeatureCollectionType()
	 * @generated
	 */
	EAttribute getFeatureCollectionType_Previous();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.FeatureCollectionType#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see net.opengis.wfs.FeatureCollectionType#getTimeStamp()
	 * @see #getFeatureCollectionType()
	 * @generated
	 */
	EAttribute getFeatureCollectionType_TimeStamp();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.FeaturesLockedType <em>Features Locked Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Features Locked Type</em>'.
	 * @see net.opengis.wfs.FeaturesLockedType
	 * @generated
	 */
	EClass getFeaturesLockedType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.FeaturesLockedType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.opengis.wfs.FeaturesLockedType#getGroup()
	 * @see #getFeaturesLockedType()
	 * @generated
	 */
	EAttribute getFeaturesLockedType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.FeaturesLockedType#getResourceId <em>Resource Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Id</em>'.
	 * @see net.opengis.wfs.FeaturesLockedType#getResourceId()
	 * @see #getFeaturesLockedType()
	 * @generated
	 */
	EReference getFeaturesLockedType_ResourceId();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.FeaturesNotLockedType <em>Features Not Locked Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Features Not Locked Type</em>'.
	 * @see net.opengis.wfs.FeaturesNotLockedType
	 * @generated
	 */
	EClass getFeaturesNotLockedType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.FeaturesNotLockedType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.opengis.wfs.FeaturesNotLockedType#getGroup()
	 * @see #getFeaturesNotLockedType()
	 * @generated
	 */
	EAttribute getFeaturesNotLockedType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.FeaturesNotLockedType#getResourceId <em>Resource Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Id</em>'.
	 * @see net.opengis.wfs.FeaturesNotLockedType#getResourceId()
	 * @see #getFeaturesNotLockedType()
	 * @generated
	 */
	EReference getFeaturesNotLockedType_ResourceId();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.FeatureTypeListType <em>Feature Type List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Type List Type</em>'.
	 * @see net.opengis.wfs.FeatureTypeListType
	 * @generated
	 */
	EClass getFeatureTypeListType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.FeatureTypeListType#getFeatureType <em>Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Type</em>'.
	 * @see net.opengis.wfs.FeatureTypeListType#getFeatureType()
	 * @see #getFeatureTypeListType()
	 * @generated
	 */
	EReference getFeatureTypeListType_FeatureType();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.FeatureTypeType <em>Feature Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Type Type</em>'.
	 * @see net.opengis.wfs.FeatureTypeType
	 * @generated
	 */
	EClass getFeatureTypeType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.FeatureTypeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getName()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EAttribute getFeatureTypeType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.FeatureTypeType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getTitle()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EReference getFeatureTypeType_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.FeatureTypeType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getAbstract()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EReference getFeatureTypeType_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.FeatureTypeType#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keywords</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getKeywords()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EReference getFeatureTypeType_Keywords();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.FeatureTypeType#getDefaultCRS <em>Default CRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default CRS</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getDefaultCRS()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EAttribute getFeatureTypeType_DefaultCRS();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.FeatureTypeType#getOtherCRS <em>Other CRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other CRS</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getOtherCRS()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EAttribute getFeatureTypeType_OtherCRS();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.FeatureTypeType#getNoCRS <em>No CRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>No CRS</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getNoCRS()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EReference getFeatureTypeType_NoCRS();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.FeatureTypeType#getOutputFormats <em>Output Formats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Formats</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getOutputFormats()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EReference getFeatureTypeType_OutputFormats();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.FeatureTypeType#getWGS84BoundingBox <em>WGS84 Bounding Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>WGS84 Bounding Box</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getWGS84BoundingBox()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EReference getFeatureTypeType_WGS84BoundingBox();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.FeatureTypeType#getMetadataURL <em>Metadata URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata URL</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getMetadataURL()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EReference getFeatureTypeType_MetadataURL();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.FeatureTypeType#getExtendedDescription <em>Extended Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Description</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getExtendedDescription()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EReference getFeatureTypeType_ExtendedDescription();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.GetCapabilitiesType <em>Get Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Capabilities Type</em>'.
	 * @see net.opengis.wfs.GetCapabilitiesType
	 * @generated
	 */
	EClass getGetCapabilitiesType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetCapabilitiesType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see net.opengis.wfs.GetCapabilitiesType#getService()
	 * @see #getGetCapabilitiesType()
	 * @generated
	 */
	EAttribute getGetCapabilitiesType_Service();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.GetFeatureType <em>Get Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Feature Type</em>'.
	 * @see net.opengis.wfs.GetFeatureType
	 * @generated
	 */
	EClass getGetFeatureType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.GetFeatureType#getAbstractQueryExpressionGroup <em>Abstract Query Expression Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Query Expression Group</em>'.
	 * @see net.opengis.wfs.GetFeatureType#getAbstractQueryExpressionGroup()
	 * @see #getGetFeatureType()
	 * @generated
	 */
	EAttribute getGetFeatureType_AbstractQueryExpressionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.GetFeatureType#getAbstractQueryExpression <em>Abstract Query Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Query Expression</em>'.
	 * @see net.opengis.wfs.GetFeatureType#getAbstractQueryExpression()
	 * @see #getGetFeatureType()
	 * @generated
	 */
	EReference getGetFeatureType_AbstractQueryExpression();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetFeatureType#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see net.opengis.wfs.GetFeatureType#getCount()
	 * @see #getGetFeatureType()
	 * @generated
	 */
	EAttribute getGetFeatureType_Count();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetFeatureType#getOutputFormat <em>Output Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Format</em>'.
	 * @see net.opengis.wfs.GetFeatureType#getOutputFormat()
	 * @see #getGetFeatureType()
	 * @generated
	 */
	EAttribute getGetFeatureType_OutputFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetFeatureType#getResolve <em>Resolve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolve</em>'.
	 * @see net.opengis.wfs.GetFeatureType#getResolve()
	 * @see #getGetFeatureType()
	 * @generated
	 */
	EAttribute getGetFeatureType_Resolve();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetFeatureType#getResolveDepth <em>Resolve Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolve Depth</em>'.
	 * @see net.opengis.wfs.GetFeatureType#getResolveDepth()
	 * @see #getGetFeatureType()
	 * @generated
	 */
	EAttribute getGetFeatureType_ResolveDepth();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetFeatureType#getResolveTimeout <em>Resolve Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolve Timeout</em>'.
	 * @see net.opengis.wfs.GetFeatureType#getResolveTimeout()
	 * @see #getGetFeatureType()
	 * @generated
	 */
	EAttribute getGetFeatureType_ResolveTimeout();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetFeatureType#getResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Type</em>'.
	 * @see net.opengis.wfs.GetFeatureType#getResultType()
	 * @see #getGetFeatureType()
	 * @generated
	 */
	EAttribute getGetFeatureType_ResultType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetFeatureType#getStartIndex <em>Start Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Index</em>'.
	 * @see net.opengis.wfs.GetFeatureType#getStartIndex()
	 * @see #getGetFeatureType()
	 * @generated
	 */
	EAttribute getGetFeatureType_StartIndex();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.GetFeatureWithLockType <em>Get Feature With Lock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Feature With Lock Type</em>'.
	 * @see net.opengis.wfs.GetFeatureWithLockType
	 * @generated
	 */
	EClass getGetFeatureWithLockType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetFeatureWithLockType#getExpiry <em>Expiry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry</em>'.
	 * @see net.opengis.wfs.GetFeatureWithLockType#getExpiry()
	 * @see #getGetFeatureWithLockType()
	 * @generated
	 */
	EAttribute getGetFeatureWithLockType_Expiry();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetFeatureWithLockType#getLockAction <em>Lock Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Action</em>'.
	 * @see net.opengis.wfs.GetFeatureWithLockType#getLockAction()
	 * @see #getGetFeatureWithLockType()
	 * @generated
	 */
	EAttribute getGetFeatureWithLockType_LockAction();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.GetPropertyValueType <em>Get Property Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Property Value Type</em>'.
	 * @see net.opengis.wfs.GetPropertyValueType
	 * @generated
	 */
	EClass getGetPropertyValueType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.GetPropertyValueType#getAbstractQueryExpressionGroup <em>Abstract Query Expression Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Query Expression Group</em>'.
	 * @see net.opengis.wfs.GetPropertyValueType#getAbstractQueryExpressionGroup()
	 * @see #getGetPropertyValueType()
	 * @generated
	 */
	EAttribute getGetPropertyValueType_AbstractQueryExpressionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.GetPropertyValueType#getAbstractQueryExpression <em>Abstract Query Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Query Expression</em>'.
	 * @see net.opengis.wfs.GetPropertyValueType#getAbstractQueryExpression()
	 * @see #getGetPropertyValueType()
	 * @generated
	 */
	EReference getGetPropertyValueType_AbstractQueryExpression();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetPropertyValueType#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see net.opengis.wfs.GetPropertyValueType#getCount()
	 * @see #getGetPropertyValueType()
	 * @generated
	 */
	EAttribute getGetPropertyValueType_Count();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetPropertyValueType#getOutputFormat <em>Output Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Format</em>'.
	 * @see net.opengis.wfs.GetPropertyValueType#getOutputFormat()
	 * @see #getGetPropertyValueType()
	 * @generated
	 */
	EAttribute getGetPropertyValueType_OutputFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetPropertyValueType#getResolve <em>Resolve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolve</em>'.
	 * @see net.opengis.wfs.GetPropertyValueType#getResolve()
	 * @see #getGetPropertyValueType()
	 * @generated
	 */
	EAttribute getGetPropertyValueType_Resolve();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetPropertyValueType#getResolveDepth <em>Resolve Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolve Depth</em>'.
	 * @see net.opengis.wfs.GetPropertyValueType#getResolveDepth()
	 * @see #getGetPropertyValueType()
	 * @generated
	 */
	EAttribute getGetPropertyValueType_ResolveDepth();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetPropertyValueType#getResolvePath <em>Resolve Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolve Path</em>'.
	 * @see net.opengis.wfs.GetPropertyValueType#getResolvePath()
	 * @see #getGetPropertyValueType()
	 * @generated
	 */
	EAttribute getGetPropertyValueType_ResolvePath();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetPropertyValueType#getResolveTimeout <em>Resolve Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolve Timeout</em>'.
	 * @see net.opengis.wfs.GetPropertyValueType#getResolveTimeout()
	 * @see #getGetPropertyValueType()
	 * @generated
	 */
	EAttribute getGetPropertyValueType_ResolveTimeout();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetPropertyValueType#getResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Type</em>'.
	 * @see net.opengis.wfs.GetPropertyValueType#getResultType()
	 * @see #getGetPropertyValueType()
	 * @generated
	 */
	EAttribute getGetPropertyValueType_ResultType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetPropertyValueType#getStartIndex <em>Start Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Index</em>'.
	 * @see net.opengis.wfs.GetPropertyValueType#getStartIndex()
	 * @see #getGetPropertyValueType()
	 * @generated
	 */
	EAttribute getGetPropertyValueType_StartIndex();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetPropertyValueType#getValueReference <em>Value Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Reference</em>'.
	 * @see net.opengis.wfs.GetPropertyValueType#getValueReference()
	 * @see #getGetPropertyValueType()
	 * @generated
	 */
	EAttribute getGetPropertyValueType_ValueReference();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.InsertType <em>Insert Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert Type</em>'.
	 * @see net.opengis.wfs.InsertType
	 * @generated
	 */
	EClass getInsertType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.InsertType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see net.opengis.wfs.InsertType#getAny()
	 * @see #getInsertType()
	 * @generated
	 */
	EAttribute getInsertType_Any();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.InsertType#getInputFormat <em>Input Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Format</em>'.
	 * @see net.opengis.wfs.InsertType#getInputFormat()
	 * @see #getInsertType()
	 * @generated
	 */
	EAttribute getInsertType_InputFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.InsertType#getSrsName <em>Srs Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srs Name</em>'.
	 * @see net.opengis.wfs.InsertType#getSrsName()
	 * @see #getInsertType()
	 * @generated
	 */
	EAttribute getInsertType_SrsName();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.ListStoredQueriesResponseType <em>List Stored Queries Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Stored Queries Response Type</em>'.
	 * @see net.opengis.wfs.ListStoredQueriesResponseType
	 * @generated
	 */
	EClass getListStoredQueriesResponseType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.ListStoredQueriesResponseType#getStoredQuery <em>Stored Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stored Query</em>'.
	 * @see net.opengis.wfs.ListStoredQueriesResponseType#getStoredQuery()
	 * @see #getListStoredQueriesResponseType()
	 * @generated
	 */
	EReference getListStoredQueriesResponseType_StoredQuery();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.ListStoredQueriesType <em>List Stored Queries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Stored Queries Type</em>'.
	 * @see net.opengis.wfs.ListStoredQueriesType
	 * @generated
	 */
	EClass getListStoredQueriesType();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.LockFeatureResponseType <em>Lock Feature Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lock Feature Response Type</em>'.
	 * @see net.opengis.wfs.LockFeatureResponseType
	 * @generated
	 */
	EClass getLockFeatureResponseType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.LockFeatureResponseType#getFeaturesLocked <em>Features Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Features Locked</em>'.
	 * @see net.opengis.wfs.LockFeatureResponseType#getFeaturesLocked()
	 * @see #getLockFeatureResponseType()
	 * @generated
	 */
	EReference getLockFeatureResponseType_FeaturesLocked();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.LockFeatureResponseType#getFeaturesNotLocked <em>Features Not Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Features Not Locked</em>'.
	 * @see net.opengis.wfs.LockFeatureResponseType#getFeaturesNotLocked()
	 * @see #getLockFeatureResponseType()
	 * @generated
	 */
	EReference getLockFeatureResponseType_FeaturesNotLocked();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.LockFeatureResponseType#getLockId <em>Lock Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Id</em>'.
	 * @see net.opengis.wfs.LockFeatureResponseType#getLockId()
	 * @see #getLockFeatureResponseType()
	 * @generated
	 */
	EAttribute getLockFeatureResponseType_LockId();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.LockFeatureType <em>Lock Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lock Feature Type</em>'.
	 * @see net.opengis.wfs.LockFeatureType
	 * @generated
	 */
	EClass getLockFeatureType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.LockFeatureType#getAbstractQueryExpressionGroup <em>Abstract Query Expression Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Query Expression Group</em>'.
	 * @see net.opengis.wfs.LockFeatureType#getAbstractQueryExpressionGroup()
	 * @see #getLockFeatureType()
	 * @generated
	 */
	EAttribute getLockFeatureType_AbstractQueryExpressionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.LockFeatureType#getAbstractQueryExpression <em>Abstract Query Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Query Expression</em>'.
	 * @see net.opengis.wfs.LockFeatureType#getAbstractQueryExpression()
	 * @see #getLockFeatureType()
	 * @generated
	 */
	EReference getLockFeatureType_AbstractQueryExpression();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.LockFeatureType#getExpiry <em>Expiry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry</em>'.
	 * @see net.opengis.wfs.LockFeatureType#getExpiry()
	 * @see #getLockFeatureType()
	 * @generated
	 */
	EAttribute getLockFeatureType_Expiry();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.LockFeatureType#getLockAction <em>Lock Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Action</em>'.
	 * @see net.opengis.wfs.LockFeatureType#getLockAction()
	 * @see #getLockFeatureType()
	 * @generated
	 */
	EAttribute getLockFeatureType_LockAction();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.LockFeatureType#getLockId <em>Lock Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Id</em>'.
	 * @see net.opengis.wfs.LockFeatureType#getLockId()
	 * @see #getLockFeatureType()
	 * @generated
	 */
	EAttribute getLockFeatureType_LockId();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.MemberPropertyType <em>Member Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Property Type</em>'.
	 * @see net.opengis.wfs.MemberPropertyType
	 * @generated
	 */
	EClass getMemberPropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.MemberPropertyType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.wfs.MemberPropertyType#getMixed()
	 * @see #getMemberPropertyType()
	 * @generated
	 */
	EAttribute getMemberPropertyType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.MemberPropertyType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see net.opengis.wfs.MemberPropertyType#getAny()
	 * @see #getMemberPropertyType()
	 * @generated
	 */
	EAttribute getMemberPropertyType_Any();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.MemberPropertyType#getTuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple</em>'.
	 * @see net.opengis.wfs.MemberPropertyType#getTuple()
	 * @see #getMemberPropertyType()
	 * @generated
	 */
	EReference getMemberPropertyType_Tuple();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.MemberPropertyType#getSimpleFeatureCollectionGroup <em>Simple Feature Collection Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Simple Feature Collection Group</em>'.
	 * @see net.opengis.wfs.MemberPropertyType#getSimpleFeatureCollectionGroup()
	 * @see #getMemberPropertyType()
	 * @generated
	 */
	EAttribute getMemberPropertyType_SimpleFeatureCollectionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.MemberPropertyType#getSimpleFeatureCollection <em>Simple Feature Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Feature Collection</em>'.
	 * @see net.opengis.wfs.MemberPropertyType#getSimpleFeatureCollection()
	 * @see #getMemberPropertyType()
	 * @generated
	 */
	EReference getMemberPropertyType_SimpleFeatureCollection();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.MemberPropertyType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see net.opengis.wfs.MemberPropertyType#getActuate()
	 * @see #getMemberPropertyType()
	 * @generated
	 */
	EAttribute getMemberPropertyType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.MemberPropertyType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see net.opengis.wfs.MemberPropertyType#getArcrole()
	 * @see #getMemberPropertyType()
	 * @generated
	 */
	EAttribute getMemberPropertyType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.MemberPropertyType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see net.opengis.wfs.MemberPropertyType#getHref()
	 * @see #getMemberPropertyType()
	 * @generated
	 */
	EAttribute getMemberPropertyType_Href();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.MemberPropertyType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see net.opengis.wfs.MemberPropertyType#getRole()
	 * @see #getMemberPropertyType()
	 * @generated
	 */
	EAttribute getMemberPropertyType_Role();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.MemberPropertyType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see net.opengis.wfs.MemberPropertyType#getShow()
	 * @see #getMemberPropertyType()
	 * @generated
	 */
	EAttribute getMemberPropertyType_Show();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.MemberPropertyType#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see net.opengis.wfs.MemberPropertyType#getState()
	 * @see #getMemberPropertyType()
	 * @generated
	 */
	EAttribute getMemberPropertyType_State();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.MemberPropertyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.wfs.MemberPropertyType#getTitle()
	 * @see #getMemberPropertyType()
	 * @generated
	 */
	EAttribute getMemberPropertyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.MemberPropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.opengis.wfs.MemberPropertyType#getType()
	 * @see #getMemberPropertyType()
	 * @generated
	 */
	EAttribute getMemberPropertyType_Type();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.MetadataURLType <em>Metadata URL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata URL Type</em>'.
	 * @see net.opengis.wfs.MetadataURLType
	 * @generated
	 */
	EClass getMetadataURLType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.MetadataURLType#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see net.opengis.wfs.MetadataURLType#getAbout()
	 * @see #getMetadataURLType()
	 * @generated
	 */
	EAttribute getMetadataURLType_About();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.MetadataURLType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see net.opengis.wfs.MetadataURLType#getActuate()
	 * @see #getMetadataURLType()
	 * @generated
	 */
	EAttribute getMetadataURLType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.MetadataURLType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see net.opengis.wfs.MetadataURLType#getArcrole()
	 * @see #getMetadataURLType()
	 * @generated
	 */
	EAttribute getMetadataURLType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.MetadataURLType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see net.opengis.wfs.MetadataURLType#getHref()
	 * @see #getMetadataURLType()
	 * @generated
	 */
	EAttribute getMetadataURLType_Href();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.MetadataURLType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see net.opengis.wfs.MetadataURLType#getRole()
	 * @see #getMetadataURLType()
	 * @generated
	 */
	EAttribute getMetadataURLType_Role();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.MetadataURLType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see net.opengis.wfs.MetadataURLType#getShow()
	 * @see #getMetadataURLType()
	 * @generated
	 */
	EAttribute getMetadataURLType_Show();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.MetadataURLType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.wfs.MetadataURLType#getTitle()
	 * @see #getMetadataURLType()
	 * @generated
	 */
	EAttribute getMetadataURLType_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.MetadataURLType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.opengis.wfs.MetadataURLType#getType()
	 * @see #getMetadataURLType()
	 * @generated
	 */
	EAttribute getMetadataURLType_Type();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.NativeType <em>Native Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Native Type</em>'.
	 * @see net.opengis.wfs.NativeType
	 * @generated
	 */
	EClass getNativeType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.NativeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.wfs.NativeType#getMixed()
	 * @see #getNativeType()
	 * @generated
	 */
	EAttribute getNativeType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.NativeType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see net.opengis.wfs.NativeType#getAny()
	 * @see #getNativeType()
	 * @generated
	 */
	EAttribute getNativeType_Any();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.NativeType#isSafeToIgnore <em>Safe To Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safe To Ignore</em>'.
	 * @see net.opengis.wfs.NativeType#isSafeToIgnore()
	 * @see #getNativeType()
	 * @generated
	 */
	EAttribute getNativeType_SafeToIgnore();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.NativeType#getVendorId <em>Vendor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor Id</em>'.
	 * @see net.opengis.wfs.NativeType#getVendorId()
	 * @see #getNativeType()
	 * @generated
	 */
	EAttribute getNativeType_VendorId();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.NoCRSType <em>No CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No CRS Type</em>'.
	 * @see net.opengis.wfs.NoCRSType
	 * @generated
	 */
	EClass getNoCRSType();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.OutputFormatListType <em>Output Format List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Format List Type</em>'.
	 * @see net.opengis.wfs.OutputFormatListType
	 * @generated
	 */
	EClass getOutputFormatListType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.OutputFormatListType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.opengis.wfs.OutputFormatListType#getGroup()
	 * @see #getOutputFormatListType()
	 * @generated
	 */
	EAttribute getOutputFormatListType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.OutputFormatListType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Format</em>'.
	 * @see net.opengis.wfs.OutputFormatListType#getFormat()
	 * @see #getOutputFormatListType()
	 * @generated
	 */
	EAttribute getOutputFormatListType_Format();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.ParameterExpressionType <em>Parameter Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Expression Type</em>'.
	 * @see net.opengis.wfs.ParameterExpressionType
	 * @generated
	 */
	EClass getParameterExpressionType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.ParameterExpressionType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title</em>'.
	 * @see net.opengis.wfs.ParameterExpressionType#getTitle()
	 * @see #getParameterExpressionType()
	 * @generated
	 */
	EReference getParameterExpressionType_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.ParameterExpressionType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract</em>'.
	 * @see net.opengis.wfs.ParameterExpressionType#getAbstract()
	 * @see #getParameterExpressionType()
	 * @generated
	 */
	EReference getParameterExpressionType_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.ParameterExpressionType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see net.opengis.wfs.ParameterExpressionType#getMetadata()
	 * @see #getParameterExpressionType()
	 * @generated
	 */
	EReference getParameterExpressionType_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.ParameterExpressionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.wfs.ParameterExpressionType#getName()
	 * @see #getParameterExpressionType()
	 * @generated
	 */
	EAttribute getParameterExpressionType_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.ParameterExpressionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.opengis.wfs.ParameterExpressionType#getType()
	 * @see #getParameterExpressionType()
	 * @generated
	 */
	EAttribute getParameterExpressionType_Type();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see net.opengis.wfs.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.ParameterType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.wfs.ParameterType#getMixed()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.ParameterType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see net.opengis.wfs.ParameterType#getAny()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Any();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.ParameterType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.wfs.ParameterType#getName()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Name();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.PropertyNameType <em>Property Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Name Type</em>'.
	 * @see net.opengis.wfs.PropertyNameType
	 * @generated
	 */
	EClass getPropertyNameType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.PropertyNameType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.wfs.PropertyNameType#getValue()
	 * @see #getPropertyNameType()
	 * @generated
	 */
	EAttribute getPropertyNameType_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.PropertyNameType#getResolve <em>Resolve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolve</em>'.
	 * @see net.opengis.wfs.PropertyNameType#getResolve()
	 * @see #getPropertyNameType()
	 * @generated
	 */
	EAttribute getPropertyNameType_Resolve();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.PropertyNameType#getResolveDepth <em>Resolve Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolve Depth</em>'.
	 * @see net.opengis.wfs.PropertyNameType#getResolveDepth()
	 * @see #getPropertyNameType()
	 * @generated
	 */
	EAttribute getPropertyNameType_ResolveDepth();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.PropertyNameType#getResolvePath <em>Resolve Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolve Path</em>'.
	 * @see net.opengis.wfs.PropertyNameType#getResolvePath()
	 * @see #getPropertyNameType()
	 * @generated
	 */
	EAttribute getPropertyNameType_ResolvePath();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.PropertyNameType#getResolveTimeout <em>Resolve Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolve Timeout</em>'.
	 * @see net.opengis.wfs.PropertyNameType#getResolveTimeout()
	 * @see #getPropertyNameType()
	 * @generated
	 */
	EAttribute getPropertyNameType_ResolveTimeout();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see net.opengis.wfs.PropertyType
	 * @generated
	 */
	EClass getPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.PropertyType#getValueReference <em>Value Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Reference</em>'.
	 * @see net.opengis.wfs.PropertyType#getValueReference()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_ValueReference();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.PropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see net.opengis.wfs.PropertyType#getValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_Value();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.QueryExpressionTextType <em>Query Expression Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Expression Text Type</em>'.
	 * @see net.opengis.wfs.QueryExpressionTextType
	 * @generated
	 */
	EClass getQueryExpressionTextType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.QueryExpressionTextType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.wfs.QueryExpressionTextType#getMixed()
	 * @see #getQueryExpressionTextType()
	 * @generated
	 */
	EAttribute getQueryExpressionTextType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.QueryExpressionTextType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see net.opengis.wfs.QueryExpressionTextType#getAny()
	 * @see #getQueryExpressionTextType()
	 * @generated
	 */
	EAttribute getQueryExpressionTextType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.QueryExpressionTextType#getAny1 <em>Any1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any1</em>'.
	 * @see net.opengis.wfs.QueryExpressionTextType#getAny1()
	 * @see #getQueryExpressionTextType()
	 * @generated
	 */
	EAttribute getQueryExpressionTextType_Any1();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.QueryExpressionTextType#isIsPrivate <em>Is Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Private</em>'.
	 * @see net.opengis.wfs.QueryExpressionTextType#isIsPrivate()
	 * @see #getQueryExpressionTextType()
	 * @generated
	 */
	EAttribute getQueryExpressionTextType_IsPrivate();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.QueryExpressionTextType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see net.opengis.wfs.QueryExpressionTextType#getLanguage()
	 * @see #getQueryExpressionTextType()
	 * @generated
	 */
	EAttribute getQueryExpressionTextType_Language();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.QueryExpressionTextType#getReturnFeatureTypes <em>Return Feature Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Feature Types</em>'.
	 * @see net.opengis.wfs.QueryExpressionTextType#getReturnFeatureTypes()
	 * @see #getQueryExpressionTextType()
	 * @generated
	 */
	EAttribute getQueryExpressionTextType_ReturnFeatureTypes();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.QueryType <em>Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Type</em>'.
	 * @see net.opengis.wfs.QueryType
	 * @generated
	 */
	EClass getQueryType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.QueryType#getFeatureVersion <em>Feature Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Version</em>'.
	 * @see net.opengis.wfs.QueryType#getFeatureVersion()
	 * @see #getQueryType()
	 * @generated
	 */
	EAttribute getQueryType_FeatureVersion();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.QueryType#getSrsName <em>Srs Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srs Name</em>'.
	 * @see net.opengis.wfs.QueryType#getSrsName()
	 * @see #getQueryType()
	 * @generated
	 */
	EAttribute getQueryType_SrsName();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.ReplaceType <em>Replace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace Type</em>'.
	 * @see net.opengis.wfs.ReplaceType
	 * @generated
	 */
	EClass getReplaceType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.ReplaceType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see net.opengis.wfs.ReplaceType#getAny()
	 * @see #getReplaceType()
	 * @generated
	 */
	EAttribute getReplaceType_Any();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.ReplaceType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see net.opengis.wfs.ReplaceType#getFilter()
	 * @see #getReplaceType()
	 * @generated
	 */
	EReference getReplaceType_Filter();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.ReplaceType#getInputFormat <em>Input Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Format</em>'.
	 * @see net.opengis.wfs.ReplaceType#getInputFormat()
	 * @see #getReplaceType()
	 * @generated
	 */
	EAttribute getReplaceType_InputFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.ReplaceType#getSrsName <em>Srs Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srs Name</em>'.
	 * @see net.opengis.wfs.ReplaceType#getSrsName()
	 * @see #getReplaceType()
	 * @generated
	 */
	EAttribute getReplaceType_SrsName();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.SimpleFeatureCollectionType <em>Simple Feature Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Feature Collection Type</em>'.
	 * @see net.opengis.wfs.SimpleFeatureCollectionType
	 * @generated
	 */
	EClass getSimpleFeatureCollectionType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.SimpleFeatureCollectionType#getBoundedBy <em>Bounded By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounded By</em>'.
	 * @see net.opengis.wfs.SimpleFeatureCollectionType#getBoundedBy()
	 * @see #getSimpleFeatureCollectionType()
	 * @generated
	 */
	EReference getSimpleFeatureCollectionType_BoundedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.SimpleFeatureCollectionType#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see net.opengis.wfs.SimpleFeatureCollectionType#getMember()
	 * @see #getSimpleFeatureCollectionType()
	 * @generated
	 */
	EReference getSimpleFeatureCollectionType_Member();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.StoredQueryDescriptionType <em>Stored Query Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stored Query Description Type</em>'.
	 * @see net.opengis.wfs.StoredQueryDescriptionType
	 * @generated
	 */
	EClass getStoredQueryDescriptionType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.StoredQueryDescriptionType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title</em>'.
	 * @see net.opengis.wfs.StoredQueryDescriptionType#getTitle()
	 * @see #getStoredQueryDescriptionType()
	 * @generated
	 */
	EReference getStoredQueryDescriptionType_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.StoredQueryDescriptionType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract</em>'.
	 * @see net.opengis.wfs.StoredQueryDescriptionType#getAbstract()
	 * @see #getStoredQueryDescriptionType()
	 * @generated
	 */
	EReference getStoredQueryDescriptionType_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.StoredQueryDescriptionType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see net.opengis.wfs.StoredQueryDescriptionType#getMetadata()
	 * @see #getStoredQueryDescriptionType()
	 * @generated
	 */
	EReference getStoredQueryDescriptionType_Metadata();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.StoredQueryDescriptionType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see net.opengis.wfs.StoredQueryDescriptionType#getParameter()
	 * @see #getStoredQueryDescriptionType()
	 * @generated
	 */
	EReference getStoredQueryDescriptionType_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.StoredQueryDescriptionType#getQueryExpressionText <em>Query Expression Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query Expression Text</em>'.
	 * @see net.opengis.wfs.StoredQueryDescriptionType#getQueryExpressionText()
	 * @see #getStoredQueryDescriptionType()
	 * @generated
	 */
	EReference getStoredQueryDescriptionType_QueryExpressionText();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.StoredQueryDescriptionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.opengis.wfs.StoredQueryDescriptionType#getId()
	 * @see #getStoredQueryDescriptionType()
	 * @generated
	 */
	EAttribute getStoredQueryDescriptionType_Id();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.StoredQueryListItemType <em>Stored Query List Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stored Query List Item Type</em>'.
	 * @see net.opengis.wfs.StoredQueryListItemType
	 * @generated
	 */
	EClass getStoredQueryListItemType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.StoredQueryListItemType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title</em>'.
	 * @see net.opengis.wfs.StoredQueryListItemType#getTitle()
	 * @see #getStoredQueryListItemType()
	 * @generated
	 */
	EReference getStoredQueryListItemType_Title();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.StoredQueryListItemType#getReturnFeatureType <em>Return Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Return Feature Type</em>'.
	 * @see net.opengis.wfs.StoredQueryListItemType#getReturnFeatureType()
	 * @see #getStoredQueryListItemType()
	 * @generated
	 */
	EAttribute getStoredQueryListItemType_ReturnFeatureType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.StoredQueryListItemType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.opengis.wfs.StoredQueryListItemType#getId()
	 * @see #getStoredQueryListItemType()
	 * @generated
	 */
	EAttribute getStoredQueryListItemType_Id();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.StoredQueryType <em>Stored Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stored Query Type</em>'.
	 * @see net.opengis.wfs.StoredQueryType
	 * @generated
	 */
	EClass getStoredQueryType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.StoredQueryType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see net.opengis.wfs.StoredQueryType#getParameter()
	 * @see #getStoredQueryType()
	 * @generated
	 */
	EReference getStoredQueryType_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.StoredQueryType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.opengis.wfs.StoredQueryType#getId()
	 * @see #getStoredQueryType()
	 * @generated
	 */
	EAttribute getStoredQueryType_Id();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.TitleType <em>Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title Type</em>'.
	 * @see net.opengis.wfs.TitleType
	 * @generated
	 */
	EClass getTitleType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.TitleType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.wfs.TitleType#getValue()
	 * @see #getTitleType()
	 * @generated
	 */
	EAttribute getTitleType_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.TitleType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see net.opengis.wfs.TitleType#getLang()
	 * @see #getTitleType()
	 * @generated
	 */
	EAttribute getTitleType_Lang();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.TransactionResponseType <em>Transaction Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Response Type</em>'.
	 * @see net.opengis.wfs.TransactionResponseType
	 * @generated
	 */
	EClass getTransactionResponseType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.TransactionResponseType#getTransactionSummary <em>Transaction Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Summary</em>'.
	 * @see net.opengis.wfs.TransactionResponseType#getTransactionSummary()
	 * @see #getTransactionResponseType()
	 * @generated
	 */
	EReference getTransactionResponseType_TransactionSummary();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.TransactionResponseType#getInsertResults <em>Insert Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insert Results</em>'.
	 * @see net.opengis.wfs.TransactionResponseType#getInsertResults()
	 * @see #getTransactionResponseType()
	 * @generated
	 */
	EReference getTransactionResponseType_InsertResults();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.TransactionResponseType#getUpdateResults <em>Update Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Results</em>'.
	 * @see net.opengis.wfs.TransactionResponseType#getUpdateResults()
	 * @see #getTransactionResponseType()
	 * @generated
	 */
	EReference getTransactionResponseType_UpdateResults();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.TransactionResponseType#getReplaceResults <em>Replace Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Replace Results</em>'.
	 * @see net.opengis.wfs.TransactionResponseType#getReplaceResults()
	 * @see #getTransactionResponseType()
	 * @generated
	 */
	EReference getTransactionResponseType_ReplaceResults();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.TransactionResponseType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.opengis.wfs.TransactionResponseType#getVersion()
	 * @see #getTransactionResponseType()
	 * @generated
	 */
	EAttribute getTransactionResponseType_Version();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.TransactionSummaryType <em>Transaction Summary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Summary Type</em>'.
	 * @see net.opengis.wfs.TransactionSummaryType
	 * @generated
	 */
	EClass getTransactionSummaryType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.TransactionSummaryType#getTotalInserted <em>Total Inserted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Inserted</em>'.
	 * @see net.opengis.wfs.TransactionSummaryType#getTotalInserted()
	 * @see #getTransactionSummaryType()
	 * @generated
	 */
	EAttribute getTransactionSummaryType_TotalInserted();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.TransactionSummaryType#getTotalUpdated <em>Total Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Updated</em>'.
	 * @see net.opengis.wfs.TransactionSummaryType#getTotalUpdated()
	 * @see #getTransactionSummaryType()
	 * @generated
	 */
	EAttribute getTransactionSummaryType_TotalUpdated();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.TransactionSummaryType#getTotalReplaced <em>Total Replaced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Replaced</em>'.
	 * @see net.opengis.wfs.TransactionSummaryType#getTotalReplaced()
	 * @see #getTransactionSummaryType()
	 * @generated
	 */
	EAttribute getTransactionSummaryType_TotalReplaced();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.TransactionSummaryType#getTotalDeleted <em>Total Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Deleted</em>'.
	 * @see net.opengis.wfs.TransactionSummaryType#getTotalDeleted()
	 * @see #getTransactionSummaryType()
	 * @generated
	 */
	EAttribute getTransactionSummaryType_TotalDeleted();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.TransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Type</em>'.
	 * @see net.opengis.wfs.TransactionType
	 * @generated
	 */
	EClass getTransactionType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.TransactionType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.opengis.wfs.TransactionType#getGroup()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.TransactionType#getAbstractTransactionActionGroup <em>Abstract Transaction Action Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transaction Action Group</em>'.
	 * @see net.opengis.wfs.TransactionType#getAbstractTransactionActionGroup()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_AbstractTransactionActionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.TransactionType#getAbstractTransactionAction <em>Abstract Transaction Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transaction Action</em>'.
	 * @see net.opengis.wfs.TransactionType#getAbstractTransactionAction()
	 * @see #getTransactionType()
	 * @generated
	 */
	EReference getTransactionType_AbstractTransactionAction();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.TransactionType#getLockId <em>Lock Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Id</em>'.
	 * @see net.opengis.wfs.TransactionType#getLockId()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_LockId();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.TransactionType#getReleaseAction <em>Release Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Action</em>'.
	 * @see net.opengis.wfs.TransactionType#getReleaseAction()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_ReleaseAction();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.TransactionType#getSrsName <em>Srs Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srs Name</em>'.
	 * @see net.opengis.wfs.TransactionType#getSrsName()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_SrsName();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.TruncatedResponseType <em>Truncated Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Truncated Response Type</em>'.
	 * @see net.opengis.wfs.TruncatedResponseType
	 * @generated
	 */
	EClass getTruncatedResponseType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.TruncatedResponseType#getExceptionReport <em>Exception Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception Report</em>'.
	 * @see net.opengis.wfs.TruncatedResponseType#getExceptionReport()
	 * @see #getTruncatedResponseType()
	 * @generated
	 */
	EReference getTruncatedResponseType_ExceptionReport();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.TupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Type</em>'.
	 * @see net.opengis.wfs.TupleType
	 * @generated
	 */
	EClass getTupleType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.TupleType#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see net.opengis.wfs.TupleType#getMember()
	 * @see #getTupleType()
	 * @generated
	 */
	EReference getTupleType_Member();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.UpdateType <em>Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Type</em>'.
	 * @see net.opengis.wfs.UpdateType
	 * @generated
	 */
	EClass getUpdateType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.UpdateType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see net.opengis.wfs.UpdateType#getProperty()
	 * @see #getUpdateType()
	 * @generated
	 */
	EReference getUpdateType_Property();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.UpdateType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see net.opengis.wfs.UpdateType#getFilter()
	 * @see #getUpdateType()
	 * @generated
	 */
	EReference getUpdateType_Filter();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.UpdateType#getInputFormat <em>Input Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Format</em>'.
	 * @see net.opengis.wfs.UpdateType#getInputFormat()
	 * @see #getUpdateType()
	 * @generated
	 */
	EAttribute getUpdateType_InputFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.UpdateType#getSrsName <em>Srs Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srs Name</em>'.
	 * @see net.opengis.wfs.UpdateType#getSrsName()
	 * @see #getUpdateType()
	 * @generated
	 */
	EAttribute getUpdateType_SrsName();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.UpdateType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see net.opengis.wfs.UpdateType#getTypeName()
	 * @see #getUpdateType()
	 * @generated
	 */
	EAttribute getUpdateType_TypeName();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.ValueCollectionType <em>Value Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Collection Type</em>'.
	 * @see net.opengis.wfs.ValueCollectionType
	 * @generated
	 */
	EClass getValueCollectionType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.ValueCollectionType#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see net.opengis.wfs.ValueCollectionType#getMember()
	 * @see #getValueCollectionType()
	 * @generated
	 */
	EReference getValueCollectionType_Member();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.ValueCollectionType#getAdditionalValues <em>Additional Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Values</em>'.
	 * @see net.opengis.wfs.ValueCollectionType#getAdditionalValues()
	 * @see #getValueCollectionType()
	 * @generated
	 */
	EReference getValueCollectionType_AdditionalValues();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.ValueCollectionType#getTruncatedResponse <em>Truncated Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Truncated Response</em>'.
	 * @see net.opengis.wfs.ValueCollectionType#getTruncatedResponse()
	 * @see #getValueCollectionType()
	 * @generated
	 */
	EReference getValueCollectionType_TruncatedResponse();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.ValueCollectionType#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next</em>'.
	 * @see net.opengis.wfs.ValueCollectionType#getNext()
	 * @see #getValueCollectionType()
	 * @generated
	 */
	EAttribute getValueCollectionType_Next();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.ValueCollectionType#getNumberMatched <em>Number Matched</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Matched</em>'.
	 * @see net.opengis.wfs.ValueCollectionType#getNumberMatched()
	 * @see #getValueCollectionType()
	 * @generated
	 */
	EAttribute getValueCollectionType_NumberMatched();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.ValueCollectionType#getNumberReturned <em>Number Returned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Returned</em>'.
	 * @see net.opengis.wfs.ValueCollectionType#getNumberReturned()
	 * @see #getValueCollectionType()
	 * @generated
	 */
	EAttribute getValueCollectionType_NumberReturned();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.ValueCollectionType#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous</em>'.
	 * @see net.opengis.wfs.ValueCollectionType#getPrevious()
	 * @see #getValueCollectionType()
	 * @generated
	 */
	EAttribute getValueCollectionType_Previous();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.ValueCollectionType#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see net.opengis.wfs.ValueCollectionType#getTimeStamp()
	 * @see #getValueCollectionType()
	 * @generated
	 */
	EAttribute getValueCollectionType_TimeStamp();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.ValueListType <em>Value List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value List Type</em>'.
	 * @see net.opengis.wfs.ValueListType
	 * @generated
	 */
	EClass getValueListType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.ValueListType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.opengis.wfs.ValueListType#getGroup()
	 * @see #getValueListType()
	 * @generated
	 */
	EAttribute getValueListType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.ValueListType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see net.opengis.wfs.ValueListType#getValue()
	 * @see #getValueListType()
	 * @generated
	 */
	EReference getValueListType_Value();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.ValueReferenceType <em>Value Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Reference Type</em>'.
	 * @see net.opengis.wfs.ValueReferenceType
	 * @generated
	 */
	EClass getValueReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.ValueReferenceType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.wfs.ValueReferenceType#getValue()
	 * @see #getValueReferenceType()
	 * @generated
	 */
	EAttribute getValueReferenceType_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.ValueReferenceType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see net.opengis.wfs.ValueReferenceType#getAction()
	 * @see #getValueReferenceType()
	 * @generated
	 */
	EAttribute getValueReferenceType_Action();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.WFSCapabilitiesType <em>Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capabilities Type</em>'.
	 * @see net.opengis.wfs.WFSCapabilitiesType
	 * @generated
	 */
	EClass getWFSCapabilitiesType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.WFSCapabilitiesType#getWSDL <em>WSDL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WSDL</em>'.
	 * @see net.opengis.wfs.WFSCapabilitiesType#getWSDL()
	 * @see #getWFSCapabilitiesType()
	 * @generated
	 */
	EReference getWFSCapabilitiesType_WSDL();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.WFSCapabilitiesType#getFeatureTypeList <em>Feature Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Type List</em>'.
	 * @see net.opengis.wfs.WFSCapabilitiesType#getFeatureTypeList()
	 * @see #getWFSCapabilitiesType()
	 * @generated
	 */
	EReference getWFSCapabilitiesType_FeatureTypeList();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.WFSCapabilitiesType#getFilterCapabilities <em>Filter Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Capabilities</em>'.
	 * @see net.opengis.wfs.WFSCapabilitiesType#getFilterCapabilities()
	 * @see #getWFSCapabilitiesType()
	 * @generated
	 */
	EReference getWFSCapabilitiesType_FilterCapabilities();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.WSDLType <em>WSDL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSDL Type</em>'.
	 * @see net.opengis.wfs.WSDLType
	 * @generated
	 */
	EClass getWSDLType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.WSDLType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see net.opengis.wfs.WSDLType#getActuate()
	 * @see #getWSDLType()
	 * @generated
	 */
	EAttribute getWSDLType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.WSDLType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see net.opengis.wfs.WSDLType#getArcrole()
	 * @see #getWSDLType()
	 * @generated
	 */
	EAttribute getWSDLType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.WSDLType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see net.opengis.wfs.WSDLType#getHref()
	 * @see #getWSDLType()
	 * @generated
	 */
	EAttribute getWSDLType_Href();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.WSDLType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see net.opengis.wfs.WSDLType#getRole()
	 * @see #getWSDLType()
	 * @generated
	 */
	EAttribute getWSDLType_Role();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.WSDLType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see net.opengis.wfs.WSDLType#getShow()
	 * @see #getWSDLType()
	 * @generated
	 */
	EAttribute getWSDLType_Show();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.WSDLType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.wfs.WSDLType#getTitle()
	 * @see #getWSDLType()
	 * @generated
	 */
	EAttribute getWSDLType_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.WSDLType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.opengis.wfs.WSDLType#getType()
	 * @see #getWSDLType()
	 * @generated
	 */
	EAttribute getWSDLType_Type();

	/**
	 * Returns the meta object for enum '{@link net.opengis.wfs.AllSomeType <em>All Some Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>All Some Type</em>'.
	 * @see net.opengis.wfs.AllSomeType
	 * @generated
	 */
	EEnum getAllSomeType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.wfs.NonNegativeIntegerOrUnknownMember0 <em>Non Negative Integer Or Unknown Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Non Negative Integer Or Unknown Member0</em>'.
	 * @see net.opengis.wfs.NonNegativeIntegerOrUnknownMember0
	 * @generated
	 */
	EEnum getNonNegativeIntegerOrUnknownMember0();

	/**
	 * Returns the meta object for enum '{@link net.opengis.wfs.ResolveValueType <em>Resolve Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resolve Value Type</em>'.
	 * @see net.opengis.wfs.ResolveValueType
	 * @generated
	 */
	EEnum getResolveValueType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.wfs.ResultTypeType <em>Result Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Result Type Type</em>'.
	 * @see net.opengis.wfs.ResultTypeType
	 * @generated
	 */
	EEnum getResultTypeType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.wfs.StarStringType <em>Star String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Star String Type</em>'.
	 * @see net.opengis.wfs.StarStringType
	 * @generated
	 */
	EEnum getStarStringType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.wfs.StateValueTypeMember0 <em>State Value Type Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State Value Type Member0</em>'.
	 * @see net.opengis.wfs.StateValueTypeMember0
	 * @generated
	 */
	EEnum getStateValueTypeMember0();

	/**
	 * Returns the meta object for enum '{@link net.opengis.wfs.UpdateActionType <em>Update Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Update Action Type</em>'.
	 * @see net.opengis.wfs.UpdateActionType
	 * @generated
	 */
	EEnum getUpdateActionType();

	/**
	 * Returns the meta object for data type '{@link net.opengis.wfs.AllSomeType <em>All Some Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>All Some Type Object</em>'.
	 * @see net.opengis.wfs.AllSomeType
	 * @model instanceClass="net.opengis.wfs.AllSomeType"
	 *        extendedMetaData="name='AllSomeType:Object' baseType='AllSomeType'"
	 * @generated
	 */
	EDataType getAllSomeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Non Negative Integer Or Unknown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Non Negative Integer Or Unknown</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='nonNegativeIntegerOrUnknown' memberTypes='nonNegativeIntegerOrUnknown_._member_._0 nonNegativeIntegerOrUnknown_._member_._1'"
	 * @generated
	 */
	EDataType getNonNegativeIntegerOrUnknown();

	/**
	 * Returns the meta object for data type '{@link net.opengis.wfs.NonNegativeIntegerOrUnknownMember0 <em>Non Negative Integer Or Unknown Member0 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Non Negative Integer Or Unknown Member0 Object</em>'.
	 * @see net.opengis.wfs.NonNegativeIntegerOrUnknownMember0
	 * @model instanceClass="net.opengis.wfs.NonNegativeIntegerOrUnknownMember0"
	 *        extendedMetaData="name='nonNegativeIntegerOrUnknown_._member_._0:Object' baseType='nonNegativeIntegerOrUnknown_._member_._0'"
	 * @generated
	 */
	EDataType getNonNegativeIntegerOrUnknownMember0Object();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Non Negative Integer Or Unknown Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Non Negative Integer Or Unknown Member1</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='nonNegativeIntegerOrUnknown_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger'"
	 * @generated
	 */
	EDataType getNonNegativeIntegerOrUnknownMember1();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Positive Integer With Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positive Integer With Star</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='positiveIntegerWithStar' memberTypes='http://www.eclipse.org/emf/2003/XMLType#positiveInteger StarStringType'"
	 * @generated
	 */
	EDataType getPositiveIntegerWithStar();

	/**
	 * Returns the meta object for data type '{@link net.opengis.wfs.ResolveValueType <em>Resolve Value Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Resolve Value Type Object</em>'.
	 * @see net.opengis.wfs.ResolveValueType
	 * @model instanceClass="net.opengis.wfs.ResolveValueType"
	 *        extendedMetaData="name='ResolveValueType:Object' baseType='ResolveValueType'"
	 * @generated
	 */
	EDataType getResolveValueTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.opengis.wfs.ResultTypeType <em>Result Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Result Type Type Object</em>'.
	 * @see net.opengis.wfs.ResultTypeType
	 * @model instanceClass="net.opengis.wfs.ResultTypeType"
	 *        extendedMetaData="name='ResultTypeType:Object' baseType='ResultTypeType'"
	 * @generated
	 */
	EDataType getResultTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Return Feature Types List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Return Feature Types List Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='ReturnFeatureTypesListType' itemType='http://www.eclipse.org/emf/2003/XMLType#QName'"
	 * @generated
	 */
	EDataType getReturnFeatureTypesListType();

	/**
	 * Returns the meta object for data type '{@link net.opengis.wfs.StarStringType <em>Star String Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Star String Type Object</em>'.
	 * @see net.opengis.wfs.StarStringType
	 * @model instanceClass="net.opengis.wfs.StarStringType"
	 *        extendedMetaData="name='StarStringType:Object' baseType='StarStringType'"
	 * @generated
	 */
	EDataType getStarStringTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>State Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>State Value Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='StateValueType' memberTypes='StateValueType_._member_._0 StateValueType_._member_._1'"
	 * @generated
	 */
	EDataType getStateValueType();

	/**
	 * Returns the meta object for data type '{@link net.opengis.wfs.StateValueTypeMember0 <em>State Value Type Member0 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>State Value Type Member0 Object</em>'.
	 * @see net.opengis.wfs.StateValueTypeMember0
	 * @model instanceClass="net.opengis.wfs.StateValueTypeMember0"
	 *        extendedMetaData="name='StateValueType_._member_._0:Object' baseType='StateValueType_._member_._0'"
	 * @generated
	 */
	EDataType getStateValueTypeMember0Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>State Value Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>State Value Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='StateValueType_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='other:\\w{2,}'"
	 * @generated
	 */
	EDataType getStateValueTypeMember1();

	/**
	 * Returns the meta object for data type '{@link net.opengis.wfs.UpdateActionType <em>Update Action Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Update Action Type Object</em>'.
	 * @see net.opengis.wfs.UpdateActionType
	 * @model instanceClass="net.opengis.wfs.UpdateActionType"
	 *        extendedMetaData="name='UpdateActionType:Object' baseType='UpdateActionType'"
	 * @generated
	 */
	EDataType getUpdateActionTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version String Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='VersionStringType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='2\\.0\\.\\d+'"
	 * @generated
	 */
	EDataType getVersionStringType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WFSFactory getWFSFactory();

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
		 * The meta object literal for the '{@link net.opengis.wfs.impl.AbstractTransactionActionTypeImpl <em>Abstract Transaction Action Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.AbstractTransactionActionTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getAbstractTransactionActionType()
		 * @generated
		 */
		EClass ABSTRACT_TRANSACTION_ACTION_TYPE = eINSTANCE.getAbstractTransactionActionType();

		/**
		 * The meta object literal for the '<em><b>Handle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TRANSACTION_ACTION_TYPE__HANDLE = eINSTANCE.getAbstractTransactionActionType_Handle();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.AbstractTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getAbstractType()
		 * @generated
		 */
		EClass ABSTRACT_TYPE = eINSTANCE.getAbstractType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TYPE__VALUE = eINSTANCE.getAbstractType_Value();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TYPE__LANG = eINSTANCE.getAbstractType_Lang();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.ActionResultsTypeImpl <em>Action Results Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.ActionResultsTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getActionResultsType()
		 * @generated
		 */
		EClass ACTION_RESULTS_TYPE = eINSTANCE.getActionResultsType();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_RESULTS_TYPE__FEATURE = eINSTANCE.getActionResultsType_Feature();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.AdditionalObjectsTypeImpl <em>Additional Objects Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.AdditionalObjectsTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getAdditionalObjectsType()
		 * @generated
		 */
		EClass ADDITIONAL_OBJECTS_TYPE = eINSTANCE.getAdditionalObjectsType();

		/**
		 * The meta object literal for the '<em><b>Value Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_OBJECTS_TYPE__VALUE_COLLECTION = eINSTANCE.getAdditionalObjectsType_ValueCollection();

		/**
		 * The meta object literal for the '<em><b>Simple Feature Collection Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_OBJECTS_TYPE__SIMPLE_FEATURE_COLLECTION_GROUP = eINSTANCE.getAdditionalObjectsType_SimpleFeatureCollectionGroup();

		/**
		 * The meta object literal for the '<em><b>Simple Feature Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_OBJECTS_TYPE__SIMPLE_FEATURE_COLLECTION = eINSTANCE.getAdditionalObjectsType_SimpleFeatureCollection();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.AdditionalValuesTypeImpl <em>Additional Values Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.AdditionalValuesTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getAdditionalValuesType()
		 * @generated
		 */
		EClass ADDITIONAL_VALUES_TYPE = eINSTANCE.getAdditionalValuesType();

		/**
		 * The meta object literal for the '<em><b>Value Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_VALUES_TYPE__VALUE_COLLECTION = eINSTANCE.getAdditionalValuesType_ValueCollection();

		/**
		 * The meta object literal for the '<em><b>Simple Feature Collection Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_VALUES_TYPE__SIMPLE_FEATURE_COLLECTION_GROUP = eINSTANCE.getAdditionalValuesType_SimpleFeatureCollectionGroup();

		/**
		 * The meta object literal for the '<em><b>Simple Feature Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_VALUES_TYPE__SIMPLE_FEATURE_COLLECTION = eINSTANCE.getAdditionalValuesType_SimpleFeatureCollection();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.BaseRequestTypeImpl <em>Base Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.BaseRequestTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getBaseRequestType()
		 * @generated
		 */
		EClass BASE_REQUEST_TYPE = eINSTANCE.getBaseRequestType();

		/**
		 * The meta object literal for the '<em><b>Handle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_REQUEST_TYPE__HANDLE = eINSTANCE.getBaseRequestType_Handle();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_REQUEST_TYPE__SERVICE = eINSTANCE.getBaseRequestType_Service();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_REQUEST_TYPE__VERSION = eINSTANCE.getBaseRequestType_Version();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.CreatedOrModifiedFeatureTypeImpl <em>Created Or Modified Feature Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.CreatedOrModifiedFeatureTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getCreatedOrModifiedFeatureType()
		 * @generated
		 */
		EClass CREATED_OR_MODIFIED_FEATURE_TYPE = eINSTANCE.getCreatedOrModifiedFeatureType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATED_OR_MODIFIED_FEATURE_TYPE__GROUP = eINSTANCE.getCreatedOrModifiedFeatureType_Group();

		/**
		 * The meta object literal for the '<em><b>Resource Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATED_OR_MODIFIED_FEATURE_TYPE__RESOURCE_ID = eINSTANCE.getCreatedOrModifiedFeatureType_ResourceId();

		/**
		 * The meta object literal for the '<em><b>Handle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATED_OR_MODIFIED_FEATURE_TYPE__HANDLE = eINSTANCE.getCreatedOrModifiedFeatureType_Handle();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.CreateStoredQueryResponseTypeImpl <em>Create Stored Query Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.CreateStoredQueryResponseTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getCreateStoredQueryResponseType()
		 * @generated
		 */
		EClass CREATE_STORED_QUERY_RESPONSE_TYPE = eINSTANCE.getCreateStoredQueryResponseType();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.CreateStoredQueryTypeImpl <em>Create Stored Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.CreateStoredQueryTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getCreateStoredQueryType()
		 * @generated
		 */
		EClass CREATE_STORED_QUERY_TYPE = eINSTANCE.getCreateStoredQueryType();

		/**
		 * The meta object literal for the '<em><b>Stored Query Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_STORED_QUERY_TYPE__STORED_QUERY_DEFINITION = eINSTANCE.getCreateStoredQueryType_StoredQueryDefinition();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.DeleteTypeImpl <em>Delete Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.DeleteTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getDeleteType()
		 * @generated
		 */
		EClass DELETE_TYPE = eINSTANCE.getDeleteType();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_TYPE__FILTER = eINSTANCE.getDeleteType_Filter();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_TYPE__TYPE_NAME = eINSTANCE.getDeleteType_TypeName();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.DescribeFeatureTypeTypeImpl <em>Describe Feature Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.DescribeFeatureTypeTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getDescribeFeatureTypeType()
		 * @generated
		 */
		EClass DESCRIBE_FEATURE_TYPE_TYPE = eINSTANCE.getDescribeFeatureTypeType();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBE_FEATURE_TYPE_TYPE__TYPE_NAME = eINSTANCE.getDescribeFeatureTypeType_TypeName();

		/**
		 * The meta object literal for the '<em><b>Output Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBE_FEATURE_TYPE_TYPE__OUTPUT_FORMAT = eINSTANCE.getDescribeFeatureTypeType_OutputFormat();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.DescribeStoredQueriesResponseTypeImpl <em>Describe Stored Queries Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.DescribeStoredQueriesResponseTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getDescribeStoredQueriesResponseType()
		 * @generated
		 */
		EClass DESCRIBE_STORED_QUERIES_RESPONSE_TYPE = eINSTANCE.getDescribeStoredQueriesResponseType();

		/**
		 * The meta object literal for the '<em><b>Stored Query Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIBE_STORED_QUERIES_RESPONSE_TYPE__STORED_QUERY_DESCRIPTION = eINSTANCE.getDescribeStoredQueriesResponseType_StoredQueryDescription();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.DescribeStoredQueriesTypeImpl <em>Describe Stored Queries Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.DescribeStoredQueriesTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getDescribeStoredQueriesType()
		 * @generated
		 */
		EClass DESCRIBE_STORED_QUERIES_TYPE = eINSTANCE.getDescribeStoredQueriesType();

		/**
		 * The meta object literal for the '<em><b>Stored Query Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBE_STORED_QUERIES_TYPE__STORED_QUERY_ID = eINSTANCE.getDescribeStoredQueriesType_StoredQueryId();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.DocumentRootImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Abstract</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ABSTRACT = eINSTANCE.getDocumentRoot_Abstract();

		/**
		 * The meta object literal for the '<em><b>Abstract Transaction Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ABSTRACT_TRANSACTION_ACTION = eINSTANCE.getDocumentRoot_AbstractTransactionAction();

		/**
		 * The meta object literal for the '<em><b>Additional Objects</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ADDITIONAL_OBJECTS = eINSTANCE.getDocumentRoot_AdditionalObjects();

		/**
		 * The meta object literal for the '<em><b>Additional Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ADDITIONAL_VALUES = eINSTANCE.getDocumentRoot_AdditionalValues();

		/**
		 * The meta object literal for the '<em><b>Bounded By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BOUNDED_BY = eINSTANCE.getDocumentRoot_BoundedBy();

		/**
		 * The meta object literal for the '<em><b>Create Stored Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CREATE_STORED_QUERY = eINSTANCE.getDocumentRoot_CreateStoredQuery();

		/**
		 * The meta object literal for the '<em><b>Create Stored Query Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CREATE_STORED_QUERY_RESPONSE = eINSTANCE.getDocumentRoot_CreateStoredQueryResponse();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DELETE = eINSTANCE.getDocumentRoot_Delete();

		/**
		 * The meta object literal for the '<em><b>Describe Feature Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DESCRIBE_FEATURE_TYPE = eINSTANCE.getDocumentRoot_DescribeFeatureType();

		/**
		 * The meta object literal for the '<em><b>Describe Stored Queries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DESCRIBE_STORED_QUERIES = eINSTANCE.getDocumentRoot_DescribeStoredQueries();

		/**
		 * The meta object literal for the '<em><b>Describe Stored Queries Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DESCRIBE_STORED_QUERIES_RESPONSE = eINSTANCE.getDocumentRoot_DescribeStoredQueriesResponse();

		/**
		 * The meta object literal for the '<em><b>Drop Stored Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DROP_STORED_QUERY = eINSTANCE.getDocumentRoot_DropStoredQuery();

		/**
		 * The meta object literal for the '<em><b>Drop Stored Query Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DROP_STORED_QUERY_RESPONSE = eINSTANCE.getDocumentRoot_DropStoredQueryResponse();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ELEMENT = eINSTANCE.getDocumentRoot_Element();

		/**
		 * The meta object literal for the '<em><b>Feature Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FEATURE_COLLECTION = eINSTANCE.getDocumentRoot_FeatureCollection();

		/**
		 * The meta object literal for the '<em><b>Simple Feature Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIMPLE_FEATURE_COLLECTION = eINSTANCE.getDocumentRoot_SimpleFeatureCollection();

		/**
		 * The meta object literal for the '<em><b>Feature Type List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FEATURE_TYPE_LIST = eINSTANCE.getDocumentRoot_FeatureTypeList();

		/**
		 * The meta object literal for the '<em><b>Get Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_CAPABILITIES = eINSTANCE.getDocumentRoot_GetCapabilities();

		/**
		 * The meta object literal for the '<em><b>Get Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_FEATURE = eINSTANCE.getDocumentRoot_GetFeature();

		/**
		 * The meta object literal for the '<em><b>Get Feature With Lock</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_FEATURE_WITH_LOCK = eINSTANCE.getDocumentRoot_GetFeatureWithLock();

		/**
		 * The meta object literal for the '<em><b>Get Property Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_PROPERTY_VALUE = eINSTANCE.getDocumentRoot_GetPropertyValue();

		/**
		 * The meta object literal for the '<em><b>Insert</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INSERT = eINSTANCE.getDocumentRoot_Insert();

		/**
		 * The meta object literal for the '<em><b>List Stored Queries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LIST_STORED_QUERIES = eINSTANCE.getDocumentRoot_ListStoredQueries();

		/**
		 * The meta object literal for the '<em><b>List Stored Queries Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LIST_STORED_QUERIES_RESPONSE = eINSTANCE.getDocumentRoot_ListStoredQueriesResponse();

		/**
		 * The meta object literal for the '<em><b>Lock Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCK_FEATURE = eINSTANCE.getDocumentRoot_LockFeature();

		/**
		 * The meta object literal for the '<em><b>Lock Feature Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCK_FEATURE_RESPONSE = eINSTANCE.getDocumentRoot_LockFeatureResponse();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MEMBER = eINSTANCE.getDocumentRoot_Member();

		/**
		 * The meta object literal for the '<em><b>Native</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NATIVE = eINSTANCE.getDocumentRoot_Native();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY = eINSTANCE.getDocumentRoot_Property();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_NAME = eINSTANCE.getDocumentRoot_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__QUERY = eINSTANCE.getDocumentRoot_Query();

		/**
		 * The meta object literal for the '<em><b>Replace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REPLACE = eINSTANCE.getDocumentRoot_Replace();

		/**
		 * The meta object literal for the '<em><b>Stored Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STORED_QUERY = eINSTANCE.getDocumentRoot_StoredQuery();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TITLE = eINSTANCE.getDocumentRoot_Title();

		/**
		 * The meta object literal for the '<em><b>Transaction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSACTION = eINSTANCE.getDocumentRoot_Transaction();

		/**
		 * The meta object literal for the '<em><b>Transaction Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSACTION_RESPONSE = eINSTANCE.getDocumentRoot_TransactionResponse();

		/**
		 * The meta object literal for the '<em><b>Truncated Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRUNCATED_RESPONSE = eINSTANCE.getDocumentRoot_TruncatedResponse();

		/**
		 * The meta object literal for the '<em><b>Tuple</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TUPLE = eINSTANCE.getDocumentRoot_Tuple();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UPDATE = eINSTANCE.getDocumentRoot_Update();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALUE = eINSTANCE.getDocumentRoot_Value();

		/**
		 * The meta object literal for the '<em><b>Value Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALUE_COLLECTION = eINSTANCE.getDocumentRoot_ValueCollection();

		/**
		 * The meta object literal for the '<em><b>Value List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALUE_LIST = eINSTANCE.getDocumentRoot_ValueList();

		/**
		 * The meta object literal for the '<em><b>WFS Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WFS_CAPABILITIES = eINSTANCE.getDocumentRoot_WFSCapabilities();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.DropStoredQueryTypeImpl <em>Drop Stored Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.DropStoredQueryTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getDropStoredQueryType()
		 * @generated
		 */
		EClass DROP_STORED_QUERY_TYPE = eINSTANCE.getDropStoredQueryType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_STORED_QUERY_TYPE__ID = eINSTANCE.getDropStoredQueryType_Id();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.ElementTypeImpl <em>Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.ElementTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getElementType()
		 * @generated
		 */
		EClass ELEMENT_TYPE = eINSTANCE.getElementType();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TYPE__METADATA = eINSTANCE.getElementType_Metadata();

		/**
		 * The meta object literal for the '<em><b>Value List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TYPE__VALUE_LIST = eINSTANCE.getElementType_ValueList();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TYPE__NAME = eINSTANCE.getElementType_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TYPE__TYPE = eINSTANCE.getElementType_Type();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.EmptyTypeImpl <em>Empty Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.EmptyTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getEmptyType()
		 * @generated
		 */
		EClass EMPTY_TYPE = eINSTANCE.getEmptyType();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.EnvelopePropertyTypeImpl <em>Envelope Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.EnvelopePropertyTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getEnvelopePropertyType()
		 * @generated
		 */
		EClass ENVELOPE_PROPERTY_TYPE = eINSTANCE.getEnvelopePropertyType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVELOPE_PROPERTY_TYPE__ANY = eINSTANCE.getEnvelopePropertyType_Any();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.ExecutionStatusTypeImpl <em>Execution Status Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.ExecutionStatusTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getExecutionStatusType()
		 * @generated
		 */
		EClass EXECUTION_STATUS_TYPE = eINSTANCE.getExecutionStatusType();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_STATUS_TYPE__STATUS = eINSTANCE.getExecutionStatusType_Status();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.ExtendedDescriptionTypeImpl <em>Extended Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.ExtendedDescriptionTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getExtendedDescriptionType()
		 * @generated
		 */
		EClass EXTENDED_DESCRIPTION_TYPE = eINSTANCE.getExtendedDescriptionType();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_DESCRIPTION_TYPE__ELEMENT = eINSTANCE.getExtendedDescriptionType_Element();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.FeatureCollectionTypeImpl <em>Feature Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.FeatureCollectionTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getFeatureCollectionType()
		 * @generated
		 */
		EClass FEATURE_COLLECTION_TYPE = eINSTANCE.getFeatureCollectionType();

		/**
		 * The meta object literal for the '<em><b>Additional Objects</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_COLLECTION_TYPE__ADDITIONAL_OBJECTS = eINSTANCE.getFeatureCollectionType_AdditionalObjects();

		/**
		 * The meta object literal for the '<em><b>Truncated Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_COLLECTION_TYPE__TRUNCATED_RESPONSE = eINSTANCE.getFeatureCollectionType_TruncatedResponse();

		/**
		 * The meta object literal for the '<em><b>Lock Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_COLLECTION_TYPE__LOCK_ID = eINSTANCE.getFeatureCollectionType_LockId();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_COLLECTION_TYPE__NEXT = eINSTANCE.getFeatureCollectionType_Next();

		/**
		 * The meta object literal for the '<em><b>Number Matched</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_COLLECTION_TYPE__NUMBER_MATCHED = eINSTANCE.getFeatureCollectionType_NumberMatched();

		/**
		 * The meta object literal for the '<em><b>Number Returned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_COLLECTION_TYPE__NUMBER_RETURNED = eINSTANCE.getFeatureCollectionType_NumberReturned();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_COLLECTION_TYPE__PREVIOUS = eINSTANCE.getFeatureCollectionType_Previous();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_COLLECTION_TYPE__TIME_STAMP = eINSTANCE.getFeatureCollectionType_TimeStamp();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.FeaturesLockedTypeImpl <em>Features Locked Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.FeaturesLockedTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getFeaturesLockedType()
		 * @generated
		 */
		EClass FEATURES_LOCKED_TYPE = eINSTANCE.getFeaturesLockedType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURES_LOCKED_TYPE__GROUP = eINSTANCE.getFeaturesLockedType_Group();

		/**
		 * The meta object literal for the '<em><b>Resource Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURES_LOCKED_TYPE__RESOURCE_ID = eINSTANCE.getFeaturesLockedType_ResourceId();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.FeaturesNotLockedTypeImpl <em>Features Not Locked Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.FeaturesNotLockedTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getFeaturesNotLockedType()
		 * @generated
		 */
		EClass FEATURES_NOT_LOCKED_TYPE = eINSTANCE.getFeaturesNotLockedType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURES_NOT_LOCKED_TYPE__GROUP = eINSTANCE.getFeaturesNotLockedType_Group();

		/**
		 * The meta object literal for the '<em><b>Resource Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURES_NOT_LOCKED_TYPE__RESOURCE_ID = eINSTANCE.getFeaturesNotLockedType_ResourceId();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.FeatureTypeListTypeImpl <em>Feature Type List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.FeatureTypeListTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getFeatureTypeListType()
		 * @generated
		 */
		EClass FEATURE_TYPE_LIST_TYPE = eINSTANCE.getFeatureTypeListType();

		/**
		 * The meta object literal for the '<em><b>Feature Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE_LIST_TYPE__FEATURE_TYPE = eINSTANCE.getFeatureTypeListType_FeatureType();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.FeatureTypeTypeImpl <em>Feature Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.FeatureTypeTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getFeatureTypeType()
		 * @generated
		 */
		EClass FEATURE_TYPE_TYPE = eINSTANCE.getFeatureTypeType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE_TYPE__NAME = eINSTANCE.getFeatureTypeType_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE_TYPE__TITLE = eINSTANCE.getFeatureTypeType_Title();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE_TYPE__ABSTRACT = eINSTANCE.getFeatureTypeType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE_TYPE__KEYWORDS = eINSTANCE.getFeatureTypeType_Keywords();

		/**
		 * The meta object literal for the '<em><b>Default CRS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE_TYPE__DEFAULT_CRS = eINSTANCE.getFeatureTypeType_DefaultCRS();

		/**
		 * The meta object literal for the '<em><b>Other CRS</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE_TYPE__OTHER_CRS = eINSTANCE.getFeatureTypeType_OtherCRS();

		/**
		 * The meta object literal for the '<em><b>No CRS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE_TYPE__NO_CRS = eINSTANCE.getFeatureTypeType_NoCRS();

		/**
		 * The meta object literal for the '<em><b>Output Formats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE_TYPE__OUTPUT_FORMATS = eINSTANCE.getFeatureTypeType_OutputFormats();

		/**
		 * The meta object literal for the '<em><b>WGS84 Bounding Box</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE_TYPE__WGS84_BOUNDING_BOX = eINSTANCE.getFeatureTypeType_WGS84BoundingBox();

		/**
		 * The meta object literal for the '<em><b>Metadata URL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE_TYPE__METADATA_URL = eINSTANCE.getFeatureTypeType_MetadataURL();

		/**
		 * The meta object literal for the '<em><b>Extended Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE_TYPE__EXTENDED_DESCRIPTION = eINSTANCE.getFeatureTypeType_ExtendedDescription();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.GetCapabilitiesTypeImpl <em>Get Capabilities Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.GetCapabilitiesTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getGetCapabilitiesType()
		 * @generated
		 */
		EClass GET_CAPABILITIES_TYPE = eINSTANCE.getGetCapabilitiesType();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CAPABILITIES_TYPE__SERVICE = eINSTANCE.getGetCapabilitiesType_Service();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.GetFeatureTypeImpl <em>Get Feature Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.GetFeatureTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getGetFeatureType()
		 * @generated
		 */
		EClass GET_FEATURE_TYPE = eINSTANCE.getGetFeatureType();

		/**
		 * The meta object literal for the '<em><b>Abstract Query Expression Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION_GROUP = eINSTANCE.getGetFeatureType_AbstractQueryExpressionGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Query Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION = eINSTANCE.getGetFeatureType_AbstractQueryExpression();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE_TYPE__COUNT = eINSTANCE.getGetFeatureType_Count();

		/**
		 * The meta object literal for the '<em><b>Output Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE_TYPE__OUTPUT_FORMAT = eINSTANCE.getGetFeatureType_OutputFormat();

		/**
		 * The meta object literal for the '<em><b>Resolve</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE_TYPE__RESOLVE = eINSTANCE.getGetFeatureType_Resolve();

		/**
		 * The meta object literal for the '<em><b>Resolve Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE_TYPE__RESOLVE_DEPTH = eINSTANCE.getGetFeatureType_ResolveDepth();

		/**
		 * The meta object literal for the '<em><b>Resolve Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE_TYPE__RESOLVE_TIMEOUT = eINSTANCE.getGetFeatureType_ResolveTimeout();

		/**
		 * The meta object literal for the '<em><b>Result Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE_TYPE__RESULT_TYPE = eINSTANCE.getGetFeatureType_ResultType();

		/**
		 * The meta object literal for the '<em><b>Start Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE_TYPE__START_INDEX = eINSTANCE.getGetFeatureType_StartIndex();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.GetFeatureWithLockTypeImpl <em>Get Feature With Lock Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.GetFeatureWithLockTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getGetFeatureWithLockType()
		 * @generated
		 */
		EClass GET_FEATURE_WITH_LOCK_TYPE = eINSTANCE.getGetFeatureWithLockType();

		/**
		 * The meta object literal for the '<em><b>Expiry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE_WITH_LOCK_TYPE__EXPIRY = eINSTANCE.getGetFeatureWithLockType_Expiry();

		/**
		 * The meta object literal for the '<em><b>Lock Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE_WITH_LOCK_TYPE__LOCK_ACTION = eINSTANCE.getGetFeatureWithLockType_LockAction();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.GetPropertyValueTypeImpl <em>Get Property Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.GetPropertyValueTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getGetPropertyValueType()
		 * @generated
		 */
		EClass GET_PROPERTY_VALUE_TYPE = eINSTANCE.getGetPropertyValueType();

		/**
		 * The meta object literal for the '<em><b>Abstract Query Expression Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_PROPERTY_VALUE_TYPE__ABSTRACT_QUERY_EXPRESSION_GROUP = eINSTANCE.getGetPropertyValueType_AbstractQueryExpressionGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Query Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_PROPERTY_VALUE_TYPE__ABSTRACT_QUERY_EXPRESSION = eINSTANCE.getGetPropertyValueType_AbstractQueryExpression();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_PROPERTY_VALUE_TYPE__COUNT = eINSTANCE.getGetPropertyValueType_Count();

		/**
		 * The meta object literal for the '<em><b>Output Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_PROPERTY_VALUE_TYPE__OUTPUT_FORMAT = eINSTANCE.getGetPropertyValueType_OutputFormat();

		/**
		 * The meta object literal for the '<em><b>Resolve</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_PROPERTY_VALUE_TYPE__RESOLVE = eINSTANCE.getGetPropertyValueType_Resolve();

		/**
		 * The meta object literal for the '<em><b>Resolve Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_PROPERTY_VALUE_TYPE__RESOLVE_DEPTH = eINSTANCE.getGetPropertyValueType_ResolveDepth();

		/**
		 * The meta object literal for the '<em><b>Resolve Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_PROPERTY_VALUE_TYPE__RESOLVE_PATH = eINSTANCE.getGetPropertyValueType_ResolvePath();

		/**
		 * The meta object literal for the '<em><b>Resolve Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_PROPERTY_VALUE_TYPE__RESOLVE_TIMEOUT = eINSTANCE.getGetPropertyValueType_ResolveTimeout();

		/**
		 * The meta object literal for the '<em><b>Result Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_PROPERTY_VALUE_TYPE__RESULT_TYPE = eINSTANCE.getGetPropertyValueType_ResultType();

		/**
		 * The meta object literal for the '<em><b>Start Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_PROPERTY_VALUE_TYPE__START_INDEX = eINSTANCE.getGetPropertyValueType_StartIndex();

		/**
		 * The meta object literal for the '<em><b>Value Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_PROPERTY_VALUE_TYPE__VALUE_REFERENCE = eINSTANCE.getGetPropertyValueType_ValueReference();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.InsertTypeImpl <em>Insert Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.InsertTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getInsertType()
		 * @generated
		 */
		EClass INSERT_TYPE = eINSTANCE.getInsertType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_TYPE__ANY = eINSTANCE.getInsertType_Any();

		/**
		 * The meta object literal for the '<em><b>Input Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_TYPE__INPUT_FORMAT = eINSTANCE.getInsertType_InputFormat();

		/**
		 * The meta object literal for the '<em><b>Srs Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_TYPE__SRS_NAME = eINSTANCE.getInsertType_SrsName();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.ListStoredQueriesResponseTypeImpl <em>List Stored Queries Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.ListStoredQueriesResponseTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getListStoredQueriesResponseType()
		 * @generated
		 */
		EClass LIST_STORED_QUERIES_RESPONSE_TYPE = eINSTANCE.getListStoredQueriesResponseType();

		/**
		 * The meta object literal for the '<em><b>Stored Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_STORED_QUERIES_RESPONSE_TYPE__STORED_QUERY = eINSTANCE.getListStoredQueriesResponseType_StoredQuery();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.ListStoredQueriesTypeImpl <em>List Stored Queries Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.ListStoredQueriesTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getListStoredQueriesType()
		 * @generated
		 */
		EClass LIST_STORED_QUERIES_TYPE = eINSTANCE.getListStoredQueriesType();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.LockFeatureResponseTypeImpl <em>Lock Feature Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.LockFeatureResponseTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getLockFeatureResponseType()
		 * @generated
		 */
		EClass LOCK_FEATURE_RESPONSE_TYPE = eINSTANCE.getLockFeatureResponseType();

		/**
		 * The meta object literal for the '<em><b>Features Locked</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCK_FEATURE_RESPONSE_TYPE__FEATURES_LOCKED = eINSTANCE.getLockFeatureResponseType_FeaturesLocked();

		/**
		 * The meta object literal for the '<em><b>Features Not Locked</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCK_FEATURE_RESPONSE_TYPE__FEATURES_NOT_LOCKED = eINSTANCE.getLockFeatureResponseType_FeaturesNotLocked();

		/**
		 * The meta object literal for the '<em><b>Lock Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCK_FEATURE_RESPONSE_TYPE__LOCK_ID = eINSTANCE.getLockFeatureResponseType_LockId();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.LockFeatureTypeImpl <em>Lock Feature Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.LockFeatureTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getLockFeatureType()
		 * @generated
		 */
		EClass LOCK_FEATURE_TYPE = eINSTANCE.getLockFeatureType();

		/**
		 * The meta object literal for the '<em><b>Abstract Query Expression Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCK_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION_GROUP = eINSTANCE.getLockFeatureType_AbstractQueryExpressionGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Query Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCK_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION = eINSTANCE.getLockFeatureType_AbstractQueryExpression();

		/**
		 * The meta object literal for the '<em><b>Expiry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCK_FEATURE_TYPE__EXPIRY = eINSTANCE.getLockFeatureType_Expiry();

		/**
		 * The meta object literal for the '<em><b>Lock Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCK_FEATURE_TYPE__LOCK_ACTION = eINSTANCE.getLockFeatureType_LockAction();

		/**
		 * The meta object literal for the '<em><b>Lock Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCK_FEATURE_TYPE__LOCK_ID = eINSTANCE.getLockFeatureType_LockId();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.MemberPropertyTypeImpl <em>Member Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.MemberPropertyTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getMemberPropertyType()
		 * @generated
		 */
		EClass MEMBER_PROPERTY_TYPE = eINSTANCE.getMemberPropertyType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_PROPERTY_TYPE__MIXED = eINSTANCE.getMemberPropertyType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_PROPERTY_TYPE__ANY = eINSTANCE.getMemberPropertyType_Any();

		/**
		 * The meta object literal for the '<em><b>Tuple</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_PROPERTY_TYPE__TUPLE = eINSTANCE.getMemberPropertyType_Tuple();

		/**
		 * The meta object literal for the '<em><b>Simple Feature Collection Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_PROPERTY_TYPE__SIMPLE_FEATURE_COLLECTION_GROUP = eINSTANCE.getMemberPropertyType_SimpleFeatureCollectionGroup();

		/**
		 * The meta object literal for the '<em><b>Simple Feature Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_PROPERTY_TYPE__SIMPLE_FEATURE_COLLECTION = eINSTANCE.getMemberPropertyType_SimpleFeatureCollection();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_PROPERTY_TYPE__ACTUATE = eINSTANCE.getMemberPropertyType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_PROPERTY_TYPE__ARCROLE = eINSTANCE.getMemberPropertyType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_PROPERTY_TYPE__HREF = eINSTANCE.getMemberPropertyType_Href();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_PROPERTY_TYPE__ROLE = eINSTANCE.getMemberPropertyType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_PROPERTY_TYPE__SHOW = eINSTANCE.getMemberPropertyType_Show();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_PROPERTY_TYPE__STATE = eINSTANCE.getMemberPropertyType_State();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_PROPERTY_TYPE__TITLE = eINSTANCE.getMemberPropertyType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_PROPERTY_TYPE__TYPE = eINSTANCE.getMemberPropertyType_Type();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.MetadataURLTypeImpl <em>Metadata URL Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.MetadataURLTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getMetadataURLType()
		 * @generated
		 */
		EClass METADATA_URL_TYPE = eINSTANCE.getMetadataURLType();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_URL_TYPE__ABOUT = eINSTANCE.getMetadataURLType_About();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_URL_TYPE__ACTUATE = eINSTANCE.getMetadataURLType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_URL_TYPE__ARCROLE = eINSTANCE.getMetadataURLType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_URL_TYPE__HREF = eINSTANCE.getMetadataURLType_Href();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_URL_TYPE__ROLE = eINSTANCE.getMetadataURLType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_URL_TYPE__SHOW = eINSTANCE.getMetadataURLType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_URL_TYPE__TITLE = eINSTANCE.getMetadataURLType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_URL_TYPE__TYPE = eINSTANCE.getMetadataURLType_Type();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.NativeTypeImpl <em>Native Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.NativeTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getNativeType()
		 * @generated
		 */
		EClass NATIVE_TYPE = eINSTANCE.getNativeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATIVE_TYPE__MIXED = eINSTANCE.getNativeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATIVE_TYPE__ANY = eINSTANCE.getNativeType_Any();

		/**
		 * The meta object literal for the '<em><b>Safe To Ignore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATIVE_TYPE__SAFE_TO_IGNORE = eINSTANCE.getNativeType_SafeToIgnore();

		/**
		 * The meta object literal for the '<em><b>Vendor Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATIVE_TYPE__VENDOR_ID = eINSTANCE.getNativeType_VendorId();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.NoCRSTypeImpl <em>No CRS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.NoCRSTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getNoCRSType()
		 * @generated
		 */
		EClass NO_CRS_TYPE = eINSTANCE.getNoCRSType();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.OutputFormatListTypeImpl <em>Output Format List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.OutputFormatListTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getOutputFormatListType()
		 * @generated
		 */
		EClass OUTPUT_FORMAT_LIST_TYPE = eINSTANCE.getOutputFormatListType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_FORMAT_LIST_TYPE__GROUP = eINSTANCE.getOutputFormatListType_Group();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_FORMAT_LIST_TYPE__FORMAT = eINSTANCE.getOutputFormatListType_Format();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.ParameterExpressionTypeImpl <em>Parameter Expression Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.ParameterExpressionTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getParameterExpressionType()
		 * @generated
		 */
		EClass PARAMETER_EXPRESSION_TYPE = eINSTANCE.getParameterExpressionType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_EXPRESSION_TYPE__TITLE = eINSTANCE.getParameterExpressionType_Title();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_EXPRESSION_TYPE__ABSTRACT = eINSTANCE.getParameterExpressionType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_EXPRESSION_TYPE__METADATA = eINSTANCE.getParameterExpressionType_Metadata();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_EXPRESSION_TYPE__NAME = eINSTANCE.getParameterExpressionType_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_EXPRESSION_TYPE__TYPE = eINSTANCE.getParameterExpressionType_Type();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.ParameterTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getParameterType()
		 * @generated
		 */
		EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__MIXED = eINSTANCE.getParameterType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__ANY = eINSTANCE.getParameterType_Any();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__NAME = eINSTANCE.getParameterType_Name();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.PropertyNameTypeImpl <em>Property Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.PropertyNameTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getPropertyNameType()
		 * @generated
		 */
		EClass PROPERTY_NAME_TYPE = eINSTANCE.getPropertyNameType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_NAME_TYPE__VALUE = eINSTANCE.getPropertyNameType_Value();

		/**
		 * The meta object literal for the '<em><b>Resolve</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_NAME_TYPE__RESOLVE = eINSTANCE.getPropertyNameType_Resolve();

		/**
		 * The meta object literal for the '<em><b>Resolve Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_NAME_TYPE__RESOLVE_DEPTH = eINSTANCE.getPropertyNameType_ResolveDepth();

		/**
		 * The meta object literal for the '<em><b>Resolve Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_NAME_TYPE__RESOLVE_PATH = eINSTANCE.getPropertyNameType_ResolvePath();

		/**
		 * The meta object literal for the '<em><b>Resolve Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_NAME_TYPE__RESOLVE_TIMEOUT = eINSTANCE.getPropertyNameType_ResolveTimeout();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.PropertyTypeImpl <em>Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.PropertyTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getPropertyType()
		 * @generated
		 */
		EClass PROPERTY_TYPE = eINSTANCE.getPropertyType();

		/**
		 * The meta object literal for the '<em><b>Value Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TYPE__VALUE_REFERENCE = eINSTANCE.getPropertyType_ValueReference();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TYPE__VALUE = eINSTANCE.getPropertyType_Value();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.QueryExpressionTextTypeImpl <em>Query Expression Text Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.QueryExpressionTextTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getQueryExpressionTextType()
		 * @generated
		 */
		EClass QUERY_EXPRESSION_TEXT_TYPE = eINSTANCE.getQueryExpressionTextType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_EXPRESSION_TEXT_TYPE__MIXED = eINSTANCE.getQueryExpressionTextType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_EXPRESSION_TEXT_TYPE__ANY = eINSTANCE.getQueryExpressionTextType_Any();

		/**
		 * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_EXPRESSION_TEXT_TYPE__ANY1 = eINSTANCE.getQueryExpressionTextType_Any1();

		/**
		 * The meta object literal for the '<em><b>Is Private</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_EXPRESSION_TEXT_TYPE__IS_PRIVATE = eINSTANCE.getQueryExpressionTextType_IsPrivate();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_EXPRESSION_TEXT_TYPE__LANGUAGE = eINSTANCE.getQueryExpressionTextType_Language();

		/**
		 * The meta object literal for the '<em><b>Return Feature Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_EXPRESSION_TEXT_TYPE__RETURN_FEATURE_TYPES = eINSTANCE.getQueryExpressionTextType_ReturnFeatureTypes();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.QueryTypeImpl <em>Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.QueryTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getQueryType()
		 * @generated
		 */
		EClass QUERY_TYPE = eINSTANCE.getQueryType();

		/**
		 * The meta object literal for the '<em><b>Feature Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_TYPE__FEATURE_VERSION = eINSTANCE.getQueryType_FeatureVersion();

		/**
		 * The meta object literal for the '<em><b>Srs Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_TYPE__SRS_NAME = eINSTANCE.getQueryType_SrsName();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.ReplaceTypeImpl <em>Replace Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.ReplaceTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getReplaceType()
		 * @generated
		 */
		EClass REPLACE_TYPE = eINSTANCE.getReplaceType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACE_TYPE__ANY = eINSTANCE.getReplaceType_Any();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACE_TYPE__FILTER = eINSTANCE.getReplaceType_Filter();

		/**
		 * The meta object literal for the '<em><b>Input Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACE_TYPE__INPUT_FORMAT = eINSTANCE.getReplaceType_InputFormat();

		/**
		 * The meta object literal for the '<em><b>Srs Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACE_TYPE__SRS_NAME = eINSTANCE.getReplaceType_SrsName();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.SimpleFeatureCollectionTypeImpl <em>Simple Feature Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.SimpleFeatureCollectionTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getSimpleFeatureCollectionType()
		 * @generated
		 */
		EClass SIMPLE_FEATURE_COLLECTION_TYPE = eINSTANCE.getSimpleFeatureCollectionType();

		/**
		 * The meta object literal for the '<em><b>Bounded By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_FEATURE_COLLECTION_TYPE__BOUNDED_BY = eINSTANCE.getSimpleFeatureCollectionType_BoundedBy();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_FEATURE_COLLECTION_TYPE__MEMBER = eINSTANCE.getSimpleFeatureCollectionType_Member();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.StoredQueryDescriptionTypeImpl <em>Stored Query Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.StoredQueryDescriptionTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getStoredQueryDescriptionType()
		 * @generated
		 */
		EClass STORED_QUERY_DESCRIPTION_TYPE = eINSTANCE.getStoredQueryDescriptionType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORED_QUERY_DESCRIPTION_TYPE__TITLE = eINSTANCE.getStoredQueryDescriptionType_Title();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORED_QUERY_DESCRIPTION_TYPE__ABSTRACT = eINSTANCE.getStoredQueryDescriptionType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORED_QUERY_DESCRIPTION_TYPE__METADATA = eINSTANCE.getStoredQueryDescriptionType_Metadata();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORED_QUERY_DESCRIPTION_TYPE__PARAMETER = eINSTANCE.getStoredQueryDescriptionType_Parameter();

		/**
		 * The meta object literal for the '<em><b>Query Expression Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORED_QUERY_DESCRIPTION_TYPE__QUERY_EXPRESSION_TEXT = eINSTANCE.getStoredQueryDescriptionType_QueryExpressionText();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORED_QUERY_DESCRIPTION_TYPE__ID = eINSTANCE.getStoredQueryDescriptionType_Id();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.StoredQueryListItemTypeImpl <em>Stored Query List Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.StoredQueryListItemTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getStoredQueryListItemType()
		 * @generated
		 */
		EClass STORED_QUERY_LIST_ITEM_TYPE = eINSTANCE.getStoredQueryListItemType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORED_QUERY_LIST_ITEM_TYPE__TITLE = eINSTANCE.getStoredQueryListItemType_Title();

		/**
		 * The meta object literal for the '<em><b>Return Feature Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORED_QUERY_LIST_ITEM_TYPE__RETURN_FEATURE_TYPE = eINSTANCE.getStoredQueryListItemType_ReturnFeatureType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORED_QUERY_LIST_ITEM_TYPE__ID = eINSTANCE.getStoredQueryListItemType_Id();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.StoredQueryTypeImpl <em>Stored Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.StoredQueryTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getStoredQueryType()
		 * @generated
		 */
		EClass STORED_QUERY_TYPE = eINSTANCE.getStoredQueryType();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORED_QUERY_TYPE__PARAMETER = eINSTANCE.getStoredQueryType_Parameter();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORED_QUERY_TYPE__ID = eINSTANCE.getStoredQueryType_Id();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.TitleTypeImpl <em>Title Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.TitleTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getTitleType()
		 * @generated
		 */
		EClass TITLE_TYPE = eINSTANCE.getTitleType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_TYPE__VALUE = eINSTANCE.getTitleType_Value();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_TYPE__LANG = eINSTANCE.getTitleType_Lang();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.TransactionResponseTypeImpl <em>Transaction Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.TransactionResponseTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getTransactionResponseType()
		 * @generated
		 */
		EClass TRANSACTION_RESPONSE_TYPE = eINSTANCE.getTransactionResponseType();

		/**
		 * The meta object literal for the '<em><b>Transaction Summary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_RESPONSE_TYPE__TRANSACTION_SUMMARY = eINSTANCE.getTransactionResponseType_TransactionSummary();

		/**
		 * The meta object literal for the '<em><b>Insert Results</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_RESPONSE_TYPE__INSERT_RESULTS = eINSTANCE.getTransactionResponseType_InsertResults();

		/**
		 * The meta object literal for the '<em><b>Update Results</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_RESPONSE_TYPE__UPDATE_RESULTS = eINSTANCE.getTransactionResponseType_UpdateResults();

		/**
		 * The meta object literal for the '<em><b>Replace Results</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_RESPONSE_TYPE__REPLACE_RESULTS = eINSTANCE.getTransactionResponseType_ReplaceResults();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_RESPONSE_TYPE__VERSION = eINSTANCE.getTransactionResponseType_Version();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.TransactionSummaryTypeImpl <em>Transaction Summary Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.TransactionSummaryTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getTransactionSummaryType()
		 * @generated
		 */
		EClass TRANSACTION_SUMMARY_TYPE = eINSTANCE.getTransactionSummaryType();

		/**
		 * The meta object literal for the '<em><b>Total Inserted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_SUMMARY_TYPE__TOTAL_INSERTED = eINSTANCE.getTransactionSummaryType_TotalInserted();

		/**
		 * The meta object literal for the '<em><b>Total Updated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_SUMMARY_TYPE__TOTAL_UPDATED = eINSTANCE.getTransactionSummaryType_TotalUpdated();

		/**
		 * The meta object literal for the '<em><b>Total Replaced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_SUMMARY_TYPE__TOTAL_REPLACED = eINSTANCE.getTransactionSummaryType_TotalReplaced();

		/**
		 * The meta object literal for the '<em><b>Total Deleted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_SUMMARY_TYPE__TOTAL_DELETED = eINSTANCE.getTransactionSummaryType_TotalDeleted();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.TransactionTypeImpl <em>Transaction Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.TransactionTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getTransactionType()
		 * @generated
		 */
		EClass TRANSACTION_TYPE = eINSTANCE.getTransactionType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__GROUP = eINSTANCE.getTransactionType_Group();

		/**
		 * The meta object literal for the '<em><b>Abstract Transaction Action Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__ABSTRACT_TRANSACTION_ACTION_GROUP = eINSTANCE.getTransactionType_AbstractTransactionActionGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Transaction Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_TYPE__ABSTRACT_TRANSACTION_ACTION = eINSTANCE.getTransactionType_AbstractTransactionAction();

		/**
		 * The meta object literal for the '<em><b>Lock Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__LOCK_ID = eINSTANCE.getTransactionType_LockId();

		/**
		 * The meta object literal for the '<em><b>Release Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__RELEASE_ACTION = eINSTANCE.getTransactionType_ReleaseAction();

		/**
		 * The meta object literal for the '<em><b>Srs Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__SRS_NAME = eINSTANCE.getTransactionType_SrsName();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.TruncatedResponseTypeImpl <em>Truncated Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.TruncatedResponseTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getTruncatedResponseType()
		 * @generated
		 */
		EClass TRUNCATED_RESPONSE_TYPE = eINSTANCE.getTruncatedResponseType();

		/**
		 * The meta object literal for the '<em><b>Exception Report</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRUNCATED_RESPONSE_TYPE__EXCEPTION_REPORT = eINSTANCE.getTruncatedResponseType_ExceptionReport();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.TupleTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getTupleType()
		 * @generated
		 */
		EClass TUPLE_TYPE = eINSTANCE.getTupleType();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_TYPE__MEMBER = eINSTANCE.getTupleType_Member();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.UpdateTypeImpl <em>Update Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.UpdateTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getUpdateType()
		 * @generated
		 */
		EClass UPDATE_TYPE = eINSTANCE.getUpdateType();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_TYPE__PROPERTY = eINSTANCE.getUpdateType_Property();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_TYPE__FILTER = eINSTANCE.getUpdateType_Filter();

		/**
		 * The meta object literal for the '<em><b>Input Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_TYPE__INPUT_FORMAT = eINSTANCE.getUpdateType_InputFormat();

		/**
		 * The meta object literal for the '<em><b>Srs Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_TYPE__SRS_NAME = eINSTANCE.getUpdateType_SrsName();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_TYPE__TYPE_NAME = eINSTANCE.getUpdateType_TypeName();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.ValueCollectionTypeImpl <em>Value Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.ValueCollectionTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getValueCollectionType()
		 * @generated
		 */
		EClass VALUE_COLLECTION_TYPE = eINSTANCE.getValueCollectionType();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_COLLECTION_TYPE__MEMBER = eINSTANCE.getValueCollectionType_Member();

		/**
		 * The meta object literal for the '<em><b>Additional Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_COLLECTION_TYPE__ADDITIONAL_VALUES = eINSTANCE.getValueCollectionType_AdditionalValues();

		/**
		 * The meta object literal for the '<em><b>Truncated Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_COLLECTION_TYPE__TRUNCATED_RESPONSE = eINSTANCE.getValueCollectionType_TruncatedResponse();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_COLLECTION_TYPE__NEXT = eINSTANCE.getValueCollectionType_Next();

		/**
		 * The meta object literal for the '<em><b>Number Matched</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_COLLECTION_TYPE__NUMBER_MATCHED = eINSTANCE.getValueCollectionType_NumberMatched();

		/**
		 * The meta object literal for the '<em><b>Number Returned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_COLLECTION_TYPE__NUMBER_RETURNED = eINSTANCE.getValueCollectionType_NumberReturned();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_COLLECTION_TYPE__PREVIOUS = eINSTANCE.getValueCollectionType_Previous();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_COLLECTION_TYPE__TIME_STAMP = eINSTANCE.getValueCollectionType_TimeStamp();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.ValueListTypeImpl <em>Value List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.ValueListTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getValueListType()
		 * @generated
		 */
		EClass VALUE_LIST_TYPE = eINSTANCE.getValueListType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_LIST_TYPE__GROUP = eINSTANCE.getValueListType_Group();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_LIST_TYPE__VALUE = eINSTANCE.getValueListType_Value();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.ValueReferenceTypeImpl <em>Value Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.ValueReferenceTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getValueReferenceType()
		 * @generated
		 */
		EClass VALUE_REFERENCE_TYPE = eINSTANCE.getValueReferenceType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_REFERENCE_TYPE__VALUE = eINSTANCE.getValueReferenceType_Value();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_REFERENCE_TYPE__ACTION = eINSTANCE.getValueReferenceType_Action();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.WFSCapabilitiesTypeImpl <em>Capabilities Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.WFSCapabilitiesTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getWFSCapabilitiesType()
		 * @generated
		 */
		EClass WFS_CAPABILITIES_TYPE = eINSTANCE.getWFSCapabilitiesType();

		/**
		 * The meta object literal for the '<em><b>WSDL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WFS_CAPABILITIES_TYPE__WSDL = eINSTANCE.getWFSCapabilitiesType_WSDL();

		/**
		 * The meta object literal for the '<em><b>Feature Type List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WFS_CAPABILITIES_TYPE__FEATURE_TYPE_LIST = eINSTANCE.getWFSCapabilitiesType_FeatureTypeList();

		/**
		 * The meta object literal for the '<em><b>Filter Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WFS_CAPABILITIES_TYPE__FILTER_CAPABILITIES = eINSTANCE.getWFSCapabilitiesType_FilterCapabilities();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.WSDLTypeImpl <em>WSDL Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.WSDLTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getWSDLType()
		 * @generated
		 */
		EClass WSDL_TYPE = eINSTANCE.getWSDLType();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_TYPE__ACTUATE = eINSTANCE.getWSDLType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_TYPE__ARCROLE = eINSTANCE.getWSDLType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_TYPE__HREF = eINSTANCE.getWSDLType_Href();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_TYPE__ROLE = eINSTANCE.getWSDLType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_TYPE__SHOW = eINSTANCE.getWSDLType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_TYPE__TITLE = eINSTANCE.getWSDLType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_TYPE__TYPE = eINSTANCE.getWSDLType_Type();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.AllSomeType <em>All Some Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.AllSomeType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getAllSomeType()
		 * @generated
		 */
		EEnum ALL_SOME_TYPE = eINSTANCE.getAllSomeType();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.NonNegativeIntegerOrUnknownMember0 <em>Non Negative Integer Or Unknown Member0</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.NonNegativeIntegerOrUnknownMember0
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getNonNegativeIntegerOrUnknownMember0()
		 * @generated
		 */
		EEnum NON_NEGATIVE_INTEGER_OR_UNKNOWN_MEMBER0 = eINSTANCE.getNonNegativeIntegerOrUnknownMember0();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.ResolveValueType <em>Resolve Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.ResolveValueType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getResolveValueType()
		 * @generated
		 */
		EEnum RESOLVE_VALUE_TYPE = eINSTANCE.getResolveValueType();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.ResultTypeType <em>Result Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.ResultTypeType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getResultTypeType()
		 * @generated
		 */
		EEnum RESULT_TYPE_TYPE = eINSTANCE.getResultTypeType();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.StarStringType <em>Star String Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.StarStringType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getStarStringType()
		 * @generated
		 */
		EEnum STAR_STRING_TYPE = eINSTANCE.getStarStringType();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.StateValueTypeMember0 <em>State Value Type Member0</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.StateValueTypeMember0
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getStateValueTypeMember0()
		 * @generated
		 */
		EEnum STATE_VALUE_TYPE_MEMBER0 = eINSTANCE.getStateValueTypeMember0();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.UpdateActionType <em>Update Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.UpdateActionType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getUpdateActionType()
		 * @generated
		 */
		EEnum UPDATE_ACTION_TYPE = eINSTANCE.getUpdateActionType();

		/**
		 * The meta object literal for the '<em>All Some Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.AllSomeType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getAllSomeTypeObject()
		 * @generated
		 */
		EDataType ALL_SOME_TYPE_OBJECT = eINSTANCE.getAllSomeTypeObject();

		/**
		 * The meta object literal for the '<em>Non Negative Integer Or Unknown</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getNonNegativeIntegerOrUnknown()
		 * @generated
		 */
		EDataType NON_NEGATIVE_INTEGER_OR_UNKNOWN = eINSTANCE.getNonNegativeIntegerOrUnknown();

		/**
		 * The meta object literal for the '<em>Non Negative Integer Or Unknown Member0 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.NonNegativeIntegerOrUnknownMember0
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getNonNegativeIntegerOrUnknownMember0Object()
		 * @generated
		 */
		EDataType NON_NEGATIVE_INTEGER_OR_UNKNOWN_MEMBER0_OBJECT = eINSTANCE.getNonNegativeIntegerOrUnknownMember0Object();

		/**
		 * The meta object literal for the '<em>Non Negative Integer Or Unknown Member1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getNonNegativeIntegerOrUnknownMember1()
		 * @generated
		 */
		EDataType NON_NEGATIVE_INTEGER_OR_UNKNOWN_MEMBER1 = eINSTANCE.getNonNegativeIntegerOrUnknownMember1();

		/**
		 * The meta object literal for the '<em>Positive Integer With Star</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getPositiveIntegerWithStar()
		 * @generated
		 */
		EDataType POSITIVE_INTEGER_WITH_STAR = eINSTANCE.getPositiveIntegerWithStar();

		/**
		 * The meta object literal for the '<em>Resolve Value Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.ResolveValueType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getResolveValueTypeObject()
		 * @generated
		 */
		EDataType RESOLVE_VALUE_TYPE_OBJECT = eINSTANCE.getResolveValueTypeObject();

		/**
		 * The meta object literal for the '<em>Result Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.ResultTypeType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getResultTypeTypeObject()
		 * @generated
		 */
		EDataType RESULT_TYPE_TYPE_OBJECT = eINSTANCE.getResultTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Return Feature Types List Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getReturnFeatureTypesListType()
		 * @generated
		 */
		EDataType RETURN_FEATURE_TYPES_LIST_TYPE = eINSTANCE.getReturnFeatureTypesListType();

		/**
		 * The meta object literal for the '<em>Star String Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.StarStringType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getStarStringTypeObject()
		 * @generated
		 */
		EDataType STAR_STRING_TYPE_OBJECT = eINSTANCE.getStarStringTypeObject();

		/**
		 * The meta object literal for the '<em>State Value Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getStateValueType()
		 * @generated
		 */
		EDataType STATE_VALUE_TYPE = eINSTANCE.getStateValueType();

		/**
		 * The meta object literal for the '<em>State Value Type Member0 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.StateValueTypeMember0
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getStateValueTypeMember0Object()
		 * @generated
		 */
		EDataType STATE_VALUE_TYPE_MEMBER0_OBJECT = eINSTANCE.getStateValueTypeMember0Object();

		/**
		 * The meta object literal for the '<em>State Value Type Member1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getStateValueTypeMember1()
		 * @generated
		 */
		EDataType STATE_VALUE_TYPE_MEMBER1 = eINSTANCE.getStateValueTypeMember1();

		/**
		 * The meta object literal for the '<em>Update Action Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.UpdateActionType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getUpdateActionTypeObject()
		 * @generated
		 */
		EDataType UPDATE_ACTION_TYPE_OBJECT = eINSTANCE.getUpdateActionTypeObject();

		/**
		 * The meta object literal for the '<em>Version String Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getVersionStringType()
		 * @generated
		 */
		EDataType VERSION_STRING_TYPE = eINSTANCE.getVersionStringType();

	}

} //WFSPackage
