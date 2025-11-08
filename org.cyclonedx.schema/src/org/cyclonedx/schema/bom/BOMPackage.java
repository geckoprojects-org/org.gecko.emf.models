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
package org.cyclonedx.schema.bom;


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
 *               
 *   <name>CycloneDX Bill of Materials Standard</name>
 *               
 *   <url>https://cyclonedx.org/</url>
 *               
 *   <license uri="http://www.apache.org/licenses/LICENSE-2.0" version="2.0">Apache License, Version 2.0</license>
 *           
 * 
 * <!-- end-model-doc -->
 * @see org.cyclonedx.schema.bom.BOMFactory
 * @model kind="package"
 *        annotation="http://www.w3.org/2007/XMLSchema-versioning maxVersion='1.1' minVersion='1.0'"
 * @generated
 */
@ProviderType
@EPackage(uri = BOMPackage.eNS_URI, genModel = "/model/bom-1.6.genmodel", genModelSourceLocations = {"model/bom-1.6.genmodel","org.cyclonedx.schema/model/bom-1.6.genmodel"}, ecore="/model/bom.ecore", ecoreSourceLocations="/model/bom.ecore")
public interface BOMPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bom";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cyclonedx.org/schema/bom/1.6";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bom";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BOMPackage eINSTANCE = org.cyclonedx.schema.bom.impl.BOMPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.AdvisoriesTypeImpl <em>Advisories Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.AdvisoriesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAdvisoriesType()
	 * @generated
	 */
	int ADVISORIES_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Advisory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVISORIES_TYPE__ADVISORY = 0;

	/**
	 * The number of structural features of the '<em>Advisories Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVISORIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Advisories Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVISORIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.AdvisoryTypeImpl <em>Advisory Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.AdvisoryTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAdvisoryType()
	 * @generated
	 */
	int ADVISORY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVISORY_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVISORY_TYPE__URL = 1;

	/**
	 * The number of structural features of the '<em>Advisory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVISORY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Advisory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVISORY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.AffectsTypeImpl <em>Affects Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.AffectsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAffectsType()
	 * @generated
	 */
	int AFFECTS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTS_TYPE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Affects Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Affects Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.AffirmationTypeImpl <em>Affirmation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.AffirmationTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAffirmationType()
	 * @generated
	 */
	int AFFIRMATION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFIRMATION_TYPE__STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Signatories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFIRMATION_TYPE__SIGNATORIES = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFIRMATION_TYPE__ANY = 2;

	/**
	 * The number of structural features of the '<em>Affirmation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFIRMATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Affirmation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFIRMATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.AlgorithmPropertiesTypeImpl <em>Algorithm Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.AlgorithmPropertiesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAlgorithmPropertiesType()
	 * @generated
	 */
	int ALGORITHM_PROPERTIES_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_PROPERTIES_TYPE__PRIMITIVE = 0;

	/**
	 * The feature id for the '<em><b>Parameter Set Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_PROPERTIES_TYPE__PARAMETER_SET_IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Curve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_PROPERTIES_TYPE__CURVE = 2;

	/**
	 * The feature id for the '<em><b>Execution Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_PROPERTIES_TYPE__EXECUTION_ENVIRONMENT = 3;

	/**
	 * The feature id for the '<em><b>Implementation Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_PROPERTIES_TYPE__IMPLEMENTATION_PLATFORM = 4;

	/**
	 * The feature id for the '<em><b>Certification Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_PROPERTIES_TYPE__CERTIFICATION_LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_PROPERTIES_TYPE__MODE = 6;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_PROPERTIES_TYPE__PADDING = 7;

	/**
	 * The feature id for the '<em><b>Crypto Functions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_PROPERTIES_TYPE__CRYPTO_FUNCTIONS = 8;

	/**
	 * The feature id for the '<em><b>Classical Security Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_PROPERTIES_TYPE__CLASSICAL_SECURITY_LEVEL = 9;

	/**
	 * The feature id for the '<em><b>Nist Quantum Security Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_PROPERTIES_TYPE__NIST_QUANTUM_SECURITY_LEVEL = 10;

	/**
	 * The number of structural features of the '<em>Algorithm Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_PROPERTIES_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Algorithm Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.AlgorithmsTypeImpl <em>Algorithms Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.AlgorithmsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAlgorithmsType()
	 * @generated
	 */
	int ALGORITHMS_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHMS_TYPE__ALGORITHM = 0;

	/**
	 * The number of structural features of the '<em>Algorithms Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHMS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Algorithms Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHMS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.AliasesTypeImpl <em>Aliases Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.AliasesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAliasesType()
	 * @generated
	 */
	int ALIASES_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIASES_TYPE__ALIAS = 0;

	/**
	 * The number of structural features of the '<em>Aliases Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIASES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Aliases Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIASES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.AliasesType1Impl <em>Aliases Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.AliasesType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAliasesType1()
	 * @generated
	 */
	int ALIASES_TYPE1 = 7;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIASES_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIASES_TYPE1__ALIAS = 1;

	/**
	 * The number of structural features of the '<em>Aliases Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIASES_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Aliases Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIASES_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.AltIdsTypeImpl <em>Alt Ids Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.AltIdsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAltIdsType()
	 * @generated
	 */
	int ALT_IDS_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Alt Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_IDS_TYPE__ALT_ID = 0;

	/**
	 * The number of structural features of the '<em>Alt Ids Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_IDS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Alt Ids Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_IDS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.AnalysisTypeImpl <em>Analysis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.AnalysisTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAnalysisType()
	 * @generated
	 */
	int ANALYSIS_TYPE = 9;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_TYPE__STATE = 0;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_TYPE__JUSTIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Responses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_TYPE__RESPONSES = 2;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_TYPE__DETAIL = 3;

	/**
	 * The feature id for the '<em><b>First Issued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_TYPE__FIRST_ISSUED = 4;

	/**
	 * The feature id for the '<em><b>Last Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_TYPE__LAST_UPDATED = 5;

	/**
	 * The number of structural features of the '<em>Analysis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Analysis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.AnnotationsTypeImpl <em>Annotations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.AnnotationsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAnnotationsType()
	 * @generated
	 */
	int ANNOTATIONS_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS_TYPE__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Annotations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Annotations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.AnnotationTypeImpl <em>Annotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.AnnotationTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAnnotationType()
	 * @generated
	 */
	int ANNOTATION_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Subjects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__SUBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Annotator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__ANNOTATOR = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__TEXT = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__ANY = 4;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__BOM_REF = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.AnnotatorChoiceTypeImpl <em>Annotator Choice Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.AnnotatorChoiceTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAnnotatorChoiceType()
	 * @generated
	 */
	int ANNOTATOR_CHOICE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATOR_CHOICE_TYPE__ORGANIZATION = 0;

	/**
	 * The feature id for the '<em><b>Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATOR_CHOICE_TYPE__INDIVIDUAL = 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATOR_CHOICE_TYPE__COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATOR_CHOICE_TYPE__SERVICE = 3;

	/**
	 * The number of structural features of the '<em>Annotator Choice Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATOR_CHOICE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Annotator Choice Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATOR_CHOICE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ApproachTypeImpl <em>Approach Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ApproachTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getApproachType()
	 * @generated
	 */
	int APPROACH_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROACH_TYPE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Approach Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROACH_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Approach Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROACH_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.AssembliesTypeImpl <em>Assemblies Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.AssembliesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAssembliesType()
	 * @generated
	 */
	int ASSEMBLIES_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLIES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Assembly</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLIES_TYPE__ASSEMBLY = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLIES_TYPE__ANY = 2;

	/**
	 * The number of structural features of the '<em>Assemblies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLIES_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Assemblies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.AssessorsTypeImpl <em>Assessors Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.AssessorsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAssessorsType()
	 * @generated
	 */
	int ASSESSORS_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Assessor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSORS_TYPE__ASSESSOR = 0;

	/**
	 * The number of structural features of the '<em>Assessors Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSORS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Assessors Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSORS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.AssessorTypeImpl <em>Assessor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.AssessorTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAssessorType()
	 * @generated
	 */
	int ASSESSOR_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Third Party</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSOR_TYPE__THIRD_PARTY = 0;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSOR_TYPE__ORGANIZATION = 1;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSOR_TYPE__BOM_REF = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSOR_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Assessor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSOR_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Assessor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSOR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.AttachedTextTypeImpl <em>Attached Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.AttachedTextTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAttachedTextType()
	 * @generated
	 */
	int ATTACHED_TEXT_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHED_TEXT_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHED_TEXT_TYPE__CONTENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHED_TEXT_TYPE__ENCODING = 2;

	/**
	 * The number of structural features of the '<em>Attached Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHED_TEXT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attached Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHED_TEXT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.AttestationsTypeImpl <em>Attestations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.AttestationsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAttestationsType()
	 * @generated
	 */
	int ATTESTATIONS_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Attestation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTESTATIONS_TYPE__ATTESTATION = 0;

	/**
	 * The number of structural features of the '<em>Attestations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTESTATIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attestations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTESTATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.AttestationTypeImpl <em>Attestation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.AttestationTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAttestationType()
	 * @generated
	 */
	int ATTESTATION_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTESTATION_TYPE__SUMMARY = 0;

	/**
	 * The feature id for the '<em><b>Assessor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTESTATION_TYPE__ASSESSOR = 1;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTESTATION_TYPE__MAP = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTESTATION_TYPE__ANY = 3;

	/**
	 * The number of structural features of the '<em>Attestation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTESTATION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Attestation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTESTATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.AuthorsTypeImpl <em>Authors Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.AuthorsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAuthorsType()
	 * @generated
	 */
	int AUTHORS_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE__AUTHOR = 1;

	/**
	 * The number of structural features of the '<em>Authors Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Authors Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.AuthorsType1Impl <em>Authors Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.AuthorsType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAuthorsType1()
	 * @generated
	 */
	int AUTHORS_TYPE1 = 21;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE1__AUTHOR = 1;

	/**
	 * The number of structural features of the '<em>Authors Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Authors Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.BomReferenceTypeImpl <em>Bom Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.BomReferenceTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getBomReferenceType()
	 * @generated
	 */
	int BOM_REFERENCE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_REFERENCE_TYPE__REF = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_REFERENCE_TYPE__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Bom Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_REFERENCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bom Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_REFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.BomTypeImpl <em>Bom Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.BomTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getBomType()
	 * @generated
	 */
	int BOM_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_TYPE__METADATA = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_TYPE__COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_TYPE__SERVICES = 2;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_TYPE__EXTERNAL_REFERENCES = 3;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_TYPE__DEPENDENCIES = 4;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_TYPE__COMPOSITIONS = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_TYPE__PROPERTIES = 6;

	/**
	 * The feature id for the '<em><b>Vulnerabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_TYPE__VULNERABILITIES = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_TYPE__ANNOTATIONS = 8;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_TYPE__FORMULATION = 9;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_TYPE__DECLARATIONS = 10;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_TYPE__DEFINITIONS = 11;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_TYPE__ANY = 12;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_TYPE__SERIAL_NUMBER = 13;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_TYPE__VERSION = 14;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_TYPE__ANY_ATTRIBUTE = 15;

	/**
	 * The number of structural features of the '<em>Bom Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_TYPE_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Bom Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.CallstackTypeImpl <em>Callstack Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.CallstackTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCallstackType()
	 * @generated
	 */
	int CALLSTACK_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Frames</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLSTACK_TYPE__FRAMES = 0;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLSTACK_TYPE__TOOLS = 1;

	/**
	 * The number of structural features of the '<em>Callstack Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLSTACK_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Callstack Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLSTACK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.CertificatePropertiesTypeImpl <em>Certificate Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.CertificatePropertiesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCertificatePropertiesType()
	 * @generated
	 */
	int CERTIFICATE_PROPERTIES_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Subject Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_PROPERTIES_TYPE__SUBJECT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Issuer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_PROPERTIES_TYPE__ISSUER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Not Valid Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_PROPERTIES_TYPE__NOT_VALID_BEFORE = 2;

	/**
	 * The feature id for the '<em><b>Not Valid After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_PROPERTIES_TYPE__NOT_VALID_AFTER = 3;

	/**
	 * The feature id for the '<em><b>Signature Algorithm Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_PROPERTIES_TYPE__SIGNATURE_ALGORITHM_REF = 4;

	/**
	 * The feature id for the '<em><b>Subject Public Key Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_PROPERTIES_TYPE__SUBJECT_PUBLIC_KEY_REF = 5;

	/**
	 * The feature id for the '<em><b>Certificate Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_PROPERTIES_TYPE__CERTIFICATE_FORMAT = 6;

	/**
	 * The feature id for the '<em><b>Certificate Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_PROPERTIES_TYPE__CERTIFICATE_EXTENSION = 7;

	/**
	 * The number of structural features of the '<em>Certificate Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_PROPERTIES_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Certificate Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.CipherSuitesTypeImpl <em>Cipher Suites Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.CipherSuitesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCipherSuitesType()
	 * @generated
	 */
	int CIPHER_SUITES_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Cipher Suite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIPHER_SUITES_TYPE__CIPHER_SUITE = 0;

	/**
	 * The number of structural features of the '<em>Cipher Suites Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIPHER_SUITES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cipher Suites Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIPHER_SUITES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.CipherSuiteTypeImpl <em>Cipher Suite Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.CipherSuiteTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCipherSuiteType()
	 * @generated
	 */
	int CIPHER_SUITE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIPHER_SUITE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Algorithms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIPHER_SUITE_TYPE__ALGORITHMS = 1;

	/**
	 * The feature id for the '<em><b>Identifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIPHER_SUITE_TYPE__IDENTIFIERS = 2;

	/**
	 * The number of structural features of the '<em>Cipher Suite Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIPHER_SUITE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cipher Suite Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIPHER_SUITE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ClaimsTypeImpl <em>Claims Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ClaimsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getClaimsType()
	 * @generated
	 */
	int CLAIMS_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Claim</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIMS_TYPE__CLAIM = 0;

	/**
	 * The number of structural features of the '<em>Claims Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIMS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Claims Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIMS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ClaimsType1Impl <em>Claims Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ClaimsType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getClaimsType1()
	 * @generated
	 */
	int CLAIMS_TYPE1 = 29;

	/**
	 * The feature id for the '<em><b>Claim</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIMS_TYPE1__CLAIM = 0;

	/**
	 * The number of structural features of the '<em>Claims Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIMS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Claims Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIMS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ClaimTypeImpl <em>Claim Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ClaimTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getClaimType()
	 * @generated
	 */
	int CLAIM_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_TYPE__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_TYPE__PREDICATE = 1;

	/**
	 * The feature id for the '<em><b>Mitigation Strategies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_TYPE__MITIGATION_STRATEGIES = 2;

	/**
	 * The feature id for the '<em><b>Reasoning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_TYPE__REASONING = 3;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_TYPE__EVIDENCE = 4;

	/**
	 * The feature id for the '<em><b>Counter Evidence</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_TYPE__COUNTER_EVIDENCE = 5;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_TYPE__EXTERNAL_REFERENCES = 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_TYPE__ANY = 7;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_TYPE__BOM_REF = 8;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_TYPE__ANY_ATTRIBUTE = 9;

	/**
	 * The number of structural features of the '<em>Claim Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Claim Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.Co2MeasureTypeImpl <em>Co2 Measure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.Co2MeasureTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCo2MeasureType()
	 * @generated
	 */
	int CO2_MEASURE_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO2_MEASURE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO2_MEASURE_TYPE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Co2 Measure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO2_MEASURE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Co2 Measure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO2_MEASURE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.CollectionTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCollectionType()
	 * @generated
	 */
	int COLLECTION_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Graphic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__GRAPHIC = 0;

	/**
	 * The number of structural features of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.CollectionType1Impl <em>Collection Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.CollectionType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCollectionType1()
	 * @generated
	 */
	int COLLECTION_TYPE1 = 33;

	/**
	 * The feature id for the '<em><b>Graphic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE1__GRAPHIC = 0;

	/**
	 * The number of structural features of the '<em>Collection Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Collection Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.CommandsTypeImpl <em>Commands Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.CommandsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCommandsType()
	 * @generated
	 */
	int COMMANDS_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDS_TYPE__COMMAND = 0;

	/**
	 * The number of structural features of the '<em>Commands Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Commands Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.CommandTypeImpl <em>Command Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.CommandTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCommandType()
	 * @generated
	 */
	int COMMAND_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TYPE__EXECUTED = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TYPE__PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Command Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Command Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.CommitsTypeImpl <em>Commits Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.CommitsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCommitsType()
	 * @generated
	 */
	int COMMITS_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Commit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITS_TYPE__COMMIT = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITS_TYPE__ANY = 2;

	/**
	 * The number of structural features of the '<em>Commits Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Commits Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.CommitTypeImpl <em>Commit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.CommitTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCommitType()
	 * @generated
	 */
	int COMMIT_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_TYPE__UID = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_TYPE__URL = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_TYPE__AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Committer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_TYPE__COMMITTER = 3;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_TYPE__MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_TYPE__ANY = 5;

	/**
	 * The number of structural features of the '<em>Commit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Commit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ComponentImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 38;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUPPLIER = 0;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MANUFACTURER = 1;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__AUTHORS = 2;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__AUTHOR = 3;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PUBLISHER = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GROUP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__VERSION = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SCOPE = 9;

	/**
	 * The feature id for the '<em><b>Hashes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__HASHES = 10;

	/**
	 * The feature id for the '<em><b>Licenses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LICENSES = 11;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COPYRIGHT = 12;

	/**
	 * The feature id for the '<em><b>Cpe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CPE = 13;

	/**
	 * The feature id for the '<em><b>Purl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PURL = 14;

	/**
	 * The feature id for the '<em><b>Omnibor Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OMNIBOR_ID = 15;

	/**
	 * The feature id for the '<em><b>Swhid</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SWHID = 16;

	/**
	 * The feature id for the '<em><b>Swid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SWID = 17;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MODIFIED = 18;

	/**
	 * The feature id for the '<em><b>Pedigree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PEDIGREE = 19;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__EXTERNAL_REFERENCES = 20;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROPERTIES = 21;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENTS = 22;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__EVIDENCE = 23;

	/**
	 * The feature id for the '<em><b>Release Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__RELEASE_NOTES = 24;

	/**
	 * The feature id for the '<em><b>Model Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MODEL_CARD = 25;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DATA = 26;

	/**
	 * The feature id for the '<em><b>Crypto Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CRYPTO_PROPERTIES = 27;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TAGS = 28;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ANY = 29;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BOM_REF = 30;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MIME_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TYPE = 32;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ANY_ATTRIBUTE = 33;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 34;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ComponentDataTypeImpl <em>Component Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ComponentDataTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getComponentDataType()
	 * @generated
	 */
	int COMPONENT_DATA_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATA_TYPE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATA_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATA_TYPE__CONTENTS = 2;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATA_TYPE__CLASSIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Sensitive Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATA_TYPE__SENSITIVE_DATA = 4;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATA_TYPE__GRAPHICS = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATA_TYPE__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Governance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATA_TYPE__GOVERNANCE = 7;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATA_TYPE__BOM_REF = 8;

	/**
	 * The number of structural features of the '<em>Component Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATA_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Component Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ComponentEvidenceTypeImpl <em>Component Evidence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ComponentEvidenceTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getComponentEvidenceType()
	 * @generated
	 */
	int COMPONENT_EVIDENCE_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EVIDENCE_TYPE__IDENTITY = 0;

	/**
	 * The feature id for the '<em><b>Occurrences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EVIDENCE_TYPE__OCCURRENCES = 1;

	/**
	 * The feature id for the '<em><b>Callstack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EVIDENCE_TYPE__CALLSTACK = 2;

	/**
	 * The feature id for the '<em><b>Licenses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EVIDENCE_TYPE__LICENSES = 3;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EVIDENCE_TYPE__COPYRIGHT = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EVIDENCE_TYPE__ANY = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EVIDENCE_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Component Evidence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EVIDENCE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Component Evidence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EVIDENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ComponentsTypeImpl <em>Components Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ComponentsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getComponentsType()
	 * @generated
	 */
	int COMPONENTS_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_TYPE__COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_TYPE__ANY = 2;

	/**
	 * The number of structural features of the '<em>Components Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Components Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ComponentsType1Impl <em>Components Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ComponentsType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getComponentsType1()
	 * @generated
	 */
	int COMPONENTS_TYPE1 = 42;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_TYPE1__COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Components Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Components Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ComponentsType2Impl <em>Components Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ComponentsType2Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getComponentsType2()
	 * @generated
	 */
	int COMPONENTS_TYPE2 = 43;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_TYPE2__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_TYPE2__COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_TYPE2__ANY = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_TYPE2__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Components Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_TYPE2_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Components Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_TYPE2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.CompositionsTypeImpl <em>Compositions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.CompositionsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCompositionsType()
	 * @generated
	 */
	int COMPOSITIONS_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITIONS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITIONS_TYPE__COMPOSITION = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITIONS_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITIONS_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Compositions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITIONS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Compositions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.CompositionTypeImpl <em>Composition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.CompositionTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCompositionType()
	 * @generated
	 */
	int COMPOSITION_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_TYPE__AGGREGATE = 1;

	/**
	 * The feature id for the '<em><b>Assemblies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_TYPE__ASSEMBLIES = 2;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_TYPE__DEPENDENCIES = 3;

	/**
	 * The feature id for the '<em><b>Vulnerabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_TYPE__VULNERABILITIES = 4;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_TYPE__BOM_REF = 5;

	/**
	 * The number of structural features of the '<em>Composition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Composition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ConditionsTypeImpl <em>Conditions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ConditionsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getConditionsType()
	 * @generated
	 */
	int CONDITIONS_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONS_TYPE__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Conditions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Conditions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ConditionTypeImpl <em>Condition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ConditionTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getConditionType()
	 * @generated
	 */
	int CONDITION_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__PROPERTIES = 2;

	/**
	 * The number of structural features of the '<em>Condition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Condition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ConfidenceIntervalTypeImpl <em>Confidence Interval Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ConfidenceIntervalTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getConfidenceIntervalType()
	 * @generated
	 */
	int CONFIDENCE_INTERVAL_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE_INTERVAL_TYPE__LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE_INTERVAL_TYPE__UPPER_BOUND = 1;

	/**
	 * The number of structural features of the '<em>Confidence Interval Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE_INTERVAL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Confidence Interval Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE_INTERVAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ConfidenceTypeImpl <em>Confidence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ConfidenceTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getConfidenceType()
	 * @generated
	 */
	int CONFIDENCE_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE_TYPE__SCORE = 0;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE_TYPE__RATIONALE = 1;

	/**
	 * The number of structural features of the '<em>Confidence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Confidence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ConformanceTypeImpl <em>Conformance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ConformanceTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getConformanceType()
	 * @generated
	 */
	int CONFORMANCE_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_TYPE__SCORE = 0;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_TYPE__RATIONALE = 1;

	/**
	 * The feature id for the '<em><b>Mitigation Strategies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_TYPE__MITIGATION_STRATEGIES = 2;

	/**
	 * The number of structural features of the '<em>Conformance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Conformance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ConsiderationsTypeImpl <em>Considerations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ConsiderationsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getConsiderationsType()
	 * @generated
	 */
	int CONSIDERATIONS_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDERATIONS_TYPE__USERS = 0;

	/**
	 * The feature id for the '<em><b>Use Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDERATIONS_TYPE__USE_CASES = 1;

	/**
	 * The feature id for the '<em><b>Technical Limitations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDERATIONS_TYPE__TECHNICAL_LIMITATIONS = 2;

	/**
	 * The feature id for the '<em><b>Performance Tradeoffs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDERATIONS_TYPE__PERFORMANCE_TRADEOFFS = 3;

	/**
	 * The feature id for the '<em><b>Ethical Considerations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDERATIONS_TYPE__ETHICAL_CONSIDERATIONS = 4;

	/**
	 * The feature id for the '<em><b>Environmental Considerations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDERATIONS_TYPE__ENVIRONMENTAL_CONSIDERATIONS = 5;

	/**
	 * The feature id for the '<em><b>Fairness Assessments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDERATIONS_TYPE__FAIRNESS_ASSESSMENTS = 6;

	/**
	 * The number of structural features of the '<em>Considerations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDERATIONS_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Considerations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDERATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ContentsTypeImpl <em>Contents Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ContentsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getContentsType()
	 * @generated
	 */
	int CONTENTS_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTS_TYPE__ATTACHMENT = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTS_TYPE__URL = 1;

	/**
	 * The number of structural features of the '<em>Contents Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Contents Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ContentsType1Impl <em>Contents Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ContentsType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getContentsType1()
	 * @generated
	 */
	int CONTENTS_TYPE1 = 53;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTS_TYPE1__ATTACHMENT = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTS_TYPE1__URL = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTS_TYPE1__PROPERTIES = 2;

	/**
	 * The number of structural features of the '<em>Contents Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTS_TYPE1_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Contents Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.CopyrightsTypeImpl <em>Copyrights Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.CopyrightsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCopyrightsType()
	 * @generated
	 */
	int COPYRIGHTS_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHTS_TYPE__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Copyrights Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Copyrights Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.CounterClaimsTypeImpl <em>Counter Claims Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.CounterClaimsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCounterClaimsType()
	 * @generated
	 */
	int COUNTER_CLAIMS_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Counter Claim</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_CLAIMS_TYPE__COUNTER_CLAIM = 0;

	/**
	 * The number of structural features of the '<em>Counter Claims Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_CLAIMS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Counter Claims Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_CLAIMS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.CreditsTypeImpl <em>Credits Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.CreditsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCreditsType()
	 * @generated
	 */
	int CREDITS_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDITS_TYPE__ORGANIZATIONS = 0;

	/**
	 * The feature id for the '<em><b>Individuals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDITS_TYPE__INDIVIDUALS = 1;

	/**
	 * The number of structural features of the '<em>Credits Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDITS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Credits Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDITS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.CryptoFunctionsTypeImpl <em>Crypto Functions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.CryptoFunctionsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCryptoFunctionsType()
	 * @generated
	 */
	int CRYPTO_FUNCTIONS_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Crypto Function</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_FUNCTIONS_TYPE__CRYPTO_FUNCTION = 0;

	/**
	 * The number of structural features of the '<em>Crypto Functions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_FUNCTIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Crypto Functions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_FUNCTIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.CryptoPropertiesTypeImpl <em>Crypto Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.CryptoPropertiesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCryptoPropertiesType()
	 * @generated
	 */
	int CRYPTO_PROPERTIES_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Asset Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_PROPERTIES_TYPE__ASSET_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Algorithm Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_PROPERTIES_TYPE__ALGORITHM_PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Certificate Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_PROPERTIES_TYPE__CERTIFICATE_PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Related Crypto Material Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_PROPERTIES_TYPE__RELATED_CRYPTO_MATERIAL_PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Protocol Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_PROPERTIES_TYPE__PROTOCOL_PROPERTIES = 4;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_PROPERTIES_TYPE__OID = 5;

	/**
	 * The number of structural features of the '<em>Crypto Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_PROPERTIES_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Crypto Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.CustodiansTypeImpl <em>Custodians Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.CustodiansTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCustodiansType()
	 * @generated
	 */
	int CUSTODIANS_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODIANS_TYPE__CUSTODIAN = 0;

	/**
	 * The number of structural features of the '<em>Custodians Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODIANS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Custodians Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODIANS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.CwesTypeImpl <em>Cwes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.CwesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCwesType()
	 * @generated
	 */
	int CWES_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Cwe</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWES_TYPE__CWE = 0;

	/**
	 * The number of structural features of the '<em>Cwes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cwes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.DataClassificationTypeImpl <em>Data Classification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.DataClassificationTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getDataClassificationType()
	 * @generated
	 */
	int DATA_CLASSIFICATION_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASSIFICATION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASSIFICATION_TYPE__FLOW = 1;

	/**
	 * The number of structural features of the '<em>Data Classification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASSIFICATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Classification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASSIFICATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.DataflowTypeImpl <em>Dataflow Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.DataflowTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getDataflowType()
	 * @generated
	 */
	int DATAFLOW_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_TYPE__CLASSIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Governance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_TYPE__GOVERNANCE = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_TYPE__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_TYPE__DESTINATION = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_TYPE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_TYPE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Dataflow Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Dataflow Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.DataGovernanceImpl <em>Data Governance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.DataGovernanceImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getDataGovernance()
	 * @generated
	 */
	int DATA_GOVERNANCE = 63;

	/**
	 * The feature id for the '<em><b>Custodians</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GOVERNANCE__CUSTODIANS = 0;

	/**
	 * The feature id for the '<em><b>Stewards</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GOVERNANCE__STEWARDS = 1;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GOVERNANCE__OWNERS = 2;

	/**
	 * The number of structural features of the '<em>Data Governance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GOVERNANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Governance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GOVERNANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.DatasetsTypeImpl <em>Datasets Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.DatasetsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getDatasetsType()
	 * @generated
	 */
	int DATASETS_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASETS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASETS_TYPE__REF = 1;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASETS_TYPE__DATASET = 2;

	/**
	 * The number of structural features of the '<em>Datasets Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASETS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Datasets Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASETS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.DataTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CONTENTS = 1;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CLASSIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Sensitive Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SENSITIVE_DATA = 3;

	/**
	 * The feature id for the '<em><b>Governance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__GOVERNANCE = 4;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.DataType1Impl <em>Data Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.DataType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getDataType1()
	 * @generated
	 */
	int DATA_TYPE1 = 66;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE1__CLASSIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Dataflow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE1__DATAFLOW = 2;

	/**
	 * The number of structural features of the '<em>Data Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE1_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.DeclarationsTypeImpl <em>Declarations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.DeclarationsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getDeclarationsType()
	 * @generated
	 */
	int DECLARATIONS_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Assessors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIONS_TYPE__ASSESSORS = 0;

	/**
	 * The feature id for the '<em><b>Attestations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIONS_TYPE__ATTESTATIONS = 1;

	/**
	 * The feature id for the '<em><b>Claims</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIONS_TYPE__CLAIMS = 2;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIONS_TYPE__EVIDENCE = 3;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIONS_TYPE__TARGETS = 4;

	/**
	 * The feature id for the '<em><b>Affirmation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIONS_TYPE__AFFIRMATION = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIONS_TYPE__ANY = 6;

	/**
	 * The number of structural features of the '<em>Declarations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIONS_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Declarations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.DefinitionsTypeImpl <em>Definitions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.DefinitionsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getDefinitionsType()
	 * @generated
	 */
	int DEFINITIONS_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Standards</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__STANDARDS = 0;

	/**
	 * The number of structural features of the '<em>Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.DependenciesTypeImpl <em>Dependencies Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.DependenciesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getDependenciesType()
	 * @generated
	 */
	int DEPENDENCIES_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE__DEPENDENCY = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE__ANY = 2;

	/**
	 * The number of structural features of the '<em>Dependencies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dependencies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.DependenciesType1Impl <em>Dependencies Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.DependenciesType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getDependenciesType1()
	 * @generated
	 */
	int DEPENDENCIES_TYPE1 = 70;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE1__DEPENDENCY = 1;

	/**
	 * The number of structural features of the '<em>Dependencies Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dependencies Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.DependencyTypeImpl <em>Dependency Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.DependencyTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getDependencyType()
	 * @generated
	 */
	int DEPENDENCY_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE__DEPENDENCY = 1;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE__PROVIDES = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE__REF = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Dependency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Dependency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.DescriptionsTypeImpl <em>Descriptions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.DescriptionsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getDescriptionsType()
	 * @generated
	 */
	int DESCRIPTIONS_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIONS_TYPE__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Descriptions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Descriptions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.DestinationTypeImpl <em>Destination Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.DestinationTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getDestinationType()
	 * @generated
	 */
	int DESTINATION_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_TYPE__URL = 1;

	/**
	 * The number of structural features of the '<em>Destination Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Destination Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.DiffTypeImpl <em>Diff Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.DiffTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getDiffType()
	 * @generated
	 */
	int DIFF_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TYPE__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TYPE__URL = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TYPE__ANY = 2;

	/**
	 * The number of structural features of the '<em>Diff Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Diff Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.DocumentRootImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 75;

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
	 * The feature id for the '<em><b>Bom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOM = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.EndpointsTypeImpl <em>Endpoints Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.EndpointsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getEndpointsType()
	 * @generated
	 */
	int ENDPOINTS_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINTS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINTS_TYPE__ENDPOINT = 1;

	/**
	 * The number of structural features of the '<em>Endpoints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINTS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Endpoints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.EnergyConsumptionsTypeImpl <em>Energy Consumptions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.EnergyConsumptionsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getEnergyConsumptionsType()
	 * @generated
	 */
	int ENERGY_CONSUMPTIONS_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMPTIONS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Energy Consumption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMPTIONS_TYPE__ENERGY_CONSUMPTION = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMPTIONS_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMPTIONS_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Energy Consumptions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMPTIONS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Energy Consumptions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMPTIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.EnergyConsumptionTypeImpl <em>Energy Consumption Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.EnergyConsumptionTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getEnergyConsumptionType()
	 * @generated
	 */
	int ENERGY_CONSUMPTION_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMPTION_TYPE__ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Energy Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMPTION_TYPE__ENERGY_PROVIDERS = 1;

	/**
	 * The feature id for the '<em><b>Activity Energy Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMPTION_TYPE__ACTIVITY_ENERGY_COST = 2;

	/**
	 * The feature id for the '<em><b>Co2 Cost Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMPTION_TYPE__CO2_COST_EQUIVALENT = 3;

	/**
	 * The feature id for the '<em><b>Co2 Cost Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMPTION_TYPE__CO2_COST_OFFSET = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMPTION_TYPE__PROPERTIES = 5;

	/**
	 * The number of structural features of the '<em>Energy Consumption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMPTION_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Energy Consumption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.EnergyMeasureTypeImpl <em>Energy Measure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.EnergyMeasureTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getEnergyMeasureType()
	 * @generated
	 */
	int ENERGY_MEASURE_TYPE = 79;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_MEASURE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_MEASURE_TYPE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Energy Measure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_MEASURE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Energy Measure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_MEASURE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.EnergyProviderTypeImpl <em>Energy Provider Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.EnergyProviderTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getEnergyProviderType()
	 * @generated
	 */
	int ENERGY_PROVIDER_TYPE = 80;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROVIDER_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROVIDER_TYPE__ORGANIZATION = 1;

	/**
	 * The feature id for the '<em><b>Energy Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROVIDER_TYPE__ENERGY_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Energy Provided</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROVIDER_TYPE__ENERGY_PROVIDED = 3;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROVIDER_TYPE__EXTERNAL_REFERENCES = 4;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROVIDER_TYPE__BOM_REF = 5;

	/**
	 * The number of structural features of the '<em>Energy Provider Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROVIDER_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Energy Provider Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROVIDER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.EnvironmentalConsiderationsTypeImpl <em>Environmental Considerations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.EnvironmentalConsiderationsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getEnvironmentalConsiderationsType()
	 * @generated
	 */
	int ENVIRONMENTAL_CONSIDERATIONS_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Energy Consumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_CONSIDERATIONS_TYPE__ENERGY_CONSUMPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_CONSIDERATIONS_TYPE__PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Environmental Considerations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_CONSIDERATIONS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Environmental Considerations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_CONSIDERATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.EnvironmentVarsTypeImpl <em>Environment Vars Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.EnvironmentVarsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getEnvironmentVarsType()
	 * @generated
	 */
	int ENVIRONMENT_VARS_TYPE = 82;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Environment Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARS_TYPE__ENVIRONMENT_VAR = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARS_TYPE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Environment Vars Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Environment Vars Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.EnvironmentVarsType1Impl <em>Environment Vars Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.EnvironmentVarsType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getEnvironmentVarsType1()
	 * @generated
	 */
	int ENVIRONMENT_VARS_TYPE1 = 83;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARS_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Environment Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARS_TYPE1__ENVIRONMENT_VAR = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARS_TYPE1__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Environment Vars Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARS_TYPE1_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Environment Vars Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.EthicalConsiderationsTypeImpl <em>Ethical Considerations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.EthicalConsiderationsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getEthicalConsiderationsType()
	 * @generated
	 */
	int ETHICAL_CONSIDERATIONS_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Ethical Consideration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHICAL_CONSIDERATIONS_TYPE__ETHICAL_CONSIDERATION = 0;

	/**
	 * The number of structural features of the '<em>Ethical Considerations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHICAL_CONSIDERATIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ethical Considerations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHICAL_CONSIDERATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.EthicalConsiderationTypeImpl <em>Ethical Consideration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.EthicalConsiderationTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getEthicalConsiderationType()
	 * @generated
	 */
	int ETHICAL_CONSIDERATION_TYPE = 85;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHICAL_CONSIDERATION_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mitigation Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHICAL_CONSIDERATION_TYPE__MITIGATION_STRATEGY = 1;

	/**
	 * The number of structural features of the '<em>Ethical Consideration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHICAL_CONSIDERATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ethical Consideration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHICAL_CONSIDERATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.EventTypeImpl <em>Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.EventTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 86;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__UID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Time Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__TIME_RECEIVED = 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__DATA = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__TARGET = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__PROPERTIES = 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__ANY = 7;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__ANY_ATTRIBUTE = 8;

	/**
	 * The number of structural features of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.EvidenceTypeImpl <em>Evidence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.EvidenceTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getEvidenceType()
	 * @generated
	 */
	int EVIDENCE_TYPE = 87;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_TYPE__PROPERTY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_TYPE__DATA = 2;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_TYPE__CREATED = 3;

	/**
	 * The feature id for the '<em><b>Expires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_TYPE__EXPIRES = 4;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_TYPE__AUTHOR = 5;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_TYPE__REVIEWER = 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_TYPE__ANY = 7;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_TYPE__BOM_REF = 8;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_TYPE__ANY_ATTRIBUTE = 9;

	/**
	 * The number of structural features of the '<em>Evidence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Evidence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.EvidenceType1Impl <em>Evidence Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.EvidenceType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getEvidenceType1()
	 * @generated
	 */
	int EVIDENCE_TYPE1 = 88;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_TYPE1__EVIDENCE = 0;

	/**
	 * The number of structural features of the '<em>Evidence Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Evidence Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ExpressionTypeImpl <em>Expression Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ExpressionTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getExpressionType()
	 * @generated
	 */
	int EXPRESSION_TYPE = 89;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Acknowledgement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE__ACKNOWLEDGEMENT = 1;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE__BOM_REF = 2;

	/**
	 * The number of structural features of the '<em>Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ExternalReferenceImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getExternalReference()
	 * @generated
	 */
	int EXTERNAL_REFERENCE = 90;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__URL = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Hashes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__HASHES = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ExternalReferencesImpl <em>External References</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ExternalReferencesImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getExternalReferences()
	 * @generated
	 */
	int EXTERNAL_REFERENCES = 91;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCES__REFERENCE = 1;

	/**
	 * The number of structural features of the '<em>External References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>External References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.FairnessAssessmentsTypeImpl <em>Fairness Assessments Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.FairnessAssessmentsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getFairnessAssessmentsType()
	 * @generated
	 */
	int FAIRNESS_ASSESSMENTS_TYPE = 92;

	/**
	 * The feature id for the '<em><b>Fairness Assessment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIRNESS_ASSESSMENTS_TYPE__FAIRNESS_ASSESSMENT = 0;

	/**
	 * The number of structural features of the '<em>Fairness Assessments Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIRNESS_ASSESSMENTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Fairness Assessments Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIRNESS_ASSESSMENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.FairnessAssessmentTypeImpl <em>Fairness Assessment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.FairnessAssessmentTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getFairnessAssessmentType()
	 * @generated
	 */
	int FAIRNESS_ASSESSMENT_TYPE = 93;

	/**
	 * The feature id for the '<em><b>Group At Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIRNESS_ASSESSMENT_TYPE__GROUP_AT_RISK = 0;

	/**
	 * The feature id for the '<em><b>Benefits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIRNESS_ASSESSMENT_TYPE__BENEFITS = 1;

	/**
	 * The feature id for the '<em><b>Harms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIRNESS_ASSESSMENT_TYPE__HARMS = 2;

	/**
	 * The feature id for the '<em><b>Mitigation Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIRNESS_ASSESSMENT_TYPE__MITIGATION_STRATEGY = 3;

	/**
	 * The number of structural features of the '<em>Fairness Assessment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIRNESS_ASSESSMENT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Fairness Assessment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIRNESS_ASSESSMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.FormulationTypeImpl <em>Formulation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.FormulationTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getFormulationType()
	 * @generated
	 */
	int FORMULATION_TYPE = 94;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION_TYPE__FORMULA = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Formulation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Formulation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.FormulaTypeImpl <em>Formula Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.FormulaTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getFormulaType()
	 * @generated
	 */
	int FORMULA_TYPE = 95;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_TYPE__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_TYPE__SERVICES = 1;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_TYPE__WORKFLOWS = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_TYPE__PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_TYPE__BOM_REF = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Formula Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Formula Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.FramesTypeImpl <em>Frames Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.FramesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getFramesType()
	 * @generated
	 */
	int FRAMES_TYPE = 96;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMES_TYPE__FRAME = 0;

	/**
	 * The number of structural features of the '<em>Frames Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Frames Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.FrameTypeImpl <em>Frame Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.FrameTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getFrameType()
	 * @generated
	 */
	int FRAME_TYPE = 97;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__MODULE = 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__PARAMETERS = 3;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__LINE = 4;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__COLUMN = 5;

	/**
	 * The feature id for the '<em><b>Full Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__FULL_FILENAME = 6;

	/**
	 * The number of structural features of the '<em>Frame Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Frame Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.GraphicsCollectionTypeImpl <em>Graphics Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.GraphicsCollectionTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getGraphicsCollectionType()
	 * @generated
	 */
	int GRAPHICS_COLLECTION_TYPE = 98;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_COLLECTION_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_COLLECTION_TYPE__COLLECTION = 1;

	/**
	 * The number of structural features of the '<em>Graphics Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_COLLECTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Graphics Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_COLLECTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.GraphicsTypeImpl <em>Graphics Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.GraphicsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getGraphicsType()
	 * @generated
	 */
	int GRAPHICS_TYPE = 99;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_TYPE__COLLECTION = 1;

	/**
	 * The number of structural features of the '<em>Graphics Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Graphics Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.GraphicTypeImpl <em>Graphic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.GraphicTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getGraphicType()
	 * @generated
	 */
	int GRAPHIC_TYPE = 100;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_TYPE__IMAGE = 1;

	/**
	 * The number of structural features of the '<em>Graphic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Graphic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.GraphicType1Impl <em>Graphic Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.GraphicType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getGraphicType1()
	 * @generated
	 */
	int GRAPHIC_TYPE1 = 101;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_TYPE1__NAME = 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_TYPE1__IMAGE = 1;

	/**
	 * The number of structural features of the '<em>Graphic Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Graphic Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.HashesTypeImpl <em>Hashes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.HashesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getHashesType()
	 * @generated
	 */
	int HASHES_TYPE = 102;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHES_TYPE__HASH = 1;

	/**
	 * The number of structural features of the '<em>Hashes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hashes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.HashesType1Impl <em>Hashes Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.HashesType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getHashesType1()
	 * @generated
	 */
	int HASHES_TYPE1 = 103;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHES_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHES_TYPE1__HASH = 1;

	/**
	 * The number of structural features of the '<em>Hashes Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHES_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hashes Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHES_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.HashesType2Impl <em>Hashes Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.HashesType2Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getHashesType2()
	 * @generated
	 */
	int HASHES_TYPE2 = 104;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHES_TYPE2__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHES_TYPE2__HASH = 1;

	/**
	 * The number of structural features of the '<em>Hashes Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHES_TYPE2_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hashes Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHES_TYPE2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.HashTypeImpl <em>Hash Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.HashTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getHashType()
	 * @generated
	 */
	int HASH_TYPE = 105;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Alg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_TYPE__ALG = 1;

	/**
	 * The number of structural features of the '<em>Hash Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hash Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.IdentifiableActionTypeImpl <em>Identifiable Action Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.IdentifiableActionTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getIdentifiableActionType()
	 * @generated
	 */
	int IDENTIFIABLE_ACTION_TYPE = 106;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ACTION_TYPE__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ACTION_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ACTION_TYPE__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ACTION_TYPE__ANY = 3;

	/**
	 * The number of structural features of the '<em>Identifiable Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ACTION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Identifiable Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ACTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.IdentifiersTypeImpl <em>Identifiers Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.IdentifiersTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getIdentifiersType()
	 * @generated
	 */
	int IDENTIFIERS_TYPE = 107;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIERS_TYPE__IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Identifiers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Identifiers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.IdentityTypeImpl <em>Identity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.IdentityTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getIdentityType()
	 * @generated
	 */
	int IDENTITY_TYPE = 108;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_TYPE__FIELD = 0;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_TYPE__CONFIDENCE = 1;

	/**
	 * The feature id for the '<em><b>Concluded Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_TYPE__CONCLUDED_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_TYPE__METHODS = 3;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_TYPE__TOOLS = 4;

	/**
	 * The number of structural features of the '<em>Identity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Identity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.Ikev2TransformTypesTypeImpl <em>Ikev2 Transform Types Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.Ikev2TransformTypesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getIkev2TransformTypesType()
	 * @generated
	 */
	int IKEV2_TRANSFORM_TYPES_TYPE = 109;

	/**
	 * The feature id for the '<em><b>Encr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IKEV2_TRANSFORM_TYPES_TYPE__ENCR = 0;

	/**
	 * The feature id for the '<em><b>Prf</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IKEV2_TRANSFORM_TYPES_TYPE__PRF = 1;

	/**
	 * The feature id for the '<em><b>Integ</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IKEV2_TRANSFORM_TYPES_TYPE__INTEG = 2;

	/**
	 * The feature id for the '<em><b>Ke</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IKEV2_TRANSFORM_TYPES_TYPE__KE = 3;

	/**
	 * The feature id for the '<em><b>Esn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IKEV2_TRANSFORM_TYPES_TYPE__ESN = 4;

	/**
	 * The feature id for the '<em><b>Auth</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IKEV2_TRANSFORM_TYPES_TYPE__AUTH = 5;

	/**
	 * The number of structural features of the '<em>Ikev2 Transform Types Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IKEV2_TRANSFORM_TYPES_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Ikev2 Transform Types Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IKEV2_TRANSFORM_TYPES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.IndividualsTypeImpl <em>Individuals Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.IndividualsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getIndividualsType()
	 * @generated
	 */
	int INDIVIDUALS_TYPE = 110;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUALS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Individual</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUALS_TYPE__INDIVIDUAL = 1;

	/**
	 * The number of structural features of the '<em>Individuals Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUALS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Individuals Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUALS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.InputsTypeImpl <em>Inputs Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.InputsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getInputsType()
	 * @generated
	 */
	int INPUTS_TYPE = 111;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS_TYPE__INPUT = 0;

	/**
	 * The number of structural features of the '<em>Inputs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Inputs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.InputsType1Impl <em>Inputs Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.InputsType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getInputsType1()
	 * @generated
	 */
	int INPUTS_TYPE1 = 112;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS_TYPE1__INPUT = 0;

	/**
	 * The number of structural features of the '<em>Inputs Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Inputs Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.InputsType2Impl <em>Inputs Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.InputsType2Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getInputsType2()
	 * @generated
	 */
	int INPUTS_TYPE2 = 113;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS_TYPE2__INPUT = 0;

	/**
	 * The number of structural features of the '<em>Inputs Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Inputs Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS_TYPE2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.InputsType3Impl <em>Inputs Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.InputsType3Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getInputsType3()
	 * @generated
	 */
	int INPUTS_TYPE3 = 114;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS_TYPE3__INPUT = 0;

	/**
	 * The number of structural features of the '<em>Inputs Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS_TYPE3_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Inputs Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS_TYPE3_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.InputTypeImpl <em>Input Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.InputTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getInputType()
	 * @generated
	 */
	int INPUT_TYPE = 115;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Environment Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE__ENVIRONMENT_VARS = 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE__DATA = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE__SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE__TARGET = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE__PROPERTIES = 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE__ANY = 7;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE__ANY_ATTRIBUTE = 8;

	/**
	 * The number of structural features of the '<em>Input Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Input Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.InputType1Impl <em>Input Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.InputType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getInputType1()
	 * @generated
	 */
	int INPUT_TYPE1 = 116;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE1__FORMAT = 0;

	/**
	 * The number of structural features of the '<em>Input Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.IssueTypeImpl <em>Issue Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.IssueTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getIssueType()
	 * @generated
	 */
	int ISSUE_TYPE = 117;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TYPE__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TYPE__REFERENCES = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TYPE__ANY = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TYPE__TYPE = 6;

	/**
	 * The number of structural features of the '<em>Issue Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Issue Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.LevelsTypeImpl <em>Levels Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.LevelsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getLevelsType()
	 * @generated
	 */
	int LEVELS_TYPE = 118;

	/**
	 * The feature id for the '<em><b>Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVELS_TYPE__LEVEL = 0;

	/**
	 * The number of structural features of the '<em>Levels Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVELS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Levels Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVELS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.LevelTypeImpl <em>Level Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.LevelTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getLevelType()
	 * @generated
	 */
	int LEVEL_TYPE = 119;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_TYPE__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_TYPE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_TYPE__REQUIREMENTS = 3;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_TYPE__BOM_REF = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Level Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Level Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.LicenseChoiceTypeImpl <em>License Choice Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.LicenseChoiceTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getLicenseChoiceType()
	 * @generated
	 */
	int LICENSE_CHOICE_TYPE = 120;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_CHOICE_TYPE__LICENSE = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_CHOICE_TYPE__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>License Choice Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_CHOICE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>License Choice Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_CHOICE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.LicenseeTypeImpl <em>Licensee Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.LicenseeTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getLicenseeType()
	 * @generated
	 */
	int LICENSEE_TYPE = 121;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSEE_TYPE__ORGANIZATION = 0;

	/**
	 * The feature id for the '<em><b>Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSEE_TYPE__INDIVIDUAL = 1;

	/**
	 * The number of structural features of the '<em>Licensee Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSEE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Licensee Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSEE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.LicenseTypeImpl <em>License Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.LicenseTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getLicenseType()
	 * @generated
	 */
	int LICENSE_TYPE = 122;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TYPE__TEXT = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TYPE__URL = 3;

	/**
	 * The feature id for the '<em><b>Licensing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TYPE__LICENSING = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TYPE__PROPERTIES = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TYPE__ANY = 6;

	/**
	 * The feature id for the '<em><b>Acknowledgement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TYPE__ACKNOWLEDGEMENT = 7;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TYPE__BOM_REF = 8;

	/**
	 * The number of structural features of the '<em>License Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>License Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.LicenseTypesTypeImpl <em>License Types Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.LicenseTypesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getLicenseTypesType()
	 * @generated
	 */
	int LICENSE_TYPES_TYPE = 123;

	/**
	 * The feature id for the '<em><b>License Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TYPES_TYPE__LICENSE_TYPE = 0;

	/**
	 * The number of structural features of the '<em>License Types Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TYPES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>License Types Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TYPES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.LicensingTypeImpl <em>Licensing Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.LicensingTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getLicensingType()
	 * @generated
	 */
	int LICENSING_TYPE = 124;

	/**
	 * The feature id for the '<em><b>Alt Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSING_TYPE__ALT_IDS = 0;

	/**
	 * The feature id for the '<em><b>Licensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSING_TYPE__LICENSOR = 1;

	/**
	 * The feature id for the '<em><b>Licensee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSING_TYPE__LICENSEE = 2;

	/**
	 * The feature id for the '<em><b>Purchaser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSING_TYPE__PURCHASER = 3;

	/**
	 * The feature id for the '<em><b>Purchase Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSING_TYPE__PURCHASE_ORDER = 4;

	/**
	 * The feature id for the '<em><b>License Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSING_TYPE__LICENSE_TYPES = 5;

	/**
	 * The feature id for the '<em><b>Last Renewal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSING_TYPE__LAST_RENEWAL = 6;

	/**
	 * The feature id for the '<em><b>Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSING_TYPE__EXPIRATION = 7;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSING_TYPE__ANY = 8;

	/**
	 * The number of structural features of the '<em>Licensing Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSING_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Licensing Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.LicensorTypeImpl <em>Licensor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.LicensorTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getLicensorType()
	 * @generated
	 */
	int LICENSOR_TYPE = 125;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSOR_TYPE__ORGANIZATION = 0;

	/**
	 * The feature id for the '<em><b>Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSOR_TYPE__INDIVIDUAL = 1;

	/**
	 * The number of structural features of the '<em>Licensor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSOR_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Licensor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSOR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.LifecyclesTypeImpl <em>Lifecycles Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.LifecyclesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getLifecyclesType()
	 * @generated
	 */
	int LIFECYCLES_TYPE = 126;

	/**
	 * The feature id for the '<em><b>Lifecycle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLES_TYPE__LIFECYCLE = 0;

	/**
	 * The number of structural features of the '<em>Lifecycles Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Lifecycles Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.LifecycleTypeImpl <em>Lifecycle Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.LifecycleTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getLifecycleType()
	 * @generated
	 */
	int LIFECYCLE_TYPE = 127;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_TYPE__PHASE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_TYPE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Lifecycle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Lifecycle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.MapTypeImpl <em>Map Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.MapTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getMapType()
	 * @generated
	 */
	int MAP_TYPE = 128;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__REQUIREMENT = 0;

	/**
	 * The feature id for the '<em><b>Claims</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__CLAIMS = 1;

	/**
	 * The feature id for the '<em><b>Counter Claims</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__COUNTER_CLAIMS = 2;

	/**
	 * The feature id for the '<em><b>Conformance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__CONFORMANCE = 3;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__CONFIDENCE = 4;

	/**
	 * The number of structural features of the '<em>Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.MetadataImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 129;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Lifecycles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__LIFECYCLES = 1;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__TOOLS = 2;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__AUTHORS = 3;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__MANUFACTURER = 5;

	/**
	 * The feature id for the '<em><b>Manufacture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__MANUFACTURE = 6;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__SUPPLIER = 7;

	/**
	 * The feature id for the '<em><b>Licenses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__LICENSES = 8;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__PROPERTIES = 9;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__ANY = 10;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__ANY_ATTRIBUTE = 11;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.MethodsTypeImpl <em>Methods Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.MethodsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getMethodsType()
	 * @generated
	 */
	int METHODS_TYPE = 130;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODS_TYPE__METHOD = 0;

	/**
	 * The number of structural features of the '<em>Methods Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Methods Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.MethodTypeImpl <em>Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.MethodTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getMethodType()
	 * @generated
	 */
	int METHOD_TYPE = 131;

	/**
	 * The feature id for the '<em><b>Technique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE__TECHNIQUE = 0;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE__CONFIDENCE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.MitigationStrategiesTypeImpl <em>Mitigation Strategies Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.MitigationStrategiesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getMitigationStrategiesType()
	 * @generated
	 */
	int MITIGATION_STRATEGIES_TYPE = 132;

	/**
	 * The feature id for the '<em><b>Mitigation Strategy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATION_STRATEGIES_TYPE__MITIGATION_STRATEGY = 0;

	/**
	 * The number of structural features of the '<em>Mitigation Strategies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATION_STRATEGIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mitigation Strategies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATION_STRATEGIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.MitigationStrategiesType1Impl <em>Mitigation Strategies Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.MitigationStrategiesType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getMitigationStrategiesType1()
	 * @generated
	 */
	int MITIGATION_STRATEGIES_TYPE1 = 133;

	/**
	 * The feature id for the '<em><b>Mitigation Strategy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATION_STRATEGIES_TYPE1__MITIGATION_STRATEGY = 0;

	/**
	 * The number of structural features of the '<em>Mitigation Strategies Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATION_STRATEGIES_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mitigation Strategies Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATION_STRATEGIES_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ModelCardTypeImpl <em>Model Card Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ModelCardTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getModelCardType()
	 * @generated
	 */
	int MODEL_CARD_TYPE = 134;

	/**
	 * The feature id for the '<em><b>Model Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CARD_TYPE__MODEL_PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Quantitative Analysis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CARD_TYPE__QUANTITATIVE_ANALYSIS = 1;

	/**
	 * The feature id for the '<em><b>Considerations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CARD_TYPE__CONSIDERATIONS = 2;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CARD_TYPE__BOM_REF = 3;

	/**
	 * The number of structural features of the '<em>Model Card Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CARD_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Model Card Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CARD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ModelParametersTypeImpl <em>Model Parameters Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ModelParametersTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getModelParametersType()
	 * @generated
	 */
	int MODEL_PARAMETERS_TYPE = 135;

	/**
	 * The feature id for the '<em><b>Approach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETERS_TYPE__APPROACH = 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETERS_TYPE__TASK = 1;

	/**
	 * The feature id for the '<em><b>Architecture Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETERS_TYPE__ARCHITECTURE_FAMILY = 2;

	/**
	 * The feature id for the '<em><b>Model Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETERS_TYPE__MODEL_ARCHITECTURE = 3;

	/**
	 * The feature id for the '<em><b>Datasets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETERS_TYPE__DATASETS = 4;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETERS_TYPE__INPUTS = 5;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETERS_TYPE__OUTPUTS = 6;

	/**
	 * The number of structural features of the '<em>Model Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETERS_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Model Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.NotesTypeImpl <em>Notes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.NotesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getNotesType()
	 * @generated
	 */
	int NOTES_TYPE = 136;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE__NOTE = 1;

	/**
	 * The number of structural features of the '<em>Notes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Notes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.NoteTypeImpl <em>Note Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.NoteTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getNoteType()
	 * @generated
	 */
	int NOTE_TYPE = 137;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_TYPE__LOCALE = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_TYPE__TEXT = 2;

	/**
	 * The number of structural features of the '<em>Note Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Note Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.OccurrencesTypeImpl <em>Occurrences Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.OccurrencesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getOccurrencesType()
	 * @generated
	 */
	int OCCURRENCES_TYPE = 138;

	/**
	 * The feature id for the '<em><b>Occurrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCES_TYPE__OCCURRENCE = 0;

	/**
	 * The number of structural features of the '<em>Occurrences Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Occurrences Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.OccurrenceTypeImpl <em>Occurrence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.OccurrenceTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getOccurrenceType()
	 * @generated
	 */
	int OCCURRENCE_TYPE = 139;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_TYPE__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_TYPE__LINE = 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_TYPE__OFFSET = 2;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_TYPE__SYMBOL = 3;

	/**
	 * The feature id for the '<em><b>Additional Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_TYPE__ADDITIONAL_CONTEXT = 4;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_TYPE__BOM_REF = 5;

	/**
	 * The number of structural features of the '<em>Occurrence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Occurrence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.OrganizationalContactImpl <em>Organizational Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.OrganizationalContactImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getOrganizationalContact()
	 * @generated
	 */
	int ORGANIZATIONAL_CONTACT = 140;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_CONTACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_CONTACT__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_CONTACT__PHONE = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_CONTACT__ANY = 3;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_CONTACT__BOM_REF = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_CONTACT__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Organizational Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_CONTACT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Organizational Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_CONTACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.OrganizationalEntityImpl <em>Organizational Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.OrganizationalEntityImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getOrganizationalEntity()
	 * @generated
	 */
	int ORGANIZATIONAL_ENTITY = 141;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_ENTITY__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_ENTITY__URL = 2;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_ENTITY__CONTACT = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_ENTITY__ANY = 4;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_ENTITY__BOM_REF = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_ENTITY__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Organizational Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_ENTITY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Organizational Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.OrganizationOrIndividualTypeImpl <em>Organization Or Individual Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.OrganizationOrIndividualTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getOrganizationOrIndividualType()
	 * @generated
	 */
	int ORGANIZATION_OR_INDIVIDUAL_TYPE = 142;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OR_INDIVIDUAL_TYPE__ORGANIZATION = 0;

	/**
	 * The feature id for the '<em><b>Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OR_INDIVIDUAL_TYPE__INDIVIDUAL = 1;

	/**
	 * The number of structural features of the '<em>Organization Or Individual Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OR_INDIVIDUAL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Organization Or Individual Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OR_INDIVIDUAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.OrganizationsTypeImpl <em>Organizations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.OrganizationsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getOrganizationsType()
	 * @generated
	 */
	int ORGANIZATIONS_TYPE = 143;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONS_TYPE__ORGANIZATION = 0;

	/**
	 * The number of structural features of the '<em>Organizations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Organizations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.OrganizationsType1Impl <em>Organizations Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.OrganizationsType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getOrganizationsType1()
	 * @generated
	 */
	int ORGANIZATIONS_TYPE1 = 144;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONS_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONS_TYPE1__ORGANIZATION = 1;

	/**
	 * The number of structural features of the '<em>Organizations Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONS_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Organizations Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.OutputsTypeImpl <em>Outputs Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.OutputsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getOutputsType()
	 * @generated
	 */
	int OUTPUTS_TYPE = 145;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTS_TYPE__OUTPUT = 0;

	/**
	 * The number of structural features of the '<em>Outputs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Outputs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.OutputsType1Impl <em>Outputs Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.OutputsType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getOutputsType1()
	 * @generated
	 */
	int OUTPUTS_TYPE1 = 146;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTS_TYPE1__OUTPUT = 0;

	/**
	 * The number of structural features of the '<em>Outputs Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Outputs Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.OutputsType2Impl <em>Outputs Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.OutputsType2Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getOutputsType2()
	 * @generated
	 */
	int OUTPUTS_TYPE2 = 147;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTS_TYPE2__OUTPUT = 0;

	/**
	 * The number of structural features of the '<em>Outputs Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTS_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Outputs Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTS_TYPE2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.OutputsType3Impl <em>Outputs Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.OutputsType3Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getOutputsType3()
	 * @generated
	 */
	int OUTPUTS_TYPE3 = 148;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTS_TYPE3__OUTPUT = 0;

	/**
	 * The number of structural features of the '<em>Outputs Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTS_TYPE3_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Outputs Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTS_TYPE3_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.OutputTypeImpl <em>Output Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.OutputTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getOutputType()
	 * @generated
	 */
	int OUTPUT_TYPE = 149;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Environment Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__ENVIRONMENT_VARS = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__DATA = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__TARGET = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__PROPERTIES = 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__ANY = 7;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__ANY_ATTRIBUTE = 8;

	/**
	 * The number of structural features of the '<em>Output Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Output Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.OutputType1Impl <em>Output Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.OutputType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getOutputType1()
	 * @generated
	 */
	int OUTPUT_TYPE1 = 150;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE1__FORMAT = 0;

	/**
	 * The number of structural features of the '<em>Output Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Output Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.OwnersTypeImpl <em>Owners Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.OwnersTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getOwnersType()
	 * @generated
	 */
	int OWNERS_TYPE = 151;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNERS_TYPE__OWNER = 0;

	/**
	 * The number of structural features of the '<em>Owners Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Owners Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ParametersTypeImpl <em>Parameters Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ParametersTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getParametersType()
	 * @generated
	 */
	int PARAMETERS_TYPE = 152;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_TYPE__PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ParametersType1Impl <em>Parameters Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ParametersType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getParametersType1()
	 * @generated
	 */
	int PARAMETERS_TYPE1 = 153;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_TYPE1__PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Parameters Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameters Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ParameterTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 154;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__ANY = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.PatchesTypeImpl <em>Patches Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.PatchesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getPatchesType()
	 * @generated
	 */
	int PATCHES_TYPE = 155;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATCHES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Patch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATCHES_TYPE__PATCH = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATCHES_TYPE__ANY = 2;

	/**
	 * The number of structural features of the '<em>Patches Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATCHES_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Patches Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATCHES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.PatchTypeImpl <em>Patch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.PatchTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getPatchType()
	 * @generated
	 */
	int PATCH_TYPE = 156;

	/**
	 * The feature id for the '<em><b>Diff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATCH_TYPE__DIFF = 0;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATCH_TYPE__RESOLVES = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATCH_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATCH_TYPE__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Patch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATCH_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Patch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATCH_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.PedigreeTypeImpl <em>Pedigree Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.PedigreeTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getPedigreeType()
	 * @generated
	 */
	int PEDIGREE_TYPE = 157;

	/**
	 * The feature id for the '<em><b>Ancestors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIGREE_TYPE__ANCESTORS = 0;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIGREE_TYPE__DESCENDANTS = 1;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIGREE_TYPE__VARIANTS = 2;

	/**
	 * The feature id for the '<em><b>Commits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIGREE_TYPE__COMMITS = 3;

	/**
	 * The feature id for the '<em><b>Patches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIGREE_TYPE__PATCHES = 4;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIGREE_TYPE__NOTES = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIGREE_TYPE__ANY = 6;

	/**
	 * The number of structural features of the '<em>Pedigree Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIGREE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Pedigree Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIGREE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.PerformanceMetricsTypeImpl <em>Performance Metrics Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.PerformanceMetricsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getPerformanceMetricsType()
	 * @generated
	 */
	int PERFORMANCE_METRICS_TYPE = 158;

	/**
	 * The feature id for the '<em><b>Performance Metric</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRICS_TYPE__PERFORMANCE_METRIC = 0;

	/**
	 * The number of structural features of the '<em>Performance Metrics Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRICS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Performance Metrics Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRICS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.PerformanceMetricTypeImpl <em>Performance Metric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.PerformanceMetricTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getPerformanceMetricType()
	 * @generated
	 */
	int PERFORMANCE_METRIC_TYPE = 159;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRIC_TYPE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRIC_TYPE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Slice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRIC_TYPE__SLICE = 2;

	/**
	 * The feature id for the '<em><b>Confidence Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRIC_TYPE__CONFIDENCE_INTERVAL = 3;

	/**
	 * The number of structural features of the '<em>Performance Metric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRIC_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Performance Metric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRIC_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.PerformanceTradeoffsTypeImpl <em>Performance Tradeoffs Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.PerformanceTradeoffsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getPerformanceTradeoffsType()
	 * @generated
	 */
	int PERFORMANCE_TRADEOFFS_TYPE = 160;

	/**
	 * The feature id for the '<em><b>Performance Tradeoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_TRADEOFFS_TYPE__PERFORMANCE_TRADEOFF = 0;

	/**
	 * The number of structural features of the '<em>Performance Tradeoffs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_TRADEOFFS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Performance Tradeoffs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_TRADEOFFS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.PostalAddressTypeImpl <em>Postal Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.PostalAddressTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getPostalAddressType()
	 * @generated
	 */
	int POSTAL_ADDRESS_TYPE = 161;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE__COUNTRY = 0;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE__REGION = 1;

	/**
	 * The feature id for the '<em><b>Locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE__LOCALITY = 2;

	/**
	 * The feature id for the '<em><b>Post Office Box Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE__POST_OFFICE_BOX_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE__POSTAL_CODE = 4;

	/**
	 * The feature id for the '<em><b>Street Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE__STREET_ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE__BOM_REF = 6;

	/**
	 * The number of structural features of the '<em>Postal Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Postal Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ProofOfConceptTypeImpl <em>Proof Of Concept Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ProofOfConceptTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getProofOfConceptType()
	 * @generated
	 */
	int PROOF_OF_CONCEPT_TYPE = 162;

	/**
	 * The feature id for the '<em><b>Reproduction Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROOF_OF_CONCEPT_TYPE__REPRODUCTION_STEPS = 0;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROOF_OF_CONCEPT_TYPE__ENVIRONMENT = 1;

	/**
	 * The feature id for the '<em><b>Supporting Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROOF_OF_CONCEPT_TYPE__SUPPORTING_MATERIAL = 2;

	/**
	 * The number of structural features of the '<em>Proof Of Concept Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROOF_OF_CONCEPT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Proof Of Concept Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROOF_OF_CONCEPT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.PropertiesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getPropertiesType()
	 * @generated
	 */
	int PROPERTIES_TYPE = 163;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.PropertyTypeImpl <em>Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.PropertyTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 164;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__NAME = 1;

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
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ProtocolPropertiesTypeImpl <em>Protocol Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ProtocolPropertiesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getProtocolPropertiesType()
	 * @generated
	 */
	int PROTOCOL_PROPERTIES_TYPE = 165;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_PROPERTIES_TYPE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_PROPERTIES_TYPE__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Cipher Suites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_PROPERTIES_TYPE__CIPHER_SUITES = 2;

	/**
	 * The feature id for the '<em><b>Ikev2 Transform Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_PROPERTIES_TYPE__IKEV2_TRANSFORM_TYPES = 3;

	/**
	 * The feature id for the '<em><b>Crypto Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_PROPERTIES_TYPE__CRYPTO_REF = 4;

	/**
	 * The number of structural features of the '<em>Protocol Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_PROPERTIES_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Protocol Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ProvidesTypeImpl <em>Provides Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ProvidesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getProvidesType()
	 * @generated
	 */
	int PROVIDES_TYPE = 166;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_TYPE__REF = 0;

	/**
	 * The number of structural features of the '<em>Provides Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Provides Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.PurchaserTypeImpl <em>Purchaser Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.PurchaserTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getPurchaserType()
	 * @generated
	 */
	int PURCHASER_TYPE = 167;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASER_TYPE__ORGANIZATION = 0;

	/**
	 * The feature id for the '<em><b>Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASER_TYPE__INDIVIDUAL = 1;

	/**
	 * The number of structural features of the '<em>Purchaser Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Purchaser Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.QuantitativeAnalysisTypeImpl <em>Quantitative Analysis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.QuantitativeAnalysisTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getQuantitativeAnalysisType()
	 * @generated
	 */
	int QUANTITATIVE_ANALYSIS_TYPE = 168;

	/**
	 * The feature id for the '<em><b>Performance Metrics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_ANALYSIS_TYPE__PERFORMANCE_METRICS = 0;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_ANALYSIS_TYPE__GRAPHICS = 1;

	/**
	 * The number of structural features of the '<em>Quantitative Analysis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_ANALYSIS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Quantitative Analysis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_ANALYSIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.RatingsTypeImpl <em>Ratings Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.RatingsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getRatingsType()
	 * @generated
	 */
	int RATINGS_TYPE = 169;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATINGS_TYPE__RATING = 0;

	/**
	 * The number of structural features of the '<em>Ratings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATINGS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ratings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATINGS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.RatingTypeImpl <em>Rating Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.RatingTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getRatingType()
	 * @generated
	 */
	int RATING_TYPE = 170;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_TYPE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_TYPE__SCORE = 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_TYPE__SEVERITY = 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_TYPE__METHOD = 3;

	/**
	 * The feature id for the '<em><b>Vector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_TYPE__VECTOR = 4;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_TYPE__JUSTIFICATION = 5;

	/**
	 * The number of structural features of the '<em>Rating Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Rating Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ReferencesTypeImpl <em>References Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ReferencesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getReferencesType()
	 * @generated
	 */
	int REFERENCES_TYPE = 171;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TYPE__REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TYPE__ANY = 2;

	/**
	 * The number of structural features of the '<em>References Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>References Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ReferencesType1Impl <em>References Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ReferencesType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getReferencesType1()
	 * @generated
	 */
	int REFERENCES_TYPE1 = 172;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TYPE1__URL = 1;

	/**
	 * The number of structural features of the '<em>References Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>References Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ReferenceTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 173;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.RelatedCryptoMaterialPropertiesTypeImpl <em>Related Crypto Material Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.RelatedCryptoMaterialPropertiesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getRelatedCryptoMaterialPropertiesType()
	 * @generated
	 */
	int RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE = 174;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__STATE = 2;

	/**
	 * The feature id for the '<em><b>Algorithm Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__ALGORITHM_REF = 3;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__CREATION_DATE = 4;

	/**
	 * The feature id for the '<em><b>Activation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__ACTIVATION_DATE = 5;

	/**
	 * The feature id for the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__UPDATE_DATE = 6;

	/**
	 * The feature id for the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__EXPIRATION_DATE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__VALUE = 8;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__SIZE = 9;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__FORMAT = 10;

	/**
	 * The feature id for the '<em><b>Secured By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__SECURED_BY = 11;

	/**
	 * The number of structural features of the '<em>Related Crypto Material Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Related Crypto Material Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ReleaseNotesTypeImpl <em>Release Notes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ReleaseNotesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getReleaseNotesType()
	 * @generated
	 */
	int RELEASE_NOTES_TYPE = 175;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_NOTES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_NOTES_TYPE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_NOTES_TYPE__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Featured Image</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_NOTES_TYPE__FEATURED_IMAGE = 3;

	/**
	 * The feature id for the '<em><b>Social Image</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_NOTES_TYPE__SOCIAL_IMAGE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_NOTES_TYPE__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_NOTES_TYPE__TIMESTAMP = 6;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_NOTES_TYPE__ALIASES = 7;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_NOTES_TYPE__TAGS = 8;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_NOTES_TYPE__RESOLVES = 9;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_NOTES_TYPE__NOTES = 10;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_NOTES_TYPE__PROPERTIES = 11;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_NOTES_TYPE__ANY = 12;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_NOTES_TYPE__ANY_ATTRIBUTE = 13;

	/**
	 * The number of structural features of the '<em>Release Notes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_NOTES_TYPE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Release Notes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_NOTES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.RequirementsTypeImpl <em>Requirements Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.RequirementsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getRequirementsType()
	 * @generated
	 */
	int REQUIREMENTS_TYPE = 176;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE__REQUIREMENT = 0;

	/**
	 * The number of structural features of the '<em>Requirements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.RequirementsType1Impl <em>Requirements Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.RequirementsType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getRequirementsType1()
	 * @generated
	 */
	int REQUIREMENTS_TYPE1 = 177;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE1__REQUIREMENT = 0;

	/**
	 * The number of structural features of the '<em>Requirements Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirements Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.RequirementTypeImpl <em>Requirement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.RequirementTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getRequirementType()
	 * @generated
	 */
	int REQUIREMENT_TYPE = 178;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__TEXT = 2;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__DESCRIPTIONS = 3;

	/**
	 * The feature id for the '<em><b>Open Cre</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__OPEN_CRE = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__PARENT = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__PROPERTIES = 6;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__EXTERNAL_REFERENCES = 7;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__BOM_REF = 8;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__ANY_ATTRIBUTE = 9;

	/**
	 * The number of structural features of the '<em>Requirement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Requirement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ResolvesTypeImpl <em>Resolves Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ResolvesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getResolvesType()
	 * @generated
	 */
	int RESOLVES_TYPE = 179;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES_TYPE__ISSUE = 1;

	/**
	 * The number of structural features of the '<em>Resolves Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resolves Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ResolvesType1Impl <em>Resolves Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ResolvesType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getResolvesType1()
	 * @generated
	 */
	int RESOLVES_TYPE1 = 180;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES_TYPE1__ISSUE = 1;

	/**
	 * The number of structural features of the '<em>Resolves Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resolves Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ResourceReferencesTypeImpl <em>Resource References Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ResourceReferencesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getResourceReferencesType()
	 * @generated
	 */
	int RESOURCE_REFERENCES_TYPE = 181;

	/**
	 * The feature id for the '<em><b>Resource Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCES_TYPE__RESOURCE_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCES_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCES_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Resource References Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCES_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource References Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ResourceReferenceTypeImpl <em>Resource Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ResourceReferenceTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getResourceReferenceType()
	 * @generated
	 */
	int RESOURCE_REFERENCE_TYPE = 182;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE_TYPE__REF = 0;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE_TYPE__EXTERNAL_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Resource Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Resource Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ResponsesTypeImpl <em>Responses Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ResponsesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getResponsesType()
	 * @generated
	 */
	int RESPONSES_TYPE = 183;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSES_TYPE__RESPONSE = 1;

	/**
	 * The number of structural features of the '<em>Responses Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Responses Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.SecuredByTypeImpl <em>Secured By Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.SecuredByTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getSecuredByType()
	 * @generated
	 */
	int SECURED_BY_TYPE = 184;

	/**
	 * The feature id for the '<em><b>Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURED_BY_TYPE__MECHANISM = 0;

	/**
	 * The feature id for the '<em><b>Algorithm Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURED_BY_TYPE__ALGORITHM_REF = 1;

	/**
	 * The number of structural features of the '<em>Secured By Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURED_BY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Secured By Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURED_BY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ServiceImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 185;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Endpoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ENDPOINTS = 5;

	/**
	 * The feature id for the '<em><b>Authenticated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__AUTHENTICATED = 6;

	/**
	 * The feature id for the '<em><b>XTrust Boundary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__XTRUST_BOUNDARY = 7;

	/**
	 * The feature id for the '<em><b>Trust Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TRUST_ZONE = 8;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DATA = 9;

	/**
	 * The feature id for the '<em><b>Licenses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__LICENSES = 10;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__EXTERNAL_REFERENCES = 11;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PROPERTIES = 12;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICES = 13;

	/**
	 * The feature id for the '<em><b>Release Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__RELEASE_NOTES = 14;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TAGS = 15;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ANY = 16;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__BOM_REF = 17;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ANY_ATTRIBUTE = 18;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ServicesTypeImpl <em>Services Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ServicesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getServicesType()
	 * @generated
	 */
	int SERVICES_TYPE = 186;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_TYPE__SERVICE = 0;

	/**
	 * The number of structural features of the '<em>Services Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Services Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ServicesType1Impl <em>Services Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ServicesType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getServicesType1()
	 * @generated
	 */
	int SERVICES_TYPE1 = 187;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_TYPE1__SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_TYPE1__ANY = 2;

	/**
	 * The number of structural features of the '<em>Services Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_TYPE1_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Services Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ServicesType2Impl <em>Services Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ServicesType2Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getServicesType2()
	 * @generated
	 */
	int SERVICES_TYPE2 = 188;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_TYPE2__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_TYPE2__SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_TYPE2__ANY = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_TYPE2__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Services Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_TYPE2_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Services Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_TYPE2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.SignatoriesTypeImpl <em>Signatories Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.SignatoriesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getSignatoriesType()
	 * @generated
	 */
	int SIGNATORIES_TYPE = 189;

	/**
	 * The feature id for the '<em><b>Signatory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATORIES_TYPE__SIGNATORY = 0;

	/**
	 * The number of structural features of the '<em>Signatories Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATORIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Signatories Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATORIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.SignatoryTypeImpl <em>Signatory Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.SignatoryTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getSignatoryType()
	 * @generated
	 */
	int SIGNATORY_TYPE = 190;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATORY_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATORY_TYPE__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATORY_TYPE__ORGANIZATION = 2;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATORY_TYPE__EXTERNAL_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATORY_TYPE__ANY = 4;

	/**
	 * The number of structural features of the '<em>Signatory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATORY_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Signatory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATORY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.SourceTypeImpl <em>Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.SourceTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getSourceType()
	 * @generated
	 */
	int SOURCE_TYPE = 191;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__URL = 1;

	/**
	 * The number of structural features of the '<em>Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.SourceType1Impl <em>Source Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.SourceType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getSourceType1()
	 * @generated
	 */
	int SOURCE_TYPE1 = 192;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE1__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE1__URL = 1;

	/**
	 * The number of structural features of the '<em>Source Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Source Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.StandardImpl <em>Standard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.StandardImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getStandard()
	 * @generated
	 */
	int STANDARD = 193;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__OWNER = 3;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__REQUIREMENTS = 4;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__LEVELS = 5;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__EXTERNAL_REFERENCES = 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__ANY = 7;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__BOM_REF = 8;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__ANY_ATTRIBUTE = 9;

	/**
	 * The number of structural features of the '<em>Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.StandardsTypeImpl <em>Standards Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.StandardsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getStandardsType()
	 * @generated
	 */
	int STANDARDS_TYPE = 194;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDS_TYPE__STANDARD = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDS_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDS_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Standards Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Standards Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.StepsTypeImpl <em>Steps Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.StepsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getStepsType()
	 * @generated
	 */
	int STEPS_TYPE = 195;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_TYPE__STEP = 0;

	/**
	 * The number of structural features of the '<em>Steps Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Steps Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.StepsType1Impl <em>Steps Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.StepsType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getStepsType1()
	 * @generated
	 */
	int STEPS_TYPE1 = 196;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_TYPE1__STEP = 0;

	/**
	 * The number of structural features of the '<em>Steps Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Steps Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.StepTypeImpl <em>Step Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.StepTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getStepType()
	 * @generated
	 */
	int STEP_TYPE = 197;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__COMMANDS = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__ANY = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Step Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Step Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.StewardsTypeImpl <em>Stewards Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.StewardsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getStewardsType()
	 * @generated
	 */
	int STEWARDS_TYPE = 198;

	/**
	 * The feature id for the '<em><b>Steward</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEWARDS_TYPE__STEWARD = 0;

	/**
	 * The number of structural features of the '<em>Stewards Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEWARDS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stewards Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEWARDS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.SubjectsTypeImpl <em>Subjects Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.SubjectsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getSubjectsType()
	 * @generated
	 */
	int SUBJECTS_TYPE = 199;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTS_TYPE__SUBJECT = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTS_TYPE__ANY = 2;

	/**
	 * The number of structural features of the '<em>Subjects Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Subjects Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.SupportingMaterialTypeImpl <em>Supporting Material Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.SupportingMaterialTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getSupportingMaterialType()
	 * @generated
	 */
	int SUPPORTING_MATERIAL_TYPE = 200;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_MATERIAL_TYPE__ATTACHMENT = 0;

	/**
	 * The number of structural features of the '<em>Supporting Material Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_MATERIAL_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Supporting Material Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_MATERIAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.SwidTypeImpl <em>Swid Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.SwidTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getSwidType()
	 * @generated
	 */
	int SWID_TYPE = 201;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWID_TYPE__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWID_TYPE__URL = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWID_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWID_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Patch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWID_TYPE__PATCH = 4;

	/**
	 * The feature id for the '<em><b>Tag Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWID_TYPE__TAG_ID = 5;

	/**
	 * The feature id for the '<em><b>Tag Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWID_TYPE__TAG_VERSION = 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWID_TYPE__VERSION = 7;

	/**
	 * The number of structural features of the '<em>Swid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWID_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Swid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWID_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.TagsTypeImpl <em>Tags Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.TagsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getTagsType()
	 * @generated
	 */
	int TAGS_TYPE = 202;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Tags Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tags Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.TargetsTypeImpl <em>Targets Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.TargetsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getTargetsType()
	 * @generated
	 */
	int TARGETS_TYPE = 203;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS_TYPE__ORGANIZATIONS = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS_TYPE__COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS_TYPE__SERVICES = 2;

	/**
	 * The number of structural features of the '<em>Targets Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Targets Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.TargetTypeImpl <em>Target Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.TargetTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getTargetType()
	 * @generated
	 */
	int TARGET_TYPE = 204;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE__REF = 0;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE__VERSIONS = 1;

	/**
	 * The number of structural features of the '<em>Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.TasksTypeImpl <em>Tasks Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.TasksTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getTasksType()
	 * @generated
	 */
	int TASKS_TYPE = 205;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS_TYPE__TASK = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Tasks Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tasks Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.TaskTypeImpl <em>Task Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.TaskTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getTaskType()
	 * @generated
	 */
	int TASK_TYPE = 206;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Resource References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__RESOURCE_REFERENCES = 3;

	/**
	 * The feature id for the '<em><b>Task Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__TASK_TYPES = 4;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__TRIGGER = 5;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__STEPS = 6;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__INPUTS = 7;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__OUTPUTS = 8;

	/**
	 * The feature id for the '<em><b>Time Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__TIME_START = 9;

	/**
	 * The feature id for the '<em><b>Time End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__TIME_END = 10;

	/**
	 * The feature id for the '<em><b>Workspaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__WORKSPACES = 11;

	/**
	 * The feature id for the '<em><b>Runtime Topology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__RUNTIME_TOPOLOGY = 12;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__PROPERTIES = 13;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ANY = 14;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__BOM_REF = 15;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ANY_ATTRIBUTE = 16;

	/**
	 * The number of structural features of the '<em>Task Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Task Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.TaskTypesTypeImpl <em>Task Types Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.TaskTypesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getTaskTypesType()
	 * @generated
	 */
	int TASK_TYPES_TYPE = 207;

	/**
	 * The feature id for the '<em><b>Task Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPES_TYPE__TASK_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Task Types Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Task Types Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.TaskTypesType1Impl <em>Task Types Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.TaskTypesType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getTaskTypesType1()
	 * @generated
	 */
	int TASK_TYPES_TYPE1 = 208;

	/**
	 * The feature id for the '<em><b>Task Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPES_TYPE1__TASK_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Task Types Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPES_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Task Types Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPES_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.TechnicalLimitationsTypeImpl <em>Technical Limitations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.TechnicalLimitationsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getTechnicalLimitationsType()
	 * @generated
	 */
	int TECHNICAL_LIMITATIONS_TYPE = 209;

	/**
	 * The feature id for the '<em><b>Technical Limitation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_LIMITATIONS_TYPE__TECHNICAL_LIMITATION = 0;

	/**
	 * The number of structural features of the '<em>Technical Limitations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_LIMITATIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Technical Limitations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_LIMITATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ToolsTypeImpl <em>Tools Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ToolsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getToolsType()
	 * @generated
	 */
	int TOOLS_TYPE = 210;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_TYPE__TOOL = 0;

	/**
	 * The number of structural features of the '<em>Tools Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tools Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ToolsType1Impl <em>Tools Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ToolsType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getToolsType1()
	 * @generated
	 */
	int TOOLS_TYPE1 = 211;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_TYPE1__TOOL = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_TYPE1__COMPONENTS = 2;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_TYPE1__SERVICES = 3;

	/**
	 * The number of structural features of the '<em>Tools Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_TYPE1_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tools Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ToolsType2Impl <em>Tools Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ToolsType2Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getToolsType2()
	 * @generated
	 */
	int TOOLS_TYPE2 = 212;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_TYPE2__TOOL = 0;

	/**
	 * The number of structural features of the '<em>Tools Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tools Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_TYPE2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ToolsType3Impl <em>Tools Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ToolsType3Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getToolsType3()
	 * @generated
	 */
	int TOOLS_TYPE3 = 213;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_TYPE3__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_TYPE3__TOOL = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_TYPE3__COMPONENTS = 2;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_TYPE3__SERVICES = 3;

	/**
	 * The number of structural features of the '<em>Tools Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_TYPE3_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tools Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_TYPE3_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.ToolTypeImpl <em>Tool Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.ToolTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getToolType()
	 * @generated
	 */
	int TOOL_TYPE = 214;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_TYPE__VENDOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_TYPE__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Hashes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_TYPE__HASHES = 3;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_TYPE__EXTERNAL_REFERENCES = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_TYPE__ANY = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Tool Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Tool Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.TriggerTypeImpl <em>Trigger Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.TriggerTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getTriggerType()
	 * @generated
	 */
	int TRIGGER_TYPE = 215;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Resource References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__RESOURCE_REFERENCES = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__EVENT = 5;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__CONDITIONS = 6;

	/**
	 * The feature id for the '<em><b>Time Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__TIME_ACTIVATED = 7;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__INPUTS = 8;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__OUTPUTS = 9;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__PROPERTIES = 10;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__ANY = 11;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__BOM_REF = 12;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__ANY_ATTRIBUTE = 13;

	/**
	 * The number of structural features of the '<em>Trigger Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Trigger Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.UseCasesTypeImpl <em>Use Cases Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.UseCasesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getUseCasesType()
	 * @generated
	 */
	int USE_CASES_TYPE = 216;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASES_TYPE__USE_CASE = 0;

	/**
	 * The number of structural features of the '<em>Use Cases Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Use Cases Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.UsersTypeImpl <em>Users Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.UsersTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getUsersType()
	 * @generated
	 */
	int USERS_TYPE = 217;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_TYPE__USER = 0;

	/**
	 * The number of structural features of the '<em>Users Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Users Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.VersionsTypeImpl <em>Versions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.VersionsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getVersionsType()
	 * @generated
	 */
	int VERSIONS_TYPE = 218;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONS_TYPE__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Versions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Versions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.VersionTypeImpl <em>Version Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.VersionTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 219;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TYPE__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TYPE__RANGE = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TYPE__STATUS = 2;

	/**
	 * The number of structural features of the '<em>Version Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Version Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.VolumeTypeImpl <em>Volume Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.VolumeTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getVolumeType()
	 * @generated
	 */
	int VOLUME_TYPE = 220;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_TYPE__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_TYPE__MODE = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_TYPE__PATH = 3;

	/**
	 * The feature id for the '<em><b>Size Allocated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_TYPE__SIZE_ALLOCATED = 4;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_TYPE__PERSISTENT = 5;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_TYPE__REMOTE = 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_TYPE__PROPERTIES = 7;

	/**
	 * The number of structural features of the '<em>Volume Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Volume Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.VulnerabilitiesTypeImpl <em>Vulnerabilities Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.VulnerabilitiesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getVulnerabilitiesType()
	 * @generated
	 */
	int VULNERABILITIES_TYPE = 221;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITIES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Vulnerability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITIES_TYPE__VULNERABILITY = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITIES_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITIES_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Vulnerabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITIES_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Vulnerabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.VulnerabilitiesType1Impl <em>Vulnerabilities Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.VulnerabilitiesType1Impl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getVulnerabilitiesType1()
	 * @generated
	 */
	int VULNERABILITIES_TYPE1 = 222;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITIES_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Vulnerability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITIES_TYPE1__VULNERABILITY = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITIES_TYPE1__ANY = 2;

	/**
	 * The number of structural features of the '<em>Vulnerabilities Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITIES_TYPE1_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Vulnerabilities Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITIES_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.VulnerabilitySourceTypeImpl <em>Vulnerability Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.VulnerabilitySourceTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getVulnerabilitySourceType()
	 * @generated
	 */
	int VULNERABILITY_SOURCE_TYPE = 223;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_SOURCE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_SOURCE_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_SOURCE_TYPE__URL = 2;

	/**
	 * The number of structural features of the '<em>Vulnerability Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_SOURCE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Vulnerability Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_SOURCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.VulnerabilityTypeImpl <em>Vulnerability Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.VulnerabilityTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getVulnerabilityType()
	 * @generated
	 */
	int VULNERABILITY_TYPE = 224;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE__REFERENCES = 2;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE__RATINGS = 3;

	/**
	 * The feature id for the '<em><b>Cwes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE__CWES = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE__DETAIL = 6;

	/**
	 * The feature id for the '<em><b>Recommendation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE__RECOMMENDATION = 7;

	/**
	 * The feature id for the '<em><b>Workaround</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE__WORKAROUND = 8;

	/**
	 * The feature id for the '<em><b>Proof Of Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE__PROOF_OF_CONCEPT = 9;

	/**
	 * The feature id for the '<em><b>Advisories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE__ADVISORIES = 10;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE__CREATED = 11;

	/**
	 * The feature id for the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE__PUBLISHED = 12;

	/**
	 * The feature id for the '<em><b>Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE__UPDATED = 13;

	/**
	 * The feature id for the '<em><b>Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE__REJECTED = 14;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE__CREDITS = 15;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE__TOOLS = 16;

	/**
	 * The feature id for the '<em><b>Analysis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE__ANALYSIS = 17;

	/**
	 * The feature id for the '<em><b>Affects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE__AFFECTS = 18;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE__PROPERTIES = 19;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE__BOM_REF = 20;

	/**
	 * The number of structural features of the '<em>Vulnerability Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Vulnerability Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.WorkflowsTypeImpl <em>Workflows Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.WorkflowsTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getWorkflowsType()
	 * @generated
	 */
	int WORKFLOWS_TYPE = 225;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOWS_TYPE__WORKFLOW = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOWS_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOWS_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Workflows Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOWS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Workflows Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOWS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.WorkflowTypeImpl <em>Workflow Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.WorkflowTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getWorkflowType()
	 * @generated
	 */
	int WORKFLOW_TYPE = 226;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_TYPE__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Resource References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_TYPE__RESOURCE_REFERENCES = 3;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_TYPE__TASKS = 4;

	/**
	 * The feature id for the '<em><b>Task Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_TYPE__TASK_DEPENDENCIES = 5;

	/**
	 * The feature id for the '<em><b>Task Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_TYPE__TASK_TYPES = 6;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_TYPE__TRIGGER = 7;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_TYPE__STEPS = 8;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_TYPE__INPUTS = 9;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_TYPE__OUTPUTS = 10;

	/**
	 * The feature id for the '<em><b>Time Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_TYPE__TIME_START = 11;

	/**
	 * The feature id for the '<em><b>Time End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_TYPE__TIME_END = 12;

	/**
	 * The feature id for the '<em><b>Workspaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_TYPE__WORKSPACES = 13;

	/**
	 * The feature id for the '<em><b>Runtime Topology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_TYPE__RUNTIME_TOPOLOGY = 14;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_TYPE__PROPERTIES = 15;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_TYPE__ANY = 16;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_TYPE__BOM_REF = 17;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_TYPE__ANY_ATTRIBUTE = 18;

	/**
	 * The number of structural features of the '<em>Workflow Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_TYPE_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Workflow Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.WorkspacesTypeImpl <em>Workspaces Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.WorkspacesTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getWorkspacesType()
	 * @generated
	 */
	int WORKSPACES_TYPE = 227;

	/**
	 * The feature id for the '<em><b>Workspace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACES_TYPE__WORKSPACE = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACES_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACES_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Workspaces Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACES_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Workspaces Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.impl.WorkspaceTypeImpl <em>Workspace Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.impl.WorkspaceTypeImpl
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getWorkspaceType()
	 * @generated
	 */
	int WORKSPACE_TYPE = 228;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_TYPE__UID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_TYPE__ALIASES = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_TYPE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Resource References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_TYPE__RESOURCE_REFERENCES = 5;

	/**
	 * The feature id for the '<em><b>Access Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_TYPE__ACCESS_MODE = 6;

	/**
	 * The feature id for the '<em><b>Mount Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_TYPE__MOUNT_PATH = 7;

	/**
	 * The feature id for the '<em><b>Managed Data Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_TYPE__MANAGED_DATA_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Volume Request</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_TYPE__VOLUME_REQUEST = 9;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_TYPE__VOLUME = 10;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_TYPE__PROPERTIES = 11;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_TYPE__ANY = 12;

	/**
	 * The feature id for the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_TYPE__BOM_REF = 13;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_TYPE__ANY_ATTRIBUTE = 14;

	/**
	 * The number of structural features of the '<em>Workspace Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Workspace Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.AccessModeEnum <em>Access Mode Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.AccessModeEnum
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAccessModeEnum()
	 * @generated
	 */
	int ACCESS_MODE_ENUM = 229;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.ActivityType <em>Activity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ActivityType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getActivityType()
	 * @generated
	 */
	int ACTIVITY_TYPE = 230;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.AggregateType <em>Aggregate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.AggregateType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAggregateType()
	 * @generated
	 */
	int AGGREGATE_TYPE = 231;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.AssetTypeType <em>Asset Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.AssetTypeType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAssetTypeType()
	 * @generated
	 */
	int ASSET_TYPE_TYPE = 232;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.CertificationLevelType <em>Certification Level Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.CertificationLevelType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCertificationLevelType()
	 * @generated
	 */
	int CERTIFICATION_LEVEL_TYPE = 233;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.Classification <em>Classification</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.Classification
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getClassification()
	 * @generated
	 */
	int CLASSIFICATION = 234;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.ComponentDataTypeEnumeration <em>Component Data Type Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ComponentDataTypeEnumeration
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getComponentDataTypeEnumeration()
	 * @generated
	 */
	int COMPONENT_DATA_TYPE_ENUMERATION = 235;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.CryptoFunctionType <em>Crypto Function Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.CryptoFunctionType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCryptoFunctionType()
	 * @generated
	 */
	int CRYPTO_FUNCTION_TYPE = 236;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.DataFlowType1 <em>Data Flow Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.DataFlowType1
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getDataFlowType1()
	 * @generated
	 */
	int DATA_FLOW_TYPE1 = 237;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.Encoding <em>Encoding</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.Encoding
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getEncoding()
	 * @generated
	 */
	int ENCODING = 238;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.EnergySourceType <em>Energy Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.EnergySourceType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getEnergySourceType()
	 * @generated
	 */
	int ENERGY_SOURCE_TYPE = 239;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.EvidenceTechnique <em>Evidence Technique</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.EvidenceTechnique
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getEvidenceTechnique()
	 * @generated
	 */
	int EVIDENCE_TECHNIQUE = 240;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.ExecutionEnvironmentType <em>Execution Environment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ExecutionEnvironmentType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getExecutionEnvironmentType()
	 * @generated
	 */
	int EXECUTION_ENVIRONMENT_TYPE = 241;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.ExternalReferenceType <em>External Reference Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ExternalReferenceType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getExternalReferenceType()
	 * @generated
	 */
	int EXTERNAL_REFERENCE_TYPE = 242;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.HashAlg <em>Hash Alg</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.HashAlg
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getHashAlg()
	 * @generated
	 */
	int HASH_ALG = 243;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.IdentityFieldType <em>Identity Field Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.IdentityFieldType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getIdentityFieldType()
	 * @generated
	 */
	int IDENTITY_FIELD_TYPE = 244;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.ImpactAnalysisAffectedStatusType <em>Impact Analysis Affected Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisAffectedStatusType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getImpactAnalysisAffectedStatusType()
	 * @generated
	 */
	int IMPACT_ANALYSIS_AFFECTED_STATUS_TYPE = 245;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.ImpactAnalysisJustificationType <em>Impact Analysis Justification Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisJustificationType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getImpactAnalysisJustificationType()
	 * @generated
	 */
	int IMPACT_ANALYSIS_JUSTIFICATION_TYPE = 246;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.ImpactAnalysisResponsesType <em>Impact Analysis Responses Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisResponsesType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getImpactAnalysisResponsesType()
	 * @generated
	 */
	int IMPACT_ANALYSIS_RESPONSES_TYPE = 247;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.ImpactAnalysisStateType <em>Impact Analysis State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisStateType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getImpactAnalysisStateType()
	 * @generated
	 */
	int IMPACT_ANALYSIS_STATE_TYPE = 248;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.ImplementationPlatformType <em>Implementation Platform Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ImplementationPlatformType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getImplementationPlatformType()
	 * @generated
	 */
	int IMPLEMENTATION_PLATFORM_TYPE = 249;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.IssueClassification <em>Issue Classification</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.IssueClassification
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getIssueClassification()
	 * @generated
	 */
	int ISSUE_CLASSIFICATION = 250;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.LicenseAcknowledgementEnumerationType <em>License Acknowledgement Enumeration Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.LicenseAcknowledgementEnumerationType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getLicenseAcknowledgementEnumerationType()
	 * @generated
	 */
	int LICENSE_ACKNOWLEDGEMENT_ENUMERATION_TYPE = 251;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.LicenseTypeEnum <em>License Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.LicenseTypeEnum
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getLicenseTypeEnum()
	 * @generated
	 */
	int LICENSE_TYPE_ENUM = 252;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.LifecyclePhaseType <em>Lifecycle Phase Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.LifecyclePhaseType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getLifecyclePhaseType()
	 * @generated
	 */
	int LIFECYCLE_PHASE_TYPE = 253;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.MachineLearningApproachType <em>Machine Learning Approach Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.MachineLearningApproachType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getMachineLearningApproachType()
	 * @generated
	 */
	int MACHINE_LEARNING_APPROACH_TYPE = 254;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.ModeType <em>Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ModeType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getModeType()
	 * @generated
	 */
	int MODE_TYPE = 255;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.OutputTypeEnum <em>Output Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.OutputTypeEnum
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getOutputTypeEnum()
	 * @generated
	 */
	int OUTPUT_TYPE_ENUM = 256;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.PaddingType <em>Padding Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.PaddingType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getPaddingType()
	 * @generated
	 */
	int PADDING_TYPE = 257;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.PatchClassification <em>Patch Classification</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.PatchClassification
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getPatchClassification()
	 * @generated
	 */
	int PATCH_CLASSIFICATION = 258;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.PrimitiveType <em>Primitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.PrimitiveType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 259;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.Scope <em>Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.Scope
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 260;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.ScoreSourceType <em>Score Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ScoreSourceType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getScoreSourceType()
	 * @generated
	 */
	int SCORE_SOURCE_TYPE = 261;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.SeverityType <em>Severity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.SeverityType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getSeverityType()
	 * @generated
	 */
	int SEVERITY_TYPE = 262;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.StateType <em>State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.StateType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getStateType()
	 * @generated
	 */
	int STATE_TYPE = 263;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.TaskTypeEnum <em>Task Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.TaskTypeEnum
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getTaskTypeEnum()
	 * @generated
	 */
	int TASK_TYPE_ENUM = 264;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.TriggerTypeType <em>Trigger Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.TriggerTypeType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getTriggerTypeType()
	 * @generated
	 */
	int TRIGGER_TYPE_TYPE = 265;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.TypeType <em>Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.TypeType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 266;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.TypeType1 <em>Type Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.TypeType1
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getTypeType1()
	 * @generated
	 */
	int TYPE_TYPE1 = 267;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.UnitType <em>Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.UnitType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getUnitType()
	 * @generated
	 */
	int UNIT_TYPE = 268;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.UnitType1 <em>Unit Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.UnitType1
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getUnitType1()
	 * @generated
	 */
	int UNIT_TYPE1 = 269;

	/**
	 * The meta object id for the '{@link org.cyclonedx.schema.bom.VolumeModeEnum <em>Volume Mode Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.VolumeModeEnum
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getVolumeModeEnum()
	 * @generated
	 */
	int VOLUME_MODE_ENUM = 270;

	/**
	 * The meta object id for the '<em>Access Mode Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.AccessModeEnum
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAccessModeEnumObject()
	 * @generated
	 */
	int ACCESS_MODE_ENUM_OBJECT = 271;

	/**
	 * The meta object id for the '<em>Activity Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ActivityType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getActivityTypeObject()
	 * @generated
	 */
	int ACTIVITY_TYPE_OBJECT = 272;

	/**
	 * The meta object id for the '<em>Aggregate Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.AggregateType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAggregateTypeObject()
	 * @generated
	 */
	int AGGREGATE_TYPE_OBJECT = 273;

	/**
	 * The meta object id for the '<em>Asset Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.AssetTypeType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getAssetTypeTypeObject()
	 * @generated
	 */
	int ASSET_TYPE_TYPE_OBJECT = 274;

	/**
	 * The meta object id for the '<em>Bom Link Document Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getBomLinkDocumentType()
	 * @generated
	 */
	int BOM_LINK_DOCUMENT_TYPE = 275;

	/**
	 * The meta object id for the '<em>Bom Link Element Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getBomLinkElementType()
	 * @generated
	 */
	int BOM_LINK_ELEMENT_TYPE = 276;

	/**
	 * The meta object id for the '<em>Bom Link Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getBomLinkType()
	 * @generated
	 */
	int BOM_LINK_TYPE = 277;

	/**
	 * The meta object id for the '<em>Certification Level Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.CertificationLevelType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCertificationLevelTypeObject()
	 * @generated
	 */
	int CERTIFICATION_LEVEL_TYPE_OBJECT = 278;

	/**
	 * The meta object id for the '<em>Classical Security Level Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getClassicalSecurityLevelType()
	 * @generated
	 */
	int CLASSICAL_SECURITY_LEVEL_TYPE = 279;

	/**
	 * The meta object id for the '<em>Classification Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.Classification
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getClassificationObject()
	 * @generated
	 */
	int CLASSIFICATION_OBJECT = 280;

	/**
	 * The meta object id for the '<em>Component Data Type Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ComponentDataTypeEnumeration
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getComponentDataTypeEnumerationObject()
	 * @generated
	 */
	int COMPONENT_DATA_TYPE_ENUMERATION_OBJECT = 281;

	/**
	 * The meta object id for the '<em>Cpe</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCpe()
	 * @generated
	 */
	int CPE = 282;

	/**
	 * The meta object id for the '<em>Crypto Function Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.CryptoFunctionType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getCryptoFunctionTypeObject()
	 * @generated
	 */
	int CRYPTO_FUNCTION_TYPE_OBJECT = 283;

	/**
	 * The meta object id for the '<em>Data Flow Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.DataFlowType1
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getDataFlowTypeObject()
	 * @generated
	 */
	int DATA_FLOW_TYPE_OBJECT = 284;

	/**
	 * The meta object id for the '<em>Decimal Percent Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getDecimalPercentType()
	 * @generated
	 */
	int DECIMAL_PERCENT_TYPE = 285;

	/**
	 * The meta object id for the '<em>Encoding Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.Encoding
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getEncodingObject()
	 * @generated
	 */
	int ENCODING_OBJECT = 286;

	/**
	 * The meta object id for the '<em>Energy Source Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.EnergySourceType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getEnergySourceTypeObject()
	 * @generated
	 */
	int ENERGY_SOURCE_TYPE_OBJECT = 287;

	/**
	 * The meta object id for the '<em>Evidence Technique Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.EvidenceTechnique
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getEvidenceTechniqueObject()
	 * @generated
	 */
	int EVIDENCE_TECHNIQUE_OBJECT = 288;

	/**
	 * The meta object id for the '<em>Execution Environment Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ExecutionEnvironmentType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getExecutionEnvironmentTypeObject()
	 * @generated
	 */
	int EXECUTION_ENVIRONMENT_TYPE_OBJECT = 289;

	/**
	 * The meta object id for the '<em>External Reference Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ExternalReferenceType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getExternalReferenceTypeObject()
	 * @generated
	 */
	int EXTERNAL_REFERENCE_TYPE_OBJECT = 290;

	/**
	 * The meta object id for the '<em>Hash Alg Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.HashAlg
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getHashAlgObject()
	 * @generated
	 */
	int HASH_ALG_OBJECT = 291;

	/**
	 * The meta object id for the '<em>Hash Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getHashValue()
	 * @generated
	 */
	int HASH_VALUE = 292;

	/**
	 * The meta object id for the '<em>Identity Field Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.IdentityFieldType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getIdentityFieldTypeObject()
	 * @generated
	 */
	int IDENTITY_FIELD_TYPE_OBJECT = 293;

	/**
	 * The meta object id for the '<em>Impact Analysis Affected Status Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisAffectedStatusType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getImpactAnalysisAffectedStatusTypeObject()
	 * @generated
	 */
	int IMPACT_ANALYSIS_AFFECTED_STATUS_TYPE_OBJECT = 294;

	/**
	 * The meta object id for the '<em>Impact Analysis Justification Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisJustificationType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getImpactAnalysisJustificationTypeObject()
	 * @generated
	 */
	int IMPACT_ANALYSIS_JUSTIFICATION_TYPE_OBJECT = 295;

	/**
	 * The meta object id for the '<em>Impact Analysis Responses Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisResponsesType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getImpactAnalysisResponsesTypeObject()
	 * @generated
	 */
	int IMPACT_ANALYSIS_RESPONSES_TYPE_OBJECT = 296;

	/**
	 * The meta object id for the '<em>Impact Analysis State Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisStateType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getImpactAnalysisStateTypeObject()
	 * @generated
	 */
	int IMPACT_ANALYSIS_STATE_TYPE_OBJECT = 297;

	/**
	 * The meta object id for the '<em>Implementation Platform Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ImplementationPlatformType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getImplementationPlatformTypeObject()
	 * @generated
	 */
	int IMPLEMENTATION_PLATFORM_TYPE_OBJECT = 298;

	/**
	 * The meta object id for the '<em>Issue Classification Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.IssueClassification
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getIssueClassificationObject()
	 * @generated
	 */
	int ISSUE_CLASSIFICATION_OBJECT = 299;

	/**
	 * The meta object id for the '<em>License Acknowledgement Enumeration Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.LicenseAcknowledgementEnumerationType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getLicenseAcknowledgementEnumerationTypeObject()
	 * @generated
	 */
	int LICENSE_ACKNOWLEDGEMENT_ENUMERATION_TYPE_OBJECT = 300;

	/**
	 * The meta object id for the '<em>License Type Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.LicenseTypeEnum
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getLicenseTypeEnumObject()
	 * @generated
	 */
	int LICENSE_TYPE_ENUM_OBJECT = 301;

	/**
	 * The meta object id for the '<em>Lifecycle Phase Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.LifecyclePhaseType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getLifecyclePhaseTypeObject()
	 * @generated
	 */
	int LIFECYCLE_PHASE_TYPE_OBJECT = 302;

	/**
	 * The meta object id for the '<em>Locale Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getLocaleType()
	 * @generated
	 */
	int LOCALE_TYPE = 303;

	/**
	 * The meta object id for the '<em>Machine Learning Approach Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.MachineLearningApproachType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getMachineLearningApproachTypeObject()
	 * @generated
	 */
	int MACHINE_LEARNING_APPROACH_TYPE_OBJECT = 304;

	/**
	 * The meta object id for the '<em>Mime Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getMimeType()
	 * @generated
	 */
	int MIME_TYPE = 305;

	/**
	 * The meta object id for the '<em>Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ModeType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getModeTypeObject()
	 * @generated
	 */
	int MODE_TYPE_OBJECT = 306;

	/**
	 * The meta object id for the '<em>Nist Quantum Security Level Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getNistQuantumSecurityLevelType()
	 * @generated
	 */
	int NIST_QUANTUM_SECURITY_LEVEL_TYPE = 307;

	/**
	 * The meta object id for the '<em>Open Cre Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getOpenCreType()
	 * @generated
	 */
	int OPEN_CRE_TYPE = 308;

	/**
	 * The meta object id for the '<em>Output Type Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.OutputTypeEnum
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getOutputTypeEnumObject()
	 * @generated
	 */
	int OUTPUT_TYPE_ENUM_OBJECT = 309;

	/**
	 * The meta object id for the '<em>Padding Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.PaddingType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getPaddingTypeObject()
	 * @generated
	 */
	int PADDING_TYPE_OBJECT = 310;

	/**
	 * The meta object id for the '<em>Patch Classification Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.PatchClassification
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getPatchClassificationObject()
	 * @generated
	 */
	int PATCH_CLASSIFICATION_OBJECT = 311;

	/**
	 * The meta object id for the '<em>Primitive Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.PrimitiveType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getPrimitiveTypeObject()
	 * @generated
	 */
	int PRIMITIVE_TYPE_OBJECT = 312;

	/**
	 * The meta object id for the '<em>Ref Link Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getRefLinkType()
	 * @generated
	 */
	int REF_LINK_TYPE = 313;

	/**
	 * The meta object id for the '<em>Ref Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getRefType()
	 * @generated
	 */
	int REF_TYPE = 314;

	/**
	 * The meta object id for the '<em>Ref Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getRefType1()
	 * @generated
	 */
	int REF_TYPE1 = 315;

	/**
	 * The meta object id for the '<em>Ref Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getRefType2()
	 * @generated
	 */
	int REF_TYPE2 = 316;

	/**
	 * The meta object id for the '<em>Ref Type3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getRefType3()
	 * @generated
	 */
	int REF_TYPE3 = 317;

	/**
	 * The meta object id for the '<em>Ref Type4</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getRefType4()
	 * @generated
	 */
	int REF_TYPE4 = 318;

	/**
	 * The meta object id for the '<em>Scope Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.Scope
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getScopeObject()
	 * @generated
	 */
	int SCOPE_OBJECT = 319;

	/**
	 * The meta object id for the '<em>Score Source Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.ScoreSourceType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getScoreSourceTypeObject()
	 * @generated
	 */
	int SCORE_SOURCE_TYPE_OBJECT = 320;

	/**
	 * The meta object id for the '<em>Score Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getScoreType()
	 * @generated
	 */
	int SCORE_TYPE = 321;

	/**
	 * The meta object id for the '<em>Score Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getScoreType1()
	 * @generated
	 */
	int SCORE_TYPE1 = 322;

	/**
	 * The meta object id for the '<em>Severity Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.SeverityType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getSeverityTypeObject()
	 * @generated
	 */
	int SEVERITY_TYPE_OBJECT = 323;

	/**
	 * The meta object id for the '<em>State Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.StateType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getStateTypeObject()
	 * @generated
	 */
	int STATE_TYPE_OBJECT = 324;

	/**
	 * The meta object id for the '<em>Task Type Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.TaskTypeEnum
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getTaskTypeEnumObject()
	 * @generated
	 */
	int TASK_TYPE_ENUM_OBJECT = 325;

	/**
	 * The meta object id for the '<em>Trigger Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.TriggerTypeType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getTriggerTypeTypeObject()
	 * @generated
	 */
	int TRIGGER_TYPE_TYPE_OBJECT = 326;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.TypeType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 327;

	/**
	 * The meta object id for the '<em>Type Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.TypeType1
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getTypeTypeObject1()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT1 = 328;

	/**
	 * The meta object id for the '<em>Unit Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.UnitType
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getUnitTypeObject()
	 * @generated
	 */
	int UNIT_TYPE_OBJECT = 329;

	/**
	 * The meta object id for the '<em>Unit Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.UnitType1
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getUnitTypeObject1()
	 * @generated
	 */
	int UNIT_TYPE_OBJECT1 = 330;

	/**
	 * The meta object id for the '<em>Url Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getUrlType()
	 * @generated
	 */
	int URL_TYPE = 331;

	/**
	 * The meta object id for the '<em>Url Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getUrlType1()
	 * @generated
	 */
	int URL_TYPE1 = 332;

	/**
	 * The meta object id for the '<em>Url Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getUrlType2()
	 * @generated
	 */
	int URL_TYPE2 = 333;

	/**
	 * The meta object id for the '<em>Urn Uuid</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getUrnUuid()
	 * @generated
	 */
	int URN_UUID = 334;

	/**
	 * The meta object id for the '<em>Version Range Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getVersionRangeType()
	 * @generated
	 */
	int VERSION_RANGE_TYPE = 335;

	/**
	 * The meta object id for the '<em>Version Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getVersionType1()
	 * @generated
	 */
	int VERSION_TYPE1 = 336;

	/**
	 * The meta object id for the '<em>Volume Mode Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cyclonedx.schema.bom.VolumeModeEnum
	 * @see org.cyclonedx.schema.bom.impl.BOMPackageImpl#getVolumeModeEnumObject()
	 * @generated
	 */
	int VOLUME_MODE_ENUM_OBJECT = 337;


	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.AdvisoriesType <em>Advisories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advisories Type</em>'.
	 * @see org.cyclonedx.schema.bom.AdvisoriesType
	 * @generated
	 */
	EClass getAdvisoriesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.AdvisoriesType#getAdvisory <em>Advisory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Advisory</em>'.
	 * @see org.cyclonedx.schema.bom.AdvisoriesType#getAdvisory()
	 * @see #getAdvisoriesType()
	 * @generated
	 */
	EReference getAdvisoriesType_Advisory();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.AdvisoryType <em>Advisory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advisory Type</em>'.
	 * @see org.cyclonedx.schema.bom.AdvisoryType
	 * @generated
	 */
	EClass getAdvisoryType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AdvisoryType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.cyclonedx.schema.bom.AdvisoryType#getTitle()
	 * @see #getAdvisoryType()
	 * @generated
	 */
	EAttribute getAdvisoryType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AdvisoryType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.cyclonedx.schema.bom.AdvisoryType#getUrl()
	 * @see #getAdvisoryType()
	 * @generated
	 */
	EAttribute getAdvisoryType_Url();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.AffectsType <em>Affects Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affects Type</em>'.
	 * @see org.cyclonedx.schema.bom.AffectsType
	 * @generated
	 */
	EClass getAffectsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.AffectsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.AffectsType#getGroup()
	 * @see #getAffectsType()
	 * @generated
	 */
	EAttribute getAffectsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.AffectsType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see org.cyclonedx.schema.bom.AffectsType#getTarget()
	 * @see #getAffectsType()
	 * @generated
	 */
	EReference getAffectsType_Target();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.AffirmationType <em>Affirmation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affirmation Type</em>'.
	 * @see org.cyclonedx.schema.bom.AffirmationType
	 * @generated
	 */
	EClass getAffirmationType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AffirmationType#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see org.cyclonedx.schema.bom.AffirmationType#getStatement()
	 * @see #getAffirmationType()
	 * @generated
	 */
	EAttribute getAffirmationType_Statement();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.AffirmationType#getSignatories <em>Signatories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signatories</em>'.
	 * @see org.cyclonedx.schema.bom.AffirmationType#getSignatories()
	 * @see #getAffirmationType()
	 * @generated
	 */
	EReference getAffirmationType_Signatories();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.AffirmationType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.AffirmationType#getAny()
	 * @see #getAffirmationType()
	 * @generated
	 */
	EAttribute getAffirmationType_Any();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType <em>Algorithm Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm Properties Type</em>'.
	 * @see org.cyclonedx.schema.bom.AlgorithmPropertiesType
	 * @generated
	 */
	EClass getAlgorithmPropertiesType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getPrimitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive</em>'.
	 * @see org.cyclonedx.schema.bom.AlgorithmPropertiesType#getPrimitive()
	 * @see #getAlgorithmPropertiesType()
	 * @generated
	 */
	EAttribute getAlgorithmPropertiesType_Primitive();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getParameterSetIdentifier <em>Parameter Set Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Set Identifier</em>'.
	 * @see org.cyclonedx.schema.bom.AlgorithmPropertiesType#getParameterSetIdentifier()
	 * @see #getAlgorithmPropertiesType()
	 * @generated
	 */
	EAttribute getAlgorithmPropertiesType_ParameterSetIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getCurve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curve</em>'.
	 * @see org.cyclonedx.schema.bom.AlgorithmPropertiesType#getCurve()
	 * @see #getAlgorithmPropertiesType()
	 * @generated
	 */
	EAttribute getAlgorithmPropertiesType_Curve();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getExecutionEnvironment <em>Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Environment</em>'.
	 * @see org.cyclonedx.schema.bom.AlgorithmPropertiesType#getExecutionEnvironment()
	 * @see #getAlgorithmPropertiesType()
	 * @generated
	 */
	EAttribute getAlgorithmPropertiesType_ExecutionEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getImplementationPlatform <em>Implementation Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Platform</em>'.
	 * @see org.cyclonedx.schema.bom.AlgorithmPropertiesType#getImplementationPlatform()
	 * @see #getAlgorithmPropertiesType()
	 * @generated
	 */
	EAttribute getAlgorithmPropertiesType_ImplementationPlatform();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getCertificationLevel <em>Certification Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Certification Level</em>'.
	 * @see org.cyclonedx.schema.bom.AlgorithmPropertiesType#getCertificationLevel()
	 * @see #getAlgorithmPropertiesType()
	 * @generated
	 */
	EAttribute getAlgorithmPropertiesType_CertificationLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.cyclonedx.schema.bom.AlgorithmPropertiesType#getMode()
	 * @see #getAlgorithmPropertiesType()
	 * @generated
	 */
	EAttribute getAlgorithmPropertiesType_Mode();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getPadding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Padding</em>'.
	 * @see org.cyclonedx.schema.bom.AlgorithmPropertiesType#getPadding()
	 * @see #getAlgorithmPropertiesType()
	 * @generated
	 */
	EAttribute getAlgorithmPropertiesType_Padding();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getCryptoFunctions <em>Crypto Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crypto Functions</em>'.
	 * @see org.cyclonedx.schema.bom.AlgorithmPropertiesType#getCryptoFunctions()
	 * @see #getAlgorithmPropertiesType()
	 * @generated
	 */
	EReference getAlgorithmPropertiesType_CryptoFunctions();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getClassicalSecurityLevel <em>Classical Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classical Security Level</em>'.
	 * @see org.cyclonedx.schema.bom.AlgorithmPropertiesType#getClassicalSecurityLevel()
	 * @see #getAlgorithmPropertiesType()
	 * @generated
	 */
	EAttribute getAlgorithmPropertiesType_ClassicalSecurityLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getNistQuantumSecurityLevel <em>Nist Quantum Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nist Quantum Security Level</em>'.
	 * @see org.cyclonedx.schema.bom.AlgorithmPropertiesType#getNistQuantumSecurityLevel()
	 * @see #getAlgorithmPropertiesType()
	 * @generated
	 */
	EAttribute getAlgorithmPropertiesType_NistQuantumSecurityLevel();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.AlgorithmsType <em>Algorithms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithms Type</em>'.
	 * @see org.cyclonedx.schema.bom.AlgorithmsType
	 * @generated
	 */
	EClass getAlgorithmsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.AlgorithmsType#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Algorithm</em>'.
	 * @see org.cyclonedx.schema.bom.AlgorithmsType#getAlgorithm()
	 * @see #getAlgorithmsType()
	 * @generated
	 */
	EAttribute getAlgorithmsType_Algorithm();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.AliasesType <em>Aliases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aliases Type</em>'.
	 * @see org.cyclonedx.schema.bom.AliasesType
	 * @generated
	 */
	EClass getAliasesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.AliasesType#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Alias</em>'.
	 * @see org.cyclonedx.schema.bom.AliasesType#getAlias()
	 * @see #getAliasesType()
	 * @generated
	 */
	EAttribute getAliasesType_Alias();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.AliasesType1 <em>Aliases Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aliases Type1</em>'.
	 * @see org.cyclonedx.schema.bom.AliasesType1
	 * @generated
	 */
	EClass getAliasesType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.AliasesType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.AliasesType1#getGroup()
	 * @see #getAliasesType1()
	 * @generated
	 */
	EAttribute getAliasesType1_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.AliasesType1#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Alias</em>'.
	 * @see org.cyclonedx.schema.bom.AliasesType1#getAlias()
	 * @see #getAliasesType1()
	 * @generated
	 */
	EAttribute getAliasesType1_Alias();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.AltIdsType <em>Alt Ids Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt Ids Type</em>'.
	 * @see org.cyclonedx.schema.bom.AltIdsType
	 * @generated
	 */
	EClass getAltIdsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.AltIdsType#getAltId <em>Alt Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Alt Id</em>'.
	 * @see org.cyclonedx.schema.bom.AltIdsType#getAltId()
	 * @see #getAltIdsType()
	 * @generated
	 */
	EAttribute getAltIdsType_AltId();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.AnalysisType <em>Analysis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Type</em>'.
	 * @see org.cyclonedx.schema.bom.AnalysisType
	 * @generated
	 */
	EClass getAnalysisType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AnalysisType#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.cyclonedx.schema.bom.AnalysisType#getState()
	 * @see #getAnalysisType()
	 * @generated
	 */
	EAttribute getAnalysisType_State();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AnalysisType#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justification</em>'.
	 * @see org.cyclonedx.schema.bom.AnalysisType#getJustification()
	 * @see #getAnalysisType()
	 * @generated
	 */
	EAttribute getAnalysisType_Justification();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.AnalysisType#getResponses <em>Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responses</em>'.
	 * @see org.cyclonedx.schema.bom.AnalysisType#getResponses()
	 * @see #getAnalysisType()
	 * @generated
	 */
	EReference getAnalysisType_Responses();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AnalysisType#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detail</em>'.
	 * @see org.cyclonedx.schema.bom.AnalysisType#getDetail()
	 * @see #getAnalysisType()
	 * @generated
	 */
	EAttribute getAnalysisType_Detail();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AnalysisType#getFirstIssued <em>First Issued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Issued</em>'.
	 * @see org.cyclonedx.schema.bom.AnalysisType#getFirstIssued()
	 * @see #getAnalysisType()
	 * @generated
	 */
	EAttribute getAnalysisType_FirstIssued();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AnalysisType#getLastUpdated <em>Last Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Updated</em>'.
	 * @see org.cyclonedx.schema.bom.AnalysisType#getLastUpdated()
	 * @see #getAnalysisType()
	 * @generated
	 */
	EAttribute getAnalysisType_LastUpdated();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.AnnotationsType <em>Annotations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotations Type</em>'.
	 * @see org.cyclonedx.schema.bom.AnnotationsType
	 * @generated
	 */
	EClass getAnnotationsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.AnnotationsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.AnnotationsType#getGroup()
	 * @see #getAnnotationsType()
	 * @generated
	 */
	EAttribute getAnnotationsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.AnnotationsType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.cyclonedx.schema.bom.AnnotationsType#getAnnotation()
	 * @see #getAnnotationsType()
	 * @generated
	 */
	EReference getAnnotationsType_Annotation();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.AnnotationsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.AnnotationsType#getAny()
	 * @see #getAnnotationsType()
	 * @generated
	 */
	EAttribute getAnnotationsType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.AnnotationsType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.AnnotationsType#getAnyAttribute()
	 * @see #getAnnotationsType()
	 * @generated
	 */
	EAttribute getAnnotationsType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.AnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Type</em>'.
	 * @see org.cyclonedx.schema.bom.AnnotationType
	 * @generated
	 */
	EClass getAnnotationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.AnnotationType#getSubjects <em>Subjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subjects</em>'.
	 * @see org.cyclonedx.schema.bom.AnnotationType#getSubjects()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Subjects();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.AnnotationType#getAnnotator <em>Annotator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotator</em>'.
	 * @see org.cyclonedx.schema.bom.AnnotationType#getAnnotator()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Annotator();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AnnotationType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.cyclonedx.schema.bom.AnnotationType#getTimestamp()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AnnotationType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.cyclonedx.schema.bom.AnnotationType#getText()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Text();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.AnnotationType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.AnnotationType#getAny()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AnnotationType#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.AnnotationType#getBomRef()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_BomRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.AnnotationType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.AnnotationType#getAnyAttribute()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.AnnotatorChoiceType <em>Annotator Choice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotator Choice Type</em>'.
	 * @see org.cyclonedx.schema.bom.AnnotatorChoiceType
	 * @generated
	 */
	EClass getAnnotatorChoiceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.AnnotatorChoiceType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see org.cyclonedx.schema.bom.AnnotatorChoiceType#getOrganization()
	 * @see #getAnnotatorChoiceType()
	 * @generated
	 */
	EReference getAnnotatorChoiceType_Organization();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.AnnotatorChoiceType#getIndividual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Individual</em>'.
	 * @see org.cyclonedx.schema.bom.AnnotatorChoiceType#getIndividual()
	 * @see #getAnnotatorChoiceType()
	 * @generated
	 */
	EReference getAnnotatorChoiceType_Individual();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.AnnotatorChoiceType#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component</em>'.
	 * @see org.cyclonedx.schema.bom.AnnotatorChoiceType#getComponent()
	 * @see #getAnnotatorChoiceType()
	 * @generated
	 */
	EReference getAnnotatorChoiceType_Component();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.AnnotatorChoiceType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see org.cyclonedx.schema.bom.AnnotatorChoiceType#getService()
	 * @see #getAnnotatorChoiceType()
	 * @generated
	 */
	EReference getAnnotatorChoiceType_Service();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ApproachType <em>Approach Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Approach Type</em>'.
	 * @see org.cyclonedx.schema.bom.ApproachType
	 * @generated
	 */
	EClass getApproachType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ApproachType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.cyclonedx.schema.bom.ApproachType#getType()
	 * @see #getApproachType()
	 * @generated
	 */
	EAttribute getApproachType_Type();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.AssembliesType <em>Assemblies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assemblies Type</em>'.
	 * @see org.cyclonedx.schema.bom.AssembliesType
	 * @generated
	 */
	EClass getAssembliesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.AssembliesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.AssembliesType#getGroup()
	 * @see #getAssembliesType()
	 * @generated
	 */
	EAttribute getAssembliesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.AssembliesType#getAssembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assembly</em>'.
	 * @see org.cyclonedx.schema.bom.AssembliesType#getAssembly()
	 * @see #getAssembliesType()
	 * @generated
	 */
	EReference getAssembliesType_Assembly();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.AssembliesType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.AssembliesType#getAny()
	 * @see #getAssembliesType()
	 * @generated
	 */
	EAttribute getAssembliesType_Any();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.AssessorsType <em>Assessors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessors Type</em>'.
	 * @see org.cyclonedx.schema.bom.AssessorsType
	 * @generated
	 */
	EClass getAssessorsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.AssessorsType#getAssessor <em>Assessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assessor</em>'.
	 * @see org.cyclonedx.schema.bom.AssessorsType#getAssessor()
	 * @see #getAssessorsType()
	 * @generated
	 */
	EReference getAssessorsType_Assessor();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.AssessorType <em>Assessor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessor Type</em>'.
	 * @see org.cyclonedx.schema.bom.AssessorType
	 * @generated
	 */
	EClass getAssessorType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AssessorType#isThirdParty <em>Third Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Third Party</em>'.
	 * @see org.cyclonedx.schema.bom.AssessorType#isThirdParty()
	 * @see #getAssessorType()
	 * @generated
	 */
	EAttribute getAssessorType_ThirdParty();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.AssessorType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see org.cyclonedx.schema.bom.AssessorType#getOrganization()
	 * @see #getAssessorType()
	 * @generated
	 */
	EReference getAssessorType_Organization();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AssessorType#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.AssessorType#getBomRef()
	 * @see #getAssessorType()
	 * @generated
	 */
	EAttribute getAssessorType_BomRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.AssessorType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.AssessorType#getAnyAttribute()
	 * @see #getAssessorType()
	 * @generated
	 */
	EAttribute getAssessorType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.AttachedTextType <em>Attached Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attached Text Type</em>'.
	 * @see org.cyclonedx.schema.bom.AttachedTextType
	 * @generated
	 */
	EClass getAttachedTextType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AttachedTextType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.cyclonedx.schema.bom.AttachedTextType#getValue()
	 * @see #getAttachedTextType()
	 * @generated
	 */
	EAttribute getAttachedTextType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AttachedTextType#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see org.cyclonedx.schema.bom.AttachedTextType#getContentType()
	 * @see #getAttachedTextType()
	 * @generated
	 */
	EAttribute getAttachedTextType_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AttachedTextType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.cyclonedx.schema.bom.AttachedTextType#getEncoding()
	 * @see #getAttachedTextType()
	 * @generated
	 */
	EAttribute getAttachedTextType_Encoding();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.AttestationsType <em>Attestations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attestations Type</em>'.
	 * @see org.cyclonedx.schema.bom.AttestationsType
	 * @generated
	 */
	EClass getAttestationsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.AttestationsType#getAttestation <em>Attestation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attestation</em>'.
	 * @see org.cyclonedx.schema.bom.AttestationsType#getAttestation()
	 * @see #getAttestationsType()
	 * @generated
	 */
	EReference getAttestationsType_Attestation();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.AttestationType <em>Attestation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attestation Type</em>'.
	 * @see org.cyclonedx.schema.bom.AttestationType
	 * @generated
	 */
	EClass getAttestationType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AttestationType#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.cyclonedx.schema.bom.AttestationType#getSummary()
	 * @see #getAttestationType()
	 * @generated
	 */
	EAttribute getAttestationType_Summary();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.AttestationType#getAssessor <em>Assessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assessor</em>'.
	 * @see org.cyclonedx.schema.bom.AttestationType#getAssessor()
	 * @see #getAttestationType()
	 * @generated
	 */
	EAttribute getAttestationType_Assessor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.AttestationType#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.cyclonedx.schema.bom.AttestationType#getMap()
	 * @see #getAttestationType()
	 * @generated
	 */
	EReference getAttestationType_Map();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.AttestationType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.AttestationType#getAny()
	 * @see #getAttestationType()
	 * @generated
	 */
	EAttribute getAttestationType_Any();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.AuthorsType <em>Authors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authors Type</em>'.
	 * @see org.cyclonedx.schema.bom.AuthorsType
	 * @generated
	 */
	EClass getAuthorsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.AuthorsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.AuthorsType#getGroup()
	 * @see #getAuthorsType()
	 * @generated
	 */
	EAttribute getAuthorsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.AuthorsType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Author</em>'.
	 * @see org.cyclonedx.schema.bom.AuthorsType#getAuthor()
	 * @see #getAuthorsType()
	 * @generated
	 */
	EReference getAuthorsType_Author();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.AuthorsType1 <em>Authors Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authors Type1</em>'.
	 * @see org.cyclonedx.schema.bom.AuthorsType1
	 * @generated
	 */
	EClass getAuthorsType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.AuthorsType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.AuthorsType1#getGroup()
	 * @see #getAuthorsType1()
	 * @generated
	 */
	EAttribute getAuthorsType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.AuthorsType1#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Author</em>'.
	 * @see org.cyclonedx.schema.bom.AuthorsType1#getAuthor()
	 * @see #getAuthorsType1()
	 * @generated
	 */
	EReference getAuthorsType1_Author();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.BomReferenceType <em>Bom Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bom Reference Type</em>'.
	 * @see org.cyclonedx.schema.bom.BomReferenceType
	 * @generated
	 */
	EClass getBomReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.BomReferenceType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.cyclonedx.schema.bom.BomReferenceType#getRef()
	 * @see #getBomReferenceType()
	 * @generated
	 */
	EAttribute getBomReferenceType_Ref();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.BomReferenceType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.BomReferenceType#getAnyAttribute()
	 * @see #getBomReferenceType()
	 * @generated
	 */
	EAttribute getBomReferenceType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.BomType <em>Bom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bom Type</em>'.
	 * @see org.cyclonedx.schema.bom.BomType
	 * @generated
	 */
	EClass getBomType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.BomType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.cyclonedx.schema.bom.BomType#getMetadata()
	 * @see #getBomType()
	 * @generated
	 */
	EReference getBomType_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.BomType#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see org.cyclonedx.schema.bom.BomType#getComponents()
	 * @see #getBomType()
	 * @generated
	 */
	EReference getBomType_Components();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.BomType#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Services</em>'.
	 * @see org.cyclonedx.schema.bom.BomType#getServices()
	 * @see #getBomType()
	 * @generated
	 */
	EReference getBomType_Services();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.BomType#getExternalReferences <em>External References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External References</em>'.
	 * @see org.cyclonedx.schema.bom.BomType#getExternalReferences()
	 * @see #getBomType()
	 * @generated
	 */
	EReference getBomType_ExternalReferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.BomType#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see org.cyclonedx.schema.bom.BomType#getDependencies()
	 * @see #getBomType()
	 * @generated
	 */
	EReference getBomType_Dependencies();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.BomType#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compositions</em>'.
	 * @see org.cyclonedx.schema.bom.BomType#getCompositions()
	 * @see #getBomType()
	 * @generated
	 */
	EReference getBomType_Compositions();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.BomType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.BomType#getProperties()
	 * @see #getBomType()
	 * @generated
	 */
	EReference getBomType_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.BomType#getVulnerabilities <em>Vulnerabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vulnerabilities</em>'.
	 * @see org.cyclonedx.schema.bom.BomType#getVulnerabilities()
	 * @see #getBomType()
	 * @generated
	 */
	EReference getBomType_Vulnerabilities();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.BomType#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotations</em>'.
	 * @see org.cyclonedx.schema.bom.BomType#getAnnotations()
	 * @see #getBomType()
	 * @generated
	 */
	EReference getBomType_Annotations();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.BomType#getFormulation <em>Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formulation</em>'.
	 * @see org.cyclonedx.schema.bom.BomType#getFormulation()
	 * @see #getBomType()
	 * @generated
	 */
	EReference getBomType_Formulation();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.BomType#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declarations</em>'.
	 * @see org.cyclonedx.schema.bom.BomType#getDeclarations()
	 * @see #getBomType()
	 * @generated
	 */
	EReference getBomType_Declarations();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.BomType#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definitions</em>'.
	 * @see org.cyclonedx.schema.bom.BomType#getDefinitions()
	 * @see #getBomType()
	 * @generated
	 */
	EReference getBomType_Definitions();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.BomType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.BomType#getAny()
	 * @see #getBomType()
	 * @generated
	 */
	EAttribute getBomType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.BomType#getSerialNumber <em>Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Number</em>'.
	 * @see org.cyclonedx.schema.bom.BomType#getSerialNumber()
	 * @see #getBomType()
	 * @generated
	 */
	EAttribute getBomType_SerialNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.BomType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.cyclonedx.schema.bom.BomType#getVersion()
	 * @see #getBomType()
	 * @generated
	 */
	EAttribute getBomType_Version();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.BomType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.BomType#getAnyAttribute()
	 * @see #getBomType()
	 * @generated
	 */
	EAttribute getBomType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.CallstackType <em>Callstack Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callstack Type</em>'.
	 * @see org.cyclonedx.schema.bom.CallstackType
	 * @generated
	 */
	EClass getCallstackType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.CallstackType#getFrames <em>Frames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frames</em>'.
	 * @see org.cyclonedx.schema.bom.CallstackType#getFrames()
	 * @see #getCallstackType()
	 * @generated
	 */
	EReference getCallstackType_Frames();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.CallstackType#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tools</em>'.
	 * @see org.cyclonedx.schema.bom.CallstackType#getTools()
	 * @see #getCallstackType()
	 * @generated
	 */
	EReference getCallstackType_Tools();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.CertificatePropertiesType <em>Certificate Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certificate Properties Type</em>'.
	 * @see org.cyclonedx.schema.bom.CertificatePropertiesType
	 * @generated
	 */
	EClass getCertificatePropertiesType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getSubjectName <em>Subject Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject Name</em>'.
	 * @see org.cyclonedx.schema.bom.CertificatePropertiesType#getSubjectName()
	 * @see #getCertificatePropertiesType()
	 * @generated
	 */
	EAttribute getCertificatePropertiesType_SubjectName();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getIssuerName <em>Issuer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issuer Name</em>'.
	 * @see org.cyclonedx.schema.bom.CertificatePropertiesType#getIssuerName()
	 * @see #getCertificatePropertiesType()
	 * @generated
	 */
	EAttribute getCertificatePropertiesType_IssuerName();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getNotValidBefore <em>Not Valid Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Valid Before</em>'.
	 * @see org.cyclonedx.schema.bom.CertificatePropertiesType#getNotValidBefore()
	 * @see #getCertificatePropertiesType()
	 * @generated
	 */
	EAttribute getCertificatePropertiesType_NotValidBefore();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getNotValidAfter <em>Not Valid After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Valid After</em>'.
	 * @see org.cyclonedx.schema.bom.CertificatePropertiesType#getNotValidAfter()
	 * @see #getCertificatePropertiesType()
	 * @generated
	 */
	EAttribute getCertificatePropertiesType_NotValidAfter();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getSignatureAlgorithmRef <em>Signature Algorithm Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature Algorithm Ref</em>'.
	 * @see org.cyclonedx.schema.bom.CertificatePropertiesType#getSignatureAlgorithmRef()
	 * @see #getCertificatePropertiesType()
	 * @generated
	 */
	EAttribute getCertificatePropertiesType_SignatureAlgorithmRef();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getSubjectPublicKeyRef <em>Subject Public Key Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject Public Key Ref</em>'.
	 * @see org.cyclonedx.schema.bom.CertificatePropertiesType#getSubjectPublicKeyRef()
	 * @see #getCertificatePropertiesType()
	 * @generated
	 */
	EAttribute getCertificatePropertiesType_SubjectPublicKeyRef();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getCertificateFormat <em>Certificate Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate Format</em>'.
	 * @see org.cyclonedx.schema.bom.CertificatePropertiesType#getCertificateFormat()
	 * @see #getCertificatePropertiesType()
	 * @generated
	 */
	EAttribute getCertificatePropertiesType_CertificateFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getCertificateExtension <em>Certificate Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate Extension</em>'.
	 * @see org.cyclonedx.schema.bom.CertificatePropertiesType#getCertificateExtension()
	 * @see #getCertificatePropertiesType()
	 * @generated
	 */
	EAttribute getCertificatePropertiesType_CertificateExtension();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.CipherSuitesType <em>Cipher Suites Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cipher Suites Type</em>'.
	 * @see org.cyclonedx.schema.bom.CipherSuitesType
	 * @generated
	 */
	EClass getCipherSuitesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.CipherSuitesType#getCipherSuite <em>Cipher Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cipher Suite</em>'.
	 * @see org.cyclonedx.schema.bom.CipherSuitesType#getCipherSuite()
	 * @see #getCipherSuitesType()
	 * @generated
	 */
	EReference getCipherSuitesType_CipherSuite();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.CipherSuiteType <em>Cipher Suite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cipher Suite Type</em>'.
	 * @see org.cyclonedx.schema.bom.CipherSuiteType
	 * @generated
	 */
	EClass getCipherSuiteType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.CipherSuiteType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.CipherSuiteType#getName()
	 * @see #getCipherSuiteType()
	 * @generated
	 */
	EAttribute getCipherSuiteType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.CipherSuiteType#getAlgorithms <em>Algorithms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Algorithms</em>'.
	 * @see org.cyclonedx.schema.bom.CipherSuiteType#getAlgorithms()
	 * @see #getCipherSuiteType()
	 * @generated
	 */
	EReference getCipherSuiteType_Algorithms();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.CipherSuiteType#getIdentifiers <em>Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifiers</em>'.
	 * @see org.cyclonedx.schema.bom.CipherSuiteType#getIdentifiers()
	 * @see #getCipherSuiteType()
	 * @generated
	 */
	EReference getCipherSuiteType_Identifiers();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ClaimsType <em>Claims Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Claims Type</em>'.
	 * @see org.cyclonedx.schema.bom.ClaimsType
	 * @generated
	 */
	EClass getClaimsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ClaimsType#getClaim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Claim</em>'.
	 * @see org.cyclonedx.schema.bom.ClaimsType#getClaim()
	 * @see #getClaimsType()
	 * @generated
	 */
	EReference getClaimsType_Claim();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ClaimsType1 <em>Claims Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Claims Type1</em>'.
	 * @see org.cyclonedx.schema.bom.ClaimsType1
	 * @generated
	 */
	EClass getClaimsType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ClaimsType1#getClaim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Claim</em>'.
	 * @see org.cyclonedx.schema.bom.ClaimsType1#getClaim()
	 * @see #getClaimsType1()
	 * @generated
	 */
	EAttribute getClaimsType1_Claim();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ClaimType <em>Claim Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Claim Type</em>'.
	 * @see org.cyclonedx.schema.bom.ClaimType
	 * @generated
	 */
	EClass getClaimType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ClaimType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.cyclonedx.schema.bom.ClaimType#getTarget()
	 * @see #getClaimType()
	 * @generated
	 */
	EAttribute getClaimType_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ClaimType#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicate</em>'.
	 * @see org.cyclonedx.schema.bom.ClaimType#getPredicate()
	 * @see #getClaimType()
	 * @generated
	 */
	EAttribute getClaimType_Predicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ClaimType#getMitigationStrategies <em>Mitigation Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mitigation Strategies</em>'.
	 * @see org.cyclonedx.schema.bom.ClaimType#getMitigationStrategies()
	 * @see #getClaimType()
	 * @generated
	 */
	EReference getClaimType_MitigationStrategies();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ClaimType#getReasoning <em>Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reasoning</em>'.
	 * @see org.cyclonedx.schema.bom.ClaimType#getReasoning()
	 * @see #getClaimType()
	 * @generated
	 */
	EAttribute getClaimType_Reasoning();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ClaimType#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Evidence</em>'.
	 * @see org.cyclonedx.schema.bom.ClaimType#getEvidence()
	 * @see #getClaimType()
	 * @generated
	 */
	EAttribute getClaimType_Evidence();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ClaimType#getCounterEvidence <em>Counter Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Counter Evidence</em>'.
	 * @see org.cyclonedx.schema.bom.ClaimType#getCounterEvidence()
	 * @see #getClaimType()
	 * @generated
	 */
	EAttribute getClaimType_CounterEvidence();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ClaimType#getExternalReferences <em>External References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External References</em>'.
	 * @see org.cyclonedx.schema.bom.ClaimType#getExternalReferences()
	 * @see #getClaimType()
	 * @generated
	 */
	EReference getClaimType_ExternalReferences();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ClaimType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.ClaimType#getAny()
	 * @see #getClaimType()
	 * @generated
	 */
	EAttribute getClaimType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ClaimType#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.ClaimType#getBomRef()
	 * @see #getClaimType()
	 * @generated
	 */
	EAttribute getClaimType_BomRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ClaimType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.ClaimType#getAnyAttribute()
	 * @see #getClaimType()
	 * @generated
	 */
	EAttribute getClaimType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.Co2MeasureType <em>Co2 Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Co2 Measure Type</em>'.
	 * @see org.cyclonedx.schema.bom.Co2MeasureType
	 * @generated
	 */
	EClass getCo2MeasureType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Co2MeasureType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.cyclonedx.schema.bom.Co2MeasureType#getValue()
	 * @see #getCo2MeasureType()
	 * @generated
	 */
	EAttribute getCo2MeasureType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Co2MeasureType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.cyclonedx.schema.bom.Co2MeasureType#getUnit()
	 * @see #getCo2MeasureType()
	 * @generated
	 */
	EAttribute getCo2MeasureType_Unit();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Type</em>'.
	 * @see org.cyclonedx.schema.bom.CollectionType
	 * @generated
	 */
	EClass getCollectionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.CollectionType#getGraphic <em>Graphic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graphic</em>'.
	 * @see org.cyclonedx.schema.bom.CollectionType#getGraphic()
	 * @see #getCollectionType()
	 * @generated
	 */
	EReference getCollectionType_Graphic();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.CollectionType1 <em>Collection Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Type1</em>'.
	 * @see org.cyclonedx.schema.bom.CollectionType1
	 * @generated
	 */
	EClass getCollectionType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.CollectionType1#getGraphic <em>Graphic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graphic</em>'.
	 * @see org.cyclonedx.schema.bom.CollectionType1#getGraphic()
	 * @see #getCollectionType1()
	 * @generated
	 */
	EReference getCollectionType1_Graphic();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.CommandsType <em>Commands Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commands Type</em>'.
	 * @see org.cyclonedx.schema.bom.CommandsType
	 * @generated
	 */
	EClass getCommandsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.CommandsType#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command</em>'.
	 * @see org.cyclonedx.schema.bom.CommandsType#getCommand()
	 * @see #getCommandsType()
	 * @generated
	 */
	EReference getCommandsType_Command();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.CommandType <em>Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Type</em>'.
	 * @see org.cyclonedx.schema.bom.CommandType
	 * @generated
	 */
	EClass getCommandType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.CommandType#getExecuted <em>Executed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executed</em>'.
	 * @see org.cyclonedx.schema.bom.CommandType#getExecuted()
	 * @see #getCommandType()
	 * @generated
	 */
	EAttribute getCommandType_Executed();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.CommandType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.CommandType#getProperties()
	 * @see #getCommandType()
	 * @generated
	 */
	EReference getCommandType_Properties();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.CommitsType <em>Commits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commits Type</em>'.
	 * @see org.cyclonedx.schema.bom.CommitsType
	 * @generated
	 */
	EClass getCommitsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.CommitsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.CommitsType#getGroup()
	 * @see #getCommitsType()
	 * @generated
	 */
	EAttribute getCommitsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.CommitsType#getCommit <em>Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commit</em>'.
	 * @see org.cyclonedx.schema.bom.CommitsType#getCommit()
	 * @see #getCommitsType()
	 * @generated
	 */
	EReference getCommitsType_Commit();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.CommitsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.CommitsType#getAny()
	 * @see #getCommitsType()
	 * @generated
	 */
	EAttribute getCommitsType_Any();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.CommitType <em>Commit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commit Type</em>'.
	 * @see org.cyclonedx.schema.bom.CommitType
	 * @generated
	 */
	EClass getCommitType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.CommitType#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see org.cyclonedx.schema.bom.CommitType#getUid()
	 * @see #getCommitType()
	 * @generated
	 */
	EAttribute getCommitType_Uid();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.CommitType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.cyclonedx.schema.bom.CommitType#getUrl()
	 * @see #getCommitType()
	 * @generated
	 */
	EAttribute getCommitType_Url();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.CommitType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Author</em>'.
	 * @see org.cyclonedx.schema.bom.CommitType#getAuthor()
	 * @see #getCommitType()
	 * @generated
	 */
	EReference getCommitType_Author();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.CommitType#getCommitter <em>Committer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Committer</em>'.
	 * @see org.cyclonedx.schema.bom.CommitType#getCommitter()
	 * @see #getCommitType()
	 * @generated
	 */
	EReference getCommitType_Committer();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.CommitType#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.cyclonedx.schema.bom.CommitType#getMessage()
	 * @see #getCommitType()
	 * @generated
	 */
	EAttribute getCommitType_Message();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.CommitType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.CommitType#getAny()
	 * @see #getCommitType()
	 * @generated
	 */
	EAttribute getCommitType_Any();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.cyclonedx.schema.bom.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Component#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supplier</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getSupplier()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Supplier();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Component#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manufacturer</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getManufacturer()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Manufacturer();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Component#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authors</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getAuthors()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Authors();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Component#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getAuthor()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Component#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getPublisher()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Publisher();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Component#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getGroup()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Group();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Component#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getVersion()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Component#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getDescription()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Component#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getScope()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Component#getHashes <em>Hashes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hashes</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getHashes()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Hashes();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Component#getLicenses <em>Licenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Licenses</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getLicenses()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Licenses();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Component#getCopyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getCopyright()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Copyright();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Component#getCpe <em>Cpe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpe</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getCpe()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Cpe();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Component#getPurl <em>Purl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purl</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getPurl()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Purl();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.Component#getOmniborId <em>Omnibor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Omnibor Id</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getOmniborId()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_OmniborId();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.Component#getSwhid <em>Swhid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Swhid</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getSwhid()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Swhid();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Component#getSwid <em>Swid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Swid</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getSwid()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Swid();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Component#isModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.cyclonedx.schema.bom.Component#isModified()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Modified();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Component#getPedigree <em>Pedigree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pedigree</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getPedigree()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Pedigree();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Component#getExternalReferences <em>External References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External References</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getExternalReferences()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ExternalReferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Component#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getProperties()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Component#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getComponents()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Components();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Component#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Evidence</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getEvidence()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Evidence();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Component#getReleaseNotes <em>Release Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Release Notes</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getReleaseNotes()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ReleaseNotes();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Component#getModelCard <em>Model Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Card</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getModelCard()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ModelCard();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.Component#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getData()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Data();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Component#getCryptoProperties <em>Crypto Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crypto Properties</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getCryptoProperties()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_CryptoProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Component#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tags</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getTags()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Tags();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.Component#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getAny()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Component#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getBomRef()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_BomRef();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Component#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getMimeType()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Component#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getType()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.Component#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.Component#getAnyAttribute()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ComponentDataType <em>Component Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Data Type</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentDataType
	 * @generated
	 */
	EClass getComponentDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ComponentDataType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentDataType#getType()
	 * @see #getComponentDataType()
	 * @generated
	 */
	EAttribute getComponentDataType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ComponentDataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentDataType#getName()
	 * @see #getComponentDataType()
	 * @generated
	 */
	EAttribute getComponentDataType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ComponentDataType#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contents</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentDataType#getContents()
	 * @see #getComponentDataType()
	 * @generated
	 */
	EReference getComponentDataType_Contents();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ComponentDataType#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentDataType#getClassification()
	 * @see #getComponentDataType()
	 * @generated
	 */
	EAttribute getComponentDataType_Classification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ComponentDataType#getSensitiveData <em>Sensitive Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensitive Data</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentDataType#getSensitiveData()
	 * @see #getComponentDataType()
	 * @generated
	 */
	EReference getComponentDataType_SensitiveData();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ComponentDataType#getGraphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphics</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentDataType#getGraphics()
	 * @see #getComponentDataType()
	 * @generated
	 */
	EReference getComponentDataType_Graphics();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ComponentDataType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentDataType#getDescription()
	 * @see #getComponentDataType()
	 * @generated
	 */
	EAttribute getComponentDataType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ComponentDataType#getGovernance <em>Governance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Governance</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentDataType#getGovernance()
	 * @see #getComponentDataType()
	 * @generated
	 */
	EReference getComponentDataType_Governance();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ComponentDataType#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentDataType#getBomRef()
	 * @see #getComponentDataType()
	 * @generated
	 */
	EAttribute getComponentDataType_BomRef();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ComponentEvidenceType <em>Component Evidence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Evidence Type</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentEvidenceType
	 * @generated
	 */
	EClass getComponentEvidenceType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ComponentEvidenceType#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identity</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentEvidenceType#getIdentity()
	 * @see #getComponentEvidenceType()
	 * @generated
	 */
	EReference getComponentEvidenceType_Identity();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ComponentEvidenceType#getOccurrences <em>Occurrences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Occurrences</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentEvidenceType#getOccurrences()
	 * @see #getComponentEvidenceType()
	 * @generated
	 */
	EReference getComponentEvidenceType_Occurrences();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ComponentEvidenceType#getCallstack <em>Callstack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Callstack</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentEvidenceType#getCallstack()
	 * @see #getComponentEvidenceType()
	 * @generated
	 */
	EReference getComponentEvidenceType_Callstack();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ComponentEvidenceType#getLicenses <em>Licenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Licenses</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentEvidenceType#getLicenses()
	 * @see #getComponentEvidenceType()
	 * @generated
	 */
	EReference getComponentEvidenceType_Licenses();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ComponentEvidenceType#getCopyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Copyright</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentEvidenceType#getCopyright()
	 * @see #getComponentEvidenceType()
	 * @generated
	 */
	EReference getComponentEvidenceType_Copyright();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ComponentEvidenceType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentEvidenceType#getAny()
	 * @see #getComponentEvidenceType()
	 * @generated
	 */
	EAttribute getComponentEvidenceType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ComponentEvidenceType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentEvidenceType#getAnyAttribute()
	 * @see #getComponentEvidenceType()
	 * @generated
	 */
	EAttribute getComponentEvidenceType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ComponentsType <em>Components Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Components Type</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentsType
	 * @generated
	 */
	EClass getComponentsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ComponentsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentsType#getGroup()
	 * @see #getComponentsType()
	 * @generated
	 */
	EAttribute getComponentsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ComponentsType#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentsType#getComponent()
	 * @see #getComponentsType()
	 * @generated
	 */
	EReference getComponentsType_Component();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ComponentsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentsType#getAny()
	 * @see #getComponentsType()
	 * @generated
	 */
	EAttribute getComponentsType_Any();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ComponentsType1 <em>Components Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Components Type1</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentsType1
	 * @generated
	 */
	EClass getComponentsType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ComponentsType1#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentsType1#getComponent()
	 * @see #getComponentsType1()
	 * @generated
	 */
	EReference getComponentsType1_Component();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ComponentsType2 <em>Components Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Components Type2</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentsType2
	 * @generated
	 */
	EClass getComponentsType2();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ComponentsType2#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentsType2#getGroup()
	 * @see #getComponentsType2()
	 * @generated
	 */
	EAttribute getComponentsType2_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ComponentsType2#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentsType2#getComponent()
	 * @see #getComponentsType2()
	 * @generated
	 */
	EReference getComponentsType2_Component();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ComponentsType2#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentsType2#getAny()
	 * @see #getComponentsType2()
	 * @generated
	 */
	EAttribute getComponentsType2_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ComponentsType2#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentsType2#getAnyAttribute()
	 * @see #getComponentsType2()
	 * @generated
	 */
	EAttribute getComponentsType2_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.CompositionsType <em>Compositions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compositions Type</em>'.
	 * @see org.cyclonedx.schema.bom.CompositionsType
	 * @generated
	 */
	EClass getCompositionsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.CompositionsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.CompositionsType#getGroup()
	 * @see #getCompositionsType()
	 * @generated
	 */
	EAttribute getCompositionsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.CompositionsType#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composition</em>'.
	 * @see org.cyclonedx.schema.bom.CompositionsType#getComposition()
	 * @see #getCompositionsType()
	 * @generated
	 */
	EReference getCompositionsType_Composition();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.CompositionsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.CompositionsType#getAny()
	 * @see #getCompositionsType()
	 * @generated
	 */
	EAttribute getCompositionsType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.CompositionsType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.CompositionsType#getAnyAttribute()
	 * @see #getCompositionsType()
	 * @generated
	 */
	EAttribute getCompositionsType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.CompositionType <em>Composition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Type</em>'.
	 * @see org.cyclonedx.schema.bom.CompositionType
	 * @generated
	 */
	EClass getCompositionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.CompositionType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.CompositionType#getGroup()
	 * @see #getCompositionType()
	 * @generated
	 */
	EAttribute getCompositionType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.CompositionType#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Aggregate</em>'.
	 * @see org.cyclonedx.schema.bom.CompositionType#getAggregate()
	 * @see #getCompositionType()
	 * @generated
	 */
	EAttribute getCompositionType_Aggregate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.CompositionType#getAssemblies <em>Assemblies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assemblies</em>'.
	 * @see org.cyclonedx.schema.bom.CompositionType#getAssemblies()
	 * @see #getCompositionType()
	 * @generated
	 */
	EReference getCompositionType_Assemblies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.CompositionType#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see org.cyclonedx.schema.bom.CompositionType#getDependencies()
	 * @see #getCompositionType()
	 * @generated
	 */
	EReference getCompositionType_Dependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.CompositionType#getVulnerabilities <em>Vulnerabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vulnerabilities</em>'.
	 * @see org.cyclonedx.schema.bom.CompositionType#getVulnerabilities()
	 * @see #getCompositionType()
	 * @generated
	 */
	EReference getCompositionType_Vulnerabilities();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.CompositionType#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.CompositionType#getBomRef()
	 * @see #getCompositionType()
	 * @generated
	 */
	EAttribute getCompositionType_BomRef();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ConditionsType <em>Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditions Type</em>'.
	 * @see org.cyclonedx.schema.bom.ConditionsType
	 * @generated
	 */
	EClass getConditionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ConditionsType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see org.cyclonedx.schema.bom.ConditionsType#getCondition()
	 * @see #getConditionsType()
	 * @generated
	 */
	EReference getConditionsType_Condition();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Type</em>'.
	 * @see org.cyclonedx.schema.bom.ConditionType
	 * @generated
	 */
	EClass getConditionType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ConditionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.ConditionType#getDescription()
	 * @see #getConditionType()
	 * @generated
	 */
	EAttribute getConditionType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ConditionType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.cyclonedx.schema.bom.ConditionType#getExpression()
	 * @see #getConditionType()
	 * @generated
	 */
	EAttribute getConditionType_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ConditionType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.ConditionType#getProperties()
	 * @see #getConditionType()
	 * @generated
	 */
	EReference getConditionType_Properties();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ConfidenceIntervalType <em>Confidence Interval Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confidence Interval Type</em>'.
	 * @see org.cyclonedx.schema.bom.ConfidenceIntervalType
	 * @generated
	 */
	EClass getConfidenceIntervalType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ConfidenceIntervalType#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.cyclonedx.schema.bom.ConfidenceIntervalType#getLowerBound()
	 * @see #getConfidenceIntervalType()
	 * @generated
	 */
	EAttribute getConfidenceIntervalType_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ConfidenceIntervalType#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.cyclonedx.schema.bom.ConfidenceIntervalType#getUpperBound()
	 * @see #getConfidenceIntervalType()
	 * @generated
	 */
	EAttribute getConfidenceIntervalType_UpperBound();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ConfidenceType <em>Confidence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confidence Type</em>'.
	 * @see org.cyclonedx.schema.bom.ConfidenceType
	 * @generated
	 */
	EClass getConfidenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ConfidenceType#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see org.cyclonedx.schema.bom.ConfidenceType#getScore()
	 * @see #getConfidenceType()
	 * @generated
	 */
	EAttribute getConfidenceType_Score();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ConfidenceType#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see org.cyclonedx.schema.bom.ConfidenceType#getRationale()
	 * @see #getConfidenceType()
	 * @generated
	 */
	EAttribute getConfidenceType_Rationale();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ConformanceType <em>Conformance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conformance Type</em>'.
	 * @see org.cyclonedx.schema.bom.ConformanceType
	 * @generated
	 */
	EClass getConformanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ConformanceType#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see org.cyclonedx.schema.bom.ConformanceType#getScore()
	 * @see #getConformanceType()
	 * @generated
	 */
	EAttribute getConformanceType_Score();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ConformanceType#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see org.cyclonedx.schema.bom.ConformanceType#getRationale()
	 * @see #getConformanceType()
	 * @generated
	 */
	EAttribute getConformanceType_Rationale();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ConformanceType#getMitigationStrategies <em>Mitigation Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mitigation Strategies</em>'.
	 * @see org.cyclonedx.schema.bom.ConformanceType#getMitigationStrategies()
	 * @see #getConformanceType()
	 * @generated
	 */
	EReference getConformanceType_MitigationStrategies();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ConsiderationsType <em>Considerations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Considerations Type</em>'.
	 * @see org.cyclonedx.schema.bom.ConsiderationsType
	 * @generated
	 */
	EClass getConsiderationsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ConsiderationsType#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Users</em>'.
	 * @see org.cyclonedx.schema.bom.ConsiderationsType#getUsers()
	 * @see #getConsiderationsType()
	 * @generated
	 */
	EReference getConsiderationsType_Users();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ConsiderationsType#getUseCases <em>Use Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use Cases</em>'.
	 * @see org.cyclonedx.schema.bom.ConsiderationsType#getUseCases()
	 * @see #getConsiderationsType()
	 * @generated
	 */
	EReference getConsiderationsType_UseCases();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ConsiderationsType#getTechnicalLimitations <em>Technical Limitations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Technical Limitations</em>'.
	 * @see org.cyclonedx.schema.bom.ConsiderationsType#getTechnicalLimitations()
	 * @see #getConsiderationsType()
	 * @generated
	 */
	EReference getConsiderationsType_TechnicalLimitations();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ConsiderationsType#getPerformanceTradeoffs <em>Performance Tradeoffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Performance Tradeoffs</em>'.
	 * @see org.cyclonedx.schema.bom.ConsiderationsType#getPerformanceTradeoffs()
	 * @see #getConsiderationsType()
	 * @generated
	 */
	EReference getConsiderationsType_PerformanceTradeoffs();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ConsiderationsType#getEthicalConsiderations <em>Ethical Considerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ethical Considerations</em>'.
	 * @see org.cyclonedx.schema.bom.ConsiderationsType#getEthicalConsiderations()
	 * @see #getConsiderationsType()
	 * @generated
	 */
	EReference getConsiderationsType_EthicalConsiderations();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ConsiderationsType#getEnvironmentalConsiderations <em>Environmental Considerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environmental Considerations</em>'.
	 * @see org.cyclonedx.schema.bom.ConsiderationsType#getEnvironmentalConsiderations()
	 * @see #getConsiderationsType()
	 * @generated
	 */
	EReference getConsiderationsType_EnvironmentalConsiderations();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ConsiderationsType#getFairnessAssessments <em>Fairness Assessments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fairness Assessments</em>'.
	 * @see org.cyclonedx.schema.bom.ConsiderationsType#getFairnessAssessments()
	 * @see #getConsiderationsType()
	 * @generated
	 */
	EReference getConsiderationsType_FairnessAssessments();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ContentsType <em>Contents Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contents Type</em>'.
	 * @see org.cyclonedx.schema.bom.ContentsType
	 * @generated
	 */
	EClass getContentsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ContentsType#getAttachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attachment</em>'.
	 * @see org.cyclonedx.schema.bom.ContentsType#getAttachment()
	 * @see #getContentsType()
	 * @generated
	 */
	EReference getContentsType_Attachment();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ContentsType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.cyclonedx.schema.bom.ContentsType#getUrl()
	 * @see #getContentsType()
	 * @generated
	 */
	EAttribute getContentsType_Url();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ContentsType1 <em>Contents Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contents Type1</em>'.
	 * @see org.cyclonedx.schema.bom.ContentsType1
	 * @generated
	 */
	EClass getContentsType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ContentsType1#getAttachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attachment</em>'.
	 * @see org.cyclonedx.schema.bom.ContentsType1#getAttachment()
	 * @see #getContentsType1()
	 * @generated
	 */
	EReference getContentsType1_Attachment();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ContentsType1#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.cyclonedx.schema.bom.ContentsType1#getUrl()
	 * @see #getContentsType1()
	 * @generated
	 */
	EAttribute getContentsType1_Url();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ContentsType1#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.ContentsType1#getProperties()
	 * @see #getContentsType1()
	 * @generated
	 */
	EReference getContentsType1_Properties();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.CopyrightsType <em>Copyrights Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copyrights Type</em>'.
	 * @see org.cyclonedx.schema.bom.CopyrightsType
	 * @generated
	 */
	EClass getCopyrightsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.CopyrightsType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text</em>'.
	 * @see org.cyclonedx.schema.bom.CopyrightsType#getText()
	 * @see #getCopyrightsType()
	 * @generated
	 */
	EAttribute getCopyrightsType_Text();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.CounterClaimsType <em>Counter Claims Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counter Claims Type</em>'.
	 * @see org.cyclonedx.schema.bom.CounterClaimsType
	 * @generated
	 */
	EClass getCounterClaimsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.CounterClaimsType#getCounterClaim <em>Counter Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Counter Claim</em>'.
	 * @see org.cyclonedx.schema.bom.CounterClaimsType#getCounterClaim()
	 * @see #getCounterClaimsType()
	 * @generated
	 */
	EAttribute getCounterClaimsType_CounterClaim();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.CreditsType <em>Credits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credits Type</em>'.
	 * @see org.cyclonedx.schema.bom.CreditsType
	 * @generated
	 */
	EClass getCreditsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.CreditsType#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organizations</em>'.
	 * @see org.cyclonedx.schema.bom.CreditsType#getOrganizations()
	 * @see #getCreditsType()
	 * @generated
	 */
	EReference getCreditsType_Organizations();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.CreditsType#getIndividuals <em>Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Individuals</em>'.
	 * @see org.cyclonedx.schema.bom.CreditsType#getIndividuals()
	 * @see #getCreditsType()
	 * @generated
	 */
	EReference getCreditsType_Individuals();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.CryptoFunctionsType <em>Crypto Functions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crypto Functions Type</em>'.
	 * @see org.cyclonedx.schema.bom.CryptoFunctionsType
	 * @generated
	 */
	EClass getCryptoFunctionsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.CryptoFunctionsType#getCryptoFunction <em>Crypto Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Crypto Function</em>'.
	 * @see org.cyclonedx.schema.bom.CryptoFunctionsType#getCryptoFunction()
	 * @see #getCryptoFunctionsType()
	 * @generated
	 */
	EAttribute getCryptoFunctionsType_CryptoFunction();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.CryptoPropertiesType <em>Crypto Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crypto Properties Type</em>'.
	 * @see org.cyclonedx.schema.bom.CryptoPropertiesType
	 * @generated
	 */
	EClass getCryptoPropertiesType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.CryptoPropertiesType#getAssetType <em>Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Type</em>'.
	 * @see org.cyclonedx.schema.bom.CryptoPropertiesType#getAssetType()
	 * @see #getCryptoPropertiesType()
	 * @generated
	 */
	EAttribute getCryptoPropertiesType_AssetType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.CryptoPropertiesType#getAlgorithmProperties <em>Algorithm Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Algorithm Properties</em>'.
	 * @see org.cyclonedx.schema.bom.CryptoPropertiesType#getAlgorithmProperties()
	 * @see #getCryptoPropertiesType()
	 * @generated
	 */
	EReference getCryptoPropertiesType_AlgorithmProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.CryptoPropertiesType#getCertificateProperties <em>Certificate Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Certificate Properties</em>'.
	 * @see org.cyclonedx.schema.bom.CryptoPropertiesType#getCertificateProperties()
	 * @see #getCryptoPropertiesType()
	 * @generated
	 */
	EReference getCryptoPropertiesType_CertificateProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.CryptoPropertiesType#getRelatedCryptoMaterialProperties <em>Related Crypto Material Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Related Crypto Material Properties</em>'.
	 * @see org.cyclonedx.schema.bom.CryptoPropertiesType#getRelatedCryptoMaterialProperties()
	 * @see #getCryptoPropertiesType()
	 * @generated
	 */
	EReference getCryptoPropertiesType_RelatedCryptoMaterialProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.CryptoPropertiesType#getProtocolProperties <em>Protocol Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protocol Properties</em>'.
	 * @see org.cyclonedx.schema.bom.CryptoPropertiesType#getProtocolProperties()
	 * @see #getCryptoPropertiesType()
	 * @generated
	 */
	EReference getCryptoPropertiesType_ProtocolProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.CryptoPropertiesType#getOid <em>Oid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oid</em>'.
	 * @see org.cyclonedx.schema.bom.CryptoPropertiesType#getOid()
	 * @see #getCryptoPropertiesType()
	 * @generated
	 */
	EAttribute getCryptoPropertiesType_Oid();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.CustodiansType <em>Custodians Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custodians Type</em>'.
	 * @see org.cyclonedx.schema.bom.CustodiansType
	 * @generated
	 */
	EClass getCustodiansType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.CustodiansType#getCustodian <em>Custodian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custodian</em>'.
	 * @see org.cyclonedx.schema.bom.CustodiansType#getCustodian()
	 * @see #getCustodiansType()
	 * @generated
	 */
	EReference getCustodiansType_Custodian();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.CwesType <em>Cwes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cwes Type</em>'.
	 * @see org.cyclonedx.schema.bom.CwesType
	 * @generated
	 */
	EClass getCwesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.CwesType#getCwe <em>Cwe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cwe</em>'.
	 * @see org.cyclonedx.schema.bom.CwesType#getCwe()
	 * @see #getCwesType()
	 * @generated
	 */
	EAttribute getCwesType_Cwe();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.DataClassificationType <em>Data Classification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Classification Type</em>'.
	 * @see org.cyclonedx.schema.bom.DataClassificationType
	 * @generated
	 */
	EClass getDataClassificationType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.DataClassificationType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.cyclonedx.schema.bom.DataClassificationType#getValue()
	 * @see #getDataClassificationType()
	 * @generated
	 */
	EAttribute getDataClassificationType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.DataClassificationType#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow</em>'.
	 * @see org.cyclonedx.schema.bom.DataClassificationType#getFlow()
	 * @see #getDataClassificationType()
	 * @generated
	 */
	EAttribute getDataClassificationType_Flow();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.DataflowType <em>Dataflow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataflow Type</em>'.
	 * @see org.cyclonedx.schema.bom.DataflowType
	 * @generated
	 */
	EClass getDataflowType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.DataflowType#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification</em>'.
	 * @see org.cyclonedx.schema.bom.DataflowType#getClassification()
	 * @see #getDataflowType()
	 * @generated
	 */
	EReference getDataflowType_Classification();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.DataflowType#getGovernance <em>Governance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Governance</em>'.
	 * @see org.cyclonedx.schema.bom.DataflowType#getGovernance()
	 * @see #getDataflowType()
	 * @generated
	 */
	EReference getDataflowType_Governance();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.DataflowType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.cyclonedx.schema.bom.DataflowType#getSource()
	 * @see #getDataflowType()
	 * @generated
	 */
	EReference getDataflowType_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.DataflowType#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination</em>'.
	 * @see org.cyclonedx.schema.bom.DataflowType#getDestination()
	 * @see #getDataflowType()
	 * @generated
	 */
	EReference getDataflowType_Destination();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.DataflowType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.DataflowType#getDescription()
	 * @see #getDataflowType()
	 * @generated
	 */
	EAttribute getDataflowType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.DataflowType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.DataflowType#getName()
	 * @see #getDataflowType()
	 * @generated
	 */
	EAttribute getDataflowType_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.DataflowType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.DataflowType#getAnyAttribute()
	 * @see #getDataflowType()
	 * @generated
	 */
	EAttribute getDataflowType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.DataGovernance <em>Data Governance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Governance</em>'.
	 * @see org.cyclonedx.schema.bom.DataGovernance
	 * @generated
	 */
	EClass getDataGovernance();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.DataGovernance#getCustodians <em>Custodians</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custodians</em>'.
	 * @see org.cyclonedx.schema.bom.DataGovernance#getCustodians()
	 * @see #getDataGovernance()
	 * @generated
	 */
	EReference getDataGovernance_Custodians();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.DataGovernance#getStewards <em>Stewards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stewards</em>'.
	 * @see org.cyclonedx.schema.bom.DataGovernance#getStewards()
	 * @see #getDataGovernance()
	 * @generated
	 */
	EReference getDataGovernance_Stewards();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.DataGovernance#getOwners <em>Owners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owners</em>'.
	 * @see org.cyclonedx.schema.bom.DataGovernance#getOwners()
	 * @see #getDataGovernance()
	 * @generated
	 */
	EReference getDataGovernance_Owners();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.DatasetsType <em>Datasets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datasets Type</em>'.
	 * @see org.cyclonedx.schema.bom.DatasetsType
	 * @generated
	 */
	EClass getDatasetsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.DatasetsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.DatasetsType#getGroup()
	 * @see #getDatasetsType()
	 * @generated
	 */
	EAttribute getDatasetsType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.DatasetsType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ref</em>'.
	 * @see org.cyclonedx.schema.bom.DatasetsType#getRef()
	 * @see #getDatasetsType()
	 * @generated
	 */
	EAttribute getDatasetsType_Ref();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.DatasetsType#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataset</em>'.
	 * @see org.cyclonedx.schema.bom.DatasetsType#getDataset()
	 * @see #getDatasetsType()
	 * @generated
	 */
	EReference getDatasetsType_Dataset();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.cyclonedx.schema.bom.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.DataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.DataType#getName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.DataType#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contents</em>'.
	 * @see org.cyclonedx.schema.bom.DataType#getContents()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Contents();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.DataType#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification</em>'.
	 * @see org.cyclonedx.schema.bom.DataType#getClassification()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Classification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.DataType#getSensitiveData <em>Sensitive Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensitive Data</em>'.
	 * @see org.cyclonedx.schema.bom.DataType#getSensitiveData()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_SensitiveData();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.DataType#getGovernance <em>Governance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Governance</em>'.
	 * @see org.cyclonedx.schema.bom.DataType#getGovernance()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Governance();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.DataType1 <em>Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type1</em>'.
	 * @see org.cyclonedx.schema.bom.DataType1
	 * @generated
	 */
	EClass getDataType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.DataType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.DataType1#getGroup()
	 * @see #getDataType1()
	 * @generated
	 */
	EAttribute getDataType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.DataType1#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification</em>'.
	 * @see org.cyclonedx.schema.bom.DataType1#getClassification()
	 * @see #getDataType1()
	 * @generated
	 */
	EReference getDataType1_Classification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.DataType1#getDataflow <em>Dataflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataflow</em>'.
	 * @see org.cyclonedx.schema.bom.DataType1#getDataflow()
	 * @see #getDataType1()
	 * @generated
	 */
	EReference getDataType1_Dataflow();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.DeclarationsType <em>Declarations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declarations Type</em>'.
	 * @see org.cyclonedx.schema.bom.DeclarationsType
	 * @generated
	 */
	EClass getDeclarationsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.DeclarationsType#getAssessors <em>Assessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assessors</em>'.
	 * @see org.cyclonedx.schema.bom.DeclarationsType#getAssessors()
	 * @see #getDeclarationsType()
	 * @generated
	 */
	EReference getDeclarationsType_Assessors();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.DeclarationsType#getAttestations <em>Attestations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attestations</em>'.
	 * @see org.cyclonedx.schema.bom.DeclarationsType#getAttestations()
	 * @see #getDeclarationsType()
	 * @generated
	 */
	EReference getDeclarationsType_Attestations();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.DeclarationsType#getClaims <em>Claims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Claims</em>'.
	 * @see org.cyclonedx.schema.bom.DeclarationsType#getClaims()
	 * @see #getDeclarationsType()
	 * @generated
	 */
	EReference getDeclarationsType_Claims();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.DeclarationsType#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Evidence</em>'.
	 * @see org.cyclonedx.schema.bom.DeclarationsType#getEvidence()
	 * @see #getDeclarationsType()
	 * @generated
	 */
	EReference getDeclarationsType_Evidence();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.DeclarationsType#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Targets</em>'.
	 * @see org.cyclonedx.schema.bom.DeclarationsType#getTargets()
	 * @see #getDeclarationsType()
	 * @generated
	 */
	EReference getDeclarationsType_Targets();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.DeclarationsType#getAffirmation <em>Affirmation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Affirmation</em>'.
	 * @see org.cyclonedx.schema.bom.DeclarationsType#getAffirmation()
	 * @see #getDeclarationsType()
	 * @generated
	 */
	EReference getDeclarationsType_Affirmation();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.DeclarationsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.DeclarationsType#getAny()
	 * @see #getDeclarationsType()
	 * @generated
	 */
	EAttribute getDeclarationsType_Any();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.DefinitionsType <em>Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definitions Type</em>'.
	 * @see org.cyclonedx.schema.bom.DefinitionsType
	 * @generated
	 */
	EClass getDefinitionsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.DefinitionsType#getStandards <em>Standards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standards</em>'.
	 * @see org.cyclonedx.schema.bom.DefinitionsType#getStandards()
	 * @see #getDefinitionsType()
	 * @generated
	 */
	EReference getDefinitionsType_Standards();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.DependenciesType <em>Dependencies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencies Type</em>'.
	 * @see org.cyclonedx.schema.bom.DependenciesType
	 * @generated
	 */
	EClass getDependenciesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.DependenciesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.DependenciesType#getGroup()
	 * @see #getDependenciesType()
	 * @generated
	 */
	EAttribute getDependenciesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.DependenciesType#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency</em>'.
	 * @see org.cyclonedx.schema.bom.DependenciesType#getDependency()
	 * @see #getDependenciesType()
	 * @generated
	 */
	EReference getDependenciesType_Dependency();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.DependenciesType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.DependenciesType#getAny()
	 * @see #getDependenciesType()
	 * @generated
	 */
	EAttribute getDependenciesType_Any();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.DependenciesType1 <em>Dependencies Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencies Type1</em>'.
	 * @see org.cyclonedx.schema.bom.DependenciesType1
	 * @generated
	 */
	EClass getDependenciesType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.DependenciesType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.DependenciesType1#getGroup()
	 * @see #getDependenciesType1()
	 * @generated
	 */
	EAttribute getDependenciesType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.DependenciesType1#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency</em>'.
	 * @see org.cyclonedx.schema.bom.DependenciesType1#getDependency()
	 * @see #getDependenciesType1()
	 * @generated
	 */
	EReference getDependenciesType1_Dependency();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.DependencyType <em>Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Type</em>'.
	 * @see org.cyclonedx.schema.bom.DependencyType
	 * @generated
	 */
	EClass getDependencyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.DependencyType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.DependencyType#getGroup()
	 * @see #getDependencyType()
	 * @generated
	 */
	EAttribute getDependencyType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.DependencyType#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency</em>'.
	 * @see org.cyclonedx.schema.bom.DependencyType#getDependency()
	 * @see #getDependencyType()
	 * @generated
	 */
	EReference getDependencyType_Dependency();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.DependencyType#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provides</em>'.
	 * @see org.cyclonedx.schema.bom.DependencyType#getProvides()
	 * @see #getDependencyType()
	 * @generated
	 */
	EReference getDependencyType_Provides();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.DependencyType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.cyclonedx.schema.bom.DependencyType#getRef()
	 * @see #getDependencyType()
	 * @generated
	 */
	EAttribute getDependencyType_Ref();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.DependencyType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.DependencyType#getAnyAttribute()
	 * @see #getDependencyType()
	 * @generated
	 */
	EAttribute getDependencyType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.DescriptionsType <em>Descriptions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptions Type</em>'.
	 * @see org.cyclonedx.schema.bom.DescriptionsType
	 * @generated
	 */
	EClass getDescriptionsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.DescriptionsType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.DescriptionsType#getDescription()
	 * @see #getDescriptionsType()
	 * @generated
	 */
	EAttribute getDescriptionsType_Description();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.DestinationType <em>Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destination Type</em>'.
	 * @see org.cyclonedx.schema.bom.DestinationType
	 * @generated
	 */
	EClass getDestinationType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.DestinationType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.DestinationType#getGroup()
	 * @see #getDestinationType()
	 * @generated
	 */
	EAttribute getDestinationType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.DestinationType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Url</em>'.
	 * @see org.cyclonedx.schema.bom.DestinationType#getUrl()
	 * @see #getDestinationType()
	 * @generated
	 */
	EAttribute getDestinationType_Url();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.DiffType <em>Diff Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Type</em>'.
	 * @see org.cyclonedx.schema.bom.DiffType
	 * @generated
	 */
	EClass getDiffType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.DiffType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.cyclonedx.schema.bom.DiffType#getText()
	 * @see #getDiffType()
	 * @generated
	 */
	EReference getDiffType_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.DiffType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.cyclonedx.schema.bom.DiffType#getUrl()
	 * @see #getDiffType()
	 * @generated
	 */
	EAttribute getDiffType_Url();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.DiffType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.DiffType#getAny()
	 * @see #getDiffType()
	 * @generated
	 */
	EAttribute getDiffType_Any();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.cyclonedx.schema.bom.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.cyclonedx.schema.bom.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.cyclonedx.schema.bom.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.cyclonedx.schema.bom.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.cyclonedx.schema.bom.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.cyclonedx.schema.bom.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.DocumentRoot#getBom <em>Bom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bom</em>'.
	 * @see org.cyclonedx.schema.bom.DocumentRoot#getBom()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Bom();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.EndpointsType <em>Endpoints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoints Type</em>'.
	 * @see org.cyclonedx.schema.bom.EndpointsType
	 * @generated
	 */
	EClass getEndpointsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.EndpointsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.EndpointsType#getGroup()
	 * @see #getEndpointsType()
	 * @generated
	 */
	EAttribute getEndpointsType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.EndpointsType#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Endpoint</em>'.
	 * @see org.cyclonedx.schema.bom.EndpointsType#getEndpoint()
	 * @see #getEndpointsType()
	 * @generated
	 */
	EAttribute getEndpointsType_Endpoint();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.EnergyConsumptionsType <em>Energy Consumptions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Consumptions Type</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyConsumptionsType
	 * @generated
	 */
	EClass getEnergyConsumptionsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.EnergyConsumptionsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyConsumptionsType#getGroup()
	 * @see #getEnergyConsumptionsType()
	 * @generated
	 */
	EAttribute getEnergyConsumptionsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.EnergyConsumptionsType#getEnergyConsumption <em>Energy Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Energy Consumption</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyConsumptionsType#getEnergyConsumption()
	 * @see #getEnergyConsumptionsType()
	 * @generated
	 */
	EReference getEnergyConsumptionsType_EnergyConsumption();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.EnergyConsumptionsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyConsumptionsType#getAny()
	 * @see #getEnergyConsumptionsType()
	 * @generated
	 */
	EAttribute getEnergyConsumptionsType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.EnergyConsumptionsType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyConsumptionsType#getAnyAttribute()
	 * @see #getEnergyConsumptionsType()
	 * @generated
	 */
	EAttribute getEnergyConsumptionsType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.EnergyConsumptionType <em>Energy Consumption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Consumption Type</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyConsumptionType
	 * @generated
	 */
	EClass getEnergyConsumptionType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.EnergyConsumptionType#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyConsumptionType#getActivity()
	 * @see #getEnergyConsumptionType()
	 * @generated
	 */
	EAttribute getEnergyConsumptionType_Activity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.EnergyConsumptionType#getEnergyProviders <em>Energy Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Energy Providers</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyConsumptionType#getEnergyProviders()
	 * @see #getEnergyConsumptionType()
	 * @generated
	 */
	EReference getEnergyConsumptionType_EnergyProviders();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.EnergyConsumptionType#getActivityEnergyCost <em>Activity Energy Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity Energy Cost</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyConsumptionType#getActivityEnergyCost()
	 * @see #getEnergyConsumptionType()
	 * @generated
	 */
	EReference getEnergyConsumptionType_ActivityEnergyCost();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.EnergyConsumptionType#getCo2CostEquivalent <em>Co2 Cost Equivalent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Co2 Cost Equivalent</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyConsumptionType#getCo2CostEquivalent()
	 * @see #getEnergyConsumptionType()
	 * @generated
	 */
	EReference getEnergyConsumptionType_Co2CostEquivalent();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.EnergyConsumptionType#getCo2CostOffset <em>Co2 Cost Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Co2 Cost Offset</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyConsumptionType#getCo2CostOffset()
	 * @see #getEnergyConsumptionType()
	 * @generated
	 */
	EReference getEnergyConsumptionType_Co2CostOffset();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.EnergyConsumptionType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyConsumptionType#getProperties()
	 * @see #getEnergyConsumptionType()
	 * @generated
	 */
	EReference getEnergyConsumptionType_Properties();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.EnergyMeasureType <em>Energy Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Measure Type</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyMeasureType
	 * @generated
	 */
	EClass getEnergyMeasureType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.EnergyMeasureType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyMeasureType#getValue()
	 * @see #getEnergyMeasureType()
	 * @generated
	 */
	EAttribute getEnergyMeasureType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.EnergyMeasureType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyMeasureType#getUnit()
	 * @see #getEnergyMeasureType()
	 * @generated
	 */
	EAttribute getEnergyMeasureType_Unit();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.EnergyProviderType <em>Energy Provider Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Provider Type</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyProviderType
	 * @generated
	 */
	EClass getEnergyProviderType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.EnergyProviderType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyProviderType#getDescription()
	 * @see #getEnergyProviderType()
	 * @generated
	 */
	EAttribute getEnergyProviderType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.EnergyProviderType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyProviderType#getOrganization()
	 * @see #getEnergyProviderType()
	 * @generated
	 */
	EReference getEnergyProviderType_Organization();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.EnergyProviderType#getEnergySource <em>Energy Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Source</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyProviderType#getEnergySource()
	 * @see #getEnergyProviderType()
	 * @generated
	 */
	EAttribute getEnergyProviderType_EnergySource();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.EnergyProviderType#getEnergyProvided <em>Energy Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Energy Provided</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyProviderType#getEnergyProvided()
	 * @see #getEnergyProviderType()
	 * @generated
	 */
	EReference getEnergyProviderType_EnergyProvided();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.EnergyProviderType#getExternalReferences <em>External References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External References</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyProviderType#getExternalReferences()
	 * @see #getEnergyProviderType()
	 * @generated
	 */
	EReference getEnergyProviderType_ExternalReferences();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.EnergyProviderType#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.EnergyProviderType#getBomRef()
	 * @see #getEnergyProviderType()
	 * @generated
	 */
	EAttribute getEnergyProviderType_BomRef();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.EnvironmentalConsiderationsType <em>Environmental Considerations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environmental Considerations Type</em>'.
	 * @see org.cyclonedx.schema.bom.EnvironmentalConsiderationsType
	 * @generated
	 */
	EClass getEnvironmentalConsiderationsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.EnvironmentalConsiderationsType#getEnergyConsumptions <em>Energy Consumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Energy Consumptions</em>'.
	 * @see org.cyclonedx.schema.bom.EnvironmentalConsiderationsType#getEnergyConsumptions()
	 * @see #getEnvironmentalConsiderationsType()
	 * @generated
	 */
	EReference getEnvironmentalConsiderationsType_EnergyConsumptions();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.EnvironmentalConsiderationsType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.EnvironmentalConsiderationsType#getProperties()
	 * @see #getEnvironmentalConsiderationsType()
	 * @generated
	 */
	EReference getEnvironmentalConsiderationsType_Properties();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.EnvironmentVarsType <em>Environment Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Vars Type</em>'.
	 * @see org.cyclonedx.schema.bom.EnvironmentVarsType
	 * @generated
	 */
	EClass getEnvironmentVarsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.EnvironmentVarsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.EnvironmentVarsType#getGroup()
	 * @see #getEnvironmentVarsType()
	 * @generated
	 */
	EAttribute getEnvironmentVarsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.EnvironmentVarsType#getEnvironmentVar <em>Environment Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment Var</em>'.
	 * @see org.cyclonedx.schema.bom.EnvironmentVarsType#getEnvironmentVar()
	 * @see #getEnvironmentVarsType()
	 * @generated
	 */
	EReference getEnvironmentVarsType_EnvironmentVar();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.EnvironmentVarsType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see org.cyclonedx.schema.bom.EnvironmentVarsType#getValue()
	 * @see #getEnvironmentVarsType()
	 * @generated
	 */
	EAttribute getEnvironmentVarsType_Value();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.EnvironmentVarsType1 <em>Environment Vars Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Vars Type1</em>'.
	 * @see org.cyclonedx.schema.bom.EnvironmentVarsType1
	 * @generated
	 */
	EClass getEnvironmentVarsType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.EnvironmentVarsType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.EnvironmentVarsType1#getGroup()
	 * @see #getEnvironmentVarsType1()
	 * @generated
	 */
	EAttribute getEnvironmentVarsType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.EnvironmentVarsType1#getEnvironmentVar <em>Environment Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment Var</em>'.
	 * @see org.cyclonedx.schema.bom.EnvironmentVarsType1#getEnvironmentVar()
	 * @see #getEnvironmentVarsType1()
	 * @generated
	 */
	EReference getEnvironmentVarsType1_EnvironmentVar();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.EnvironmentVarsType1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see org.cyclonedx.schema.bom.EnvironmentVarsType1#getValue()
	 * @see #getEnvironmentVarsType1()
	 * @generated
	 */
	EAttribute getEnvironmentVarsType1_Value();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.EthicalConsiderationsType <em>Ethical Considerations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ethical Considerations Type</em>'.
	 * @see org.cyclonedx.schema.bom.EthicalConsiderationsType
	 * @generated
	 */
	EClass getEthicalConsiderationsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.EthicalConsiderationsType#getEthicalConsideration <em>Ethical Consideration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ethical Consideration</em>'.
	 * @see org.cyclonedx.schema.bom.EthicalConsiderationsType#getEthicalConsideration()
	 * @see #getEthicalConsiderationsType()
	 * @generated
	 */
	EReference getEthicalConsiderationsType_EthicalConsideration();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.EthicalConsiderationType <em>Ethical Consideration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ethical Consideration Type</em>'.
	 * @see org.cyclonedx.schema.bom.EthicalConsiderationType
	 * @generated
	 */
	EClass getEthicalConsiderationType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.EthicalConsiderationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.EthicalConsiderationType#getName()
	 * @see #getEthicalConsiderationType()
	 * @generated
	 */
	EAttribute getEthicalConsiderationType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.EthicalConsiderationType#getMitigationStrategy <em>Mitigation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mitigation Strategy</em>'.
	 * @see org.cyclonedx.schema.bom.EthicalConsiderationType#getMitigationStrategy()
	 * @see #getEthicalConsiderationType()
	 * @generated
	 */
	EAttribute getEthicalConsiderationType_MitigationStrategy();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Type</em>'.
	 * @see org.cyclonedx.schema.bom.EventType
	 * @generated
	 */
	EClass getEventType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.EventType#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see org.cyclonedx.schema.bom.EventType#getUid()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_Uid();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.EventType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.EventType#getDescription()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.EventType#getTimeReceived <em>Time Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Received</em>'.
	 * @see org.cyclonedx.schema.bom.EventType#getTimeReceived()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_TimeReceived();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.EventType#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.cyclonedx.schema.bom.EventType#getData()
	 * @see #getEventType()
	 * @generated
	 */
	EReference getEventType_Data();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.EventType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.cyclonedx.schema.bom.EventType#getSource()
	 * @see #getEventType()
	 * @generated
	 */
	EReference getEventType_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.EventType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.cyclonedx.schema.bom.EventType#getTarget()
	 * @see #getEventType()
	 * @generated
	 */
	EReference getEventType_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.EventType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.EventType#getProperties()
	 * @see #getEventType()
	 * @generated
	 */
	EReference getEventType_Properties();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.EventType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.EventType#getAny()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.EventType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.EventType#getAnyAttribute()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.EvidenceType <em>Evidence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evidence Type</em>'.
	 * @see org.cyclonedx.schema.bom.EvidenceType
	 * @generated
	 */
	EClass getEvidenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.EvidenceType#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.cyclonedx.schema.bom.EvidenceType#getPropertyName()
	 * @see #getEvidenceType()
	 * @generated
	 */
	EAttribute getEvidenceType_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.EvidenceType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.EvidenceType#getDescription()
	 * @see #getEvidenceType()
	 * @generated
	 */
	EAttribute getEvidenceType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.EvidenceType#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see org.cyclonedx.schema.bom.EvidenceType#getData()
	 * @see #getEvidenceType()
	 * @generated
	 */
	EReference getEvidenceType_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.EvidenceType#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see org.cyclonedx.schema.bom.EvidenceType#getCreated()
	 * @see #getEvidenceType()
	 * @generated
	 */
	EAttribute getEvidenceType_Created();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.EvidenceType#getExpires <em>Expires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expires</em>'.
	 * @see org.cyclonedx.schema.bom.EvidenceType#getExpires()
	 * @see #getEvidenceType()
	 * @generated
	 */
	EAttribute getEvidenceType_Expires();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.EvidenceType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Author</em>'.
	 * @see org.cyclonedx.schema.bom.EvidenceType#getAuthor()
	 * @see #getEvidenceType()
	 * @generated
	 */
	EReference getEvidenceType_Author();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.EvidenceType#getReviewer <em>Reviewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reviewer</em>'.
	 * @see org.cyclonedx.schema.bom.EvidenceType#getReviewer()
	 * @see #getEvidenceType()
	 * @generated
	 */
	EReference getEvidenceType_Reviewer();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.EvidenceType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.EvidenceType#getAny()
	 * @see #getEvidenceType()
	 * @generated
	 */
	EAttribute getEvidenceType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.EvidenceType#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.EvidenceType#getBomRef()
	 * @see #getEvidenceType()
	 * @generated
	 */
	EAttribute getEvidenceType_BomRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.EvidenceType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.EvidenceType#getAnyAttribute()
	 * @see #getEvidenceType()
	 * @generated
	 */
	EAttribute getEvidenceType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.EvidenceType1 <em>Evidence Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evidence Type1</em>'.
	 * @see org.cyclonedx.schema.bom.EvidenceType1
	 * @generated
	 */
	EClass getEvidenceType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.EvidenceType1#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evidence</em>'.
	 * @see org.cyclonedx.schema.bom.EvidenceType1#getEvidence()
	 * @see #getEvidenceType1()
	 * @generated
	 */
	EReference getEvidenceType1_Evidence();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ExpressionType <em>Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Type</em>'.
	 * @see org.cyclonedx.schema.bom.ExpressionType
	 * @generated
	 */
	EClass getExpressionType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ExpressionType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.cyclonedx.schema.bom.ExpressionType#getValue()
	 * @see #getExpressionType()
	 * @generated
	 */
	EAttribute getExpressionType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ExpressionType#getAcknowledgement <em>Acknowledgement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acknowledgement</em>'.
	 * @see org.cyclonedx.schema.bom.ExpressionType#getAcknowledgement()
	 * @see #getExpressionType()
	 * @generated
	 */
	EAttribute getExpressionType_Acknowledgement();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ExpressionType#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.ExpressionType#getBomRef()
	 * @see #getExpressionType()
	 * @generated
	 */
	EAttribute getExpressionType_BomRef();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Reference</em>'.
	 * @see org.cyclonedx.schema.bom.ExternalReference
	 * @generated
	 */
	EClass getExternalReference();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ExternalReference#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.cyclonedx.schema.bom.ExternalReference#getUrl()
	 * @see #getExternalReference()
	 * @generated
	 */
	EAttribute getExternalReference_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ExternalReference#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.cyclonedx.schema.bom.ExternalReference#getComment()
	 * @see #getExternalReference()
	 * @generated
	 */
	EAttribute getExternalReference_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ExternalReference#getHashes <em>Hashes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hashes</em>'.
	 * @see org.cyclonedx.schema.bom.ExternalReference#getHashes()
	 * @see #getExternalReference()
	 * @generated
	 */
	EReference getExternalReference_Hashes();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ExternalReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.cyclonedx.schema.bom.ExternalReference#getType()
	 * @see #getExternalReference()
	 * @generated
	 */
	EAttribute getExternalReference_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ExternalReference#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.ExternalReference#getAnyAttribute()
	 * @see #getExternalReference()
	 * @generated
	 */
	EAttribute getExternalReference_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ExternalReferences <em>External References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External References</em>'.
	 * @see org.cyclonedx.schema.bom.ExternalReferences
	 * @generated
	 */
	EClass getExternalReferences();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ExternalReferences#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.ExternalReferences#getGroup()
	 * @see #getExternalReferences()
	 * @generated
	 */
	EAttribute getExternalReferences_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ExternalReferences#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.cyclonedx.schema.bom.ExternalReferences#getReference()
	 * @see #getExternalReferences()
	 * @generated
	 */
	EReference getExternalReferences_Reference();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.FairnessAssessmentsType <em>Fairness Assessments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fairness Assessments Type</em>'.
	 * @see org.cyclonedx.schema.bom.FairnessAssessmentsType
	 * @generated
	 */
	EClass getFairnessAssessmentsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.FairnessAssessmentsType#getFairnessAssessment <em>Fairness Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fairness Assessment</em>'.
	 * @see org.cyclonedx.schema.bom.FairnessAssessmentsType#getFairnessAssessment()
	 * @see #getFairnessAssessmentsType()
	 * @generated
	 */
	EReference getFairnessAssessmentsType_FairnessAssessment();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.FairnessAssessmentType <em>Fairness Assessment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fairness Assessment Type</em>'.
	 * @see org.cyclonedx.schema.bom.FairnessAssessmentType
	 * @generated
	 */
	EClass getFairnessAssessmentType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.FairnessAssessmentType#getGroupAtRisk <em>Group At Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group At Risk</em>'.
	 * @see org.cyclonedx.schema.bom.FairnessAssessmentType#getGroupAtRisk()
	 * @see #getFairnessAssessmentType()
	 * @generated
	 */
	EAttribute getFairnessAssessmentType_GroupAtRisk();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.FairnessAssessmentType#getBenefits <em>Benefits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Benefits</em>'.
	 * @see org.cyclonedx.schema.bom.FairnessAssessmentType#getBenefits()
	 * @see #getFairnessAssessmentType()
	 * @generated
	 */
	EAttribute getFairnessAssessmentType_Benefits();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.FairnessAssessmentType#getHarms <em>Harms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Harms</em>'.
	 * @see org.cyclonedx.schema.bom.FairnessAssessmentType#getHarms()
	 * @see #getFairnessAssessmentType()
	 * @generated
	 */
	EAttribute getFairnessAssessmentType_Harms();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.FairnessAssessmentType#getMitigationStrategy <em>Mitigation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mitigation Strategy</em>'.
	 * @see org.cyclonedx.schema.bom.FairnessAssessmentType#getMitigationStrategy()
	 * @see #getFairnessAssessmentType()
	 * @generated
	 */
	EAttribute getFairnessAssessmentType_MitigationStrategy();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.FormulationType <em>Formulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formulation Type</em>'.
	 * @see org.cyclonedx.schema.bom.FormulationType
	 * @generated
	 */
	EClass getFormulationType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.FormulationType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.FormulationType#getGroup()
	 * @see #getFormulationType()
	 * @generated
	 */
	EAttribute getFormulationType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.FormulationType#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formula</em>'.
	 * @see org.cyclonedx.schema.bom.FormulationType#getFormula()
	 * @see #getFormulationType()
	 * @generated
	 */
	EReference getFormulationType_Formula();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.FormulationType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.FormulationType#getAny()
	 * @see #getFormulationType()
	 * @generated
	 */
	EAttribute getFormulationType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.FormulationType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.FormulationType#getAnyAttribute()
	 * @see #getFormulationType()
	 * @generated
	 */
	EAttribute getFormulationType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.FormulaType <em>Formula Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula Type</em>'.
	 * @see org.cyclonedx.schema.bom.FormulaType
	 * @generated
	 */
	EClass getFormulaType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.FormulaType#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see org.cyclonedx.schema.bom.FormulaType#getComponents()
	 * @see #getFormulaType()
	 * @generated
	 */
	EReference getFormulaType_Components();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.FormulaType#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Services</em>'.
	 * @see org.cyclonedx.schema.bom.FormulaType#getServices()
	 * @see #getFormulaType()
	 * @generated
	 */
	EReference getFormulaType_Services();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.FormulaType#getWorkflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Workflows</em>'.
	 * @see org.cyclonedx.schema.bom.FormulaType#getWorkflows()
	 * @see #getFormulaType()
	 * @generated
	 */
	EReference getFormulaType_Workflows();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.FormulaType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.FormulaType#getProperties()
	 * @see #getFormulaType()
	 * @generated
	 */
	EReference getFormulaType_Properties();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.FormulaType#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.FormulaType#getBomRef()
	 * @see #getFormulaType()
	 * @generated
	 */
	EAttribute getFormulaType_BomRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.FormulaType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.FormulaType#getAnyAttribute()
	 * @see #getFormulaType()
	 * @generated
	 */
	EAttribute getFormulaType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.FramesType <em>Frames Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frames Type</em>'.
	 * @see org.cyclonedx.schema.bom.FramesType
	 * @generated
	 */
	EClass getFramesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.FramesType#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frame</em>'.
	 * @see org.cyclonedx.schema.bom.FramesType#getFrame()
	 * @see #getFramesType()
	 * @generated
	 */
	EReference getFramesType_Frame();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.FrameType <em>Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame Type</em>'.
	 * @see org.cyclonedx.schema.bom.FrameType
	 * @generated
	 */
	EClass getFrameType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.FrameType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see org.cyclonedx.schema.bom.FrameType#getPackage()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Package();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.FrameType#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module</em>'.
	 * @see org.cyclonedx.schema.bom.FrameType#getModule()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Module();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.FrameType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see org.cyclonedx.schema.bom.FrameType#getFunction()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Function();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.FrameType#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameters</em>'.
	 * @see org.cyclonedx.schema.bom.FrameType#getParameters()
	 * @see #getFrameType()
	 * @generated
	 */
	EReference getFrameType_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.FrameType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see org.cyclonedx.schema.bom.FrameType#getLine()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Line();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.FrameType#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.cyclonedx.schema.bom.FrameType#getColumn()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.FrameType#getFullFilename <em>Full Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Filename</em>'.
	 * @see org.cyclonedx.schema.bom.FrameType#getFullFilename()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_FullFilename();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.GraphicsCollectionType <em>Graphics Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphics Collection Type</em>'.
	 * @see org.cyclonedx.schema.bom.GraphicsCollectionType
	 * @generated
	 */
	EClass getGraphicsCollectionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.GraphicsCollectionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.GraphicsCollectionType#getDescription()
	 * @see #getGraphicsCollectionType()
	 * @generated
	 */
	EReference getGraphicsCollectionType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.GraphicsCollectionType#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection</em>'.
	 * @see org.cyclonedx.schema.bom.GraphicsCollectionType#getCollection()
	 * @see #getGraphicsCollectionType()
	 * @generated
	 */
	EReference getGraphicsCollectionType_Collection();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.GraphicsType <em>Graphics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphics Type</em>'.
	 * @see org.cyclonedx.schema.bom.GraphicsType
	 * @generated
	 */
	EClass getGraphicsType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.GraphicsType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.GraphicsType#getDescription()
	 * @see #getGraphicsType()
	 * @generated
	 */
	EAttribute getGraphicsType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.GraphicsType#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection</em>'.
	 * @see org.cyclonedx.schema.bom.GraphicsType#getCollection()
	 * @see #getGraphicsType()
	 * @generated
	 */
	EReference getGraphicsType_Collection();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.GraphicType <em>Graphic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphic Type</em>'.
	 * @see org.cyclonedx.schema.bom.GraphicType
	 * @generated
	 */
	EClass getGraphicType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.GraphicType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.GraphicType#getName()
	 * @see #getGraphicType()
	 * @generated
	 */
	EAttribute getGraphicType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.GraphicType#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see org.cyclonedx.schema.bom.GraphicType#getImage()
	 * @see #getGraphicType()
	 * @generated
	 */
	EReference getGraphicType_Image();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.GraphicType1 <em>Graphic Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphic Type1</em>'.
	 * @see org.cyclonedx.schema.bom.GraphicType1
	 * @generated
	 */
	EClass getGraphicType1();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.GraphicType1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.GraphicType1#getName()
	 * @see #getGraphicType1()
	 * @generated
	 */
	EAttribute getGraphicType1_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.GraphicType1#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see org.cyclonedx.schema.bom.GraphicType1#getImage()
	 * @see #getGraphicType1()
	 * @generated
	 */
	EReference getGraphicType1_Image();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.HashesType <em>Hashes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hashes Type</em>'.
	 * @see org.cyclonedx.schema.bom.HashesType
	 * @generated
	 */
	EClass getHashesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.HashesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.HashesType#getGroup()
	 * @see #getHashesType()
	 * @generated
	 */
	EAttribute getHashesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.HashesType#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hash</em>'.
	 * @see org.cyclonedx.schema.bom.HashesType#getHash()
	 * @see #getHashesType()
	 * @generated
	 */
	EReference getHashesType_Hash();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.HashesType1 <em>Hashes Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hashes Type1</em>'.
	 * @see org.cyclonedx.schema.bom.HashesType1
	 * @generated
	 */
	EClass getHashesType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.HashesType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.HashesType1#getGroup()
	 * @see #getHashesType1()
	 * @generated
	 */
	EAttribute getHashesType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.HashesType1#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hash</em>'.
	 * @see org.cyclonedx.schema.bom.HashesType1#getHash()
	 * @see #getHashesType1()
	 * @generated
	 */
	EReference getHashesType1_Hash();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.HashesType2 <em>Hashes Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hashes Type2</em>'.
	 * @see org.cyclonedx.schema.bom.HashesType2
	 * @generated
	 */
	EClass getHashesType2();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.HashesType2#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.HashesType2#getGroup()
	 * @see #getHashesType2()
	 * @generated
	 */
	EAttribute getHashesType2_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.HashesType2#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hash</em>'.
	 * @see org.cyclonedx.schema.bom.HashesType2#getHash()
	 * @see #getHashesType2()
	 * @generated
	 */
	EReference getHashesType2_Hash();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.HashType <em>Hash Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash Type</em>'.
	 * @see org.cyclonedx.schema.bom.HashType
	 * @generated
	 */
	EClass getHashType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.HashType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.cyclonedx.schema.bom.HashType#getValue()
	 * @see #getHashType()
	 * @generated
	 */
	EAttribute getHashType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.HashType#getAlg <em>Alg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alg</em>'.
	 * @see org.cyclonedx.schema.bom.HashType#getAlg()
	 * @see #getHashType()
	 * @generated
	 */
	EAttribute getHashType_Alg();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.IdentifiableActionType <em>Identifiable Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable Action Type</em>'.
	 * @see org.cyclonedx.schema.bom.IdentifiableActionType
	 * @generated
	 */
	EClass getIdentifiableActionType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.IdentifiableActionType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.cyclonedx.schema.bom.IdentifiableActionType#getTimestamp()
	 * @see #getIdentifiableActionType()
	 * @generated
	 */
	EAttribute getIdentifiableActionType_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.IdentifiableActionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.IdentifiableActionType#getName()
	 * @see #getIdentifiableActionType()
	 * @generated
	 */
	EAttribute getIdentifiableActionType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.IdentifiableActionType#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.cyclonedx.schema.bom.IdentifiableActionType#getEmail()
	 * @see #getIdentifiableActionType()
	 * @generated
	 */
	EAttribute getIdentifiableActionType_Email();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.IdentifiableActionType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.IdentifiableActionType#getAny()
	 * @see #getIdentifiableActionType()
	 * @generated
	 */
	EAttribute getIdentifiableActionType_Any();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.IdentifiersType <em>Identifiers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiers Type</em>'.
	 * @see org.cyclonedx.schema.bom.IdentifiersType
	 * @generated
	 */
	EClass getIdentifiersType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.IdentifiersType#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Identifier</em>'.
	 * @see org.cyclonedx.schema.bom.IdentifiersType#getIdentifier()
	 * @see #getIdentifiersType()
	 * @generated
	 */
	EAttribute getIdentifiersType_Identifier();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.IdentityType <em>Identity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity Type</em>'.
	 * @see org.cyclonedx.schema.bom.IdentityType
	 * @generated
	 */
	EClass getIdentityType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.IdentityType#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see org.cyclonedx.schema.bom.IdentityType#getField()
	 * @see #getIdentityType()
	 * @generated
	 */
	EAttribute getIdentityType_Field();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.IdentityType#getConfidence <em>Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidence</em>'.
	 * @see org.cyclonedx.schema.bom.IdentityType#getConfidence()
	 * @see #getIdentityType()
	 * @generated
	 */
	EAttribute getIdentityType_Confidence();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.IdentityType#getConcludedValue <em>Concluded Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concluded Value</em>'.
	 * @see org.cyclonedx.schema.bom.IdentityType#getConcludedValue()
	 * @see #getIdentityType()
	 * @generated
	 */
	EAttribute getIdentityType_ConcludedValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.IdentityType#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Methods</em>'.
	 * @see org.cyclonedx.schema.bom.IdentityType#getMethods()
	 * @see #getIdentityType()
	 * @generated
	 */
	EReference getIdentityType_Methods();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.IdentityType#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tools</em>'.
	 * @see org.cyclonedx.schema.bom.IdentityType#getTools()
	 * @see #getIdentityType()
	 * @generated
	 */
	EReference getIdentityType_Tools();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.Ikev2TransformTypesType <em>Ikev2 Transform Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ikev2 Transform Types Type</em>'.
	 * @see org.cyclonedx.schema.bom.Ikev2TransformTypesType
	 * @generated
	 */
	EClass getIkev2TransformTypesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.Ikev2TransformTypesType#getEncr <em>Encr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Encr</em>'.
	 * @see org.cyclonedx.schema.bom.Ikev2TransformTypesType#getEncr()
	 * @see #getIkev2TransformTypesType()
	 * @generated
	 */
	EAttribute getIkev2TransformTypesType_Encr();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.Ikev2TransformTypesType#getPrf <em>Prf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Prf</em>'.
	 * @see org.cyclonedx.schema.bom.Ikev2TransformTypesType#getPrf()
	 * @see #getIkev2TransformTypesType()
	 * @generated
	 */
	EAttribute getIkev2TransformTypesType_Prf();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.Ikev2TransformTypesType#getInteg <em>Integ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Integ</em>'.
	 * @see org.cyclonedx.schema.bom.Ikev2TransformTypesType#getInteg()
	 * @see #getIkev2TransformTypesType()
	 * @generated
	 */
	EAttribute getIkev2TransformTypesType_Integ();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.Ikev2TransformTypesType#getKe <em>Ke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ke</em>'.
	 * @see org.cyclonedx.schema.bom.Ikev2TransformTypesType#getKe()
	 * @see #getIkev2TransformTypesType()
	 * @generated
	 */
	EAttribute getIkev2TransformTypesType_Ke();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Ikev2TransformTypesType#isEsn <em>Esn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Esn</em>'.
	 * @see org.cyclonedx.schema.bom.Ikev2TransformTypesType#isEsn()
	 * @see #getIkev2TransformTypesType()
	 * @generated
	 */
	EAttribute getIkev2TransformTypesType_Esn();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.Ikev2TransformTypesType#getAuth <em>Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Auth</em>'.
	 * @see org.cyclonedx.schema.bom.Ikev2TransformTypesType#getAuth()
	 * @see #getIkev2TransformTypesType()
	 * @generated
	 */
	EAttribute getIkev2TransformTypesType_Auth();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.IndividualsType <em>Individuals Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individuals Type</em>'.
	 * @see org.cyclonedx.schema.bom.IndividualsType
	 * @generated
	 */
	EClass getIndividualsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.IndividualsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.IndividualsType#getGroup()
	 * @see #getIndividualsType()
	 * @generated
	 */
	EAttribute getIndividualsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.IndividualsType#getIndividual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Individual</em>'.
	 * @see org.cyclonedx.schema.bom.IndividualsType#getIndividual()
	 * @see #getIndividualsType()
	 * @generated
	 */
	EReference getIndividualsType_Individual();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.InputsType <em>Inputs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inputs Type</em>'.
	 * @see org.cyclonedx.schema.bom.InputsType
	 * @generated
	 */
	EClass getInputsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.InputsType#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see org.cyclonedx.schema.bom.InputsType#getInput()
	 * @see #getInputsType()
	 * @generated
	 */
	EReference getInputsType_Input();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.InputsType1 <em>Inputs Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inputs Type1</em>'.
	 * @see org.cyclonedx.schema.bom.InputsType1
	 * @generated
	 */
	EClass getInputsType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.InputsType1#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see org.cyclonedx.schema.bom.InputsType1#getInput()
	 * @see #getInputsType1()
	 * @generated
	 */
	EReference getInputsType1_Input();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.InputsType2 <em>Inputs Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inputs Type2</em>'.
	 * @see org.cyclonedx.schema.bom.InputsType2
	 * @generated
	 */
	EClass getInputsType2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.InputsType2#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see org.cyclonedx.schema.bom.InputsType2#getInput()
	 * @see #getInputsType2()
	 * @generated
	 */
	EReference getInputsType2_Input();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.InputsType3 <em>Inputs Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inputs Type3</em>'.
	 * @see org.cyclonedx.schema.bom.InputsType3
	 * @generated
	 */
	EClass getInputsType3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.InputsType3#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see org.cyclonedx.schema.bom.InputsType3#getInput()
	 * @see #getInputsType3()
	 * @generated
	 */
	EReference getInputsType3_Input();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.InputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Type</em>'.
	 * @see org.cyclonedx.schema.bom.InputType
	 * @generated
	 */
	EClass getInputType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.InputType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see org.cyclonedx.schema.bom.InputType#getResource()
	 * @see #getInputType()
	 * @generated
	 */
	EReference getInputType_Resource();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.InputType#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameters</em>'.
	 * @see org.cyclonedx.schema.bom.InputType#getParameters()
	 * @see #getInputType()
	 * @generated
	 */
	EReference getInputType_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.InputType#getEnvironmentVars <em>Environment Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment Vars</em>'.
	 * @see org.cyclonedx.schema.bom.InputType#getEnvironmentVars()
	 * @see #getInputType()
	 * @generated
	 */
	EReference getInputType_EnvironmentVars();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.InputType#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.cyclonedx.schema.bom.InputType#getData()
	 * @see #getInputType()
	 * @generated
	 */
	EReference getInputType_Data();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.InputType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.cyclonedx.schema.bom.InputType#getSource()
	 * @see #getInputType()
	 * @generated
	 */
	EReference getInputType_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.InputType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.cyclonedx.schema.bom.InputType#getTarget()
	 * @see #getInputType()
	 * @generated
	 */
	EReference getInputType_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.InputType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.InputType#getProperties()
	 * @see #getInputType()
	 * @generated
	 */
	EReference getInputType_Properties();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.InputType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.InputType#getAny()
	 * @see #getInputType()
	 * @generated
	 */
	EAttribute getInputType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.InputType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.InputType#getAnyAttribute()
	 * @see #getInputType()
	 * @generated
	 */
	EAttribute getInputType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.InputType1 <em>Input Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Type1</em>'.
	 * @see org.cyclonedx.schema.bom.InputType1
	 * @generated
	 */
	EClass getInputType1();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.InputType1#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.cyclonedx.schema.bom.InputType1#getFormat()
	 * @see #getInputType1()
	 * @generated
	 */
	EAttribute getInputType1_Format();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.IssueType <em>Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Type</em>'.
	 * @see org.cyclonedx.schema.bom.IssueType
	 * @generated
	 */
	EClass getIssueType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.IssueType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.cyclonedx.schema.bom.IssueType#getId()
	 * @see #getIssueType()
	 * @generated
	 */
	EAttribute getIssueType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.IssueType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.IssueType#getName()
	 * @see #getIssueType()
	 * @generated
	 */
	EAttribute getIssueType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.IssueType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.IssueType#getDescription()
	 * @see #getIssueType()
	 * @generated
	 */
	EAttribute getIssueType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.IssueType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.cyclonedx.schema.bom.IssueType#getSource()
	 * @see #getIssueType()
	 * @generated
	 */
	EReference getIssueType_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.IssueType#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>References</em>'.
	 * @see org.cyclonedx.schema.bom.IssueType#getReferences()
	 * @see #getIssueType()
	 * @generated
	 */
	EReference getIssueType_References();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.IssueType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.IssueType#getAny()
	 * @see #getIssueType()
	 * @generated
	 */
	EAttribute getIssueType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.IssueType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.cyclonedx.schema.bom.IssueType#getType()
	 * @see #getIssueType()
	 * @generated
	 */
	EAttribute getIssueType_Type();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.LevelsType <em>Levels Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Levels Type</em>'.
	 * @see org.cyclonedx.schema.bom.LevelsType
	 * @generated
	 */
	EClass getLevelsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.LevelsType#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level</em>'.
	 * @see org.cyclonedx.schema.bom.LevelsType#getLevel()
	 * @see #getLevelsType()
	 * @generated
	 */
	EReference getLevelsType_Level();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.LevelType <em>Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level Type</em>'.
	 * @see org.cyclonedx.schema.bom.LevelType
	 * @generated
	 */
	EClass getLevelType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.LevelType#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.cyclonedx.schema.bom.LevelType#getIdentifier()
	 * @see #getLevelType()
	 * @generated
	 */
	EAttribute getLevelType_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.LevelType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.cyclonedx.schema.bom.LevelType#getTitle()
	 * @see #getLevelType()
	 * @generated
	 */
	EAttribute getLevelType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.LevelType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.LevelType#getDescription()
	 * @see #getLevelType()
	 * @generated
	 */
	EAttribute getLevelType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.LevelType#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirements</em>'.
	 * @see org.cyclonedx.schema.bom.LevelType#getRequirements()
	 * @see #getLevelType()
	 * @generated
	 */
	EReference getLevelType_Requirements();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.LevelType#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.LevelType#getBomRef()
	 * @see #getLevelType()
	 * @generated
	 */
	EAttribute getLevelType_BomRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.LevelType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.LevelType#getAnyAttribute()
	 * @see #getLevelType()
	 * @generated
	 */
	EAttribute getLevelType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.LicenseChoiceType <em>License Choice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License Choice Type</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseChoiceType
	 * @generated
	 */
	EClass getLicenseChoiceType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.LicenseChoiceType#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>License</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseChoiceType#getLicense()
	 * @see #getLicenseChoiceType()
	 * @generated
	 */
	EReference getLicenseChoiceType_License();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.LicenseChoiceType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseChoiceType#getExpression()
	 * @see #getLicenseChoiceType()
	 * @generated
	 */
	EReference getLicenseChoiceType_Expression();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.LicenseeType <em>Licensee Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Licensee Type</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseeType
	 * @generated
	 */
	EClass getLicenseeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.LicenseeType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseeType#getOrganization()
	 * @see #getLicenseeType()
	 * @generated
	 */
	EReference getLicenseeType_Organization();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.LicenseeType#getIndividual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Individual</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseeType#getIndividual()
	 * @see #getLicenseeType()
	 * @generated
	 */
	EReference getLicenseeType_Individual();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.LicenseType <em>License Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License Type</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseType
	 * @generated
	 */
	EClass getLicenseType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.LicenseType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseType#getId()
	 * @see #getLicenseType()
	 * @generated
	 */
	EAttribute getLicenseType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.LicenseType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseType#getName()
	 * @see #getLicenseType()
	 * @generated
	 */
	EAttribute getLicenseType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.LicenseType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseType#getText()
	 * @see #getLicenseType()
	 * @generated
	 */
	EReference getLicenseType_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.LicenseType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseType#getUrl()
	 * @see #getLicenseType()
	 * @generated
	 */
	EAttribute getLicenseType_Url();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.LicenseType#getLicensing <em>Licensing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Licensing</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseType#getLicensing()
	 * @see #getLicenseType()
	 * @generated
	 */
	EReference getLicenseType_Licensing();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.LicenseType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseType#getProperties()
	 * @see #getLicenseType()
	 * @generated
	 */
	EReference getLicenseType_Properties();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.LicenseType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseType#getAny()
	 * @see #getLicenseType()
	 * @generated
	 */
	EAttribute getLicenseType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.LicenseType#getAcknowledgement <em>Acknowledgement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acknowledgement</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseType#getAcknowledgement()
	 * @see #getLicenseType()
	 * @generated
	 */
	EAttribute getLicenseType_Acknowledgement();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.LicenseType#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseType#getBomRef()
	 * @see #getLicenseType()
	 * @generated
	 */
	EAttribute getLicenseType_BomRef();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.LicenseTypesType <em>License Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License Types Type</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseTypesType
	 * @generated
	 */
	EClass getLicenseTypesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.LicenseTypesType#getLicenseType <em>License Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>License Type</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseTypesType#getLicenseType()
	 * @see #getLicenseTypesType()
	 * @generated
	 */
	EAttribute getLicenseTypesType_LicenseType();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.LicensingType <em>Licensing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Licensing Type</em>'.
	 * @see org.cyclonedx.schema.bom.LicensingType
	 * @generated
	 */
	EClass getLicensingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.LicensingType#getAltIds <em>Alt Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alt Ids</em>'.
	 * @see org.cyclonedx.schema.bom.LicensingType#getAltIds()
	 * @see #getLicensingType()
	 * @generated
	 */
	EReference getLicensingType_AltIds();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.LicensingType#getLicensor <em>Licensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Licensor</em>'.
	 * @see org.cyclonedx.schema.bom.LicensingType#getLicensor()
	 * @see #getLicensingType()
	 * @generated
	 */
	EReference getLicensingType_Licensor();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.LicensingType#getLicensee <em>Licensee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Licensee</em>'.
	 * @see org.cyclonedx.schema.bom.LicensingType#getLicensee()
	 * @see #getLicensingType()
	 * @generated
	 */
	EReference getLicensingType_Licensee();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.LicensingType#getPurchaser <em>Purchaser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Purchaser</em>'.
	 * @see org.cyclonedx.schema.bom.LicensingType#getPurchaser()
	 * @see #getLicensingType()
	 * @generated
	 */
	EReference getLicensingType_Purchaser();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.LicensingType#getPurchaseOrder <em>Purchase Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase Order</em>'.
	 * @see org.cyclonedx.schema.bom.LicensingType#getPurchaseOrder()
	 * @see #getLicensingType()
	 * @generated
	 */
	EAttribute getLicensingType_PurchaseOrder();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.LicensingType#getLicenseTypes <em>License Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>License Types</em>'.
	 * @see org.cyclonedx.schema.bom.LicensingType#getLicenseTypes()
	 * @see #getLicensingType()
	 * @generated
	 */
	EReference getLicensingType_LicenseTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.LicensingType#getLastRenewal <em>Last Renewal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Renewal</em>'.
	 * @see org.cyclonedx.schema.bom.LicensingType#getLastRenewal()
	 * @see #getLicensingType()
	 * @generated
	 */
	EAttribute getLicensingType_LastRenewal();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.LicensingType#getExpiration <em>Expiration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration</em>'.
	 * @see org.cyclonedx.schema.bom.LicensingType#getExpiration()
	 * @see #getLicensingType()
	 * @generated
	 */
	EAttribute getLicensingType_Expiration();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.LicensingType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.LicensingType#getAny()
	 * @see #getLicensingType()
	 * @generated
	 */
	EAttribute getLicensingType_Any();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.LicensorType <em>Licensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Licensor Type</em>'.
	 * @see org.cyclonedx.schema.bom.LicensorType
	 * @generated
	 */
	EClass getLicensorType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.LicensorType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see org.cyclonedx.schema.bom.LicensorType#getOrganization()
	 * @see #getLicensorType()
	 * @generated
	 */
	EReference getLicensorType_Organization();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.LicensorType#getIndividual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Individual</em>'.
	 * @see org.cyclonedx.schema.bom.LicensorType#getIndividual()
	 * @see #getLicensorType()
	 * @generated
	 */
	EReference getLicensorType_Individual();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.LifecyclesType <em>Lifecycles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifecycles Type</em>'.
	 * @see org.cyclonedx.schema.bom.LifecyclesType
	 * @generated
	 */
	EClass getLifecyclesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.LifecyclesType#getLifecycle <em>Lifecycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lifecycle</em>'.
	 * @see org.cyclonedx.schema.bom.LifecyclesType#getLifecycle()
	 * @see #getLifecyclesType()
	 * @generated
	 */
	EReference getLifecyclesType_Lifecycle();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.LifecycleType <em>Lifecycle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifecycle Type</em>'.
	 * @see org.cyclonedx.schema.bom.LifecycleType
	 * @generated
	 */
	EClass getLifecycleType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.LifecycleType#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see org.cyclonedx.schema.bom.LifecycleType#getPhase()
	 * @see #getLifecycleType()
	 * @generated
	 */
	EAttribute getLifecycleType_Phase();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.LifecycleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.LifecycleType#getName()
	 * @see #getLifecycleType()
	 * @generated
	 */
	EAttribute getLifecycleType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.LifecycleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.LifecycleType#getDescription()
	 * @see #getLifecycleType()
	 * @generated
	 */
	EAttribute getLifecycleType_Description();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.MapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Type</em>'.
	 * @see org.cyclonedx.schema.bom.MapType
	 * @generated
	 */
	EClass getMapType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.MapType#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirement</em>'.
	 * @see org.cyclonedx.schema.bom.MapType#getRequirement()
	 * @see #getMapType()
	 * @generated
	 */
	EAttribute getMapType_Requirement();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.MapType#getClaims <em>Claims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Claims</em>'.
	 * @see org.cyclonedx.schema.bom.MapType#getClaims()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_Claims();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.MapType#getCounterClaims <em>Counter Claims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Counter Claims</em>'.
	 * @see org.cyclonedx.schema.bom.MapType#getCounterClaims()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_CounterClaims();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.MapType#getConformance <em>Conformance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conformance</em>'.
	 * @see org.cyclonedx.schema.bom.MapType#getConformance()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_Conformance();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.MapType#getConfidence <em>Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confidence</em>'.
	 * @see org.cyclonedx.schema.bom.MapType#getConfidence()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_Confidence();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see org.cyclonedx.schema.bom.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Metadata#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.cyclonedx.schema.bom.Metadata#getTimestamp()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Timestamp();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Metadata#getLifecycles <em>Lifecycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lifecycles</em>'.
	 * @see org.cyclonedx.schema.bom.Metadata#getLifecycles()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Lifecycles();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Metadata#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tools</em>'.
	 * @see org.cyclonedx.schema.bom.Metadata#getTools()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Tools();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Metadata#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authors</em>'.
	 * @see org.cyclonedx.schema.bom.Metadata#getAuthors()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Authors();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Metadata#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component</em>'.
	 * @see org.cyclonedx.schema.bom.Metadata#getComponent()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Component();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Metadata#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manufacturer</em>'.
	 * @see org.cyclonedx.schema.bom.Metadata#getManufacturer()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Manufacturer();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Metadata#getManufacture <em>Manufacture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manufacture</em>'.
	 * @see org.cyclonedx.schema.bom.Metadata#getManufacture()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Manufacture();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Metadata#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supplier</em>'.
	 * @see org.cyclonedx.schema.bom.Metadata#getSupplier()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Supplier();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Metadata#getLicenses <em>Licenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Licenses</em>'.
	 * @see org.cyclonedx.schema.bom.Metadata#getLicenses()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Licenses();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Metadata#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.Metadata#getProperties()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Properties();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.Metadata#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.Metadata#getAny()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.Metadata#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.Metadata#getAnyAttribute()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.MethodsType <em>Methods Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Methods Type</em>'.
	 * @see org.cyclonedx.schema.bom.MethodsType
	 * @generated
	 */
	EClass getMethodsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.MethodsType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see org.cyclonedx.schema.bom.MethodsType#getMethod()
	 * @see #getMethodsType()
	 * @generated
	 */
	EReference getMethodsType_Method();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.MethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Type</em>'.
	 * @see org.cyclonedx.schema.bom.MethodType
	 * @generated
	 */
	EClass getMethodType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.MethodType#getTechnique <em>Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technique</em>'.
	 * @see org.cyclonedx.schema.bom.MethodType#getTechnique()
	 * @see #getMethodType()
	 * @generated
	 */
	EAttribute getMethodType_Technique();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.MethodType#getConfidence <em>Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidence</em>'.
	 * @see org.cyclonedx.schema.bom.MethodType#getConfidence()
	 * @see #getMethodType()
	 * @generated
	 */
	EAttribute getMethodType_Confidence();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.MethodType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.cyclonedx.schema.bom.MethodType#getValue()
	 * @see #getMethodType()
	 * @generated
	 */
	EAttribute getMethodType_Value();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.MitigationStrategiesType <em>Mitigation Strategies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mitigation Strategies Type</em>'.
	 * @see org.cyclonedx.schema.bom.MitigationStrategiesType
	 * @generated
	 */
	EClass getMitigationStrategiesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.MitigationStrategiesType#getMitigationStrategy <em>Mitigation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mitigation Strategy</em>'.
	 * @see org.cyclonedx.schema.bom.MitigationStrategiesType#getMitigationStrategy()
	 * @see #getMitigationStrategiesType()
	 * @generated
	 */
	EAttribute getMitigationStrategiesType_MitigationStrategy();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.MitigationStrategiesType1 <em>Mitigation Strategies Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mitigation Strategies Type1</em>'.
	 * @see org.cyclonedx.schema.bom.MitigationStrategiesType1
	 * @generated
	 */
	EClass getMitigationStrategiesType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.MitigationStrategiesType1#getMitigationStrategy <em>Mitigation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mitigation Strategy</em>'.
	 * @see org.cyclonedx.schema.bom.MitigationStrategiesType1#getMitigationStrategy()
	 * @see #getMitigationStrategiesType1()
	 * @generated
	 */
	EAttribute getMitigationStrategiesType1_MitigationStrategy();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ModelCardType <em>Model Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Card Type</em>'.
	 * @see org.cyclonedx.schema.bom.ModelCardType
	 * @generated
	 */
	EClass getModelCardType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ModelCardType#getModelParameters <em>Model Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Parameters</em>'.
	 * @see org.cyclonedx.schema.bom.ModelCardType#getModelParameters()
	 * @see #getModelCardType()
	 * @generated
	 */
	EReference getModelCardType_ModelParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ModelCardType#getQuantitativeAnalysis <em>Quantitative Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quantitative Analysis</em>'.
	 * @see org.cyclonedx.schema.bom.ModelCardType#getQuantitativeAnalysis()
	 * @see #getModelCardType()
	 * @generated
	 */
	EReference getModelCardType_QuantitativeAnalysis();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ModelCardType#getConsiderations <em>Considerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Considerations</em>'.
	 * @see org.cyclonedx.schema.bom.ModelCardType#getConsiderations()
	 * @see #getModelCardType()
	 * @generated
	 */
	EReference getModelCardType_Considerations();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ModelCardType#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.ModelCardType#getBomRef()
	 * @see #getModelCardType()
	 * @generated
	 */
	EAttribute getModelCardType_BomRef();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ModelParametersType <em>Model Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Parameters Type</em>'.
	 * @see org.cyclonedx.schema.bom.ModelParametersType
	 * @generated
	 */
	EClass getModelParametersType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ModelParametersType#getApproach <em>Approach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Approach</em>'.
	 * @see org.cyclonedx.schema.bom.ModelParametersType#getApproach()
	 * @see #getModelParametersType()
	 * @generated
	 */
	EReference getModelParametersType_Approach();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ModelParametersType#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task</em>'.
	 * @see org.cyclonedx.schema.bom.ModelParametersType#getTask()
	 * @see #getModelParametersType()
	 * @generated
	 */
	EAttribute getModelParametersType_Task();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ModelParametersType#getArchitectureFamily <em>Architecture Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture Family</em>'.
	 * @see org.cyclonedx.schema.bom.ModelParametersType#getArchitectureFamily()
	 * @see #getModelParametersType()
	 * @generated
	 */
	EAttribute getModelParametersType_ArchitectureFamily();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ModelParametersType#getModelArchitecture <em>Model Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Architecture</em>'.
	 * @see org.cyclonedx.schema.bom.ModelParametersType#getModelArchitecture()
	 * @see #getModelParametersType()
	 * @generated
	 */
	EAttribute getModelParametersType_ModelArchitecture();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ModelParametersType#getDatasets <em>Datasets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datasets</em>'.
	 * @see org.cyclonedx.schema.bom.ModelParametersType#getDatasets()
	 * @see #getModelParametersType()
	 * @generated
	 */
	EReference getModelParametersType_Datasets();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ModelParametersType#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputs</em>'.
	 * @see org.cyclonedx.schema.bom.ModelParametersType#getInputs()
	 * @see #getModelParametersType()
	 * @generated
	 */
	EReference getModelParametersType_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ModelParametersType#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outputs</em>'.
	 * @see org.cyclonedx.schema.bom.ModelParametersType#getOutputs()
	 * @see #getModelParametersType()
	 * @generated
	 */
	EReference getModelParametersType_Outputs();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.NotesType <em>Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notes Type</em>'.
	 * @see org.cyclonedx.schema.bom.NotesType
	 * @generated
	 */
	EClass getNotesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.NotesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.NotesType#getGroup()
	 * @see #getNotesType()
	 * @generated
	 */
	EAttribute getNotesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.NotesType#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Note</em>'.
	 * @see org.cyclonedx.schema.bom.NotesType#getNote()
	 * @see #getNotesType()
	 * @generated
	 */
	EReference getNotesType_Note();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.NoteType <em>Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note Type</em>'.
	 * @see org.cyclonedx.schema.bom.NoteType
	 * @generated
	 */
	EClass getNoteType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.NoteType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.NoteType#getGroup()
	 * @see #getNoteType()
	 * @generated
	 */
	EAttribute getNoteType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.NoteType#getLocale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Locale</em>'.
	 * @see org.cyclonedx.schema.bom.NoteType#getLocale()
	 * @see #getNoteType()
	 * @generated
	 */
	EAttribute getNoteType_Locale();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.NoteType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see org.cyclonedx.schema.bom.NoteType#getText()
	 * @see #getNoteType()
	 * @generated
	 */
	EReference getNoteType_Text();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.OccurrencesType <em>Occurrences Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occurrences Type</em>'.
	 * @see org.cyclonedx.schema.bom.OccurrencesType
	 * @generated
	 */
	EClass getOccurrencesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.OccurrencesType#getOccurrence <em>Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Occurrence</em>'.
	 * @see org.cyclonedx.schema.bom.OccurrencesType#getOccurrence()
	 * @see #getOccurrencesType()
	 * @generated
	 */
	EReference getOccurrencesType_Occurrence();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.OccurrenceType <em>Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occurrence Type</em>'.
	 * @see org.cyclonedx.schema.bom.OccurrenceType
	 * @generated
	 */
	EClass getOccurrenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.OccurrenceType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.cyclonedx.schema.bom.OccurrenceType#getLocation()
	 * @see #getOccurrenceType()
	 * @generated
	 */
	EAttribute getOccurrenceType_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.OccurrenceType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see org.cyclonedx.schema.bom.OccurrenceType#getLine()
	 * @see #getOccurrenceType()
	 * @generated
	 */
	EAttribute getOccurrenceType_Line();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.OccurrenceType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.cyclonedx.schema.bom.OccurrenceType#getOffset()
	 * @see #getOccurrenceType()
	 * @generated
	 */
	EAttribute getOccurrenceType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.OccurrenceType#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see org.cyclonedx.schema.bom.OccurrenceType#getSymbol()
	 * @see #getOccurrenceType()
	 * @generated
	 */
	EAttribute getOccurrenceType_Symbol();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.OccurrenceType#getAdditionalContext <em>Additional Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Context</em>'.
	 * @see org.cyclonedx.schema.bom.OccurrenceType#getAdditionalContext()
	 * @see #getOccurrenceType()
	 * @generated
	 */
	EAttribute getOccurrenceType_AdditionalContext();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.OccurrenceType#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.OccurrenceType#getBomRef()
	 * @see #getOccurrenceType()
	 * @generated
	 */
	EAttribute getOccurrenceType_BomRef();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.OrganizationalContact <em>Organizational Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organizational Contact</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationalContact
	 * @generated
	 */
	EClass getOrganizationalContact();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.OrganizationalContact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationalContact#getName()
	 * @see #getOrganizationalContact()
	 * @generated
	 */
	EAttribute getOrganizationalContact_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.OrganizationalContact#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationalContact#getEmail()
	 * @see #getOrganizationalContact()
	 * @generated
	 */
	EAttribute getOrganizationalContact_Email();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.OrganizationalContact#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationalContact#getPhone()
	 * @see #getOrganizationalContact()
	 * @generated
	 */
	EAttribute getOrganizationalContact_Phone();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.OrganizationalContact#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationalContact#getAny()
	 * @see #getOrganizationalContact()
	 * @generated
	 */
	EAttribute getOrganizationalContact_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.OrganizationalContact#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationalContact#getBomRef()
	 * @see #getOrganizationalContact()
	 * @generated
	 */
	EAttribute getOrganizationalContact_BomRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.OrganizationalContact#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationalContact#getAnyAttribute()
	 * @see #getOrganizationalContact()
	 * @generated
	 */
	EAttribute getOrganizationalContact_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.OrganizationalEntity <em>Organizational Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organizational Entity</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationalEntity
	 * @generated
	 */
	EClass getOrganizationalEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.OrganizationalEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationalEntity#getName()
	 * @see #getOrganizationalEntity()
	 * @generated
	 */
	EAttribute getOrganizationalEntity_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.OrganizationalEntity#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationalEntity#getAddress()
	 * @see #getOrganizationalEntity()
	 * @generated
	 */
	EReference getOrganizationalEntity_Address();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.OrganizationalEntity#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Url</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationalEntity#getUrl()
	 * @see #getOrganizationalEntity()
	 * @generated
	 */
	EAttribute getOrganizationalEntity_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.OrganizationalEntity#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contact</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationalEntity#getContact()
	 * @see #getOrganizationalEntity()
	 * @generated
	 */
	EReference getOrganizationalEntity_Contact();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.OrganizationalEntity#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationalEntity#getAny()
	 * @see #getOrganizationalEntity()
	 * @generated
	 */
	EAttribute getOrganizationalEntity_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.OrganizationalEntity#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationalEntity#getBomRef()
	 * @see #getOrganizationalEntity()
	 * @generated
	 */
	EAttribute getOrganizationalEntity_BomRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.OrganizationalEntity#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationalEntity#getAnyAttribute()
	 * @see #getOrganizationalEntity()
	 * @generated
	 */
	EAttribute getOrganizationalEntity_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.OrganizationOrIndividualType <em>Organization Or Individual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Or Individual Type</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationOrIndividualType
	 * @generated
	 */
	EClass getOrganizationOrIndividualType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.OrganizationOrIndividualType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationOrIndividualType#getOrganization()
	 * @see #getOrganizationOrIndividualType()
	 * @generated
	 */
	EReference getOrganizationOrIndividualType_Organization();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.OrganizationOrIndividualType#getIndividual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Individual</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationOrIndividualType#getIndividual()
	 * @see #getOrganizationOrIndividualType()
	 * @generated
	 */
	EReference getOrganizationOrIndividualType_Individual();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.OrganizationsType <em>Organizations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organizations Type</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationsType
	 * @generated
	 */
	EClass getOrganizationsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.OrganizationsType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organization</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationsType#getOrganization()
	 * @see #getOrganizationsType()
	 * @generated
	 */
	EReference getOrganizationsType_Organization();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.OrganizationsType1 <em>Organizations Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organizations Type1</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationsType1
	 * @generated
	 */
	EClass getOrganizationsType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.OrganizationsType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationsType1#getGroup()
	 * @see #getOrganizationsType1()
	 * @generated
	 */
	EAttribute getOrganizationsType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.OrganizationsType1#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organization</em>'.
	 * @see org.cyclonedx.schema.bom.OrganizationsType1#getOrganization()
	 * @see #getOrganizationsType1()
	 * @generated
	 */
	EReference getOrganizationsType1_Organization();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.OutputsType <em>Outputs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outputs Type</em>'.
	 * @see org.cyclonedx.schema.bom.OutputsType
	 * @generated
	 */
	EClass getOutputsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.OutputsType#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see org.cyclonedx.schema.bom.OutputsType#getOutput()
	 * @see #getOutputsType()
	 * @generated
	 */
	EReference getOutputsType_Output();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.OutputsType1 <em>Outputs Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outputs Type1</em>'.
	 * @see org.cyclonedx.schema.bom.OutputsType1
	 * @generated
	 */
	EClass getOutputsType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.OutputsType1#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see org.cyclonedx.schema.bom.OutputsType1#getOutput()
	 * @see #getOutputsType1()
	 * @generated
	 */
	EReference getOutputsType1_Output();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.OutputsType2 <em>Outputs Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outputs Type2</em>'.
	 * @see org.cyclonedx.schema.bom.OutputsType2
	 * @generated
	 */
	EClass getOutputsType2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.OutputsType2#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see org.cyclonedx.schema.bom.OutputsType2#getOutput()
	 * @see #getOutputsType2()
	 * @generated
	 */
	EReference getOutputsType2_Output();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.OutputsType3 <em>Outputs Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outputs Type3</em>'.
	 * @see org.cyclonedx.schema.bom.OutputsType3
	 * @generated
	 */
	EClass getOutputsType3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.OutputsType3#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see org.cyclonedx.schema.bom.OutputsType3#getOutput()
	 * @see #getOutputsType3()
	 * @generated
	 */
	EReference getOutputsType3_Output();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.OutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Type</em>'.
	 * @see org.cyclonedx.schema.bom.OutputType
	 * @generated
	 */
	EClass getOutputType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.OutputType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see org.cyclonedx.schema.bom.OutputType#getResource()
	 * @see #getOutputType()
	 * @generated
	 */
	EReference getOutputType_Resource();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.OutputType#getEnvironmentVars <em>Environment Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment Vars</em>'.
	 * @see org.cyclonedx.schema.bom.OutputType#getEnvironmentVars()
	 * @see #getOutputType()
	 * @generated
	 */
	EReference getOutputType_EnvironmentVars();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.OutputType#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.cyclonedx.schema.bom.OutputType#getData()
	 * @see #getOutputType()
	 * @generated
	 */
	EReference getOutputType_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.OutputType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.cyclonedx.schema.bom.OutputType#getType()
	 * @see #getOutputType()
	 * @generated
	 */
	EAttribute getOutputType_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.OutputType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.cyclonedx.schema.bom.OutputType#getSource()
	 * @see #getOutputType()
	 * @generated
	 */
	EReference getOutputType_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.OutputType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.cyclonedx.schema.bom.OutputType#getTarget()
	 * @see #getOutputType()
	 * @generated
	 */
	EReference getOutputType_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.OutputType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.OutputType#getProperties()
	 * @see #getOutputType()
	 * @generated
	 */
	EReference getOutputType_Properties();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.OutputType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.OutputType#getAny()
	 * @see #getOutputType()
	 * @generated
	 */
	EAttribute getOutputType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.OutputType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.OutputType#getAnyAttribute()
	 * @see #getOutputType()
	 * @generated
	 */
	EAttribute getOutputType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.OutputType1 <em>Output Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Type1</em>'.
	 * @see org.cyclonedx.schema.bom.OutputType1
	 * @generated
	 */
	EClass getOutputType1();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.OutputType1#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.cyclonedx.schema.bom.OutputType1#getFormat()
	 * @see #getOutputType1()
	 * @generated
	 */
	EAttribute getOutputType1_Format();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.OwnersType <em>Owners Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Owners Type</em>'.
	 * @see org.cyclonedx.schema.bom.OwnersType
	 * @generated
	 */
	EClass getOwnersType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.OwnersType#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owner</em>'.
	 * @see org.cyclonedx.schema.bom.OwnersType#getOwner()
	 * @see #getOwnersType()
	 * @generated
	 */
	EReference getOwnersType_Owner();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ParametersType <em>Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters Type</em>'.
	 * @see org.cyclonedx.schema.bom.ParametersType
	 * @generated
	 */
	EClass getParametersType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ParametersType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see org.cyclonedx.schema.bom.ParametersType#getParameter()
	 * @see #getParametersType()
	 * @generated
	 */
	EReference getParametersType_Parameter();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ParametersType1 <em>Parameters Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters Type1</em>'.
	 * @see org.cyclonedx.schema.bom.ParametersType1
	 * @generated
	 */
	EClass getParametersType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ParametersType1#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameter</em>'.
	 * @see org.cyclonedx.schema.bom.ParametersType1#getParameter()
	 * @see #getParametersType1()
	 * @generated
	 */
	EAttribute getParametersType1_Parameter();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see org.cyclonedx.schema.bom.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ParameterType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.ParameterType#getName()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ParameterType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.cyclonedx.schema.bom.ParameterType#getValue()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ParameterType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.cyclonedx.schema.bom.ParameterType#getDataType()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_DataType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ParameterType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.ParameterType#getAny()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ParameterType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.ParameterType#getAnyAttribute()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.PatchesType <em>Patches Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patches Type</em>'.
	 * @see org.cyclonedx.schema.bom.PatchesType
	 * @generated
	 */
	EClass getPatchesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.PatchesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.PatchesType#getGroup()
	 * @see #getPatchesType()
	 * @generated
	 */
	EAttribute getPatchesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.PatchesType#getPatch <em>Patch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patch</em>'.
	 * @see org.cyclonedx.schema.bom.PatchesType#getPatch()
	 * @see #getPatchesType()
	 * @generated
	 */
	EReference getPatchesType_Patch();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.PatchesType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.PatchesType#getAny()
	 * @see #getPatchesType()
	 * @generated
	 */
	EAttribute getPatchesType_Any();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.PatchType <em>Patch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patch Type</em>'.
	 * @see org.cyclonedx.schema.bom.PatchType
	 * @generated
	 */
	EClass getPatchType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.PatchType#getDiff <em>Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Diff</em>'.
	 * @see org.cyclonedx.schema.bom.PatchType#getDiff()
	 * @see #getPatchType()
	 * @generated
	 */
	EReference getPatchType_Diff();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.PatchType#getResolves <em>Resolves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolves</em>'.
	 * @see org.cyclonedx.schema.bom.PatchType#getResolves()
	 * @see #getPatchType()
	 * @generated
	 */
	EReference getPatchType_Resolves();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.PatchType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.PatchType#getAny()
	 * @see #getPatchType()
	 * @generated
	 */
	EAttribute getPatchType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.PatchType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.cyclonedx.schema.bom.PatchType#getType()
	 * @see #getPatchType()
	 * @generated
	 */
	EAttribute getPatchType_Type();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.PedigreeType <em>Pedigree Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pedigree Type</em>'.
	 * @see org.cyclonedx.schema.bom.PedigreeType
	 * @generated
	 */
	EClass getPedigreeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.PedigreeType#getAncestors <em>Ancestors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ancestors</em>'.
	 * @see org.cyclonedx.schema.bom.PedigreeType#getAncestors()
	 * @see #getPedigreeType()
	 * @generated
	 */
	EReference getPedigreeType_Ancestors();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.PedigreeType#getDescendants <em>Descendants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Descendants</em>'.
	 * @see org.cyclonedx.schema.bom.PedigreeType#getDescendants()
	 * @see #getPedigreeType()
	 * @generated
	 */
	EReference getPedigreeType_Descendants();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.PedigreeType#getVariants <em>Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variants</em>'.
	 * @see org.cyclonedx.schema.bom.PedigreeType#getVariants()
	 * @see #getPedigreeType()
	 * @generated
	 */
	EReference getPedigreeType_Variants();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.PedigreeType#getCommits <em>Commits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Commits</em>'.
	 * @see org.cyclonedx.schema.bom.PedigreeType#getCommits()
	 * @see #getPedigreeType()
	 * @generated
	 */
	EReference getPedigreeType_Commits();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.PedigreeType#getPatches <em>Patches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Patches</em>'.
	 * @see org.cyclonedx.schema.bom.PedigreeType#getPatches()
	 * @see #getPedigreeType()
	 * @generated
	 */
	EReference getPedigreeType_Patches();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.PedigreeType#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see org.cyclonedx.schema.bom.PedigreeType#getNotes()
	 * @see #getPedigreeType()
	 * @generated
	 */
	EAttribute getPedigreeType_Notes();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.PedigreeType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.PedigreeType#getAny()
	 * @see #getPedigreeType()
	 * @generated
	 */
	EAttribute getPedigreeType_Any();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.PerformanceMetricsType <em>Performance Metrics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Metrics Type</em>'.
	 * @see org.cyclonedx.schema.bom.PerformanceMetricsType
	 * @generated
	 */
	EClass getPerformanceMetricsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.PerformanceMetricsType#getPerformanceMetric <em>Performance Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performance Metric</em>'.
	 * @see org.cyclonedx.schema.bom.PerformanceMetricsType#getPerformanceMetric()
	 * @see #getPerformanceMetricsType()
	 * @generated
	 */
	EReference getPerformanceMetricsType_PerformanceMetric();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.PerformanceMetricType <em>Performance Metric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Metric Type</em>'.
	 * @see org.cyclonedx.schema.bom.PerformanceMetricType
	 * @generated
	 */
	EClass getPerformanceMetricType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.PerformanceMetricType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.cyclonedx.schema.bom.PerformanceMetricType#getType()
	 * @see #getPerformanceMetricType()
	 * @generated
	 */
	EAttribute getPerformanceMetricType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.PerformanceMetricType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.cyclonedx.schema.bom.PerformanceMetricType#getValue()
	 * @see #getPerformanceMetricType()
	 * @generated
	 */
	EAttribute getPerformanceMetricType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.PerformanceMetricType#getSlice <em>Slice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slice</em>'.
	 * @see org.cyclonedx.schema.bom.PerformanceMetricType#getSlice()
	 * @see #getPerformanceMetricType()
	 * @generated
	 */
	EAttribute getPerformanceMetricType_Slice();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.PerformanceMetricType#getConfidenceInterval <em>Confidence Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confidence Interval</em>'.
	 * @see org.cyclonedx.schema.bom.PerformanceMetricType#getConfidenceInterval()
	 * @see #getPerformanceMetricType()
	 * @generated
	 */
	EReference getPerformanceMetricType_ConfidenceInterval();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.PerformanceTradeoffsType <em>Performance Tradeoffs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Tradeoffs Type</em>'.
	 * @see org.cyclonedx.schema.bom.PerformanceTradeoffsType
	 * @generated
	 */
	EClass getPerformanceTradeoffsType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.PerformanceTradeoffsType#getPerformanceTradeoff <em>Performance Tradeoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performance Tradeoff</em>'.
	 * @see org.cyclonedx.schema.bom.PerformanceTradeoffsType#getPerformanceTradeoff()
	 * @see #getPerformanceTradeoffsType()
	 * @generated
	 */
	EAttribute getPerformanceTradeoffsType_PerformanceTradeoff();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.PostalAddressType <em>Postal Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Address Type</em>'.
	 * @see org.cyclonedx.schema.bom.PostalAddressType
	 * @generated
	 */
	EClass getPostalAddressType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.PostalAddressType#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.cyclonedx.schema.bom.PostalAddressType#getCountry()
	 * @see #getPostalAddressType()
	 * @generated
	 */
	EAttribute getPostalAddressType_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.PostalAddressType#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.cyclonedx.schema.bom.PostalAddressType#getRegion()
	 * @see #getPostalAddressType()
	 * @generated
	 */
	EAttribute getPostalAddressType_Region();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.PostalAddressType#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locality</em>'.
	 * @see org.cyclonedx.schema.bom.PostalAddressType#getLocality()
	 * @see #getPostalAddressType()
	 * @generated
	 */
	EAttribute getPostalAddressType_Locality();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.PostalAddressType#getPostOfficeBoxNumber <em>Post Office Box Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post Office Box Number</em>'.
	 * @see org.cyclonedx.schema.bom.PostalAddressType#getPostOfficeBoxNumber()
	 * @see #getPostalAddressType()
	 * @generated
	 */
	EAttribute getPostalAddressType_PostOfficeBoxNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.PostalAddressType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see org.cyclonedx.schema.bom.PostalAddressType#getPostalCode()
	 * @see #getPostalAddressType()
	 * @generated
	 */
	EAttribute getPostalAddressType_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.PostalAddressType#getStreetAddress <em>Street Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street Address</em>'.
	 * @see org.cyclonedx.schema.bom.PostalAddressType#getStreetAddress()
	 * @see #getPostalAddressType()
	 * @generated
	 */
	EAttribute getPostalAddressType_StreetAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.PostalAddressType#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.PostalAddressType#getBomRef()
	 * @see #getPostalAddressType()
	 * @generated
	 */
	EAttribute getPostalAddressType_BomRef();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ProofOfConceptType <em>Proof Of Concept Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proof Of Concept Type</em>'.
	 * @see org.cyclonedx.schema.bom.ProofOfConceptType
	 * @generated
	 */
	EClass getProofOfConceptType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ProofOfConceptType#getReproductionSteps <em>Reproduction Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reproduction Steps</em>'.
	 * @see org.cyclonedx.schema.bom.ProofOfConceptType#getReproductionSteps()
	 * @see #getProofOfConceptType()
	 * @generated
	 */
	EAttribute getProofOfConceptType_ReproductionSteps();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ProofOfConceptType#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see org.cyclonedx.schema.bom.ProofOfConceptType#getEnvironment()
	 * @see #getProofOfConceptType()
	 * @generated
	 */
	EAttribute getProofOfConceptType_Environment();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ProofOfConceptType#getSupportingMaterial <em>Supporting Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supporting Material</em>'.
	 * @see org.cyclonedx.schema.bom.ProofOfConceptType#getSupportingMaterial()
	 * @see #getProofOfConceptType()
	 * @generated
	 */
	EReference getProofOfConceptType_SupportingMaterial();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.PropertiesType <em>Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Type</em>'.
	 * @see org.cyclonedx.schema.bom.PropertiesType
	 * @generated
	 */
	EClass getPropertiesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.PropertiesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.PropertiesType#getGroup()
	 * @see #getPropertiesType()
	 * @generated
	 */
	EAttribute getPropertiesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.PropertiesType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.cyclonedx.schema.bom.PropertiesType#getProperty()
	 * @see #getPropertiesType()
	 * @generated
	 */
	EReference getPropertiesType_Property();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.PropertiesType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.PropertiesType#getAny()
	 * @see #getPropertiesType()
	 * @generated
	 */
	EAttribute getPropertiesType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.PropertiesType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.PropertiesType#getAnyAttribute()
	 * @see #getPropertiesType()
	 * @generated
	 */
	EAttribute getPropertiesType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see org.cyclonedx.schema.bom.PropertyType
	 * @generated
	 */
	EClass getPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.PropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.cyclonedx.schema.bom.PropertyType#getValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.PropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.PropertyType#getName()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Name();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ProtocolPropertiesType <em>Protocol Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Properties Type</em>'.
	 * @see org.cyclonedx.schema.bom.ProtocolPropertiesType
	 * @generated
	 */
	EClass getProtocolPropertiesType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ProtocolPropertiesType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.cyclonedx.schema.bom.ProtocolPropertiesType#getType()
	 * @see #getProtocolPropertiesType()
	 * @generated
	 */
	EAttribute getProtocolPropertiesType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ProtocolPropertiesType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.cyclonedx.schema.bom.ProtocolPropertiesType#getVersion()
	 * @see #getProtocolPropertiesType()
	 * @generated
	 */
	EAttribute getProtocolPropertiesType_Version();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ProtocolPropertiesType#getCipherSuites <em>Cipher Suites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cipher Suites</em>'.
	 * @see org.cyclonedx.schema.bom.ProtocolPropertiesType#getCipherSuites()
	 * @see #getProtocolPropertiesType()
	 * @generated
	 */
	EReference getProtocolPropertiesType_CipherSuites();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ProtocolPropertiesType#getIkev2TransformTypes <em>Ikev2 Transform Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ikev2 Transform Types</em>'.
	 * @see org.cyclonedx.schema.bom.ProtocolPropertiesType#getIkev2TransformTypes()
	 * @see #getProtocolPropertiesType()
	 * @generated
	 */
	EReference getProtocolPropertiesType_Ikev2TransformTypes();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ProtocolPropertiesType#getCryptoRef <em>Crypto Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Crypto Ref</em>'.
	 * @see org.cyclonedx.schema.bom.ProtocolPropertiesType#getCryptoRef()
	 * @see #getProtocolPropertiesType()
	 * @generated
	 */
	EAttribute getProtocolPropertiesType_CryptoRef();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ProvidesType <em>Provides Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provides Type</em>'.
	 * @see org.cyclonedx.schema.bom.ProvidesType
	 * @generated
	 */
	EClass getProvidesType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ProvidesType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.cyclonedx.schema.bom.ProvidesType#getRef()
	 * @see #getProvidesType()
	 * @generated
	 */
	EAttribute getProvidesType_Ref();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.PurchaserType <em>Purchaser Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purchaser Type</em>'.
	 * @see org.cyclonedx.schema.bom.PurchaserType
	 * @generated
	 */
	EClass getPurchaserType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.PurchaserType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see org.cyclonedx.schema.bom.PurchaserType#getOrganization()
	 * @see #getPurchaserType()
	 * @generated
	 */
	EReference getPurchaserType_Organization();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.PurchaserType#getIndividual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Individual</em>'.
	 * @see org.cyclonedx.schema.bom.PurchaserType#getIndividual()
	 * @see #getPurchaserType()
	 * @generated
	 */
	EReference getPurchaserType_Individual();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.QuantitativeAnalysisType <em>Quantitative Analysis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantitative Analysis Type</em>'.
	 * @see org.cyclonedx.schema.bom.QuantitativeAnalysisType
	 * @generated
	 */
	EClass getQuantitativeAnalysisType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.QuantitativeAnalysisType#getPerformanceMetrics <em>Performance Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Performance Metrics</em>'.
	 * @see org.cyclonedx.schema.bom.QuantitativeAnalysisType#getPerformanceMetrics()
	 * @see #getQuantitativeAnalysisType()
	 * @generated
	 */
	EReference getQuantitativeAnalysisType_PerformanceMetrics();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.QuantitativeAnalysisType#getGraphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphics</em>'.
	 * @see org.cyclonedx.schema.bom.QuantitativeAnalysisType#getGraphics()
	 * @see #getQuantitativeAnalysisType()
	 * @generated
	 */
	EReference getQuantitativeAnalysisType_Graphics();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.RatingsType <em>Ratings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ratings Type</em>'.
	 * @see org.cyclonedx.schema.bom.RatingsType
	 * @generated
	 */
	EClass getRatingsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.RatingsType#getRating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rating</em>'.
	 * @see org.cyclonedx.schema.bom.RatingsType#getRating()
	 * @see #getRatingsType()
	 * @generated
	 */
	EReference getRatingsType_Rating();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.RatingType <em>Rating Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rating Type</em>'.
	 * @see org.cyclonedx.schema.bom.RatingType
	 * @generated
	 */
	EClass getRatingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.RatingType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.cyclonedx.schema.bom.RatingType#getSource()
	 * @see #getRatingType()
	 * @generated
	 */
	EReference getRatingType_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.RatingType#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see org.cyclonedx.schema.bom.RatingType#getScore()
	 * @see #getRatingType()
	 * @generated
	 */
	EAttribute getRatingType_Score();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.RatingType#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.cyclonedx.schema.bom.RatingType#getSeverity()
	 * @see #getRatingType()
	 * @generated
	 */
	EAttribute getRatingType_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.RatingType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.cyclonedx.schema.bom.RatingType#getMethod()
	 * @see #getRatingType()
	 * @generated
	 */
	EAttribute getRatingType_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.RatingType#getVector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector</em>'.
	 * @see org.cyclonedx.schema.bom.RatingType#getVector()
	 * @see #getRatingType()
	 * @generated
	 */
	EAttribute getRatingType_Vector();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.RatingType#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justification</em>'.
	 * @see org.cyclonedx.schema.bom.RatingType#getJustification()
	 * @see #getRatingType()
	 * @generated
	 */
	EAttribute getRatingType_Justification();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ReferencesType <em>References Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>References Type</em>'.
	 * @see org.cyclonedx.schema.bom.ReferencesType
	 * @generated
	 */
	EClass getReferencesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ReferencesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.ReferencesType#getGroup()
	 * @see #getReferencesType()
	 * @generated
	 */
	EAttribute getReferencesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ReferencesType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.cyclonedx.schema.bom.ReferencesType#getReference()
	 * @see #getReferencesType()
	 * @generated
	 */
	EReference getReferencesType_Reference();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ReferencesType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.ReferencesType#getAny()
	 * @see #getReferencesType()
	 * @generated
	 */
	EAttribute getReferencesType_Any();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ReferencesType1 <em>References Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>References Type1</em>'.
	 * @see org.cyclonedx.schema.bom.ReferencesType1
	 * @generated
	 */
	EClass getReferencesType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ReferencesType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.ReferencesType1#getGroup()
	 * @see #getReferencesType1()
	 * @generated
	 */
	EAttribute getReferencesType1_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ReferencesType1#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Url</em>'.
	 * @see org.cyclonedx.schema.bom.ReferencesType1#getUrl()
	 * @see #getReferencesType1()
	 * @generated
	 */
	EAttribute getReferencesType1_Url();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type</em>'.
	 * @see org.cyclonedx.schema.bom.ReferenceType
	 * @generated
	 */
	EClass getReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ReferenceType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.cyclonedx.schema.bom.ReferenceType#getId()
	 * @see #getReferenceType()
	 * @generated
	 */
	EAttribute getReferenceType_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ReferenceType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.cyclonedx.schema.bom.ReferenceType#getSource()
	 * @see #getReferenceType()
	 * @generated
	 */
	EReference getReferenceType_Source();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType <em>Related Crypto Material Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Crypto Material Properties Type</em>'.
	 * @see org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType
	 * @generated
	 */
	EClass getRelatedCryptoMaterialPropertiesType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getType()
	 * @see #getRelatedCryptoMaterialPropertiesType()
	 * @generated
	 */
	EAttribute getRelatedCryptoMaterialPropertiesType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getId()
	 * @see #getRelatedCryptoMaterialPropertiesType()
	 * @generated
	 */
	EAttribute getRelatedCryptoMaterialPropertiesType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getState()
	 * @see #getRelatedCryptoMaterialPropertiesType()
	 * @generated
	 */
	EAttribute getRelatedCryptoMaterialPropertiesType_State();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getAlgorithmRef <em>Algorithm Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm Ref</em>'.
	 * @see org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getAlgorithmRef()
	 * @see #getRelatedCryptoMaterialPropertiesType()
	 * @generated
	 */
	EAttribute getRelatedCryptoMaterialPropertiesType_AlgorithmRef();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getCreationDate()
	 * @see #getRelatedCryptoMaterialPropertiesType()
	 * @generated
	 */
	EAttribute getRelatedCryptoMaterialPropertiesType_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getActivationDate <em>Activation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Date</em>'.
	 * @see org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getActivationDate()
	 * @see #getRelatedCryptoMaterialPropertiesType()
	 * @generated
	 */
	EAttribute getRelatedCryptoMaterialPropertiesType_ActivationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getUpdateDate <em>Update Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Date</em>'.
	 * @see org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getUpdateDate()
	 * @see #getRelatedCryptoMaterialPropertiesType()
	 * @generated
	 */
	EAttribute getRelatedCryptoMaterialPropertiesType_UpdateDate();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getExpirationDate()
	 * @see #getRelatedCryptoMaterialPropertiesType()
	 * @generated
	 */
	EAttribute getRelatedCryptoMaterialPropertiesType_ExpirationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getValue()
	 * @see #getRelatedCryptoMaterialPropertiesType()
	 * @generated
	 */
	EAttribute getRelatedCryptoMaterialPropertiesType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getSize()
	 * @see #getRelatedCryptoMaterialPropertiesType()
	 * @generated
	 */
	EAttribute getRelatedCryptoMaterialPropertiesType_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getFormat()
	 * @see #getRelatedCryptoMaterialPropertiesType()
	 * @generated
	 */
	EAttribute getRelatedCryptoMaterialPropertiesType_Format();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getSecuredBy <em>Secured By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Secured By</em>'.
	 * @see org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getSecuredBy()
	 * @see #getRelatedCryptoMaterialPropertiesType()
	 * @generated
	 */
	EReference getRelatedCryptoMaterialPropertiesType_SecuredBy();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ReleaseNotesType <em>Release Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release Notes Type</em>'.
	 * @see org.cyclonedx.schema.bom.ReleaseNotesType
	 * @generated
	 */
	EClass getReleaseNotesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ReleaseNotesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.ReleaseNotesType#getGroup()
	 * @see #getReleaseNotesType()
	 * @generated
	 */
	EAttribute getReleaseNotesType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ReleaseNotesType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see org.cyclonedx.schema.bom.ReleaseNotesType#getType()
	 * @see #getReleaseNotesType()
	 * @generated
	 */
	EAttribute getReleaseNotesType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ReleaseNotesType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Title</em>'.
	 * @see org.cyclonedx.schema.bom.ReleaseNotesType#getTitle()
	 * @see #getReleaseNotesType()
	 * @generated
	 */
	EAttribute getReleaseNotesType_Title();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ReleaseNotesType#getFeaturedImage <em>Featured Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Featured Image</em>'.
	 * @see org.cyclonedx.schema.bom.ReleaseNotesType#getFeaturedImage()
	 * @see #getReleaseNotesType()
	 * @generated
	 */
	EAttribute getReleaseNotesType_FeaturedImage();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ReleaseNotesType#getSocialImage <em>Social Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Social Image</em>'.
	 * @see org.cyclonedx.schema.bom.ReleaseNotesType#getSocialImage()
	 * @see #getReleaseNotesType()
	 * @generated
	 */
	EAttribute getReleaseNotesType_SocialImage();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ReleaseNotesType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.ReleaseNotesType#getDescription()
	 * @see #getReleaseNotesType()
	 * @generated
	 */
	EAttribute getReleaseNotesType_Description();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ReleaseNotesType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Timestamp</em>'.
	 * @see org.cyclonedx.schema.bom.ReleaseNotesType#getTimestamp()
	 * @see #getReleaseNotesType()
	 * @generated
	 */
	EAttribute getReleaseNotesType_Timestamp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ReleaseNotesType#getAliases <em>Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aliases</em>'.
	 * @see org.cyclonedx.schema.bom.ReleaseNotesType#getAliases()
	 * @see #getReleaseNotesType()
	 * @generated
	 */
	EReference getReleaseNotesType_Aliases();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ReleaseNotesType#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see org.cyclonedx.schema.bom.ReleaseNotesType#getTags()
	 * @see #getReleaseNotesType()
	 * @generated
	 */
	EReference getReleaseNotesType_Tags();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ReleaseNotesType#getResolves <em>Resolves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resolves</em>'.
	 * @see org.cyclonedx.schema.bom.ReleaseNotesType#getResolves()
	 * @see #getReleaseNotesType()
	 * @generated
	 */
	EReference getReleaseNotesType_Resolves();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ReleaseNotesType#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notes</em>'.
	 * @see org.cyclonedx.schema.bom.ReleaseNotesType#getNotes()
	 * @see #getReleaseNotesType()
	 * @generated
	 */
	EReference getReleaseNotesType_Notes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ReleaseNotesType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.ReleaseNotesType#getProperties()
	 * @see #getReleaseNotesType()
	 * @generated
	 */
	EReference getReleaseNotesType_Properties();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ReleaseNotesType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.ReleaseNotesType#getAny()
	 * @see #getReleaseNotesType()
	 * @generated
	 */
	EAttribute getReleaseNotesType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ReleaseNotesType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.ReleaseNotesType#getAnyAttribute()
	 * @see #getReleaseNotesType()
	 * @generated
	 */
	EAttribute getReleaseNotesType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.RequirementsType <em>Requirements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Type</em>'.
	 * @see org.cyclonedx.schema.bom.RequirementsType
	 * @generated
	 */
	EClass getRequirementsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.RequirementsType#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Requirement</em>'.
	 * @see org.cyclonedx.schema.bom.RequirementsType#getRequirement()
	 * @see #getRequirementsType()
	 * @generated
	 */
	EAttribute getRequirementsType_Requirement();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.RequirementsType1 <em>Requirements Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Type1</em>'.
	 * @see org.cyclonedx.schema.bom.RequirementsType1
	 * @generated
	 */
	EClass getRequirementsType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.RequirementsType1#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement</em>'.
	 * @see org.cyclonedx.schema.bom.RequirementsType1#getRequirement()
	 * @see #getRequirementsType1()
	 * @generated
	 */
	EReference getRequirementsType1_Requirement();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.RequirementType <em>Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Type</em>'.
	 * @see org.cyclonedx.schema.bom.RequirementType
	 * @generated
	 */
	EClass getRequirementType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.RequirementType#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.cyclonedx.schema.bom.RequirementType#getIdentifier()
	 * @see #getRequirementType()
	 * @generated
	 */
	EAttribute getRequirementType_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.RequirementType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.cyclonedx.schema.bom.RequirementType#getTitle()
	 * @see #getRequirementType()
	 * @generated
	 */
	EAttribute getRequirementType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.RequirementType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.cyclonedx.schema.bom.RequirementType#getText()
	 * @see #getRequirementType()
	 * @generated
	 */
	EAttribute getRequirementType_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.RequirementType#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Descriptions</em>'.
	 * @see org.cyclonedx.schema.bom.RequirementType#getDescriptions()
	 * @see #getRequirementType()
	 * @generated
	 */
	EReference getRequirementType_Descriptions();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.RequirementType#getOpenCre <em>Open Cre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Open Cre</em>'.
	 * @see org.cyclonedx.schema.bom.RequirementType#getOpenCre()
	 * @see #getRequirementType()
	 * @generated
	 */
	EAttribute getRequirementType_OpenCre();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.RequirementType#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent</em>'.
	 * @see org.cyclonedx.schema.bom.RequirementType#getParent()
	 * @see #getRequirementType()
	 * @generated
	 */
	EAttribute getRequirementType_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.RequirementType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.RequirementType#getProperties()
	 * @see #getRequirementType()
	 * @generated
	 */
	EReference getRequirementType_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.RequirementType#getExternalReferences <em>External References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External References</em>'.
	 * @see org.cyclonedx.schema.bom.RequirementType#getExternalReferences()
	 * @see #getRequirementType()
	 * @generated
	 */
	EReference getRequirementType_ExternalReferences();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.RequirementType#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.RequirementType#getBomRef()
	 * @see #getRequirementType()
	 * @generated
	 */
	EAttribute getRequirementType_BomRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.RequirementType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.RequirementType#getAnyAttribute()
	 * @see #getRequirementType()
	 * @generated
	 */
	EAttribute getRequirementType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ResolvesType <em>Resolves Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolves Type</em>'.
	 * @see org.cyclonedx.schema.bom.ResolvesType
	 * @generated
	 */
	EClass getResolvesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ResolvesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.ResolvesType#getGroup()
	 * @see #getResolvesType()
	 * @generated
	 */
	EAttribute getResolvesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ResolvesType#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issue</em>'.
	 * @see org.cyclonedx.schema.bom.ResolvesType#getIssue()
	 * @see #getResolvesType()
	 * @generated
	 */
	EReference getResolvesType_Issue();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ResolvesType1 <em>Resolves Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolves Type1</em>'.
	 * @see org.cyclonedx.schema.bom.ResolvesType1
	 * @generated
	 */
	EClass getResolvesType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ResolvesType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.ResolvesType1#getGroup()
	 * @see #getResolvesType1()
	 * @generated
	 */
	EAttribute getResolvesType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ResolvesType1#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issue</em>'.
	 * @see org.cyclonedx.schema.bom.ResolvesType1#getIssue()
	 * @see #getResolvesType1()
	 * @generated
	 */
	EReference getResolvesType1_Issue();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ResourceReferencesType <em>Resource References Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource References Type</em>'.
	 * @see org.cyclonedx.schema.bom.ResourceReferencesType
	 * @generated
	 */
	EClass getResourceReferencesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ResourceReferencesType#getResourceReference <em>Resource Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Reference</em>'.
	 * @see org.cyclonedx.schema.bom.ResourceReferencesType#getResourceReference()
	 * @see #getResourceReferencesType()
	 * @generated
	 */
	EReference getResourceReferencesType_ResourceReference();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ResourceReferencesType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.ResourceReferencesType#getAny()
	 * @see #getResourceReferencesType()
	 * @generated
	 */
	EAttribute getResourceReferencesType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ResourceReferencesType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.ResourceReferencesType#getAnyAttribute()
	 * @see #getResourceReferencesType()
	 * @generated
	 */
	EAttribute getResourceReferencesType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ResourceReferenceType <em>Resource Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Reference Type</em>'.
	 * @see org.cyclonedx.schema.bom.ResourceReferenceType
	 * @generated
	 */
	EClass getResourceReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ResourceReferenceType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.cyclonedx.schema.bom.ResourceReferenceType#getRef()
	 * @see #getResourceReferenceType()
	 * @generated
	 */
	EAttribute getResourceReferenceType_Ref();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ResourceReferenceType#getExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Reference</em>'.
	 * @see org.cyclonedx.schema.bom.ResourceReferenceType#getExternalReference()
	 * @see #getResourceReferenceType()
	 * @generated
	 */
	EReference getResourceReferenceType_ExternalReference();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ResourceReferenceType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.ResourceReferenceType#getAny()
	 * @see #getResourceReferenceType()
	 * @generated
	 */
	EAttribute getResourceReferenceType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ResourceReferenceType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.ResourceReferenceType#getAnyAttribute()
	 * @see #getResourceReferenceType()
	 * @generated
	 */
	EAttribute getResourceReferenceType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ResponsesType <em>Responses Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responses Type</em>'.
	 * @see org.cyclonedx.schema.bom.ResponsesType
	 * @generated
	 */
	EClass getResponsesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ResponsesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.ResponsesType#getGroup()
	 * @see #getResponsesType()
	 * @generated
	 */
	EAttribute getResponsesType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ResponsesType#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Response</em>'.
	 * @see org.cyclonedx.schema.bom.ResponsesType#getResponse()
	 * @see #getResponsesType()
	 * @generated
	 */
	EAttribute getResponsesType_Response();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.SecuredByType <em>Secured By Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secured By Type</em>'.
	 * @see org.cyclonedx.schema.bom.SecuredByType
	 * @generated
	 */
	EClass getSecuredByType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.SecuredByType#getMechanism <em>Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanism</em>'.
	 * @see org.cyclonedx.schema.bom.SecuredByType#getMechanism()
	 * @see #getSecuredByType()
	 * @generated
	 */
	EAttribute getSecuredByType_Mechanism();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.SecuredByType#getAlgorithmRef <em>Algorithm Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm Ref</em>'.
	 * @see org.cyclonedx.schema.bom.SecuredByType#getAlgorithmRef()
	 * @see #getSecuredByType()
	 * @generated
	 */
	EAttribute getSecuredByType_AlgorithmRef();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.cyclonedx.schema.bom.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Service#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provider</em>'.
	 * @see org.cyclonedx.schema.bom.Service#getProvider()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Service#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.Service#getGroup()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Group();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Service#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.cyclonedx.schema.bom.Service#getVersion()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Service#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.Service#getDescription()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Service#getEndpoints <em>Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoints</em>'.
	 * @see org.cyclonedx.schema.bom.Service#getEndpoints()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Endpoints();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Service#isAuthenticated <em>Authenticated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authenticated</em>'.
	 * @see org.cyclonedx.schema.bom.Service#isAuthenticated()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Authenticated();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Service#isXTrustBoundary <em>XTrust Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XTrust Boundary</em>'.
	 * @see org.cyclonedx.schema.bom.Service#isXTrustBoundary()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_XTrustBoundary();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Service#getTrustZone <em>Trust Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trust Zone</em>'.
	 * @see org.cyclonedx.schema.bom.Service#getTrustZone()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_TrustZone();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Service#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.cyclonedx.schema.bom.Service#getData()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Data();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Service#getLicenses <em>Licenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Licenses</em>'.
	 * @see org.cyclonedx.schema.bom.Service#getLicenses()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Licenses();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Service#getExternalReferences <em>External References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External References</em>'.
	 * @see org.cyclonedx.schema.bom.Service#getExternalReferences()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_ExternalReferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Service#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.Service#getProperties()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Service#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Services</em>'.
	 * @see org.cyclonedx.schema.bom.Service#getServices()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Services();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Service#getReleaseNotes <em>Release Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Release Notes</em>'.
	 * @see org.cyclonedx.schema.bom.Service#getReleaseNotes()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_ReleaseNotes();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Service#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tags</em>'.
	 * @see org.cyclonedx.schema.bom.Service#getTags()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Tags();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.Service#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.Service#getAny()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Service#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.Service#getBomRef()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_BomRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.Service#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.Service#getAnyAttribute()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ServicesType <em>Services Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Services Type</em>'.
	 * @see org.cyclonedx.schema.bom.ServicesType
	 * @generated
	 */
	EClass getServicesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ServicesType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see org.cyclonedx.schema.bom.ServicesType#getService()
	 * @see #getServicesType()
	 * @generated
	 */
	EReference getServicesType_Service();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ServicesType1 <em>Services Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Services Type1</em>'.
	 * @see org.cyclonedx.schema.bom.ServicesType1
	 * @generated
	 */
	EClass getServicesType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ServicesType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.ServicesType1#getGroup()
	 * @see #getServicesType1()
	 * @generated
	 */
	EAttribute getServicesType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ServicesType1#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see org.cyclonedx.schema.bom.ServicesType1#getService()
	 * @see #getServicesType1()
	 * @generated
	 */
	EReference getServicesType1_Service();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ServicesType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.ServicesType1#getAny()
	 * @see #getServicesType1()
	 * @generated
	 */
	EAttribute getServicesType1_Any();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ServicesType2 <em>Services Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Services Type2</em>'.
	 * @see org.cyclonedx.schema.bom.ServicesType2
	 * @generated
	 */
	EClass getServicesType2();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ServicesType2#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.ServicesType2#getGroup()
	 * @see #getServicesType2()
	 * @generated
	 */
	EAttribute getServicesType2_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ServicesType2#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see org.cyclonedx.schema.bom.ServicesType2#getService()
	 * @see #getServicesType2()
	 * @generated
	 */
	EReference getServicesType2_Service();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ServicesType2#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.ServicesType2#getAny()
	 * @see #getServicesType2()
	 * @generated
	 */
	EAttribute getServicesType2_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ServicesType2#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.ServicesType2#getAnyAttribute()
	 * @see #getServicesType2()
	 * @generated
	 */
	EAttribute getServicesType2_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.SignatoriesType <em>Signatories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signatories Type</em>'.
	 * @see org.cyclonedx.schema.bom.SignatoriesType
	 * @generated
	 */
	EClass getSignatoriesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.SignatoriesType#getSignatory <em>Signatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signatory</em>'.
	 * @see org.cyclonedx.schema.bom.SignatoriesType#getSignatory()
	 * @see #getSignatoriesType()
	 * @generated
	 */
	EReference getSignatoriesType_Signatory();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.SignatoryType <em>Signatory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signatory Type</em>'.
	 * @see org.cyclonedx.schema.bom.SignatoryType
	 * @generated
	 */
	EClass getSignatoryType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.SignatoryType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.SignatoryType#getName()
	 * @see #getSignatoryType()
	 * @generated
	 */
	EAttribute getSignatoryType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.SignatoryType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.cyclonedx.schema.bom.SignatoryType#getRole()
	 * @see #getSignatoryType()
	 * @generated
	 */
	EAttribute getSignatoryType_Role();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.SignatoryType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see org.cyclonedx.schema.bom.SignatoryType#getOrganization()
	 * @see #getSignatoryType()
	 * @generated
	 */
	EReference getSignatoryType_Organization();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.SignatoryType#getExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Reference</em>'.
	 * @see org.cyclonedx.schema.bom.SignatoryType#getExternalReference()
	 * @see #getSignatoryType()
	 * @generated
	 */
	EReference getSignatoryType_ExternalReference();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.SignatoryType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.SignatoryType#getAny()
	 * @see #getSignatoryType()
	 * @generated
	 */
	EAttribute getSignatoryType_Any();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Type</em>'.
	 * @see org.cyclonedx.schema.bom.SourceType
	 * @generated
	 */
	EClass getSourceType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.SourceType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.SourceType#getGroup()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.SourceType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Url</em>'.
	 * @see org.cyclonedx.schema.bom.SourceType#getUrl()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_Url();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.SourceType1 <em>Source Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Type1</em>'.
	 * @see org.cyclonedx.schema.bom.SourceType1
	 * @generated
	 */
	EClass getSourceType1();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.SourceType1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.SourceType1#getName()
	 * @see #getSourceType1()
	 * @generated
	 */
	EAttribute getSourceType1_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.SourceType1#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.cyclonedx.schema.bom.SourceType1#getUrl()
	 * @see #getSourceType1()
	 * @generated
	 */
	EAttribute getSourceType1_Url();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.Standard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard</em>'.
	 * @see org.cyclonedx.schema.bom.Standard
	 * @generated
	 */
	EClass getStandard();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Standard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.Standard#getName()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Standard#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.cyclonedx.schema.bom.Standard#getVersion()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Standard#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.Standard#getDescription()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Standard#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see org.cyclonedx.schema.bom.Standard#getOwner()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_Owner();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Standard#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirements</em>'.
	 * @see org.cyclonedx.schema.bom.Standard#getRequirements()
	 * @see #getStandard()
	 * @generated
	 */
	EReference getStandard_Requirements();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Standard#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Levels</em>'.
	 * @see org.cyclonedx.schema.bom.Standard#getLevels()
	 * @see #getStandard()
	 * @generated
	 */
	EReference getStandard_Levels();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.Standard#getExternalReferences <em>External References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External References</em>'.
	 * @see org.cyclonedx.schema.bom.Standard#getExternalReferences()
	 * @see #getStandard()
	 * @generated
	 */
	EReference getStandard_ExternalReferences();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.Standard#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.Standard#getAny()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.Standard#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.Standard#getBomRef()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_BomRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.Standard#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.Standard#getAnyAttribute()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.StandardsType <em>Standards Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standards Type</em>'.
	 * @see org.cyclonedx.schema.bom.StandardsType
	 * @generated
	 */
	EClass getStandardsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.StandardsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.StandardsType#getGroup()
	 * @see #getStandardsType()
	 * @generated
	 */
	EAttribute getStandardsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.StandardsType#getStandard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Standard</em>'.
	 * @see org.cyclonedx.schema.bom.StandardsType#getStandard()
	 * @see #getStandardsType()
	 * @generated
	 */
	EReference getStandardsType_Standard();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.StandardsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.StandardsType#getAny()
	 * @see #getStandardsType()
	 * @generated
	 */
	EAttribute getStandardsType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.StandardsType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.StandardsType#getAnyAttribute()
	 * @see #getStandardsType()
	 * @generated
	 */
	EAttribute getStandardsType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.StepsType <em>Steps Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Steps Type</em>'.
	 * @see org.cyclonedx.schema.bom.StepsType
	 * @generated
	 */
	EClass getStepsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.StepsType#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see org.cyclonedx.schema.bom.StepsType#getStep()
	 * @see #getStepsType()
	 * @generated
	 */
	EReference getStepsType_Step();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.StepsType1 <em>Steps Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Steps Type1</em>'.
	 * @see org.cyclonedx.schema.bom.StepsType1
	 * @generated
	 */
	EClass getStepsType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.StepsType1#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see org.cyclonedx.schema.bom.StepsType1#getStep()
	 * @see #getStepsType1()
	 * @generated
	 */
	EReference getStepsType1_Step();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.StepType <em>Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Type</em>'.
	 * @see org.cyclonedx.schema.bom.StepType
	 * @generated
	 */
	EClass getStepType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.StepType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.StepType#getName()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.StepType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.StepType#getDescription()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.StepType#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Commands</em>'.
	 * @see org.cyclonedx.schema.bom.StepType#getCommands()
	 * @see #getStepType()
	 * @generated
	 */
	EReference getStepType_Commands();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.StepType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.StepType#getProperties()
	 * @see #getStepType()
	 * @generated
	 */
	EReference getStepType_Properties();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.StepType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.StepType#getAny()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.StepType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.StepType#getAnyAttribute()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.StewardsType <em>Stewards Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stewards Type</em>'.
	 * @see org.cyclonedx.schema.bom.StewardsType
	 * @generated
	 */
	EClass getStewardsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.StewardsType#getSteward <em>Steward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steward</em>'.
	 * @see org.cyclonedx.schema.bom.StewardsType#getSteward()
	 * @see #getStewardsType()
	 * @generated
	 */
	EReference getStewardsType_Steward();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.SubjectsType <em>Subjects Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subjects Type</em>'.
	 * @see org.cyclonedx.schema.bom.SubjectsType
	 * @generated
	 */
	EClass getSubjectsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.SubjectsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.SubjectsType#getGroup()
	 * @see #getSubjectsType()
	 * @generated
	 */
	EAttribute getSubjectsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.SubjectsType#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subject</em>'.
	 * @see org.cyclonedx.schema.bom.SubjectsType#getSubject()
	 * @see #getSubjectsType()
	 * @generated
	 */
	EReference getSubjectsType_Subject();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.SubjectsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.SubjectsType#getAny()
	 * @see #getSubjectsType()
	 * @generated
	 */
	EAttribute getSubjectsType_Any();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.SupportingMaterialType <em>Supporting Material Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supporting Material Type</em>'.
	 * @see org.cyclonedx.schema.bom.SupportingMaterialType
	 * @generated
	 */
	EClass getSupportingMaterialType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.SupportingMaterialType#getAttachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attachment</em>'.
	 * @see org.cyclonedx.schema.bom.SupportingMaterialType#getAttachment()
	 * @see #getSupportingMaterialType()
	 * @generated
	 */
	EReference getSupportingMaterialType_Attachment();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.SwidType <em>Swid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swid Type</em>'.
	 * @see org.cyclonedx.schema.bom.SwidType
	 * @generated
	 */
	EClass getSwidType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.SwidType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.cyclonedx.schema.bom.SwidType#getText()
	 * @see #getSwidType()
	 * @generated
	 */
	EReference getSwidType_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.SwidType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.cyclonedx.schema.bom.SwidType#getUrl()
	 * @see #getSwidType()
	 * @generated
	 */
	EAttribute getSwidType_Url();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.SwidType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.SwidType#getAny()
	 * @see #getSwidType()
	 * @generated
	 */
	EAttribute getSwidType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.SwidType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.SwidType#getName()
	 * @see #getSwidType()
	 * @generated
	 */
	EAttribute getSwidType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.SwidType#isPatch <em>Patch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patch</em>'.
	 * @see org.cyclonedx.schema.bom.SwidType#isPatch()
	 * @see #getSwidType()
	 * @generated
	 */
	EAttribute getSwidType_Patch();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.SwidType#getTagId <em>Tag Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag Id</em>'.
	 * @see org.cyclonedx.schema.bom.SwidType#getTagId()
	 * @see #getSwidType()
	 * @generated
	 */
	EAttribute getSwidType_TagId();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.SwidType#getTagVersion <em>Tag Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag Version</em>'.
	 * @see org.cyclonedx.schema.bom.SwidType#getTagVersion()
	 * @see #getSwidType()
	 * @generated
	 */
	EAttribute getSwidType_TagVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.SwidType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.cyclonedx.schema.bom.SwidType#getVersion()
	 * @see #getSwidType()
	 * @generated
	 */
	EAttribute getSwidType_Version();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.TagsType <em>Tags Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tags Type</em>'.
	 * @see org.cyclonedx.schema.bom.TagsType
	 * @generated
	 */
	EClass getTagsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.TagsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.TagsType#getGroup()
	 * @see #getTagsType()
	 * @generated
	 */
	EAttribute getTagsType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.TagsType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tag</em>'.
	 * @see org.cyclonedx.schema.bom.TagsType#getTag()
	 * @see #getTagsType()
	 * @generated
	 */
	EAttribute getTagsType_Tag();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.TargetsType <em>Targets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Targets Type</em>'.
	 * @see org.cyclonedx.schema.bom.TargetsType
	 * @generated
	 */
	EClass getTargetsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.TargetsType#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organizations</em>'.
	 * @see org.cyclonedx.schema.bom.TargetsType#getOrganizations()
	 * @see #getTargetsType()
	 * @generated
	 */
	EReference getTargetsType_Organizations();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.TargetsType#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see org.cyclonedx.schema.bom.TargetsType#getComponents()
	 * @see #getTargetsType()
	 * @generated
	 */
	EReference getTargetsType_Components();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.TargetsType#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Services</em>'.
	 * @see org.cyclonedx.schema.bom.TargetsType#getServices()
	 * @see #getTargetsType()
	 * @generated
	 */
	EReference getTargetsType_Services();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.TargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Type</em>'.
	 * @see org.cyclonedx.schema.bom.TargetType
	 * @generated
	 */
	EClass getTargetType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.TargetType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.cyclonedx.schema.bom.TargetType#getRef()
	 * @see #getTargetType()
	 * @generated
	 */
	EAttribute getTargetType_Ref();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.TargetType#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Versions</em>'.
	 * @see org.cyclonedx.schema.bom.TargetType#getVersions()
	 * @see #getTargetType()
	 * @generated
	 */
	EReference getTargetType_Versions();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.TasksType <em>Tasks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tasks Type</em>'.
	 * @see org.cyclonedx.schema.bom.TasksType
	 * @generated
	 */
	EClass getTasksType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.TasksType#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see org.cyclonedx.schema.bom.TasksType#getTask()
	 * @see #getTasksType()
	 * @generated
	 */
	EReference getTasksType_Task();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.TasksType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.TasksType#getAny()
	 * @see #getTasksType()
	 * @generated
	 */
	EAttribute getTasksType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.TasksType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.TasksType#getAnyAttribute()
	 * @see #getTasksType()
	 * @generated
	 */
	EAttribute getTasksType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Type</em>'.
	 * @see org.cyclonedx.schema.bom.TaskType
	 * @generated
	 */
	EClass getTaskType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.TaskType#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see org.cyclonedx.schema.bom.TaskType#getUid()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Uid();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.TaskType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.TaskType#getName()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.TaskType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.TaskType#getDescription()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.TaskType#getResourceReferences <em>Resource References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource References</em>'.
	 * @see org.cyclonedx.schema.bom.TaskType#getResourceReferences()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_ResourceReferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.TaskType#getTaskTypes <em>Task Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Types</em>'.
	 * @see org.cyclonedx.schema.bom.TaskType#getTaskTypes()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_TaskTypes();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.TaskType#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see org.cyclonedx.schema.bom.TaskType#getTrigger()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_Trigger();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.TaskType#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Steps</em>'.
	 * @see org.cyclonedx.schema.bom.TaskType#getSteps()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_Steps();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.TaskType#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputs</em>'.
	 * @see org.cyclonedx.schema.bom.TaskType#getInputs()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.TaskType#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outputs</em>'.
	 * @see org.cyclonedx.schema.bom.TaskType#getOutputs()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_Outputs();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.TaskType#getTimeStart <em>Time Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Start</em>'.
	 * @see org.cyclonedx.schema.bom.TaskType#getTimeStart()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_TimeStart();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.TaskType#getTimeEnd <em>Time End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time End</em>'.
	 * @see org.cyclonedx.schema.bom.TaskType#getTimeEnd()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_TimeEnd();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.TaskType#getWorkspaces <em>Workspaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Workspaces</em>'.
	 * @see org.cyclonedx.schema.bom.TaskType#getWorkspaces()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_Workspaces();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.TaskType#getRuntimeTopology <em>Runtime Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runtime Topology</em>'.
	 * @see org.cyclonedx.schema.bom.TaskType#getRuntimeTopology()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_RuntimeTopology();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.TaskType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.TaskType#getProperties()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_Properties();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.TaskType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.TaskType#getAny()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.TaskType#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.TaskType#getBomRef()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_BomRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.TaskType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.TaskType#getAnyAttribute()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.TaskTypesType <em>Task Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Types Type</em>'.
	 * @see org.cyclonedx.schema.bom.TaskTypesType
	 * @generated
	 */
	EClass getTaskTypesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.TaskTypesType#getTaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Task Type</em>'.
	 * @see org.cyclonedx.schema.bom.TaskTypesType#getTaskType()
	 * @see #getTaskTypesType()
	 * @generated
	 */
	EAttribute getTaskTypesType_TaskType();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.TaskTypesType1 <em>Task Types Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Types Type1</em>'.
	 * @see org.cyclonedx.schema.bom.TaskTypesType1
	 * @generated
	 */
	EClass getTaskTypesType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.TaskTypesType1#getTaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Task Type</em>'.
	 * @see org.cyclonedx.schema.bom.TaskTypesType1#getTaskType()
	 * @see #getTaskTypesType1()
	 * @generated
	 */
	EAttribute getTaskTypesType1_TaskType();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.TechnicalLimitationsType <em>Technical Limitations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technical Limitations Type</em>'.
	 * @see org.cyclonedx.schema.bom.TechnicalLimitationsType
	 * @generated
	 */
	EClass getTechnicalLimitationsType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.TechnicalLimitationsType#getTechnicalLimitation <em>Technical Limitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technical Limitation</em>'.
	 * @see org.cyclonedx.schema.bom.TechnicalLimitationsType#getTechnicalLimitation()
	 * @see #getTechnicalLimitationsType()
	 * @generated
	 */
	EAttribute getTechnicalLimitationsType_TechnicalLimitation();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ToolsType <em>Tools Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tools Type</em>'.
	 * @see org.cyclonedx.schema.bom.ToolsType
	 * @generated
	 */
	EClass getToolsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ToolsType#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tool</em>'.
	 * @see org.cyclonedx.schema.bom.ToolsType#getTool()
	 * @see #getToolsType()
	 * @generated
	 */
	EReference getToolsType_Tool();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ToolsType1 <em>Tools Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tools Type1</em>'.
	 * @see org.cyclonedx.schema.bom.ToolsType1
	 * @generated
	 */
	EClass getToolsType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ToolsType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.ToolsType1#getGroup()
	 * @see #getToolsType1()
	 * @generated
	 */
	EAttribute getToolsType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ToolsType1#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tool</em>'.
	 * @see org.cyclonedx.schema.bom.ToolsType1#getTool()
	 * @see #getToolsType1()
	 * @generated
	 */
	EReference getToolsType1_Tool();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ToolsType1#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see org.cyclonedx.schema.bom.ToolsType1#getComponents()
	 * @see #getToolsType1()
	 * @generated
	 */
	EReference getToolsType1_Components();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ToolsType1#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Services</em>'.
	 * @see org.cyclonedx.schema.bom.ToolsType1#getServices()
	 * @see #getToolsType1()
	 * @generated
	 */
	EReference getToolsType1_Services();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ToolsType2 <em>Tools Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tools Type2</em>'.
	 * @see org.cyclonedx.schema.bom.ToolsType2
	 * @generated
	 */
	EClass getToolsType2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ToolsType2#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tool</em>'.
	 * @see org.cyclonedx.schema.bom.ToolsType2#getTool()
	 * @see #getToolsType2()
	 * @generated
	 */
	EReference getToolsType2_Tool();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ToolsType3 <em>Tools Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tools Type3</em>'.
	 * @see org.cyclonedx.schema.bom.ToolsType3
	 * @generated
	 */
	EClass getToolsType3();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ToolsType3#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.ToolsType3#getGroup()
	 * @see #getToolsType3()
	 * @generated
	 */
	EAttribute getToolsType3_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.ToolsType3#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tool</em>'.
	 * @see org.cyclonedx.schema.bom.ToolsType3#getTool()
	 * @see #getToolsType3()
	 * @generated
	 */
	EReference getToolsType3_Tool();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ToolsType3#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see org.cyclonedx.schema.bom.ToolsType3#getComponents()
	 * @see #getToolsType3()
	 * @generated
	 */
	EReference getToolsType3_Components();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ToolsType3#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Services</em>'.
	 * @see org.cyclonedx.schema.bom.ToolsType3#getServices()
	 * @see #getToolsType3()
	 * @generated
	 */
	EReference getToolsType3_Services();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.ToolType <em>Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Type</em>'.
	 * @see org.cyclonedx.schema.bom.ToolType
	 * @generated
	 */
	EClass getToolType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ToolType#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.cyclonedx.schema.bom.ToolType#getVendor()
	 * @see #getToolType()
	 * @generated
	 */
	EAttribute getToolType_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ToolType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.ToolType#getName()
	 * @see #getToolType()
	 * @generated
	 */
	EAttribute getToolType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.ToolType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.cyclonedx.schema.bom.ToolType#getVersion()
	 * @see #getToolType()
	 * @generated
	 */
	EAttribute getToolType_Version();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ToolType#getHashes <em>Hashes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hashes</em>'.
	 * @see org.cyclonedx.schema.bom.ToolType#getHashes()
	 * @see #getToolType()
	 * @generated
	 */
	EReference getToolType_Hashes();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.ToolType#getExternalReferences <em>External References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External References</em>'.
	 * @see org.cyclonedx.schema.bom.ToolType#getExternalReferences()
	 * @see #getToolType()
	 * @generated
	 */
	EReference getToolType_ExternalReferences();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ToolType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.ToolType#getAny()
	 * @see #getToolType()
	 * @generated
	 */
	EAttribute getToolType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.ToolType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.ToolType#getAnyAttribute()
	 * @see #getToolType()
	 * @generated
	 */
	EAttribute getToolType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.TriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Type</em>'.
	 * @see org.cyclonedx.schema.bom.TriggerType
	 * @generated
	 */
	EClass getTriggerType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.TriggerType#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see org.cyclonedx.schema.bom.TriggerType#getUid()
	 * @see #getTriggerType()
	 * @generated
	 */
	EAttribute getTriggerType_Uid();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.TriggerType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.TriggerType#getName()
	 * @see #getTriggerType()
	 * @generated
	 */
	EAttribute getTriggerType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.TriggerType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.TriggerType#getDescription()
	 * @see #getTriggerType()
	 * @generated
	 */
	EAttribute getTriggerType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.TriggerType#getResourceReferences <em>Resource References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource References</em>'.
	 * @see org.cyclonedx.schema.bom.TriggerType#getResourceReferences()
	 * @see #getTriggerType()
	 * @generated
	 */
	EReference getTriggerType_ResourceReferences();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.TriggerType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.cyclonedx.schema.bom.TriggerType#getType()
	 * @see #getTriggerType()
	 * @generated
	 */
	EAttribute getTriggerType_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.TriggerType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see org.cyclonedx.schema.bom.TriggerType#getEvent()
	 * @see #getTriggerType()
	 * @generated
	 */
	EReference getTriggerType_Event();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.TriggerType#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditions</em>'.
	 * @see org.cyclonedx.schema.bom.TriggerType#getConditions()
	 * @see #getTriggerType()
	 * @generated
	 */
	EReference getTriggerType_Conditions();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.TriggerType#getTimeActivated <em>Time Activated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Activated</em>'.
	 * @see org.cyclonedx.schema.bom.TriggerType#getTimeActivated()
	 * @see #getTriggerType()
	 * @generated
	 */
	EAttribute getTriggerType_TimeActivated();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.TriggerType#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputs</em>'.
	 * @see org.cyclonedx.schema.bom.TriggerType#getInputs()
	 * @see #getTriggerType()
	 * @generated
	 */
	EReference getTriggerType_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.TriggerType#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outputs</em>'.
	 * @see org.cyclonedx.schema.bom.TriggerType#getOutputs()
	 * @see #getTriggerType()
	 * @generated
	 */
	EReference getTriggerType_Outputs();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.TriggerType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.TriggerType#getProperties()
	 * @see #getTriggerType()
	 * @generated
	 */
	EReference getTriggerType_Properties();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.TriggerType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.TriggerType#getAny()
	 * @see #getTriggerType()
	 * @generated
	 */
	EAttribute getTriggerType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.TriggerType#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.TriggerType#getBomRef()
	 * @see #getTriggerType()
	 * @generated
	 */
	EAttribute getTriggerType_BomRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.TriggerType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.TriggerType#getAnyAttribute()
	 * @see #getTriggerType()
	 * @generated
	 */
	EAttribute getTriggerType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.UseCasesType <em>Use Cases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Cases Type</em>'.
	 * @see org.cyclonedx.schema.bom.UseCasesType
	 * @generated
	 */
	EClass getUseCasesType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.UseCasesType#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Case</em>'.
	 * @see org.cyclonedx.schema.bom.UseCasesType#getUseCase()
	 * @see #getUseCasesType()
	 * @generated
	 */
	EAttribute getUseCasesType_UseCase();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.UsersType <em>Users Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Users Type</em>'.
	 * @see org.cyclonedx.schema.bom.UsersType
	 * @generated
	 */
	EClass getUsersType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.UsersType#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.cyclonedx.schema.bom.UsersType#getUser()
	 * @see #getUsersType()
	 * @generated
	 */
	EAttribute getUsersType_User();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.VersionsType <em>Versions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versions Type</em>'.
	 * @see org.cyclonedx.schema.bom.VersionsType
	 * @generated
	 */
	EClass getVersionsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.VersionsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.VersionsType#getGroup()
	 * @see #getVersionsType()
	 * @generated
	 */
	EAttribute getVersionsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.VersionsType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Version</em>'.
	 * @see org.cyclonedx.schema.bom.VersionsType#getVersion()
	 * @see #getVersionsType()
	 * @generated
	 */
	EReference getVersionsType_Version();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.VersionType <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Type</em>'.
	 * @see org.cyclonedx.schema.bom.VersionType
	 * @generated
	 */
	EClass getVersionType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.VersionType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.cyclonedx.schema.bom.VersionType#getVersion()
	 * @see #getVersionType()
	 * @generated
	 */
	EAttribute getVersionType_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.VersionType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see org.cyclonedx.schema.bom.VersionType#getRange()
	 * @see #getVersionType()
	 * @generated
	 */
	EAttribute getVersionType_Range();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.VersionType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.cyclonedx.schema.bom.VersionType#getStatus()
	 * @see #getVersionType()
	 * @generated
	 */
	EAttribute getVersionType_Status();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.VolumeType <em>Volume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume Type</em>'.
	 * @see org.cyclonedx.schema.bom.VolumeType
	 * @generated
	 */
	EClass getVolumeType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.VolumeType#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see org.cyclonedx.schema.bom.VolumeType#getUid()
	 * @see #getVolumeType()
	 * @generated
	 */
	EAttribute getVolumeType_Uid();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.VolumeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.VolumeType#getName()
	 * @see #getVolumeType()
	 * @generated
	 */
	EAttribute getVolumeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.VolumeType#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.cyclonedx.schema.bom.VolumeType#getMode()
	 * @see #getVolumeType()
	 * @generated
	 */
	EAttribute getVolumeType_Mode();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.VolumeType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.cyclonedx.schema.bom.VolumeType#getPath()
	 * @see #getVolumeType()
	 * @generated
	 */
	EAttribute getVolumeType_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.VolumeType#getSizeAllocated <em>Size Allocated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Allocated</em>'.
	 * @see org.cyclonedx.schema.bom.VolumeType#getSizeAllocated()
	 * @see #getVolumeType()
	 * @generated
	 */
	EAttribute getVolumeType_SizeAllocated();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.VolumeType#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see org.cyclonedx.schema.bom.VolumeType#isPersistent()
	 * @see #getVolumeType()
	 * @generated
	 */
	EAttribute getVolumeType_Persistent();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.VolumeType#isRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote</em>'.
	 * @see org.cyclonedx.schema.bom.VolumeType#isRemote()
	 * @see #getVolumeType()
	 * @generated
	 */
	EAttribute getVolumeType_Remote();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.VolumeType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.VolumeType#getProperties()
	 * @see #getVolumeType()
	 * @generated
	 */
	EReference getVolumeType_Properties();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.VulnerabilitiesType <em>Vulnerabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vulnerabilities Type</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilitiesType
	 * @generated
	 */
	EClass getVulnerabilitiesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.VulnerabilitiesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilitiesType#getGroup()
	 * @see #getVulnerabilitiesType()
	 * @generated
	 */
	EAttribute getVulnerabilitiesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.VulnerabilitiesType#getVulnerability <em>Vulnerability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vulnerability</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilitiesType#getVulnerability()
	 * @see #getVulnerabilitiesType()
	 * @generated
	 */
	EReference getVulnerabilitiesType_Vulnerability();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.VulnerabilitiesType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilitiesType#getAny()
	 * @see #getVulnerabilitiesType()
	 * @generated
	 */
	EAttribute getVulnerabilitiesType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.VulnerabilitiesType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilitiesType#getAnyAttribute()
	 * @see #getVulnerabilitiesType()
	 * @generated
	 */
	EAttribute getVulnerabilitiesType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.VulnerabilitiesType1 <em>Vulnerabilities Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vulnerabilities Type1</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilitiesType1
	 * @generated
	 */
	EClass getVulnerabilitiesType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.VulnerabilitiesType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilitiesType1#getGroup()
	 * @see #getVulnerabilitiesType1()
	 * @generated
	 */
	EAttribute getVulnerabilitiesType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.VulnerabilitiesType1#getVulnerability <em>Vulnerability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vulnerability</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilitiesType1#getVulnerability()
	 * @see #getVulnerabilitiesType1()
	 * @generated
	 */
	EReference getVulnerabilitiesType1_Vulnerability();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.VulnerabilitiesType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilitiesType1#getAny()
	 * @see #getVulnerabilitiesType1()
	 * @generated
	 */
	EAttribute getVulnerabilitiesType1_Any();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.VulnerabilitySourceType <em>Vulnerability Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vulnerability Source Type</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilitySourceType
	 * @generated
	 */
	EClass getVulnerabilitySourceType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.VulnerabilitySourceType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilitySourceType#getGroup()
	 * @see #getVulnerabilitySourceType()
	 * @generated
	 */
	EAttribute getVulnerabilitySourceType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.VulnerabilitySourceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilitySourceType#getName()
	 * @see #getVulnerabilitySourceType()
	 * @generated
	 */
	EAttribute getVulnerabilitySourceType_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.VulnerabilitySourceType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Url</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilitySourceType#getUrl()
	 * @see #getVulnerabilitySourceType()
	 * @generated
	 */
	EAttribute getVulnerabilitySourceType_Url();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.VulnerabilityType <em>Vulnerability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vulnerability Type</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType
	 * @generated
	 */
	EClass getVulnerabilityType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.VulnerabilityType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType#getId()
	 * @see #getVulnerabilityType()
	 * @generated
	 */
	EAttribute getVulnerabilityType_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.VulnerabilityType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType#getSource()
	 * @see #getVulnerabilityType()
	 * @generated
	 */
	EReference getVulnerabilityType_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.VulnerabilityType#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>References</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType#getReferences()
	 * @see #getVulnerabilityType()
	 * @generated
	 */
	EReference getVulnerabilityType_References();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.VulnerabilityType#getRatings <em>Ratings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ratings</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType#getRatings()
	 * @see #getVulnerabilityType()
	 * @generated
	 */
	EReference getVulnerabilityType_Ratings();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.VulnerabilityType#getCwes <em>Cwes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cwes</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType#getCwes()
	 * @see #getVulnerabilityType()
	 * @generated
	 */
	EReference getVulnerabilityType_Cwes();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.VulnerabilityType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType#getDescription()
	 * @see #getVulnerabilityType()
	 * @generated
	 */
	EAttribute getVulnerabilityType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.VulnerabilityType#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detail</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType#getDetail()
	 * @see #getVulnerabilityType()
	 * @generated
	 */
	EAttribute getVulnerabilityType_Detail();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.VulnerabilityType#getRecommendation <em>Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recommendation</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType#getRecommendation()
	 * @see #getVulnerabilityType()
	 * @generated
	 */
	EAttribute getVulnerabilityType_Recommendation();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.VulnerabilityType#getWorkaround <em>Workaround</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workaround</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType#getWorkaround()
	 * @see #getVulnerabilityType()
	 * @generated
	 */
	EAttribute getVulnerabilityType_Workaround();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.VulnerabilityType#getProofOfConcept <em>Proof Of Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Proof Of Concept</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType#getProofOfConcept()
	 * @see #getVulnerabilityType()
	 * @generated
	 */
	EReference getVulnerabilityType_ProofOfConcept();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.VulnerabilityType#getAdvisories <em>Advisories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Advisories</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType#getAdvisories()
	 * @see #getVulnerabilityType()
	 * @generated
	 */
	EReference getVulnerabilityType_Advisories();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.VulnerabilityType#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType#getCreated()
	 * @see #getVulnerabilityType()
	 * @generated
	 */
	EAttribute getVulnerabilityType_Created();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.VulnerabilityType#getPublished <em>Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Published</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType#getPublished()
	 * @see #getVulnerabilityType()
	 * @generated
	 */
	EAttribute getVulnerabilityType_Published();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.VulnerabilityType#getUpdated <em>Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType#getUpdated()
	 * @see #getVulnerabilityType()
	 * @generated
	 */
	EAttribute getVulnerabilityType_Updated();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.VulnerabilityType#getRejected <em>Rejected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rejected</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType#getRejected()
	 * @see #getVulnerabilityType()
	 * @generated
	 */
	EAttribute getVulnerabilityType_Rejected();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.VulnerabilityType#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Credits</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType#getCredits()
	 * @see #getVulnerabilityType()
	 * @generated
	 */
	EReference getVulnerabilityType_Credits();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.VulnerabilityType#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tools</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType#getTools()
	 * @see #getVulnerabilityType()
	 * @generated
	 */
	EReference getVulnerabilityType_Tools();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.VulnerabilityType#getAnalysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Analysis</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType#getAnalysis()
	 * @see #getVulnerabilityType()
	 * @generated
	 */
	EReference getVulnerabilityType_Analysis();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.VulnerabilityType#getAffects <em>Affects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Affects</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType#getAffects()
	 * @see #getVulnerabilityType()
	 * @generated
	 */
	EReference getVulnerabilityType_Affects();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.VulnerabilityType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType#getProperties()
	 * @see #getVulnerabilityType()
	 * @generated
	 */
	EReference getVulnerabilityType_Properties();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.VulnerabilityType#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType#getBomRef()
	 * @see #getVulnerabilityType()
	 * @generated
	 */
	EAttribute getVulnerabilityType_BomRef();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.WorkflowsType <em>Workflows Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflows Type</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowsType
	 * @generated
	 */
	EClass getWorkflowsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.WorkflowsType#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workflow</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowsType#getWorkflow()
	 * @see #getWorkflowsType()
	 * @generated
	 */
	EReference getWorkflowsType_Workflow();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.WorkflowsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowsType#getAny()
	 * @see #getWorkflowsType()
	 * @generated
	 */
	EAttribute getWorkflowsType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.WorkflowsType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowsType#getAnyAttribute()
	 * @see #getWorkflowsType()
	 * @generated
	 */
	EAttribute getWorkflowsType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.WorkflowType <em>Workflow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Type</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowType
	 * @generated
	 */
	EClass getWorkflowType();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.WorkflowType#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowType#getUid()
	 * @see #getWorkflowType()
	 * @generated
	 */
	EAttribute getWorkflowType_Uid();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.WorkflowType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowType#getName()
	 * @see #getWorkflowType()
	 * @generated
	 */
	EAttribute getWorkflowType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.WorkflowType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowType#getDescription()
	 * @see #getWorkflowType()
	 * @generated
	 */
	EAttribute getWorkflowType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.WorkflowType#getResourceReferences <em>Resource References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource References</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowType#getResourceReferences()
	 * @see #getWorkflowType()
	 * @generated
	 */
	EReference getWorkflowType_ResourceReferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.WorkflowType#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tasks</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowType#getTasks()
	 * @see #getWorkflowType()
	 * @generated
	 */
	EReference getWorkflowType_Tasks();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.WorkflowType#getTaskDependencies <em>Task Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Dependencies</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowType#getTaskDependencies()
	 * @see #getWorkflowType()
	 * @generated
	 */
	EReference getWorkflowType_TaskDependencies();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.WorkflowType#getTaskTypes <em>Task Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Types</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowType#getTaskTypes()
	 * @see #getWorkflowType()
	 * @generated
	 */
	EReference getWorkflowType_TaskTypes();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.WorkflowType#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowType#getTrigger()
	 * @see #getWorkflowType()
	 * @generated
	 */
	EReference getWorkflowType_Trigger();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.WorkflowType#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Steps</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowType#getSteps()
	 * @see #getWorkflowType()
	 * @generated
	 */
	EReference getWorkflowType_Steps();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.WorkflowType#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputs</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowType#getInputs()
	 * @see #getWorkflowType()
	 * @generated
	 */
	EReference getWorkflowType_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.WorkflowType#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outputs</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowType#getOutputs()
	 * @see #getWorkflowType()
	 * @generated
	 */
	EReference getWorkflowType_Outputs();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.WorkflowType#getTimeStart <em>Time Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Start</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowType#getTimeStart()
	 * @see #getWorkflowType()
	 * @generated
	 */
	EAttribute getWorkflowType_TimeStart();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.WorkflowType#getTimeEnd <em>Time End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time End</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowType#getTimeEnd()
	 * @see #getWorkflowType()
	 * @generated
	 */
	EAttribute getWorkflowType_TimeEnd();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.WorkflowType#getWorkspaces <em>Workspaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Workspaces</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowType#getWorkspaces()
	 * @see #getWorkflowType()
	 * @generated
	 */
	EReference getWorkflowType_Workspaces();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.WorkflowType#getRuntimeTopology <em>Runtime Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runtime Topology</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowType#getRuntimeTopology()
	 * @see #getWorkflowType()
	 * @generated
	 */
	EReference getWorkflowType_RuntimeTopology();

	/**
	 * Returns the meta object for the containment reference '{@link org.cyclonedx.schema.bom.WorkflowType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowType#getProperties()
	 * @see #getWorkflowType()
	 * @generated
	 */
	EReference getWorkflowType_Properties();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.WorkflowType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowType#getAny()
	 * @see #getWorkflowType()
	 * @generated
	 */
	EAttribute getWorkflowType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.WorkflowType#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowType#getBomRef()
	 * @see #getWorkflowType()
	 * @generated
	 */
	EAttribute getWorkflowType_BomRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.WorkflowType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.WorkflowType#getAnyAttribute()
	 * @see #getWorkflowType()
	 * @generated
	 */
	EAttribute getWorkflowType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.WorkspacesType <em>Workspaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workspaces Type</em>'.
	 * @see org.cyclonedx.schema.bom.WorkspacesType
	 * @generated
	 */
	EClass getWorkspacesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.WorkspacesType#getWorkspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workspace</em>'.
	 * @see org.cyclonedx.schema.bom.WorkspacesType#getWorkspace()
	 * @see #getWorkspacesType()
	 * @generated
	 */
	EReference getWorkspacesType_Workspace();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.WorkspacesType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.WorkspacesType#getAny()
	 * @see #getWorkspacesType()
	 * @generated
	 */
	EAttribute getWorkspacesType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.WorkspacesType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.WorkspacesType#getAnyAttribute()
	 * @see #getWorkspacesType()
	 * @generated
	 */
	EAttribute getWorkspacesType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.cyclonedx.schema.bom.WorkspaceType <em>Workspace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workspace Type</em>'.
	 * @see org.cyclonedx.schema.bom.WorkspaceType
	 * @generated
	 */
	EClass getWorkspaceType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.WorkspaceType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.cyclonedx.schema.bom.WorkspaceType#getGroup()
	 * @see #getWorkspaceType()
	 * @generated
	 */
	EAttribute getWorkspaceType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.WorkspaceType#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Uid</em>'.
	 * @see org.cyclonedx.schema.bom.WorkspaceType#getUid()
	 * @see #getWorkspaceType()
	 * @generated
	 */
	EAttribute getWorkspaceType_Uid();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.WorkspaceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Name</em>'.
	 * @see org.cyclonedx.schema.bom.WorkspaceType#getName()
	 * @see #getWorkspaceType()
	 * @generated
	 */
	EAttribute getWorkspaceType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.WorkspaceType#getAliases <em>Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aliases</em>'.
	 * @see org.cyclonedx.schema.bom.WorkspaceType#getAliases()
	 * @see #getWorkspaceType()
	 * @generated
	 */
	EReference getWorkspaceType_Aliases();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.WorkspaceType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Description</em>'.
	 * @see org.cyclonedx.schema.bom.WorkspaceType#getDescription()
	 * @see #getWorkspaceType()
	 * @generated
	 */
	EAttribute getWorkspaceType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.WorkspaceType#getResourceReferences <em>Resource References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource References</em>'.
	 * @see org.cyclonedx.schema.bom.WorkspaceType#getResourceReferences()
	 * @see #getWorkspaceType()
	 * @generated
	 */
	EReference getWorkspaceType_ResourceReferences();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.WorkspaceType#getAccessMode <em>Access Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Access Mode</em>'.
	 * @see org.cyclonedx.schema.bom.WorkspaceType#getAccessMode()
	 * @see #getWorkspaceType()
	 * @generated
	 */
	EAttribute getWorkspaceType_AccessMode();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.WorkspaceType#getMountPath <em>Mount Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mount Path</em>'.
	 * @see org.cyclonedx.schema.bom.WorkspaceType#getMountPath()
	 * @see #getWorkspaceType()
	 * @generated
	 */
	EAttribute getWorkspaceType_MountPath();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.WorkspaceType#getManagedDataType <em>Managed Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Managed Data Type</em>'.
	 * @see org.cyclonedx.schema.bom.WorkspaceType#getManagedDataType()
	 * @see #getWorkspaceType()
	 * @generated
	 */
	EAttribute getWorkspaceType_ManagedDataType();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.WorkspaceType#getVolumeRequest <em>Volume Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Volume Request</em>'.
	 * @see org.cyclonedx.schema.bom.WorkspaceType#getVolumeRequest()
	 * @see #getWorkspaceType()
	 * @generated
	 */
	EAttribute getWorkspaceType_VolumeRequest();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.WorkspaceType#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volume</em>'.
	 * @see org.cyclonedx.schema.bom.WorkspaceType#getVolume()
	 * @see #getWorkspaceType()
	 * @generated
	 */
	EReference getWorkspaceType_Volume();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cyclonedx.schema.bom.WorkspaceType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.cyclonedx.schema.bom.WorkspaceType#getProperties()
	 * @see #getWorkspaceType()
	 * @generated
	 */
	EReference getWorkspaceType_Properties();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.WorkspaceType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.cyclonedx.schema.bom.WorkspaceType#getAny()
	 * @see #getWorkspaceType()
	 * @generated
	 */
	EAttribute getWorkspaceType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.cyclonedx.schema.bom.WorkspaceType#getBomRef <em>Bom Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bom Ref</em>'.
	 * @see org.cyclonedx.schema.bom.WorkspaceType#getBomRef()
	 * @see #getWorkspaceType()
	 * @generated
	 */
	EAttribute getWorkspaceType_BomRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.cyclonedx.schema.bom.WorkspaceType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.cyclonedx.schema.bom.WorkspaceType#getAnyAttribute()
	 * @see #getWorkspaceType()
	 * @generated
	 */
	EAttribute getWorkspaceType_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.AccessModeEnum <em>Access Mode Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Mode Enum</em>'.
	 * @see org.cyclonedx.schema.bom.AccessModeEnum
	 * @generated
	 */
	EEnum getAccessModeEnum();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.ActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activity Type</em>'.
	 * @see org.cyclonedx.schema.bom.ActivityType
	 * @generated
	 */
	EEnum getActivityType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.AggregateType <em>Aggregate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregate Type</em>'.
	 * @see org.cyclonedx.schema.bom.AggregateType
	 * @generated
	 */
	EEnum getAggregateType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.AssetTypeType <em>Asset Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asset Type Type</em>'.
	 * @see org.cyclonedx.schema.bom.AssetTypeType
	 * @generated
	 */
	EEnum getAssetTypeType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.CertificationLevelType <em>Certification Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Certification Level Type</em>'.
	 * @see org.cyclonedx.schema.bom.CertificationLevelType
	 * @generated
	 */
	EEnum getCertificationLevelType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Classification</em>'.
	 * @see org.cyclonedx.schema.bom.Classification
	 * @generated
	 */
	EEnum getClassification();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.ComponentDataTypeEnumeration <em>Component Data Type Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Data Type Enumeration</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentDataTypeEnumeration
	 * @generated
	 */
	EEnum getComponentDataTypeEnumeration();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.CryptoFunctionType <em>Crypto Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Crypto Function Type</em>'.
	 * @see org.cyclonedx.schema.bom.CryptoFunctionType
	 * @generated
	 */
	EEnum getCryptoFunctionType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.DataFlowType1 <em>Data Flow Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Flow Type1</em>'.
	 * @see org.cyclonedx.schema.bom.DataFlowType1
	 * @generated
	 */
	EEnum getDataFlowType1();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.Encoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encoding</em>'.
	 * @see org.cyclonedx.schema.bom.Encoding
	 * @generated
	 */
	EEnum getEncoding();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.EnergySourceType <em>Energy Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Energy Source Type</em>'.
	 * @see org.cyclonedx.schema.bom.EnergySourceType
	 * @generated
	 */
	EEnum getEnergySourceType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.EvidenceTechnique <em>Evidence Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Evidence Technique</em>'.
	 * @see org.cyclonedx.schema.bom.EvidenceTechnique
	 * @generated
	 */
	EEnum getEvidenceTechnique();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.ExecutionEnvironmentType <em>Execution Environment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Execution Environment Type</em>'.
	 * @see org.cyclonedx.schema.bom.ExecutionEnvironmentType
	 * @generated
	 */
	EEnum getExecutionEnvironmentType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.ExternalReferenceType <em>External Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>External Reference Type</em>'.
	 * @see org.cyclonedx.schema.bom.ExternalReferenceType
	 * @generated
	 */
	EEnum getExternalReferenceType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.HashAlg <em>Hash Alg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hash Alg</em>'.
	 * @see org.cyclonedx.schema.bom.HashAlg
	 * @generated
	 */
	EEnum getHashAlg();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.IdentityFieldType <em>Identity Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Identity Field Type</em>'.
	 * @see org.cyclonedx.schema.bom.IdentityFieldType
	 * @generated
	 */
	EEnum getIdentityFieldType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.ImpactAnalysisAffectedStatusType <em>Impact Analysis Affected Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Impact Analysis Affected Status Type</em>'.
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisAffectedStatusType
	 * @generated
	 */
	EEnum getImpactAnalysisAffectedStatusType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.ImpactAnalysisJustificationType <em>Impact Analysis Justification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Impact Analysis Justification Type</em>'.
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisJustificationType
	 * @generated
	 */
	EEnum getImpactAnalysisJustificationType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.ImpactAnalysisResponsesType <em>Impact Analysis Responses Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Impact Analysis Responses Type</em>'.
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisResponsesType
	 * @generated
	 */
	EEnum getImpactAnalysisResponsesType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.ImpactAnalysisStateType <em>Impact Analysis State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Impact Analysis State Type</em>'.
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisStateType
	 * @generated
	 */
	EEnum getImpactAnalysisStateType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.ImplementationPlatformType <em>Implementation Platform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Implementation Platform Type</em>'.
	 * @see org.cyclonedx.schema.bom.ImplementationPlatformType
	 * @generated
	 */
	EEnum getImplementationPlatformType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.IssueClassification <em>Issue Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Classification</em>'.
	 * @see org.cyclonedx.schema.bom.IssueClassification
	 * @generated
	 */
	EEnum getIssueClassification();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.LicenseAcknowledgementEnumerationType <em>License Acknowledgement Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>License Acknowledgement Enumeration Type</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseAcknowledgementEnumerationType
	 * @generated
	 */
	EEnum getLicenseAcknowledgementEnumerationType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.LicenseTypeEnum <em>License Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>License Type Enum</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseTypeEnum
	 * @generated
	 */
	EEnum getLicenseTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.LifecyclePhaseType <em>Lifecycle Phase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lifecycle Phase Type</em>'.
	 * @see org.cyclonedx.schema.bom.LifecyclePhaseType
	 * @generated
	 */
	EEnum getLifecyclePhaseType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.MachineLearningApproachType <em>Machine Learning Approach Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Machine Learning Approach Type</em>'.
	 * @see org.cyclonedx.schema.bom.MachineLearningApproachType
	 * @generated
	 */
	EEnum getMachineLearningApproachType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.ModeType <em>Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode Type</em>'.
	 * @see org.cyclonedx.schema.bom.ModeType
	 * @generated
	 */
	EEnum getModeType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.OutputTypeEnum <em>Output Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Output Type Enum</em>'.
	 * @see org.cyclonedx.schema.bom.OutputTypeEnum
	 * @generated
	 */
	EEnum getOutputTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.PaddingType <em>Padding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Padding Type</em>'.
	 * @see org.cyclonedx.schema.bom.PaddingType
	 * @generated
	 */
	EEnum getPaddingType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.PatchClassification <em>Patch Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Patch Classification</em>'.
	 * @see org.cyclonedx.schema.bom.PatchClassification
	 * @generated
	 */
	EEnum getPatchClassification();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type</em>'.
	 * @see org.cyclonedx.schema.bom.PrimitiveType
	 * @generated
	 */
	EEnum getPrimitiveType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope</em>'.
	 * @see org.cyclonedx.schema.bom.Scope
	 * @generated
	 */
	EEnum getScope();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.ScoreSourceType <em>Score Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Score Source Type</em>'.
	 * @see org.cyclonedx.schema.bom.ScoreSourceType
	 * @generated
	 */
	EEnum getScoreSourceType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.SeverityType <em>Severity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity Type</em>'.
	 * @see org.cyclonedx.schema.bom.SeverityType
	 * @generated
	 */
	EEnum getSeverityType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.StateType <em>State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State Type</em>'.
	 * @see org.cyclonedx.schema.bom.StateType
	 * @generated
	 */
	EEnum getStateType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.TaskTypeEnum <em>Task Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Type Enum</em>'.
	 * @see org.cyclonedx.schema.bom.TaskTypeEnum
	 * @generated
	 */
	EEnum getTaskTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.TriggerTypeType <em>Trigger Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Type Type</em>'.
	 * @see org.cyclonedx.schema.bom.TriggerTypeType
	 * @generated
	 */
	EEnum getTriggerTypeType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type</em>'.
	 * @see org.cyclonedx.schema.bom.TypeType
	 * @generated
	 */
	EEnum getTypeType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.TypeType1 <em>Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type1</em>'.
	 * @see org.cyclonedx.schema.bom.TypeType1
	 * @generated
	 */
	EEnum getTypeType1();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Type</em>'.
	 * @see org.cyclonedx.schema.bom.UnitType
	 * @generated
	 */
	EEnum getUnitType();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.UnitType1 <em>Unit Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Type1</em>'.
	 * @see org.cyclonedx.schema.bom.UnitType1
	 * @generated
	 */
	EEnum getUnitType1();

	/**
	 * Returns the meta object for enum '{@link org.cyclonedx.schema.bom.VolumeModeEnum <em>Volume Mode Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Volume Mode Enum</em>'.
	 * @see org.cyclonedx.schema.bom.VolumeModeEnum
	 * @generated
	 */
	EEnum getVolumeModeEnum();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.AccessModeEnum <em>Access Mode Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Access Mode Enum Object</em>'.
	 * @see org.cyclonedx.schema.bom.AccessModeEnum
	 * @model instanceClass="org.cyclonedx.schema.bom.AccessModeEnum"
	 *        extendedMetaData="name='accessModeEnum:Object' baseType='accessModeEnum'"
	 * @generated
	 */
	EDataType getAccessModeEnumObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.ActivityType <em>Activity Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Activity Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.ActivityType
	 * @model instanceClass="org.cyclonedx.schema.bom.ActivityType"
	 *        extendedMetaData="name='activity_._type:Object' baseType='activity_._type'"
	 * @generated
	 */
	EDataType getActivityTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.AggregateType <em>Aggregate Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Aggregate Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.AggregateType
	 * @model instanceClass="org.cyclonedx.schema.bom.AggregateType"
	 *        extendedMetaData="name='aggregateType:Object' baseType='aggregateType'"
	 * @generated
	 */
	EDataType getAggregateTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.AssetTypeType <em>Asset Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Asset Type Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.AssetTypeType
	 * @model instanceClass="org.cyclonedx.schema.bom.AssetTypeType"
	 *        extendedMetaData="name='assetType_._type:Object' baseType='assetType_._type'"
	 * @generated
	 */
	EDataType getAssetTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bom Link Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                 Descriptor for another BOM document.
     *                 See https://cyclonedx.org/capabilities/bomlink/
     *             
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Bom Link Document Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='bomLinkDocumentType' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI' pattern='urn:cdx:[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}/[1-9][0-9]*'"
	 * @generated
	 */
	EDataType getBomLinkDocumentType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bom Link Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                 Descriptor for an element in another BOM document.
     *                 See https://cyclonedx.org/capabilities/bomlink/
     *             
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Bom Link Element Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='bomLinkElementType' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI' pattern='urn:cdx:[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}/[1-9][0-9]*#.+'"
	 * @generated
	 */
	EDataType getBomLinkElementType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bom Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bom Link Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='bomLinkType' memberTypes='bomLinkDocumentType bomLinkElementType'"
	 * @generated
	 */
	EDataType getBomLinkType();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.CertificationLevelType <em>Certification Level Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Certification Level Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.CertificationLevelType
	 * @model instanceClass="org.cyclonedx.schema.bom.CertificationLevelType"
	 *        extendedMetaData="name='certificationLevel_._type:Object' baseType='certificationLevel_._type'"
	 * @generated
	 */
	EDataType getCertificationLevelTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Classical Security Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Classical Security Level Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='classicalSecurityLevel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='0'"
	 * @generated
	 */
	EDataType getClassicalSecurityLevelType();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.Classification <em>Classification Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Classification Object</em>'.
	 * @see org.cyclonedx.schema.bom.Classification
	 * @model instanceClass="org.cyclonedx.schema.bom.Classification"
	 *        extendedMetaData="name='classification:Object' baseType='classification'"
	 * @generated
	 */
	EDataType getClassificationObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.ComponentDataTypeEnumeration <em>Component Data Type Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Component Data Type Enumeration Object</em>'.
	 * @see org.cyclonedx.schema.bom.ComponentDataTypeEnumeration
	 * @model instanceClass="org.cyclonedx.schema.bom.ComponentDataTypeEnumeration"
	 *        extendedMetaData="name='componentDataTypeEnumeration:Object' baseType='componentDataTypeEnumeration'"
	 * @generated
	 */
	EDataType getComponentDataTypeEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Cpe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                 Define the format for acceptable CPE URIs. Supports CPE 2.2 and CPE 2.3 formats.
     *                 Refer to https://nvd.nist.gov/products/cpe for official specification.
     *             
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Cpe</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='cpe' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='([c][pP][eE]:/[AHOaho]?(:[A-Za-z0-9\\._\\-~%25]*){0,6})|(cpe:2\\.3:[aho\\*\\-](:(((\\?*|\\*?)([a-zA-Z0-9\\-\\._]|(\\\\[\\\\\\*\\?!\"#$$%25&amp;\'\\(\\)\\+,/:;&lt;=&gt;@\\[\\]\\^`\\{\\|}~]))+(\\?*|\\*?))|[\\*\\-])){5}(:(([a-zA-Z]{2,3}(-([a-zA-Z]{2}|[0-9]{3}))?)|[\\*\\-]))(:(((\\?*|\\*?)([a-zA-Z0-9\\-\\._]|(\\\\[\\\\\\*\\?!\"#$$%25&amp;\'\\(\\)\\+,/:;&lt;=&gt;@\\[\\]\\^`\\{\\|}~]))+(\\?*|\\*?))|[\\*\\-])){4})'"
	 * @generated
	 */
	EDataType getCpe();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.CryptoFunctionType <em>Crypto Function Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Crypto Function Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.CryptoFunctionType
	 * @model instanceClass="org.cyclonedx.schema.bom.CryptoFunctionType"
	 *        extendedMetaData="name='cryptoFunction_._type:Object' baseType='cryptoFunction_._type'"
	 * @generated
	 */
	EDataType getCryptoFunctionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.DataFlowType1 <em>Data Flow Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Flow Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.DataFlowType1
	 * @model instanceClass="org.cyclonedx.schema.bom.DataFlowType1"
	 *        extendedMetaData="name='dataFlowType:Object' baseType='dataFlowType'"
	 * @generated
	 */
	EDataType getDataFlowTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Decimal Percent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Decimal Percent Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='decimalPercentType' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0' maxInclusive='1'"
	 * @generated
	 */
	EDataType getDecimalPercentType();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.Encoding <em>Encoding Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Encoding Object</em>'.
	 * @see org.cyclonedx.schema.bom.Encoding
	 * @model instanceClass="org.cyclonedx.schema.bom.Encoding"
	 *        extendedMetaData="name='encoding:Object' baseType='encoding'"
	 * @generated
	 */
	EDataType getEncodingObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.EnergySourceType <em>Energy Source Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Energy Source Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.EnergySourceType
	 * @model instanceClass="org.cyclonedx.schema.bom.EnergySourceType"
	 *        extendedMetaData="name='energySource_._type:Object' baseType='energySource_._type'"
	 * @generated
	 */
	EDataType getEnergySourceTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.EvidenceTechnique <em>Evidence Technique Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Evidence Technique Object</em>'.
	 * @see org.cyclonedx.schema.bom.EvidenceTechnique
	 * @model instanceClass="org.cyclonedx.schema.bom.EvidenceTechnique"
	 *        extendedMetaData="name='evidenceTechnique:Object' baseType='evidenceTechnique'"
	 * @generated
	 */
	EDataType getEvidenceTechniqueObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.ExecutionEnvironmentType <em>Execution Environment Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Execution Environment Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.ExecutionEnvironmentType
	 * @model instanceClass="org.cyclonedx.schema.bom.ExecutionEnvironmentType"
	 *        extendedMetaData="name='executionEnvironment_._type:Object' baseType='executionEnvironment_._type'"
	 * @generated
	 */
	EDataType getExecutionEnvironmentTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.ExternalReferenceType <em>External Reference Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>External Reference Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.ExternalReferenceType
	 * @model instanceClass="org.cyclonedx.schema.bom.ExternalReferenceType"
	 *        extendedMetaData="name='externalReferenceType:Object' baseType='externalReferenceType'"
	 * @generated
	 */
	EDataType getExternalReferenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.HashAlg <em>Hash Alg Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hash Alg Object</em>'.
	 * @see org.cyclonedx.schema.bom.HashAlg
	 * @model instanceClass="org.cyclonedx.schema.bom.HashAlg"
	 *        extendedMetaData="name='hashAlg:Object' baseType='hashAlg'"
	 * @generated
	 */
	EDataType getHashAlgObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hash Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hash Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='hashValue' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='([a-fA-F0-9]{32})|([a-fA-F0-9]{40})|([a-fA-F0-9]{64})|([a-fA-F0-9]{96})|([a-fA-F0-9]{128})'"
	 * @generated
	 */
	EDataType getHashValue();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.IdentityFieldType <em>Identity Field Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Identity Field Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.IdentityFieldType
	 * @model instanceClass="org.cyclonedx.schema.bom.IdentityFieldType"
	 *        extendedMetaData="name='identityFieldType:Object' baseType='identityFieldType'"
	 * @generated
	 */
	EDataType getIdentityFieldTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.ImpactAnalysisAffectedStatusType <em>Impact Analysis Affected Status Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Impact Analysis Affected Status Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisAffectedStatusType
	 * @model instanceClass="org.cyclonedx.schema.bom.ImpactAnalysisAffectedStatusType"
	 *        extendedMetaData="name='impactAnalysisAffectedStatusType:Object' baseType='impactAnalysisAffectedStatusType'"
	 * @generated
	 */
	EDataType getImpactAnalysisAffectedStatusTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.ImpactAnalysisJustificationType <em>Impact Analysis Justification Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Impact Analysis Justification Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisJustificationType
	 * @model instanceClass="org.cyclonedx.schema.bom.ImpactAnalysisJustificationType"
	 *        extendedMetaData="name='impactAnalysisJustificationType:Object' baseType='impactAnalysisJustificationType'"
	 * @generated
	 */
	EDataType getImpactAnalysisJustificationTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.ImpactAnalysisResponsesType <em>Impact Analysis Responses Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Impact Analysis Responses Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisResponsesType
	 * @model instanceClass="org.cyclonedx.schema.bom.ImpactAnalysisResponsesType"
	 *        extendedMetaData="name='impactAnalysisResponsesType:Object' baseType='impactAnalysisResponsesType'"
	 * @generated
	 */
	EDataType getImpactAnalysisResponsesTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.ImpactAnalysisStateType <em>Impact Analysis State Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Impact Analysis State Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisStateType
	 * @model instanceClass="org.cyclonedx.schema.bom.ImpactAnalysisStateType"
	 *        extendedMetaData="name='impactAnalysisStateType:Object' baseType='impactAnalysisStateType'"
	 * @generated
	 */
	EDataType getImpactAnalysisStateTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.ImplementationPlatformType <em>Implementation Platform Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Implementation Platform Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.ImplementationPlatformType
	 * @model instanceClass="org.cyclonedx.schema.bom.ImplementationPlatformType"
	 *        extendedMetaData="name='implementationPlatform_._type:Object' baseType='implementationPlatform_._type'"
	 * @generated
	 */
	EDataType getImplementationPlatformTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.IssueClassification <em>Issue Classification Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Issue Classification Object</em>'.
	 * @see org.cyclonedx.schema.bom.IssueClassification
	 * @model instanceClass="org.cyclonedx.schema.bom.IssueClassification"
	 *        extendedMetaData="name='issueClassification:Object' baseType='issueClassification'"
	 * @generated
	 */
	EDataType getIssueClassificationObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.LicenseAcknowledgementEnumerationType <em>License Acknowledgement Enumeration Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>License Acknowledgement Enumeration Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseAcknowledgementEnumerationType
	 * @model instanceClass="org.cyclonedx.schema.bom.LicenseAcknowledgementEnumerationType"
	 *        extendedMetaData="name='licenseAcknowledgementEnumerationType:Object' baseType='licenseAcknowledgementEnumerationType'"
	 * @generated
	 */
	EDataType getLicenseAcknowledgementEnumerationTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.LicenseTypeEnum <em>License Type Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>License Type Enum Object</em>'.
	 * @see org.cyclonedx.schema.bom.LicenseTypeEnum
	 * @model instanceClass="org.cyclonedx.schema.bom.LicenseTypeEnum"
	 *        extendedMetaData="name='licenseTypeEnum:Object' baseType='licenseTypeEnum'"
	 * @generated
	 */
	EDataType getLicenseTypeEnumObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.LifecyclePhaseType <em>Lifecycle Phase Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lifecycle Phase Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.LifecyclePhaseType
	 * @model instanceClass="org.cyclonedx.schema.bom.LifecyclePhaseType"
	 *        extendedMetaData="name='lifecyclePhaseType:Object' baseType='lifecyclePhaseType'"
	 * @generated
	 */
	EDataType getLifecyclePhaseTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Locale Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                 Defines a syntax for representing two character language code (ISO-639) followed by an optional two
     *                 character country code. The language code must be lower case. If the country code is specified, the
     *                 country code must be upper case. The language code and country code must be separated by a minus sign.
     *                 Examples: en, en-US, fr, fr-CA
     *             
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Locale Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='localeType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='([a-z]{2})(-[A-Z]{2})?'"
	 * @generated
	 */
	EDataType getLocaleType();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.MachineLearningApproachType <em>Machine Learning Approach Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Machine Learning Approach Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.MachineLearningApproachType
	 * @model instanceClass="org.cyclonedx.schema.bom.MachineLearningApproachType"
	 *        extendedMetaData="name='machineLearningApproachType:Object' baseType='machineLearningApproachType'"
	 * @generated
	 */
	EDataType getMachineLearningApproachTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mime Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='mimeType' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[-+a-z0-9.]+/[-+a-z0-9.]+'"
	 * @generated
	 */
	EDataType getMimeType();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.ModeType <em>Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mode Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.ModeType
	 * @model instanceClass="org.cyclonedx.schema.bom.ModeType"
	 *        extendedMetaData="name='mode_._type:Object' baseType='mode_._type'"
	 * @generated
	 */
	EDataType getModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Nist Quantum Security Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Nist Quantum Security Level Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='nistQuantumSecurityLevel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='0' maxInclusive='6'"
	 * @generated
	 */
	EDataType getNistQuantumSecurityLevelType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Open Cre Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Open Cre Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='openCre_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='CRE:[0-9]+-[0-9]+'"
	 * @generated
	 */
	EDataType getOpenCreType();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.OutputTypeEnum <em>Output Type Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Output Type Enum Object</em>'.
	 * @see org.cyclonedx.schema.bom.OutputTypeEnum
	 * @model instanceClass="org.cyclonedx.schema.bom.OutputTypeEnum"
	 *        extendedMetaData="name='outputTypeEnum:Object' baseType='outputTypeEnum'"
	 * @generated
	 */
	EDataType getOutputTypeEnumObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.PaddingType <em>Padding Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Padding Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.PaddingType
	 * @model instanceClass="org.cyclonedx.schema.bom.PaddingType"
	 *        extendedMetaData="name='padding_._type:Object' baseType='padding_._type'"
	 * @generated
	 */
	EDataType getPaddingTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.PatchClassification <em>Patch Classification Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Patch Classification Object</em>'.
	 * @see org.cyclonedx.schema.bom.PatchClassification
	 * @model instanceClass="org.cyclonedx.schema.bom.PatchClassification"
	 *        extendedMetaData="name='patchClassification:Object' baseType='patchClassification'"
	 * @generated
	 */
	EDataType getPatchClassificationObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.PrimitiveType <em>Primitive Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Primitive Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.PrimitiveType
	 * @model instanceClass="org.cyclonedx.schema.bom.PrimitiveType"
	 *        extendedMetaData="name='primitive_._type:Object' baseType='primitive_._type'"
	 * @generated
	 */
	EDataType getPrimitiveTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ref Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                 Descriptor for an element identified by the attribute "bom-ref" in the same BOM document.
     *                 In contrast to `bomLinkElementType`.
     *             
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Ref Link Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='refLinkType' baseType='refType'"
	 * @generated
	 */
	EDataType getRefLinkType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ref Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ref_._type' memberTypes='refLinkType bomLinkElementType'"
	 * @generated
	 */
	EDataType getRefType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ref Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ref Type1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ref_._1_._type' memberTypes='refLinkType bomLinkElementType'"
	 * @generated
	 */
	EDataType getRefType1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ref Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ref Type2</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ref_._2_._type' memberTypes='refLinkType bomLinkElementType'"
	 * @generated
	 */
	EDataType getRefType2();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ref Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ref Type3</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ref_._3_._type' memberTypes='refLinkType bomLinkType'"
	 * @generated
	 */
	EDataType getRefType3();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ref Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifier for referable and therefore interlink-able elements.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Ref Type4</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='refType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1'"
	 * @generated
	 */
	EDataType getRefType4();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.Scope <em>Scope Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scope Object</em>'.
	 * @see org.cyclonedx.schema.bom.Scope
	 * @model instanceClass="org.cyclonedx.schema.bom.Scope"
	 *        extendedMetaData="name='scope:Object' baseType='scope'"
	 * @generated
	 */
	EDataType getScopeObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.ScoreSourceType <em>Score Source Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Score Source Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.ScoreSourceType
	 * @model instanceClass="org.cyclonedx.schema.bom.ScoreSourceType"
	 *        extendedMetaData="name='scoreSourceType:Object' baseType='scoreSourceType'"
	 * @generated
	 */
	EDataType getScoreSourceTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Score Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Score Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='score_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0' maxInclusive='1'"
	 * @generated
	 */
	EDataType getScoreType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Score Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Score Type1</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='score_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0' maxInclusive='1'"
	 * @generated
	 */
	EDataType getScoreType1();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.SeverityType <em>Severity Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Severity Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.SeverityType
	 * @model instanceClass="org.cyclonedx.schema.bom.SeverityType"
	 *        extendedMetaData="name='severityType:Object' baseType='severityType'"
	 * @generated
	 */
	EDataType getSeverityTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.StateType <em>State Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>State Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.StateType
	 * @model instanceClass="org.cyclonedx.schema.bom.StateType"
	 *        extendedMetaData="name='state_._type:Object' baseType='state_._type'"
	 * @generated
	 */
	EDataType getStateTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.TaskTypeEnum <em>Task Type Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Task Type Enum Object</em>'.
	 * @see org.cyclonedx.schema.bom.TaskTypeEnum
	 * @model instanceClass="org.cyclonedx.schema.bom.TaskTypeEnum"
	 *        extendedMetaData="name='taskTypeEnum:Object' baseType='taskTypeEnum'"
	 * @generated
	 */
	EDataType getTaskTypeEnumObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.TriggerTypeType <em>Trigger Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Trigger Type Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.TriggerTypeType
	 * @model instanceClass="org.cyclonedx.schema.bom.TriggerTypeType"
	 *        extendedMetaData="name='triggerTypeType:Object' baseType='triggerTypeType'"
	 * @generated
	 */
	EDataType getTriggerTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.TypeType <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.TypeType
	 * @model instanceClass="org.cyclonedx.schema.bom.TypeType"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.TypeType1 <em>Type Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object1</em>'.
	 * @see org.cyclonedx.schema.bom.TypeType1
	 * @model instanceClass="org.cyclonedx.schema.bom.TypeType1"
	 *        extendedMetaData="name='type_._1_._type:Object' baseType='type_._1_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.UnitType <em>Unit Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit Type Object</em>'.
	 * @see org.cyclonedx.schema.bom.UnitType
	 * @model instanceClass="org.cyclonedx.schema.bom.UnitType"
	 *        extendedMetaData="name='unit_._type:Object' baseType='unit_._type'"
	 * @generated
	 */
	EDataType getUnitTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.UnitType1 <em>Unit Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit Type Object1</em>'.
	 * @see org.cyclonedx.schema.bom.UnitType1
	 * @model instanceClass="org.cyclonedx.schema.bom.UnitType1"
	 *        extendedMetaData="name='unit_._1_._type:Object' baseType='unit_._1_._type'"
	 * @generated
	 */
	EDataType getUnitTypeObject1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Url Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Url Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='url_._type' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI bomLinkElementType'"
	 * @generated
	 */
	EDataType getUrlType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Url Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Url Type1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='url_._1_._type' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI bomLinkElementType'"
	 * @generated
	 */
	EDataType getUrlType1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Url Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Url Type2</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='url_._2_._type' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI bomLinkType'"
	 * @generated
	 */
	EDataType getUrlType2();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Urn Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                 Defines a string representation of a UUID conforming to RFC 4122.
     *             
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Urn Uuid</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='urnUuid' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='urn:uuid:([0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})|(\\{[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}\\})'"
	 * @generated
	 */
	EDataType getUrnUuid();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                 A version range specified in Package URL Version Range syntax (vers) which is defined at https://github.com/package-url/purl-spec/VERSION-RANGE-SPEC.rst
     * 
     *                 Example values:
     *                 - "vers:cargo/9.0.14"
     *                 - "vers:npm/1.2.3|>=2.0.0|<5.0.0"
     *                 - "vers:pypi/0.0.0|0.0.1|0.0.2|0.0.3|1.0|2.0pre1"
     *                 - "vers:tomee/>=1.0.0-beta1|<=1.7.5|>=7.0.0-M1|<=7.0.7|>=7.1.0|<=7.1.2|>=8.0.0-M1|<=8.0.1"
     *                 - "vers:gem/>=2.2.0|!= 2.2.1|<2.3.0"
     *             
     *             
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Version Range Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='versionRangeType' baseType='http://www.eclipse.org/emf/2003/XMLType#normalizedString' minLength='1' maxLength='4096'"
	 * @generated
	 */
	EDataType getVersionRangeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                 A single disjunctive version identifier, for a component or service.
     * 
     *                 Example values:
     *                 - "9.0.14"
     *                 - "v1.33.7"
     *                 - "7.0.0-M1"
     *                 - "2.0pre1"
     *                 - "1.0.0-beta1"
     *                 - "0.8.15"
     *             
     *             
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Version Type1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='versionType' baseType='http://www.eclipse.org/emf/2003/XMLType#normalizedString' maxLength='1024'"
	 * @generated
	 */
	EDataType getVersionType1();

	/**
	 * Returns the meta object for data type '{@link org.cyclonedx.schema.bom.VolumeModeEnum <em>Volume Mode Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Volume Mode Enum Object</em>'.
	 * @see org.cyclonedx.schema.bom.VolumeModeEnum
	 * @model instanceClass="org.cyclonedx.schema.bom.VolumeModeEnum"
	 *        extendedMetaData="name='volumeModeEnum:Object' baseType='volumeModeEnum'"
	 * @generated
	 */
	EDataType getVolumeModeEnumObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BOMFactory getBOMFactory();

} //BOMPackage
