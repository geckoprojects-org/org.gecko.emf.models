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
package net.opengis.ogc.features;


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
 * This XML Schema Document includes and imports,
 *       directly or indirectly, all the XML schemas defined by
 *       OGC API - Features - Part 1: Core, with the exception of
 *       the XML schema for the GML-Simple-Feature-conformant feature
 *       collection element, which has to be defined in a separate
 *       XML namespace to conform with the requirements of the GML
 *       Simple Feature standard.
 * 
 *       Copyright (c) 2019 Open Geospatial Consortium.
 *       To obtain additional rights of use, visit
 *       https://www.ogc.org/legal/ .
 *       
 * There is no official atom XSD. This XSD is created based on:
 *       http://atompub.org/2005/08/17/atom.rnc. A subset of Atom as used in the
 *       ogckml22.xsd is defined here. 
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
 * <!-- end-model-doc -->
 * @see net.opengis.ogc.features.OGCFeaturesFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = OGCFeaturesPackage.eNS_URI, genModel = "/model/features-core.genmodel", genModelSourceLocations = {"model/features-core.genmodel","net.opengis.ogc.features.model/model/features-core.genmodel"}, ecore="/model/features-core.ecore", ecoreSourceLocations="/model/features-core.ecore")
public interface OGCFeaturesPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "features";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/ogcapi-features-1/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ogcfeatures";

	/**
	 * The package content type ID.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eCONTENT_TYPE = "ogcf#1.0.1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OGCFeaturesPackage eINSTANCE = net.opengis.ogc.features.impl.OGCFeaturesPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.opengis.ogc.features.impl.BaseResponseImpl <em>Base Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.features.impl.BaseResponseImpl
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getBaseResponse()
	 * @generated
	 */
	int BASE_RESPONSE = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_RESPONSE__SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Update Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_RESPONSE__UPDATE_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_RESPONSE__VERSION = 2;

	/**
	 * The number of structural features of the '<em>Base Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_RESPONSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Base Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.features.impl.BeginImpl <em>Begin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.features.impl.BeginImpl
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getBegin()
	 * @generated
	 */
	int BEGIN = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN__INCLUSIVE = 1;

	/**
	 * The number of structural features of the '<em>Begin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Begin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.features.impl.SpatialExtentImpl <em>Spatial Extent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.features.impl.SpatialExtentImpl
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getSpatialExtent()
	 * @generated
	 */
	int SPATIAL_EXTENT = 14;

	/**
	 * The number of structural features of the '<em>Spatial Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_EXTENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Spatial Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_EXTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.features.impl.BoundingBoxImpl <em>Bounding Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.features.impl.BoundingBoxImpl
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getBoundingBox()
	 * @generated
	 */
	int BOUNDING_BOX = 2;

	/**
	 * The feature id for the '<em><b>Lower Corner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX__LOWER_CORNER = SPATIAL_EXTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Corner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX__UPPER_CORNER = SPATIAL_EXTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Crs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX__CRS = SPATIAL_EXTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX__DIMENSIONS = SPATIAL_EXTENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bounding Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX_FEATURE_COUNT = SPATIAL_EXTENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Bounding Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX_OPERATION_COUNT = SPATIAL_EXTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.features.impl.FeatureCollectionsImpl <em>Feature Collections</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.features.impl.FeatureCollectionsImpl
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getFeatureCollections()
	 * @generated
	 */
	int FEATURE_COLLECTIONS = 3;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTIONS__SERVICE = BASE_RESPONSE__SERVICE;

	/**
	 * The feature id for the '<em><b>Update Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTIONS__UPDATE_SEQUENCE = BASE_RESPONSE__UPDATE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTIONS__VERSION = BASE_RESPONSE__VERSION;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTIONS__LINK = BASE_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTIONS__COLLECTION = BASE_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Collections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTIONS_FEATURE_COUNT = BASE_RESPONSE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature Collections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTIONS_OPERATION_COUNT = BASE_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.features.impl.FeatureCollectionImpl <em>Feature Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.features.impl.FeatureCollectionImpl
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getFeatureCollection()
	 * @generated
	 */
	int FEATURE_COLLECTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION__ITEM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION__LINK = 4;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION__EXTENT = 5;

	/**
	 * The feature id for the '<em><b>Crs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION__CRS = 6;

	/**
	 * The feature id for the '<em><b>Storage Crs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION__STORAGE_CRS = 7;

	/**
	 * The number of structural features of the '<em>Feature Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Feature Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.features.impl.ConformsToImpl <em>Conforms To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.features.impl.ConformsToImpl
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getConformsTo()
	 * @generated
	 */
	int CONFORMS_TO = 5;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMS_TO__SERVICE = BASE_RESPONSE__SERVICE;

	/**
	 * The feature id for the '<em><b>Update Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMS_TO__UPDATE_SEQUENCE = BASE_RESPONSE__UPDATE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMS_TO__VERSION = BASE_RESPONSE__VERSION;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMS_TO__LINK = BASE_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conforms To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMS_TO_FEATURE_COUNT = BASE_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conforms To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMS_TO_OPERATION_COUNT = BASE_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.features.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.features.impl.DocumentRootImpl
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 6;

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
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BEGIN = 3;

	/**
	 * The feature id for the '<em><b>Collections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLLECTIONS = 4;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFORMS_TO = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END = 7;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXCEPTION = 8;

	/**
	 * The feature id for the '<em><b>Exception Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXCEPTION_REPORT = 9;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENT = 10;

	/**
	 * The feature id for the '<em><b>Landing Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LANDING_PAGE = 11;

	/**
	 * The feature id for the '<em><b>Spatial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPATIAL = 12;

	/**
	 * The feature id for the '<em><b>Spatial Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPATIAL_EXTENT = 13;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEMPORAL = 14;

	/**
	 * The feature id for the '<em><b>Temporal Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEMPORAL_EXTENT = 15;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE = 16;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.features.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.features.impl.EndImpl
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getEnd()
	 * @generated
	 */
	int END = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__INCLUSIVE = 1;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.features.impl.ExceptionReportImpl <em>Exception Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.features.impl.ExceptionReportImpl
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getExceptionReport()
	 * @generated
	 */
	int EXCEPTION_REPORT = 8;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_REPORT__EXCEPTION = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_REPORT__LANG = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_REPORT__VERSION = 2;

	/**
	 * The number of structural features of the '<em>Exception Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_REPORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Exception Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_REPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.features.impl.ExceptionImpl <em>Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.features.impl.ExceptionImpl
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 9;

	/**
	 * The feature id for the '<em><b>Exception Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__EXCEPTION_TEXT = 0;

	/**
	 * The feature id for the '<em><b>Exception Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__EXCEPTION_CODE = 1;

	/**
	 * The feature id for the '<em><b>Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__LOCATOR = 2;

	/**
	 * The number of structural features of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.features.impl.ExtentImpl <em>Extent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.features.impl.ExtentImpl
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getExtent()
	 * @generated
	 */
	int EXTENT = 10;

	/**
	 * The feature id for the '<em><b>Spatial Extent Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__SPATIAL_EXTENT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Spatial Extent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__SPATIAL_EXTENT = 1;

	/**
	 * The feature id for the '<em><b>Temporal Extent Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__TEMPORAL_EXTENT_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Temporal Extent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__TEMPORAL_EXTENT = 3;

	/**
	 * The number of structural features of the '<em>Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.features.impl.TemporalExtentImpl <em>Temporal Extent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.features.impl.TemporalExtentImpl
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getTemporalExtent()
	 * @generated
	 */
	int TEMPORAL_EXTENT = 15;

	/**
	 * The number of structural features of the '<em>Temporal Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXTENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Temporal Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.features.impl.TemporalPeriodImpl <em>Temporal Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.features.impl.TemporalPeriodImpl
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getTemporalPeriod()
	 * @generated
	 */
	int TEMPORAL_PERIOD = 16;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PERIOD__BEGIN = TEMPORAL_EXTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PERIOD__END = TEMPORAL_EXTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PERIOD__TRS = TEMPORAL_EXTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Temporal Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PERIOD_FEATURE_COUNT = TEMPORAL_EXTENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Temporal Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PERIOD_OPERATION_COUNT = TEMPORAL_EXTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.features.impl.GregorianPeriodImpl <em>Gregorian Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.features.impl.GregorianPeriodImpl
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getGregorianPeriod()
	 * @generated
	 */
	int GREGORIAN_PERIOD = 11;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREGORIAN_PERIOD__BEGIN = TEMPORAL_PERIOD__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREGORIAN_PERIOD__END = TEMPORAL_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Trs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREGORIAN_PERIOD__TRS = TEMPORAL_PERIOD__TRS;

	/**
	 * The number of structural features of the '<em>Gregorian Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREGORIAN_PERIOD_FEATURE_COUNT = TEMPORAL_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gregorian Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREGORIAN_PERIOD_OPERATION_COUNT = TEMPORAL_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.features.impl.LandingPageImpl <em>Landing Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.features.impl.LandingPageImpl
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getLandingPage()
	 * @generated
	 */
	int LANDING_PAGE = 12;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAGE__SERVICE = BASE_RESPONSE__SERVICE;

	/**
	 * The feature id for the '<em><b>Update Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAGE__UPDATE_SEQUENCE = BASE_RESPONSE__UPDATE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAGE__VERSION = BASE_RESPONSE__VERSION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAGE__TITLE = BASE_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAGE__DESCRIPTION = BASE_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAGE__LINK = BASE_RESPONSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Landing Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAGE_FEATURE_COUNT = BASE_RESPONSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Landing Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAGE_OPERATION_COUNT = BASE_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.features.impl.LanguageStringImpl <em>Language String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.features.impl.LanguageStringImpl
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getLanguageString()
	 * @generated
	 */
	int LANGUAGE_STRING = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_STRING__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_STRING__LANG = 1;

	/**
	 * The number of structural features of the '<em>Language String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_STRING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Language String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.features.impl.WGS84BoundingBoxImpl <em>WGS84 Bounding Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.features.impl.WGS84BoundingBoxImpl
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getWGS84BoundingBox()
	 * @generated
	 */
	int WGS84_BOUNDING_BOX = 17;

	/**
	 * The feature id for the '<em><b>Lower Corner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGS84_BOUNDING_BOX__LOWER_CORNER = BOUNDING_BOX__LOWER_CORNER;

	/**
	 * The feature id for the '<em><b>Upper Corner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGS84_BOUNDING_BOX__UPPER_CORNER = BOUNDING_BOX__UPPER_CORNER;

	/**
	 * The feature id for the '<em><b>Crs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGS84_BOUNDING_BOX__CRS = BOUNDING_BOX__CRS;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGS84_BOUNDING_BOX__DIMENSIONS = BOUNDING_BOX__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>WGS84 Bounding Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGS84_BOUNDING_BOX_FEATURE_COUNT = BOUNDING_BOX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WGS84 Bounding Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGS84_BOUNDING_BOX_OPERATION_COUNT = BOUNDING_BOX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Position</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 18;

	/**
	 * The meta object id for the '<em>Position2 D</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getPosition2D()
	 * @generated
	 */
	int POSITION2_D = 19;

	/**
	 * The meta object id for the '<em>Version String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getVersionString()
	 * @generated
	 */
	int VERSION_STRING = 20;

	/**
	 * The meta object id for the '<em>Version</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 21;


	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.features.BaseResponse <em>Base Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Response</em>'.
	 * @see net.opengis.ogc.features.BaseResponse
	 * @generated
	 */
	EClass getBaseResponse();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.features.BaseResponse#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see net.opengis.ogc.features.BaseResponse#getService()
	 * @see #getBaseResponse()
	 * @generated
	 */
	EAttribute getBaseResponse_Service();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.features.BaseResponse#getUpdateSequence <em>Update Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Sequence</em>'.
	 * @see net.opengis.ogc.features.BaseResponse#getUpdateSequence()
	 * @see #getBaseResponse()
	 * @generated
	 */
	EAttribute getBaseResponse_UpdateSequence();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.features.BaseResponse#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.opengis.ogc.features.BaseResponse#getVersion()
	 * @see #getBaseResponse()
	 * @generated
	 */
	EAttribute getBaseResponse_Version();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.features.Begin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Begin</em>'.
	 * @see net.opengis.ogc.features.Begin
	 * @generated
	 */
	EClass getBegin();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.features.Begin#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.ogc.features.Begin#getValue()
	 * @see #getBegin()
	 * @generated
	 */
	EAttribute getBegin_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.features.Begin#isInclusive <em>Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inclusive</em>'.
	 * @see net.opengis.ogc.features.Begin#isInclusive()
	 * @see #getBegin()
	 * @generated
	 */
	EAttribute getBegin_Inclusive();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.features.BoundingBox <em>Bounding Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounding Box</em>'.
	 * @see net.opengis.ogc.features.BoundingBox
	 * @generated
	 */
	EClass getBoundingBox();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.features.BoundingBox#getLowerCorner <em>Lower Corner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Corner</em>'.
	 * @see net.opengis.ogc.features.BoundingBox#getLowerCorner()
	 * @see #getBoundingBox()
	 * @generated
	 */
	EAttribute getBoundingBox_LowerCorner();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.features.BoundingBox#getUpperCorner <em>Upper Corner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Corner</em>'.
	 * @see net.opengis.ogc.features.BoundingBox#getUpperCorner()
	 * @see #getBoundingBox()
	 * @generated
	 */
	EAttribute getBoundingBox_UpperCorner();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.features.BoundingBox#getCrs <em>Crs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crs</em>'.
	 * @see net.opengis.ogc.features.BoundingBox#getCrs()
	 * @see #getBoundingBox()
	 * @generated
	 */
	EAttribute getBoundingBox_Crs();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.features.BoundingBox#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimensions</em>'.
	 * @see net.opengis.ogc.features.BoundingBox#getDimensions()
	 * @see #getBoundingBox()
	 * @generated
	 */
	EAttribute getBoundingBox_Dimensions();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.features.FeatureCollections <em>Feature Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Collections</em>'.
	 * @see net.opengis.ogc.features.FeatureCollections
	 * @generated
	 */
	EClass getFeatureCollections();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.features.FeatureCollections#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see net.opengis.ogc.features.FeatureCollections#getLink()
	 * @see #getFeatureCollections()
	 * @generated
	 */
	EReference getFeatureCollections_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.features.FeatureCollections#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collection</em>'.
	 * @see net.opengis.ogc.features.FeatureCollections#getCollection()
	 * @see #getFeatureCollections()
	 * @generated
	 */
	EReference getFeatureCollections_Collection();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.features.FeatureCollection <em>Feature Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Collection</em>'.
	 * @see net.opengis.ogc.features.FeatureCollection
	 * @generated
	 */
	EClass getFeatureCollection();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.features.FeatureCollection#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.opengis.ogc.features.FeatureCollection#getId()
	 * @see #getFeatureCollection()
	 * @generated
	 */
	EAttribute getFeatureCollection_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.features.FeatureCollection#getItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Type</em>'.
	 * @see net.opengis.ogc.features.FeatureCollection#getItemType()
	 * @see #getFeatureCollection()
	 * @generated
	 */
	EAttribute getFeatureCollection_ItemType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.features.FeatureCollection#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see net.opengis.ogc.features.FeatureCollection#getTitle()
	 * @see #getFeatureCollection()
	 * @generated
	 */
	EReference getFeatureCollection_Title();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.features.FeatureCollection#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see net.opengis.ogc.features.FeatureCollection#getDescription()
	 * @see #getFeatureCollection()
	 * @generated
	 */
	EReference getFeatureCollection_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.features.FeatureCollection#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see net.opengis.ogc.features.FeatureCollection#getLink()
	 * @see #getFeatureCollection()
	 * @generated
	 */
	EReference getFeatureCollection_Link();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.features.FeatureCollection#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extent</em>'.
	 * @see net.opengis.ogc.features.FeatureCollection#getExtent()
	 * @see #getFeatureCollection()
	 * @generated
	 */
	EReference getFeatureCollection_Extent();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.features.FeatureCollection#getCrs <em>Crs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Crs</em>'.
	 * @see net.opengis.ogc.features.FeatureCollection#getCrs()
	 * @see #getFeatureCollection()
	 * @generated
	 */
	EAttribute getFeatureCollection_Crs();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.features.FeatureCollection#getStorageCrs <em>Storage Crs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Crs</em>'.
	 * @see net.opengis.ogc.features.FeatureCollection#getStorageCrs()
	 * @see #getFeatureCollection()
	 * @generated
	 */
	EAttribute getFeatureCollection_StorageCrs();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.features.ConformsTo <em>Conforms To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conforms To</em>'.
	 * @see net.opengis.ogc.features.ConformsTo
	 * @generated
	 */
	EClass getConformsTo();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.features.ConformsTo#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see net.opengis.ogc.features.ConformsTo#getLink()
	 * @see #getConformsTo()
	 * @generated
	 */
	EReference getConformsTo_Link();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.features.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.opengis.ogc.features.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.features.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.ogc.features.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.opengis.ogc.features.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.opengis.ogc.features.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.opengis.ogc.features.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.opengis.ogc.features.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.features.DocumentRoot#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Begin</em>'.
	 * @see net.opengis.ogc.features.DocumentRoot#getBegin()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Begin();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.features.DocumentRoot#getCollections <em>Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collections</em>'.
	 * @see net.opengis.ogc.features.DocumentRoot#getCollections()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Collections();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.features.DocumentRoot#getConformsTo <em>Conforms To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conforms To</em>'.
	 * @see net.opengis.ogc.features.DocumentRoot#getConformsTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConformsTo();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.features.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see net.opengis.ogc.features.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Description();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.features.DocumentRoot#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see net.opengis.ogc.features.DocumentRoot#getEnd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_End();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.features.DocumentRoot#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception</em>'.
	 * @see net.opengis.ogc.features.DocumentRoot#getException()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Exception();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.features.DocumentRoot#getExceptionReport <em>Exception Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception Report</em>'.
	 * @see net.opengis.ogc.features.DocumentRoot#getExceptionReport()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExceptionReport();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.features.DocumentRoot#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extent</em>'.
	 * @see net.opengis.ogc.features.DocumentRoot#getExtent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Extent();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.features.DocumentRoot#getLandingPage <em>Landing Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Landing Page</em>'.
	 * @see net.opengis.ogc.features.DocumentRoot#getLandingPage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LandingPage();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.features.DocumentRoot#getSpatial <em>Spatial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spatial</em>'.
	 * @see net.opengis.ogc.features.DocumentRoot#getSpatial()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Spatial();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.features.DocumentRoot#getSpatialExtent <em>Spatial Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spatial Extent</em>'.
	 * @see net.opengis.ogc.features.DocumentRoot#getSpatialExtent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SpatialExtent();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.features.DocumentRoot#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporal</em>'.
	 * @see net.opengis.ogc.features.DocumentRoot#getTemporal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Temporal();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.features.DocumentRoot#getTemporalExtent <em>Temporal Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporal Extent</em>'.
	 * @see net.opengis.ogc.features.DocumentRoot#getTemporalExtent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TemporalExtent();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.features.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see net.opengis.ogc.features.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Title();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.features.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see net.opengis.ogc.features.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.features.End#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.ogc.features.End#getValue()
	 * @see #getEnd()
	 * @generated
	 */
	EAttribute getEnd_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.features.End#isInclusive <em>Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inclusive</em>'.
	 * @see net.opengis.ogc.features.End#isInclusive()
	 * @see #getEnd()
	 * @generated
	 */
	EAttribute getEnd_Inclusive();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.features.ExceptionReport <em>Exception Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Report</em>'.
	 * @see net.opengis.ogc.features.ExceptionReport
	 * @generated
	 */
	EClass getExceptionReport();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.features.ExceptionReport#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception</em>'.
	 * @see net.opengis.ogc.features.ExceptionReport#getException()
	 * @see #getExceptionReport()
	 * @generated
	 */
	EReference getExceptionReport_Exception();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.features.ExceptionReport#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see net.opengis.ogc.features.ExceptionReport#getLang()
	 * @see #getExceptionReport()
	 * @generated
	 */
	EAttribute getExceptionReport_Lang();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.features.ExceptionReport#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.opengis.ogc.features.ExceptionReport#getVersion()
	 * @see #getExceptionReport()
	 * @generated
	 */
	EAttribute getExceptionReport_Version();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.features.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception</em>'.
	 * @see net.opengis.ogc.features.Exception
	 * @generated
	 */
	EClass getException();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.features.Exception#getExceptionText <em>Exception Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exception Text</em>'.
	 * @see net.opengis.ogc.features.Exception#getExceptionText()
	 * @see #getException()
	 * @generated
	 */
	EAttribute getException_ExceptionText();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.features.Exception#getExceptionCode <em>Exception Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Code</em>'.
	 * @see net.opengis.ogc.features.Exception#getExceptionCode()
	 * @see #getException()
	 * @generated
	 */
	EAttribute getException_ExceptionCode();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.features.Exception#getLocator <em>Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locator</em>'.
	 * @see net.opengis.ogc.features.Exception#getLocator()
	 * @see #getException()
	 * @generated
	 */
	EAttribute getException_Locator();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.features.Extent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extent</em>'.
	 * @see net.opengis.ogc.features.Extent
	 * @generated
	 */
	EClass getExtent();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.features.Extent#getSpatialExtentGroup <em>Spatial Extent Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Spatial Extent Group</em>'.
	 * @see net.opengis.ogc.features.Extent#getSpatialExtentGroup()
	 * @see #getExtent()
	 * @generated
	 */
	EAttribute getExtent_SpatialExtentGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.features.Extent#getSpatialExtent <em>Spatial Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spatial Extent</em>'.
	 * @see net.opengis.ogc.features.Extent#getSpatialExtent()
	 * @see #getExtent()
	 * @generated
	 */
	EReference getExtent_SpatialExtent();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.features.Extent#getTemporalExtentGroup <em>Temporal Extent Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Temporal Extent Group</em>'.
	 * @see net.opengis.ogc.features.Extent#getTemporalExtentGroup()
	 * @see #getExtent()
	 * @generated
	 */
	EAttribute getExtent_TemporalExtentGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.features.Extent#getTemporalExtent <em>Temporal Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Temporal Extent</em>'.
	 * @see net.opengis.ogc.features.Extent#getTemporalExtent()
	 * @see #getExtent()
	 * @generated
	 */
	EReference getExtent_TemporalExtent();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.features.GregorianPeriod <em>Gregorian Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gregorian Period</em>'.
	 * @see net.opengis.ogc.features.GregorianPeriod
	 * @generated
	 */
	EClass getGregorianPeriod();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.features.LandingPage <em>Landing Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Landing Page</em>'.
	 * @see net.opengis.ogc.features.LandingPage
	 * @generated
	 */
	EClass getLandingPage();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.features.LandingPage#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see net.opengis.ogc.features.LandingPage#getTitle()
	 * @see #getLandingPage()
	 * @generated
	 */
	EReference getLandingPage_Title();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.features.LandingPage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see net.opengis.ogc.features.LandingPage#getDescription()
	 * @see #getLandingPage()
	 * @generated
	 */
	EReference getLandingPage_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.features.LandingPage#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see net.opengis.ogc.features.LandingPage#getLink()
	 * @see #getLandingPage()
	 * @generated
	 */
	EReference getLandingPage_Link();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.features.LanguageString <em>Language String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language String</em>'.
	 * @see net.opengis.ogc.features.LanguageString
	 * @generated
	 */
	EClass getLanguageString();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.features.LanguageString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.ogc.features.LanguageString#getValue()
	 * @see #getLanguageString()
	 * @generated
	 */
	EAttribute getLanguageString_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.features.LanguageString#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see net.opengis.ogc.features.LanguageString#getLang()
	 * @see #getLanguageString()
	 * @generated
	 */
	EAttribute getLanguageString_Lang();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.features.SpatialExtent <em>Spatial Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spatial Extent</em>'.
	 * @see net.opengis.ogc.features.SpatialExtent
	 * @generated
	 */
	EClass getSpatialExtent();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.features.TemporalExtent <em>Temporal Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Extent</em>'.
	 * @see net.opengis.ogc.features.TemporalExtent
	 * @generated
	 */
	EClass getTemporalExtent();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.features.TemporalPeriod <em>Temporal Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Period</em>'.
	 * @see net.opengis.ogc.features.TemporalPeriod
	 * @generated
	 */
	EClass getTemporalPeriod();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.features.TemporalPeriod#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Begin</em>'.
	 * @see net.opengis.ogc.features.TemporalPeriod#getBegin()
	 * @see #getTemporalPeriod()
	 * @generated
	 */
	EReference getTemporalPeriod_Begin();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.features.TemporalPeriod#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see net.opengis.ogc.features.TemporalPeriod#getEnd()
	 * @see #getTemporalPeriod()
	 * @generated
	 */
	EReference getTemporalPeriod_End();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.features.TemporalPeriod#getTrs <em>Trs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trs</em>'.
	 * @see net.opengis.ogc.features.TemporalPeriod#getTrs()
	 * @see #getTemporalPeriod()
	 * @generated
	 */
	EAttribute getTemporalPeriod_Trs();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.features.WGS84BoundingBox <em>WGS84 Bounding Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WGS84 Bounding Box</em>'.
	 * @see net.opengis.ogc.features.WGS84BoundingBox
	 * @generated
	 */
	EClass getWGS84BoundingBox();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Position</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='PositionType' itemType='http://www.eclipse.org/emf/2003/XMLType#double'"
	 * @generated
	 */
	EDataType getPosition();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Position2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Position2 D</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='PositionType2D' baseType='PositionType' length='2'"
	 * @generated
	 */
	EDataType getPosition2D();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='VersionStringType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='1\\.0\\.\\d+'"
	 * @generated
	 */
	EDataType getVersionString();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='version_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='\\d+\\.\\d?\\d\\.\\d?\\d'"
	 * @generated
	 */
	EDataType getVersion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OGCFeaturesFactory getOGCFeaturesFactory();

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
		 * The meta object literal for the '{@link net.opengis.ogc.features.impl.BaseResponseImpl <em>Base Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.features.impl.BaseResponseImpl
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getBaseResponse()
		 * @generated
		 */
		EClass BASE_RESPONSE = eINSTANCE.getBaseResponse();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_RESPONSE__SERVICE = eINSTANCE.getBaseResponse_Service();

		/**
		 * The meta object literal for the '<em><b>Update Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_RESPONSE__UPDATE_SEQUENCE = eINSTANCE.getBaseResponse_UpdateSequence();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_RESPONSE__VERSION = eINSTANCE.getBaseResponse_Version();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.features.impl.BeginImpl <em>Begin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.features.impl.BeginImpl
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getBegin()
		 * @generated
		 */
		EClass BEGIN = eINSTANCE.getBegin();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEGIN__VALUE = eINSTANCE.getBegin_Value();

		/**
		 * The meta object literal for the '<em><b>Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEGIN__INCLUSIVE = eINSTANCE.getBegin_Inclusive();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.features.impl.BoundingBoxImpl <em>Bounding Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.features.impl.BoundingBoxImpl
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getBoundingBox()
		 * @generated
		 */
		EClass BOUNDING_BOX = eINSTANCE.getBoundingBox();

		/**
		 * The meta object literal for the '<em><b>Lower Corner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDING_BOX__LOWER_CORNER = eINSTANCE.getBoundingBox_LowerCorner();

		/**
		 * The meta object literal for the '<em><b>Upper Corner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDING_BOX__UPPER_CORNER = eINSTANCE.getBoundingBox_UpperCorner();

		/**
		 * The meta object literal for the '<em><b>Crs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDING_BOX__CRS = eINSTANCE.getBoundingBox_Crs();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDING_BOX__DIMENSIONS = eINSTANCE.getBoundingBox_Dimensions();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.features.impl.FeatureCollectionsImpl <em>Feature Collections</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.features.impl.FeatureCollectionsImpl
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getFeatureCollections()
		 * @generated
		 */
		EClass FEATURE_COLLECTIONS = eINSTANCE.getFeatureCollections();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_COLLECTIONS__LINK = eINSTANCE.getFeatureCollections_Link();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_COLLECTIONS__COLLECTION = eINSTANCE.getFeatureCollections_Collection();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.features.impl.FeatureCollectionImpl <em>Feature Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.features.impl.FeatureCollectionImpl
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getFeatureCollection()
		 * @generated
		 */
		EClass FEATURE_COLLECTION = eINSTANCE.getFeatureCollection();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_COLLECTION__ID = eINSTANCE.getFeatureCollection_Id();

		/**
		 * The meta object literal for the '<em><b>Item Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_COLLECTION__ITEM_TYPE = eINSTANCE.getFeatureCollection_ItemType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_COLLECTION__TITLE = eINSTANCE.getFeatureCollection_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_COLLECTION__DESCRIPTION = eINSTANCE.getFeatureCollection_Description();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_COLLECTION__LINK = eINSTANCE.getFeatureCollection_Link();

		/**
		 * The meta object literal for the '<em><b>Extent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_COLLECTION__EXTENT = eINSTANCE.getFeatureCollection_Extent();

		/**
		 * The meta object literal for the '<em><b>Crs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_COLLECTION__CRS = eINSTANCE.getFeatureCollection_Crs();

		/**
		 * The meta object literal for the '<em><b>Storage Crs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_COLLECTION__STORAGE_CRS = eINSTANCE.getFeatureCollection_StorageCrs();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.features.impl.ConformsToImpl <em>Conforms To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.features.impl.ConformsToImpl
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getConformsTo()
		 * @generated
		 */
		EClass CONFORMS_TO = eINSTANCE.getConformsTo();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFORMS_TO__LINK = eINSTANCE.getConformsTo_Link();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.features.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.features.impl.DocumentRootImpl
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Begin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BEGIN = eINSTANCE.getDocumentRoot_Begin();

		/**
		 * The meta object literal for the '<em><b>Collections</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COLLECTIONS = eINSTANCE.getDocumentRoot_Collections();

		/**
		 * The meta object literal for the '<em><b>Conforms To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONFORMS_TO = eINSTANCE.getDocumentRoot_ConformsTo();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DESCRIPTION = eINSTANCE.getDocumentRoot_Description();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__END = eINSTANCE.getDocumentRoot_End();

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
		 * The meta object literal for the '<em><b>Extent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTENT = eINSTANCE.getDocumentRoot_Extent();

		/**
		 * The meta object literal for the '<em><b>Landing Page</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LANDING_PAGE = eINSTANCE.getDocumentRoot_LandingPage();

		/**
		 * The meta object literal for the '<em><b>Spatial</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPATIAL = eINSTANCE.getDocumentRoot_Spatial();

		/**
		 * The meta object literal for the '<em><b>Spatial Extent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPATIAL_EXTENT = eINSTANCE.getDocumentRoot_SpatialExtent();

		/**
		 * The meta object literal for the '<em><b>Temporal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TEMPORAL = eINSTANCE.getDocumentRoot_Temporal();

		/**
		 * The meta object literal for the '<em><b>Temporal Extent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TEMPORAL_EXTENT = eINSTANCE.getDocumentRoot_TemporalExtent();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TITLE = eINSTANCE.getDocumentRoot_Title();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.features.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.features.impl.EndImpl
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END__VALUE = eINSTANCE.getEnd_Value();

		/**
		 * The meta object literal for the '<em><b>Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END__INCLUSIVE = eINSTANCE.getEnd_Inclusive();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.features.impl.ExceptionReportImpl <em>Exception Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.features.impl.ExceptionReportImpl
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getExceptionReport()
		 * @generated
		 */
		EClass EXCEPTION_REPORT = eINSTANCE.getExceptionReport();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_REPORT__EXCEPTION = eINSTANCE.getExceptionReport_Exception();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_REPORT__LANG = eINSTANCE.getExceptionReport_Lang();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_REPORT__VERSION = eINSTANCE.getExceptionReport_Version();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.features.impl.ExceptionImpl <em>Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.features.impl.ExceptionImpl
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getException()
		 * @generated
		 */
		EClass EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em><b>Exception Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION__EXCEPTION_TEXT = eINSTANCE.getException_ExceptionText();

		/**
		 * The meta object literal for the '<em><b>Exception Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION__EXCEPTION_CODE = eINSTANCE.getException_ExceptionCode();

		/**
		 * The meta object literal for the '<em><b>Locator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION__LOCATOR = eINSTANCE.getException_Locator();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.features.impl.ExtentImpl <em>Extent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.features.impl.ExtentImpl
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getExtent()
		 * @generated
		 */
		EClass EXTENT = eINSTANCE.getExtent();

		/**
		 * The meta object literal for the '<em><b>Spatial Extent Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENT__SPATIAL_EXTENT_GROUP = eINSTANCE.getExtent_SpatialExtentGroup();

		/**
		 * The meta object literal for the '<em><b>Spatial Extent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENT__SPATIAL_EXTENT = eINSTANCE.getExtent_SpatialExtent();

		/**
		 * The meta object literal for the '<em><b>Temporal Extent Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENT__TEMPORAL_EXTENT_GROUP = eINSTANCE.getExtent_TemporalExtentGroup();

		/**
		 * The meta object literal for the '<em><b>Temporal Extent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENT__TEMPORAL_EXTENT = eINSTANCE.getExtent_TemporalExtent();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.features.impl.GregorianPeriodImpl <em>Gregorian Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.features.impl.GregorianPeriodImpl
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getGregorianPeriod()
		 * @generated
		 */
		EClass GREGORIAN_PERIOD = eINSTANCE.getGregorianPeriod();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.features.impl.LandingPageImpl <em>Landing Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.features.impl.LandingPageImpl
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getLandingPage()
		 * @generated
		 */
		EClass LANDING_PAGE = eINSTANCE.getLandingPage();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDING_PAGE__TITLE = eINSTANCE.getLandingPage_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDING_PAGE__DESCRIPTION = eINSTANCE.getLandingPage_Description();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDING_PAGE__LINK = eINSTANCE.getLandingPage_Link();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.features.impl.LanguageStringImpl <em>Language String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.features.impl.LanguageStringImpl
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getLanguageString()
		 * @generated
		 */
		EClass LANGUAGE_STRING = eINSTANCE.getLanguageString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_STRING__VALUE = eINSTANCE.getLanguageString_Value();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_STRING__LANG = eINSTANCE.getLanguageString_Lang();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.features.impl.SpatialExtentImpl <em>Spatial Extent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.features.impl.SpatialExtentImpl
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getSpatialExtent()
		 * @generated
		 */
		EClass SPATIAL_EXTENT = eINSTANCE.getSpatialExtent();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.features.impl.TemporalExtentImpl <em>Temporal Extent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.features.impl.TemporalExtentImpl
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getTemporalExtent()
		 * @generated
		 */
		EClass TEMPORAL_EXTENT = eINSTANCE.getTemporalExtent();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.features.impl.TemporalPeriodImpl <em>Temporal Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.features.impl.TemporalPeriodImpl
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getTemporalPeriod()
		 * @generated
		 */
		EClass TEMPORAL_PERIOD = eINSTANCE.getTemporalPeriod();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_PERIOD__BEGIN = eINSTANCE.getTemporalPeriod_Begin();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_PERIOD__END = eINSTANCE.getTemporalPeriod_End();

		/**
		 * The meta object literal for the '<em><b>Trs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_PERIOD__TRS = eINSTANCE.getTemporalPeriod_Trs();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.features.impl.WGS84BoundingBoxImpl <em>WGS84 Bounding Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.features.impl.WGS84BoundingBoxImpl
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getWGS84BoundingBox()
		 * @generated
		 */
		EClass WGS84_BOUNDING_BOX = eINSTANCE.getWGS84BoundingBox();

		/**
		 * The meta object literal for the '<em>Position</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getPosition()
		 * @generated
		 */
		EDataType POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em>Position2 D</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getPosition2D()
		 * @generated
		 */
		EDataType POSITION2_D = eINSTANCE.getPosition2D();

		/**
		 * The meta object literal for the '<em>Version String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getVersionString()
		 * @generated
		 */
		EDataType VERSION_STRING = eINSTANCE.getVersionString();

		/**
		 * The meta object literal for the '<em>Version</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.ogc.features.impl.OGCFeaturesPackageImpl#getVersion()
		 * @generated
		 */
		EDataType VERSION = eINSTANCE.getVersion();

	}

} //OGCFeaturesPackage
