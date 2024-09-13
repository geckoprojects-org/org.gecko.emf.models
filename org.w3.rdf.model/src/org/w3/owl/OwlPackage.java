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
package org.w3.owl;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.uml2.uml.UMLPackage;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

import org.w3.rdf.RdfPackage;

import org.w3.rdfs.RdfsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This library models the elements in the OWL namespace, http://www.w3.org/2002/07/owl.rdf, for use in vocabulary and ontology development.
 * <!-- end-model-doc -->
 * @see org.w3.owl.OwlFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = OwlPackage.eNS_URI, genModel = "/model/rdf.genmodel", genModelSourceLocations = {"model/rdf.genmodel","org.w3.rdf.model/model/rdf.genmodel"}, ecore="/model/owl.ecore", ecoreSourceLocations="/model/owl.ecore")
public interface OwlPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "owl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/2002/07/owl#";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "owl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OwlPackage eINSTANCE = org.w3.owl.impl.OwlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.TypedThingImpl <em>Typed Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.TypedThingImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getTypedThing()
	 * @generated
	 */
	int TYPED_THING = 2;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_THING__RDF_COMMENT = RdfsPackage.RDF_RESOURCE__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_THING__IS_DEFINED_BY = RdfsPackage.RDF_RESOURCE__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_THING__SEE_ALSO = RdfsPackage.RDF_RESOURCE__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_THING__RDF_MEMBERS = RdfsPackage.RDF_RESOURCE__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_THING__RDF_LABEL = RdfsPackage.RDF_RESOURCE__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_THING__RDF_TYPE = RdfsPackage.RDF_RESOURCE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_THING__RDF_VALUE = RdfsPackage.RDF_RESOURCE__RDF_VALUE;

	/**
	 * The number of structural features of the '<em>Typed Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_THING_FEATURE_COUNT = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.ThingImpl <em>Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.ThingImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getThing()
	 * @generated
	 */
	int THING = 1;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__RDF_COMMENT = TYPED_THING__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__IS_DEFINED_BY = TYPED_THING__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__SEE_ALSO = TYPED_THING__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__RDF_MEMBERS = TYPED_THING__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__RDF_LABEL = TYPED_THING__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__RDF_TYPE = TYPED_THING__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__RDF_VALUE = TYPED_THING__RDF_VALUE;

	/**
	 * The number of structural features of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_FEATURE_COUNT = TYPED_THING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.NothingImpl <em>Nothing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.NothingImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getNothing()
	 * @generated
	 */
	int NOTHING = 0;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTHING__RDF_COMMENT = THING__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTHING__IS_DEFINED_BY = THING__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTHING__SEE_ALSO = THING__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTHING__RDF_MEMBERS = THING__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTHING__RDF_LABEL = THING__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTHING__RDF_TYPE = THING__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTHING__RDF_VALUE = THING__RDF_VALUE;

	/**
	 * The number of structural features of the '<em>Nothing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTHING_FEATURE_COUNT = THING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.AnnotationImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__RDF_COMMENT = RdfsPackage.RDF_RESOURCE__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__IS_DEFINED_BY = RdfsPackage.RDF_RESOURCE__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__SEE_ALSO = RdfsPackage.RDF_RESOURCE__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__RDF_MEMBERS = RdfsPackage.RDF_RESOURCE__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__RDF_LABEL = RdfsPackage.RDF_RESOURCE__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__RDF_TYPE = RdfsPackage.RDF_RESOURCE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__RDF_VALUE = RdfsPackage.RDF_RESOURCE__RDF_VALUE;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.DataRangeImpl <em>Data Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.DataRangeImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getDataRange()
	 * @generated
	 */
	int DATA_RANGE = 4;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__RDF_COMMENT = RdfsPackage.RDF_DATATYPE__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__IS_DEFINED_BY = RdfsPackage.RDF_DATATYPE__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__SEE_ALSO = RdfsPackage.RDF_DATATYPE__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__RDF_MEMBERS = RdfsPackage.RDF_DATATYPE__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__RDF_LABEL = RdfsPackage.RDF_DATATYPE__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__RDF_TYPE = RdfsPackage.RDF_DATATYPE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__RDF_VALUE = RdfsPackage.RDF_DATATYPE__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__SUB_CLASS_OF = RdfsPackage.RDF_DATATYPE__SUB_CLASS_OF;

	/**
	 * The number of structural features of the '<em>Data Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_FEATURE_COUNT = RdfsPackage.RDF_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.ObjectPropertyImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getObjectProperty()
	 * @generated
	 */
	int OBJECT_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__RDF_COMMENT = RdfsPackage.RDF_DATATYPE__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__IS_DEFINED_BY = RdfsPackage.RDF_DATATYPE__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__SEE_ALSO = RdfsPackage.RDF_DATATYPE__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__RDF_MEMBERS = RdfsPackage.RDF_DATATYPE__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__RDF_LABEL = RdfsPackage.RDF_DATATYPE__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__RDF_TYPE = RdfsPackage.RDF_DATATYPE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__RDF_VALUE = RdfsPackage.RDF_DATATYPE__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__SUB_CLASS_OF = RdfsPackage.RDF_DATATYPE__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Property Chain Axiom</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__PROPERTY_CHAIN_AXIOM = RdfsPackage.RDF_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_FEATURE_COUNT = RdfsPackage.RDF_DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.IndividualImpl <em>Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.IndividualImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getIndividual()
	 * @generated
	 */
	int INDIVIDUAL = 7;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__RDF_COMMENT = THING__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__IS_DEFINED_BY = THING__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__SEE_ALSO = THING__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__RDF_MEMBERS = THING__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__RDF_LABEL = THING__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__RDF_TYPE = THING__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__RDF_VALUE = THING__RDF_VALUE;

	/**
	 * The number of structural features of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_FEATURE_COUNT = THING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.NamedIndividualImpl <em>Named Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.NamedIndividualImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getNamedIndividual()
	 * @generated
	 */
	int NAMED_INDIVIDUAL = 6;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL__RDF_COMMENT = INDIVIDUAL__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL__IS_DEFINED_BY = INDIVIDUAL__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL__SEE_ALSO = INDIVIDUAL__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL__RDF_MEMBERS = INDIVIDUAL__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL__RDF_LABEL = INDIVIDUAL__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL__RDF_TYPE = INDIVIDUAL__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL__RDF_VALUE = INDIVIDUAL__RDF_VALUE;

	/**
	 * The number of structural features of the '<em>Named Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_FEATURE_COUNT = INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.realImpl <em>real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.realImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getreal()
	 * @generated
	 */
	int REAL = 8;

	/**
	 * The feature id for the '<em><b>Text Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__TEXT_VALUE = RdfsPackage.RDF_LITERAL__TEXT_VALUE;

	/**
	 * The number of structural features of the '<em>real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FEATURE_COUNT = RdfsPackage.RDF_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.OntologyPropertyImpl <em>Ontology Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.OntologyPropertyImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getOntologyProperty()
	 * @generated
	 */
	int ONTOLOGY_PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_PROPERTY__RDF_COMMENT = RdfPackage.RDF_PROPERTY__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_PROPERTY__IS_DEFINED_BY = RdfPackage.RDF_PROPERTY__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_PROPERTY__SEE_ALSO = RdfPackage.RDF_PROPERTY__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_PROPERTY__RDF_MEMBERS = RdfPackage.RDF_PROPERTY__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_PROPERTY__RDF_LABEL = RdfPackage.RDF_PROPERTY__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_PROPERTY__RDF_TYPE = RdfPackage.RDF_PROPERTY__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_PROPERTY__RDF_VALUE = RdfPackage.RDF_PROPERTY__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_PROPERTY__DOMAIN = RdfPackage.RDF_PROPERTY__DOMAIN;

	/**
	 * The feature id for the '<em><b>Sub Property Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_PROPERTY__SUB_PROPERTY_OF = RdfPackage.RDF_PROPERTY__SUB_PROPERTY_OF;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_PROPERTY__RANGE = RdfPackage.RDF_PROPERTY__RANGE;

	/**
	 * The number of structural features of the '<em>Ontology Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_PROPERTY_FEATURE_COUNT = RdfPackage.RDF_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.TypeImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 11;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__EANNOTATIONS = UMLPackage.CLASS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_COMMENT = UMLPackage.CLASS__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_ELEMENT = UMLPackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNER = UMLPackage.CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CLIENT_DEPENDENCY = UMLPackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = UMLPackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME_EXPRESSION = UMLPackage.CLASS__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAMESPACE = UMLPackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__QUALIFIED_NAME = UMLPackage.CLASS__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__VISIBILITY = UMLPackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_RULE = UMLPackage.CLASS__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ELEMENT_IMPORT = UMLPackage.CLASS__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PACKAGE_IMPORT = UMLPackage.CLASS__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_MEMBER = UMLPackage.CLASS__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__IMPORTED_MEMBER = UMLPackage.CLASS__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__MEMBER = UMLPackage.CLASS__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__IS_LEAF = UMLPackage.CLASS__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__REDEFINED_ELEMENT = UMLPackage.CLASS__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__REDEFINITION_CONTEXT = UMLPackage.CLASS__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNING_TEMPLATE_PARAMETER = UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TEMPLATE_PARAMETER = UMLPackage.CLASS__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PACKAGE = UMLPackage.CLASS__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TEMPLATE_BINDING = UMLPackage.CLASS__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_TEMPLATE_SIGNATURE = UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__FEATURE = UMLPackage.CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ATTRIBUTE = UMLPackage.CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__COLLABORATION_USE = UMLPackage.CLASS__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__GENERAL = UMLPackage.CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__GENERALIZATION = UMLPackage.CLASS__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__POWERTYPE_EXTENT = UMLPackage.CLASS__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__INHERITED_MEMBER = UMLPackage.CLASS__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__IS_ABSTRACT = UMLPackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__IS_FINAL_SPECIALIZATION = UMLPackage.CLASS__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_USE_CASE = UMLPackage.CLASS__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__USE_CASE = UMLPackage.CLASS__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__REDEFINED_CLASSIFIER = UMLPackage.CLASS__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__REPRESENTATION = UMLPackage.CLASS__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SUBSTITUTION = UMLPackage.CLASS__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_ATTRIBUTE = UMLPackage.CLASS__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_CONNECTOR = UMLPackage.CLASS__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PART = UMLPackage.CLASS__PART;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ROLE = UMLPackage.CLASS__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_PORT = UMLPackage.CLASS__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CLASSIFIER_BEHAVIOR = UMLPackage.CLASS__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__INTERFACE_REALIZATION = UMLPackage.CLASS__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_BEHAVIOR = UMLPackage.CLASS__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_OPERATION = UMLPackage.CLASS__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__EXTENSION = UMLPackage.CLASS__EXTENSION;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__IS_ACTIVE = UMLPackage.CLASS__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NESTED_CLASSIFIER = UMLPackage.CLASS__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_RECEPTION = UMLPackage.CLASS__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SUPER_CLASS = UMLPackage.CLASS__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Union Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DISJOINT_UNION_OF = UMLPackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = UMLPackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.ClassImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 10;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EANNOTATIONS = TYPE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_COMMENT = TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_ELEMENT = TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNER = TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLIENT_DEPENDENCY = TYPE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME_EXPRESSION = TYPE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAMESPACE = TYPE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__QUALIFIED_NAME = TYPE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__VISIBILITY = TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_RULE = TYPE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ELEMENT_IMPORT = TYPE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PACKAGE_IMPORT = TYPE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_MEMBER = TYPE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IMPORTED_MEMBER = TYPE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MEMBER = TYPE__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_LEAF = TYPE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__REDEFINED_ELEMENT = TYPE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__REDEFINITION_CONTEXT = TYPE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNING_TEMPLATE_PARAMETER = TYPE__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TEMPLATE_PARAMETER = TYPE__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PACKAGE = TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TEMPLATE_BINDING = TYPE__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_TEMPLATE_SIGNATURE = TYPE__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FEATURE = TYPE__FEATURE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTE = TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COLLABORATION_USE = TYPE__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GENERAL = TYPE__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GENERALIZATION = TYPE__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__POWERTYPE_EXTENT = TYPE__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INHERITED_MEMBER = TYPE__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_ABSTRACT = TYPE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_FINAL_SPECIALIZATION = TYPE__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_USE_CASE = TYPE__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__USE_CASE = TYPE__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__REDEFINED_CLASSIFIER = TYPE__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__REPRESENTATION = TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUBSTITUTION = TYPE__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_ATTRIBUTE = TYPE__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_CONNECTOR = TYPE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PART = TYPE__PART;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ROLE = TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_PORT = TYPE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLASSIFIER_BEHAVIOR = TYPE__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INTERFACE_REALIZATION = TYPE__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_BEHAVIOR = TYPE__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_OPERATION = TYPE__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EXTENSION = TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_ACTIVE = TYPE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NESTED_CLASSIFIER = TYPE__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_RECEPTION = TYPE__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPER_CLASS = TYPE__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Union Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DISJOINT_UNION_OF = TYPE__DISJOINT_UNION_OF;

	/**
	 * The feature id for the '<em><b>Has Key</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__HAS_KEY = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.RestrictionImpl <em>Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.RestrictionImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getRestriction()
	 * @generated
	 */
	int RESTRICTION = 12;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__EANNOTATIONS = CLASS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__OWNED_COMMENT = CLASS__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__OWNED_ELEMENT = CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__OWNER = CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__CLIENT_DEPENDENCY = CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__NAME_EXPRESSION = CLASS__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__NAMESPACE = CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__QUALIFIED_NAME = CLASS__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__VISIBILITY = CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__OWNED_RULE = CLASS__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__ELEMENT_IMPORT = CLASS__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__PACKAGE_IMPORT = CLASS__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__OWNED_MEMBER = CLASS__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__IMPORTED_MEMBER = CLASS__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__MEMBER = CLASS__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__IS_LEAF = CLASS__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__REDEFINED_ELEMENT = CLASS__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__REDEFINITION_CONTEXT = CLASS__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__OWNING_TEMPLATE_PARAMETER = CLASS__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__TEMPLATE_PARAMETER = CLASS__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__PACKAGE = CLASS__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__TEMPLATE_BINDING = CLASS__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__OWNED_TEMPLATE_SIGNATURE = CLASS__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__FEATURE = CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__ATTRIBUTE = CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__COLLABORATION_USE = CLASS__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__GENERAL = CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__GENERALIZATION = CLASS__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__POWERTYPE_EXTENT = CLASS__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__INHERITED_MEMBER = CLASS__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__IS_ABSTRACT = CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__IS_FINAL_SPECIALIZATION = CLASS__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__OWNED_USE_CASE = CLASS__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__USE_CASE = CLASS__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__REDEFINED_CLASSIFIER = CLASS__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__REPRESENTATION = CLASS__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__SUBSTITUTION = CLASS__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__OWNED_ATTRIBUTE = CLASS__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__OWNED_CONNECTOR = CLASS__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__PART = CLASS__PART;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__ROLE = CLASS__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__OWNED_PORT = CLASS__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__CLASSIFIER_BEHAVIOR = CLASS__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__INTERFACE_REALIZATION = CLASS__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__OWNED_BEHAVIOR = CLASS__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__OWNED_OPERATION = CLASS__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__EXTENSION = CLASS__EXTENSION;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__IS_ACTIVE = CLASS__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__NESTED_CLASSIFIER = CLASS__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__OWNED_RECEPTION = CLASS__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__SUPER_CLASS = CLASS__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Union Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__DISJOINT_UNION_OF = CLASS__DISJOINT_UNION_OF;

	/**
	 * The feature id for the '<em><b>Has Key</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__HAS_KEY = CLASS__HAS_KEY;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__CARDINALITY = CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__MAX_CARDINALITY = CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Qualified Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__MAX_QUALIFIED_CARDINALITY = CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__MIN_CARDINALITY = CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min Qualified Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__MIN_QUALIFIED_CARDINALITY = CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Qualified Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__QUALIFIED_CARDINALITY = CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Self</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__HAS_SELF = CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>On Properites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__ON_PROPERITES = CLASS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_FEATURE_COUNT = CLASS_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.AsymmetricPropertyImpl <em>Asymmetric Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.AsymmetricPropertyImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getAsymmetricProperty()
	 * @generated
	 */
	int ASYMMETRIC_PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYMMETRIC_PROPERTY__RDF_COMMENT = OBJECT_PROPERTY__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYMMETRIC_PROPERTY__IS_DEFINED_BY = OBJECT_PROPERTY__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYMMETRIC_PROPERTY__SEE_ALSO = OBJECT_PROPERTY__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYMMETRIC_PROPERTY__RDF_MEMBERS = OBJECT_PROPERTY__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYMMETRIC_PROPERTY__RDF_LABEL = OBJECT_PROPERTY__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYMMETRIC_PROPERTY__RDF_TYPE = OBJECT_PROPERTY__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYMMETRIC_PROPERTY__RDF_VALUE = OBJECT_PROPERTY__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYMMETRIC_PROPERTY__SUB_CLASS_OF = OBJECT_PROPERTY__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Property Chain Axiom</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYMMETRIC_PROPERTY__PROPERTY_CHAIN_AXIOM = OBJECT_PROPERTY__PROPERTY_CHAIN_AXIOM;

	/**
	 * The number of structural features of the '<em>Asymmetric Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYMMETRIC_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.AnonymousIndividualImpl <em>Anonymous Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.AnonymousIndividualImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getAnonymousIndividual()
	 * @generated
	 */
	int ANONYMOUS_INDIVIDUAL = 14;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL__RDF_COMMENT = INDIVIDUAL__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL__IS_DEFINED_BY = INDIVIDUAL__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL__SEE_ALSO = INDIVIDUAL__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL__RDF_MEMBERS = INDIVIDUAL__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL__RDF_LABEL = INDIVIDUAL__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL__RDF_TYPE = INDIVIDUAL__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL__RDF_VALUE = INDIVIDUAL__RDF_VALUE;

	/**
	 * The number of structural features of the '<em>Anonymous Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_FEATURE_COUNT = INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.TransitivePropertyImpl <em>Transitive Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.TransitivePropertyImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getTransitiveProperty()
	 * @generated
	 */
	int TRANSITIVE_PROPERTY = 15;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_PROPERTY__RDF_COMMENT = OBJECT_PROPERTY__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_PROPERTY__IS_DEFINED_BY = OBJECT_PROPERTY__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_PROPERTY__SEE_ALSO = OBJECT_PROPERTY__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_PROPERTY__RDF_MEMBERS = OBJECT_PROPERTY__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_PROPERTY__RDF_LABEL = OBJECT_PROPERTY__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_PROPERTY__RDF_TYPE = OBJECT_PROPERTY__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_PROPERTY__RDF_VALUE = OBJECT_PROPERTY__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_PROPERTY__SUB_CLASS_OF = OBJECT_PROPERTY__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Property Chain Axiom</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_PROPERTY__PROPERTY_CHAIN_AXIOM = OBJECT_PROPERTY__PROPERTY_CHAIN_AXIOM;

	/**
	 * The number of structural features of the '<em>Transitive Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.rationalImpl <em>rational</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.rationalImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getrational()
	 * @generated
	 */
	int RATIONAL = 16;

	/**
	 * The feature id for the '<em><b>Text Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONAL__TEXT_VALUE = REAL__TEXT_VALUE;

	/**
	 * The number of structural features of the '<em>rational</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONAL_FEATURE_COUNT = REAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.ReflexivePropertyImpl <em>Reflexive Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.ReflexivePropertyImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getReflexiveProperty()
	 * @generated
	 */
	int REFLEXIVE_PROPERTY = 17;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEXIVE_PROPERTY__RDF_COMMENT = OBJECT_PROPERTY__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEXIVE_PROPERTY__IS_DEFINED_BY = OBJECT_PROPERTY__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEXIVE_PROPERTY__SEE_ALSO = OBJECT_PROPERTY__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEXIVE_PROPERTY__RDF_MEMBERS = OBJECT_PROPERTY__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEXIVE_PROPERTY__RDF_LABEL = OBJECT_PROPERTY__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEXIVE_PROPERTY__RDF_TYPE = OBJECT_PROPERTY__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEXIVE_PROPERTY__RDF_VALUE = OBJECT_PROPERTY__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEXIVE_PROPERTY__SUB_CLASS_OF = OBJECT_PROPERTY__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Property Chain Axiom</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEXIVE_PROPERTY__PROPERTY_CHAIN_AXIOM = OBJECT_PROPERTY__PROPERTY_CHAIN_AXIOM;

	/**
	 * The number of structural features of the '<em>Reflexive Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEXIVE_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.OntologyImpl <em>Ontology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.OntologyImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getOntology()
	 * @generated
	 */
	int ONTOLOGY = 18;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__RDF_COMMENT = RdfsPackage.RDF_RESOURCE__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__IS_DEFINED_BY = RdfsPackage.RDF_RESOURCE__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__SEE_ALSO = RdfsPackage.RDF_RESOURCE__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__RDF_MEMBERS = RdfsPackage.RDF_RESOURCE__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__RDF_LABEL = RdfsPackage.RDF_RESOURCE__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__RDF_TYPE = RdfsPackage.RDF_RESOURCE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__RDF_VALUE = RdfsPackage.RDF_RESOURCE__RDF_VALUE;

	/**
	 * The number of structural features of the '<em>Ontology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_FEATURE_COUNT = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.SymmetricPropertyImpl <em>Symmetric Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.SymmetricPropertyImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getSymmetricProperty()
	 * @generated
	 */
	int SYMMETRIC_PROPERTY = 19;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_PROPERTY__RDF_COMMENT = OBJECT_PROPERTY__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_PROPERTY__IS_DEFINED_BY = OBJECT_PROPERTY__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_PROPERTY__SEE_ALSO = OBJECT_PROPERTY__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_PROPERTY__RDF_MEMBERS = OBJECT_PROPERTY__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_PROPERTY__RDF_LABEL = OBJECT_PROPERTY__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_PROPERTY__RDF_TYPE = OBJECT_PROPERTY__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_PROPERTY__RDF_VALUE = OBJECT_PROPERTY__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_PROPERTY__SUB_CLASS_OF = OBJECT_PROPERTY__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Property Chain Axiom</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_PROPERTY__PROPERTY_CHAIN_AXIOM = OBJECT_PROPERTY__PROPERTY_CHAIN_AXIOM;

	/**
	 * The number of structural features of the '<em>Symmetric Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.AllDisjointPropertiesImpl <em>All Disjoint Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.AllDisjointPropertiesImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getAllDisjointProperties()
	 * @generated
	 */
	int ALL_DISJOINT_PROPERTIES = 20;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DISJOINT_PROPERTIES__RDF_COMMENT = RdfsPackage.RDF_RESOURCE__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DISJOINT_PROPERTIES__IS_DEFINED_BY = RdfsPackage.RDF_RESOURCE__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DISJOINT_PROPERTIES__SEE_ALSO = RdfsPackage.RDF_RESOURCE__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DISJOINT_PROPERTIES__RDF_MEMBERS = RdfsPackage.RDF_RESOURCE__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DISJOINT_PROPERTIES__RDF_LABEL = RdfsPackage.RDF_RESOURCE__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DISJOINT_PROPERTIES__RDF_TYPE = RdfsPackage.RDF_RESOURCE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DISJOINT_PROPERTIES__RDF_VALUE = RdfsPackage.RDF_RESOURCE__RDF_VALUE;

	/**
	 * The number of structural features of the '<em>All Disjoint Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DISJOINT_PROPERTIES_FEATURE_COUNT = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.AxiomImpl <em>Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.AxiomImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getAxiom()
	 * @generated
	 */
	int AXIOM = 21;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__RDF_COMMENT = RdfsPackage.RDF_RESOURCE__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__IS_DEFINED_BY = RdfsPackage.RDF_RESOURCE__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__SEE_ALSO = RdfsPackage.RDF_RESOURCE__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__RDF_MEMBERS = RdfsPackage.RDF_RESOURCE__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__RDF_LABEL = RdfsPackage.RDF_RESOURCE__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__RDF_TYPE = RdfsPackage.RDF_RESOURCE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__RDF_VALUE = RdfsPackage.RDF_RESOURCE__RDF_VALUE;

	/**
	 * The number of structural features of the '<em>Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM_FEATURE_COUNT = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.DatatypePropertyImpl <em>Datatype Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.DatatypePropertyImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getDatatypeProperty()
	 * @generated
	 */
	int DATATYPE_PROPERTY = 22;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_PROPERTY__RDF_COMMENT = RdfPackage.RDF_PROPERTY__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_PROPERTY__IS_DEFINED_BY = RdfPackage.RDF_PROPERTY__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_PROPERTY__SEE_ALSO = RdfPackage.RDF_PROPERTY__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_PROPERTY__RDF_MEMBERS = RdfPackage.RDF_PROPERTY__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_PROPERTY__RDF_LABEL = RdfPackage.RDF_PROPERTY__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_PROPERTY__RDF_TYPE = RdfPackage.RDF_PROPERTY__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_PROPERTY__RDF_VALUE = RdfPackage.RDF_PROPERTY__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_PROPERTY__DOMAIN = RdfPackage.RDF_PROPERTY__DOMAIN;

	/**
	 * The feature id for the '<em><b>Sub Property Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_PROPERTY__SUB_PROPERTY_OF = RdfPackage.RDF_PROPERTY__SUB_PROPERTY_OF;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_PROPERTY__RANGE = RdfPackage.RDF_PROPERTY__RANGE;

	/**
	 * The number of structural features of the '<em>Datatype Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_PROPERTY_FEATURE_COUNT = RdfPackage.RDF_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.DatatypeImpl <em>Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.DatatypeImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getDatatype()
	 * @generated
	 */
	int DATATYPE = 23;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__EANNOTATIONS = TYPE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__OWNED_COMMENT = TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__OWNED_ELEMENT = TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__OWNER = TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__CLIENT_DEPENDENCY = TYPE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__NAME_EXPRESSION = TYPE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__NAMESPACE = TYPE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__QUALIFIED_NAME = TYPE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__VISIBILITY = TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__OWNED_RULE = TYPE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__ELEMENT_IMPORT = TYPE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__PACKAGE_IMPORT = TYPE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__OWNED_MEMBER = TYPE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__IMPORTED_MEMBER = TYPE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__MEMBER = TYPE__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__IS_LEAF = TYPE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__REDEFINED_ELEMENT = TYPE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__REDEFINITION_CONTEXT = TYPE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__OWNING_TEMPLATE_PARAMETER = TYPE__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__TEMPLATE_PARAMETER = TYPE__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__PACKAGE = TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__TEMPLATE_BINDING = TYPE__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__OWNED_TEMPLATE_SIGNATURE = TYPE__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__FEATURE = TYPE__FEATURE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__ATTRIBUTE = TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__COLLABORATION_USE = TYPE__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__GENERAL = TYPE__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__GENERALIZATION = TYPE__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__POWERTYPE_EXTENT = TYPE__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__INHERITED_MEMBER = TYPE__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__IS_ABSTRACT = TYPE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__IS_FINAL_SPECIALIZATION = TYPE__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__OWNED_USE_CASE = TYPE__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__USE_CASE = TYPE__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__REDEFINED_CLASSIFIER = TYPE__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__REPRESENTATION = TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__SUBSTITUTION = TYPE__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__OWNED_ATTRIBUTE = TYPE__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__OWNED_CONNECTOR = TYPE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__PART = TYPE__PART;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__ROLE = TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__OWNED_PORT = TYPE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__CLASSIFIER_BEHAVIOR = TYPE__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__INTERFACE_REALIZATION = TYPE__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__OWNED_BEHAVIOR = TYPE__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__OWNED_OPERATION = TYPE__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__EXTENSION = TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__IS_ACTIVE = TYPE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__NESTED_CLASSIFIER = TYPE__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__OWNED_RECEPTION = TYPE__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__SUPER_CLASS = TYPE__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Disjoint Union Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__DISJOINT_UNION_OF = TYPE__DISJOINT_UNION_OF;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__RDF_COMMENT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__IS_DEFINED_BY = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__SEE_ALSO = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__RDF_MEMBERS = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__RDF_LABEL = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__RDF_TYPE = TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__RDF_VALUE = TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__SUB_CLASS_OF = TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.NegativePropertyAssertionImpl <em>Negative Property Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.NegativePropertyAssertionImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getNegativePropertyAssertion()
	 * @generated
	 */
	int NEGATIVE_PROPERTY_ASSERTION = 24;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PROPERTY_ASSERTION__RDF_COMMENT = RdfsPackage.RDF_RESOURCE__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PROPERTY_ASSERTION__IS_DEFINED_BY = RdfsPackage.RDF_RESOURCE__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PROPERTY_ASSERTION__SEE_ALSO = RdfsPackage.RDF_RESOURCE__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PROPERTY_ASSERTION__RDF_MEMBERS = RdfsPackage.RDF_RESOURCE__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PROPERTY_ASSERTION__RDF_LABEL = RdfsPackage.RDF_RESOURCE__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PROPERTY_ASSERTION__RDF_TYPE = RdfsPackage.RDF_RESOURCE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PROPERTY_ASSERTION__RDF_VALUE = RdfsPackage.RDF_RESOURCE__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Source Individual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Individual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PROPERTY_ASSERTION__TARGET_INDIVIDUAL = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PROPERTY_ASSERTION__TARGET_VALUE = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assertion Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PROPERTY_ASSERTION__ASSERTION_PROPERTY = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Negative Property Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PROPERTY_ASSERTION_FEATURE_COUNT = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.FunctionalPropertyImpl <em>Functional Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.FunctionalPropertyImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getFunctionalProperty()
	 * @generated
	 */
	int FUNCTIONAL_PROPERTY = 25;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_PROPERTY__RDF_COMMENT = RdfPackage.RDF_PROPERTY__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_PROPERTY__IS_DEFINED_BY = RdfPackage.RDF_PROPERTY__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_PROPERTY__SEE_ALSO = RdfPackage.RDF_PROPERTY__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_PROPERTY__RDF_MEMBERS = RdfPackage.RDF_PROPERTY__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_PROPERTY__RDF_LABEL = RdfPackage.RDF_PROPERTY__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_PROPERTY__RDF_TYPE = RdfPackage.RDF_PROPERTY__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_PROPERTY__RDF_VALUE = RdfPackage.RDF_PROPERTY__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_PROPERTY__DOMAIN = RdfPackage.RDF_PROPERTY__DOMAIN;

	/**
	 * The feature id for the '<em><b>Sub Property Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_PROPERTY__SUB_PROPERTY_OF = RdfPackage.RDF_PROPERTY__SUB_PROPERTY_OF;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_PROPERTY__RANGE = RdfPackage.RDF_PROPERTY__RANGE;

	/**
	 * The number of structural features of the '<em>Functional Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_PROPERTY_FEATURE_COUNT = RdfPackage.RDF_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.AllDisjointClassesImpl <em>All Disjoint Classes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.AllDisjointClassesImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getAllDisjointClasses()
	 * @generated
	 */
	int ALL_DISJOINT_CLASSES = 26;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DISJOINT_CLASSES__RDF_COMMENT = RdfsPackage.RDF_RESOURCE__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DISJOINT_CLASSES__IS_DEFINED_BY = RdfsPackage.RDF_RESOURCE__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DISJOINT_CLASSES__SEE_ALSO = RdfsPackage.RDF_RESOURCE__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DISJOINT_CLASSES__RDF_MEMBERS = RdfsPackage.RDF_RESOURCE__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DISJOINT_CLASSES__RDF_LABEL = RdfsPackage.RDF_RESOURCE__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DISJOINT_CLASSES__RDF_TYPE = RdfsPackage.RDF_RESOURCE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DISJOINT_CLASSES__RDF_VALUE = RdfsPackage.RDF_RESOURCE__RDF_VALUE;

	/**
	 * The number of structural features of the '<em>All Disjoint Classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DISJOINT_CLASSES_FEATURE_COUNT = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.AllDifferentImpl <em>All Different</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.AllDifferentImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getAllDifferent()
	 * @generated
	 */
	int ALL_DIFFERENT = 27;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DIFFERENT__RDF_COMMENT = RdfsPackage.RDF_RESOURCE__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DIFFERENT__IS_DEFINED_BY = RdfsPackage.RDF_RESOURCE__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DIFFERENT__SEE_ALSO = RdfsPackage.RDF_RESOURCE__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DIFFERENT__RDF_MEMBERS = RdfsPackage.RDF_RESOURCE__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DIFFERENT__RDF_LABEL = RdfsPackage.RDF_RESOURCE__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DIFFERENT__RDF_TYPE = RdfsPackage.RDF_RESOURCE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DIFFERENT__RDF_VALUE = RdfsPackage.RDF_RESOURCE__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Distinct Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DIFFERENT__DISTINCT_MEMBERS = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>All Different</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DIFFERENT_FEATURE_COUNT = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.IrreflexivePropertyImpl <em>Irreflexive Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.IrreflexivePropertyImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getIrreflexiveProperty()
	 * @generated
	 */
	int IRREFLEXIVE_PROPERTY = 28;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREFLEXIVE_PROPERTY__RDF_COMMENT = OBJECT_PROPERTY__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREFLEXIVE_PROPERTY__IS_DEFINED_BY = OBJECT_PROPERTY__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREFLEXIVE_PROPERTY__SEE_ALSO = OBJECT_PROPERTY__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREFLEXIVE_PROPERTY__RDF_MEMBERS = OBJECT_PROPERTY__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREFLEXIVE_PROPERTY__RDF_LABEL = OBJECT_PROPERTY__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREFLEXIVE_PROPERTY__RDF_TYPE = OBJECT_PROPERTY__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREFLEXIVE_PROPERTY__RDF_VALUE = OBJECT_PROPERTY__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREFLEXIVE_PROPERTY__SUB_CLASS_OF = OBJECT_PROPERTY__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Property Chain Axiom</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREFLEXIVE_PROPERTY__PROPERTY_CHAIN_AXIOM = OBJECT_PROPERTY__PROPERTY_CHAIN_AXIOM;

	/**
	 * The number of structural features of the '<em>Irreflexive Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREFLEXIVE_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.AnnotationPropertyImpl <em>Annotation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.AnnotationPropertyImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getAnnotationProperty()
	 * @generated
	 */
	int ANNOTATION_PROPERTY = 29;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__RDF_COMMENT = RdfPackage.RDF_PROPERTY__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__IS_DEFINED_BY = RdfPackage.RDF_PROPERTY__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__SEE_ALSO = RdfPackage.RDF_PROPERTY__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__RDF_MEMBERS = RdfPackage.RDF_PROPERTY__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__RDF_LABEL = RdfPackage.RDF_PROPERTY__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__RDF_TYPE = RdfPackage.RDF_PROPERTY__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__RDF_VALUE = RdfPackage.RDF_PROPERTY__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__DOMAIN = RdfPackage.RDF_PROPERTY__DOMAIN;

	/**
	 * The feature id for the '<em><b>Sub Property Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__SUB_PROPERTY_OF = RdfPackage.RDF_PROPERTY__SUB_PROPERTY_OF;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__RANGE = RdfPackage.RDF_PROPERTY__RANGE;

	/**
	 * The number of structural features of the '<em>Annotation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_FEATURE_COUNT = RdfPackage.RDF_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.InverseFunctionalPropertyImpl <em>Inverse Functional Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.InverseFunctionalPropertyImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getInverseFunctionalProperty()
	 * @generated
	 */
	int INVERSE_FUNCTIONAL_PROPERTY = 30;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_FUNCTIONAL_PROPERTY__RDF_COMMENT = OBJECT_PROPERTY__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_FUNCTIONAL_PROPERTY__IS_DEFINED_BY = OBJECT_PROPERTY__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_FUNCTIONAL_PROPERTY__SEE_ALSO = OBJECT_PROPERTY__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_FUNCTIONAL_PROPERTY__RDF_MEMBERS = OBJECT_PROPERTY__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_FUNCTIONAL_PROPERTY__RDF_LABEL = OBJECT_PROPERTY__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_FUNCTIONAL_PROPERTY__RDF_TYPE = OBJECT_PROPERTY__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_FUNCTIONAL_PROPERTY__RDF_VALUE = OBJECT_PROPERTY__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_FUNCTIONAL_PROPERTY__SUB_CLASS_OF = OBJECT_PROPERTY__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Property Chain Axiom</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_FUNCTIONAL_PROPERTY__PROPERTY_CHAIN_AXIOM = OBJECT_PROPERTY__PROPERTY_CHAIN_AXIOM;

	/**
	 * The number of structural features of the '<em>Inverse Functional Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_FUNCTIONAL_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.DeprecatedClassImpl <em>Deprecated Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.DeprecatedClassImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getDeprecatedClass()
	 * @generated
	 */
	int DEPRECATED_CLASS = 31;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_CLASS__RDF_COMMENT = RdfsPackage.RDF_CLASS__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_CLASS__IS_DEFINED_BY = RdfsPackage.RDF_CLASS__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_CLASS__SEE_ALSO = RdfsPackage.RDF_CLASS__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_CLASS__RDF_MEMBERS = RdfsPackage.RDF_CLASS__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_CLASS__RDF_LABEL = RdfsPackage.RDF_CLASS__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_CLASS__RDF_TYPE = RdfsPackage.RDF_CLASS__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_CLASS__RDF_VALUE = RdfsPackage.RDF_CLASS__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_CLASS__SUB_CLASS_OF = RdfsPackage.RDF_CLASS__SUB_CLASS_OF;

	/**
	 * The number of structural features of the '<em>Deprecated Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_CLASS_FEATURE_COUNT = RdfsPackage.RDF_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.DeprecatedPropertyImpl <em>Deprecated Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.DeprecatedPropertyImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getDeprecatedProperty()
	 * @generated
	 */
	int DEPRECATED_PROPERTY = 32;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_PROPERTY__RDF_COMMENT = RdfPackage.RDF_PROPERTY__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_PROPERTY__IS_DEFINED_BY = RdfPackage.RDF_PROPERTY__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_PROPERTY__SEE_ALSO = RdfPackage.RDF_PROPERTY__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_PROPERTY__RDF_MEMBERS = RdfPackage.RDF_PROPERTY__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_PROPERTY__RDF_LABEL = RdfPackage.RDF_PROPERTY__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_PROPERTY__RDF_TYPE = RdfPackage.RDF_PROPERTY__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_PROPERTY__RDF_VALUE = RdfPackage.RDF_PROPERTY__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_PROPERTY__DOMAIN = RdfPackage.RDF_PROPERTY__DOMAIN;

	/**
	 * The feature id for the '<em><b>Sub Property Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_PROPERTY__SUB_PROPERTY_OF = RdfPackage.RDF_PROPERTY__SUB_PROPERTY_OF;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_PROPERTY__RANGE = RdfPackage.RDF_PROPERTY__RANGE;

	/**
	 * The number of structural features of the '<em>Deprecated Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_PROPERTY_FEATURE_COUNT = RdfPackage.RDF_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.owl.impl.PropertyChainAxiomImpl <em>Property Chain Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.owl.impl.PropertyChainAxiomImpl
	 * @see org.w3.owl.impl.OwlPackageImpl#getPropertyChainAxiom()
	 * @generated
	 */
	int PROPERTY_CHAIN_AXIOM = 33;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CHAIN_AXIOM__RDF_COMMENT = OBJECT_PROPERTY__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CHAIN_AXIOM__IS_DEFINED_BY = OBJECT_PROPERTY__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CHAIN_AXIOM__SEE_ALSO = OBJECT_PROPERTY__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CHAIN_AXIOM__RDF_MEMBERS = OBJECT_PROPERTY__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CHAIN_AXIOM__RDF_LABEL = OBJECT_PROPERTY__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CHAIN_AXIOM__RDF_TYPE = OBJECT_PROPERTY__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CHAIN_AXIOM__RDF_VALUE = OBJECT_PROPERTY__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CHAIN_AXIOM__SUB_CLASS_OF = OBJECT_PROPERTY__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Property Chain Axiom</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CHAIN_AXIOM__PROPERTY_CHAIN_AXIOM = OBJECT_PROPERTY__PROPERTY_CHAIN_AXIOM;

	/**
	 * The number of structural features of the '<em>Property Chain Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CHAIN_AXIOM_FEATURE_COUNT = OBJECT_PROPERTY_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.w3.owl.Nothing <em>Nothing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nothing</em>'.
	 * @see org.w3.owl.Nothing
	 * @generated
	 */
	EClass getNothing();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing</em>'.
	 * @see org.w3.owl.Thing
	 * @generated
	 */
	EClass getThing();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.TypedThing <em>Typed Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Thing</em>'.
	 * @see org.w3.owl.TypedThing
	 * @generated
	 */
	EClass getTypedThing();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.w3.owl.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.DataRange <em>Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Range</em>'.
	 * @see org.w3.owl.DataRange
	 * @generated
	 */
	EClass getDataRange();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.ObjectProperty <em>Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Property</em>'.
	 * @see org.w3.owl.ObjectProperty
	 * @generated
	 */
	EClass getObjectProperty();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.owl.ObjectProperty#getPropertyChainAxiom <em>Property Chain Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Property Chain Axiom</em>'.
	 * @see org.w3.owl.ObjectProperty#getPropertyChainAxiom()
	 * @see #getObjectProperty()
	 * @generated
	 */
	EAttribute getObjectProperty_PropertyChainAxiom();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.NamedIndividual <em>Named Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Individual</em>'.
	 * @see org.w3.owl.NamedIndividual
	 * @generated
	 */
	EClass getNamedIndividual();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual</em>'.
	 * @see org.w3.owl.Individual
	 * @generated
	 */
	EClass getIndividual();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.real <em>real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>real</em>'.
	 * @see org.w3.owl.real
	 * @generated
	 */
	EClass getreal();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.OntologyProperty <em>Ontology Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology Property</em>'.
	 * @see org.w3.owl.OntologyProperty
	 * @generated
	 */
	EClass getOntologyProperty();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.w3.owl.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the reference list '{@link org.w3.owl.Class#getHasKey <em>Has Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Key</em>'.
	 * @see org.w3.owl.Class#getHasKey()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_HasKey();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.w3.owl.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the reference '{@link org.w3.owl.Type#getDisjointUnionOf <em>Disjoint Union Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Disjoint Union Of</em>'.
	 * @see org.w3.owl.Type#getDisjointUnionOf()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_DisjointUnionOf();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.Restriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction</em>'.
	 * @see org.w3.owl.Restriction
	 * @generated
	 */
	EClass getRestriction();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.owl.Restriction#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see org.w3.owl.Restriction#getCardinality()
	 * @see #getRestriction()
	 * @generated
	 */
	EAttribute getRestriction_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.owl.Restriction#getMaxCardinality <em>Max Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Cardinality</em>'.
	 * @see org.w3.owl.Restriction#getMaxCardinality()
	 * @see #getRestriction()
	 * @generated
	 */
	EAttribute getRestriction_MaxCardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.owl.Restriction#getMaxQualifiedCardinality <em>Max Qualified Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Qualified Cardinality</em>'.
	 * @see org.w3.owl.Restriction#getMaxQualifiedCardinality()
	 * @see #getRestriction()
	 * @generated
	 */
	EAttribute getRestriction_MaxQualifiedCardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.owl.Restriction#getMinCardinality <em>Min Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Cardinality</em>'.
	 * @see org.w3.owl.Restriction#getMinCardinality()
	 * @see #getRestriction()
	 * @generated
	 */
	EAttribute getRestriction_MinCardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.owl.Restriction#getMinQualifiedCardinality <em>Min Qualified Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Qualified Cardinality</em>'.
	 * @see org.w3.owl.Restriction#getMinQualifiedCardinality()
	 * @see #getRestriction()
	 * @generated
	 */
	EAttribute getRestriction_MinQualifiedCardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.owl.Restriction#getQualifiedCardinality <em>Qualified Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Cardinality</em>'.
	 * @see org.w3.owl.Restriction#getQualifiedCardinality()
	 * @see #getRestriction()
	 * @generated
	 */
	EAttribute getRestriction_QualifiedCardinality();

	/**
	 * Returns the meta object for the reference '{@link org.w3.owl.Restriction#getHasSelf <em>Has Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Self</em>'.
	 * @see org.w3.owl.Restriction#getHasSelf()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_HasSelf();

	/**
	 * Returns the meta object for the reference list '{@link org.w3.owl.Restriction#getOnProperites <em>On Properites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On Properites</em>'.
	 * @see org.w3.owl.Restriction#getOnProperites()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_OnProperites();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.AsymmetricProperty <em>Asymmetric Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asymmetric Property</em>'.
	 * @see org.w3.owl.AsymmetricProperty
	 * @generated
	 */
	EClass getAsymmetricProperty();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.AnonymousIndividual <em>Anonymous Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous Individual</em>'.
	 * @see org.w3.owl.AnonymousIndividual
	 * @generated
	 */
	EClass getAnonymousIndividual();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.TransitiveProperty <em>Transitive Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transitive Property</em>'.
	 * @see org.w3.owl.TransitiveProperty
	 * @generated
	 */
	EClass getTransitiveProperty();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.rational <em>rational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>rational</em>'.
	 * @see org.w3.owl.rational
	 * @generated
	 */
	EClass getrational();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.ReflexiveProperty <em>Reflexive Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reflexive Property</em>'.
	 * @see org.w3.owl.ReflexiveProperty
	 * @generated
	 */
	EClass getReflexiveProperty();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology</em>'.
	 * @see org.w3.owl.Ontology
	 * @generated
	 */
	EClass getOntology();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.SymmetricProperty <em>Symmetric Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symmetric Property</em>'.
	 * @see org.w3.owl.SymmetricProperty
	 * @generated
	 */
	EClass getSymmetricProperty();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.AllDisjointProperties <em>All Disjoint Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Disjoint Properties</em>'.
	 * @see org.w3.owl.AllDisjointProperties
	 * @generated
	 */
	EClass getAllDisjointProperties();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.Axiom <em>Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axiom</em>'.
	 * @see org.w3.owl.Axiom
	 * @generated
	 */
	EClass getAxiom();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.DatatypeProperty <em>Datatype Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Property</em>'.
	 * @see org.w3.owl.DatatypeProperty
	 * @generated
	 */
	EClass getDatatypeProperty();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype</em>'.
	 * @see org.w3.owl.Datatype
	 * @generated
	 */
	EClass getDatatype();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.NegativePropertyAssertion <em>Negative Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Property Assertion</em>'.
	 * @see org.w3.owl.NegativePropertyAssertion
	 * @generated
	 */
	EClass getNegativePropertyAssertion();

	/**
	 * Returns the meta object for the reference '{@link org.w3.owl.NegativePropertyAssertion#getSourceIndividual <em>Source Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Individual</em>'.
	 * @see org.w3.owl.NegativePropertyAssertion#getSourceIndividual()
	 * @see #getNegativePropertyAssertion()
	 * @generated
	 */
	EReference getNegativePropertyAssertion_SourceIndividual();

	/**
	 * Returns the meta object for the reference '{@link org.w3.owl.NegativePropertyAssertion#getTargetIndividual <em>Target Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Individual</em>'.
	 * @see org.w3.owl.NegativePropertyAssertion#getTargetIndividual()
	 * @see #getNegativePropertyAssertion()
	 * @generated
	 */
	EReference getNegativePropertyAssertion_TargetIndividual();

	/**
	 * Returns the meta object for the reference '{@link org.w3.owl.NegativePropertyAssertion#getTargetValue <em>Target Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Value</em>'.
	 * @see org.w3.owl.NegativePropertyAssertion#getTargetValue()
	 * @see #getNegativePropertyAssertion()
	 * @generated
	 */
	EReference getNegativePropertyAssertion_TargetValue();

	/**
	 * Returns the meta object for the reference '{@link org.w3.owl.NegativePropertyAssertion#getAssertionProperty <em>Assertion Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assertion Property</em>'.
	 * @see org.w3.owl.NegativePropertyAssertion#getAssertionProperty()
	 * @see #getNegativePropertyAssertion()
	 * @generated
	 */
	EReference getNegativePropertyAssertion_AssertionProperty();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.FunctionalProperty <em>Functional Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Property</em>'.
	 * @see org.w3.owl.FunctionalProperty
	 * @generated
	 */
	EClass getFunctionalProperty();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.AllDisjointClasses <em>All Disjoint Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Disjoint Classes</em>'.
	 * @see org.w3.owl.AllDisjointClasses
	 * @generated
	 */
	EClass getAllDisjointClasses();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.AllDifferent <em>All Different</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Different</em>'.
	 * @see org.w3.owl.AllDifferent
	 * @generated
	 */
	EClass getAllDifferent();

	/**
	 * Returns the meta object for the reference list '{@link org.w3.owl.AllDifferent#getDistinctMembers <em>Distinct Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Distinct Members</em>'.
	 * @see org.w3.owl.AllDifferent#getDistinctMembers()
	 * @see #getAllDifferent()
	 * @generated
	 */
	EReference getAllDifferent_DistinctMembers();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.IrreflexiveProperty <em>Irreflexive Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Irreflexive Property</em>'.
	 * @see org.w3.owl.IrreflexiveProperty
	 * @generated
	 */
	EClass getIrreflexiveProperty();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.AnnotationProperty <em>Annotation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Property</em>'.
	 * @see org.w3.owl.AnnotationProperty
	 * @generated
	 */
	EClass getAnnotationProperty();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.InverseFunctionalProperty <em>Inverse Functional Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inverse Functional Property</em>'.
	 * @see org.w3.owl.InverseFunctionalProperty
	 * @generated
	 */
	EClass getInverseFunctionalProperty();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.DeprecatedClass <em>Deprecated Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deprecated Class</em>'.
	 * @see org.w3.owl.DeprecatedClass
	 * @generated
	 */
	EClass getDeprecatedClass();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.DeprecatedProperty <em>Deprecated Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deprecated Property</em>'.
	 * @see org.w3.owl.DeprecatedProperty
	 * @generated
	 */
	EClass getDeprecatedProperty();

	/**
	 * Returns the meta object for class '{@link org.w3.owl.PropertyChainAxiom <em>Property Chain Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Chain Axiom</em>'.
	 * @see org.w3.owl.PropertyChainAxiom
	 * @generated
	 */
	EClass getPropertyChainAxiom();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OwlFactory getOwlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.NothingImpl <em>Nothing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.NothingImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getNothing()
		 * @generated
		 */
		EClass NOTHING = eINSTANCE.getNothing();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.ThingImpl <em>Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.ThingImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getThing()
		 * @generated
		 */
		EClass THING = eINSTANCE.getThing();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.TypedThingImpl <em>Typed Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.TypedThingImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getTypedThing()
		 * @generated
		 */
		EClass TYPED_THING = eINSTANCE.getTypedThing();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.AnnotationImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.DataRangeImpl <em>Data Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.DataRangeImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getDataRange()
		 * @generated
		 */
		EClass DATA_RANGE = eINSTANCE.getDataRange();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.ObjectPropertyImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getObjectProperty()
		 * @generated
		 */
		EClass OBJECT_PROPERTY = eINSTANCE.getObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Property Chain Axiom</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_PROPERTY__PROPERTY_CHAIN_AXIOM = eINSTANCE.getObjectProperty_PropertyChainAxiom();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.NamedIndividualImpl <em>Named Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.NamedIndividualImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getNamedIndividual()
		 * @generated
		 */
		EClass NAMED_INDIVIDUAL = eINSTANCE.getNamedIndividual();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.IndividualImpl <em>Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.IndividualImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getIndividual()
		 * @generated
		 */
		EClass INDIVIDUAL = eINSTANCE.getIndividual();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.realImpl <em>real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.realImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getreal()
		 * @generated
		 */
		EClass REAL = eINSTANCE.getreal();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.OntologyPropertyImpl <em>Ontology Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.OntologyPropertyImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getOntologyProperty()
		 * @generated
		 */
		EClass ONTOLOGY_PROPERTY = eINSTANCE.getOntologyProperty();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.ClassImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Has Key</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__HAS_KEY = eINSTANCE.getClass_HasKey();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.TypeImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Disjoint Union Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__DISJOINT_UNION_OF = eINSTANCE.getType_DisjointUnionOf();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.RestrictionImpl <em>Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.RestrictionImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getRestriction()
		 * @generated
		 */
		EClass RESTRICTION = eINSTANCE.getRestriction();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTION__CARDINALITY = eINSTANCE.getRestriction_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Max Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTION__MAX_CARDINALITY = eINSTANCE.getRestriction_MaxCardinality();

		/**
		 * The meta object literal for the '<em><b>Max Qualified Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTION__MAX_QUALIFIED_CARDINALITY = eINSTANCE.getRestriction_MaxQualifiedCardinality();

		/**
		 * The meta object literal for the '<em><b>Min Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTION__MIN_CARDINALITY = eINSTANCE.getRestriction_MinCardinality();

		/**
		 * The meta object literal for the '<em><b>Min Qualified Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTION__MIN_QUALIFIED_CARDINALITY = eINSTANCE.getRestriction_MinQualifiedCardinality();

		/**
		 * The meta object literal for the '<em><b>Qualified Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTION__QUALIFIED_CARDINALITY = eINSTANCE.getRestriction_QualifiedCardinality();

		/**
		 * The meta object literal for the '<em><b>Has Self</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION__HAS_SELF = eINSTANCE.getRestriction_HasSelf();

		/**
		 * The meta object literal for the '<em><b>On Properites</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION__ON_PROPERITES = eINSTANCE.getRestriction_OnProperites();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.AsymmetricPropertyImpl <em>Asymmetric Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.AsymmetricPropertyImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getAsymmetricProperty()
		 * @generated
		 */
		EClass ASYMMETRIC_PROPERTY = eINSTANCE.getAsymmetricProperty();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.AnonymousIndividualImpl <em>Anonymous Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.AnonymousIndividualImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getAnonymousIndividual()
		 * @generated
		 */
		EClass ANONYMOUS_INDIVIDUAL = eINSTANCE.getAnonymousIndividual();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.TransitivePropertyImpl <em>Transitive Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.TransitivePropertyImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getTransitiveProperty()
		 * @generated
		 */
		EClass TRANSITIVE_PROPERTY = eINSTANCE.getTransitiveProperty();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.rationalImpl <em>rational</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.rationalImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getrational()
		 * @generated
		 */
		EClass RATIONAL = eINSTANCE.getrational();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.ReflexivePropertyImpl <em>Reflexive Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.ReflexivePropertyImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getReflexiveProperty()
		 * @generated
		 */
		EClass REFLEXIVE_PROPERTY = eINSTANCE.getReflexiveProperty();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.OntologyImpl <em>Ontology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.OntologyImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getOntology()
		 * @generated
		 */
		EClass ONTOLOGY = eINSTANCE.getOntology();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.SymmetricPropertyImpl <em>Symmetric Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.SymmetricPropertyImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getSymmetricProperty()
		 * @generated
		 */
		EClass SYMMETRIC_PROPERTY = eINSTANCE.getSymmetricProperty();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.AllDisjointPropertiesImpl <em>All Disjoint Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.AllDisjointPropertiesImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getAllDisjointProperties()
		 * @generated
		 */
		EClass ALL_DISJOINT_PROPERTIES = eINSTANCE.getAllDisjointProperties();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.AxiomImpl <em>Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.AxiomImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getAxiom()
		 * @generated
		 */
		EClass AXIOM = eINSTANCE.getAxiom();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.DatatypePropertyImpl <em>Datatype Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.DatatypePropertyImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getDatatypeProperty()
		 * @generated
		 */
		EClass DATATYPE_PROPERTY = eINSTANCE.getDatatypeProperty();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.DatatypeImpl <em>Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.DatatypeImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getDatatype()
		 * @generated
		 */
		EClass DATATYPE = eINSTANCE.getDatatype();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.NegativePropertyAssertionImpl <em>Negative Property Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.NegativePropertyAssertionImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getNegativePropertyAssertion()
		 * @generated
		 */
		EClass NEGATIVE_PROPERTY_ASSERTION = eINSTANCE.getNegativePropertyAssertion();

		/**
		 * The meta object literal for the '<em><b>Source Individual</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATIVE_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = eINSTANCE.getNegativePropertyAssertion_SourceIndividual();

		/**
		 * The meta object literal for the '<em><b>Target Individual</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATIVE_PROPERTY_ASSERTION__TARGET_INDIVIDUAL = eINSTANCE.getNegativePropertyAssertion_TargetIndividual();

		/**
		 * The meta object literal for the '<em><b>Target Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATIVE_PROPERTY_ASSERTION__TARGET_VALUE = eINSTANCE.getNegativePropertyAssertion_TargetValue();

		/**
		 * The meta object literal for the '<em><b>Assertion Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATIVE_PROPERTY_ASSERTION__ASSERTION_PROPERTY = eINSTANCE.getNegativePropertyAssertion_AssertionProperty();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.FunctionalPropertyImpl <em>Functional Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.FunctionalPropertyImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getFunctionalProperty()
		 * @generated
		 */
		EClass FUNCTIONAL_PROPERTY = eINSTANCE.getFunctionalProperty();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.AllDisjointClassesImpl <em>All Disjoint Classes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.AllDisjointClassesImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getAllDisjointClasses()
		 * @generated
		 */
		EClass ALL_DISJOINT_CLASSES = eINSTANCE.getAllDisjointClasses();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.AllDifferentImpl <em>All Different</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.AllDifferentImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getAllDifferent()
		 * @generated
		 */
		EClass ALL_DIFFERENT = eINSTANCE.getAllDifferent();

		/**
		 * The meta object literal for the '<em><b>Distinct Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_DIFFERENT__DISTINCT_MEMBERS = eINSTANCE.getAllDifferent_DistinctMembers();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.IrreflexivePropertyImpl <em>Irreflexive Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.IrreflexivePropertyImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getIrreflexiveProperty()
		 * @generated
		 */
		EClass IRREFLEXIVE_PROPERTY = eINSTANCE.getIrreflexiveProperty();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.AnnotationPropertyImpl <em>Annotation Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.AnnotationPropertyImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getAnnotationProperty()
		 * @generated
		 */
		EClass ANNOTATION_PROPERTY = eINSTANCE.getAnnotationProperty();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.InverseFunctionalPropertyImpl <em>Inverse Functional Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.InverseFunctionalPropertyImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getInverseFunctionalProperty()
		 * @generated
		 */
		EClass INVERSE_FUNCTIONAL_PROPERTY = eINSTANCE.getInverseFunctionalProperty();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.DeprecatedClassImpl <em>Deprecated Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.DeprecatedClassImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getDeprecatedClass()
		 * @generated
		 */
		EClass DEPRECATED_CLASS = eINSTANCE.getDeprecatedClass();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.DeprecatedPropertyImpl <em>Deprecated Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.DeprecatedPropertyImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getDeprecatedProperty()
		 * @generated
		 */
		EClass DEPRECATED_PROPERTY = eINSTANCE.getDeprecatedProperty();

		/**
		 * The meta object literal for the '{@link org.w3.owl.impl.PropertyChainAxiomImpl <em>Property Chain Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.owl.impl.PropertyChainAxiomImpl
		 * @see org.w3.owl.impl.OwlPackageImpl#getPropertyChainAxiom()
		 * @generated
		 */
		EClass PROPERTY_CHAIN_AXIOM = eINSTANCE.getPropertyChainAxiom();

	}

} //OwlPackage
