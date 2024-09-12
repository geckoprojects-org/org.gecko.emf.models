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
package org.w3._1999.xlink;


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
 * @see org.w3._1999.xlink.XlinkFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = XlinkPackage.eNS_URI, genModel = "/model/xlink.genmodel", genModelSourceLocations = {"model/xlink.genmodel","org.w3.xlink.model/model/xlink.genmodel"}, ecore="/model/xlink.ecore", ecoreSourceLocations="/model/xlink.ecore")
public interface XlinkPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xlink";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/1999/xlink";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xlink";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XlinkPackage eINSTANCE = org.w3._1999.xlink.impl.XlinkPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.w3._1999.xlink.impl.ArcTypeImpl <em>Arc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._1999.xlink.impl.ArcTypeImpl
	 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getArcType()
	 * @generated
	 */
	int ARC_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Title Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__TITLE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__ACTUATE = 2;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__ARCROLE = 3;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__FROM = 4;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__SHOW = 5;

	/**
	 * The feature id for the '<em><b>Title1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__TITLE1 = 6;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__TO = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__TYPE = 8;

	/**
	 * The number of structural features of the '<em>Arc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Arc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._1999.xlink.impl.ExtendedImpl <em>Extended</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._1999.xlink.impl.ExtendedImpl
	 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getExtended()
	 * @generated
	 */
	int EXTENDED = 1;

	/**
	 * The feature id for the '<em><b>Extended Model</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED__EXTENDED_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Title Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED__TITLE_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Resource Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED__RESOURCE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED__RESOURCE = 4;

	/**
	 * The feature id for the '<em><b>Locator Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED__LOCATOR_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Locator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED__LOCATOR = 6;

	/**
	 * The feature id for the '<em><b>Arc Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED__ARC_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED__ARC = 8;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED__ROLE = 9;

	/**
	 * The feature id for the '<em><b>Title1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED__TITLE1 = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED__TYPE = 11;

	/**
	 * The number of structural features of the '<em>Extended</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Extended</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._1999.xlink.impl.LocatorTypeImpl <em>Locator Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._1999.xlink.impl.LocatorTypeImpl
	 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getLocatorType()
	 * @generated
	 */
	int LOCATOR_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Title Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATOR_TYPE__TITLE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATOR_TYPE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATOR_TYPE__HREF = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATOR_TYPE__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATOR_TYPE__ROLE = 4;

	/**
	 * The feature id for the '<em><b>Title1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATOR_TYPE__TITLE1 = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATOR_TYPE__TYPE = 6;

	/**
	 * The number of structural features of the '<em>Locator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATOR_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Locator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATOR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._1999.xlink.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._1999.xlink.impl.ResourceTypeImpl
	 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ROLE = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__TITLE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._1999.xlink.impl.SimpleImpl <em>Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._1999.xlink.impl.SimpleImpl
	 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getSimple()
	 * @generated
	 */
	int SIMPLE = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__ACTUATE = 2;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__ARCROLE = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__HREF = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__ROLE = 5;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__SHOW = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__TITLE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__TYPE = 8;

	/**
	 * The number of structural features of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._1999.xlink.impl.TitleEltTypeImpl <em>Title Elt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._1999.xlink.impl.TitleEltTypeImpl
	 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getTitleEltType()
	 * @generated
	 */
	int TITLE_ELT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_ELT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_ELT_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_ELT_TYPE__LANG = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_ELT_TYPE__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Title Elt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_ELT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Title Elt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_ELT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._1999.xlink.impl.XlinkDocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._1999.xlink.impl.XlinkDocumentRootImpl
	 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getXlinkDocumentRoot()
	 * @generated
	 */
	int XLINK_DOCUMENT_ROOT = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_DOCUMENT_ROOT__ARC = 3;

	/**
	 * The feature id for the '<em><b>Locator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_DOCUMENT_ROOT__LOCATOR = 4;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_DOCUMENT_ROOT__RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_DOCUMENT_ROOT__TITLE = 6;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_DOCUMENT_ROOT__ACTUATE = 7;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_DOCUMENT_ROOT__ARCROLE = 8;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_DOCUMENT_ROOT__FROM = 9;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_DOCUMENT_ROOT__HREF = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_DOCUMENT_ROOT__LABEL = 11;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_DOCUMENT_ROOT__ROLE = 12;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_DOCUMENT_ROOT__SHOW = 13;

	/**
	 * The feature id for the '<em><b>Title1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_DOCUMENT_ROOT__TITLE1 = 14;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_DOCUMENT_ROOT__TO = 15;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_DOCUMENT_ROOT__TYPE = 16;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_DOCUMENT_ROOT_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._1999.xlink.ActuateType <em>Actuate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._1999.xlink.ActuateType
	 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getActuateType()
	 * @generated
	 */
	int ACTUATE_TYPE = 7;

	/**
	 * The meta object id for the '{@link org.w3._1999.xlink.ShowType <em>Show Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._1999.xlink.ShowType
	 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getShowType()
	 * @generated
	 */
	int SHOW_TYPE = 8;

	/**
	 * The meta object id for the '{@link org.w3._1999.xlink.TypeType <em>Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._1999.xlink.TypeType
	 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 9;

	/**
	 * The meta object id for the '<em>Actuate Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._1999.xlink.ActuateType
	 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getActuateTypeObject()
	 * @generated
	 */
	int ACTUATE_TYPE_OBJECT = 10;

	/**
	 * The meta object id for the '<em>Arcrole Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getArcroleType()
	 * @generated
	 */
	int ARCROLE_TYPE = 11;

	/**
	 * The meta object id for the '<em>From Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getFromType()
	 * @generated
	 */
	int FROM_TYPE = 12;

	/**
	 * The meta object id for the '<em>Href Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getHrefType()
	 * @generated
	 */
	int HREF_TYPE = 13;

	/**
	 * The meta object id for the '<em>Label Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getLabelType()
	 * @generated
	 */
	int LABEL_TYPE = 14;

	/**
	 * The meta object id for the '<em>Role Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 15;

	/**
	 * The meta object id for the '<em>Show Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._1999.xlink.ShowType
	 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getShowTypeObject()
	 * @generated
	 */
	int SHOW_TYPE_OBJECT = 16;

	/**
	 * The meta object id for the '<em>Title Attr Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getTitleAttrType()
	 * @generated
	 */
	int TITLE_ATTR_TYPE = 17;

	/**
	 * The meta object id for the '<em>To Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getToType()
	 * @generated
	 */
	int TO_TYPE = 18;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._1999.xlink.TypeType
	 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 19;


	/**
	 * Returns the meta object for class '{@link org.w3._1999.xlink.ArcType <em>Arc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Type</em>'.
	 * @see org.w3._1999.xlink.ArcType
	 * @generated
	 */
	EClass getArcType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._1999.xlink.ArcType#getTitleGroup <em>Title Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Title Group</em>'.
	 * @see org.w3._1999.xlink.ArcType#getTitleGroup()
	 * @see #getArcType()
	 * @generated
	 */
	EAttribute getArcType_TitleGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._1999.xlink.ArcType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title</em>'.
	 * @see org.w3._1999.xlink.ArcType#getTitle()
	 * @see #getArcType()
	 * @generated
	 */
	EReference getArcType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.ArcType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.w3._1999.xlink.ArcType#getActuate()
	 * @see #getArcType()
	 * @generated
	 */
	EAttribute getArcType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.ArcType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see org.w3._1999.xlink.ArcType#getArcrole()
	 * @see #getArcType()
	 * @generated
	 */
	EAttribute getArcType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.ArcType#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see org.w3._1999.xlink.ArcType#getFrom()
	 * @see #getArcType()
	 * @generated
	 */
	EAttribute getArcType_From();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.ArcType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.w3._1999.xlink.ArcType#getShow()
	 * @see #getArcType()
	 * @generated
	 */
	EAttribute getArcType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.ArcType#getTitle1 <em>Title1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title1</em>'.
	 * @see org.w3._1999.xlink.ArcType#getTitle1()
	 * @see #getArcType()
	 * @generated
	 */
	EAttribute getArcType_Title1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.ArcType#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.w3._1999.xlink.ArcType#getTo()
	 * @see #getArcType()
	 * @generated
	 */
	EAttribute getArcType_To();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.ArcType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.w3._1999.xlink.ArcType#getType()
	 * @see #getArcType()
	 * @generated
	 */
	EAttribute getArcType_Type();

	/**
	 * Returns the meta object for class '{@link org.w3._1999.xlink.Extended <em>Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended</em>'.
	 * @see org.w3._1999.xlink.Extended
	 * @generated
	 */
	EClass getExtended();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._1999.xlink.Extended#getExtendedModel <em>Extended Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extended Model</em>'.
	 * @see org.w3._1999.xlink.Extended#getExtendedModel()
	 * @see #getExtended()
	 * @generated
	 */
	EAttribute getExtended_ExtendedModel();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._1999.xlink.Extended#getTitleGroup <em>Title Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Title Group</em>'.
	 * @see org.w3._1999.xlink.Extended#getTitleGroup()
	 * @see #getExtended()
	 * @generated
	 */
	EAttribute getExtended_TitleGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._1999.xlink.Extended#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title</em>'.
	 * @see org.w3._1999.xlink.Extended#getTitle()
	 * @see #getExtended()
	 * @generated
	 */
	EReference getExtended_Title();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._1999.xlink.Extended#getResourceGroup <em>Resource Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resource Group</em>'.
	 * @see org.w3._1999.xlink.Extended#getResourceGroup()
	 * @see #getExtended()
	 * @generated
	 */
	EAttribute getExtended_ResourceGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._1999.xlink.Extended#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see org.w3._1999.xlink.Extended#getResource()
	 * @see #getExtended()
	 * @generated
	 */
	EReference getExtended_Resource();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._1999.xlink.Extended#getLocatorGroup <em>Locator Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Locator Group</em>'.
	 * @see org.w3._1999.xlink.Extended#getLocatorGroup()
	 * @see #getExtended()
	 * @generated
	 */
	EAttribute getExtended_LocatorGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._1999.xlink.Extended#getLocator <em>Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locator</em>'.
	 * @see org.w3._1999.xlink.Extended#getLocator()
	 * @see #getExtended()
	 * @generated
	 */
	EReference getExtended_Locator();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._1999.xlink.Extended#getArcGroup <em>Arc Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Arc Group</em>'.
	 * @see org.w3._1999.xlink.Extended#getArcGroup()
	 * @see #getExtended()
	 * @generated
	 */
	EAttribute getExtended_ArcGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._1999.xlink.Extended#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arc</em>'.
	 * @see org.w3._1999.xlink.Extended#getArc()
	 * @see #getExtended()
	 * @generated
	 */
	EReference getExtended_Arc();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.Extended#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.w3._1999.xlink.Extended#getRole()
	 * @see #getExtended()
	 * @generated
	 */
	EAttribute getExtended_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.Extended#getTitle1 <em>Title1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title1</em>'.
	 * @see org.w3._1999.xlink.Extended#getTitle1()
	 * @see #getExtended()
	 * @generated
	 */
	EAttribute getExtended_Title1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.Extended#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.w3._1999.xlink.Extended#getType()
	 * @see #getExtended()
	 * @generated
	 */
	EAttribute getExtended_Type();

	/**
	 * Returns the meta object for class '{@link org.w3._1999.xlink.LocatorType <em>Locator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locator Type</em>'.
	 * @see org.w3._1999.xlink.LocatorType
	 * @generated
	 */
	EClass getLocatorType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._1999.xlink.LocatorType#getTitleGroup <em>Title Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Title Group</em>'.
	 * @see org.w3._1999.xlink.LocatorType#getTitleGroup()
	 * @see #getLocatorType()
	 * @generated
	 */
	EAttribute getLocatorType_TitleGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._1999.xlink.LocatorType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title</em>'.
	 * @see org.w3._1999.xlink.LocatorType#getTitle()
	 * @see #getLocatorType()
	 * @generated
	 */
	EReference getLocatorType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.LocatorType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.w3._1999.xlink.LocatorType#getHref()
	 * @see #getLocatorType()
	 * @generated
	 */
	EAttribute getLocatorType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.LocatorType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.w3._1999.xlink.LocatorType#getLabel()
	 * @see #getLocatorType()
	 * @generated
	 */
	EAttribute getLocatorType_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.LocatorType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.w3._1999.xlink.LocatorType#getRole()
	 * @see #getLocatorType()
	 * @generated
	 */
	EAttribute getLocatorType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.LocatorType#getTitle1 <em>Title1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title1</em>'.
	 * @see org.w3._1999.xlink.LocatorType#getTitle1()
	 * @see #getLocatorType()
	 * @generated
	 */
	EAttribute getLocatorType_Title1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.LocatorType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.w3._1999.xlink.LocatorType#getType()
	 * @see #getLocatorType()
	 * @generated
	 */
	EAttribute getLocatorType_Type();

	/**
	 * Returns the meta object for class '{@link org.w3._1999.xlink.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type</em>'.
	 * @see org.w3._1999.xlink.ResourceType
	 * @generated
	 */
	EClass getResourceType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._1999.xlink.ResourceType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._1999.xlink.ResourceType#getMixed()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._1999.xlink.ResourceType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._1999.xlink.ResourceType#getAny()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.ResourceType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.w3._1999.xlink.ResourceType#getLabel()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.ResourceType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.w3._1999.xlink.ResourceType#getRole()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.ResourceType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3._1999.xlink.ResourceType#getTitle()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.ResourceType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.w3._1999.xlink.ResourceType#getType()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Type();

	/**
	 * Returns the meta object for class '{@link org.w3._1999.xlink.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple</em>'.
	 * @see org.w3._1999.xlink.Simple
	 * @generated
	 */
	EClass getSimple();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._1999.xlink.Simple#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._1999.xlink.Simple#getMixed()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._1999.xlink.Simple#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._1999.xlink.Simple#getAny()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.Simple#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.w3._1999.xlink.Simple#getActuate()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.Simple#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see org.w3._1999.xlink.Simple#getArcrole()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.Simple#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.w3._1999.xlink.Simple#getHref()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.Simple#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.w3._1999.xlink.Simple#getRole()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.Simple#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.w3._1999.xlink.Simple#getShow()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.Simple#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3._1999.xlink.Simple#getTitle()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.Simple#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.w3._1999.xlink.Simple#getType()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Type();

	/**
	 * Returns the meta object for class '{@link org.w3._1999.xlink.TitleEltType <em>Title Elt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title Elt Type</em>'.
	 * @see org.w3._1999.xlink.TitleEltType
	 * @generated
	 */
	EClass getTitleEltType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._1999.xlink.TitleEltType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._1999.xlink.TitleEltType#getMixed()
	 * @see #getTitleEltType()
	 * @generated
	 */
	EAttribute getTitleEltType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._1999.xlink.TitleEltType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._1999.xlink.TitleEltType#getAny()
	 * @see #getTitleEltType()
	 * @generated
	 */
	EAttribute getTitleEltType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.TitleEltType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3._1999.xlink.TitleEltType#getLang()
	 * @see #getTitleEltType()
	 * @generated
	 */
	EAttribute getTitleEltType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.TitleEltType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.w3._1999.xlink.TitleEltType#getType()
	 * @see #getTitleEltType()
	 * @generated
	 */
	EAttribute getTitleEltType_Type();

	/**
	 * Returns the meta object for class '{@link org.w3._1999.xlink.XlinkDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.w3._1999.xlink.XlinkDocumentRoot
	 * @generated
	 */
	EClass getXlinkDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._1999.xlink.XlinkDocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._1999.xlink.XlinkDocumentRoot#getMixed()
	 * @see #getXlinkDocumentRoot()
	 * @generated
	 */
	EAttribute getXlinkDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.w3._1999.xlink.XlinkDocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.w3._1999.xlink.XlinkDocumentRoot#getXMLNSPrefixMap()
	 * @see #getXlinkDocumentRoot()
	 * @generated
	 */
	EReference getXlinkDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.w3._1999.xlink.XlinkDocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.w3._1999.xlink.XlinkDocumentRoot#getXSISchemaLocation()
	 * @see #getXlinkDocumentRoot()
	 * @generated
	 */
	EReference getXlinkDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._1999.xlink.XlinkDocumentRoot#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arc</em>'.
	 * @see org.w3._1999.xlink.XlinkDocumentRoot#getArc()
	 * @see #getXlinkDocumentRoot()
	 * @generated
	 */
	EReference getXlinkDocumentRoot_Arc();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._1999.xlink.XlinkDocumentRoot#getLocator <em>Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locator</em>'.
	 * @see org.w3._1999.xlink.XlinkDocumentRoot#getLocator()
	 * @see #getXlinkDocumentRoot()
	 * @generated
	 */
	EReference getXlinkDocumentRoot_Locator();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._1999.xlink.XlinkDocumentRoot#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see org.w3._1999.xlink.XlinkDocumentRoot#getResource()
	 * @see #getXlinkDocumentRoot()
	 * @generated
	 */
	EReference getXlinkDocumentRoot_Resource();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._1999.xlink.XlinkDocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.w3._1999.xlink.XlinkDocumentRoot#getTitle()
	 * @see #getXlinkDocumentRoot()
	 * @generated
	 */
	EReference getXlinkDocumentRoot_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.XlinkDocumentRoot#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.w3._1999.xlink.XlinkDocumentRoot#getActuate()
	 * @see #getXlinkDocumentRoot()
	 * @generated
	 */
	EAttribute getXlinkDocumentRoot_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.XlinkDocumentRoot#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see org.w3._1999.xlink.XlinkDocumentRoot#getArcrole()
	 * @see #getXlinkDocumentRoot()
	 * @generated
	 */
	EAttribute getXlinkDocumentRoot_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.XlinkDocumentRoot#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see org.w3._1999.xlink.XlinkDocumentRoot#getFrom()
	 * @see #getXlinkDocumentRoot()
	 * @generated
	 */
	EAttribute getXlinkDocumentRoot_From();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.XlinkDocumentRoot#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.w3._1999.xlink.XlinkDocumentRoot#getHref()
	 * @see #getXlinkDocumentRoot()
	 * @generated
	 */
	EAttribute getXlinkDocumentRoot_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.XlinkDocumentRoot#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.w3._1999.xlink.XlinkDocumentRoot#getLabel()
	 * @see #getXlinkDocumentRoot()
	 * @generated
	 */
	EAttribute getXlinkDocumentRoot_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.XlinkDocumentRoot#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.w3._1999.xlink.XlinkDocumentRoot#getRole()
	 * @see #getXlinkDocumentRoot()
	 * @generated
	 */
	EAttribute getXlinkDocumentRoot_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.XlinkDocumentRoot#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.w3._1999.xlink.XlinkDocumentRoot#getShow()
	 * @see #getXlinkDocumentRoot()
	 * @generated
	 */
	EAttribute getXlinkDocumentRoot_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.XlinkDocumentRoot#getTitle1 <em>Title1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title1</em>'.
	 * @see org.w3._1999.xlink.XlinkDocumentRoot#getTitle1()
	 * @see #getXlinkDocumentRoot()
	 * @generated
	 */
	EAttribute getXlinkDocumentRoot_Title1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.XlinkDocumentRoot#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.w3._1999.xlink.XlinkDocumentRoot#getTo()
	 * @see #getXlinkDocumentRoot()
	 * @generated
	 */
	EAttribute getXlinkDocumentRoot_To();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._1999.xlink.XlinkDocumentRoot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.w3._1999.xlink.XlinkDocumentRoot#getType()
	 * @see #getXlinkDocumentRoot()
	 * @generated
	 */
	EAttribute getXlinkDocumentRoot_Type();

	/**
	 * Returns the meta object for enum '{@link org.w3._1999.xlink.ActuateType <em>Actuate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actuate Type</em>'.
	 * @see org.w3._1999.xlink.ActuateType
	 * @generated
	 */
	EEnum getActuateType();

	/**
	 * Returns the meta object for enum '{@link org.w3._1999.xlink.ShowType <em>Show Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Show Type</em>'.
	 * @see org.w3._1999.xlink.ShowType
	 * @generated
	 */
	EEnum getShowType();

	/**
	 * Returns the meta object for enum '{@link org.w3._1999.xlink.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type</em>'.
	 * @see org.w3._1999.xlink.TypeType
	 * @generated
	 */
	EEnum getTypeType();

	/**
	 * Returns the meta object for data type '{@link org.w3._1999.xlink.ActuateType <em>Actuate Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Actuate Type Object</em>'.
	 * @see org.w3._1999.xlink.ActuateType
	 * @model instanceClass="org.w3._1999.xlink.ActuateType"
	 *        extendedMetaData="name='actuateType:Object' baseType='actuateType'"
	 * @generated
	 */
	EDataType getActuateTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Arcrole Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Arcrole Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='arcroleType' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI' minLength='1'"
	 * @generated
	 */
	EDataType getArcroleType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>From Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>From Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='fromType' baseType='http://www.eclipse.org/emf/2003/XMLType#NCName'"
	 * @generated
	 */
	EDataType getFromType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Href Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Href Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='hrefType' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getHrefType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Label Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='labelType' baseType='http://www.eclipse.org/emf/2003/XMLType#NCName'"
	 * @generated
	 */
	EDataType getLabelType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Role Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='roleType' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI' minLength='1'"
	 * @generated
	 */
	EDataType getRoleType();

	/**
	 * Returns the meta object for data type '{@link org.w3._1999.xlink.ShowType <em>Show Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Show Type Object</em>'.
	 * @see org.w3._1999.xlink.ShowType
	 * @model instanceClass="org.w3._1999.xlink.ShowType"
	 *        extendedMetaData="name='showType:Object' baseType='showType'"
	 * @generated
	 */
	EDataType getShowTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Title Attr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Title Attr Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='titleAttrType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getTitleAttrType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>To Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='toType' baseType='http://www.eclipse.org/emf/2003/XMLType#NCName'"
	 * @generated
	 */
	EDataType getToType();

	/**
	 * Returns the meta object for data type '{@link org.w3._1999.xlink.TypeType <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see org.w3._1999.xlink.TypeType
	 * @model instanceClass="org.w3._1999.xlink.TypeType"
	 *        extendedMetaData="name='typeType:Object' baseType='typeType'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XlinkFactory getXlinkFactory();

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
		 * The meta object literal for the '{@link org.w3._1999.xlink.impl.ArcTypeImpl <em>Arc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._1999.xlink.impl.ArcTypeImpl
		 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getArcType()
		 * @generated
		 */
		EClass ARC_TYPE = eINSTANCE.getArcType();

		/**
		 * The meta object literal for the '<em><b>Title Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC_TYPE__TITLE_GROUP = eINSTANCE.getArcType_TitleGroup();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_TYPE__TITLE = eINSTANCE.getArcType_Title();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC_TYPE__ACTUATE = eINSTANCE.getArcType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC_TYPE__ARCROLE = eINSTANCE.getArcType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC_TYPE__FROM = eINSTANCE.getArcType_From();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC_TYPE__SHOW = eINSTANCE.getArcType_Show();

		/**
		 * The meta object literal for the '<em><b>Title1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC_TYPE__TITLE1 = eINSTANCE.getArcType_Title1();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC_TYPE__TO = eINSTANCE.getArcType_To();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC_TYPE__TYPE = eINSTANCE.getArcType_Type();

		/**
		 * The meta object literal for the '{@link org.w3._1999.xlink.impl.ExtendedImpl <em>Extended</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._1999.xlink.impl.ExtendedImpl
		 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getExtended()
		 * @generated
		 */
		EClass EXTENDED = eINSTANCE.getExtended();

		/**
		 * The meta object literal for the '<em><b>Extended Model</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED__EXTENDED_MODEL = eINSTANCE.getExtended_ExtendedModel();

		/**
		 * The meta object literal for the '<em><b>Title Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED__TITLE_GROUP = eINSTANCE.getExtended_TitleGroup();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED__TITLE = eINSTANCE.getExtended_Title();

		/**
		 * The meta object literal for the '<em><b>Resource Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED__RESOURCE_GROUP = eINSTANCE.getExtended_ResourceGroup();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED__RESOURCE = eINSTANCE.getExtended_Resource();

		/**
		 * The meta object literal for the '<em><b>Locator Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED__LOCATOR_GROUP = eINSTANCE.getExtended_LocatorGroup();

		/**
		 * The meta object literal for the '<em><b>Locator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED__LOCATOR = eINSTANCE.getExtended_Locator();

		/**
		 * The meta object literal for the '<em><b>Arc Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED__ARC_GROUP = eINSTANCE.getExtended_ArcGroup();

		/**
		 * The meta object literal for the '<em><b>Arc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED__ARC = eINSTANCE.getExtended_Arc();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED__ROLE = eINSTANCE.getExtended_Role();

		/**
		 * The meta object literal for the '<em><b>Title1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED__TITLE1 = eINSTANCE.getExtended_Title1();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED__TYPE = eINSTANCE.getExtended_Type();

		/**
		 * The meta object literal for the '{@link org.w3._1999.xlink.impl.LocatorTypeImpl <em>Locator Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._1999.xlink.impl.LocatorTypeImpl
		 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getLocatorType()
		 * @generated
		 */
		EClass LOCATOR_TYPE = eINSTANCE.getLocatorType();

		/**
		 * The meta object literal for the '<em><b>Title Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATOR_TYPE__TITLE_GROUP = eINSTANCE.getLocatorType_TitleGroup();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATOR_TYPE__TITLE = eINSTANCE.getLocatorType_Title();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATOR_TYPE__HREF = eINSTANCE.getLocatorType_Href();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATOR_TYPE__LABEL = eINSTANCE.getLocatorType_Label();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATOR_TYPE__ROLE = eINSTANCE.getLocatorType_Role();

		/**
		 * The meta object literal for the '<em><b>Title1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATOR_TYPE__TITLE1 = eINSTANCE.getLocatorType_Title1();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATOR_TYPE__TYPE = eINSTANCE.getLocatorType_Type();

		/**
		 * The meta object literal for the '{@link org.w3._1999.xlink.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._1999.xlink.impl.ResourceTypeImpl
		 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getResourceType()
		 * @generated
		 */
		EClass RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__MIXED = eINSTANCE.getResourceType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__ANY = eINSTANCE.getResourceType_Any();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__LABEL = eINSTANCE.getResourceType_Label();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__ROLE = eINSTANCE.getResourceType_Role();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__TITLE = eINSTANCE.getResourceType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__TYPE = eINSTANCE.getResourceType_Type();

		/**
		 * The meta object literal for the '{@link org.w3._1999.xlink.impl.SimpleImpl <em>Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._1999.xlink.impl.SimpleImpl
		 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getSimple()
		 * @generated
		 */
		EClass SIMPLE = eINSTANCE.getSimple();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__MIXED = eINSTANCE.getSimple_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__ANY = eINSTANCE.getSimple_Any();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__ACTUATE = eINSTANCE.getSimple_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__ARCROLE = eINSTANCE.getSimple_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__HREF = eINSTANCE.getSimple_Href();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__ROLE = eINSTANCE.getSimple_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__SHOW = eINSTANCE.getSimple_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__TITLE = eINSTANCE.getSimple_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__TYPE = eINSTANCE.getSimple_Type();

		/**
		 * The meta object literal for the '{@link org.w3._1999.xlink.impl.TitleEltTypeImpl <em>Title Elt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._1999.xlink.impl.TitleEltTypeImpl
		 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getTitleEltType()
		 * @generated
		 */
		EClass TITLE_ELT_TYPE = eINSTANCE.getTitleEltType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_ELT_TYPE__MIXED = eINSTANCE.getTitleEltType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_ELT_TYPE__ANY = eINSTANCE.getTitleEltType_Any();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_ELT_TYPE__LANG = eINSTANCE.getTitleEltType_Lang();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_ELT_TYPE__TYPE = eINSTANCE.getTitleEltType_Type();

		/**
		 * The meta object literal for the '{@link org.w3._1999.xlink.impl.XlinkDocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._1999.xlink.impl.XlinkDocumentRootImpl
		 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getXlinkDocumentRoot()
		 * @generated
		 */
		EClass XLINK_DOCUMENT_ROOT = eINSTANCE.getXlinkDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XLINK_DOCUMENT_ROOT__MIXED = eINSTANCE.getXlinkDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XLINK_DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getXlinkDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XLINK_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getXlinkDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Arc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XLINK_DOCUMENT_ROOT__ARC = eINSTANCE.getXlinkDocumentRoot_Arc();

		/**
		 * The meta object literal for the '<em><b>Locator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XLINK_DOCUMENT_ROOT__LOCATOR = eINSTANCE.getXlinkDocumentRoot_Locator();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XLINK_DOCUMENT_ROOT__RESOURCE = eINSTANCE.getXlinkDocumentRoot_Resource();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XLINK_DOCUMENT_ROOT__TITLE = eINSTANCE.getXlinkDocumentRoot_Title();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XLINK_DOCUMENT_ROOT__ACTUATE = eINSTANCE.getXlinkDocumentRoot_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XLINK_DOCUMENT_ROOT__ARCROLE = eINSTANCE.getXlinkDocumentRoot_Arcrole();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XLINK_DOCUMENT_ROOT__FROM = eINSTANCE.getXlinkDocumentRoot_From();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XLINK_DOCUMENT_ROOT__HREF = eINSTANCE.getXlinkDocumentRoot_Href();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XLINK_DOCUMENT_ROOT__LABEL = eINSTANCE.getXlinkDocumentRoot_Label();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XLINK_DOCUMENT_ROOT__ROLE = eINSTANCE.getXlinkDocumentRoot_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XLINK_DOCUMENT_ROOT__SHOW = eINSTANCE.getXlinkDocumentRoot_Show();

		/**
		 * The meta object literal for the '<em><b>Title1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XLINK_DOCUMENT_ROOT__TITLE1 = eINSTANCE.getXlinkDocumentRoot_Title1();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XLINK_DOCUMENT_ROOT__TO = eINSTANCE.getXlinkDocumentRoot_To();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XLINK_DOCUMENT_ROOT__TYPE = eINSTANCE.getXlinkDocumentRoot_Type();

		/**
		 * The meta object literal for the '{@link org.w3._1999.xlink.ActuateType <em>Actuate Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._1999.xlink.ActuateType
		 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getActuateType()
		 * @generated
		 */
		EEnum ACTUATE_TYPE = eINSTANCE.getActuateType();

		/**
		 * The meta object literal for the '{@link org.w3._1999.xlink.ShowType <em>Show Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._1999.xlink.ShowType
		 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getShowType()
		 * @generated
		 */
		EEnum SHOW_TYPE = eINSTANCE.getShowType();

		/**
		 * The meta object literal for the '{@link org.w3._1999.xlink.TypeType <em>Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._1999.xlink.TypeType
		 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getTypeType()
		 * @generated
		 */
		EEnum TYPE_TYPE = eINSTANCE.getTypeType();

		/**
		 * The meta object literal for the '<em>Actuate Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._1999.xlink.ActuateType
		 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getActuateTypeObject()
		 * @generated
		 */
		EDataType ACTUATE_TYPE_OBJECT = eINSTANCE.getActuateTypeObject();

		/**
		 * The meta object literal for the '<em>Arcrole Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getArcroleType()
		 * @generated
		 */
		EDataType ARCROLE_TYPE = eINSTANCE.getArcroleType();

		/**
		 * The meta object literal for the '<em>From Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getFromType()
		 * @generated
		 */
		EDataType FROM_TYPE = eINSTANCE.getFromType();

		/**
		 * The meta object literal for the '<em>Href Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getHrefType()
		 * @generated
		 */
		EDataType HREF_TYPE = eINSTANCE.getHrefType();

		/**
		 * The meta object literal for the '<em>Label Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getLabelType()
		 * @generated
		 */
		EDataType LABEL_TYPE = eINSTANCE.getLabelType();

		/**
		 * The meta object literal for the '<em>Role Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getRoleType()
		 * @generated
		 */
		EDataType ROLE_TYPE = eINSTANCE.getRoleType();

		/**
		 * The meta object literal for the '<em>Show Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._1999.xlink.ShowType
		 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getShowTypeObject()
		 * @generated
		 */
		EDataType SHOW_TYPE_OBJECT = eINSTANCE.getShowTypeObject();

		/**
		 * The meta object literal for the '<em>Title Attr Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getTitleAttrType()
		 * @generated
		 */
		EDataType TITLE_ATTR_TYPE = eINSTANCE.getTitleAttrType();

		/**
		 * The meta object literal for the '<em>To Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getToType()
		 * @generated
		 */
		EDataType TO_TYPE = eINSTANCE.getToType();

		/**
		 * The meta object literal for the '<em>Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._1999.xlink.TypeType
		 * @see org.w3._1999.xlink.impl.XlinkPackageImpl#getTypeTypeObject()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT = eINSTANCE.getTypeTypeObject();

	}

} //XlinkPackage
