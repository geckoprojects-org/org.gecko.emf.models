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
package org.openmicroscopy.ome;


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
 * 
 *       Open Microscopy Environment
 *       OME XML Schema June 2016
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
 * <!-- end-model-doc -->
 * @see org.openmicroscopy.ome.OMEFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = OMEPackage.eNS_URI, genModel = "/model/ome.genmodel", genModelSourceLocations = {"model/ome.genmodel","org.openmicroscopy/model/ome.genmodel"}, ecore="/model/ome.ecore", ecoreSourceLocations="/model/ome.ecore")
public interface OMEPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ome";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.openmicroscopy.org/Schemas/OME/2016-06";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ome";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OMEPackage eINSTANCE = org.openmicroscopy.ome.impl.OMEPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.AffineTransformImpl <em>Affine Transform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.AffineTransformImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getAffineTransform()
	 * @generated
	 */
	int AFFINE_TRANSFORM = 0;

	/**
	 * The feature id for the '<em><b>A00</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINE_TRANSFORM__A00 = 0;

	/**
	 * The feature id for the '<em><b>A01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINE_TRANSFORM__A01 = 1;

	/**
	 * The feature id for the '<em><b>A02</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINE_TRANSFORM__A02 = 2;

	/**
	 * The feature id for the '<em><b>A10</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINE_TRANSFORM__A10 = 3;

	/**
	 * The feature id for the '<em><b>A11</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINE_TRANSFORM__A11 = 4;

	/**
	 * The feature id for the '<em><b>A12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINE_TRANSFORM__A12 = 5;

	/**
	 * The number of structural features of the '<em>Affine Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINE_TRANSFORM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Affine Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINE_TRANSFORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.AnnotationImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATION_REF = 1;

	/**
	 * The feature id for the '<em><b>Annotator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATOR = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ID = 3;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAMESPACE = 4;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ReferenceImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 78;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.AnnotationRefTypeImpl <em>Annotation Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.AnnotationRefTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getAnnotationRefType()
	 * @generated
	 */
	int ANNOTATION_REF_TYPE = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_REF_TYPE__ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotation Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_REF_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Annotation Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_REF_TYPE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ManufacturerSpecImpl <em>Manufacturer Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ManufacturerSpecImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getManufacturerSpec()
	 * @generated
	 */
	int MANUFACTURER_SPEC = 52;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURER_SPEC__LOT_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURER_SPEC__MANUFACTURER = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURER_SPEC__MODEL = 2;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURER_SPEC__SERIAL_NUMBER = 3;

	/**
	 * The number of structural features of the '<em>Manufacturer Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURER_SPEC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Manufacturer Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURER_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.LightSourceImpl <em>Light Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.LightSourceImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getLightSource()
	 * @generated
	 */
	int LIGHT_SOURCE = 47;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SOURCE__LOT_NUMBER = MANUFACTURER_SPEC__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SOURCE__MANUFACTURER = MANUFACTURER_SPEC__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SOURCE__MODEL = MANUFACTURER_SPEC__MODEL;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SOURCE__SERIAL_NUMBER = MANUFACTURER_SPEC__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SOURCE__ANNOTATION_REF = MANUFACTURER_SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SOURCE__ID = MANUFACTURER_SPEC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SOURCE__POWER = MANUFACTURER_SPEC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Power Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SOURCE__POWER_UNIT = MANUFACTURER_SPEC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Light Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SOURCE_FEATURE_COUNT = MANUFACTURER_SPEC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Light Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SOURCE_OPERATION_COUNT = MANUFACTURER_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ArcTypeImpl <em>Arc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ArcTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getArcType()
	 * @generated
	 */
	int ARC_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__LOT_NUMBER = LIGHT_SOURCE__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__MANUFACTURER = LIGHT_SOURCE__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__MODEL = LIGHT_SOURCE__MODEL;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__SERIAL_NUMBER = LIGHT_SOURCE__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__ANNOTATION_REF = LIGHT_SOURCE__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__ID = LIGHT_SOURCE__ID;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__POWER = LIGHT_SOURCE__POWER;

	/**
	 * The feature id for the '<em><b>Power Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__POWER_UNIT = LIGHT_SOURCE__POWER_UNIT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__TYPE = LIGHT_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE_FEATURE_COUNT = LIGHT_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Arc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE_OPERATION_COUNT = LIGHT_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.BasicAnnotationImpl <em>Basic Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.BasicAnnotationImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getBasicAnnotation()
	 * @generated
	 */
	int BASIC_ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ANNOTATION__DESCRIPTION = ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ANNOTATION__ANNOTATION_REF = ANNOTATION__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Annotator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ANNOTATION__ANNOTATOR = ANNOTATION__ANNOTATOR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ANNOTATION__ID = ANNOTATION__ID;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ANNOTATION__NAMESPACE = ANNOTATION__NAMESPACE;

	/**
	 * The number of structural features of the '<em>Basic Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ANNOTATION_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.BinaryFileTypeImpl <em>Binary File Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.BinaryFileTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getBinaryFileType()
	 * @generated
	 */
	int BINARY_FILE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>External</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE_TYPE__EXTERNAL = 0;

	/**
	 * The feature id for the '<em><b>Bin Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE_TYPE__BIN_DATA = 1;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE_TYPE__FILE_NAME = 2;

	/**
	 * The feature id for the '<em><b>MIME Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE_TYPE__MIME_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE_TYPE__SIZE = 4;

	/**
	 * The number of structural features of the '<em>Binary File Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Binary File Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.BinaryOnlyTypeImpl <em>Binary Only Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.BinaryOnlyTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getBinaryOnlyType()
	 * @generated
	 */
	int BINARY_ONLY_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Metadata File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ONLY_TYPE__METADATA_FILE = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ONLY_TYPE__UUID = 1;

	/**
	 * The number of structural features of the '<em>Binary Only Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ONLY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Binary Only Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ONLY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.BinDataTypeImpl <em>Bin Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.BinDataTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getBinDataType()
	 * @generated
	 */
	int BIN_DATA_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_DATA_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Big Endian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_DATA_TYPE__BIG_ENDIAN = 1;

	/**
	 * The feature id for the '<em><b>Compression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_DATA_TYPE__COMPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_DATA_TYPE__LENGTH = 3;

	/**
	 * The number of structural features of the '<em>Bin Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_DATA_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bin Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.BooleanAnnotationTypeImpl <em>Boolean Annotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.BooleanAnnotationTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getBooleanAnnotationType()
	 * @generated
	 */
	int BOOLEAN_ANNOTATION_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANNOTATION_TYPE__DESCRIPTION = BASIC_ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANNOTATION_TYPE__ANNOTATION_REF = BASIC_ANNOTATION__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Annotator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANNOTATION_TYPE__ANNOTATOR = BASIC_ANNOTATION__ANNOTATOR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANNOTATION_TYPE__ID = BASIC_ANNOTATION__ID;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANNOTATION_TYPE__NAMESPACE = BASIC_ANNOTATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANNOTATION_TYPE__VALUE = BASIC_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANNOTATION_TYPE_FEATURE_COUNT = BASIC_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANNOTATION_TYPE_OPERATION_COUNT = BASIC_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ChannelRefTypeImpl <em>Channel Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ChannelRefTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getChannelRefType()
	 * @generated
	 */
	int CHANNEL_REF_TYPE = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_REF_TYPE__ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Channel Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_REF_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Channel Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_REF_TYPE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ChannelTypeImpl <em>Channel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ChannelTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getChannelType()
	 * @generated
	 */
	int CHANNEL_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Light Source Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__LIGHT_SOURCE_SETTINGS = 0;

	/**
	 * The feature id for the '<em><b>Detector Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__DETECTOR_SETTINGS = 1;

	/**
	 * The feature id for the '<em><b>Filter Set Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__FILTER_SET_REF = 2;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__ANNOTATION_REF = 3;

	/**
	 * The feature id for the '<em><b>Light Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__LIGHT_PATH = 4;

	/**
	 * The feature id for the '<em><b>Acquisition Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__ACQUISITION_MODE = 5;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__COLOR = 6;

	/**
	 * The feature id for the '<em><b>Contrast Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__CONTRAST_METHOD = 7;

	/**
	 * The feature id for the '<em><b>Emission Wavelength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__EMISSION_WAVELENGTH = 8;

	/**
	 * The feature id for the '<em><b>Emission Wavelength Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__EMISSION_WAVELENGTH_UNIT = 9;

	/**
	 * The feature id for the '<em><b>Excitation Wavelength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__EXCITATION_WAVELENGTH = 10;

	/**
	 * The feature id for the '<em><b>Excitation Wavelength Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__EXCITATION_WAVELENGTH_UNIT = 11;

	/**
	 * The feature id for the '<em><b>Fluor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__FLUOR = 12;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__ID = 13;

	/**
	 * The feature id for the '<em><b>Illumination Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__ILLUMINATION_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__NAME = 15;

	/**
	 * The feature id for the '<em><b>ND Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__ND_FILTER = 16;

	/**
	 * The feature id for the '<em><b>Pinhole Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__PINHOLE_SIZE = 17;

	/**
	 * The feature id for the '<em><b>Pinhole Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__PINHOLE_SIZE_UNIT = 18;

	/**
	 * The feature id for the '<em><b>Pockel Cell Setting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__POCKEL_CELL_SETTING = 19;

	/**
	 * The feature id for the '<em><b>Samples Per Pixel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__SAMPLES_PER_PIXEL = 20;

	/**
	 * The number of structural features of the '<em>Channel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Channel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.TextAnnotationImpl <em>Text Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.TextAnnotationImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTextAnnotation()
	 * @generated
	 */
	int TEXT_ANNOTATION = 89;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION__DESCRIPTION = ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION__ANNOTATION_REF = ANNOTATION__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Annotator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION__ANNOTATOR = ANNOTATION__ANNOTATOR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION__ID = ANNOTATION__ID;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION__NAMESPACE = ANNOTATION__NAMESPACE;

	/**
	 * The number of structural features of the '<em>Text Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.CommentAnnotationTypeImpl <em>Comment Annotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.CommentAnnotationTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getCommentAnnotationType()
	 * @generated
	 */
	int COMMENT_ANNOTATION_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_ANNOTATION_TYPE__DESCRIPTION = TEXT_ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_ANNOTATION_TYPE__ANNOTATION_REF = TEXT_ANNOTATION__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Annotator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_ANNOTATION_TYPE__ANNOTATOR = TEXT_ANNOTATION__ANNOTATOR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_ANNOTATION_TYPE__ID = TEXT_ANNOTATION__ID;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_ANNOTATION_TYPE__NAMESPACE = TEXT_ANNOTATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_ANNOTATION_TYPE__VALUE = TEXT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_ANNOTATION_TYPE_FEATURE_COUNT = TEXT_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comment Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_ANNOTATION_TYPE_OPERATION_COUNT = TEXT_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.DatasetRefTypeImpl <em>Dataset Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.DatasetRefTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDatasetRefType()
	 * @generated
	 */
	int DATASET_REF_TYPE = 12;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_REF_TYPE__ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dataset Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_REF_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dataset Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_REF_TYPE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.DatasetTypeImpl <em>Dataset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.DatasetTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDatasetType()
	 * @generated
	 */
	int DATASET_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Experimenter Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__EXPERIMENTER_REF = 1;

	/**
	 * The feature id for the '<em><b>Experimenter Group Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__EXPERIMENTER_GROUP_REF = 2;

	/**
	 * The feature id for the '<em><b>Image Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__IMAGE_REF = 3;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__ANNOTATION_REF = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__NAME = 6;

	/**
	 * The number of structural features of the '<em>Dataset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Dataset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.SettingsImpl <em>Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.SettingsImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getSettings()
	 * @generated
	 */
	int SETTINGS = 83;

	/**
	 * The number of structural features of the '<em>Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.DetectorSettingsTypeImpl <em>Detector Settings Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.DetectorSettingsTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDetectorSettingsType()
	 * @generated
	 */
	int DETECTOR_SETTINGS_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Binning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_SETTINGS_TYPE__BINNING = SETTINGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_SETTINGS_TYPE__GAIN = SETTINGS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_SETTINGS_TYPE__ID = SETTINGS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Integration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_SETTINGS_TYPE__INTEGRATION = SETTINGS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_SETTINGS_TYPE__OFFSET = SETTINGS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Read Out Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_SETTINGS_TYPE__READ_OUT_RATE = SETTINGS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Read Out Rate Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_SETTINGS_TYPE__READ_OUT_RATE_UNIT = SETTINGS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_SETTINGS_TYPE__VOLTAGE = SETTINGS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Voltage Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_SETTINGS_TYPE__VOLTAGE_UNIT = SETTINGS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_SETTINGS_TYPE__ZOOM = SETTINGS_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Detector Settings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_SETTINGS_TYPE_FEATURE_COUNT = SETTINGS_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Detector Settings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_SETTINGS_TYPE_OPERATION_COUNT = SETTINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.DetectorTypeImpl <em>Detector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.DetectorTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDetectorType()
	 * @generated
	 */
	int DETECTOR_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_TYPE__LOT_NUMBER = MANUFACTURER_SPEC__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_TYPE__MANUFACTURER = MANUFACTURER_SPEC__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_TYPE__MODEL = MANUFACTURER_SPEC__MODEL;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_TYPE__SERIAL_NUMBER = MANUFACTURER_SPEC__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_TYPE__ANNOTATION_REF = MANUFACTURER_SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amplification Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_TYPE__AMPLIFICATION_GAIN = MANUFACTURER_SPEC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_TYPE__GAIN = MANUFACTURER_SPEC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_TYPE__ID = MANUFACTURER_SPEC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_TYPE__OFFSET = MANUFACTURER_SPEC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_TYPE__TYPE = MANUFACTURER_SPEC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_TYPE__VOLTAGE = MANUFACTURER_SPEC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Voltage Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_TYPE__VOLTAGE_UNIT = MANUFACTURER_SPEC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_TYPE__ZOOM = MANUFACTURER_SPEC_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Detector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_TYPE_FEATURE_COUNT = MANUFACTURER_SPEC_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Detector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_TYPE_OPERATION_COUNT = MANUFACTURER_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.DichroicRefTypeImpl <em>Dichroic Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.DichroicRefTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDichroicRefType()
	 * @generated
	 */
	int DICHROIC_REF_TYPE = 16;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHROIC_REF_TYPE__ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dichroic Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHROIC_REF_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dichroic Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHROIC_REF_TYPE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.DichroicTypeImpl <em>Dichroic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.DichroicTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDichroicType()
	 * @generated
	 */
	int DICHROIC_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHROIC_TYPE__LOT_NUMBER = MANUFACTURER_SPEC__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHROIC_TYPE__MANUFACTURER = MANUFACTURER_SPEC__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHROIC_TYPE__MODEL = MANUFACTURER_SPEC__MODEL;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHROIC_TYPE__SERIAL_NUMBER = MANUFACTURER_SPEC__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHROIC_TYPE__ANNOTATION_REF = MANUFACTURER_SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHROIC_TYPE__ID = MANUFACTURER_SPEC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dichroic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHROIC_TYPE_FEATURE_COUNT = MANUFACTURER_SPEC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dichroic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHROIC_TYPE_OPERATION_COUNT = MANUFACTURER_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.DocumentRootImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 18;

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
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ANNOTATION_REF = 3;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ARC = 4;

	/**
	 * The feature id for the '<em><b>Light Source Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIGHT_SOURCE_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Binary File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BINARY_FILE = 6;

	/**
	 * The feature id for the '<em><b>Bin Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BIN_DATA = 7;

	/**
	 * The feature id for the '<em><b>Boolean Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOLEAN_ANNOTATION = 8;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANNEL = 9;

	/**
	 * The feature id for the '<em><b>Channel Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANNEL_REF = 10;

	/**
	 * The feature id for the '<em><b>Comment Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMMENT_ANNOTATION = 11;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATASET = 12;

	/**
	 * The feature id for the '<em><b>Dataset Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATASET_REF = 13;

	/**
	 * The feature id for the '<em><b>Detector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DETECTOR = 14;

	/**
	 * The feature id for the '<em><b>Detector Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DETECTOR_SETTINGS = 15;

	/**
	 * The feature id for the '<em><b>Dichroic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DICHROIC = 16;

	/**
	 * The feature id for the '<em><b>Dichroic Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DICHROIC_REF = 17;

	/**
	 * The feature id for the '<em><b>Double Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOUBLE_ANNOTATION = 18;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ELLIPSE = 19;

	/**
	 * The feature id for the '<em><b>Shape Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHAPE_GROUP = 20;

	/**
	 * The feature id for the '<em><b>Experiment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXPERIMENT = 21;

	/**
	 * The feature id for the '<em><b>Experimenter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXPERIMENTER = 22;

	/**
	 * The feature id for the '<em><b>Experimenter Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXPERIMENTER_GROUP = 23;

	/**
	 * The feature id for the '<em><b>Experimenter Group Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXPERIMENTER_GROUP_REF = 24;

	/**
	 * The feature id for the '<em><b>Experimenter Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXPERIMENTER_REF = 25;

	/**
	 * The feature id for the '<em><b>Experiment Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXPERIMENT_REF = 26;

	/**
	 * The feature id for the '<em><b>External</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTERNAL = 27;

	/**
	 * The feature id for the '<em><b>Filament</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILAMENT = 28;

	/**
	 * The feature id for the '<em><b>File Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILE_ANNOTATION = 29;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER = 30;

	/**
	 * The feature id for the '<em><b>Filter Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER_SET = 31;

	/**
	 * The feature id for the '<em><b>Filter Set Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER_SET_REF = 32;

	/**
	 * The feature id for the '<em><b>Folder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOLDER = 33;

	/**
	 * The feature id for the '<em><b>Folder Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOLDER_REF = 34;

	/**
	 * The feature id for the '<em><b>Generic Excitation Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_EXCITATION_SOURCE = 35;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGE = 36;

	/**
	 * The feature id for the '<em><b>Image Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGE_REF = 37;

	/**
	 * The feature id for the '<em><b>Imaging Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGING_ENVIRONMENT = 38;

	/**
	 * The feature id for the '<em><b>Instrument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INSTRUMENT = 39;

	/**
	 * The feature id for the '<em><b>Instrument Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INSTRUMENT_REF = 40;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LABEL = 41;

	/**
	 * The feature id for the '<em><b>Laser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LASER = 42;

	/**
	 * The feature id for the '<em><b>Leader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LEADER = 43;

	/**
	 * The feature id for the '<em><b>Light Emitting Diode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIGHT_EMITTING_DIODE = 44;

	/**
	 * The feature id for the '<em><b>Light Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIGHT_PATH = 45;

	/**
	 * The feature id for the '<em><b>Light Source Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIGHT_SOURCE_SETTINGS = 46;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINE = 47;

	/**
	 * The feature id for the '<em><b>List Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_ANNOTATION = 48;

	/**
	 * The feature id for the '<em><b>Long Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LONG_ANNOTATION = 49;

	/**
	 * The feature id for the '<em><b>Map Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAP_ANNOTATION = 50;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MASK = 51;

	/**
	 * The feature id for the '<em><b>Metadata Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METADATA_ONLY = 52;

	/**
	 * The feature id for the '<em><b>Microbeam Manipulation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MICROBEAM_MANIPULATION = 53;

	/**
	 * The feature id for the '<em><b>Microbeam Manipulation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MICROBEAM_MANIPULATION_REF = 54;

	/**
	 * The feature id for the '<em><b>Microscope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MICROSCOPE = 55;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBJECTIVE = 56;

	/**
	 * The feature id for the '<em><b>Objective Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBJECTIVE_SETTINGS = 57;

	/**
	 * The feature id for the '<em><b>OME</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OME = 58;

	/**
	 * The feature id for the '<em><b>Pixels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PIXELS = 59;

	/**
	 * The feature id for the '<em><b>Plane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLANE = 60;

	/**
	 * The feature id for the '<em><b>Plate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLATE = 61;

	/**
	 * The feature id for the '<em><b>Plate Acquisition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLATE_ACQUISITION = 62;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POINT = 63;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLYGON = 64;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLYLINE = 65;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROJECT = 66;

	/**
	 * The feature id for the '<em><b>Project Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROJECT_REF = 67;

	/**
	 * The feature id for the '<em><b>Pump</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PUMP = 68;

	/**
	 * The feature id for the '<em><b>Reagent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REAGENT = 69;

	/**
	 * The feature id for the '<em><b>Reagent Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REAGENT_REF = 70;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RECTANGLE = 71;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RIGHTS = 72;

	/**
	 * The feature id for the '<em><b>ROI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROI = 73;

	/**
	 * The feature id for the '<em><b>ROI Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROI_REF = 74;

	/**
	 * The feature id for the '<em><b>Screen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCREEN = 75;

	/**
	 * The feature id for the '<em><b>Stage Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STAGE_LABEL = 76;

	/**
	 * The feature id for the '<em><b>Structured Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRUCTURED_ANNOTATIONS = 77;

	/**
	 * The feature id for the '<em><b>Tag Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAG_ANNOTATION = 78;

	/**
	 * The feature id for the '<em><b>Term Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TERM_ANNOTATION = 79;

	/**
	 * The feature id for the '<em><b>Tiff Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIFF_DATA = 80;

	/**
	 * The feature id for the '<em><b>Timestamp Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIMESTAMP_ANNOTATION = 81;

	/**
	 * The feature id for the '<em><b>Transmittance Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSMITTANCE_RANGE = 82;

	/**
	 * The feature id for the '<em><b>Well</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WELL = 83;

	/**
	 * The feature id for the '<em><b>Well Sample</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WELL_SAMPLE = 84;

	/**
	 * The feature id for the '<em><b>Well Sample Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WELL_SAMPLE_REF = 85;

	/**
	 * The feature id for the '<em><b>XML Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XML_ANNOTATION = 86;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 87;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.NumericAnnotationImpl <em>Numeric Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.NumericAnnotationImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getNumericAnnotation()
	 * @generated
	 */
	int NUMERIC_ANNOTATION = 60;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_ANNOTATION__DESCRIPTION = BASIC_ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_ANNOTATION__ANNOTATION_REF = BASIC_ANNOTATION__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Annotator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_ANNOTATION__ANNOTATOR = BASIC_ANNOTATION__ANNOTATOR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_ANNOTATION__ID = BASIC_ANNOTATION__ID;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_ANNOTATION__NAMESPACE = BASIC_ANNOTATION__NAMESPACE;

	/**
	 * The number of structural features of the '<em>Numeric Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_ANNOTATION_FEATURE_COUNT = BASIC_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_ANNOTATION_OPERATION_COUNT = BASIC_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.DoubleAnnotationTypeImpl <em>Double Annotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.DoubleAnnotationTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDoubleAnnotationType()
	 * @generated
	 */
	int DOUBLE_ANNOTATION_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ANNOTATION_TYPE__DESCRIPTION = NUMERIC_ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ANNOTATION_TYPE__ANNOTATION_REF = NUMERIC_ANNOTATION__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Annotator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ANNOTATION_TYPE__ANNOTATOR = NUMERIC_ANNOTATION__ANNOTATOR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ANNOTATION_TYPE__ID = NUMERIC_ANNOTATION__ID;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ANNOTATION_TYPE__NAMESPACE = NUMERIC_ANNOTATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ANNOTATION_TYPE__VALUE = NUMERIC_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ANNOTATION_TYPE_FEATURE_COUNT = NUMERIC_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ANNOTATION_TYPE_OPERATION_COUNT = NUMERIC_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ShapeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 84;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__TRANSFORM = 0;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ANNOTATION_REF = 1;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FILL_COLOR = 2;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FILL_RULE = 3;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FONT_FAMILY = 4;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FONT_SIZE = 5;

	/**
	 * The feature id for the '<em><b>Font Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FONT_SIZE_UNIT = 6;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FONT_STYLE = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ID = 8;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LOCKED = 9;

	/**
	 * The feature id for the '<em><b>Stroke Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__STROKE_COLOR = 10;

	/**
	 * The feature id for the '<em><b>Stroke Dash Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__STROKE_DASH_ARRAY = 11;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__STROKE_WIDTH = 12;

	/**
	 * The feature id for the '<em><b>Stroke Width Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__STROKE_WIDTH_UNIT = 13;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__TEXT = 14;

	/**
	 * The feature id for the '<em><b>The C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__THE_C = 15;

	/**
	 * The feature id for the '<em><b>The T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__THE_T = 16;

	/**
	 * The feature id for the '<em><b>The Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__THE_Z = 17;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.EllipseTypeImpl <em>Ellipse Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.EllipseTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getEllipseType()
	 * @generated
	 */
	int ELLIPSE_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__TRANSFORM = SHAPE__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__ANNOTATION_REF = SHAPE__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__FILL_COLOR = SHAPE__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__FILL_RULE = SHAPE__FILL_RULE;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__FONT_FAMILY = SHAPE__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__FONT_SIZE = SHAPE__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__FONT_SIZE_UNIT = SHAPE__FONT_SIZE_UNIT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__FONT_STYLE = SHAPE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__LOCKED = SHAPE__LOCKED;

	/**
	 * The feature id for the '<em><b>Stroke Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__STROKE_COLOR = SHAPE__STROKE_COLOR;

	/**
	 * The feature id for the '<em><b>Stroke Dash Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__STROKE_DASH_ARRAY = SHAPE__STROKE_DASH_ARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Width Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__STROKE_WIDTH_UNIT = SHAPE__STROKE_WIDTH_UNIT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__TEXT = SHAPE__TEXT;

	/**
	 * The feature id for the '<em><b>The C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__THE_C = SHAPE__THE_C;

	/**
	 * The feature id for the '<em><b>The T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__THE_T = SHAPE__THE_T;

	/**
	 * The feature id for the '<em><b>The Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__THE_Z = SHAPE__THE_Z;

	/**
	 * The feature id for the '<em><b>Radius X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__RADIUS_X = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Radius Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__RADIUS_Y = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__X = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE__Y = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ellipse Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ellipse Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_TYPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ExperimenterGroupRefTypeImpl <em>Experimenter Group Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ExperimenterGroupRefTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getExperimenterGroupRefType()
	 * @generated
	 */
	int EXPERIMENTER_GROUP_REF_TYPE = 21;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_GROUP_REF_TYPE__ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Experimenter Group Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_GROUP_REF_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Experimenter Group Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_GROUP_REF_TYPE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ExperimenterGroupTypeImpl <em>Experimenter Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ExperimenterGroupTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getExperimenterGroupType()
	 * @generated
	 */
	int EXPERIMENTER_GROUP_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_GROUP_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Experimenter Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_GROUP_TYPE__EXPERIMENTER_REF = 1;

	/**
	 * The feature id for the '<em><b>Leader</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_GROUP_TYPE__LEADER = 2;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_GROUP_TYPE__ANNOTATION_REF = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_GROUP_TYPE__ID = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_GROUP_TYPE__NAME = 5;

	/**
	 * The number of structural features of the '<em>Experimenter Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_GROUP_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Experimenter Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_GROUP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ExperimenterRefTypeImpl <em>Experimenter Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ExperimenterRefTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getExperimenterRefType()
	 * @generated
	 */
	int EXPERIMENTER_REF_TYPE = 23;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_REF_TYPE__ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Experimenter Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_REF_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Experimenter Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_REF_TYPE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ExperimenterTypeImpl <em>Experimenter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ExperimenterTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getExperimenterType()
	 * @generated
	 */
	int EXPERIMENTER_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_TYPE__ANNOTATION_REF = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_TYPE__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_TYPE__FIRST_NAME = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_TYPE__INSTITUTION = 4;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_TYPE__LAST_NAME = 5;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_TYPE__MIDDLE_NAME = 6;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_TYPE__USER_NAME = 7;

	/**
	 * The number of structural features of the '<em>Experimenter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Experimenter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ExperimentRefTypeImpl <em>Experiment Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ExperimentRefTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getExperimentRefType()
	 * @generated
	 */
	int EXPERIMENT_REF_TYPE = 25;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_REF_TYPE__ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Experiment Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_REF_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Experiment Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_REF_TYPE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ExperimentTypeImpl <em>Experiment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ExperimentTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getExperimentType()
	 * @generated
	 */
	int EXPERIMENT_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Experimenter Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_TYPE__EXPERIMENTER_REF = 1;

	/**
	 * The feature id for the '<em><b>Microbeam Manipulation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_TYPE__MICROBEAM_MANIPULATION = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_TYPE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Experiment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Experiment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ExternalTypeImpl <em>External Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ExternalTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getExternalType()
	 * @generated
	 */
	int EXTERNAL_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Compression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TYPE__COMPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TYPE__HREF = 1;

	/**
	 * The feature id for the '<em><b>SHA1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TYPE__SHA1 = 2;

	/**
	 * The number of structural features of the '<em>External Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>External Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.FilamentTypeImpl <em>Filament Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.FilamentTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getFilamentType()
	 * @generated
	 */
	int FILAMENT_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILAMENT_TYPE__LOT_NUMBER = LIGHT_SOURCE__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILAMENT_TYPE__MANUFACTURER = LIGHT_SOURCE__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILAMENT_TYPE__MODEL = LIGHT_SOURCE__MODEL;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILAMENT_TYPE__SERIAL_NUMBER = LIGHT_SOURCE__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILAMENT_TYPE__ANNOTATION_REF = LIGHT_SOURCE__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILAMENT_TYPE__ID = LIGHT_SOURCE__ID;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILAMENT_TYPE__POWER = LIGHT_SOURCE__POWER;

	/**
	 * The feature id for the '<em><b>Power Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILAMENT_TYPE__POWER_UNIT = LIGHT_SOURCE__POWER_UNIT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILAMENT_TYPE__TYPE = LIGHT_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filament Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILAMENT_TYPE_FEATURE_COUNT = LIGHT_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Filament Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILAMENT_TYPE_OPERATION_COUNT = LIGHT_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.TypeAnnotationImpl <em>Type Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.TypeAnnotationImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTypeAnnotation()
	 * @generated
	 */
	int TYPE_ANNOTATION = 93;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ANNOTATION__DESCRIPTION = ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ANNOTATION__ANNOTATION_REF = ANNOTATION__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Annotator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ANNOTATION__ANNOTATOR = ANNOTATION__ANNOTATOR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ANNOTATION__ID = ANNOTATION__ID;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ANNOTATION__NAMESPACE = ANNOTATION__NAMESPACE;

	/**
	 * The number of structural features of the '<em>Type Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ANNOTATION_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.FileAnnotationTypeImpl <em>File Annotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.FileAnnotationTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getFileAnnotationType()
	 * @generated
	 */
	int FILE_ANNOTATION_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ANNOTATION_TYPE__DESCRIPTION = TYPE_ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ANNOTATION_TYPE__ANNOTATION_REF = TYPE_ANNOTATION__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Annotator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ANNOTATION_TYPE__ANNOTATOR = TYPE_ANNOTATION__ANNOTATOR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ANNOTATION_TYPE__ID = TYPE_ANNOTATION__ID;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ANNOTATION_TYPE__NAMESPACE = TYPE_ANNOTATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Binary File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ANNOTATION_TYPE__BINARY_FILE = TYPE_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ANNOTATION_TYPE_FEATURE_COUNT = TYPE_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>File Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ANNOTATION_TYPE_OPERATION_COUNT = TYPE_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.FilterRefImpl <em>Filter Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.FilterRefImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getFilterRef()
	 * @generated
	 */
	int FILTER_REF = 30;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_REF__ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filter Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_REF_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Filter Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_REF_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.FilterSetRefTypeImpl <em>Filter Set Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.FilterSetRefTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getFilterSetRefType()
	 * @generated
	 */
	int FILTER_SET_REF_TYPE = 31;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_SET_REF_TYPE__ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filter Set Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_SET_REF_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Filter Set Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_SET_REF_TYPE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.FilterSetTypeImpl <em>Filter Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.FilterSetTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getFilterSetType()
	 * @generated
	 */
	int FILTER_SET_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_SET_TYPE__LOT_NUMBER = MANUFACTURER_SPEC__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_SET_TYPE__MANUFACTURER = MANUFACTURER_SPEC__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_SET_TYPE__MODEL = MANUFACTURER_SPEC__MODEL;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_SET_TYPE__SERIAL_NUMBER = MANUFACTURER_SPEC__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Excitation Filter Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_SET_TYPE__EXCITATION_FILTER_REF = MANUFACTURER_SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dichroic Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_SET_TYPE__DICHROIC_REF = MANUFACTURER_SPEC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Emission Filter Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_SET_TYPE__EMISSION_FILTER_REF = MANUFACTURER_SPEC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_SET_TYPE__ID = MANUFACTURER_SPEC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Filter Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_SET_TYPE_FEATURE_COUNT = MANUFACTURER_SPEC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Filter Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_SET_TYPE_OPERATION_COUNT = MANUFACTURER_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.FilterTypeImpl <em>Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.FilterTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getFilterType()
	 * @generated
	 */
	int FILTER_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__LOT_NUMBER = MANUFACTURER_SPEC__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__MANUFACTURER = MANUFACTURER_SPEC__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__MODEL = MANUFACTURER_SPEC__MODEL;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__SERIAL_NUMBER = MANUFACTURER_SPEC__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Transmittance Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__TRANSMITTANCE_RANGE = MANUFACTURER_SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__ANNOTATION_REF = MANUFACTURER_SPEC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter Wheel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__FILTER_WHEEL = MANUFACTURER_SPEC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__ID = MANUFACTURER_SPEC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__TYPE = MANUFACTURER_SPEC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE_FEATURE_COUNT = MANUFACTURER_SPEC_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE_OPERATION_COUNT = MANUFACTURER_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.FolderRefTypeImpl <em>Folder Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.FolderRefTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getFolderRefType()
	 * @generated
	 */
	int FOLDER_REF_TYPE = 34;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_REF_TYPE__ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Folder Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_REF_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Folder Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_REF_TYPE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.FolderTypeImpl <em>Folder Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.FolderTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getFolderType()
	 * @generated
	 */
	int FOLDER_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Folder Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__FOLDER_REF = 1;

	/**
	 * The feature id for the '<em><b>Image Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__IMAGE_REF = 2;

	/**
	 * The feature id for the '<em><b>ROI Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ROI_REF = 3;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ANNOTATION_REF = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__NAME = 6;

	/**
	 * The number of structural features of the '<em>Folder Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Folder Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.GenericExcitationSourceTypeImpl <em>Generic Excitation Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.GenericExcitationSourceTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getGenericExcitationSourceType()
	 * @generated
	 */
	int GENERIC_EXCITATION_SOURCE_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EXCITATION_SOURCE_TYPE__LOT_NUMBER = LIGHT_SOURCE__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EXCITATION_SOURCE_TYPE__MANUFACTURER = LIGHT_SOURCE__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EXCITATION_SOURCE_TYPE__MODEL = LIGHT_SOURCE__MODEL;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EXCITATION_SOURCE_TYPE__SERIAL_NUMBER = LIGHT_SOURCE__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EXCITATION_SOURCE_TYPE__ANNOTATION_REF = LIGHT_SOURCE__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EXCITATION_SOURCE_TYPE__ID = LIGHT_SOURCE__ID;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EXCITATION_SOURCE_TYPE__POWER = LIGHT_SOURCE__POWER;

	/**
	 * The feature id for the '<em><b>Power Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EXCITATION_SOURCE_TYPE__POWER_UNIT = LIGHT_SOURCE__POWER_UNIT;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EXCITATION_SOURCE_TYPE__MAP = LIGHT_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Excitation Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EXCITATION_SOURCE_TYPE_FEATURE_COUNT = LIGHT_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Generic Excitation Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EXCITATION_SOURCE_TYPE_OPERATION_COUNT = LIGHT_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ImageRefTypeImpl <em>Image Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ImageRefTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getImageRefType()
	 * @generated
	 */
	int IMAGE_REF_TYPE = 37;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REF_TYPE__ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REF_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Image Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REF_TYPE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ImageTypeImpl <em>Image Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ImageTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getImageType()
	 * @generated
	 */
	int IMAGE_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Acquisition Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__ACQUISITION_DATE = 0;

	/**
	 * The feature id for the '<em><b>Experimenter Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__EXPERIMENTER_REF = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Experiment Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__EXPERIMENT_REF = 3;

	/**
	 * The feature id for the '<em><b>Experimenter Group Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__EXPERIMENTER_GROUP_REF = 4;

	/**
	 * The feature id for the '<em><b>Instrument Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__INSTRUMENT_REF = 5;

	/**
	 * The feature id for the '<em><b>Objective Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__OBJECTIVE_SETTINGS = 6;

	/**
	 * The feature id for the '<em><b>Imaging Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__IMAGING_ENVIRONMENT = 7;

	/**
	 * The feature id for the '<em><b>Stage Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__STAGE_LABEL = 8;

	/**
	 * The feature id for the '<em><b>Pixels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__PIXELS = 9;

	/**
	 * The feature id for the '<em><b>ROI Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__ROI_REF = 10;

	/**
	 * The feature id for the '<em><b>Microbeam Manipulation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__MICROBEAM_MANIPULATION_REF = 11;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__ANNOTATION_REF = 12;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__ID = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__NAME = 14;

	/**
	 * The number of structural features of the '<em>Image Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Image Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ImagingEnvironmentTypeImpl <em>Imaging Environment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ImagingEnvironmentTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getImagingEnvironmentType()
	 * @generated
	 */
	int IMAGING_ENVIRONMENT_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGING_ENVIRONMENT_TYPE__MAP = 0;

	/**
	 * The feature id for the '<em><b>Air Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGING_ENVIRONMENT_TYPE__AIR_PRESSURE = 1;

	/**
	 * The feature id for the '<em><b>Air Pressure Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGING_ENVIRONMENT_TYPE__AIR_PRESSURE_UNIT = 2;

	/**
	 * The feature id for the '<em><b>CO2 Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGING_ENVIRONMENT_TYPE__CO2_PERCENT = 3;

	/**
	 * The feature id for the '<em><b>Humidity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGING_ENVIRONMENT_TYPE__HUMIDITY = 4;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGING_ENVIRONMENT_TYPE__TEMPERATURE = 5;

	/**
	 * The feature id for the '<em><b>Temperature Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGING_ENVIRONMENT_TYPE__TEMPERATURE_UNIT = 6;

	/**
	 * The number of structural features of the '<em>Imaging Environment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGING_ENVIRONMENT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Imaging Environment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGING_ENVIRONMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.InstrumentRefTypeImpl <em>Instrument Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.InstrumentRefTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getInstrumentRefType()
	 * @generated
	 */
	int INSTRUMENT_REF_TYPE = 40;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_REF_TYPE__ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instrument Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_REF_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instrument Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_REF_TYPE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.InstrumentTypeImpl <em>Instrument Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.InstrumentTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getInstrumentType()
	 * @generated
	 */
	int INSTRUMENT_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Microscope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_TYPE__MICROSCOPE = 0;

	/**
	 * The feature id for the '<em><b>Light Source Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_TYPE__LIGHT_SOURCE_GROUP_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Light Source Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_TYPE__LIGHT_SOURCE_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Detector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_TYPE__DETECTOR = 3;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_TYPE__OBJECTIVE = 4;

	/**
	 * The feature id for the '<em><b>Filter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_TYPE__FILTER_SET = 5;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_TYPE__FILTER = 6;

	/**
	 * The feature id for the '<em><b>Dichroic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_TYPE__DICHROIC = 7;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_TYPE__ANNOTATION_REF = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_TYPE__ID = 9;

	/**
	 * The number of structural features of the '<em>Instrument Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Instrument Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.LabelTypeImpl <em>Label Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.LabelTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getLabelType()
	 * @generated
	 */
	int LABEL_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__TRANSFORM = SHAPE__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__ANNOTATION_REF = SHAPE__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__FILL_COLOR = SHAPE__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__FILL_RULE = SHAPE__FILL_RULE;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__FONT_FAMILY = SHAPE__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__FONT_SIZE = SHAPE__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__FONT_SIZE_UNIT = SHAPE__FONT_SIZE_UNIT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__FONT_STYLE = SHAPE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__LOCKED = SHAPE__LOCKED;

	/**
	 * The feature id for the '<em><b>Stroke Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__STROKE_COLOR = SHAPE__STROKE_COLOR;

	/**
	 * The feature id for the '<em><b>Stroke Dash Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__STROKE_DASH_ARRAY = SHAPE__STROKE_DASH_ARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Width Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__STROKE_WIDTH_UNIT = SHAPE__STROKE_WIDTH_UNIT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__TEXT = SHAPE__TEXT;

	/**
	 * The feature id for the '<em><b>The C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__THE_C = SHAPE__THE_C;

	/**
	 * The feature id for the '<em><b>The T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__THE_T = SHAPE__THE_T;

	/**
	 * The feature id for the '<em><b>The Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__THE_Z = SHAPE__THE_Z;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__X = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__Y = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Label Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.LaserTypeImpl <em>Laser Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.LaserTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getLaserType()
	 * @generated
	 */
	int LASER_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_TYPE__LOT_NUMBER = LIGHT_SOURCE__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_TYPE__MANUFACTURER = LIGHT_SOURCE__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_TYPE__MODEL = LIGHT_SOURCE__MODEL;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_TYPE__SERIAL_NUMBER = LIGHT_SOURCE__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_TYPE__ANNOTATION_REF = LIGHT_SOURCE__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_TYPE__ID = LIGHT_SOURCE__ID;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_TYPE__POWER = LIGHT_SOURCE__POWER;

	/**
	 * The feature id for the '<em><b>Power Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_TYPE__POWER_UNIT = LIGHT_SOURCE__POWER_UNIT;

	/**
	 * The feature id for the '<em><b>Pump</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_TYPE__PUMP = LIGHT_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frequency Multiplication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_TYPE__FREQUENCY_MULTIPLICATION = LIGHT_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Laser Medium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_TYPE__LASER_MEDIUM = LIGHT_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pockel Cell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_TYPE__POCKEL_CELL = LIGHT_SOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pulse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_TYPE__PULSE = LIGHT_SOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Repetition Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_TYPE__REPETITION_RATE = LIGHT_SOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Repetition Rate Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_TYPE__REPETITION_RATE_UNIT = LIGHT_SOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tuneable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_TYPE__TUNEABLE = LIGHT_SOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_TYPE__TYPE = LIGHT_SOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Wavelength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_TYPE__WAVELENGTH = LIGHT_SOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Wavelength Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_TYPE__WAVELENGTH_UNIT = LIGHT_SOURCE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Laser Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_TYPE_FEATURE_COUNT = LIGHT_SOURCE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Laser Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_TYPE_OPERATION_COUNT = LIGHT_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.LeaderTypeImpl <em>Leader Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.LeaderTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getLeaderType()
	 * @generated
	 */
	int LEADER_TYPE = 44;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADER_TYPE__ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Leader Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADER_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Leader Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADER_TYPE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.LightEmittingDiodeTypeImpl <em>Light Emitting Diode Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.LightEmittingDiodeTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getLightEmittingDiodeType()
	 * @generated
	 */
	int LIGHT_EMITTING_DIODE_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_EMITTING_DIODE_TYPE__LOT_NUMBER = LIGHT_SOURCE__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_EMITTING_DIODE_TYPE__MANUFACTURER = LIGHT_SOURCE__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_EMITTING_DIODE_TYPE__MODEL = LIGHT_SOURCE__MODEL;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_EMITTING_DIODE_TYPE__SERIAL_NUMBER = LIGHT_SOURCE__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_EMITTING_DIODE_TYPE__ANNOTATION_REF = LIGHT_SOURCE__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_EMITTING_DIODE_TYPE__ID = LIGHT_SOURCE__ID;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_EMITTING_DIODE_TYPE__POWER = LIGHT_SOURCE__POWER;

	/**
	 * The feature id for the '<em><b>Power Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_EMITTING_DIODE_TYPE__POWER_UNIT = LIGHT_SOURCE__POWER_UNIT;

	/**
	 * The number of structural features of the '<em>Light Emitting Diode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_EMITTING_DIODE_TYPE_FEATURE_COUNT = LIGHT_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Light Emitting Diode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_EMITTING_DIODE_TYPE_OPERATION_COUNT = LIGHT_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.LightPathTypeImpl <em>Light Path Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.LightPathTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getLightPathType()
	 * @generated
	 */
	int LIGHT_PATH_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Excitation Filter Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_PATH_TYPE__EXCITATION_FILTER_REF = 0;

	/**
	 * The feature id for the '<em><b>Dichroic Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_PATH_TYPE__DICHROIC_REF = 1;

	/**
	 * The feature id for the '<em><b>Emission Filter Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_PATH_TYPE__EMISSION_FILTER_REF = 2;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_PATH_TYPE__ANNOTATION_REF = 3;

	/**
	 * The number of structural features of the '<em>Light Path Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_PATH_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Light Path Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_PATH_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.LightSourceSettingsTypeImpl <em>Light Source Settings Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.LightSourceSettingsTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getLightSourceSettingsType()
	 * @generated
	 */
	int LIGHT_SOURCE_SETTINGS_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Attenuation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SOURCE_SETTINGS_TYPE__ATTENUATION = SETTINGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SOURCE_SETTINGS_TYPE__ID = SETTINGS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wavelength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SOURCE_SETTINGS_TYPE__WAVELENGTH = SETTINGS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wavelength Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SOURCE_SETTINGS_TYPE__WAVELENGTH_UNIT = SETTINGS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Light Source Settings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SOURCE_SETTINGS_TYPE_FEATURE_COUNT = SETTINGS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Light Source Settings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SOURCE_SETTINGS_TYPE_OPERATION_COUNT = SETTINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.LineTypeImpl <em>Line Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.LineTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getLineType()
	 * @generated
	 */
	int LINE_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__TRANSFORM = SHAPE__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__ANNOTATION_REF = SHAPE__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__FILL_COLOR = SHAPE__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__FILL_RULE = SHAPE__FILL_RULE;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__FONT_FAMILY = SHAPE__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__FONT_SIZE = SHAPE__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__FONT_SIZE_UNIT = SHAPE__FONT_SIZE_UNIT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__FONT_STYLE = SHAPE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__LOCKED = SHAPE__LOCKED;

	/**
	 * The feature id for the '<em><b>Stroke Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__STROKE_COLOR = SHAPE__STROKE_COLOR;

	/**
	 * The feature id for the '<em><b>Stroke Dash Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__STROKE_DASH_ARRAY = SHAPE__STROKE_DASH_ARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Width Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__STROKE_WIDTH_UNIT = SHAPE__STROKE_WIDTH_UNIT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__TEXT = SHAPE__TEXT;

	/**
	 * The feature id for the '<em><b>The C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__THE_C = SHAPE__THE_C;

	/**
	 * The feature id for the '<em><b>The T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__THE_T = SHAPE__THE_T;

	/**
	 * The feature id for the '<em><b>The Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__THE_Z = SHAPE__THE_Z;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__MARKER_END = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__MARKER_START = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__X1 = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__X2 = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__Y1 = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__Y2 = SHAPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Line Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Line Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ListAnnotationTypeImpl <em>List Annotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ListAnnotationTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getListAnnotationType()
	 * @generated
	 */
	int LIST_ANNOTATION_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ANNOTATION_TYPE__DESCRIPTION = ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ANNOTATION_TYPE__ANNOTATION_REF = ANNOTATION__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Annotator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ANNOTATION_TYPE__ANNOTATOR = ANNOTATION__ANNOTATOR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ANNOTATION_TYPE__ID = ANNOTATION__ID;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ANNOTATION_TYPE__NAMESPACE = ANNOTATION__NAMESPACE;

	/**
	 * The number of structural features of the '<em>List Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ANNOTATION_TYPE_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ANNOTATION_TYPE_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.LongAnnotationTypeImpl <em>Long Annotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.LongAnnotationTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getLongAnnotationType()
	 * @generated
	 */
	int LONG_ANNOTATION_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_ANNOTATION_TYPE__DESCRIPTION = NUMERIC_ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_ANNOTATION_TYPE__ANNOTATION_REF = NUMERIC_ANNOTATION__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Annotator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_ANNOTATION_TYPE__ANNOTATOR = NUMERIC_ANNOTATION__ANNOTATOR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_ANNOTATION_TYPE__ID = NUMERIC_ANNOTATION__ID;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_ANNOTATION_TYPE__NAMESPACE = NUMERIC_ANNOTATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_ANNOTATION_TYPE__VALUE = NUMERIC_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Long Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_ANNOTATION_TYPE_FEATURE_COUNT = NUMERIC_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Long Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_ANNOTATION_TYPE_OPERATION_COUNT = NUMERIC_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.MapImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 53;

	/**
	 * The feature id for the '<em><b>M</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__M = 0;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.MapAnnotationTypeImpl <em>Map Annotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.MapAnnotationTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getMapAnnotationType()
	 * @generated
	 */
	int MAP_ANNOTATION_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ANNOTATION_TYPE__DESCRIPTION = ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ANNOTATION_TYPE__ANNOTATION_REF = ANNOTATION__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Annotator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ANNOTATION_TYPE__ANNOTATOR = ANNOTATION__ANNOTATOR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ANNOTATION_TYPE__ID = ANNOTATION__ID;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ANNOTATION_TYPE__NAMESPACE = ANNOTATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ANNOTATION_TYPE__VALUE = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ANNOTATION_TYPE_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Map Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ANNOTATION_TYPE_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.MaskTypeImpl <em>Mask Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.MaskTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getMaskType()
	 * @generated
	 */
	int MASK_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__TRANSFORM = SHAPE__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__ANNOTATION_REF = SHAPE__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__FILL_COLOR = SHAPE__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__FILL_RULE = SHAPE__FILL_RULE;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__FONT_FAMILY = SHAPE__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__FONT_SIZE = SHAPE__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__FONT_SIZE_UNIT = SHAPE__FONT_SIZE_UNIT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__FONT_STYLE = SHAPE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__LOCKED = SHAPE__LOCKED;

	/**
	 * The feature id for the '<em><b>Stroke Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__STROKE_COLOR = SHAPE__STROKE_COLOR;

	/**
	 * The feature id for the '<em><b>Stroke Dash Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__STROKE_DASH_ARRAY = SHAPE__STROKE_DASH_ARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Width Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__STROKE_WIDTH_UNIT = SHAPE__STROKE_WIDTH_UNIT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__TEXT = SHAPE__TEXT;

	/**
	 * The feature id for the '<em><b>The C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__THE_C = SHAPE__THE_C;

	/**
	 * The feature id for the '<em><b>The T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__THE_T = SHAPE__THE_T;

	/**
	 * The feature id for the '<em><b>The Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__THE_Z = SHAPE__THE_Z;

	/**
	 * The feature id for the '<em><b>Bin Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__BIN_DATA = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__HEIGHT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__WIDTH = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__X = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__Y = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Mask Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Mask Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.MicrobeamManipulationRefTypeImpl <em>Microbeam Manipulation Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.MicrobeamManipulationRefTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getMicrobeamManipulationRefType()
	 * @generated
	 */
	int MICROBEAM_MANIPULATION_REF_TYPE = 56;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROBEAM_MANIPULATION_REF_TYPE__ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Microbeam Manipulation Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROBEAM_MANIPULATION_REF_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Microbeam Manipulation Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROBEAM_MANIPULATION_REF_TYPE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.MicrobeamManipulationTypeImpl <em>Microbeam Manipulation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.MicrobeamManipulationTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getMicrobeamManipulationType()
	 * @generated
	 */
	int MICROBEAM_MANIPULATION_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROBEAM_MANIPULATION_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>ROI Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROBEAM_MANIPULATION_TYPE__ROI_REF = 1;

	/**
	 * The feature id for the '<em><b>Experimenter Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROBEAM_MANIPULATION_TYPE__EXPERIMENTER_REF = 2;

	/**
	 * The feature id for the '<em><b>Light Source Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROBEAM_MANIPULATION_TYPE__LIGHT_SOURCE_SETTINGS = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROBEAM_MANIPULATION_TYPE__ID = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROBEAM_MANIPULATION_TYPE__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Microbeam Manipulation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROBEAM_MANIPULATION_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Microbeam Manipulation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROBEAM_MANIPULATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.MicroscopeTypeImpl <em>Microscope Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.MicroscopeTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getMicroscopeType()
	 * @generated
	 */
	int MICROSCOPE_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSCOPE_TYPE__LOT_NUMBER = MANUFACTURER_SPEC__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSCOPE_TYPE__MANUFACTURER = MANUFACTURER_SPEC__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSCOPE_TYPE__MODEL = MANUFACTURER_SPEC__MODEL;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSCOPE_TYPE__SERIAL_NUMBER = MANUFACTURER_SPEC__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSCOPE_TYPE__TYPE = MANUFACTURER_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Microscope Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSCOPE_TYPE_FEATURE_COUNT = MANUFACTURER_SPEC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Microscope Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSCOPE_TYPE_OPERATION_COUNT = MANUFACTURER_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.MTypeImpl <em>MType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.MTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getMType()
	 * @generated
	 */
	int MTYPE = 59;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTYPE__K = 1;

	/**
	 * The number of structural features of the '<em>MType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>MType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ObjectiveSettingsTypeImpl <em>Objective Settings Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ObjectiveSettingsTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getObjectiveSettingsType()
	 * @generated
	 */
	int OBJECTIVE_SETTINGS_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Correction Collar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_SETTINGS_TYPE__CORRECTION_COLLAR = SETTINGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_SETTINGS_TYPE__ID = SETTINGS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Medium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_SETTINGS_TYPE__MEDIUM = SETTINGS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refractive Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_SETTINGS_TYPE__REFRACTIVE_INDEX = SETTINGS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Objective Settings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_SETTINGS_TYPE_FEATURE_COUNT = SETTINGS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Objective Settings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_SETTINGS_TYPE_OPERATION_COUNT = SETTINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ObjectiveTypeImpl <em>Objective Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ObjectiveTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getObjectiveType()
	 * @generated
	 */
	int OBJECTIVE_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_TYPE__LOT_NUMBER = MANUFACTURER_SPEC__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_TYPE__MANUFACTURER = MANUFACTURER_SPEC__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_TYPE__MODEL = MANUFACTURER_SPEC__MODEL;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_TYPE__SERIAL_NUMBER = MANUFACTURER_SPEC__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_TYPE__ANNOTATION_REF = MANUFACTURER_SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calibrated Magnification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_TYPE__CALIBRATED_MAGNIFICATION = MANUFACTURER_SPEC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Correction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_TYPE__CORRECTION = MANUFACTURER_SPEC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_TYPE__ID = MANUFACTURER_SPEC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Immersion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_TYPE__IMMERSION = MANUFACTURER_SPEC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Iris</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_TYPE__IRIS = MANUFACTURER_SPEC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lens NA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_TYPE__LENS_NA = MANUFACTURER_SPEC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Nominal Magnification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_TYPE__NOMINAL_MAGNIFICATION = MANUFACTURER_SPEC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Working Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_TYPE__WORKING_DISTANCE = MANUFACTURER_SPEC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Working Distance Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_TYPE__WORKING_DISTANCE_UNIT = MANUFACTURER_SPEC_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Objective Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_TYPE_FEATURE_COUNT = MANUFACTURER_SPEC_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Objective Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_TYPE_OPERATION_COUNT = MANUFACTURER_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.OMETypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.OMETypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getOMEType()
	 * @generated
	 */
	int OME_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OME_TYPE__RIGHTS = 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OME_TYPE__PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OME_TYPE__DATASET = 2;

	/**
	 * The feature id for the '<em><b>Folder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OME_TYPE__FOLDER = 3;

	/**
	 * The feature id for the '<em><b>Experiment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OME_TYPE__EXPERIMENT = 4;

	/**
	 * The feature id for the '<em><b>Plate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OME_TYPE__PLATE = 5;

	/**
	 * The feature id for the '<em><b>Screen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OME_TYPE__SCREEN = 6;

	/**
	 * The feature id for the '<em><b>Experimenter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OME_TYPE__EXPERIMENTER = 7;

	/**
	 * The feature id for the '<em><b>Experimenter Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OME_TYPE__EXPERIMENTER_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Instrument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OME_TYPE__INSTRUMENT = 9;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OME_TYPE__IMAGE = 10;

	/**
	 * The feature id for the '<em><b>Structured Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OME_TYPE__STRUCTURED_ANNOTATIONS = 11;

	/**
	 * The feature id for the '<em><b>ROI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OME_TYPE__ROI = 12;

	/**
	 * The feature id for the '<em><b>Binary Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OME_TYPE__BINARY_ONLY = 13;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OME_TYPE__CREATOR = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OME_TYPE__UUID = 15;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OME_TYPE_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.PixelsTypeImpl <em>Pixels Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.PixelsTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPixelsType()
	 * @generated
	 */
	int PIXELS_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__CHANNEL = 0;

	/**
	 * The feature id for the '<em><b>Bin Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__BIN_DATA = 1;

	/**
	 * The feature id for the '<em><b>Tiff Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__TIFF_DATA = 2;

	/**
	 * The feature id for the '<em><b>Metadata Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__METADATA_ONLY = 3;

	/**
	 * The feature id for the '<em><b>Plane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__PLANE = 4;

	/**
	 * The feature id for the '<em><b>Big Endian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__BIG_ENDIAN = 5;

	/**
	 * The feature id for the '<em><b>Dimension Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__DIMENSION_ORDER = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__ID = 7;

	/**
	 * The feature id for the '<em><b>Interleaved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__INTERLEAVED = 8;

	/**
	 * The feature id for the '<em><b>Physical Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__PHYSICAL_SIZE_X = 9;

	/**
	 * The feature id for the '<em><b>Physical Size XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__PHYSICAL_SIZE_XUNIT = 10;

	/**
	 * The feature id for the '<em><b>Physical Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__PHYSICAL_SIZE_Y = 11;

	/**
	 * The feature id for the '<em><b>Physical Size YUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__PHYSICAL_SIZE_YUNIT = 12;

	/**
	 * The feature id for the '<em><b>Physical Size Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__PHYSICAL_SIZE_Z = 13;

	/**
	 * The feature id for the '<em><b>Physical Size ZUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__PHYSICAL_SIZE_ZUNIT = 14;

	/**
	 * The feature id for the '<em><b>Significant Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__SIGNIFICANT_BITS = 15;

	/**
	 * The feature id for the '<em><b>Size C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__SIZE_C = 16;

	/**
	 * The feature id for the '<em><b>Size T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__SIZE_T = 17;

	/**
	 * The feature id for the '<em><b>Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__SIZE_X = 18;

	/**
	 * The feature id for the '<em><b>Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__SIZE_Y = 19;

	/**
	 * The feature id for the '<em><b>Size Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__SIZE_Z = 20;

	/**
	 * The feature id for the '<em><b>Time Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__TIME_INCREMENT = 21;

	/**
	 * The feature id for the '<em><b>Time Increment Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__TIME_INCREMENT_UNIT = 22;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE__TYPE = 23;

	/**
	 * The number of structural features of the '<em>Pixels Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE_FEATURE_COUNT = 24;

	/**
	 * The number of operations of the '<em>Pixels Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXELS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.PlaneTypeImpl <em>Plane Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.PlaneTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPlaneType()
	 * @generated
	 */
	int PLANE_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Hash SHA1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE__HASH_SHA1 = 0;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE__ANNOTATION_REF = 1;

	/**
	 * The feature id for the '<em><b>Delta T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE__DELTA_T = 2;

	/**
	 * The feature id for the '<em><b>Delta TUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE__DELTA_TUNIT = 3;

	/**
	 * The feature id for the '<em><b>Exposure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE__EXPOSURE_TIME = 4;

	/**
	 * The feature id for the '<em><b>Exposure Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE__EXPOSURE_TIME_UNIT = 5;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE__POSITION_X = 6;

	/**
	 * The feature id for the '<em><b>Position XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE__POSITION_XUNIT = 7;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE__POSITION_Y = 8;

	/**
	 * The feature id for the '<em><b>Position YUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE__POSITION_YUNIT = 9;

	/**
	 * The feature id for the '<em><b>Position Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE__POSITION_Z = 10;

	/**
	 * The feature id for the '<em><b>Position ZUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE__POSITION_ZUNIT = 11;

	/**
	 * The feature id for the '<em><b>The C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE__THE_C = 12;

	/**
	 * The feature id for the '<em><b>The T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE__THE_T = 13;

	/**
	 * The feature id for the '<em><b>The Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE__THE_Z = 14;

	/**
	 * The number of structural features of the '<em>Plane Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Plane Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.PlateAcquisitionTypeImpl <em>Plate Acquisition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.PlateAcquisitionTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPlateAcquisitionType()
	 * @generated
	 */
	int PLATE_ACQUISITION_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_ACQUISITION_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Well Sample Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_ACQUISITION_TYPE__WELL_SAMPLE_REF = 1;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_ACQUISITION_TYPE__ANNOTATION_REF = 2;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_ACQUISITION_TYPE__END_TIME = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_ACQUISITION_TYPE__ID = 4;

	/**
	 * The feature id for the '<em><b>Maximum Field Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_ACQUISITION_TYPE__MAXIMUM_FIELD_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_ACQUISITION_TYPE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_ACQUISITION_TYPE__START_TIME = 7;

	/**
	 * The number of structural features of the '<em>Plate Acquisition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_ACQUISITION_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Plate Acquisition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_ACQUISITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.PlateRefTypeImpl <em>Plate Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.PlateRefTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPlateRefType()
	 * @generated
	 */
	int PLATE_REF_TYPE = 67;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_REF_TYPE__ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plate Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_REF_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Plate Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_REF_TYPE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.PlateTypeImpl <em>Plate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.PlateTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPlateType()
	 * @generated
	 */
	int PLATE_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Well</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_TYPE__WELL = 1;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_TYPE__ANNOTATION_REF = 2;

	/**
	 * The feature id for the '<em><b>Plate Acquisition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_TYPE__PLATE_ACQUISITION = 3;

	/**
	 * The feature id for the '<em><b>Column Naming Convention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_TYPE__COLUMN_NAMING_CONVENTION = 4;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_TYPE__COLUMNS = 5;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_TYPE__EXTERNAL_IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Field Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_TYPE__FIELD_INDEX = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_TYPE__ID = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_TYPE__NAME = 9;

	/**
	 * The feature id for the '<em><b>Row Naming Convention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_TYPE__ROW_NAMING_CONVENTION = 10;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_TYPE__ROWS = 11;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_TYPE__STATUS = 12;

	/**
	 * The feature id for the '<em><b>Well Origin X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_TYPE__WELL_ORIGIN_X = 13;

	/**
	 * The feature id for the '<em><b>Well Origin XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_TYPE__WELL_ORIGIN_XUNIT = 14;

	/**
	 * The feature id for the '<em><b>Well Origin Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_TYPE__WELL_ORIGIN_Y = 15;

	/**
	 * The feature id for the '<em><b>Well Origin YUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_TYPE__WELL_ORIGIN_YUNIT = 16;

	/**
	 * The number of structural features of the '<em>Plate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_TYPE_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Plate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.PointTypeImpl <em>Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.PointTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPointType()
	 * @generated
	 */
	int POINT_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__TRANSFORM = SHAPE__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__ANNOTATION_REF = SHAPE__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__FILL_COLOR = SHAPE__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__FILL_RULE = SHAPE__FILL_RULE;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__FONT_FAMILY = SHAPE__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__FONT_SIZE = SHAPE__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__FONT_SIZE_UNIT = SHAPE__FONT_SIZE_UNIT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__FONT_STYLE = SHAPE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__LOCKED = SHAPE__LOCKED;

	/**
	 * The feature id for the '<em><b>Stroke Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__STROKE_COLOR = SHAPE__STROKE_COLOR;

	/**
	 * The feature id for the '<em><b>Stroke Dash Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__STROKE_DASH_ARRAY = SHAPE__STROKE_DASH_ARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Width Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__STROKE_WIDTH_UNIT = SHAPE__STROKE_WIDTH_UNIT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__TEXT = SHAPE__TEXT;

	/**
	 * The feature id for the '<em><b>The C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__THE_C = SHAPE__THE_C;

	/**
	 * The feature id for the '<em><b>The T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__THE_T = SHAPE__THE_T;

	/**
	 * The feature id for the '<em><b>The Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__THE_Z = SHAPE__THE_Z;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__X = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__Y = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.PolygonTypeImpl <em>Polygon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.PolygonTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPolygonType()
	 * @generated
	 */
	int POLYGON_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__TRANSFORM = SHAPE__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__ANNOTATION_REF = SHAPE__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__FILL_COLOR = SHAPE__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__FILL_RULE = SHAPE__FILL_RULE;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__FONT_FAMILY = SHAPE__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__FONT_SIZE = SHAPE__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__FONT_SIZE_UNIT = SHAPE__FONT_SIZE_UNIT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__FONT_STYLE = SHAPE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__LOCKED = SHAPE__LOCKED;

	/**
	 * The feature id for the '<em><b>Stroke Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__STROKE_COLOR = SHAPE__STROKE_COLOR;

	/**
	 * The feature id for the '<em><b>Stroke Dash Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__STROKE_DASH_ARRAY = SHAPE__STROKE_DASH_ARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Width Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__STROKE_WIDTH_UNIT = SHAPE__STROKE_WIDTH_UNIT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__TEXT = SHAPE__TEXT;

	/**
	 * The feature id for the '<em><b>The C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__THE_C = SHAPE__THE_C;

	/**
	 * The feature id for the '<em><b>The T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__THE_T = SHAPE__THE_T;

	/**
	 * The feature id for the '<em><b>The Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__THE_Z = SHAPE__THE_Z;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__POINTS = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polygon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Polygon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.PolylineTypeImpl <em>Polyline Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.PolylineTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPolylineType()
	 * @generated
	 */
	int POLYLINE_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__TRANSFORM = SHAPE__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__ANNOTATION_REF = SHAPE__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__FILL_COLOR = SHAPE__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__FILL_RULE = SHAPE__FILL_RULE;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__FONT_FAMILY = SHAPE__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__FONT_SIZE = SHAPE__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__FONT_SIZE_UNIT = SHAPE__FONT_SIZE_UNIT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__FONT_STYLE = SHAPE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__LOCKED = SHAPE__LOCKED;

	/**
	 * The feature id for the '<em><b>Stroke Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__STROKE_COLOR = SHAPE__STROKE_COLOR;

	/**
	 * The feature id for the '<em><b>Stroke Dash Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__STROKE_DASH_ARRAY = SHAPE__STROKE_DASH_ARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Width Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__STROKE_WIDTH_UNIT = SHAPE__STROKE_WIDTH_UNIT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__TEXT = SHAPE__TEXT;

	/**
	 * The feature id for the '<em><b>The C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__THE_C = SHAPE__THE_C;

	/**
	 * The feature id for the '<em><b>The T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__THE_T = SHAPE__THE_T;

	/**
	 * The feature id for the '<em><b>The Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__THE_Z = SHAPE__THE_Z;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__MARKER_END = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__MARKER_START = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE__POINTS = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Polyline Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Polyline Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_TYPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ProjectRefTypeImpl <em>Project Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ProjectRefTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getProjectRefType()
	 * @generated
	 */
	int PROJECT_REF_TYPE = 72;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REF_TYPE__ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Project Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REF_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Project Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REF_TYPE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ProjectTypeImpl <em>Project Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ProjectTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getProjectType()
	 * @generated
	 */
	int PROJECT_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Experimenter Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__EXPERIMENTER_REF = 1;

	/**
	 * The feature id for the '<em><b>Experimenter Group Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__EXPERIMENTER_GROUP_REF = 2;

	/**
	 * The feature id for the '<em><b>Dataset Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__DATASET_REF = 3;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__ANNOTATION_REF = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__NAME = 6;

	/**
	 * The number of structural features of the '<em>Project Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Project Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.PumpTypeImpl <em>Pump Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.PumpTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPumpType()
	 * @generated
	 */
	int PUMP_TYPE = 74;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUMP_TYPE__ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pump Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUMP_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pump Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUMP_TYPE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ReagentRefTypeImpl <em>Reagent Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ReagentRefTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getReagentRefType()
	 * @generated
	 */
	int REAGENT_REF_TYPE = 75;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAGENT_REF_TYPE__ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reagent Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAGENT_REF_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reagent Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAGENT_REF_TYPE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ReagentTypeImpl <em>Reagent Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ReagentTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getReagentType()
	 * @generated
	 */
	int REAGENT_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAGENT_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAGENT_TYPE__ANNOTATION_REF = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAGENT_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAGENT_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Reagent Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAGENT_TYPE__REAGENT_IDENTIFIER = 4;

	/**
	 * The number of structural features of the '<em>Reagent Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAGENT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Reagent Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAGENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.RectangleTypeImpl <em>Rectangle Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.RectangleTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getRectangleType()
	 * @generated
	 */
	int RECTANGLE_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__TRANSFORM = SHAPE__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__ANNOTATION_REF = SHAPE__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__FILL_COLOR = SHAPE__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Fill Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__FILL_RULE = SHAPE__FILL_RULE;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__FONT_FAMILY = SHAPE__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__FONT_SIZE = SHAPE__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__FONT_SIZE_UNIT = SHAPE__FONT_SIZE_UNIT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__FONT_STYLE = SHAPE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__LOCKED = SHAPE__LOCKED;

	/**
	 * The feature id for the '<em><b>Stroke Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__STROKE_COLOR = SHAPE__STROKE_COLOR;

	/**
	 * The feature id for the '<em><b>Stroke Dash Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__STROKE_DASH_ARRAY = SHAPE__STROKE_DASH_ARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Width Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__STROKE_WIDTH_UNIT = SHAPE__STROKE_WIDTH_UNIT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__TEXT = SHAPE__TEXT;

	/**
	 * The feature id for the '<em><b>The C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__THE_C = SHAPE__THE_C;

	/**
	 * The feature id for the '<em><b>The T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__THE_T = SHAPE__THE_T;

	/**
	 * The feature id for the '<em><b>The Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__THE_Z = SHAPE__THE_Z;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__HEIGHT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__WIDTH = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__X = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE__Y = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rectangle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Rectangle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_TYPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.RightsTypeImpl <em>Rights Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.RightsTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getRightsType()
	 * @generated
	 */
	int RIGHTS_TYPE = 79;

	/**
	 * The feature id for the '<em><b>Rights Holder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTS_TYPE__RIGHTS_HOLDER = 0;

	/**
	 * The feature id for the '<em><b>Rights Held</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTS_TYPE__RIGHTS_HELD = 1;

	/**
	 * The number of structural features of the '<em>Rights Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rights Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ROIRefTypeImpl <em>ROI Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ROIRefTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getROIRefType()
	 * @generated
	 */
	int ROI_REF_TYPE = 80;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROI_REF_TYPE__ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ROI Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROI_REF_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ROI Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROI_REF_TYPE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ROITypeImpl <em>ROI Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ROITypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getROIType()
	 * @generated
	 */
	int ROI_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Union</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROI_TYPE__UNION = 0;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROI_TYPE__ANNOTATION_REF = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROI_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROI_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROI_TYPE__NAME = 4;

	/**
	 * The number of structural features of the '<em>ROI Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROI_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>ROI Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROI_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ScreenTypeImpl <em>Screen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ScreenTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getScreenType()
	 * @generated
	 */
	int SCREEN_TYPE = 82;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Reagent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_TYPE__REAGENT = 1;

	/**
	 * The feature id for the '<em><b>Plate Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_TYPE__PLATE_REF = 2;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_TYPE__ANNOTATION_REF = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_TYPE__ID = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_TYPE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Protocol Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_TYPE__PROTOCOL_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Protocol Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_TYPE__PROTOCOL_IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Reagent Set Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_TYPE__REAGENT_SET_DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Reagent Set Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_TYPE__REAGENT_SET_IDENTIFIER = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_TYPE__TYPE = 10;

	/**
	 * The number of structural features of the '<em>Screen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Screen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.StageLabelTypeImpl <em>Stage Label Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.StageLabelTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getStageLabelType()
	 * @generated
	 */
	int STAGE_LABEL_TYPE = 85;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_LABEL_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_LABEL_TYPE__X = 1;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_LABEL_TYPE__XUNIT = 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_LABEL_TYPE__Y = 3;

	/**
	 * The feature id for the '<em><b>YUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_LABEL_TYPE__YUNIT = 4;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_LABEL_TYPE__Z = 5;

	/**
	 * The feature id for the '<em><b>ZUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_LABEL_TYPE__ZUNIT = 6;

	/**
	 * The number of structural features of the '<em>Stage Label Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_LABEL_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Stage Label Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_LABEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.StructuredAnnotationsTypeImpl <em>Structured Annotations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.StructuredAnnotationsTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getStructuredAnnotationsType()
	 * @generated
	 */
	int STRUCTURED_ANNOTATIONS_TYPE = 86;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ANNOTATIONS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>XML Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ANNOTATIONS_TYPE__XML_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>File Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ANNOTATIONS_TYPE__FILE_ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>List Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ANNOTATIONS_TYPE__LIST_ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Long Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ANNOTATIONS_TYPE__LONG_ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>Double Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ANNOTATIONS_TYPE__DOUBLE_ANNOTATION = 5;

	/**
	 * The feature id for the '<em><b>Comment Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ANNOTATIONS_TYPE__COMMENT_ANNOTATION = 6;

	/**
	 * The feature id for the '<em><b>Boolean Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ANNOTATIONS_TYPE__BOOLEAN_ANNOTATION = 7;

	/**
	 * The feature id for the '<em><b>Timestamp Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ANNOTATIONS_TYPE__TIMESTAMP_ANNOTATION = 8;

	/**
	 * The feature id for the '<em><b>Tag Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ANNOTATIONS_TYPE__TAG_ANNOTATION = 9;

	/**
	 * The feature id for the '<em><b>Term Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ANNOTATIONS_TYPE__TERM_ANNOTATION = 10;

	/**
	 * The feature id for the '<em><b>Map Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ANNOTATIONS_TYPE__MAP_ANNOTATION = 11;

	/**
	 * The number of structural features of the '<em>Structured Annotations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ANNOTATIONS_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Structured Annotations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ANNOTATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.TagAnnotationTypeImpl <em>Tag Annotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.TagAnnotationTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTagAnnotationType()
	 * @generated
	 */
	int TAG_ANNOTATION_TYPE = 87;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_ANNOTATION_TYPE__DESCRIPTION = TEXT_ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_ANNOTATION_TYPE__ANNOTATION_REF = TEXT_ANNOTATION__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Annotator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_ANNOTATION_TYPE__ANNOTATOR = TEXT_ANNOTATION__ANNOTATOR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_ANNOTATION_TYPE__ID = TEXT_ANNOTATION__ID;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_ANNOTATION_TYPE__NAMESPACE = TEXT_ANNOTATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_ANNOTATION_TYPE__VALUE = TEXT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tag Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_ANNOTATION_TYPE_FEATURE_COUNT = TEXT_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tag Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_ANNOTATION_TYPE_OPERATION_COUNT = TEXT_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.TermAnnotationTypeImpl <em>Term Annotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.TermAnnotationTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTermAnnotationType()
	 * @generated
	 */
	int TERM_ANNOTATION_TYPE = 88;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_ANNOTATION_TYPE__DESCRIPTION = BASIC_ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_ANNOTATION_TYPE__ANNOTATION_REF = BASIC_ANNOTATION__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Annotator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_ANNOTATION_TYPE__ANNOTATOR = BASIC_ANNOTATION__ANNOTATOR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_ANNOTATION_TYPE__ID = BASIC_ANNOTATION__ID;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_ANNOTATION_TYPE__NAMESPACE = BASIC_ANNOTATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_ANNOTATION_TYPE__VALUE = BASIC_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Term Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_ANNOTATION_TYPE_FEATURE_COUNT = BASIC_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Term Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_ANNOTATION_TYPE_OPERATION_COUNT = BASIC_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.TiffDataTypeImpl <em>Tiff Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.TiffDataTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTiffDataType()
	 * @generated
	 */
	int TIFF_DATA_TYPE = 90;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_DATA_TYPE__UUID = 0;

	/**
	 * The feature id for the '<em><b>First C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_DATA_TYPE__FIRST_C = 1;

	/**
	 * The feature id for the '<em><b>First T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_DATA_TYPE__FIRST_T = 2;

	/**
	 * The feature id for the '<em><b>First Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_DATA_TYPE__FIRST_Z = 3;

	/**
	 * The feature id for the '<em><b>IFD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_DATA_TYPE__IFD = 4;

	/**
	 * The feature id for the '<em><b>Plane Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_DATA_TYPE__PLANE_COUNT = 5;

	/**
	 * The number of structural features of the '<em>Tiff Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_DATA_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Tiff Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.TimestampAnnotationTypeImpl <em>Timestamp Annotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.TimestampAnnotationTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTimestampAnnotationType()
	 * @generated
	 */
	int TIMESTAMP_ANNOTATION_TYPE = 91;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_ANNOTATION_TYPE__DESCRIPTION = BASIC_ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_ANNOTATION_TYPE__ANNOTATION_REF = BASIC_ANNOTATION__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Annotator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_ANNOTATION_TYPE__ANNOTATOR = BASIC_ANNOTATION__ANNOTATOR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_ANNOTATION_TYPE__ID = BASIC_ANNOTATION__ID;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_ANNOTATION_TYPE__NAMESPACE = BASIC_ANNOTATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_ANNOTATION_TYPE__VALUE = BASIC_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timestamp Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_ANNOTATION_TYPE_FEATURE_COUNT = BASIC_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timestamp Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_ANNOTATION_TYPE_OPERATION_COUNT = BASIC_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.TransmittanceRangeTypeImpl <em>Transmittance Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.TransmittanceRangeTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTransmittanceRangeType()
	 * @generated
	 */
	int TRANSMITTANCE_RANGE_TYPE = 92;

	/**
	 * The feature id for the '<em><b>Cut In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTANCE_RANGE_TYPE__CUT_IN = 0;

	/**
	 * The feature id for the '<em><b>Cut In Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTANCE_RANGE_TYPE__CUT_IN_TOLERANCE = 1;

	/**
	 * The feature id for the '<em><b>Cut In Tolerance Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTANCE_RANGE_TYPE__CUT_IN_TOLERANCE_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Cut In Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTANCE_RANGE_TYPE__CUT_IN_UNIT = 3;

	/**
	 * The feature id for the '<em><b>Cut Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTANCE_RANGE_TYPE__CUT_OUT = 4;

	/**
	 * The feature id for the '<em><b>Cut Out Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTANCE_RANGE_TYPE__CUT_OUT_TOLERANCE = 5;

	/**
	 * The feature id for the '<em><b>Cut Out Tolerance Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTANCE_RANGE_TYPE__CUT_OUT_TOLERANCE_UNIT = 6;

	/**
	 * The feature id for the '<em><b>Cut Out Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTANCE_RANGE_TYPE__CUT_OUT_UNIT = 7;

	/**
	 * The feature id for the '<em><b>Transmittance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTANCE_RANGE_TYPE__TRANSMITTANCE = 8;

	/**
	 * The number of structural features of the '<em>Transmittance Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTANCE_RANGE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Transmittance Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTANCE_RANGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.UnionTypeImpl <em>Union Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.UnionTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getUnionType()
	 * @generated
	 */
	int UNION_TYPE = 94;

	/**
	 * The feature id for the '<em><b>Shape Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__SHAPE_GROUP_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Shape Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__SHAPE_GROUP = 1;

	/**
	 * The number of structural features of the '<em>Union Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Union Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.UUIDTypeImpl <em>UUID Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.UUIDTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getUUIDType()
	 * @generated
	 */
	int UUID_TYPE = 95;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_TYPE__FILE_NAME = 1;

	/**
	 * The number of structural features of the '<em>UUID Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>UUID Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.ValueTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 96;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.WellSampleRefTypeImpl <em>Well Sample Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.WellSampleRefTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getWellSampleRefType()
	 * @generated
	 */
	int WELL_SAMPLE_REF_TYPE = 97;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_SAMPLE_REF_TYPE__ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Well Sample Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_SAMPLE_REF_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Well Sample Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_SAMPLE_REF_TYPE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.WellSampleTypeImpl <em>Well Sample Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.WellSampleTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getWellSampleType()
	 * @generated
	 */
	int WELL_SAMPLE_TYPE = 98;

	/**
	 * The feature id for the '<em><b>Image Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_SAMPLE_TYPE__IMAGE_REF = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_SAMPLE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_SAMPLE_TYPE__INDEX = 2;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_SAMPLE_TYPE__POSITION_X = 3;

	/**
	 * The feature id for the '<em><b>Position XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_SAMPLE_TYPE__POSITION_XUNIT = 4;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_SAMPLE_TYPE__POSITION_Y = 5;

	/**
	 * The feature id for the '<em><b>Position YUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_SAMPLE_TYPE__POSITION_YUNIT = 6;

	/**
	 * The feature id for the '<em><b>Timepoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_SAMPLE_TYPE__TIMEPOINT = 7;

	/**
	 * The number of structural features of the '<em>Well Sample Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_SAMPLE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Well Sample Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_SAMPLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.WellTypeImpl <em>Well Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.WellTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getWellType()
	 * @generated
	 */
	int WELL_TYPE = 99;

	/**
	 * The feature id for the '<em><b>Well Sample</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_TYPE__WELL_SAMPLE = 0;

	/**
	 * The feature id for the '<em><b>Reagent Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_TYPE__REAGENT_REF = 1;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_TYPE__ANNOTATION_REF = 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_TYPE__COLOR = 3;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_TYPE__COLUMN = 4;

	/**
	 * The feature id for the '<em><b>External Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_TYPE__EXTERNAL_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_TYPE__EXTERNAL_IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_TYPE__ID = 7;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_TYPE__ROW = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_TYPE__TYPE = 9;

	/**
	 * The number of structural features of the '<em>Well Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Well Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.impl.XMLAnnotationTypeImpl <em>XML Annotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.XMLAnnotationTypeImpl
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getXMLAnnotationType()
	 * @generated
	 */
	int XML_ANNOTATION_TYPE = 100;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ANNOTATION_TYPE__DESCRIPTION = TEXT_ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ANNOTATION_TYPE__ANNOTATION_REF = TEXT_ANNOTATION__ANNOTATION_REF;

	/**
	 * The feature id for the '<em><b>Annotator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ANNOTATION_TYPE__ANNOTATOR = TEXT_ANNOTATION__ANNOTATOR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ANNOTATION_TYPE__ID = TEXT_ANNOTATION__ID;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ANNOTATION_TYPE__NAMESPACE = TEXT_ANNOTATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ANNOTATION_TYPE__VALUE = TEXT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XML Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ANNOTATION_TYPE_FEATURE_COUNT = TEXT_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XML Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ANNOTATION_TYPE_OPERATION_COUNT = TEXT_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.AcquisitionModeType <em>Acquisition Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.AcquisitionModeType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getAcquisitionModeType()
	 * @generated
	 */
	int ACQUISITION_MODE_TYPE = 101;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.Binning <em>Binning</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.Binning
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getBinning()
	 * @generated
	 */
	int BINNING = 102;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.CompressionType <em>Compression Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.CompressionType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getCompressionType()
	 * @generated
	 */
	int COMPRESSION_TYPE = 103;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.CompressionType1 <em>Compression Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.CompressionType1
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getCompressionType1()
	 * @generated
	 */
	int COMPRESSION_TYPE1 = 104;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.ContrastMethodType <em>Contrast Method Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.ContrastMethodType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getContrastMethodType()
	 * @generated
	 */
	int CONTRAST_METHOD_TYPE = 105;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.CorrectionType <em>Correction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.CorrectionType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getCorrectionType()
	 * @generated
	 */
	int CORRECTION_TYPE = 106;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.DimensionOrderType <em>Dimension Order Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.DimensionOrderType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDimensionOrderType()
	 * @generated
	 */
	int DIMENSION_ORDER_TYPE = 107;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.FillRuleType <em>Fill Rule Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.FillRuleType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getFillRuleType()
	 * @generated
	 */
	int FILL_RULE_TYPE = 108;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.FontFamily <em>Font Family</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.FontFamily
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getFontFamily()
	 * @generated
	 */
	int FONT_FAMILY = 109;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.FontFamilyType <em>Font Family Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.FontFamilyType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getFontFamilyType()
	 * @generated
	 */
	int FONT_FAMILY_TYPE = 110;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.FontStyleType <em>Font Style Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.FontStyleType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getFontStyleType()
	 * @generated
	 */
	int FONT_STYLE_TYPE = 111;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.IlluminationTypeType <em>Illumination Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.IlluminationTypeType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getIlluminationTypeType()
	 * @generated
	 */
	int ILLUMINATION_TYPE_TYPE = 112;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.ImmersionType <em>Immersion Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.ImmersionType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getImmersionType()
	 * @generated
	 */
	int IMMERSION_TYPE = 113;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.LaserMediumType <em>Laser Medium Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.LaserMediumType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getLaserMediumType()
	 * @generated
	 */
	int LASER_MEDIUM_TYPE = 114;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.Marker <em>Marker</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.Marker
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getMarker()
	 * @generated
	 */
	int MARKER = 115;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.MediumType <em>Medium Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.MediumType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getMediumType()
	 * @generated
	 */
	int MEDIUM_TYPE = 116;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.NamingConvention <em>Naming Convention</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.NamingConvention
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getNamingConvention()
	 * @generated
	 */
	int NAMING_CONVENTION = 117;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.PixelType <em>Pixel Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.PixelType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPixelType()
	 * @generated
	 */
	int PIXEL_TYPE = 118;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.PulseType <em>Pulse Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.PulseType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPulseType()
	 * @generated
	 */
	int PULSE_TYPE = 119;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.TypeType2 <em>Type Type2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.TypeType2
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTypeType2()
	 * @generated
	 */
	int TYPE_TYPE2 = 120;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.TypeType3 <em>Type Type3</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.TypeType3
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTypeType3()
	 * @generated
	 */
	int TYPE_TYPE3 = 121;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.TypeType4 <em>Type Type4</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.TypeType4
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTypeType4()
	 * @generated
	 */
	int TYPE_TYPE4 = 122;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.TypeType5 <em>Type Type5</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.TypeType5
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTypeType5()
	 * @generated
	 */
	int TYPE_TYPE5 = 123;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.TypeType6 <em>Type Type6</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.TypeType6
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTypeType6()
	 * @generated
	 */
	int TYPE_TYPE6 = 124;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.TypeType7 <em>Type Type7</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.TypeType7
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTypeType7()
	 * @generated
	 */
	int TYPE_TYPE7 = 125;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.TypeTypeItem <em>Type Type Item</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.TypeTypeItem
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTypeTypeItem()
	 * @generated
	 */
	int TYPE_TYPE_ITEM = 126;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.TypeTypeItem1 <em>Type Type Item1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.TypeTypeItem1
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTypeTypeItem1()
	 * @generated
	 */
	int TYPE_TYPE_ITEM1 = 127;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.UnitsAngle <em>Units Angle</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.UnitsAngle
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getUnitsAngle()
	 * @generated
	 */
	int UNITS_ANGLE = 128;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.UnitsElectricPotential <em>Units Electric Potential</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.UnitsElectricPotential
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getUnitsElectricPotential()
	 * @generated
	 */
	int UNITS_ELECTRIC_POTENTIAL = 129;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.UnitsFrequency <em>Units Frequency</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.UnitsFrequency
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getUnitsFrequency()
	 * @generated
	 */
	int UNITS_FREQUENCY = 130;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.UnitsLength <em>Units Length</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getUnitsLength()
	 * @generated
	 */
	int UNITS_LENGTH = 131;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.UnitsPower <em>Units Power</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.UnitsPower
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getUnitsPower()
	 * @generated
	 */
	int UNITS_POWER = 132;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.UnitsPressure <em>Units Pressure</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.UnitsPressure
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getUnitsPressure()
	 * @generated
	 */
	int UNITS_PRESSURE = 133;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.UnitsTemperature <em>Units Temperature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.UnitsTemperature
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getUnitsTemperature()
	 * @generated
	 */
	int UNITS_TEMPERATURE = 134;

	/**
	 * The meta object id for the '{@link org.openmicroscopy.ome.UnitsTime <em>Units Time</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.UnitsTime
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getUnitsTime()
	 * @generated
	 */
	int UNITS_TIME = 135;

	/**
	 * The meta object id for the '<em>Acquisition Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.AcquisitionModeType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getAcquisitionModeTypeObject()
	 * @generated
	 */
	int ACQUISITION_MODE_TYPE_OBJECT = 136;

	/**
	 * The meta object id for the '<em>Annotation ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getAnnotationID()
	 * @generated
	 */
	int ANNOTATION_ID = 137;

	/**
	 * The meta object id for the '<em>Base64 Binary</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getBase64Binary()
	 * @generated
	 */
	int BASE64_BINARY = 138;

	/**
	 * The meta object id for the '<em>Binning Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.Binning
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getBinningObject()
	 * @generated
	 */
	int BINNING_OBJECT = 139;

	/**
	 * The meta object id for the '<em>Channel ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getChannelID()
	 * @generated
	 */
	int CHANNEL_ID = 140;

	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 141;

	/**
	 * The meta object id for the '<em>Color Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getColorObject()
	 * @generated
	 */
	int COLOR_OBJECT = 142;

	/**
	 * The meta object id for the '<em>Compression Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.CompressionType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getCompressionTypeObject()
	 * @generated
	 */
	int COMPRESSION_TYPE_OBJECT = 143;

	/**
	 * The meta object id for the '<em>Compression Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.CompressionType1
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getCompressionTypeObject1()
	 * @generated
	 */
	int COMPRESSION_TYPE_OBJECT1 = 144;

	/**
	 * The meta object id for the '<em>Contrast Method Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.ContrastMethodType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getContrastMethodTypeObject()
	 * @generated
	 */
	int CONTRAST_METHOD_TYPE_OBJECT = 145;

	/**
	 * The meta object id for the '<em>Correction Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.CorrectionType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getCorrectionTypeObject()
	 * @generated
	 */
	int CORRECTION_TYPE_OBJECT = 146;

	/**
	 * The meta object id for the '<em>Dataset ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDatasetID()
	 * @generated
	 */
	int DATASET_ID = 147;

	/**
	 * The meta object id for the '<em>Description Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDescriptionType()
	 * @generated
	 */
	int DESCRIPTION_TYPE = 148;

	/**
	 * The meta object id for the '<em>Description Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDescriptionType1()
	 * @generated
	 */
	int DESCRIPTION_TYPE1 = 149;

	/**
	 * The meta object id for the '<em>Description Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDescriptionType2()
	 * @generated
	 */
	int DESCRIPTION_TYPE2 = 150;

	/**
	 * The meta object id for the '<em>Description Type3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDescriptionType3()
	 * @generated
	 */
	int DESCRIPTION_TYPE3 = 151;

	/**
	 * The meta object id for the '<em>Description Type4</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDescriptionType4()
	 * @generated
	 */
	int DESCRIPTION_TYPE4 = 152;

	/**
	 * The meta object id for the '<em>Description Type5</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDescriptionType5()
	 * @generated
	 */
	int DESCRIPTION_TYPE5 = 153;

	/**
	 * The meta object id for the '<em>Description Type6</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDescriptionType6()
	 * @generated
	 */
	int DESCRIPTION_TYPE6 = 154;

	/**
	 * The meta object id for the '<em>Description Type7</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDescriptionType7()
	 * @generated
	 */
	int DESCRIPTION_TYPE7 = 155;

	/**
	 * The meta object id for the '<em>Description Type8</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDescriptionType8()
	 * @generated
	 */
	int DESCRIPTION_TYPE8 = 156;

	/**
	 * The meta object id for the '<em>Description Type9</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDescriptionType9()
	 * @generated
	 */
	int DESCRIPTION_TYPE9 = 157;

	/**
	 * The meta object id for the '<em>Description Type10</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDescriptionType10()
	 * @generated
	 */
	int DESCRIPTION_TYPE10 = 158;

	/**
	 * The meta object id for the '<em>Description Type11</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDescriptionType11()
	 * @generated
	 */
	int DESCRIPTION_TYPE11 = 159;

	/**
	 * The meta object id for the '<em>Description Type12</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDescriptionType12()
	 * @generated
	 */
	int DESCRIPTION_TYPE12 = 160;

	/**
	 * The meta object id for the '<em>Detector ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDetectorID()
	 * @generated
	 */
	int DETECTOR_ID = 161;

	/**
	 * The meta object id for the '<em>Dichroic ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDichroicID()
	 * @generated
	 */
	int DICHROIC_ID = 162;

	/**
	 * The meta object id for the '<em>Dimension Order Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.DimensionOrderType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getDimensionOrderTypeObject()
	 * @generated
	 */
	int DIMENSION_ORDER_TYPE_OBJECT = 163;

	/**
	 * The meta object id for the '<em>Experimenter Group ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getExperimenterGroupID()
	 * @generated
	 */
	int EXPERIMENTER_GROUP_ID = 164;

	/**
	 * The meta object id for the '<em>Experimenter ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getExperimenterID()
	 * @generated
	 */
	int EXPERIMENTER_ID = 165;

	/**
	 * The meta object id for the '<em>Experiment ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getExperimentID()
	 * @generated
	 */
	int EXPERIMENT_ID = 166;

	/**
	 * The meta object id for the '<em>Fill Rule Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.FillRuleType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getFillRuleTypeObject()
	 * @generated
	 */
	int FILL_RULE_TYPE_OBJECT = 167;

	/**
	 * The meta object id for the '<em>Filter ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getFilterID()
	 * @generated
	 */
	int FILTER_ID = 168;

	/**
	 * The meta object id for the '<em>Filter Set ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getFilterSetID()
	 * @generated
	 */
	int FILTER_SET_ID = 169;

	/**
	 * The meta object id for the '<em>Folder ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getFolderID()
	 * @generated
	 */
	int FOLDER_ID = 170;

	/**
	 * The meta object id for the '<em>Font Family Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.FontFamily
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getFontFamilyObject()
	 * @generated
	 */
	int FONT_FAMILY_OBJECT = 171;

	/**
	 * The meta object id for the '<em>Font Family Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.FontFamilyType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getFontFamilyTypeObject()
	 * @generated
	 */
	int FONT_FAMILY_TYPE_OBJECT = 172;

	/**
	 * The meta object id for the '<em>Font Style Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.FontStyleType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getFontStyleTypeObject()
	 * @generated
	 */
	int FONT_STYLE_TYPE_OBJECT = 173;

	/**
	 * The meta object id for the '<em>Hex40</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getHex40()
	 * @generated
	 */
	int HEX40 = 174;

	/**
	 * The meta object id for the '<em>Illumination Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.IlluminationTypeType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getIlluminationTypeTypeObject()
	 * @generated
	 */
	int ILLUMINATION_TYPE_TYPE_OBJECT = 175;

	/**
	 * The meta object id for the '<em>Image ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getImageID()
	 * @generated
	 */
	int IMAGE_ID = 176;

	/**
	 * The meta object id for the '<em>Immersion Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.ImmersionType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getImmersionTypeObject()
	 * @generated
	 */
	int IMMERSION_TYPE_OBJECT = 177;

	/**
	 * The meta object id for the '<em>Instrument ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getInstrumentID()
	 * @generated
	 */
	int INSTRUMENT_ID = 178;

	/**
	 * The meta object id for the '<em>Laser Medium Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.LaserMediumType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getLaserMediumTypeObject()
	 * @generated
	 */
	int LASER_MEDIUM_TYPE_OBJECT = 179;

	/**
	 * The meta object id for the '<em>Length Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getLengthType()
	 * @generated
	 */
	int LENGTH_TYPE = 180;

	/**
	 * The meta object id for the '<em>Length Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getLengthTypeObject()
	 * @generated
	 */
	int LENGTH_TYPE_OBJECT = 181;

	/**
	 * The meta object id for the '<em>Light Source ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getLightSourceID()
	 * @generated
	 */
	int LIGHT_SOURCE_ID = 182;

	/**
	 * The meta object id for the '<em>LSID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getLSID()
	 * @generated
	 */
	int LSID = 183;

	/**
	 * The meta object id for the '<em>Marker Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.Marker
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getMarkerObject()
	 * @generated
	 */
	int MARKER_OBJECT = 184;

	/**
	 * The meta object id for the '<em>Medium Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.MediumType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getMediumTypeObject()
	 * @generated
	 */
	int MEDIUM_TYPE_OBJECT = 185;

	/**
	 * The meta object id for the '<em>Microbeam Manipulation ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getMicrobeamManipulationID()
	 * @generated
	 */
	int MICROBEAM_MANIPULATION_ID = 186;

	/**
	 * The meta object id for the '<em>Module ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getModuleID()
	 * @generated
	 */
	int MODULE_ID = 187;

	/**
	 * The meta object id for the '<em>Naming Convention Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.NamingConvention
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getNamingConventionObject()
	 * @generated
	 */
	int NAMING_CONVENTION_OBJECT = 188;

	/**
	 * The meta object id for the '<em>Non Negative Float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getNonNegativeFloat()
	 * @generated
	 */
	int NON_NEGATIVE_FLOAT = 189;

	/**
	 * The meta object id for the '<em>Non Negative Float Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getNonNegativeFloatObject()
	 * @generated
	 */
	int NON_NEGATIVE_FLOAT_OBJECT = 190;

	/**
	 * The meta object id for the '<em>Non Negative Int</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getNonNegativeInt()
	 * @generated
	 */
	int NON_NEGATIVE_INT = 191;

	/**
	 * The meta object id for the '<em>Non Negative Int Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getNonNegativeIntObject()
	 * @generated
	 */
	int NON_NEGATIVE_INT_OBJECT = 192;

	/**
	 * The meta object id for the '<em>Non Negative Long</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getNonNegativeLong()
	 * @generated
	 */
	int NON_NEGATIVE_LONG = 193;

	/**
	 * The meta object id for the '<em>Non Negative Long Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getNonNegativeLongObject()
	 * @generated
	 */
	int NON_NEGATIVE_LONG_OBJECT = 194;

	/**
	 * The meta object id for the '<em>Objective ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getObjectiveID()
	 * @generated
	 */
	int OBJECTIVE_ID = 195;

	/**
	 * The meta object id for the '<em>Percent Fraction</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPercentFraction()
	 * @generated
	 */
	int PERCENT_FRACTION = 196;

	/**
	 * The meta object id for the '<em>Percent Fraction Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPercentFractionObject()
	 * @generated
	 */
	int PERCENT_FRACTION_OBJECT = 197;

	/**
	 * The meta object id for the '<em>Pixels ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPixelsID()
	 * @generated
	 */
	int PIXELS_ID = 198;

	/**
	 * The meta object id for the '<em>Pixel Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.PixelType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPixelTypeObject()
	 * @generated
	 */
	int PIXEL_TYPE_OBJECT = 199;

	/**
	 * The meta object id for the '<em>Plate Acquisition ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPlateAcquisitionID()
	 * @generated
	 */
	int PLATE_ACQUISITION_ID = 200;

	/**
	 * The meta object id for the '<em>Plate ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPlateID()
	 * @generated
	 */
	int PLATE_ID = 201;

	/**
	 * The meta object id for the '<em>Positive Float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPositiveFloat()
	 * @generated
	 */
	int POSITIVE_FLOAT = 202;

	/**
	 * The meta object id for the '<em>Positive Float Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPositiveFloatObject()
	 * @generated
	 */
	int POSITIVE_FLOAT_OBJECT = 203;

	/**
	 * The meta object id for the '<em>Positive Int</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPositiveInt()
	 * @generated
	 */
	int POSITIVE_INT = 204;

	/**
	 * The meta object id for the '<em>Positive Int Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPositiveIntObject()
	 * @generated
	 */
	int POSITIVE_INT_OBJECT = 205;

	/**
	 * The meta object id for the '<em>Project ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getProjectID()
	 * @generated
	 */
	int PROJECT_ID = 206;

	/**
	 * The meta object id for the '<em>Pulse Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.PulseType
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getPulseTypeObject()
	 * @generated
	 */
	int PULSE_TYPE_OBJECT = 207;

	/**
	 * The meta object id for the '<em>Reagent ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getReagentID()
	 * @generated
	 */
	int REAGENT_ID = 208;

	/**
	 * The meta object id for the '<em>Rights Held Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getRightsHeldType()
	 * @generated
	 */
	int RIGHTS_HELD_TYPE = 209;

	/**
	 * The meta object id for the '<em>Rights Holder Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getRightsHolderType()
	 * @generated
	 */
	int RIGHTS_HOLDER_TYPE = 210;

	/**
	 * The meta object id for the '<em>ROIID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getROIID()
	 * @generated
	 */
	int ROIID = 211;

	/**
	 * The meta object id for the '<em>Screen ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getScreenID()
	 * @generated
	 */
	int SCREEN_ID = 212;

	/**
	 * The meta object id for the '<em>Shape ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getShapeID()
	 * @generated
	 */
	int SHAPE_ID = 213;

	/**
	 * The meta object id for the '<em>Type Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 214;

	/**
	 * The meta object id for the '<em>Type Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTypeType1()
	 * @generated
	 */
	int TYPE_TYPE1 = 215;

	/**
	 * The meta object id for the '<em>Type Type Item Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.TypeTypeItem
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTypeTypeItemObject()
	 * @generated
	 */
	int TYPE_TYPE_ITEM_OBJECT = 216;

	/**
	 * The meta object id for the '<em>Type Type Item Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.TypeTypeItem1
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTypeTypeItemObject1()
	 * @generated
	 */
	int TYPE_TYPE_ITEM_OBJECT1 = 217;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.TypeType4
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 218;

	/**
	 * The meta object id for the '<em>Type Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.TypeType5
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTypeTypeObject1()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT1 = 219;

	/**
	 * The meta object id for the '<em>Type Type Object2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.TypeType6
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTypeTypeObject2()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT2 = 220;

	/**
	 * The meta object id for the '<em>Type Type Object3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.TypeType3
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTypeTypeObject3()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT3 = 221;

	/**
	 * The meta object id for the '<em>Type Type Object4</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.TypeType2
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTypeTypeObject4()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT4 = 222;

	/**
	 * The meta object id for the '<em>Type Type Object5</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.TypeType7
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getTypeTypeObject5()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT5 = 223;

	/**
	 * The meta object id for the '<em>Units Angle Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.UnitsAngle
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getUnitsAngleObject()
	 * @generated
	 */
	int UNITS_ANGLE_OBJECT = 224;

	/**
	 * The meta object id for the '<em>Units Electric Potential Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.UnitsElectricPotential
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getUnitsElectricPotentialObject()
	 * @generated
	 */
	int UNITS_ELECTRIC_POTENTIAL_OBJECT = 225;

	/**
	 * The meta object id for the '<em>Units Frequency Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.UnitsFrequency
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getUnitsFrequencyObject()
	 * @generated
	 */
	int UNITS_FREQUENCY_OBJECT = 226;

	/**
	 * The meta object id for the '<em>Units Length Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getUnitsLengthObject()
	 * @generated
	 */
	int UNITS_LENGTH_OBJECT = 227;

	/**
	 * The meta object id for the '<em>Units Power Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.UnitsPower
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getUnitsPowerObject()
	 * @generated
	 */
	int UNITS_POWER_OBJECT = 228;

	/**
	 * The meta object id for the '<em>Units Pressure Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.UnitsPressure
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getUnitsPressureObject()
	 * @generated
	 */
	int UNITS_PRESSURE_OBJECT = 229;

	/**
	 * The meta object id for the '<em>Units Temperature Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.UnitsTemperature
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getUnitsTemperatureObject()
	 * @generated
	 */
	int UNITS_TEMPERATURE_OBJECT = 230;

	/**
	 * The meta object id for the '<em>Units Time Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openmicroscopy.ome.UnitsTime
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getUnitsTimeObject()
	 * @generated
	 */
	int UNITS_TIME_OBJECT = 231;

	/**
	 * The meta object id for the '<em>Universally Unique Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getUniversallyUniqueIdentifier()
	 * @generated
	 */
	int UNIVERSALLY_UNIQUE_IDENTIFIER = 232;

	/**
	 * The meta object id for the '<em>Well ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getWellID()
	 * @generated
	 */
	int WELL_ID = 233;

	/**
	 * The meta object id for the '<em>Well Sample ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openmicroscopy.ome.impl.OMEPackageImpl#getWellSampleID()
	 * @generated
	 */
	int WELL_SAMPLE_ID = 234;


	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.AffineTransform <em>Affine Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affine Transform</em>'.
	 * @see org.openmicroscopy.ome.AffineTransform
	 * @generated
	 */
	EClass getAffineTransform();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.AffineTransform#getA00 <em>A00</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A00</em>'.
	 * @see org.openmicroscopy.ome.AffineTransform#getA00()
	 * @see #getAffineTransform()
	 * @generated
	 */
	EAttribute getAffineTransform_A00();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.AffineTransform#getA01 <em>A01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A01</em>'.
	 * @see org.openmicroscopy.ome.AffineTransform#getA01()
	 * @see #getAffineTransform()
	 * @generated
	 */
	EAttribute getAffineTransform_A01();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.AffineTransform#getA02 <em>A02</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A02</em>'.
	 * @see org.openmicroscopy.ome.AffineTransform#getA02()
	 * @see #getAffineTransform()
	 * @generated
	 */
	EAttribute getAffineTransform_A02();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.AffineTransform#getA10 <em>A10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A10</em>'.
	 * @see org.openmicroscopy.ome.AffineTransform#getA10()
	 * @see #getAffineTransform()
	 * @generated
	 */
	EAttribute getAffineTransform_A10();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.AffineTransform#getA11 <em>A11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A11</em>'.
	 * @see org.openmicroscopy.ome.AffineTransform#getA11()
	 * @see #getAffineTransform()
	 * @generated
	 */
	EAttribute getAffineTransform_A11();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.AffineTransform#getA12 <em>A12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A12</em>'.
	 * @see org.openmicroscopy.ome.AffineTransform#getA12()
	 * @see #getAffineTransform()
	 * @generated
	 */
	EAttribute getAffineTransform_A12();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.openmicroscopy.ome.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.Annotation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openmicroscopy.ome.Annotation#getDescription()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.Annotation#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.Annotation#getAnnotationRef()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_AnnotationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.Annotation#getAnnotator <em>Annotator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotator</em>'.
	 * @see org.openmicroscopy.ome.Annotation#getAnnotator()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Annotator();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.Annotation#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.Annotation#getID()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.Annotation#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.openmicroscopy.ome.Annotation#getNamespace()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Namespace();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.AnnotationRefType <em>Annotation Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Ref Type</em>'.
	 * @see org.openmicroscopy.ome.AnnotationRefType
	 * @generated
	 */
	EClass getAnnotationRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.AnnotationRefType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.AnnotationRefType#getID()
	 * @see #getAnnotationRefType()
	 * @generated
	 */
	EAttribute getAnnotationRefType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ArcType <em>Arc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Type</em>'.
	 * @see org.openmicroscopy.ome.ArcType
	 * @generated
	 */
	EClass getArcType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ArcType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openmicroscopy.ome.ArcType#getType()
	 * @see #getArcType()
	 * @generated
	 */
	EAttribute getArcType_Type();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.BasicAnnotation <em>Basic Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Annotation</em>'.
	 * @see org.openmicroscopy.ome.BasicAnnotation
	 * @generated
	 */
	EClass getBasicAnnotation();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.BinaryFileType <em>Binary File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary File Type</em>'.
	 * @see org.openmicroscopy.ome.BinaryFileType
	 * @generated
	 */
	EClass getBinaryFileType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.BinaryFileType#getExternal <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External</em>'.
	 * @see org.openmicroscopy.ome.BinaryFileType#getExternal()
	 * @see #getBinaryFileType()
	 * @generated
	 */
	EReference getBinaryFileType_External();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.BinaryFileType#getBinData <em>Bin Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bin Data</em>'.
	 * @see org.openmicroscopy.ome.BinaryFileType#getBinData()
	 * @see #getBinaryFileType()
	 * @generated
	 */
	EReference getBinaryFileType_BinData();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.BinaryFileType#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.openmicroscopy.ome.BinaryFileType#getFileName()
	 * @see #getBinaryFileType()
	 * @generated
	 */
	EAttribute getBinaryFileType_FileName();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.BinaryFileType#getMIMEType <em>MIME Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MIME Type</em>'.
	 * @see org.openmicroscopy.ome.BinaryFileType#getMIMEType()
	 * @see #getBinaryFileType()
	 * @generated
	 */
	EAttribute getBinaryFileType_MIMEType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.BinaryFileType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.openmicroscopy.ome.BinaryFileType#getSize()
	 * @see #getBinaryFileType()
	 * @generated
	 */
	EAttribute getBinaryFileType_Size();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.BinaryOnlyType <em>Binary Only Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Only Type</em>'.
	 * @see org.openmicroscopy.ome.BinaryOnlyType
	 * @generated
	 */
	EClass getBinaryOnlyType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.BinaryOnlyType#getMetadataFile <em>Metadata File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata File</em>'.
	 * @see org.openmicroscopy.ome.BinaryOnlyType#getMetadataFile()
	 * @see #getBinaryOnlyType()
	 * @generated
	 */
	EAttribute getBinaryOnlyType_MetadataFile();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.BinaryOnlyType#getUUID <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UUID</em>'.
	 * @see org.openmicroscopy.ome.BinaryOnlyType#getUUID()
	 * @see #getBinaryOnlyType()
	 * @generated
	 */
	EAttribute getBinaryOnlyType_UUID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.BinDataType <em>Bin Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bin Data Type</em>'.
	 * @see org.openmicroscopy.ome.BinDataType
	 * @generated
	 */
	EClass getBinDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.BinDataType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openmicroscopy.ome.BinDataType#getValue()
	 * @see #getBinDataType()
	 * @generated
	 */
	EAttribute getBinDataType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.BinDataType#isBigEndian <em>Big Endian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Big Endian</em>'.
	 * @see org.openmicroscopy.ome.BinDataType#isBigEndian()
	 * @see #getBinDataType()
	 * @generated
	 */
	EAttribute getBinDataType_BigEndian();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.BinDataType#getCompression <em>Compression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compression</em>'.
	 * @see org.openmicroscopy.ome.BinDataType#getCompression()
	 * @see #getBinDataType()
	 * @generated
	 */
	EAttribute getBinDataType_Compression();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.BinDataType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.openmicroscopy.ome.BinDataType#getLength()
	 * @see #getBinDataType()
	 * @generated
	 */
	EAttribute getBinDataType_Length();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.BooleanAnnotationType <em>Boolean Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Annotation Type</em>'.
	 * @see org.openmicroscopy.ome.BooleanAnnotationType
	 * @generated
	 */
	EClass getBooleanAnnotationType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.BooleanAnnotationType#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openmicroscopy.ome.BooleanAnnotationType#isValue()
	 * @see #getBooleanAnnotationType()
	 * @generated
	 */
	EAttribute getBooleanAnnotationType_Value();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ChannelRefType <em>Channel Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Ref Type</em>'.
	 * @see org.openmicroscopy.ome.ChannelRefType
	 * @generated
	 */
	EClass getChannelRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ChannelRefType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.ChannelRefType#getID()
	 * @see #getChannelRefType()
	 * @generated
	 */
	EAttribute getChannelRefType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ChannelType <em>Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Type</em>'.
	 * @see org.openmicroscopy.ome.ChannelType
	 * @generated
	 */
	EClass getChannelType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.ChannelType#getLightSourceSettings <em>Light Source Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Light Source Settings</em>'.
	 * @see org.openmicroscopy.ome.ChannelType#getLightSourceSettings()
	 * @see #getChannelType()
	 * @generated
	 */
	EReference getChannelType_LightSourceSettings();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.ChannelType#getDetectorSettings <em>Detector Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Detector Settings</em>'.
	 * @see org.openmicroscopy.ome.ChannelType#getDetectorSettings()
	 * @see #getChannelType()
	 * @generated
	 */
	EReference getChannelType_DetectorSettings();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.ChannelType#getFilterSetRef <em>Filter Set Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Set Ref</em>'.
	 * @see org.openmicroscopy.ome.ChannelType#getFilterSetRef()
	 * @see #getChannelType()
	 * @generated
	 */
	EReference getChannelType_FilterSetRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.ChannelType#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.ChannelType#getAnnotationRef()
	 * @see #getChannelType()
	 * @generated
	 */
	EReference getChannelType_AnnotationRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.ChannelType#getLightPath <em>Light Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Light Path</em>'.
	 * @see org.openmicroscopy.ome.ChannelType#getLightPath()
	 * @see #getChannelType()
	 * @generated
	 */
	EReference getChannelType_LightPath();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ChannelType#getAcquisitionMode <em>Acquisition Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acquisition Mode</em>'.
	 * @see org.openmicroscopy.ome.ChannelType#getAcquisitionMode()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_AcquisitionMode();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ChannelType#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.openmicroscopy.ome.ChannelType#getColor()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ChannelType#getContrastMethod <em>Contrast Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contrast Method</em>'.
	 * @see org.openmicroscopy.ome.ChannelType#getContrastMethod()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_ContrastMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ChannelType#getEmissionWavelength <em>Emission Wavelength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emission Wavelength</em>'.
	 * @see org.openmicroscopy.ome.ChannelType#getEmissionWavelength()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_EmissionWavelength();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ChannelType#getEmissionWavelengthUnit <em>Emission Wavelength Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emission Wavelength Unit</em>'.
	 * @see org.openmicroscopy.ome.ChannelType#getEmissionWavelengthUnit()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_EmissionWavelengthUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ChannelType#getExcitationWavelength <em>Excitation Wavelength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Excitation Wavelength</em>'.
	 * @see org.openmicroscopy.ome.ChannelType#getExcitationWavelength()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_ExcitationWavelength();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ChannelType#getExcitationWavelengthUnit <em>Excitation Wavelength Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Excitation Wavelength Unit</em>'.
	 * @see org.openmicroscopy.ome.ChannelType#getExcitationWavelengthUnit()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_ExcitationWavelengthUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ChannelType#getFluor <em>Fluor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fluor</em>'.
	 * @see org.openmicroscopy.ome.ChannelType#getFluor()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_Fluor();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ChannelType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.ChannelType#getID()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ChannelType#getIlluminationType <em>Illumination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Illumination Type</em>'.
	 * @see org.openmicroscopy.ome.ChannelType#getIlluminationType()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_IlluminationType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ChannelType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openmicroscopy.ome.ChannelType#getName()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ChannelType#getNDFilter <em>ND Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ND Filter</em>'.
	 * @see org.openmicroscopy.ome.ChannelType#getNDFilter()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_NDFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ChannelType#getPinholeSize <em>Pinhole Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pinhole Size</em>'.
	 * @see org.openmicroscopy.ome.ChannelType#getPinholeSize()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_PinholeSize();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ChannelType#getPinholeSizeUnit <em>Pinhole Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pinhole Size Unit</em>'.
	 * @see org.openmicroscopy.ome.ChannelType#getPinholeSizeUnit()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_PinholeSizeUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ChannelType#getPockelCellSetting <em>Pockel Cell Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pockel Cell Setting</em>'.
	 * @see org.openmicroscopy.ome.ChannelType#getPockelCellSetting()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_PockelCellSetting();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ChannelType#getSamplesPerPixel <em>Samples Per Pixel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Samples Per Pixel</em>'.
	 * @see org.openmicroscopy.ome.ChannelType#getSamplesPerPixel()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_SamplesPerPixel();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.CommentAnnotationType <em>Comment Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment Annotation Type</em>'.
	 * @see org.openmicroscopy.ome.CommentAnnotationType
	 * @generated
	 */
	EClass getCommentAnnotationType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.CommentAnnotationType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openmicroscopy.ome.CommentAnnotationType#getValue()
	 * @see #getCommentAnnotationType()
	 * @generated
	 */
	EAttribute getCommentAnnotationType_Value();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.DatasetRefType <em>Dataset Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Ref Type</em>'.
	 * @see org.openmicroscopy.ome.DatasetRefType
	 * @generated
	 */
	EClass getDatasetRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DatasetRefType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.DatasetRefType#getID()
	 * @see #getDatasetRefType()
	 * @generated
	 */
	EAttribute getDatasetRefType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.DatasetType <em>Dataset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Type</em>'.
	 * @see org.openmicroscopy.ome.DatasetType
	 * @generated
	 */
	EClass getDatasetType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DatasetType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openmicroscopy.ome.DatasetType#getDescription()
	 * @see #getDatasetType()
	 * @generated
	 */
	EAttribute getDatasetType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DatasetType#getExperimenterRef <em>Experimenter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Experimenter Ref</em>'.
	 * @see org.openmicroscopy.ome.DatasetType#getExperimenterRef()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_ExperimenterRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DatasetType#getExperimenterGroupRef <em>Experimenter Group Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Experimenter Group Ref</em>'.
	 * @see org.openmicroscopy.ome.DatasetType#getExperimenterGroupRef()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_ExperimenterGroupRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.DatasetType#getImageRef <em>Image Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Image Ref</em>'.
	 * @see org.openmicroscopy.ome.DatasetType#getImageRef()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_ImageRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.DatasetType#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.DatasetType#getAnnotationRef()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_AnnotationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DatasetType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.DatasetType#getID()
	 * @see #getDatasetType()
	 * @generated
	 */
	EAttribute getDatasetType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DatasetType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openmicroscopy.ome.DatasetType#getName()
	 * @see #getDatasetType()
	 * @generated
	 */
	EAttribute getDatasetType_Name();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.DetectorSettingsType <em>Detector Settings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detector Settings Type</em>'.
	 * @see org.openmicroscopy.ome.DetectorSettingsType
	 * @generated
	 */
	EClass getDetectorSettingsType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DetectorSettingsType#getBinning <em>Binning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binning</em>'.
	 * @see org.openmicroscopy.ome.DetectorSettingsType#getBinning()
	 * @see #getDetectorSettingsType()
	 * @generated
	 */
	EAttribute getDetectorSettingsType_Binning();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DetectorSettingsType#getGain <em>Gain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gain</em>'.
	 * @see org.openmicroscopy.ome.DetectorSettingsType#getGain()
	 * @see #getDetectorSettingsType()
	 * @generated
	 */
	EAttribute getDetectorSettingsType_Gain();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DetectorSettingsType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.DetectorSettingsType#getID()
	 * @see #getDetectorSettingsType()
	 * @generated
	 */
	EAttribute getDetectorSettingsType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DetectorSettingsType#getIntegration <em>Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integration</em>'.
	 * @see org.openmicroscopy.ome.DetectorSettingsType#getIntegration()
	 * @see #getDetectorSettingsType()
	 * @generated
	 */
	EAttribute getDetectorSettingsType_Integration();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DetectorSettingsType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.openmicroscopy.ome.DetectorSettingsType#getOffset()
	 * @see #getDetectorSettingsType()
	 * @generated
	 */
	EAttribute getDetectorSettingsType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DetectorSettingsType#getReadOutRate <em>Read Out Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Out Rate</em>'.
	 * @see org.openmicroscopy.ome.DetectorSettingsType#getReadOutRate()
	 * @see #getDetectorSettingsType()
	 * @generated
	 */
	EAttribute getDetectorSettingsType_ReadOutRate();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DetectorSettingsType#getReadOutRateUnit <em>Read Out Rate Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Out Rate Unit</em>'.
	 * @see org.openmicroscopy.ome.DetectorSettingsType#getReadOutRateUnit()
	 * @see #getDetectorSettingsType()
	 * @generated
	 */
	EAttribute getDetectorSettingsType_ReadOutRateUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DetectorSettingsType#getVoltage <em>Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage</em>'.
	 * @see org.openmicroscopy.ome.DetectorSettingsType#getVoltage()
	 * @see #getDetectorSettingsType()
	 * @generated
	 */
	EAttribute getDetectorSettingsType_Voltage();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DetectorSettingsType#getVoltageUnit <em>Voltage Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Unit</em>'.
	 * @see org.openmicroscopy.ome.DetectorSettingsType#getVoltageUnit()
	 * @see #getDetectorSettingsType()
	 * @generated
	 */
	EAttribute getDetectorSettingsType_VoltageUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DetectorSettingsType#getZoom <em>Zoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zoom</em>'.
	 * @see org.openmicroscopy.ome.DetectorSettingsType#getZoom()
	 * @see #getDetectorSettingsType()
	 * @generated
	 */
	EAttribute getDetectorSettingsType_Zoom();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.DetectorType <em>Detector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detector Type</em>'.
	 * @see org.openmicroscopy.ome.DetectorType
	 * @generated
	 */
	EClass getDetectorType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.DetectorType#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.DetectorType#getAnnotationRef()
	 * @see #getDetectorType()
	 * @generated
	 */
	EReference getDetectorType_AnnotationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DetectorType#getAmplificationGain <em>Amplification Gain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amplification Gain</em>'.
	 * @see org.openmicroscopy.ome.DetectorType#getAmplificationGain()
	 * @see #getDetectorType()
	 * @generated
	 */
	EAttribute getDetectorType_AmplificationGain();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DetectorType#getGain <em>Gain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gain</em>'.
	 * @see org.openmicroscopy.ome.DetectorType#getGain()
	 * @see #getDetectorType()
	 * @generated
	 */
	EAttribute getDetectorType_Gain();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DetectorType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.DetectorType#getID()
	 * @see #getDetectorType()
	 * @generated
	 */
	EAttribute getDetectorType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DetectorType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.openmicroscopy.ome.DetectorType#getOffset()
	 * @see #getDetectorType()
	 * @generated
	 */
	EAttribute getDetectorType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DetectorType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openmicroscopy.ome.DetectorType#getType()
	 * @see #getDetectorType()
	 * @generated
	 */
	EAttribute getDetectorType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DetectorType#getVoltage <em>Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage</em>'.
	 * @see org.openmicroscopy.ome.DetectorType#getVoltage()
	 * @see #getDetectorType()
	 * @generated
	 */
	EAttribute getDetectorType_Voltage();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DetectorType#getVoltageUnit <em>Voltage Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Unit</em>'.
	 * @see org.openmicroscopy.ome.DetectorType#getVoltageUnit()
	 * @see #getDetectorType()
	 * @generated
	 */
	EAttribute getDetectorType_VoltageUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DetectorType#getZoom <em>Zoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zoom</em>'.
	 * @see org.openmicroscopy.ome.DetectorType#getZoom()
	 * @see #getDetectorType()
	 * @generated
	 */
	EAttribute getDetectorType_Zoom();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.DichroicRefType <em>Dichroic Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dichroic Ref Type</em>'.
	 * @see org.openmicroscopy.ome.DichroicRefType
	 * @generated
	 */
	EClass getDichroicRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DichroicRefType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.DichroicRefType#getID()
	 * @see #getDichroicRefType()
	 * @generated
	 */
	EAttribute getDichroicRefType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.DichroicType <em>Dichroic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dichroic Type</em>'.
	 * @see org.openmicroscopy.ome.DichroicType
	 * @generated
	 */
	EClass getDichroicType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.DichroicType#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.DichroicType#getAnnotationRef()
	 * @see #getDichroicType()
	 * @generated
	 */
	EReference getDichroicType_AnnotationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DichroicType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.DichroicType#getID()
	 * @see #getDichroicType()
	 * @generated
	 */
	EAttribute getDichroicType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.openmicroscopy.ome.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.openmicroscopy.ome.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.openmicroscopy.ome.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getAnnotationRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AnnotationRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arc</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getArc()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Arc();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getLightSourceGroup <em>Light Source Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Light Source Group</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getLightSourceGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LightSourceGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getBinaryFile <em>Binary File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binary File</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getBinaryFile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BinaryFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getBinData <em>Bin Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bin Data</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getBinData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BinData();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getBooleanAnnotation <em>Boolean Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Annotation</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getBooleanAnnotation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BooleanAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Channel</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getChannel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Channel();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getChannelRef <em>Channel Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Channel Ref</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getChannelRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChannelRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getCommentAnnotation <em>Comment Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comment Annotation</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getCommentAnnotation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CommentAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dataset</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getDataset()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dataset();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getDatasetRef <em>Dataset Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dataset Ref</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getDatasetRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DatasetRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getDetector <em>Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Detector</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getDetector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Detector();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getDetectorSettings <em>Detector Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Detector Settings</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getDetectorSettings()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DetectorSettings();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getDichroic <em>Dichroic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dichroic</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getDichroic()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dichroic();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getDichroicRef <em>Dichroic Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dichroic Ref</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getDichroicRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DichroicRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getDoubleAnnotation <em>Double Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Double Annotation</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getDoubleAnnotation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DoubleAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ellipse</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getEllipse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Ellipse();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getShapeGroup <em>Shape Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shape Group</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getShapeGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ShapeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getExperiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Experiment</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getExperiment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Experiment();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getExperimenter <em>Experimenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Experimenter</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getExperimenter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Experimenter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getExperimenterGroup <em>Experimenter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Experimenter Group</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getExperimenterGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExperimenterGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getExperimenterGroupRef <em>Experimenter Group Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Experimenter Group Ref</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getExperimenterGroupRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExperimenterGroupRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getExperimenterRef <em>Experimenter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Experimenter Ref</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getExperimenterRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExperimenterRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getExperimentRef <em>Experiment Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Experiment Ref</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getExperimentRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExperimentRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getExternal <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getExternal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_External();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getFilament <em>Filament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filament</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getFilament()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Filament();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getFileAnnotation <em>File Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Annotation</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getFileAnnotation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FileAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Filter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getFilterSet <em>Filter Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Set</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getFilterSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FilterSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getFilterSetRef <em>Filter Set Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Set Ref</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getFilterSetRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FilterSetRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Folder</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getFolder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Folder();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getFolderRef <em>Folder Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Folder Ref</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getFolderRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FolderRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getGenericExcitationSource <em>Generic Excitation Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Excitation Source</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getGenericExcitationSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericExcitationSource();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getImage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Image();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getImageRef <em>Image Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Ref</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getImageRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ImageRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getImagingEnvironment <em>Imaging Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imaging Environment</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getImagingEnvironment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ImagingEnvironment();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getInstrument <em>Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instrument</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getInstrument()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Instrument();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getInstrumentRef <em>Instrument Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instrument Ref</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getInstrumentRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InstrumentRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getLabel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getLaser <em>Laser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Laser</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getLaser()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Laser();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getLeader <em>Leader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Leader</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getLeader()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Leader();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getLightEmittingDiode <em>Light Emitting Diode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Light Emitting Diode</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getLightEmittingDiode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LightEmittingDiode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getLightPath <em>Light Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Light Path</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getLightPath()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LightPath();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getLightSourceSettings <em>Light Source Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Light Source Settings</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getLightSourceSettings()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LightSourceSettings();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getLine()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Line();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getListAnnotation <em>List Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Annotation</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getListAnnotation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getLongAnnotation <em>Long Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Long Annotation</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getLongAnnotation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LongAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getMapAnnotation <em>Map Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Annotation</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getMapAnnotation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MapAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mask</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getMask()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Mask();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getMetadataOnly <em>Metadata Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata Only</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getMetadataOnly()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MetadataOnly();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getMicrobeamManipulation <em>Microbeam Manipulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Microbeam Manipulation</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getMicrobeamManipulation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MicrobeamManipulation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getMicrobeamManipulationRef <em>Microbeam Manipulation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Microbeam Manipulation Ref</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getMicrobeamManipulationRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MicrobeamManipulationRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getMicroscope <em>Microscope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Microscope</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getMicroscope()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Microscope();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Objective</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getObjective()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Objective();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getObjectiveSettings <em>Objective Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Objective Settings</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getObjectiveSettings()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ObjectiveSettings();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getOME <em>OME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>OME</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getOME()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OME();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getPixels <em>Pixels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pixels</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getPixels()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Pixels();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getPlane <em>Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plane</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getPlane()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Plane();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getPlate <em>Plate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plate</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getPlate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Plate();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getPlateAcquisition <em>Plate Acquisition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plate Acquisition</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getPlateAcquisition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PlateAcquisition();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getPoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Point();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Polygon</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getPolygon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Polygon();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Polyline</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getPolyline()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Polyline();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Project</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getProject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Project();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getProjectRef <em>Project Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Project Ref</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getProjectRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ProjectRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getPump <em>Pump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pump</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getPump()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Pump();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getReagent <em>Reagent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reagent</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getReagent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Reagent();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getReagentRef <em>Reagent Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reagent Ref</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getReagentRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReagentRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rectangle</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getRectangle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Rectangle();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getRights <em>Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rights</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getRights()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Rights();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getROI <em>ROI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ROI</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getROI()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ROI();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getROIRef <em>ROI Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ROI Ref</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getROIRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ROIRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getScreen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Screen</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getScreen()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Screen();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getStageLabel <em>Stage Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stage Label</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getStageLabel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StageLabel();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getStructuredAnnotations <em>Structured Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structured Annotations</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getStructuredAnnotations()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StructuredAnnotations();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getTagAnnotation <em>Tag Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tag Annotation</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getTagAnnotation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TagAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getTermAnnotation <em>Term Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term Annotation</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getTermAnnotation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TermAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getTiffData <em>Tiff Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tiff Data</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getTiffData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TiffData();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getTimestampAnnotation <em>Timestamp Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timestamp Annotation</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getTimestampAnnotation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TimestampAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getTransmittanceRange <em>Transmittance Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transmittance Range</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getTransmittanceRange()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransmittanceRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getWell <em>Well</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Well</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getWell()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Well();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getWellSample <em>Well Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Well Sample</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getWellSample()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WellSample();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getWellSampleRef <em>Well Sample Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Well Sample Ref</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getWellSampleRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WellSampleRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.DocumentRoot#getXMLAnnotation <em>XML Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XML Annotation</em>'.
	 * @see org.openmicroscopy.ome.DocumentRoot#getXMLAnnotation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLAnnotation();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.DoubleAnnotationType <em>Double Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Annotation Type</em>'.
	 * @see org.openmicroscopy.ome.DoubleAnnotationType
	 * @generated
	 */
	EClass getDoubleAnnotationType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.DoubleAnnotationType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openmicroscopy.ome.DoubleAnnotationType#getValue()
	 * @see #getDoubleAnnotationType()
	 * @generated
	 */
	EAttribute getDoubleAnnotationType_Value();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.EllipseType <em>Ellipse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ellipse Type</em>'.
	 * @see org.openmicroscopy.ome.EllipseType
	 * @generated
	 */
	EClass getEllipseType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.EllipseType#getRadiusX <em>Radius X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius X</em>'.
	 * @see org.openmicroscopy.ome.EllipseType#getRadiusX()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_RadiusX();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.EllipseType#getRadiusY <em>Radius Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius Y</em>'.
	 * @see org.openmicroscopy.ome.EllipseType#getRadiusY()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_RadiusY();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.EllipseType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.openmicroscopy.ome.EllipseType#getX()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.EllipseType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.openmicroscopy.ome.EllipseType#getY()
	 * @see #getEllipseType()
	 * @generated
	 */
	EAttribute getEllipseType_Y();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ExperimenterGroupRefType <em>Experimenter Group Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experimenter Group Ref Type</em>'.
	 * @see org.openmicroscopy.ome.ExperimenterGroupRefType
	 * @generated
	 */
	EClass getExperimenterGroupRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ExperimenterGroupRefType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.ExperimenterGroupRefType#getID()
	 * @see #getExperimenterGroupRefType()
	 * @generated
	 */
	EAttribute getExperimenterGroupRefType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ExperimenterGroupType <em>Experimenter Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experimenter Group Type</em>'.
	 * @see org.openmicroscopy.ome.ExperimenterGroupType
	 * @generated
	 */
	EClass getExperimenterGroupType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ExperimenterGroupType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openmicroscopy.ome.ExperimenterGroupType#getDescription()
	 * @see #getExperimenterGroupType()
	 * @generated
	 */
	EAttribute getExperimenterGroupType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.ExperimenterGroupType#getExperimenterRef <em>Experimenter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Experimenter Ref</em>'.
	 * @see org.openmicroscopy.ome.ExperimenterGroupType#getExperimenterRef()
	 * @see #getExperimenterGroupType()
	 * @generated
	 */
	EReference getExperimenterGroupType_ExperimenterRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.ExperimenterGroupType#getLeader <em>Leader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Leader</em>'.
	 * @see org.openmicroscopy.ome.ExperimenterGroupType#getLeader()
	 * @see #getExperimenterGroupType()
	 * @generated
	 */
	EReference getExperimenterGroupType_Leader();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.ExperimenterGroupType#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.ExperimenterGroupType#getAnnotationRef()
	 * @see #getExperimenterGroupType()
	 * @generated
	 */
	EReference getExperimenterGroupType_AnnotationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ExperimenterGroupType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.ExperimenterGroupType#getID()
	 * @see #getExperimenterGroupType()
	 * @generated
	 */
	EAttribute getExperimenterGroupType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ExperimenterGroupType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openmicroscopy.ome.ExperimenterGroupType#getName()
	 * @see #getExperimenterGroupType()
	 * @generated
	 */
	EAttribute getExperimenterGroupType_Name();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ExperimenterRefType <em>Experimenter Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experimenter Ref Type</em>'.
	 * @see org.openmicroscopy.ome.ExperimenterRefType
	 * @generated
	 */
	EClass getExperimenterRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ExperimenterRefType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.ExperimenterRefType#getID()
	 * @see #getExperimenterRefType()
	 * @generated
	 */
	EAttribute getExperimenterRefType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ExperimenterType <em>Experimenter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experimenter Type</em>'.
	 * @see org.openmicroscopy.ome.ExperimenterType
	 * @generated
	 */
	EClass getExperimenterType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.ExperimenterType#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.ExperimenterType#getAnnotationRef()
	 * @see #getExperimenterType()
	 * @generated
	 */
	EReference getExperimenterType_AnnotationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ExperimenterType#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.openmicroscopy.ome.ExperimenterType#getEmail()
	 * @see #getExperimenterType()
	 * @generated
	 */
	EAttribute getExperimenterType_Email();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ExperimenterType#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.openmicroscopy.ome.ExperimenterType#getFirstName()
	 * @see #getExperimenterType()
	 * @generated
	 */
	EAttribute getExperimenterType_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ExperimenterType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.ExperimenterType#getID()
	 * @see #getExperimenterType()
	 * @generated
	 */
	EAttribute getExperimenterType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ExperimenterType#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institution</em>'.
	 * @see org.openmicroscopy.ome.ExperimenterType#getInstitution()
	 * @see #getExperimenterType()
	 * @generated
	 */
	EAttribute getExperimenterType_Institution();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ExperimenterType#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.openmicroscopy.ome.ExperimenterType#getLastName()
	 * @see #getExperimenterType()
	 * @generated
	 */
	EAttribute getExperimenterType_LastName();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ExperimenterType#getMiddleName <em>Middle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Middle Name</em>'.
	 * @see org.openmicroscopy.ome.ExperimenterType#getMiddleName()
	 * @see #getExperimenterType()
	 * @generated
	 */
	EAttribute getExperimenterType_MiddleName();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ExperimenterType#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see org.openmicroscopy.ome.ExperimenterType#getUserName()
	 * @see #getExperimenterType()
	 * @generated
	 */
	EAttribute getExperimenterType_UserName();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ExperimentRefType <em>Experiment Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Ref Type</em>'.
	 * @see org.openmicroscopy.ome.ExperimentRefType
	 * @generated
	 */
	EClass getExperimentRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ExperimentRefType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.ExperimentRefType#getID()
	 * @see #getExperimentRefType()
	 * @generated
	 */
	EAttribute getExperimentRefType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ExperimentType <em>Experiment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Type</em>'.
	 * @see org.openmicroscopy.ome.ExperimentType
	 * @generated
	 */
	EClass getExperimentType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ExperimentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openmicroscopy.ome.ExperimentType#getDescription()
	 * @see #getExperimentType()
	 * @generated
	 */
	EAttribute getExperimentType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.ExperimentType#getExperimenterRef <em>Experimenter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Experimenter Ref</em>'.
	 * @see org.openmicroscopy.ome.ExperimentType#getExperimenterRef()
	 * @see #getExperimentType()
	 * @generated
	 */
	EReference getExperimentType_ExperimenterRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.ExperimentType#getMicrobeamManipulation <em>Microbeam Manipulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Microbeam Manipulation</em>'.
	 * @see org.openmicroscopy.ome.ExperimentType#getMicrobeamManipulation()
	 * @see #getExperimentType()
	 * @generated
	 */
	EReference getExperimentType_MicrobeamManipulation();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ExperimentType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.ExperimentType#getID()
	 * @see #getExperimentType()
	 * @generated
	 */
	EAttribute getExperimentType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ExperimentType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openmicroscopy.ome.ExperimentType#getType()
	 * @see #getExperimentType()
	 * @generated
	 */
	EAttribute getExperimentType_Type();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ExternalType <em>External Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Type</em>'.
	 * @see org.openmicroscopy.ome.ExternalType
	 * @generated
	 */
	EClass getExternalType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ExternalType#getCompression <em>Compression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compression</em>'.
	 * @see org.openmicroscopy.ome.ExternalType#getCompression()
	 * @see #getExternalType()
	 * @generated
	 */
	EAttribute getExternalType_Compression();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ExternalType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.openmicroscopy.ome.ExternalType#getHref()
	 * @see #getExternalType()
	 * @generated
	 */
	EAttribute getExternalType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ExternalType#getSHA1 <em>SHA1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SHA1</em>'.
	 * @see org.openmicroscopy.ome.ExternalType#getSHA1()
	 * @see #getExternalType()
	 * @generated
	 */
	EAttribute getExternalType_SHA1();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.FilamentType <em>Filament Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filament Type</em>'.
	 * @see org.openmicroscopy.ome.FilamentType
	 * @generated
	 */
	EClass getFilamentType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.FilamentType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openmicroscopy.ome.FilamentType#getType()
	 * @see #getFilamentType()
	 * @generated
	 */
	EAttribute getFilamentType_Type();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.FileAnnotationType <em>File Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Annotation Type</em>'.
	 * @see org.openmicroscopy.ome.FileAnnotationType
	 * @generated
	 */
	EClass getFileAnnotationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.FileAnnotationType#getBinaryFile <em>Binary File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binary File</em>'.
	 * @see org.openmicroscopy.ome.FileAnnotationType#getBinaryFile()
	 * @see #getFileAnnotationType()
	 * @generated
	 */
	EReference getFileAnnotationType_BinaryFile();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.FilterRef <em>Filter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Ref</em>'.
	 * @see org.openmicroscopy.ome.FilterRef
	 * @generated
	 */
	EClass getFilterRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.FilterRef#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.FilterRef#getID()
	 * @see #getFilterRef()
	 * @generated
	 */
	EAttribute getFilterRef_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.FilterSetRefType <em>Filter Set Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Set Ref Type</em>'.
	 * @see org.openmicroscopy.ome.FilterSetRefType
	 * @generated
	 */
	EClass getFilterSetRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.FilterSetRefType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.FilterSetRefType#getID()
	 * @see #getFilterSetRefType()
	 * @generated
	 */
	EAttribute getFilterSetRefType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.FilterSetType <em>Filter Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Set Type</em>'.
	 * @see org.openmicroscopy.ome.FilterSetType
	 * @generated
	 */
	EClass getFilterSetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.FilterSetType#getExcitationFilterRef <em>Excitation Filter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Excitation Filter Ref</em>'.
	 * @see org.openmicroscopy.ome.FilterSetType#getExcitationFilterRef()
	 * @see #getFilterSetType()
	 * @generated
	 */
	EReference getFilterSetType_ExcitationFilterRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.FilterSetType#getDichroicRef <em>Dichroic Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dichroic Ref</em>'.
	 * @see org.openmicroscopy.ome.FilterSetType#getDichroicRef()
	 * @see #getFilterSetType()
	 * @generated
	 */
	EReference getFilterSetType_DichroicRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.FilterSetType#getEmissionFilterRef <em>Emission Filter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emission Filter Ref</em>'.
	 * @see org.openmicroscopy.ome.FilterSetType#getEmissionFilterRef()
	 * @see #getFilterSetType()
	 * @generated
	 */
	EReference getFilterSetType_EmissionFilterRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.FilterSetType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.FilterSetType#getID()
	 * @see #getFilterSetType()
	 * @generated
	 */
	EAttribute getFilterSetType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Type</em>'.
	 * @see org.openmicroscopy.ome.FilterType
	 * @generated
	 */
	EClass getFilterType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.FilterType#getTransmittanceRange <em>Transmittance Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transmittance Range</em>'.
	 * @see org.openmicroscopy.ome.FilterType#getTransmittanceRange()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_TransmittanceRange();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.FilterType#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.FilterType#getAnnotationRef()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_AnnotationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.FilterType#getFilterWheel <em>Filter Wheel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Wheel</em>'.
	 * @see org.openmicroscopy.ome.FilterType#getFilterWheel()
	 * @see #getFilterType()
	 * @generated
	 */
	EAttribute getFilterType_FilterWheel();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.FilterType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.FilterType#getID()
	 * @see #getFilterType()
	 * @generated
	 */
	EAttribute getFilterType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.FilterType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openmicroscopy.ome.FilterType#getType()
	 * @see #getFilterType()
	 * @generated
	 */
	EAttribute getFilterType_Type();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.FolderRefType <em>Folder Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder Ref Type</em>'.
	 * @see org.openmicroscopy.ome.FolderRefType
	 * @generated
	 */
	EClass getFolderRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.FolderRefType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.FolderRefType#getID()
	 * @see #getFolderRefType()
	 * @generated
	 */
	EAttribute getFolderRefType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.FolderType <em>Folder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder Type</em>'.
	 * @see org.openmicroscopy.ome.FolderType
	 * @generated
	 */
	EClass getFolderType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.FolderType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openmicroscopy.ome.FolderType#getDescription()
	 * @see #getFolderType()
	 * @generated
	 */
	EAttribute getFolderType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.FolderType#getFolderRef <em>Folder Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folder Ref</em>'.
	 * @see org.openmicroscopy.ome.FolderType#getFolderRef()
	 * @see #getFolderType()
	 * @generated
	 */
	EReference getFolderType_FolderRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.FolderType#getImageRef <em>Image Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Image Ref</em>'.
	 * @see org.openmicroscopy.ome.FolderType#getImageRef()
	 * @see #getFolderType()
	 * @generated
	 */
	EReference getFolderType_ImageRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.FolderType#getROIRef <em>ROI Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ROI Ref</em>'.
	 * @see org.openmicroscopy.ome.FolderType#getROIRef()
	 * @see #getFolderType()
	 * @generated
	 */
	EReference getFolderType_ROIRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.FolderType#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.FolderType#getAnnotationRef()
	 * @see #getFolderType()
	 * @generated
	 */
	EReference getFolderType_AnnotationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.FolderType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.FolderType#getID()
	 * @see #getFolderType()
	 * @generated
	 */
	EAttribute getFolderType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.FolderType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openmicroscopy.ome.FolderType#getName()
	 * @see #getFolderType()
	 * @generated
	 */
	EAttribute getFolderType_Name();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.GenericExcitationSourceType <em>Generic Excitation Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Excitation Source Type</em>'.
	 * @see org.openmicroscopy.ome.GenericExcitationSourceType
	 * @generated
	 */
	EClass getGenericExcitationSourceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.GenericExcitationSourceType#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map</em>'.
	 * @see org.openmicroscopy.ome.GenericExcitationSourceType#getMap()
	 * @see #getGenericExcitationSourceType()
	 * @generated
	 */
	EReference getGenericExcitationSourceType_Map();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ImageRefType <em>Image Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Ref Type</em>'.
	 * @see org.openmicroscopy.ome.ImageRefType
	 * @generated
	 */
	EClass getImageRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ImageRefType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.ImageRefType#getID()
	 * @see #getImageRefType()
	 * @generated
	 */
	EAttribute getImageRefType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ImageType <em>Image Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Type</em>'.
	 * @see org.openmicroscopy.ome.ImageType
	 * @generated
	 */
	EClass getImageType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ImageType#getAcquisitionDate <em>Acquisition Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acquisition Date</em>'.
	 * @see org.openmicroscopy.ome.ImageType#getAcquisitionDate()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_AcquisitionDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.ImageType#getExperimenterRef <em>Experimenter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Experimenter Ref</em>'.
	 * @see org.openmicroscopy.ome.ImageType#getExperimenterRef()
	 * @see #getImageType()
	 * @generated
	 */
	EReference getImageType_ExperimenterRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ImageType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openmicroscopy.ome.ImageType#getDescription()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.ImageType#getExperimentRef <em>Experiment Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Experiment Ref</em>'.
	 * @see org.openmicroscopy.ome.ImageType#getExperimentRef()
	 * @see #getImageType()
	 * @generated
	 */
	EReference getImageType_ExperimentRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.ImageType#getExperimenterGroupRef <em>Experimenter Group Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Experimenter Group Ref</em>'.
	 * @see org.openmicroscopy.ome.ImageType#getExperimenterGroupRef()
	 * @see #getImageType()
	 * @generated
	 */
	EReference getImageType_ExperimenterGroupRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.ImageType#getInstrumentRef <em>Instrument Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instrument Ref</em>'.
	 * @see org.openmicroscopy.ome.ImageType#getInstrumentRef()
	 * @see #getImageType()
	 * @generated
	 */
	EReference getImageType_InstrumentRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.ImageType#getObjectiveSettings <em>Objective Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Objective Settings</em>'.
	 * @see org.openmicroscopy.ome.ImageType#getObjectiveSettings()
	 * @see #getImageType()
	 * @generated
	 */
	EReference getImageType_ObjectiveSettings();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.ImageType#getImagingEnvironment <em>Imaging Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imaging Environment</em>'.
	 * @see org.openmicroscopy.ome.ImageType#getImagingEnvironment()
	 * @see #getImageType()
	 * @generated
	 */
	EReference getImageType_ImagingEnvironment();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.ImageType#getStageLabel <em>Stage Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stage Label</em>'.
	 * @see org.openmicroscopy.ome.ImageType#getStageLabel()
	 * @see #getImageType()
	 * @generated
	 */
	EReference getImageType_StageLabel();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.ImageType#getPixels <em>Pixels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pixels</em>'.
	 * @see org.openmicroscopy.ome.ImageType#getPixels()
	 * @see #getImageType()
	 * @generated
	 */
	EReference getImageType_Pixels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.ImageType#getROIRef <em>ROI Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ROI Ref</em>'.
	 * @see org.openmicroscopy.ome.ImageType#getROIRef()
	 * @see #getImageType()
	 * @generated
	 */
	EReference getImageType_ROIRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.ImageType#getMicrobeamManipulationRef <em>Microbeam Manipulation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Microbeam Manipulation Ref</em>'.
	 * @see org.openmicroscopy.ome.ImageType#getMicrobeamManipulationRef()
	 * @see #getImageType()
	 * @generated
	 */
	EReference getImageType_MicrobeamManipulationRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.ImageType#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.ImageType#getAnnotationRef()
	 * @see #getImageType()
	 * @generated
	 */
	EReference getImageType_AnnotationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ImageType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.ImageType#getID()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ImageType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openmicroscopy.ome.ImageType#getName()
	 * @see #getImageType()
	 * @generated
	 */
	EAttribute getImageType_Name();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ImagingEnvironmentType <em>Imaging Environment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imaging Environment Type</em>'.
	 * @see org.openmicroscopy.ome.ImagingEnvironmentType
	 * @generated
	 */
	EClass getImagingEnvironmentType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map</em>'.
	 * @see org.openmicroscopy.ome.ImagingEnvironmentType#getMap()
	 * @see #getImagingEnvironmentType()
	 * @generated
	 */
	EReference getImagingEnvironmentType_Map();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getAirPressure <em>Air Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Air Pressure</em>'.
	 * @see org.openmicroscopy.ome.ImagingEnvironmentType#getAirPressure()
	 * @see #getImagingEnvironmentType()
	 * @generated
	 */
	EAttribute getImagingEnvironmentType_AirPressure();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getAirPressureUnit <em>Air Pressure Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Air Pressure Unit</em>'.
	 * @see org.openmicroscopy.ome.ImagingEnvironmentType#getAirPressureUnit()
	 * @see #getImagingEnvironmentType()
	 * @generated
	 */
	EAttribute getImagingEnvironmentType_AirPressureUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getCO2Percent <em>CO2 Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CO2 Percent</em>'.
	 * @see org.openmicroscopy.ome.ImagingEnvironmentType#getCO2Percent()
	 * @see #getImagingEnvironmentType()
	 * @generated
	 */
	EAttribute getImagingEnvironmentType_CO2Percent();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getHumidity <em>Humidity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Humidity</em>'.
	 * @see org.openmicroscopy.ome.ImagingEnvironmentType#getHumidity()
	 * @see #getImagingEnvironmentType()
	 * @generated
	 */
	EAttribute getImagingEnvironmentType_Humidity();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see org.openmicroscopy.ome.ImagingEnvironmentType#getTemperature()
	 * @see #getImagingEnvironmentType()
	 * @generated
	 */
	EAttribute getImagingEnvironmentType_Temperature();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ImagingEnvironmentType#getTemperatureUnit <em>Temperature Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature Unit</em>'.
	 * @see org.openmicroscopy.ome.ImagingEnvironmentType#getTemperatureUnit()
	 * @see #getImagingEnvironmentType()
	 * @generated
	 */
	EAttribute getImagingEnvironmentType_TemperatureUnit();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.InstrumentRefType <em>Instrument Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instrument Ref Type</em>'.
	 * @see org.openmicroscopy.ome.InstrumentRefType
	 * @generated
	 */
	EClass getInstrumentRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.InstrumentRefType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.InstrumentRefType#getID()
	 * @see #getInstrumentRefType()
	 * @generated
	 */
	EAttribute getInstrumentRefType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.InstrumentType <em>Instrument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instrument Type</em>'.
	 * @see org.openmicroscopy.ome.InstrumentType
	 * @generated
	 */
	EClass getInstrumentType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.InstrumentType#getMicroscope <em>Microscope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Microscope</em>'.
	 * @see org.openmicroscopy.ome.InstrumentType#getMicroscope()
	 * @see #getInstrumentType()
	 * @generated
	 */
	EReference getInstrumentType_Microscope();

	/**
	 * Returns the meta object for the attribute list '{@link org.openmicroscopy.ome.InstrumentType#getLightSourceGroupGroup <em>Light Source Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Light Source Group Group</em>'.
	 * @see org.openmicroscopy.ome.InstrumentType#getLightSourceGroupGroup()
	 * @see #getInstrumentType()
	 * @generated
	 */
	EAttribute getInstrumentType_LightSourceGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.InstrumentType#getLightSourceGroup <em>Light Source Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Light Source Group</em>'.
	 * @see org.openmicroscopy.ome.InstrumentType#getLightSourceGroup()
	 * @see #getInstrumentType()
	 * @generated
	 */
	EReference getInstrumentType_LightSourceGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.InstrumentType#getDetector <em>Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Detector</em>'.
	 * @see org.openmicroscopy.ome.InstrumentType#getDetector()
	 * @see #getInstrumentType()
	 * @generated
	 */
	EReference getInstrumentType_Detector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.InstrumentType#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objective</em>'.
	 * @see org.openmicroscopy.ome.InstrumentType#getObjective()
	 * @see #getInstrumentType()
	 * @generated
	 */
	EReference getInstrumentType_Objective();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.InstrumentType#getFilterSet <em>Filter Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter Set</em>'.
	 * @see org.openmicroscopy.ome.InstrumentType#getFilterSet()
	 * @see #getInstrumentType()
	 * @generated
	 */
	EReference getInstrumentType_FilterSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.InstrumentType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see org.openmicroscopy.ome.InstrumentType#getFilter()
	 * @see #getInstrumentType()
	 * @generated
	 */
	EReference getInstrumentType_Filter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.InstrumentType#getDichroic <em>Dichroic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dichroic</em>'.
	 * @see org.openmicroscopy.ome.InstrumentType#getDichroic()
	 * @see #getInstrumentType()
	 * @generated
	 */
	EReference getInstrumentType_Dichroic();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.InstrumentType#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.InstrumentType#getAnnotationRef()
	 * @see #getInstrumentType()
	 * @generated
	 */
	EReference getInstrumentType_AnnotationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.InstrumentType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.InstrumentType#getID()
	 * @see #getInstrumentType()
	 * @generated
	 */
	EAttribute getInstrumentType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Type</em>'.
	 * @see org.openmicroscopy.ome.LabelType
	 * @generated
	 */
	EClass getLabelType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LabelType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.openmicroscopy.ome.LabelType#getX()
	 * @see #getLabelType()
	 * @generated
	 */
	EAttribute getLabelType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LabelType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.openmicroscopy.ome.LabelType#getY()
	 * @see #getLabelType()
	 * @generated
	 */
	EAttribute getLabelType_Y();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.LaserType <em>Laser Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Laser Type</em>'.
	 * @see org.openmicroscopy.ome.LaserType
	 * @generated
	 */
	EClass getLaserType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.LaserType#getPump <em>Pump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pump</em>'.
	 * @see org.openmicroscopy.ome.LaserType#getPump()
	 * @see #getLaserType()
	 * @generated
	 */
	EReference getLaserType_Pump();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LaserType#getFrequencyMultiplication <em>Frequency Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency Multiplication</em>'.
	 * @see org.openmicroscopy.ome.LaserType#getFrequencyMultiplication()
	 * @see #getLaserType()
	 * @generated
	 */
	EAttribute getLaserType_FrequencyMultiplication();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LaserType#getLaserMedium <em>Laser Medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Laser Medium</em>'.
	 * @see org.openmicroscopy.ome.LaserType#getLaserMedium()
	 * @see #getLaserType()
	 * @generated
	 */
	EAttribute getLaserType_LaserMedium();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LaserType#isPockelCell <em>Pockel Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pockel Cell</em>'.
	 * @see org.openmicroscopy.ome.LaserType#isPockelCell()
	 * @see #getLaserType()
	 * @generated
	 */
	EAttribute getLaserType_PockelCell();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LaserType#getPulse <em>Pulse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pulse</em>'.
	 * @see org.openmicroscopy.ome.LaserType#getPulse()
	 * @see #getLaserType()
	 * @generated
	 */
	EAttribute getLaserType_Pulse();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LaserType#getRepetitionRate <em>Repetition Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repetition Rate</em>'.
	 * @see org.openmicroscopy.ome.LaserType#getRepetitionRate()
	 * @see #getLaserType()
	 * @generated
	 */
	EAttribute getLaserType_RepetitionRate();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LaserType#getRepetitionRateUnit <em>Repetition Rate Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repetition Rate Unit</em>'.
	 * @see org.openmicroscopy.ome.LaserType#getRepetitionRateUnit()
	 * @see #getLaserType()
	 * @generated
	 */
	EAttribute getLaserType_RepetitionRateUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LaserType#isTuneable <em>Tuneable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tuneable</em>'.
	 * @see org.openmicroscopy.ome.LaserType#isTuneable()
	 * @see #getLaserType()
	 * @generated
	 */
	EAttribute getLaserType_Tuneable();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LaserType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openmicroscopy.ome.LaserType#getType()
	 * @see #getLaserType()
	 * @generated
	 */
	EAttribute getLaserType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LaserType#getWavelength <em>Wavelength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wavelength</em>'.
	 * @see org.openmicroscopy.ome.LaserType#getWavelength()
	 * @see #getLaserType()
	 * @generated
	 */
	EAttribute getLaserType_Wavelength();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LaserType#getWavelengthUnit <em>Wavelength Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wavelength Unit</em>'.
	 * @see org.openmicroscopy.ome.LaserType#getWavelengthUnit()
	 * @see #getLaserType()
	 * @generated
	 */
	EAttribute getLaserType_WavelengthUnit();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.LeaderType <em>Leader Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leader Type</em>'.
	 * @see org.openmicroscopy.ome.LeaderType
	 * @generated
	 */
	EClass getLeaderType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LeaderType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.LeaderType#getID()
	 * @see #getLeaderType()
	 * @generated
	 */
	EAttribute getLeaderType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.LightEmittingDiodeType <em>Light Emitting Diode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Emitting Diode Type</em>'.
	 * @see org.openmicroscopy.ome.LightEmittingDiodeType
	 * @generated
	 */
	EClass getLightEmittingDiodeType();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.LightPathType <em>Light Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Path Type</em>'.
	 * @see org.openmicroscopy.ome.LightPathType
	 * @generated
	 */
	EClass getLightPathType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.LightPathType#getExcitationFilterRef <em>Excitation Filter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Excitation Filter Ref</em>'.
	 * @see org.openmicroscopy.ome.LightPathType#getExcitationFilterRef()
	 * @see #getLightPathType()
	 * @generated
	 */
	EReference getLightPathType_ExcitationFilterRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.LightPathType#getDichroicRef <em>Dichroic Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dichroic Ref</em>'.
	 * @see org.openmicroscopy.ome.LightPathType#getDichroicRef()
	 * @see #getLightPathType()
	 * @generated
	 */
	EReference getLightPathType_DichroicRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.LightPathType#getEmissionFilterRef <em>Emission Filter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emission Filter Ref</em>'.
	 * @see org.openmicroscopy.ome.LightPathType#getEmissionFilterRef()
	 * @see #getLightPathType()
	 * @generated
	 */
	EReference getLightPathType_EmissionFilterRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.LightPathType#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.LightPathType#getAnnotationRef()
	 * @see #getLightPathType()
	 * @generated
	 */
	EReference getLightPathType_AnnotationRef();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.LightSource <em>Light Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Source</em>'.
	 * @see org.openmicroscopy.ome.LightSource
	 * @generated
	 */
	EClass getLightSource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.LightSource#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.LightSource#getAnnotationRef()
	 * @see #getLightSource()
	 * @generated
	 */
	EReference getLightSource_AnnotationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LightSource#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.LightSource#getID()
	 * @see #getLightSource()
	 * @generated
	 */
	EAttribute getLightSource_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LightSource#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see org.openmicroscopy.ome.LightSource#getPower()
	 * @see #getLightSource()
	 * @generated
	 */
	EAttribute getLightSource_Power();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LightSource#getPowerUnit <em>Power Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Unit</em>'.
	 * @see org.openmicroscopy.ome.LightSource#getPowerUnit()
	 * @see #getLightSource()
	 * @generated
	 */
	EAttribute getLightSource_PowerUnit();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.LightSourceSettingsType <em>Light Source Settings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Source Settings Type</em>'.
	 * @see org.openmicroscopy.ome.LightSourceSettingsType
	 * @generated
	 */
	EClass getLightSourceSettingsType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LightSourceSettingsType#getAttenuation <em>Attenuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attenuation</em>'.
	 * @see org.openmicroscopy.ome.LightSourceSettingsType#getAttenuation()
	 * @see #getLightSourceSettingsType()
	 * @generated
	 */
	EAttribute getLightSourceSettingsType_Attenuation();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LightSourceSettingsType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.LightSourceSettingsType#getID()
	 * @see #getLightSourceSettingsType()
	 * @generated
	 */
	EAttribute getLightSourceSettingsType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LightSourceSettingsType#getWavelength <em>Wavelength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wavelength</em>'.
	 * @see org.openmicroscopy.ome.LightSourceSettingsType#getWavelength()
	 * @see #getLightSourceSettingsType()
	 * @generated
	 */
	EAttribute getLightSourceSettingsType_Wavelength();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LightSourceSettingsType#getWavelengthUnit <em>Wavelength Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wavelength Unit</em>'.
	 * @see org.openmicroscopy.ome.LightSourceSettingsType#getWavelengthUnit()
	 * @see #getLightSourceSettingsType()
	 * @generated
	 */
	EAttribute getLightSourceSettingsType_WavelengthUnit();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.LineType <em>Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Type</em>'.
	 * @see org.openmicroscopy.ome.LineType
	 * @generated
	 */
	EClass getLineType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LineType#getMarkerEnd <em>Marker End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker End</em>'.
	 * @see org.openmicroscopy.ome.LineType#getMarkerEnd()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_MarkerEnd();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LineType#getMarkerStart <em>Marker Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker Start</em>'.
	 * @see org.openmicroscopy.ome.LineType#getMarkerStart()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_MarkerStart();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LineType#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X1</em>'.
	 * @see org.openmicroscopy.ome.LineType#getX1()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_X1();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LineType#getX2 <em>X2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X2</em>'.
	 * @see org.openmicroscopy.ome.LineType#getX2()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_X2();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LineType#getY1 <em>Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1</em>'.
	 * @see org.openmicroscopy.ome.LineType#getY1()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_Y1();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LineType#getY2 <em>Y2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2</em>'.
	 * @see org.openmicroscopy.ome.LineType#getY2()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_Y2();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ListAnnotationType <em>List Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Annotation Type</em>'.
	 * @see org.openmicroscopy.ome.ListAnnotationType
	 * @generated
	 */
	EClass getListAnnotationType();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.LongAnnotationType <em>Long Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Annotation Type</em>'.
	 * @see org.openmicroscopy.ome.LongAnnotationType
	 * @generated
	 */
	EClass getLongAnnotationType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.LongAnnotationType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openmicroscopy.ome.LongAnnotationType#getValue()
	 * @see #getLongAnnotationType()
	 * @generated
	 */
	EAttribute getLongAnnotationType_Value();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ManufacturerSpec <em>Manufacturer Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manufacturer Spec</em>'.
	 * @see org.openmicroscopy.ome.ManufacturerSpec
	 * @generated
	 */
	EClass getManufacturerSpec();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ManufacturerSpec#getLotNumber <em>Lot Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lot Number</em>'.
	 * @see org.openmicroscopy.ome.ManufacturerSpec#getLotNumber()
	 * @see #getManufacturerSpec()
	 * @generated
	 */
	EAttribute getManufacturerSpec_LotNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ManufacturerSpec#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see org.openmicroscopy.ome.ManufacturerSpec#getManufacturer()
	 * @see #getManufacturerSpec()
	 * @generated
	 */
	EAttribute getManufacturerSpec_Manufacturer();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ManufacturerSpec#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.openmicroscopy.ome.ManufacturerSpec#getModel()
	 * @see #getManufacturerSpec()
	 * @generated
	 */
	EAttribute getManufacturerSpec_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ManufacturerSpec#getSerialNumber <em>Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Number</em>'.
	 * @see org.openmicroscopy.ome.ManufacturerSpec#getSerialNumber()
	 * @see #getManufacturerSpec()
	 * @generated
	 */
	EAttribute getManufacturerSpec_SerialNumber();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see org.openmicroscopy.ome.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.Map#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>M</em>'.
	 * @see org.openmicroscopy.ome.Map#getM()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_M();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.MapAnnotationType <em>Map Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Annotation Type</em>'.
	 * @see org.openmicroscopy.ome.MapAnnotationType
	 * @generated
	 */
	EClass getMapAnnotationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.MapAnnotationType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.openmicroscopy.ome.MapAnnotationType#getValue()
	 * @see #getMapAnnotationType()
	 * @generated
	 */
	EReference getMapAnnotationType_Value();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.MaskType <em>Mask Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mask Type</em>'.
	 * @see org.openmicroscopy.ome.MaskType
	 * @generated
	 */
	EClass getMaskType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.MaskType#getBinData <em>Bin Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bin Data</em>'.
	 * @see org.openmicroscopy.ome.MaskType#getBinData()
	 * @see #getMaskType()
	 * @generated
	 */
	EReference getMaskType_BinData();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.MaskType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.openmicroscopy.ome.MaskType#getHeight()
	 * @see #getMaskType()
	 * @generated
	 */
	EAttribute getMaskType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.MaskType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.openmicroscopy.ome.MaskType#getWidth()
	 * @see #getMaskType()
	 * @generated
	 */
	EAttribute getMaskType_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.MaskType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.openmicroscopy.ome.MaskType#getX()
	 * @see #getMaskType()
	 * @generated
	 */
	EAttribute getMaskType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.MaskType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.openmicroscopy.ome.MaskType#getY()
	 * @see #getMaskType()
	 * @generated
	 */
	EAttribute getMaskType_Y();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.MicrobeamManipulationRefType <em>Microbeam Manipulation Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microbeam Manipulation Ref Type</em>'.
	 * @see org.openmicroscopy.ome.MicrobeamManipulationRefType
	 * @generated
	 */
	EClass getMicrobeamManipulationRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.MicrobeamManipulationRefType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.MicrobeamManipulationRefType#getID()
	 * @see #getMicrobeamManipulationRefType()
	 * @generated
	 */
	EAttribute getMicrobeamManipulationRefType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.MicrobeamManipulationType <em>Microbeam Manipulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microbeam Manipulation Type</em>'.
	 * @see org.openmicroscopy.ome.MicrobeamManipulationType
	 * @generated
	 */
	EClass getMicrobeamManipulationType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.MicrobeamManipulationType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openmicroscopy.ome.MicrobeamManipulationType#getDescription()
	 * @see #getMicrobeamManipulationType()
	 * @generated
	 */
	EAttribute getMicrobeamManipulationType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.MicrobeamManipulationType#getROIRef <em>ROI Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ROI Ref</em>'.
	 * @see org.openmicroscopy.ome.MicrobeamManipulationType#getROIRef()
	 * @see #getMicrobeamManipulationType()
	 * @generated
	 */
	EReference getMicrobeamManipulationType_ROIRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.MicrobeamManipulationType#getExperimenterRef <em>Experimenter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Experimenter Ref</em>'.
	 * @see org.openmicroscopy.ome.MicrobeamManipulationType#getExperimenterRef()
	 * @see #getMicrobeamManipulationType()
	 * @generated
	 */
	EReference getMicrobeamManipulationType_ExperimenterRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.MicrobeamManipulationType#getLightSourceSettings <em>Light Source Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Light Source Settings</em>'.
	 * @see org.openmicroscopy.ome.MicrobeamManipulationType#getLightSourceSettings()
	 * @see #getMicrobeamManipulationType()
	 * @generated
	 */
	EReference getMicrobeamManipulationType_LightSourceSettings();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.MicrobeamManipulationType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.MicrobeamManipulationType#getID()
	 * @see #getMicrobeamManipulationType()
	 * @generated
	 */
	EAttribute getMicrobeamManipulationType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.MicrobeamManipulationType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openmicroscopy.ome.MicrobeamManipulationType#getType()
	 * @see #getMicrobeamManipulationType()
	 * @generated
	 */
	EAttribute getMicrobeamManipulationType_Type();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.MicroscopeType <em>Microscope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microscope Type</em>'.
	 * @see org.openmicroscopy.ome.MicroscopeType
	 * @generated
	 */
	EClass getMicroscopeType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.MicroscopeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openmicroscopy.ome.MicroscopeType#getType()
	 * @see #getMicroscopeType()
	 * @generated
	 */
	EAttribute getMicroscopeType_Type();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.MType <em>MType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MType</em>'.
	 * @see org.openmicroscopy.ome.MType
	 * @generated
	 */
	EClass getMType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.MType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openmicroscopy.ome.MType#getValue()
	 * @see #getMType()
	 * @generated
	 */
	EAttribute getMType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.MType#getK <em>K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>K</em>'.
	 * @see org.openmicroscopy.ome.MType#getK()
	 * @see #getMType()
	 * @generated
	 */
	EAttribute getMType_K();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.NumericAnnotation <em>Numeric Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Annotation</em>'.
	 * @see org.openmicroscopy.ome.NumericAnnotation
	 * @generated
	 */
	EClass getNumericAnnotation();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ObjectiveSettingsType <em>Objective Settings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective Settings Type</em>'.
	 * @see org.openmicroscopy.ome.ObjectiveSettingsType
	 * @generated
	 */
	EClass getObjectiveSettingsType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ObjectiveSettingsType#getCorrectionCollar <em>Correction Collar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correction Collar</em>'.
	 * @see org.openmicroscopy.ome.ObjectiveSettingsType#getCorrectionCollar()
	 * @see #getObjectiveSettingsType()
	 * @generated
	 */
	EAttribute getObjectiveSettingsType_CorrectionCollar();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ObjectiveSettingsType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.ObjectiveSettingsType#getID()
	 * @see #getObjectiveSettingsType()
	 * @generated
	 */
	EAttribute getObjectiveSettingsType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ObjectiveSettingsType#getMedium <em>Medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medium</em>'.
	 * @see org.openmicroscopy.ome.ObjectiveSettingsType#getMedium()
	 * @see #getObjectiveSettingsType()
	 * @generated
	 */
	EAttribute getObjectiveSettingsType_Medium();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ObjectiveSettingsType#getRefractiveIndex <em>Refractive Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refractive Index</em>'.
	 * @see org.openmicroscopy.ome.ObjectiveSettingsType#getRefractiveIndex()
	 * @see #getObjectiveSettingsType()
	 * @generated
	 */
	EAttribute getObjectiveSettingsType_RefractiveIndex();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ObjectiveType <em>Objective Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective Type</em>'.
	 * @see org.openmicroscopy.ome.ObjectiveType
	 * @generated
	 */
	EClass getObjectiveType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.ObjectiveType#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.ObjectiveType#getAnnotationRef()
	 * @see #getObjectiveType()
	 * @generated
	 */
	EReference getObjectiveType_AnnotationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ObjectiveType#getCalibratedMagnification <em>Calibrated Magnification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calibrated Magnification</em>'.
	 * @see org.openmicroscopy.ome.ObjectiveType#getCalibratedMagnification()
	 * @see #getObjectiveType()
	 * @generated
	 */
	EAttribute getObjectiveType_CalibratedMagnification();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ObjectiveType#getCorrection <em>Correction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correction</em>'.
	 * @see org.openmicroscopy.ome.ObjectiveType#getCorrection()
	 * @see #getObjectiveType()
	 * @generated
	 */
	EAttribute getObjectiveType_Correction();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ObjectiveType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.ObjectiveType#getID()
	 * @see #getObjectiveType()
	 * @generated
	 */
	EAttribute getObjectiveType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ObjectiveType#getImmersion <em>Immersion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immersion</em>'.
	 * @see org.openmicroscopy.ome.ObjectiveType#getImmersion()
	 * @see #getObjectiveType()
	 * @generated
	 */
	EAttribute getObjectiveType_Immersion();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ObjectiveType#isIris <em>Iris</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iris</em>'.
	 * @see org.openmicroscopy.ome.ObjectiveType#isIris()
	 * @see #getObjectiveType()
	 * @generated
	 */
	EAttribute getObjectiveType_Iris();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ObjectiveType#getLensNA <em>Lens NA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lens NA</em>'.
	 * @see org.openmicroscopy.ome.ObjectiveType#getLensNA()
	 * @see #getObjectiveType()
	 * @generated
	 */
	EAttribute getObjectiveType_LensNA();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ObjectiveType#getNominalMagnification <em>Nominal Magnification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal Magnification</em>'.
	 * @see org.openmicroscopy.ome.ObjectiveType#getNominalMagnification()
	 * @see #getObjectiveType()
	 * @generated
	 */
	EAttribute getObjectiveType_NominalMagnification();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ObjectiveType#getWorkingDistance <em>Working Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working Distance</em>'.
	 * @see org.openmicroscopy.ome.ObjectiveType#getWorkingDistance()
	 * @see #getObjectiveType()
	 * @generated
	 */
	EAttribute getObjectiveType_WorkingDistance();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ObjectiveType#getWorkingDistanceUnit <em>Working Distance Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working Distance Unit</em>'.
	 * @see org.openmicroscopy.ome.ObjectiveType#getWorkingDistanceUnit()
	 * @see #getObjectiveType()
	 * @generated
	 */
	EAttribute getObjectiveType_WorkingDistanceUnit();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.OMEType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.openmicroscopy.ome.OMEType
	 * @generated
	 */
	EClass getOMEType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.OMEType#getRights <em>Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rights</em>'.
	 * @see org.openmicroscopy.ome.OMEType#getRights()
	 * @see #getOMEType()
	 * @generated
	 */
	EReference getOMEType_Rights();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.OMEType#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Project</em>'.
	 * @see org.openmicroscopy.ome.OMEType#getProject()
	 * @see #getOMEType()
	 * @generated
	 */
	EReference getOMEType_Project();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.OMEType#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataset</em>'.
	 * @see org.openmicroscopy.ome.OMEType#getDataset()
	 * @see #getOMEType()
	 * @generated
	 */
	EReference getOMEType_Dataset();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.OMEType#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folder</em>'.
	 * @see org.openmicroscopy.ome.OMEType#getFolder()
	 * @see #getOMEType()
	 * @generated
	 */
	EReference getOMEType_Folder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.OMEType#getExperiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Experiment</em>'.
	 * @see org.openmicroscopy.ome.OMEType#getExperiment()
	 * @see #getOMEType()
	 * @generated
	 */
	EReference getOMEType_Experiment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.OMEType#getPlate <em>Plate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plate</em>'.
	 * @see org.openmicroscopy.ome.OMEType#getPlate()
	 * @see #getOMEType()
	 * @generated
	 */
	EReference getOMEType_Plate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.OMEType#getScreen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Screen</em>'.
	 * @see org.openmicroscopy.ome.OMEType#getScreen()
	 * @see #getOMEType()
	 * @generated
	 */
	EReference getOMEType_Screen();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.OMEType#getExperimenter <em>Experimenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Experimenter</em>'.
	 * @see org.openmicroscopy.ome.OMEType#getExperimenter()
	 * @see #getOMEType()
	 * @generated
	 */
	EReference getOMEType_Experimenter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.OMEType#getExperimenterGroup <em>Experimenter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Experimenter Group</em>'.
	 * @see org.openmicroscopy.ome.OMEType#getExperimenterGroup()
	 * @see #getOMEType()
	 * @generated
	 */
	EReference getOMEType_ExperimenterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.OMEType#getInstrument <em>Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instrument</em>'.
	 * @see org.openmicroscopy.ome.OMEType#getInstrument()
	 * @see #getOMEType()
	 * @generated
	 */
	EReference getOMEType_Instrument();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.OMEType#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Image</em>'.
	 * @see org.openmicroscopy.ome.OMEType#getImage()
	 * @see #getOMEType()
	 * @generated
	 */
	EReference getOMEType_Image();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.OMEType#getStructuredAnnotations <em>Structured Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structured Annotations</em>'.
	 * @see org.openmicroscopy.ome.OMEType#getStructuredAnnotations()
	 * @see #getOMEType()
	 * @generated
	 */
	EReference getOMEType_StructuredAnnotations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.OMEType#getROI <em>ROI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ROI</em>'.
	 * @see org.openmicroscopy.ome.OMEType#getROI()
	 * @see #getOMEType()
	 * @generated
	 */
	EReference getOMEType_ROI();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.OMEType#getBinaryOnly <em>Binary Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binary Only</em>'.
	 * @see org.openmicroscopy.ome.OMEType#getBinaryOnly()
	 * @see #getOMEType()
	 * @generated
	 */
	EReference getOMEType_BinaryOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.OMEType#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creator</em>'.
	 * @see org.openmicroscopy.ome.OMEType#getCreator()
	 * @see #getOMEType()
	 * @generated
	 */
	EAttribute getOMEType_Creator();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.OMEType#getUUID <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UUID</em>'.
	 * @see org.openmicroscopy.ome.OMEType#getUUID()
	 * @see #getOMEType()
	 * @generated
	 */
	EAttribute getOMEType_UUID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.PixelsType <em>Pixels Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pixels Type</em>'.
	 * @see org.openmicroscopy.ome.PixelsType
	 * @generated
	 */
	EClass getPixelsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.PixelsType#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channel</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getChannel()
	 * @see #getPixelsType()
	 * @generated
	 */
	EReference getPixelsType_Channel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.PixelsType#getBinData <em>Bin Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bin Data</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getBinData()
	 * @see #getPixelsType()
	 * @generated
	 */
	EReference getPixelsType_BinData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.PixelsType#getTiffData <em>Tiff Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tiff Data</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getTiffData()
	 * @see #getPixelsType()
	 * @generated
	 */
	EReference getPixelsType_TiffData();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.PixelsType#getMetadataOnly <em>Metadata Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata Only</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getMetadataOnly()
	 * @see #getPixelsType()
	 * @generated
	 */
	EReference getPixelsType_MetadataOnly();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.PixelsType#getPlane <em>Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plane</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getPlane()
	 * @see #getPixelsType()
	 * @generated
	 */
	EReference getPixelsType_Plane();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PixelsType#isBigEndian <em>Big Endian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Big Endian</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#isBigEndian()
	 * @see #getPixelsType()
	 * @generated
	 */
	EAttribute getPixelsType_BigEndian();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PixelsType#getDimensionOrder <em>Dimension Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension Order</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getDimensionOrder()
	 * @see #getPixelsType()
	 * @generated
	 */
	EAttribute getPixelsType_DimensionOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PixelsType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getID()
	 * @see #getPixelsType()
	 * @generated
	 */
	EAttribute getPixelsType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PixelsType#isInterleaved <em>Interleaved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interleaved</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#isInterleaved()
	 * @see #getPixelsType()
	 * @generated
	 */
	EAttribute getPixelsType_Interleaved();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeX <em>Physical Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical Size X</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getPhysicalSizeX()
	 * @see #getPixelsType()
	 * @generated
	 */
	EAttribute getPixelsType_PhysicalSizeX();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeXUnit <em>Physical Size XUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical Size XUnit</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getPhysicalSizeXUnit()
	 * @see #getPixelsType()
	 * @generated
	 */
	EAttribute getPixelsType_PhysicalSizeXUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeY <em>Physical Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical Size Y</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getPhysicalSizeY()
	 * @see #getPixelsType()
	 * @generated
	 */
	EAttribute getPixelsType_PhysicalSizeY();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeYUnit <em>Physical Size YUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical Size YUnit</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getPhysicalSizeYUnit()
	 * @see #getPixelsType()
	 * @generated
	 */
	EAttribute getPixelsType_PhysicalSizeYUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeZ <em>Physical Size Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical Size Z</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getPhysicalSizeZ()
	 * @see #getPixelsType()
	 * @generated
	 */
	EAttribute getPixelsType_PhysicalSizeZ();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeZUnit <em>Physical Size ZUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical Size ZUnit</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getPhysicalSizeZUnit()
	 * @see #getPixelsType()
	 * @generated
	 */
	EAttribute getPixelsType_PhysicalSizeZUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PixelsType#getSignificantBits <em>Significant Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Significant Bits</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getSignificantBits()
	 * @see #getPixelsType()
	 * @generated
	 */
	EAttribute getPixelsType_SignificantBits();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PixelsType#getSizeC <em>Size C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size C</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getSizeC()
	 * @see #getPixelsType()
	 * @generated
	 */
	EAttribute getPixelsType_SizeC();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PixelsType#getSizeT <em>Size T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size T</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getSizeT()
	 * @see #getPixelsType()
	 * @generated
	 */
	EAttribute getPixelsType_SizeT();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PixelsType#getSizeX <em>Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size X</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getSizeX()
	 * @see #getPixelsType()
	 * @generated
	 */
	EAttribute getPixelsType_SizeX();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PixelsType#getSizeY <em>Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Y</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getSizeY()
	 * @see #getPixelsType()
	 * @generated
	 */
	EAttribute getPixelsType_SizeY();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PixelsType#getSizeZ <em>Size Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Z</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getSizeZ()
	 * @see #getPixelsType()
	 * @generated
	 */
	EAttribute getPixelsType_SizeZ();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PixelsType#getTimeIncrement <em>Time Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Increment</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getTimeIncrement()
	 * @see #getPixelsType()
	 * @generated
	 */
	EAttribute getPixelsType_TimeIncrement();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PixelsType#getTimeIncrementUnit <em>Time Increment Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Increment Unit</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getTimeIncrementUnit()
	 * @see #getPixelsType()
	 * @generated
	 */
	EAttribute getPixelsType_TimeIncrementUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PixelsType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openmicroscopy.ome.PixelsType#getType()
	 * @see #getPixelsType()
	 * @generated
	 */
	EAttribute getPixelsType_Type();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.PlaneType <em>Plane Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plane Type</em>'.
	 * @see org.openmicroscopy.ome.PlaneType
	 * @generated
	 */
	EClass getPlaneType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlaneType#getHashSHA1 <em>Hash SHA1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash SHA1</em>'.
	 * @see org.openmicroscopy.ome.PlaneType#getHashSHA1()
	 * @see #getPlaneType()
	 * @generated
	 */
	EAttribute getPlaneType_HashSHA1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.PlaneType#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.PlaneType#getAnnotationRef()
	 * @see #getPlaneType()
	 * @generated
	 */
	EReference getPlaneType_AnnotationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlaneType#getDeltaT <em>Delta T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delta T</em>'.
	 * @see org.openmicroscopy.ome.PlaneType#getDeltaT()
	 * @see #getPlaneType()
	 * @generated
	 */
	EAttribute getPlaneType_DeltaT();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlaneType#getDeltaTUnit <em>Delta TUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delta TUnit</em>'.
	 * @see org.openmicroscopy.ome.PlaneType#getDeltaTUnit()
	 * @see #getPlaneType()
	 * @generated
	 */
	EAttribute getPlaneType_DeltaTUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlaneType#getExposureTime <em>Exposure Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exposure Time</em>'.
	 * @see org.openmicroscopy.ome.PlaneType#getExposureTime()
	 * @see #getPlaneType()
	 * @generated
	 */
	EAttribute getPlaneType_ExposureTime();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlaneType#getExposureTimeUnit <em>Exposure Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exposure Time Unit</em>'.
	 * @see org.openmicroscopy.ome.PlaneType#getExposureTimeUnit()
	 * @see #getPlaneType()
	 * @generated
	 */
	EAttribute getPlaneType_ExposureTimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlaneType#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see org.openmicroscopy.ome.PlaneType#getPositionX()
	 * @see #getPlaneType()
	 * @generated
	 */
	EAttribute getPlaneType_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlaneType#getPositionXUnit <em>Position XUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position XUnit</em>'.
	 * @see org.openmicroscopy.ome.PlaneType#getPositionXUnit()
	 * @see #getPlaneType()
	 * @generated
	 */
	EAttribute getPlaneType_PositionXUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlaneType#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see org.openmicroscopy.ome.PlaneType#getPositionY()
	 * @see #getPlaneType()
	 * @generated
	 */
	EAttribute getPlaneType_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlaneType#getPositionYUnit <em>Position YUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position YUnit</em>'.
	 * @see org.openmicroscopy.ome.PlaneType#getPositionYUnit()
	 * @see #getPlaneType()
	 * @generated
	 */
	EAttribute getPlaneType_PositionYUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlaneType#getPositionZ <em>Position Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Z</em>'.
	 * @see org.openmicroscopy.ome.PlaneType#getPositionZ()
	 * @see #getPlaneType()
	 * @generated
	 */
	EAttribute getPlaneType_PositionZ();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlaneType#getPositionZUnit <em>Position ZUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position ZUnit</em>'.
	 * @see org.openmicroscopy.ome.PlaneType#getPositionZUnit()
	 * @see #getPlaneType()
	 * @generated
	 */
	EAttribute getPlaneType_PositionZUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlaneType#getTheC <em>The C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The C</em>'.
	 * @see org.openmicroscopy.ome.PlaneType#getTheC()
	 * @see #getPlaneType()
	 * @generated
	 */
	EAttribute getPlaneType_TheC();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlaneType#getTheT <em>The T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The T</em>'.
	 * @see org.openmicroscopy.ome.PlaneType#getTheT()
	 * @see #getPlaneType()
	 * @generated
	 */
	EAttribute getPlaneType_TheT();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlaneType#getTheZ <em>The Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The Z</em>'.
	 * @see org.openmicroscopy.ome.PlaneType#getTheZ()
	 * @see #getPlaneType()
	 * @generated
	 */
	EAttribute getPlaneType_TheZ();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.PlateAcquisitionType <em>Plate Acquisition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plate Acquisition Type</em>'.
	 * @see org.openmicroscopy.ome.PlateAcquisitionType
	 * @generated
	 */
	EClass getPlateAcquisitionType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlateAcquisitionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openmicroscopy.ome.PlateAcquisitionType#getDescription()
	 * @see #getPlateAcquisitionType()
	 * @generated
	 */
	EAttribute getPlateAcquisitionType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.PlateAcquisitionType#getWellSampleRef <em>Well Sample Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Well Sample Ref</em>'.
	 * @see org.openmicroscopy.ome.PlateAcquisitionType#getWellSampleRef()
	 * @see #getPlateAcquisitionType()
	 * @generated
	 */
	EReference getPlateAcquisitionType_WellSampleRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.PlateAcquisitionType#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.PlateAcquisitionType#getAnnotationRef()
	 * @see #getPlateAcquisitionType()
	 * @generated
	 */
	EReference getPlateAcquisitionType_AnnotationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlateAcquisitionType#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see org.openmicroscopy.ome.PlateAcquisitionType#getEndTime()
	 * @see #getPlateAcquisitionType()
	 * @generated
	 */
	EAttribute getPlateAcquisitionType_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlateAcquisitionType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.PlateAcquisitionType#getID()
	 * @see #getPlateAcquisitionType()
	 * @generated
	 */
	EAttribute getPlateAcquisitionType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlateAcquisitionType#getMaximumFieldCount <em>Maximum Field Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Field Count</em>'.
	 * @see org.openmicroscopy.ome.PlateAcquisitionType#getMaximumFieldCount()
	 * @see #getPlateAcquisitionType()
	 * @generated
	 */
	EAttribute getPlateAcquisitionType_MaximumFieldCount();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlateAcquisitionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openmicroscopy.ome.PlateAcquisitionType#getName()
	 * @see #getPlateAcquisitionType()
	 * @generated
	 */
	EAttribute getPlateAcquisitionType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlateAcquisitionType#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see org.openmicroscopy.ome.PlateAcquisitionType#getStartTime()
	 * @see #getPlateAcquisitionType()
	 * @generated
	 */
	EAttribute getPlateAcquisitionType_StartTime();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.PlateRefType <em>Plate Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plate Ref Type</em>'.
	 * @see org.openmicroscopy.ome.PlateRefType
	 * @generated
	 */
	EClass getPlateRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlateRefType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.PlateRefType#getID()
	 * @see #getPlateRefType()
	 * @generated
	 */
	EAttribute getPlateRefType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.PlateType <em>Plate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plate Type</em>'.
	 * @see org.openmicroscopy.ome.PlateType
	 * @generated
	 */
	EClass getPlateType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlateType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openmicroscopy.ome.PlateType#getDescription()
	 * @see #getPlateType()
	 * @generated
	 */
	EAttribute getPlateType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.PlateType#getWell <em>Well</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Well</em>'.
	 * @see org.openmicroscopy.ome.PlateType#getWell()
	 * @see #getPlateType()
	 * @generated
	 */
	EReference getPlateType_Well();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.PlateType#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.PlateType#getAnnotationRef()
	 * @see #getPlateType()
	 * @generated
	 */
	EReference getPlateType_AnnotationRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.PlateType#getPlateAcquisition <em>Plate Acquisition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plate Acquisition</em>'.
	 * @see org.openmicroscopy.ome.PlateType#getPlateAcquisition()
	 * @see #getPlateType()
	 * @generated
	 */
	EReference getPlateType_PlateAcquisition();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlateType#getColumnNamingConvention <em>Column Naming Convention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Naming Convention</em>'.
	 * @see org.openmicroscopy.ome.PlateType#getColumnNamingConvention()
	 * @see #getPlateType()
	 * @generated
	 */
	EAttribute getPlateType_ColumnNamingConvention();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlateType#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see org.openmicroscopy.ome.PlateType#getColumns()
	 * @see #getPlateType()
	 * @generated
	 */
	EAttribute getPlateType_Columns();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlateType#getExternalIdentifier <em>External Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Identifier</em>'.
	 * @see org.openmicroscopy.ome.PlateType#getExternalIdentifier()
	 * @see #getPlateType()
	 * @generated
	 */
	EAttribute getPlateType_ExternalIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlateType#getFieldIndex <em>Field Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Index</em>'.
	 * @see org.openmicroscopy.ome.PlateType#getFieldIndex()
	 * @see #getPlateType()
	 * @generated
	 */
	EAttribute getPlateType_FieldIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlateType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.PlateType#getID()
	 * @see #getPlateType()
	 * @generated
	 */
	EAttribute getPlateType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlateType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openmicroscopy.ome.PlateType#getName()
	 * @see #getPlateType()
	 * @generated
	 */
	EAttribute getPlateType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlateType#getRowNamingConvention <em>Row Naming Convention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Naming Convention</em>'.
	 * @see org.openmicroscopy.ome.PlateType#getRowNamingConvention()
	 * @see #getPlateType()
	 * @generated
	 */
	EAttribute getPlateType_RowNamingConvention();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlateType#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see org.openmicroscopy.ome.PlateType#getRows()
	 * @see #getPlateType()
	 * @generated
	 */
	EAttribute getPlateType_Rows();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlateType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openmicroscopy.ome.PlateType#getStatus()
	 * @see #getPlateType()
	 * @generated
	 */
	EAttribute getPlateType_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlateType#getWellOriginX <em>Well Origin X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Well Origin X</em>'.
	 * @see org.openmicroscopy.ome.PlateType#getWellOriginX()
	 * @see #getPlateType()
	 * @generated
	 */
	EAttribute getPlateType_WellOriginX();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlateType#getWellOriginXUnit <em>Well Origin XUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Well Origin XUnit</em>'.
	 * @see org.openmicroscopy.ome.PlateType#getWellOriginXUnit()
	 * @see #getPlateType()
	 * @generated
	 */
	EAttribute getPlateType_WellOriginXUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlateType#getWellOriginY <em>Well Origin Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Well Origin Y</em>'.
	 * @see org.openmicroscopy.ome.PlateType#getWellOriginY()
	 * @see #getPlateType()
	 * @generated
	 */
	EAttribute getPlateType_WellOriginY();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PlateType#getWellOriginYUnit <em>Well Origin YUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Well Origin YUnit</em>'.
	 * @see org.openmicroscopy.ome.PlateType#getWellOriginYUnit()
	 * @see #getPlateType()
	 * @generated
	 */
	EAttribute getPlateType_WellOriginYUnit();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.PointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Type</em>'.
	 * @see org.openmicroscopy.ome.PointType
	 * @generated
	 */
	EClass getPointType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PointType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.openmicroscopy.ome.PointType#getX()
	 * @see #getPointType()
	 * @generated
	 */
	EAttribute getPointType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PointType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.openmicroscopy.ome.PointType#getY()
	 * @see #getPointType()
	 * @generated
	 */
	EAttribute getPointType_Y();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.PolygonType <em>Polygon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon Type</em>'.
	 * @see org.openmicroscopy.ome.PolygonType
	 * @generated
	 */
	EClass getPolygonType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PolygonType#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see org.openmicroscopy.ome.PolygonType#getPoints()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_Points();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.PolylineType <em>Polyline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polyline Type</em>'.
	 * @see org.openmicroscopy.ome.PolylineType
	 * @generated
	 */
	EClass getPolylineType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PolylineType#getMarkerEnd <em>Marker End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker End</em>'.
	 * @see org.openmicroscopy.ome.PolylineType#getMarkerEnd()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_MarkerEnd();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PolylineType#getMarkerStart <em>Marker Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker Start</em>'.
	 * @see org.openmicroscopy.ome.PolylineType#getMarkerStart()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_MarkerStart();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PolylineType#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see org.openmicroscopy.ome.PolylineType#getPoints()
	 * @see #getPolylineType()
	 * @generated
	 */
	EAttribute getPolylineType_Points();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ProjectRefType <em>Project Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Ref Type</em>'.
	 * @see org.openmicroscopy.ome.ProjectRefType
	 * @generated
	 */
	EClass getProjectRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ProjectRefType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.ProjectRefType#getID()
	 * @see #getProjectRefType()
	 * @generated
	 */
	EAttribute getProjectRefType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ProjectType <em>Project Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Type</em>'.
	 * @see org.openmicroscopy.ome.ProjectType
	 * @generated
	 */
	EClass getProjectType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ProjectType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openmicroscopy.ome.ProjectType#getDescription()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.ProjectType#getExperimenterRef <em>Experimenter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Experimenter Ref</em>'.
	 * @see org.openmicroscopy.ome.ProjectType#getExperimenterRef()
	 * @see #getProjectType()
	 * @generated
	 */
	EReference getProjectType_ExperimenterRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.ProjectType#getExperimenterGroupRef <em>Experimenter Group Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Experimenter Group Ref</em>'.
	 * @see org.openmicroscopy.ome.ProjectType#getExperimenterGroupRef()
	 * @see #getProjectType()
	 * @generated
	 */
	EReference getProjectType_ExperimenterGroupRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.ProjectType#getDatasetRef <em>Dataset Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataset Ref</em>'.
	 * @see org.openmicroscopy.ome.ProjectType#getDatasetRef()
	 * @see #getProjectType()
	 * @generated
	 */
	EReference getProjectType_DatasetRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.ProjectType#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.ProjectType#getAnnotationRef()
	 * @see #getProjectType()
	 * @generated
	 */
	EReference getProjectType_AnnotationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ProjectType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.ProjectType#getID()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ProjectType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openmicroscopy.ome.ProjectType#getName()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_Name();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.PumpType <em>Pump Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pump Type</em>'.
	 * @see org.openmicroscopy.ome.PumpType
	 * @generated
	 */
	EClass getPumpType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.PumpType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.PumpType#getID()
	 * @see #getPumpType()
	 * @generated
	 */
	EAttribute getPumpType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ReagentRefType <em>Reagent Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reagent Ref Type</em>'.
	 * @see org.openmicroscopy.ome.ReagentRefType
	 * @generated
	 */
	EClass getReagentRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ReagentRefType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.ReagentRefType#getID()
	 * @see #getReagentRefType()
	 * @generated
	 */
	EAttribute getReagentRefType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ReagentType <em>Reagent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reagent Type</em>'.
	 * @see org.openmicroscopy.ome.ReagentType
	 * @generated
	 */
	EClass getReagentType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ReagentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openmicroscopy.ome.ReagentType#getDescription()
	 * @see #getReagentType()
	 * @generated
	 */
	EAttribute getReagentType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.ReagentType#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.ReagentType#getAnnotationRef()
	 * @see #getReagentType()
	 * @generated
	 */
	EReference getReagentType_AnnotationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ReagentType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.ReagentType#getID()
	 * @see #getReagentType()
	 * @generated
	 */
	EAttribute getReagentType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ReagentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openmicroscopy.ome.ReagentType#getName()
	 * @see #getReagentType()
	 * @generated
	 */
	EAttribute getReagentType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ReagentType#getReagentIdentifier <em>Reagent Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reagent Identifier</em>'.
	 * @see org.openmicroscopy.ome.ReagentType#getReagentIdentifier()
	 * @see #getReagentType()
	 * @generated
	 */
	EAttribute getReagentType_ReagentIdentifier();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.RectangleType <em>Rectangle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle Type</em>'.
	 * @see org.openmicroscopy.ome.RectangleType
	 * @generated
	 */
	EClass getRectangleType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.RectangleType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.openmicroscopy.ome.RectangleType#getHeight()
	 * @see #getRectangleType()
	 * @generated
	 */
	EAttribute getRectangleType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.RectangleType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.openmicroscopy.ome.RectangleType#getWidth()
	 * @see #getRectangleType()
	 * @generated
	 */
	EAttribute getRectangleType_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.RectangleType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.openmicroscopy.ome.RectangleType#getX()
	 * @see #getRectangleType()
	 * @generated
	 */
	EAttribute getRectangleType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.RectangleType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.openmicroscopy.ome.RectangleType#getY()
	 * @see #getRectangleType()
	 * @generated
	 */
	EAttribute getRectangleType_Y();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.openmicroscopy.ome.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.RightsType <em>Rights Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rights Type</em>'.
	 * @see org.openmicroscopy.ome.RightsType
	 * @generated
	 */
	EClass getRightsType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.RightsType#getRightsHolder <em>Rights Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rights Holder</em>'.
	 * @see org.openmicroscopy.ome.RightsType#getRightsHolder()
	 * @see #getRightsType()
	 * @generated
	 */
	EAttribute getRightsType_RightsHolder();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.RightsType#getRightsHeld <em>Rights Held</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rights Held</em>'.
	 * @see org.openmicroscopy.ome.RightsType#getRightsHeld()
	 * @see #getRightsType()
	 * @generated
	 */
	EAttribute getRightsType_RightsHeld();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ROIRefType <em>ROI Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROI Ref Type</em>'.
	 * @see org.openmicroscopy.ome.ROIRefType
	 * @generated
	 */
	EClass getROIRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ROIRefType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.ROIRefType#getID()
	 * @see #getROIRefType()
	 * @generated
	 */
	EAttribute getROIRefType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ROIType <em>ROI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROI Type</em>'.
	 * @see org.openmicroscopy.ome.ROIType
	 * @generated
	 */
	EClass getROIType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.ROIType#getUnion <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Union</em>'.
	 * @see org.openmicroscopy.ome.ROIType#getUnion()
	 * @see #getROIType()
	 * @generated
	 */
	EReference getROIType_Union();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.ROIType#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.ROIType#getAnnotationRef()
	 * @see #getROIType()
	 * @generated
	 */
	EReference getROIType_AnnotationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ROIType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openmicroscopy.ome.ROIType#getDescription()
	 * @see #getROIType()
	 * @generated
	 */
	EAttribute getROIType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ROIType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.ROIType#getID()
	 * @see #getROIType()
	 * @generated
	 */
	EAttribute getROIType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ROIType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openmicroscopy.ome.ROIType#getName()
	 * @see #getROIType()
	 * @generated
	 */
	EAttribute getROIType_Name();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ScreenType <em>Screen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screen Type</em>'.
	 * @see org.openmicroscopy.ome.ScreenType
	 * @generated
	 */
	EClass getScreenType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ScreenType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openmicroscopy.ome.ScreenType#getDescription()
	 * @see #getScreenType()
	 * @generated
	 */
	EAttribute getScreenType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.ScreenType#getReagent <em>Reagent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reagent</em>'.
	 * @see org.openmicroscopy.ome.ScreenType#getReagent()
	 * @see #getScreenType()
	 * @generated
	 */
	EReference getScreenType_Reagent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.ScreenType#getPlateRef <em>Plate Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plate Ref</em>'.
	 * @see org.openmicroscopy.ome.ScreenType#getPlateRef()
	 * @see #getScreenType()
	 * @generated
	 */
	EReference getScreenType_PlateRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.ScreenType#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.ScreenType#getAnnotationRef()
	 * @see #getScreenType()
	 * @generated
	 */
	EReference getScreenType_AnnotationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ScreenType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.ScreenType#getID()
	 * @see #getScreenType()
	 * @generated
	 */
	EAttribute getScreenType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ScreenType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openmicroscopy.ome.ScreenType#getName()
	 * @see #getScreenType()
	 * @generated
	 */
	EAttribute getScreenType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ScreenType#getProtocolDescription <em>Protocol Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol Description</em>'.
	 * @see org.openmicroscopy.ome.ScreenType#getProtocolDescription()
	 * @see #getScreenType()
	 * @generated
	 */
	EAttribute getScreenType_ProtocolDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ScreenType#getProtocolIdentifier <em>Protocol Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol Identifier</em>'.
	 * @see org.openmicroscopy.ome.ScreenType#getProtocolIdentifier()
	 * @see #getScreenType()
	 * @generated
	 */
	EAttribute getScreenType_ProtocolIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ScreenType#getReagentSetDescription <em>Reagent Set Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reagent Set Description</em>'.
	 * @see org.openmicroscopy.ome.ScreenType#getReagentSetDescription()
	 * @see #getScreenType()
	 * @generated
	 */
	EAttribute getScreenType_ReagentSetDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ScreenType#getReagentSetIdentifier <em>Reagent Set Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reagent Set Identifier</em>'.
	 * @see org.openmicroscopy.ome.ScreenType#getReagentSetIdentifier()
	 * @see #getScreenType()
	 * @generated
	 */
	EAttribute getScreenType_ReagentSetIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.ScreenType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openmicroscopy.ome.ScreenType#getType()
	 * @see #getScreenType()
	 * @generated
	 */
	EAttribute getScreenType_Type();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.Settings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settings</em>'.
	 * @see org.openmicroscopy.ome.Settings
	 * @generated
	 */
	EClass getSettings();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see org.openmicroscopy.ome.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.Shape#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform</em>'.
	 * @see org.openmicroscopy.ome.Shape#getTransform()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_Transform();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.Shape#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.Shape#getAnnotationRef()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_AnnotationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.Shape#getFillColor <em>Fill Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Color</em>'.
	 * @see org.openmicroscopy.ome.Shape#getFillColor()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_FillColor();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.Shape#getFillRule <em>Fill Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Rule</em>'.
	 * @see org.openmicroscopy.ome.Shape#getFillRule()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_FillRule();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.Shape#getFontFamily <em>Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family</em>'.
	 * @see org.openmicroscopy.ome.Shape#getFontFamily()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_FontFamily();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.Shape#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see org.openmicroscopy.ome.Shape#getFontSize()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.Shape#getFontSizeUnit <em>Font Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size Unit</em>'.
	 * @see org.openmicroscopy.ome.Shape#getFontSizeUnit()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_FontSizeUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.Shape#getFontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Style</em>'.
	 * @see org.openmicroscopy.ome.Shape#getFontStyle()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_FontStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.Shape#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.Shape#getID()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.Shape#isLocked <em>Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locked</em>'.
	 * @see org.openmicroscopy.ome.Shape#isLocked()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Locked();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.Shape#getStrokeColor <em>Stroke Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Color</em>'.
	 * @see org.openmicroscopy.ome.Shape#getStrokeColor()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_StrokeColor();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.Shape#getStrokeDashArray <em>Stroke Dash Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dash Array</em>'.
	 * @see org.openmicroscopy.ome.Shape#getStrokeDashArray()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_StrokeDashArray();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.Shape#getStrokeWidth <em>Stroke Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Width</em>'.
	 * @see org.openmicroscopy.ome.Shape#getStrokeWidth()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_StrokeWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.Shape#getStrokeWidthUnit <em>Stroke Width Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Width Unit</em>'.
	 * @see org.openmicroscopy.ome.Shape#getStrokeWidthUnit()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_StrokeWidthUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.Shape#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.openmicroscopy.ome.Shape#getText()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.Shape#getTheC <em>The C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The C</em>'.
	 * @see org.openmicroscopy.ome.Shape#getTheC()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_TheC();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.Shape#getTheT <em>The T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The T</em>'.
	 * @see org.openmicroscopy.ome.Shape#getTheT()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_TheT();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.Shape#getTheZ <em>The Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The Z</em>'.
	 * @see org.openmicroscopy.ome.Shape#getTheZ()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_TheZ();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.StageLabelType <em>Stage Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage Label Type</em>'.
	 * @see org.openmicroscopy.ome.StageLabelType
	 * @generated
	 */
	EClass getStageLabelType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.StageLabelType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openmicroscopy.ome.StageLabelType#getName()
	 * @see #getStageLabelType()
	 * @generated
	 */
	EAttribute getStageLabelType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.StageLabelType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.openmicroscopy.ome.StageLabelType#getX()
	 * @see #getStageLabelType()
	 * @generated
	 */
	EAttribute getStageLabelType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.StageLabelType#getXUnit <em>XUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XUnit</em>'.
	 * @see org.openmicroscopy.ome.StageLabelType#getXUnit()
	 * @see #getStageLabelType()
	 * @generated
	 */
	EAttribute getStageLabelType_XUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.StageLabelType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.openmicroscopy.ome.StageLabelType#getY()
	 * @see #getStageLabelType()
	 * @generated
	 */
	EAttribute getStageLabelType_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.StageLabelType#getYUnit <em>YUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YUnit</em>'.
	 * @see org.openmicroscopy.ome.StageLabelType#getYUnit()
	 * @see #getStageLabelType()
	 * @generated
	 */
	EAttribute getStageLabelType_YUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.StageLabelType#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see org.openmicroscopy.ome.StageLabelType#getZ()
	 * @see #getStageLabelType()
	 * @generated
	 */
	EAttribute getStageLabelType_Z();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.StageLabelType#getZUnit <em>ZUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZUnit</em>'.
	 * @see org.openmicroscopy.ome.StageLabelType#getZUnit()
	 * @see #getStageLabelType()
	 * @generated
	 */
	EAttribute getStageLabelType_ZUnit();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.StructuredAnnotationsType <em>Structured Annotations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Annotations Type</em>'.
	 * @see org.openmicroscopy.ome.StructuredAnnotationsType
	 * @generated
	 */
	EClass getStructuredAnnotationsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openmicroscopy.ome.StructuredAnnotationsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openmicroscopy.ome.StructuredAnnotationsType#getGroup()
	 * @see #getStructuredAnnotationsType()
	 * @generated
	 */
	EAttribute getStructuredAnnotationsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.StructuredAnnotationsType#getXMLAnnotation <em>XML Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>XML Annotation</em>'.
	 * @see org.openmicroscopy.ome.StructuredAnnotationsType#getXMLAnnotation()
	 * @see #getStructuredAnnotationsType()
	 * @generated
	 */
	EReference getStructuredAnnotationsType_XMLAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.StructuredAnnotationsType#getFileAnnotation <em>File Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File Annotation</em>'.
	 * @see org.openmicroscopy.ome.StructuredAnnotationsType#getFileAnnotation()
	 * @see #getStructuredAnnotationsType()
	 * @generated
	 */
	EReference getStructuredAnnotationsType_FileAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.StructuredAnnotationsType#getListAnnotation <em>List Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Annotation</em>'.
	 * @see org.openmicroscopy.ome.StructuredAnnotationsType#getListAnnotation()
	 * @see #getStructuredAnnotationsType()
	 * @generated
	 */
	EReference getStructuredAnnotationsType_ListAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.StructuredAnnotationsType#getLongAnnotation <em>Long Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Long Annotation</em>'.
	 * @see org.openmicroscopy.ome.StructuredAnnotationsType#getLongAnnotation()
	 * @see #getStructuredAnnotationsType()
	 * @generated
	 */
	EReference getStructuredAnnotationsType_LongAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.StructuredAnnotationsType#getDoubleAnnotation <em>Double Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Double Annotation</em>'.
	 * @see org.openmicroscopy.ome.StructuredAnnotationsType#getDoubleAnnotation()
	 * @see #getStructuredAnnotationsType()
	 * @generated
	 */
	EReference getStructuredAnnotationsType_DoubleAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.StructuredAnnotationsType#getCommentAnnotation <em>Comment Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comment Annotation</em>'.
	 * @see org.openmicroscopy.ome.StructuredAnnotationsType#getCommentAnnotation()
	 * @see #getStructuredAnnotationsType()
	 * @generated
	 */
	EReference getStructuredAnnotationsType_CommentAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.StructuredAnnotationsType#getBooleanAnnotation <em>Boolean Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Annotation</em>'.
	 * @see org.openmicroscopy.ome.StructuredAnnotationsType#getBooleanAnnotation()
	 * @see #getStructuredAnnotationsType()
	 * @generated
	 */
	EReference getStructuredAnnotationsType_BooleanAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.StructuredAnnotationsType#getTimestampAnnotation <em>Timestamp Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timestamp Annotation</em>'.
	 * @see org.openmicroscopy.ome.StructuredAnnotationsType#getTimestampAnnotation()
	 * @see #getStructuredAnnotationsType()
	 * @generated
	 */
	EReference getStructuredAnnotationsType_TimestampAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.StructuredAnnotationsType#getTagAnnotation <em>Tag Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tag Annotation</em>'.
	 * @see org.openmicroscopy.ome.StructuredAnnotationsType#getTagAnnotation()
	 * @see #getStructuredAnnotationsType()
	 * @generated
	 */
	EReference getStructuredAnnotationsType_TagAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.StructuredAnnotationsType#getTermAnnotation <em>Term Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Term Annotation</em>'.
	 * @see org.openmicroscopy.ome.StructuredAnnotationsType#getTermAnnotation()
	 * @see #getStructuredAnnotationsType()
	 * @generated
	 */
	EReference getStructuredAnnotationsType_TermAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.StructuredAnnotationsType#getMapAnnotation <em>Map Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Annotation</em>'.
	 * @see org.openmicroscopy.ome.StructuredAnnotationsType#getMapAnnotation()
	 * @see #getStructuredAnnotationsType()
	 * @generated
	 */
	EReference getStructuredAnnotationsType_MapAnnotation();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.TagAnnotationType <em>Tag Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Annotation Type</em>'.
	 * @see org.openmicroscopy.ome.TagAnnotationType
	 * @generated
	 */
	EClass getTagAnnotationType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.TagAnnotationType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openmicroscopy.ome.TagAnnotationType#getValue()
	 * @see #getTagAnnotationType()
	 * @generated
	 */
	EAttribute getTagAnnotationType_Value();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.TermAnnotationType <em>Term Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Annotation Type</em>'.
	 * @see org.openmicroscopy.ome.TermAnnotationType
	 * @generated
	 */
	EClass getTermAnnotationType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.TermAnnotationType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openmicroscopy.ome.TermAnnotationType#getValue()
	 * @see #getTermAnnotationType()
	 * @generated
	 */
	EAttribute getTermAnnotationType_Value();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.TextAnnotation <em>Text Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Annotation</em>'.
	 * @see org.openmicroscopy.ome.TextAnnotation
	 * @generated
	 */
	EClass getTextAnnotation();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.TiffDataType <em>Tiff Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tiff Data Type</em>'.
	 * @see org.openmicroscopy.ome.TiffDataType
	 * @generated
	 */
	EClass getTiffDataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.TiffDataType#getUUID <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UUID</em>'.
	 * @see org.openmicroscopy.ome.TiffDataType#getUUID()
	 * @see #getTiffDataType()
	 * @generated
	 */
	EReference getTiffDataType_UUID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.TiffDataType#getFirstC <em>First C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First C</em>'.
	 * @see org.openmicroscopy.ome.TiffDataType#getFirstC()
	 * @see #getTiffDataType()
	 * @generated
	 */
	EAttribute getTiffDataType_FirstC();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.TiffDataType#getFirstT <em>First T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First T</em>'.
	 * @see org.openmicroscopy.ome.TiffDataType#getFirstT()
	 * @see #getTiffDataType()
	 * @generated
	 */
	EAttribute getTiffDataType_FirstT();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.TiffDataType#getFirstZ <em>First Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Z</em>'.
	 * @see org.openmicroscopy.ome.TiffDataType#getFirstZ()
	 * @see #getTiffDataType()
	 * @generated
	 */
	EAttribute getTiffDataType_FirstZ();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.TiffDataType#getIFD <em>IFD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IFD</em>'.
	 * @see org.openmicroscopy.ome.TiffDataType#getIFD()
	 * @see #getTiffDataType()
	 * @generated
	 */
	EAttribute getTiffDataType_IFD();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.TiffDataType#getPlaneCount <em>Plane Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plane Count</em>'.
	 * @see org.openmicroscopy.ome.TiffDataType#getPlaneCount()
	 * @see #getTiffDataType()
	 * @generated
	 */
	EAttribute getTiffDataType_PlaneCount();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.TimestampAnnotationType <em>Timestamp Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timestamp Annotation Type</em>'.
	 * @see org.openmicroscopy.ome.TimestampAnnotationType
	 * @generated
	 */
	EClass getTimestampAnnotationType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.TimestampAnnotationType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openmicroscopy.ome.TimestampAnnotationType#getValue()
	 * @see #getTimestampAnnotationType()
	 * @generated
	 */
	EAttribute getTimestampAnnotationType_Value();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.TransmittanceRangeType <em>Transmittance Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmittance Range Type</em>'.
	 * @see org.openmicroscopy.ome.TransmittanceRangeType
	 * @generated
	 */
	EClass getTransmittanceRangeType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutIn <em>Cut In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cut In</em>'.
	 * @see org.openmicroscopy.ome.TransmittanceRangeType#getCutIn()
	 * @see #getTransmittanceRangeType()
	 * @generated
	 */
	EAttribute getTransmittanceRangeType_CutIn();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutInTolerance <em>Cut In Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cut In Tolerance</em>'.
	 * @see org.openmicroscopy.ome.TransmittanceRangeType#getCutInTolerance()
	 * @see #getTransmittanceRangeType()
	 * @generated
	 */
	EAttribute getTransmittanceRangeType_CutInTolerance();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutInToleranceUnit <em>Cut In Tolerance Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cut In Tolerance Unit</em>'.
	 * @see org.openmicroscopy.ome.TransmittanceRangeType#getCutInToleranceUnit()
	 * @see #getTransmittanceRangeType()
	 * @generated
	 */
	EAttribute getTransmittanceRangeType_CutInToleranceUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutInUnit <em>Cut In Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cut In Unit</em>'.
	 * @see org.openmicroscopy.ome.TransmittanceRangeType#getCutInUnit()
	 * @see #getTransmittanceRangeType()
	 * @generated
	 */
	EAttribute getTransmittanceRangeType_CutInUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutOut <em>Cut Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cut Out</em>'.
	 * @see org.openmicroscopy.ome.TransmittanceRangeType#getCutOut()
	 * @see #getTransmittanceRangeType()
	 * @generated
	 */
	EAttribute getTransmittanceRangeType_CutOut();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutOutTolerance <em>Cut Out Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cut Out Tolerance</em>'.
	 * @see org.openmicroscopy.ome.TransmittanceRangeType#getCutOutTolerance()
	 * @see #getTransmittanceRangeType()
	 * @generated
	 */
	EAttribute getTransmittanceRangeType_CutOutTolerance();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutOutToleranceUnit <em>Cut Out Tolerance Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cut Out Tolerance Unit</em>'.
	 * @see org.openmicroscopy.ome.TransmittanceRangeType#getCutOutToleranceUnit()
	 * @see #getTransmittanceRangeType()
	 * @generated
	 */
	EAttribute getTransmittanceRangeType_CutOutToleranceUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutOutUnit <em>Cut Out Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cut Out Unit</em>'.
	 * @see org.openmicroscopy.ome.TransmittanceRangeType#getCutOutUnit()
	 * @see #getTransmittanceRangeType()
	 * @generated
	 */
	EAttribute getTransmittanceRangeType_CutOutUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.TransmittanceRangeType#getTransmittance <em>Transmittance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmittance</em>'.
	 * @see org.openmicroscopy.ome.TransmittanceRangeType#getTransmittance()
	 * @see #getTransmittanceRangeType()
	 * @generated
	 */
	EAttribute getTransmittanceRangeType_Transmittance();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.TypeAnnotation <em>Type Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Annotation</em>'.
	 * @see org.openmicroscopy.ome.TypeAnnotation
	 * @generated
	 */
	EClass getTypeAnnotation();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.UnionType <em>Union Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Type</em>'.
	 * @see org.openmicroscopy.ome.UnionType
	 * @generated
	 */
	EClass getUnionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openmicroscopy.ome.UnionType#getShapeGroupGroup <em>Shape Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Shape Group Group</em>'.
	 * @see org.openmicroscopy.ome.UnionType#getShapeGroupGroup()
	 * @see #getUnionType()
	 * @generated
	 */
	EAttribute getUnionType_ShapeGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.UnionType#getShapeGroup <em>Shape Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shape Group</em>'.
	 * @see org.openmicroscopy.ome.UnionType#getShapeGroup()
	 * @see #getUnionType()
	 * @generated
	 */
	EReference getUnionType_ShapeGroup();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.UUIDType <em>UUID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UUID Type</em>'.
	 * @see org.openmicroscopy.ome.UUIDType
	 * @generated
	 */
	EClass getUUIDType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.UUIDType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openmicroscopy.ome.UUIDType#getValue()
	 * @see #getUUIDType()
	 * @generated
	 */
	EAttribute getUUIDType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.UUIDType#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.openmicroscopy.ome.UUIDType#getFileName()
	 * @see #getUUIDType()
	 * @generated
	 */
	EAttribute getUUIDType_FileName();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see org.openmicroscopy.ome.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openmicroscopy.ome.ValueType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.openmicroscopy.ome.ValueType#getAny()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Any();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.WellSampleRefType <em>Well Sample Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Well Sample Ref Type</em>'.
	 * @see org.openmicroscopy.ome.WellSampleRefType
	 * @generated
	 */
	EClass getWellSampleRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.WellSampleRefType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.WellSampleRefType#getID()
	 * @see #getWellSampleRefType()
	 * @generated
	 */
	EAttribute getWellSampleRefType_ID();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.WellSampleType <em>Well Sample Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Well Sample Type</em>'.
	 * @see org.openmicroscopy.ome.WellSampleType
	 * @generated
	 */
	EClass getWellSampleType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.WellSampleType#getImageRef <em>Image Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Ref</em>'.
	 * @see org.openmicroscopy.ome.WellSampleType#getImageRef()
	 * @see #getWellSampleType()
	 * @generated
	 */
	EReference getWellSampleType_ImageRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.WellSampleType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.WellSampleType#getID()
	 * @see #getWellSampleType()
	 * @generated
	 */
	EAttribute getWellSampleType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.WellSampleType#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.openmicroscopy.ome.WellSampleType#getIndex()
	 * @see #getWellSampleType()
	 * @generated
	 */
	EAttribute getWellSampleType_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.WellSampleType#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see org.openmicroscopy.ome.WellSampleType#getPositionX()
	 * @see #getWellSampleType()
	 * @generated
	 */
	EAttribute getWellSampleType_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.WellSampleType#getPositionXUnit <em>Position XUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position XUnit</em>'.
	 * @see org.openmicroscopy.ome.WellSampleType#getPositionXUnit()
	 * @see #getWellSampleType()
	 * @generated
	 */
	EAttribute getWellSampleType_PositionXUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.WellSampleType#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see org.openmicroscopy.ome.WellSampleType#getPositionY()
	 * @see #getWellSampleType()
	 * @generated
	 */
	EAttribute getWellSampleType_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.WellSampleType#getPositionYUnit <em>Position YUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position YUnit</em>'.
	 * @see org.openmicroscopy.ome.WellSampleType#getPositionYUnit()
	 * @see #getWellSampleType()
	 * @generated
	 */
	EAttribute getWellSampleType_PositionYUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.WellSampleType#getTimepoint <em>Timepoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timepoint</em>'.
	 * @see org.openmicroscopy.ome.WellSampleType#getTimepoint()
	 * @see #getWellSampleType()
	 * @generated
	 */
	EAttribute getWellSampleType_Timepoint();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.WellType <em>Well Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Well Type</em>'.
	 * @see org.openmicroscopy.ome.WellType
	 * @generated
	 */
	EClass getWellType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.WellType#getWellSample <em>Well Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Well Sample</em>'.
	 * @see org.openmicroscopy.ome.WellType#getWellSample()
	 * @see #getWellType()
	 * @generated
	 */
	EReference getWellType_WellSample();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.WellType#getReagentRef <em>Reagent Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reagent Ref</em>'.
	 * @see org.openmicroscopy.ome.WellType#getReagentRef()
	 * @see #getWellType()
	 * @generated
	 */
	EReference getWellType_ReagentRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openmicroscopy.ome.WellType#getAnnotationRef <em>Annotation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Ref</em>'.
	 * @see org.openmicroscopy.ome.WellType#getAnnotationRef()
	 * @see #getWellType()
	 * @generated
	 */
	EReference getWellType_AnnotationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.WellType#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.openmicroscopy.ome.WellType#getColor()
	 * @see #getWellType()
	 * @generated
	 */
	EAttribute getWellType_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.WellType#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.openmicroscopy.ome.WellType#getColumn()
	 * @see #getWellType()
	 * @generated
	 */
	EAttribute getWellType_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.WellType#getExternalDescription <em>External Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Description</em>'.
	 * @see org.openmicroscopy.ome.WellType#getExternalDescription()
	 * @see #getWellType()
	 * @generated
	 */
	EAttribute getWellType_ExternalDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.WellType#getExternalIdentifier <em>External Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Identifier</em>'.
	 * @see org.openmicroscopy.ome.WellType#getExternalIdentifier()
	 * @see #getWellType()
	 * @generated
	 */
	EAttribute getWellType_ExternalIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.WellType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openmicroscopy.ome.WellType#getID()
	 * @see #getWellType()
	 * @generated
	 */
	EAttribute getWellType_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.WellType#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see org.openmicroscopy.ome.WellType#getRow()
	 * @see #getWellType()
	 * @generated
	 */
	EAttribute getWellType_Row();

	/**
	 * Returns the meta object for the attribute '{@link org.openmicroscopy.ome.WellType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openmicroscopy.ome.WellType#getType()
	 * @see #getWellType()
	 * @generated
	 */
	EAttribute getWellType_Type();

	/**
	 * Returns the meta object for class '{@link org.openmicroscopy.ome.XMLAnnotationType <em>XML Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Annotation Type</em>'.
	 * @see org.openmicroscopy.ome.XMLAnnotationType
	 * @generated
	 */
	EClass getXMLAnnotationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openmicroscopy.ome.XMLAnnotationType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.openmicroscopy.ome.XMLAnnotationType#getValue()
	 * @see #getXMLAnnotationType()
	 * @generated
	 */
	EReference getXMLAnnotationType_Value();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.AcquisitionModeType <em>Acquisition Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Acquisition Mode Type</em>'.
	 * @see org.openmicroscopy.ome.AcquisitionModeType
	 * @generated
	 */
	EEnum getAcquisitionModeType();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.Binning <em>Binning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binning</em>'.
	 * @see org.openmicroscopy.ome.Binning
	 * @generated
	 */
	EEnum getBinning();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.CompressionType <em>Compression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compression Type</em>'.
	 * @see org.openmicroscopy.ome.CompressionType
	 * @generated
	 */
	EEnum getCompressionType();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.CompressionType1 <em>Compression Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compression Type1</em>'.
	 * @see org.openmicroscopy.ome.CompressionType1
	 * @generated
	 */
	EEnum getCompressionType1();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.ContrastMethodType <em>Contrast Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contrast Method Type</em>'.
	 * @see org.openmicroscopy.ome.ContrastMethodType
	 * @generated
	 */
	EEnum getContrastMethodType();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.CorrectionType <em>Correction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Correction Type</em>'.
	 * @see org.openmicroscopy.ome.CorrectionType
	 * @generated
	 */
	EEnum getCorrectionType();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.DimensionOrderType <em>Dimension Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dimension Order Type</em>'.
	 * @see org.openmicroscopy.ome.DimensionOrderType
	 * @generated
	 */
	EEnum getDimensionOrderType();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.FillRuleType <em>Fill Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fill Rule Type</em>'.
	 * @see org.openmicroscopy.ome.FillRuleType
	 * @generated
	 */
	EEnum getFillRuleType();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.FontFamily <em>Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Family</em>'.
	 * @see org.openmicroscopy.ome.FontFamily
	 * @generated
	 */
	EEnum getFontFamily();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.FontFamilyType <em>Font Family Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Family Type</em>'.
	 * @see org.openmicroscopy.ome.FontFamilyType
	 * @generated
	 */
	EEnum getFontFamilyType();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.FontStyleType <em>Font Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Style Type</em>'.
	 * @see org.openmicroscopy.ome.FontStyleType
	 * @generated
	 */
	EEnum getFontStyleType();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.IlluminationTypeType <em>Illumination Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Illumination Type Type</em>'.
	 * @see org.openmicroscopy.ome.IlluminationTypeType
	 * @generated
	 */
	EEnum getIlluminationTypeType();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.ImmersionType <em>Immersion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immersion Type</em>'.
	 * @see org.openmicroscopy.ome.ImmersionType
	 * @generated
	 */
	EEnum getImmersionType();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.LaserMediumType <em>Laser Medium Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Laser Medium Type</em>'.
	 * @see org.openmicroscopy.ome.LaserMediumType
	 * @generated
	 */
	EEnum getLaserMediumType();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.Marker <em>Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Marker</em>'.
	 * @see org.openmicroscopy.ome.Marker
	 * @generated
	 */
	EEnum getMarker();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.MediumType <em>Medium Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medium Type</em>'.
	 * @see org.openmicroscopy.ome.MediumType
	 * @generated
	 */
	EEnum getMediumType();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.NamingConvention <em>Naming Convention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Naming Convention</em>'.
	 * @see org.openmicroscopy.ome.NamingConvention
	 * @generated
	 */
	EEnum getNamingConvention();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.PixelType <em>Pixel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pixel Type</em>'.
	 * @see org.openmicroscopy.ome.PixelType
	 * @generated
	 */
	EEnum getPixelType();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.PulseType <em>Pulse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pulse Type</em>'.
	 * @see org.openmicroscopy.ome.PulseType
	 * @generated
	 */
	EEnum getPulseType();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.TypeType2 <em>Type Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type2</em>'.
	 * @see org.openmicroscopy.ome.TypeType2
	 * @generated
	 */
	EEnum getTypeType2();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.TypeType3 <em>Type Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type3</em>'.
	 * @see org.openmicroscopy.ome.TypeType3
	 * @generated
	 */
	EEnum getTypeType3();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.TypeType4 <em>Type Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type4</em>'.
	 * @see org.openmicroscopy.ome.TypeType4
	 * @generated
	 */
	EEnum getTypeType4();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.TypeType5 <em>Type Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type5</em>'.
	 * @see org.openmicroscopy.ome.TypeType5
	 * @generated
	 */
	EEnum getTypeType5();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.TypeType6 <em>Type Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type6</em>'.
	 * @see org.openmicroscopy.ome.TypeType6
	 * @generated
	 */
	EEnum getTypeType6();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.TypeType7 <em>Type Type7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type7</em>'.
	 * @see org.openmicroscopy.ome.TypeType7
	 * @generated
	 */
	EEnum getTypeType7();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.TypeTypeItem <em>Type Type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type Item</em>'.
	 * @see org.openmicroscopy.ome.TypeTypeItem
	 * @generated
	 */
	EEnum getTypeTypeItem();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.TypeTypeItem1 <em>Type Type Item1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type Item1</em>'.
	 * @see org.openmicroscopy.ome.TypeTypeItem1
	 * @generated
	 */
	EEnum getTypeTypeItem1();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.UnitsAngle <em>Units Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Units Angle</em>'.
	 * @see org.openmicroscopy.ome.UnitsAngle
	 * @generated
	 */
	EEnum getUnitsAngle();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.UnitsElectricPotential <em>Units Electric Potential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Units Electric Potential</em>'.
	 * @see org.openmicroscopy.ome.UnitsElectricPotential
	 * @generated
	 */
	EEnum getUnitsElectricPotential();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.UnitsFrequency <em>Units Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Units Frequency</em>'.
	 * @see org.openmicroscopy.ome.UnitsFrequency
	 * @generated
	 */
	EEnum getUnitsFrequency();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.UnitsLength <em>Units Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Units Length</em>'.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @generated
	 */
	EEnum getUnitsLength();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.UnitsPower <em>Units Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Units Power</em>'.
	 * @see org.openmicroscopy.ome.UnitsPower
	 * @generated
	 */
	EEnum getUnitsPower();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.UnitsPressure <em>Units Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Units Pressure</em>'.
	 * @see org.openmicroscopy.ome.UnitsPressure
	 * @generated
	 */
	EEnum getUnitsPressure();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.UnitsTemperature <em>Units Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Units Temperature</em>'.
	 * @see org.openmicroscopy.ome.UnitsTemperature
	 * @generated
	 */
	EEnum getUnitsTemperature();

	/**
	 * Returns the meta object for enum '{@link org.openmicroscopy.ome.UnitsTime <em>Units Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Units Time</em>'.
	 * @see org.openmicroscopy.ome.UnitsTime
	 * @generated
	 */
	EEnum getUnitsTime();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.AcquisitionModeType <em>Acquisition Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Acquisition Mode Type Object</em>'.
	 * @see org.openmicroscopy.ome.AcquisitionModeType
	 * @model instanceClass="org.openmicroscopy.ome.AcquisitionModeType"
	 *        extendedMetaData="name='AcquisitionMode_._type:Object' baseType='AcquisitionMode_._type'"
	 * @generated
	 */
	EDataType getAcquisitionModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Annotation ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Annotation ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='AnnotationID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Annotation:\\S+)|(Annotation:\\S+)'"
	 * @generated
	 */
	EDataType getAnnotationID();

	/**
	 * Returns the meta object for data type '<em>Base64 Binary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Base64 Binary</em>'.
	 * @model instanceClass="byte[]"
	 *        extendedMetaData="name='base64Binary' baseType='http://www.eclipse.org/emf/2003/XMLType#base64Binary'"
	 * @generated
	 */
	EDataType getBase64Binary();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.Binning <em>Binning Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Binning Object</em>'.
	 * @see org.openmicroscopy.ome.Binning
	 * @model instanceClass="org.openmicroscopy.ome.Binning"
	 *        extendedMetaData="name='Binning:Object' baseType='Binning'"
	 * @generated
	 */
	EDataType getBinningObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Channel ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Channel ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ChannelID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Channel:\\S+)|(Channel:\\S+)'"
	 * @generated
	 */
	EDataType getChannelID();

	/**
	 * Returns the meta object for data type '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *         A simple type that identifies itself as a Color, the value is an integer between -2,147,483,648 and 2,147,483,647 (inclusive).
     *         The value is a signed 32 bit encoding of RGBA so "-1" is #FFFFFFFF or solid white.
     *         NOTE: Prior to the 2012-06 schema the default values were incorrect and produced a transparent red not solid white.
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Color</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='Color' baseType='http://www.eclipse.org/emf/2003/XMLType#int'"
	 * @generated
	 */
	EDataType getColor();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Color Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='Color:Object' baseType='Color'"
	 * @generated
	 */
	EDataType getColorObject();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.CompressionType <em>Compression Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Compression Type Object</em>'.
	 * @see org.openmicroscopy.ome.CompressionType
	 * @model instanceClass="org.openmicroscopy.ome.CompressionType"
	 *        extendedMetaData="name='Compression_._type:Object' baseType='Compression_._type'"
	 * @generated
	 */
	EDataType getCompressionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.CompressionType1 <em>Compression Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Compression Type Object1</em>'.
	 * @see org.openmicroscopy.ome.CompressionType1
	 * @model instanceClass="org.openmicroscopy.ome.CompressionType1"
	 *        extendedMetaData="name='Compression_._1_._type:Object' baseType='Compression_._1_._type'"
	 * @generated
	 */
	EDataType getCompressionTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.ContrastMethodType <em>Contrast Method Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Contrast Method Type Object</em>'.
	 * @see org.openmicroscopy.ome.ContrastMethodType
	 * @model instanceClass="org.openmicroscopy.ome.ContrastMethodType"
	 *        extendedMetaData="name='ContrastMethod_._type:Object' baseType='ContrastMethod_._type'"
	 * @generated
	 */
	EDataType getContrastMethodTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.CorrectionType <em>Correction Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Correction Type Object</em>'.
	 * @see org.openmicroscopy.ome.CorrectionType
	 * @model instanceClass="org.openmicroscopy.ome.CorrectionType"
	 *        extendedMetaData="name='Correction_._type:Object' baseType='Correction_._type'"
	 * @generated
	 */
	EDataType getCorrectionTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Dataset ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dataset ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='DatasetID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Dataset:\\S+)|(Dataset:\\S+)'"
	 * @generated
	 */
	EDataType getDatasetID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Description Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Description_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' whiteSpace='preserve'"
	 * @generated
	 */
	EDataType getDescriptionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Description Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Description Type1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Description_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' whiteSpace='preserve'"
	 * @generated
	 */
	EDataType getDescriptionType1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Description Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Description Type2</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Description_._2_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' whiteSpace='preserve'"
	 * @generated
	 */
	EDataType getDescriptionType2();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Description Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Description Type3</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Description_._3_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' whiteSpace='preserve'"
	 * @generated
	 */
	EDataType getDescriptionType3();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Description Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Description Type4</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Description_._4_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' whiteSpace='preserve'"
	 * @generated
	 */
	EDataType getDescriptionType4();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Description Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Description Type5</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Description_._5_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' whiteSpace='preserve'"
	 * @generated
	 */
	EDataType getDescriptionType5();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Description Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Description Type6</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Description_._6_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' whiteSpace='preserve'"
	 * @generated
	 */
	EDataType getDescriptionType6();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Description Type7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Description Type7</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Description_._7_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' whiteSpace='preserve'"
	 * @generated
	 */
	EDataType getDescriptionType7();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Description Type8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Description Type8</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Description_._8_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' whiteSpace='preserve'"
	 * @generated
	 */
	EDataType getDescriptionType8();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Description Type9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Description Type9</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Description_._9_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' whiteSpace='preserve'"
	 * @generated
	 */
	EDataType getDescriptionType9();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Description Type10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Description Type10</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Description_._10_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' whiteSpace='preserve'"
	 * @generated
	 */
	EDataType getDescriptionType10();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Description Type11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Description Type11</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Description_._11_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' whiteSpace='preserve'"
	 * @generated
	 */
	EDataType getDescriptionType11();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Description Type12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Description Type12</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Description_._12_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' whiteSpace='preserve'"
	 * @generated
	 */
	EDataType getDescriptionType12();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Detector ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Detector ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='DetectorID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Detector:\\S+)|(Detector:\\S+)'"
	 * @generated
	 */
	EDataType getDetectorID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Dichroic ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dichroic ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='DichroicID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Dichroic:\\S+)|(Dichroic:\\S+)'"
	 * @generated
	 */
	EDataType getDichroicID();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.DimensionOrderType <em>Dimension Order Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dimension Order Type Object</em>'.
	 * @see org.openmicroscopy.ome.DimensionOrderType
	 * @model instanceClass="org.openmicroscopy.ome.DimensionOrderType"
	 *        extendedMetaData="name='DimensionOrder_._type:Object' baseType='DimensionOrder_._type'"
	 * @generated
	 */
	EDataType getDimensionOrderTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Experimenter Group ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Experimenter Group ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ExperimenterGroupID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:ExperimenterGroup:\\S+)|(ExperimenterGroup:\\S+)'"
	 * @generated
	 */
	EDataType getExperimenterGroupID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Experimenter ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Experimenter ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ExperimenterID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Experimenter:\\S+)|(Experimenter:\\S+)'"
	 * @generated
	 */
	EDataType getExperimenterID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Experiment ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Experiment ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ExperimentID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Experiment:\\S+)|(Experiment:\\S+)'"
	 * @generated
	 */
	EDataType getExperimentID();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.FillRuleType <em>Fill Rule Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fill Rule Type Object</em>'.
	 * @see org.openmicroscopy.ome.FillRuleType
	 * @model instanceClass="org.openmicroscopy.ome.FillRuleType"
	 *        extendedMetaData="name='FillRule_._type:Object' baseType='FillRule_._type'"
	 * @generated
	 */
	EDataType getFillRuleTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Filter ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Filter ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='FilterID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Filter:\\S+)|(Filter:\\S+)'"
	 * @generated
	 */
	EDataType getFilterID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Filter Set ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Filter Set ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='FilterSetID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:FilterSet:\\S+)|(FilterSet:\\S+)'"
	 * @generated
	 */
	EDataType getFilterSetID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Folder ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Folder ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='FolderID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Folder:\\S+)|(Folder:\\S+)'"
	 * @generated
	 */
	EDataType getFolderID();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.FontFamily <em>Font Family Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Font Family Object</em>'.
	 * @see org.openmicroscopy.ome.FontFamily
	 * @model instanceClass="org.openmicroscopy.ome.FontFamily"
	 *        extendedMetaData="name='FontFamily:Object' baseType='FontFamily'"
	 * @generated
	 */
	EDataType getFontFamilyObject();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.FontFamilyType <em>Font Family Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Font Family Type Object</em>'.
	 * @see org.openmicroscopy.ome.FontFamilyType
	 * @model instanceClass="org.openmicroscopy.ome.FontFamilyType"
	 *        extendedMetaData="name='FontFamily_._type:Object' baseType='FontFamily_._type'"
	 * @generated
	 */
	EDataType getFontFamilyTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.FontStyleType <em>Font Style Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Font Style Type Object</em>'.
	 * @see org.openmicroscopy.ome.FontStyleType
	 * @model instanceClass="org.openmicroscopy.ome.FontStyleType"
	 *        extendedMetaData="name='FontStyle_._type:Object' baseType='FontStyle_._type'"
	 * @generated
	 */
	EDataType getFontStyleTypeObject();

	/**
	 * Returns the meta object for data type '<em>Hex40</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *         Binary contents coded in hexadecimal (20 characters long)
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Hex40</em>'.
	 * @model instanceClass="byte[]"
	 *        extendedMetaData="name='Hex40' baseType='http://www.eclipse.org/emf/2003/XMLType#hexBinary' length='20'"
	 * @generated
	 */
	EDataType getHex40();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.IlluminationTypeType <em>Illumination Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Illumination Type Type Object</em>'.
	 * @see org.openmicroscopy.ome.IlluminationTypeType
	 * @model instanceClass="org.openmicroscopy.ome.IlluminationTypeType"
	 *        extendedMetaData="name='IlluminationType_._type:Object' baseType='IlluminationType_._type'"
	 * @generated
	 */
	EDataType getIlluminationTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Image ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Image ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ImageID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Image:\\S+)|(Image:\\S+)'"
	 * @generated
	 */
	EDataType getImageID();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.ImmersionType <em>Immersion Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Immersion Type Object</em>'.
	 * @see org.openmicroscopy.ome.ImmersionType
	 * @model instanceClass="org.openmicroscopy.ome.ImmersionType"
	 *        extendedMetaData="name='Immersion_._type:Object' baseType='Immersion_._type'"
	 * @generated
	 */
	EDataType getImmersionTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Instrument ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Instrument ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='InstrumentID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Instrument:\\S+)|(Instrument:\\S+)'"
	 * @generated
	 */
	EDataType getInstrumentID();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.LaserMediumType <em>Laser Medium Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Laser Medium Type Object</em>'.
	 * @see org.openmicroscopy.ome.LaserMediumType
	 * @model instanceClass="org.openmicroscopy.ome.LaserMediumType"
	 *        extendedMetaData="name='LaserMedium_._type:Object' baseType='LaserMedium_._type'"
	 * @generated
	 */
	EDataType getLaserMediumTypeObject();

	/**
	 * Returns the meta object for data type '<em>Length Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Length Type</em>'.
	 * @model instanceClass="long"
	 *        extendedMetaData="name='Length_._type' baseType='NonNegativeLong'"
	 * @generated
	 */
	EDataType getLengthType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Length Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Length Type Object</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        extendedMetaData="name='Length_._type:Object' baseType='Length_._type'"
	 * @generated
	 */
	EDataType getLengthTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Light Source ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Light Source ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='LightSourceID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:LightSource:\\S+)|(LightSource:\\S+)'"
	 * @generated
	 */
	EDataType getLightSourceID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>LSID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *         Either LSID or internal consistent IDs for the file
     *         See: http://www.openmicroscopy.org/site/support/file-formats/working-with-ome-xml/id-and-lsid
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>LSID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='LSID' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)'"
	 * @generated
	 */
	EDataType getLSID();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.Marker <em>Marker Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Marker Object</em>'.
	 * @see org.openmicroscopy.ome.Marker
	 * @model instanceClass="org.openmicroscopy.ome.Marker"
	 *        extendedMetaData="name='Marker:Object' baseType='Marker'"
	 * @generated
	 */
	EDataType getMarkerObject();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.MediumType <em>Medium Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Medium Type Object</em>'.
	 * @see org.openmicroscopy.ome.MediumType
	 * @model instanceClass="org.openmicroscopy.ome.MediumType"
	 *        extendedMetaData="name='Medium_._type:Object' baseType='Medium_._type'"
	 * @generated
	 */
	EDataType getMediumTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Microbeam Manipulation ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Microbeam Manipulation ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MicrobeamManipulationID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:MicrobeamManipulation:\\S+)|(MicrobeamManipulation:\\S+)'"
	 * @generated
	 */
	EDataType getMicrobeamManipulationID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Module ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Module ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ModuleID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Module:\\S+)|(Module:\\S+)'"
	 * @generated
	 */
	EDataType getModuleID();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.NamingConvention <em>Naming Convention Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Naming Convention Object</em>'.
	 * @see org.openmicroscopy.ome.NamingConvention
	 * @model instanceClass="org.openmicroscopy.ome.NamingConvention"
	 *        extendedMetaData="name='NamingConvention:Object' baseType='NamingConvention'"
	 * @generated
	 */
	EDataType getNamingConventionObject();

	/**
	 * Returns the meta object for data type '<em>Non Negative Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *         A simple type that restricts the value to a float between >=0 and max 32-bit float {i.e. (2−2^-23) × 2^27 ≈ 3.4 × 10^38}
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Non Negative Float</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='NonNegativeFloat' baseType='http://www.eclipse.org/emf/2003/XMLType#float' minInclusive='0'"
	 * @generated
	 */
	EDataType getNonNegativeFloat();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Non Negative Float Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Non Negative Float Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='NonNegativeFloat:Object' baseType='NonNegativeFloat'"
	 * @generated
	 */
	EDataType getNonNegativeFloatObject();

	/**
	 * Returns the meta object for data type '<em>Non Negative Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *         A simple type that restricts the value to an integer between 0 and 2,147,483,647 (inclusive).
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Non Negative Int</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='NonNegativeInt' baseType='http://www.eclipse.org/emf/2003/XMLType#int' minInclusive='0'"
	 * @generated
	 */
	EDataType getNonNegativeInt();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Non Negative Int Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Non Negative Int Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='NonNegativeInt:Object' baseType='NonNegativeInt'"
	 * @generated
	 */
	EDataType getNonNegativeIntObject();

	/**
	 * Returns the meta object for data type '<em>Non Negative Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *         A simple type that restricts the value to a long between 0 and 9223372036854775807 (inclusive).
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Non Negative Long</em>'.
	 * @model instanceClass="long"
	 *        extendedMetaData="name='NonNegativeLong' baseType='http://www.eclipse.org/emf/2003/XMLType#long' minInclusive='0'"
	 * @generated
	 */
	EDataType getNonNegativeLong();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Non Negative Long Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Non Negative Long Object</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        extendedMetaData="name='NonNegativeLong:Object' baseType='NonNegativeLong'"
	 * @generated
	 */
	EDataType getNonNegativeLongObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Objective ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Objective ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ObjectiveID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Objective:\\S+)|(Objective:\\S+)'"
	 * @generated
	 */
	EDataType getObjectiveID();

	/**
	 * Returns the meta object for data type '<em>Percent Fraction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *         A simple type that restricts the value to a float between 0 and 1 (inclusive).
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Percent Fraction</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='PercentFraction' baseType='http://www.eclipse.org/emf/2003/XMLType#float' maxInclusive='1.0' minInclusive='0.0'"
	 * @generated
	 */
	EDataType getPercentFraction();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Percent Fraction Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Percent Fraction Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='PercentFraction:Object' baseType='PercentFraction'"
	 * @generated
	 */
	EDataType getPercentFractionObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Pixels ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pixels ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PixelsID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Pixels:\\S+)|(Pixels:\\S+)'"
	 * @generated
	 */
	EDataType getPixelsID();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.PixelType <em>Pixel Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pixel Type Object</em>'.
	 * @see org.openmicroscopy.ome.PixelType
	 * @model instanceClass="org.openmicroscopy.ome.PixelType"
	 *        extendedMetaData="name='PixelType:Object' baseType='PixelType'"
	 * @generated
	 */
	EDataType getPixelTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Plate Acquisition ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Plate Acquisition ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PlateAcquisitionID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:PlateAcquisition:\\S+)|(PlateAcquisition:\\S+)'"
	 * @generated
	 */
	EDataType getPlateAcquisitionID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Plate ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Plate ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PlateID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Plate:\\S+)|(Plate:\\S+)'"
	 * @generated
	 */
	EDataType getPlateID();

	/**
	 * Returns the meta object for data type '<em>Positive Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *         A simple type that restricts the value to a float between >0 and max 32-bit float {i.e. (2−2^-23) × 2^27 ≈ 3.4 × 10^38}
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Positive Float</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='PositiveFloat' baseType='http://www.eclipse.org/emf/2003/XMLType#float' minExclusive='0.0'"
	 * @generated
	 */
	EDataType getPositiveFloat();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Positive Float Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positive Float Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='PositiveFloat:Object' baseType='PositiveFloat'"
	 * @generated
	 */
	EDataType getPositiveFloatObject();

	/**
	 * Returns the meta object for data type '<em>Positive Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *         A simple type that restricts the value to an integer between 1 and 2,147,483,647 (inclusive).
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Positive Int</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='PositiveInt' baseType='http://www.eclipse.org/emf/2003/XMLType#int' minInclusive='1'"
	 * @generated
	 */
	EDataType getPositiveInt();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Positive Int Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positive Int Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='PositiveInt:Object' baseType='PositiveInt'"
	 * @generated
	 */
	EDataType getPositiveIntObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Project ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Project ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ProjectID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Project:\\S+)|(Project:\\S+)'"
	 * @generated
	 */
	EDataType getProjectID();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.PulseType <em>Pulse Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pulse Type Object</em>'.
	 * @see org.openmicroscopy.ome.PulseType
	 * @model instanceClass="org.openmicroscopy.ome.PulseType"
	 *        extendedMetaData="name='Pulse_._type:Object' baseType='Pulse_._type'"
	 * @generated
	 */
	EDataType getPulseTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Reagent ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reagent ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ReagentID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Reagent:\\S+)|(Reagent:\\S+)'"
	 * @generated
	 */
	EDataType getReagentID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Rights Held Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rights Held Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='RightsHeld_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' whiteSpace='preserve'"
	 * @generated
	 */
	EDataType getRightsHeldType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Rights Holder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rights Holder Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='RightsHolder_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' whiteSpace='preserve'"
	 * @generated
	 */
	EDataType getRightsHolderType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>ROIID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ROIID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ROIID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+)|(\\S+)'"
	 * @generated
	 */
	EDataType getROIID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Screen ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Screen ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ScreenID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Screen:\\S+)|(Screen:\\S+)'"
	 * @generated
	 */
	EDataType getScreenID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Shape ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Shape ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ShapeID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Shape:\\S+)|(Shape:\\S+)'"
	 * @generated
	 */
	EDataType getShapeID();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='Type_._type' itemType='Type_._type_._item'"
	 * @generated
	 */
	EDataType getTypeType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type1</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='Type_._1_._type' itemType='Type_._1_._type_._item'"
	 * @generated
	 */
	EDataType getTypeType1();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.TypeTypeItem <em>Type Type Item Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Item Object</em>'.
	 * @see org.openmicroscopy.ome.TypeTypeItem
	 * @model instanceClass="org.openmicroscopy.ome.TypeTypeItem"
	 *        extendedMetaData="name='Type_._1_._type_._item:Object' baseType='Type_._1_._type_._item'"
	 * @generated
	 */
	EDataType getTypeTypeItemObject();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.TypeTypeItem1 <em>Type Type Item Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Item Object1</em>'.
	 * @see org.openmicroscopy.ome.TypeTypeItem1
	 * @model instanceClass="org.openmicroscopy.ome.TypeTypeItem1"
	 *        extendedMetaData="name='Type_._type_._item:Object' baseType='Type_._type_._item'"
	 * @generated
	 */
	EDataType getTypeTypeItemObject1();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.TypeType4 <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see org.openmicroscopy.ome.TypeType4
	 * @model instanceClass="org.openmicroscopy.ome.TypeType4"
	 *        extendedMetaData="name='Type_._4_._type:Object' baseType='Type_._4_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.TypeType5 <em>Type Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object1</em>'.
	 * @see org.openmicroscopy.ome.TypeType5
	 * @model instanceClass="org.openmicroscopy.ome.TypeType5"
	 *        extendedMetaData="name='Type_._5_._type:Object' baseType='Type_._5_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.TypeType6 <em>Type Type Object2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object2</em>'.
	 * @see org.openmicroscopy.ome.TypeType6
	 * @model instanceClass="org.openmicroscopy.ome.TypeType6"
	 *        extendedMetaData="name='Type_._6_._type:Object' baseType='Type_._6_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject2();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.TypeType3 <em>Type Type Object3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object3</em>'.
	 * @see org.openmicroscopy.ome.TypeType3
	 * @model instanceClass="org.openmicroscopy.ome.TypeType3"
	 *        extendedMetaData="name='Type_._3_._type:Object' baseType='Type_._3_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject3();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.TypeType2 <em>Type Type Object4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object4</em>'.
	 * @see org.openmicroscopy.ome.TypeType2
	 * @model instanceClass="org.openmicroscopy.ome.TypeType2"
	 *        extendedMetaData="name='Type_._2_._type:Object' baseType='Type_._2_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject4();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.TypeType7 <em>Type Type Object5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object5</em>'.
	 * @see org.openmicroscopy.ome.TypeType7
	 * @model instanceClass="org.openmicroscopy.ome.TypeType7"
	 *        extendedMetaData="name='Type_._7_._type:Object' baseType='Type_._7_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject5();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.UnitsAngle <em>Units Angle Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Units Angle Object</em>'.
	 * @see org.openmicroscopy.ome.UnitsAngle
	 * @model instanceClass="org.openmicroscopy.ome.UnitsAngle"
	 *        extendedMetaData="name='UnitsAngle:Object' baseType='UnitsAngle'"
	 * @generated
	 */
	EDataType getUnitsAngleObject();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.UnitsElectricPotential <em>Units Electric Potential Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Units Electric Potential Object</em>'.
	 * @see org.openmicroscopy.ome.UnitsElectricPotential
	 * @model instanceClass="org.openmicroscopy.ome.UnitsElectricPotential"
	 *        extendedMetaData="name='UnitsElectricPotential:Object' baseType='UnitsElectricPotential'"
	 * @generated
	 */
	EDataType getUnitsElectricPotentialObject();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.UnitsFrequency <em>Units Frequency Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Units Frequency Object</em>'.
	 * @see org.openmicroscopy.ome.UnitsFrequency
	 * @model instanceClass="org.openmicroscopy.ome.UnitsFrequency"
	 *        extendedMetaData="name='UnitsFrequency:Object' baseType='UnitsFrequency'"
	 * @generated
	 */
	EDataType getUnitsFrequencyObject();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.UnitsLength <em>Units Length Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Units Length Object</em>'.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @model instanceClass="org.openmicroscopy.ome.UnitsLength"
	 *        extendedMetaData="name='UnitsLength:Object' baseType='UnitsLength'"
	 * @generated
	 */
	EDataType getUnitsLengthObject();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.UnitsPower <em>Units Power Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Units Power Object</em>'.
	 * @see org.openmicroscopy.ome.UnitsPower
	 * @model instanceClass="org.openmicroscopy.ome.UnitsPower"
	 *        extendedMetaData="name='UnitsPower:Object' baseType='UnitsPower'"
	 * @generated
	 */
	EDataType getUnitsPowerObject();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.UnitsPressure <em>Units Pressure Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Units Pressure Object</em>'.
	 * @see org.openmicroscopy.ome.UnitsPressure
	 * @model instanceClass="org.openmicroscopy.ome.UnitsPressure"
	 *        extendedMetaData="name='UnitsPressure:Object' baseType='UnitsPressure'"
	 * @generated
	 */
	EDataType getUnitsPressureObject();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.UnitsTemperature <em>Units Temperature Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Units Temperature Object</em>'.
	 * @see org.openmicroscopy.ome.UnitsTemperature
	 * @model instanceClass="org.openmicroscopy.ome.UnitsTemperature"
	 *        extendedMetaData="name='UnitsTemperature:Object' baseType='UnitsTemperature'"
	 * @generated
	 */
	EDataType getUnitsTemperatureObject();

	/**
	 * Returns the meta object for data type '{@link org.openmicroscopy.ome.UnitsTime <em>Units Time Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Units Time Object</em>'.
	 * @see org.openmicroscopy.ome.UnitsTime
	 * @model instanceClass="org.openmicroscopy.ome.UnitsTime"
	 *        extendedMetaData="name='UnitsTime:Object' baseType='UnitsTime'"
	 * @generated
	 */
	EDataType getUnitsTimeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Universally Unique Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *         This is a unique ID for the file but does not conform to the ID pattern used in the rest of the file.
     *         The rest of the IDs are either an full LSID or an internal ID which is a string that is simply unique in this file.
     *         As the UniversallyUniqueIdentifier is used from outside this file to identify it having the same ID in another file could cause problems.
     *         A UUID is 32 hexadecimal digits, in 5 groups, 8-4-4-4-12, separated by hyphens
     *         e.g. urn:uuid:3e450fae-b8f2-4d35-aa54-702168b2487f
     *         There are methods to generate these in most modern languages.
     *         http://www.ietf.org/rfc/rfc4122.txt
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Universally Unique Identifier</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='UniversallyUniqueIdentifier' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI' pattern='(urn:uuid:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})'"
	 * @generated
	 */
	EDataType getUniversallyUniqueIdentifier();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Well ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Well ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='WellID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Well:\\S+)|(Well:\\S+)'"
	 * @generated
	 */
	EDataType getWellID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Well Sample ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Well Sample ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='WellSampleID' baseType='LSID' pattern='(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:WellSample:\\S+)|(WellSample:\\S+)'"
	 * @generated
	 */
	EDataType getWellSampleID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OMEFactory getOMEFactory();

} //OMEPackage
