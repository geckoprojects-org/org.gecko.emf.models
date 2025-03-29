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
package org.omg.spec.dmn.dmndi;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.omg.spec.dmn.di.DIPackage;

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
 * The Diagram Interchange (DI) package enables interchange of graphical information that language users have control over, such as position of nodes and line routing points. Language specifications specialize elements of DI to define diagram interchange elements for a language.
 * <!-- end-model-doc -->
 * @see org.omg.spec.dmn.dmndi.DMNDIFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = DMNDIPackage.eNS_URI, genModel = "/model/DMN16.genmodel", genModelSourceLocations = {"model/DMN16.genmodel","org.omg.dmn.model/model/DMN16.genmodel"}, ecore="/model/dmndi.ecore", ecoreSourceLocations="/model/dmndi.ecore")
public interface DMNDIPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dmndi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.omg.org/spec/DMN/20230324/DMNDI/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dmndi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DMNDIPackage eINSTANCE = org.omg.spec.dmn.dmndi.impl.DMNDIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmndi.impl.DMNDecisionServiceDividerLineImpl <em>DMN Decision Service Divider Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmndi.impl.DMNDecisionServiceDividerLineImpl
	 * @see org.omg.spec.dmn.dmndi.impl.DMNDIPackageImpl#getDMNDecisionServiceDividerLine()
	 * @generated
	 */
	int DMN_DECISION_SERVICE_DIVIDER_LINE = 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DECISION_SERVICE_DIVIDER_LINE__EXTENSION = DIPackage.EDGE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Style Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DECISION_SERVICE_DIVIDER_LINE__STYLE_GROUP = DIPackage.EDGE__STYLE_GROUP;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DECISION_SERVICE_DIVIDER_LINE__STYLE = DIPackage.EDGE__STYLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DECISION_SERVICE_DIVIDER_LINE__ID = DIPackage.EDGE__ID;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DECISION_SERVICE_DIVIDER_LINE__SHARED_STYLE = DIPackage.EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DECISION_SERVICE_DIVIDER_LINE__ANY_ATTRIBUTE = DIPackage.EDGE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DECISION_SERVICE_DIVIDER_LINE__WAYPOINT = DIPackage.EDGE__WAYPOINT;

	/**
	 * The number of structural features of the '<em>DMN Decision Service Divider Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DECISION_SERVICE_DIVIDER_LINE_FEATURE_COUNT = DIPackage.EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DMN Decision Service Divider Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DECISION_SERVICE_DIVIDER_LINE_OPERATION_COUNT = DIPackage.EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmndi.impl.DMNDIImpl <em>DMNDI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmndi.impl.DMNDIImpl
	 * @see org.omg.spec.dmn.dmndi.impl.DMNDIPackageImpl#getDMNDI()
	 * @generated
	 */
	int DMNDI = 1;

	/**
	 * The feature id for the '<em><b>DMN Diagram</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMNDI__DMN_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>DMN Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMNDI__DMN_STYLE = 1;

	/**
	 * The number of structural features of the '<em>DMNDI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMNDI_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DMNDI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMNDI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmndi.impl.DMNDiagramImpl <em>DMN Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmndi.impl.DMNDiagramImpl
	 * @see org.omg.spec.dmn.dmndi.impl.DMNDIPackageImpl#getDMNDiagram()
	 * @generated
	 */
	int DMN_DIAGRAM = 2;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DIAGRAM__EXTENSION = DIPackage.DIAGRAM__EXTENSION;

	/**
	 * The feature id for the '<em><b>Style Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DIAGRAM__STYLE_GROUP = DIPackage.DIAGRAM__STYLE_GROUP;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DIAGRAM__STYLE = DIPackage.DIAGRAM__STYLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DIAGRAM__ID = DIPackage.DIAGRAM__ID;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DIAGRAM__SHARED_STYLE = DIPackage.DIAGRAM__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DIAGRAM__ANY_ATTRIBUTE = DIPackage.DIAGRAM__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DIAGRAM__DOCUMENTATION = DIPackage.DIAGRAM__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DIAGRAM__NAME = DIPackage.DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DIAGRAM__RESOLUTION = DIPackage.DIAGRAM__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DIAGRAM__SIZE = DIPackage.DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>DMN Diagram Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DIAGRAM__DMN_DIAGRAM_ELEMENT_GROUP = DIPackage.DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>DMN Diagram Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DIAGRAM__DMN_DIAGRAM_ELEMENT = DIPackage.DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Use Alternative Input Data Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DIAGRAM__USE_ALTERNATIVE_INPUT_DATA_SHAPE = DIPackage.DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DMN Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DIAGRAM_FEATURE_COUNT = DIPackage.DIAGRAM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>DMN Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_DIAGRAM_OPERATION_COUNT = DIPackage.DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmndi.impl.DMNEdgeImpl <em>DMN Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmndi.impl.DMNEdgeImpl
	 * @see org.omg.spec.dmn.dmndi.impl.DMNDIPackageImpl#getDMNEdge()
	 * @generated
	 */
	int DMN_EDGE = 3;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_EDGE__EXTENSION = DIPackage.EDGE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Style Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_EDGE__STYLE_GROUP = DIPackage.EDGE__STYLE_GROUP;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_EDGE__STYLE = DIPackage.EDGE__STYLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_EDGE__ID = DIPackage.EDGE__ID;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_EDGE__SHARED_STYLE = DIPackage.EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_EDGE__ANY_ATTRIBUTE = DIPackage.EDGE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_EDGE__WAYPOINT = DIPackage.EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>DMN Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_EDGE__DMN_LABEL = DIPackage.EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dmn Element Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_EDGE__DMN_ELEMENT_REF = DIPackage.EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_EDGE__SOURCE_ELEMENT = DIPackage.EDGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_EDGE__TARGET_ELEMENT = DIPackage.EDGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DMN Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_EDGE_FEATURE_COUNT = DIPackage.EDGE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>DMN Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_EDGE_OPERATION_COUNT = DIPackage.EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmndi.impl.DMNLabelImpl <em>DMN Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmndi.impl.DMNLabelImpl
	 * @see org.omg.spec.dmn.dmndi.impl.DMNDIPackageImpl#getDMNLabel()
	 * @generated
	 */
	int DMN_LABEL = 4;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_LABEL__EXTENSION = DIPackage.SHAPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Style Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_LABEL__STYLE_GROUP = DIPackage.SHAPE__STYLE_GROUP;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_LABEL__STYLE = DIPackage.SHAPE__STYLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_LABEL__ID = DIPackage.SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_LABEL__SHARED_STYLE = DIPackage.SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_LABEL__ANY_ATTRIBUTE = DIPackage.SHAPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_LABEL__BOUNDS = DIPackage.SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_LABEL__TEXT = DIPackage.SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DMN Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_LABEL_FEATURE_COUNT = DIPackage.SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DMN Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_LABEL_OPERATION_COUNT = DIPackage.SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmndi.impl.DMNShapeImpl <em>DMN Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmndi.impl.DMNShapeImpl
	 * @see org.omg.spec.dmn.dmndi.impl.DMNDIPackageImpl#getDMNShape()
	 * @generated
	 */
	int DMN_SHAPE = 5;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_SHAPE__EXTENSION = DIPackage.SHAPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Style Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_SHAPE__STYLE_GROUP = DIPackage.SHAPE__STYLE_GROUP;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_SHAPE__STYLE = DIPackage.SHAPE__STYLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_SHAPE__ID = DIPackage.SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_SHAPE__SHARED_STYLE = DIPackage.SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_SHAPE__ANY_ATTRIBUTE = DIPackage.SHAPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_SHAPE__BOUNDS = DIPackage.SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>DMN Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_SHAPE__DMN_LABEL = DIPackage.SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>DMN Decision Service Divider Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_SHAPE__DMN_DECISION_SERVICE_DIVIDER_LINE = DIPackage.SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dmn Element Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_SHAPE__DMN_ELEMENT_REF = DIPackage.SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Collapsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_SHAPE__IS_COLLAPSED = DIPackage.SHAPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Listed Input Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_SHAPE__IS_LISTED_INPUT_DATA = DIPackage.SHAPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>DMN Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_SHAPE_FEATURE_COUNT = DIPackage.SHAPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>DMN Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_SHAPE_OPERATION_COUNT = DIPackage.SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmndi.impl.DMNStyleImpl <em>DMN Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmndi.impl.DMNStyleImpl
	 * @see org.omg.spec.dmn.dmndi.impl.DMNDIPackageImpl#getDMNStyle()
	 * @generated
	 */
	int DMN_STYLE = 6;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_STYLE__EXTENSION = DIPackage.STYLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_STYLE__ID = DIPackage.STYLE__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_STYLE__ANY_ATTRIBUTE = DIPackage.STYLE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_STYLE__FILL_COLOR = DIPackage.STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stroke Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_STYLE__STROKE_COLOR = DIPackage.STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_STYLE__FONT_COLOR = DIPackage.STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Font Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_STYLE__FONT_BOLD = DIPackage.STYLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_STYLE__FONT_FAMILY = DIPackage.STYLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Font Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_STYLE__FONT_ITALIC = DIPackage.STYLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_STYLE__FONT_SIZE = DIPackage.STYLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Font Strike Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_STYLE__FONT_STRIKE_THROUGH = DIPackage.STYLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Font Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_STYLE__FONT_UNDERLINE = DIPackage.STYLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Label Horizontal Alignement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_STYLE__LABEL_HORIZONTAL_ALIGNEMENT = DIPackage.STYLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Label Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_STYLE__LABEL_VERTICAL_ALIGNMENT = DIPackage.STYLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>DMN Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_STYLE_FEATURE_COUNT = DIPackage.STYLE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>DMN Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_STYLE_OPERATION_COUNT = DIPackage.STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmndi.impl.DMNDIRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmndi.impl.DMNDIRootImpl
	 * @see org.omg.spec.dmn.dmndi.impl.DMNDIPackageImpl#getDMNDIRoot()
	 * @generated
	 */
	int DMNDI_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMNDI_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMNDI_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMNDI_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>DMN Decision Service Divider Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMNDI_ROOT__DMN_DECISION_SERVICE_DIVIDER_LINE = 3;

	/**
	 * The feature id for the '<em><b>DMNDI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMNDI_ROOT__DMNDI = 4;

	/**
	 * The feature id for the '<em><b>DMN Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMNDI_ROOT__DMN_DIAGRAM = 5;

	/**
	 * The feature id for the '<em><b>DMN Diagram Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMNDI_ROOT__DMN_DIAGRAM_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>DMN Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMNDI_ROOT__DMN_EDGE = 7;

	/**
	 * The feature id for the '<em><b>DMN Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMNDI_ROOT__DMN_LABEL = 8;

	/**
	 * The feature id for the '<em><b>DMN Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMNDI_ROOT__DMN_SHAPE = 9;

	/**
	 * The feature id for the '<em><b>DMN Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMNDI_ROOT__DMN_STYLE = 10;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMNDI_ROOT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMNDI_ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmndi.DMNDecisionServiceDividerLine <em>DMN Decision Service Divider Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMN Decision Service Divider Line</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNDecisionServiceDividerLine
	 * @generated
	 */
	EClass getDMNDecisionServiceDividerLine();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmndi.DMNDI <em>DMNDI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMNDI</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNDI
	 * @generated
	 */
	EClass getDMNDI();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmndi.DMNDI#getDMNDiagram <em>DMN Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DMN Diagram</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNDI#getDMNDiagram()
	 * @see #getDMNDI()
	 * @generated
	 */
	EReference getDMNDI_DMNDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmndi.DMNDI#getDMNStyle <em>DMN Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DMN Style</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNDI#getDMNStyle()
	 * @see #getDMNDI()
	 * @generated
	 */
	EReference getDMNDI_DMNStyle();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmndi.DMNDiagram <em>DMN Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMN Diagram</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNDiagram
	 * @generated
	 */
	EClass getDMNDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmndi.DMNDiagram#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNDiagram#getSize()
	 * @see #getDMNDiagram()
	 * @generated
	 */
	EReference getDMNDiagram_Size();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.dmn.dmndi.DMNDiagram#getDMNDiagramElementGroup <em>DMN Diagram Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>DMN Diagram Element Group</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNDiagram#getDMNDiagramElementGroup()
	 * @see #getDMNDiagram()
	 * @generated
	 */
	EAttribute getDMNDiagram_DMNDiagramElementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmndi.DMNDiagram#getDMNDiagramElement <em>DMN Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DMN Diagram Element</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNDiagram#getDMNDiagramElement()
	 * @see #getDMNDiagram()
	 * @generated
	 */
	EReference getDMNDiagram_DMNDiagramElement();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmndi.DMNDiagram#isUseAlternativeInputDataShape <em>Use Alternative Input Data Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Alternative Input Data Shape</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNDiagram#isUseAlternativeInputDataShape()
	 * @see #getDMNDiagram()
	 * @generated
	 */
	EAttribute getDMNDiagram_UseAlternativeInputDataShape();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmndi.DMNEdge <em>DMN Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMN Edge</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNEdge
	 * @generated
	 */
	EClass getDMNEdge();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmndi.DMNEdge#getDMNLabel <em>DMN Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DMN Label</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNEdge#getDMNLabel()
	 * @see #getDMNEdge()
	 * @generated
	 */
	EReference getDMNEdge_DMNLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmndi.DMNEdge#getDmnElementRef <em>Dmn Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dmn Element Ref</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNEdge#getDmnElementRef()
	 * @see #getDMNEdge()
	 * @generated
	 */
	EAttribute getDMNEdge_DmnElementRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmndi.DMNEdge#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Element</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNEdge#getSourceElement()
	 * @see #getDMNEdge()
	 * @generated
	 */
	EAttribute getDMNEdge_SourceElement();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmndi.DMNEdge#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Element</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNEdge#getTargetElement()
	 * @see #getDMNEdge()
	 * @generated
	 */
	EAttribute getDMNEdge_TargetElement();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmndi.DMNLabel <em>DMN Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMN Label</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNLabel
	 * @generated
	 */
	EClass getDMNLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmndi.DMNLabel#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNLabel#getText()
	 * @see #getDMNLabel()
	 * @generated
	 */
	EAttribute getDMNLabel_Text();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmndi.DMNShape <em>DMN Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMN Shape</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNShape
	 * @generated
	 */
	EClass getDMNShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmndi.DMNShape#getDMNLabel <em>DMN Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DMN Label</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNShape#getDMNLabel()
	 * @see #getDMNShape()
	 * @generated
	 */
	EReference getDMNShape_DMNLabel();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmndi.DMNShape#getDMNDecisionServiceDividerLine <em>DMN Decision Service Divider Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DMN Decision Service Divider Line</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNShape#getDMNDecisionServiceDividerLine()
	 * @see #getDMNShape()
	 * @generated
	 */
	EReference getDMNShape_DMNDecisionServiceDividerLine();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmndi.DMNShape#getDmnElementRef <em>Dmn Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dmn Element Ref</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNShape#getDmnElementRef()
	 * @see #getDMNShape()
	 * @generated
	 */
	EAttribute getDMNShape_DmnElementRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmndi.DMNShape#isIsCollapsed <em>Is Collapsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collapsed</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNShape#isIsCollapsed()
	 * @see #getDMNShape()
	 * @generated
	 */
	EAttribute getDMNShape_IsCollapsed();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmndi.DMNShape#isIsListedInputData <em>Is Listed Input Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Listed Input Data</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNShape#isIsListedInputData()
	 * @see #getDMNShape()
	 * @generated
	 */
	EAttribute getDMNShape_IsListedInputData();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmndi.DMNStyle <em>DMN Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMN Style</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNStyle
	 * @generated
	 */
	EClass getDMNStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmndi.DMNStyle#getFillColor <em>Fill Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fill Color</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNStyle#getFillColor()
	 * @see #getDMNStyle()
	 * @generated
	 */
	EReference getDMNStyle_FillColor();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmndi.DMNStyle#getStrokeColor <em>Stroke Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stroke Color</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNStyle#getStrokeColor()
	 * @see #getDMNStyle()
	 * @generated
	 */
	EReference getDMNStyle_StrokeColor();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmndi.DMNStyle#getFontColor <em>Font Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font Color</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNStyle#getFontColor()
	 * @see #getDMNStyle()
	 * @generated
	 */
	EReference getDMNStyle_FontColor();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmndi.DMNStyle#isFontBold <em>Font Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Bold</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNStyle#isFontBold()
	 * @see #getDMNStyle()
	 * @generated
	 */
	EAttribute getDMNStyle_FontBold();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmndi.DMNStyle#getFontFamily <em>Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNStyle#getFontFamily()
	 * @see #getDMNStyle()
	 * @generated
	 */
	EAttribute getDMNStyle_FontFamily();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmndi.DMNStyle#isFontItalic <em>Font Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Italic</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNStyle#isFontItalic()
	 * @see #getDMNStyle()
	 * @generated
	 */
	EAttribute getDMNStyle_FontItalic();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmndi.DMNStyle#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNStyle#getFontSize()
	 * @see #getDMNStyle()
	 * @generated
	 */
	EAttribute getDMNStyle_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmndi.DMNStyle#isFontStrikeThrough <em>Font Strike Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Strike Through</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNStyle#isFontStrikeThrough()
	 * @see #getDMNStyle()
	 * @generated
	 */
	EAttribute getDMNStyle_FontStrikeThrough();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmndi.DMNStyle#isFontUnderline <em>Font Underline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Underline</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNStyle#isFontUnderline()
	 * @see #getDMNStyle()
	 * @generated
	 */
	EAttribute getDMNStyle_FontUnderline();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmndi.DMNStyle#getLabelHorizontalAlignement <em>Label Horizontal Alignement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Horizontal Alignement</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNStyle#getLabelHorizontalAlignement()
	 * @see #getDMNStyle()
	 * @generated
	 */
	EAttribute getDMNStyle_LabelHorizontalAlignement();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmndi.DMNStyle#getLabelVerticalAlignment <em>Label Vertical Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Vertical Alignment</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNStyle#getLabelVerticalAlignment()
	 * @see #getDMNStyle()
	 * @generated
	 */
	EAttribute getDMNStyle_LabelVerticalAlignment();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmndi.DMNDIRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNDIRoot
	 * @generated
	 */
	EClass getDMNDIRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNDIRoot#getMixed()
	 * @see #getDMNDIRoot()
	 * @generated
	 */
	EAttribute getDMNDIRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNDIRoot#getXMLNSPrefixMap()
	 * @see #getDMNDIRoot()
	 * @generated
	 */
	EReference getDMNDIRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNDIRoot#getXSISchemaLocation()
	 * @see #getDMNDIRoot()
	 * @generated
	 */
	EReference getDMNDIRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNDecisionServiceDividerLine <em>DMN Decision Service Divider Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DMN Decision Service Divider Line</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNDecisionServiceDividerLine()
	 * @see #getDMNDIRoot()
	 * @generated
	 */
	EReference getDMNDIRoot_DMNDecisionServiceDividerLine();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNDI <em>DMNDI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DMNDI</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNDI()
	 * @see #getDMNDIRoot()
	 * @generated
	 */
	EReference getDMNDIRoot_DMNDI();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNDiagram <em>DMN Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DMN Diagram</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNDiagram()
	 * @see #getDMNDIRoot()
	 * @generated
	 */
	EReference getDMNDIRoot_DMNDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNDiagramElement <em>DMN Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DMN Diagram Element</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNDiagramElement()
	 * @see #getDMNDIRoot()
	 * @generated
	 */
	EReference getDMNDIRoot_DMNDiagramElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNEdge <em>DMN Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DMN Edge</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNEdge()
	 * @see #getDMNDIRoot()
	 * @generated
	 */
	EReference getDMNDIRoot_DMNEdge();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNLabel <em>DMN Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DMN Label</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNLabel()
	 * @see #getDMNDIRoot()
	 * @generated
	 */
	EReference getDMNDIRoot_DMNLabel();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNShape <em>DMN Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DMN Shape</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNShape()
	 * @see #getDMNDIRoot()
	 * @generated
	 */
	EReference getDMNDIRoot_DMNShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNStyle <em>DMN Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DMN Style</em>'.
	 * @see org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNStyle()
	 * @see #getDMNDIRoot()
	 * @generated
	 */
	EReference getDMNDIRoot_DMNStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DMNDIFactory getDMNDIFactory();

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
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmndi.impl.DMNDecisionServiceDividerLineImpl <em>DMN Decision Service Divider Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmndi.impl.DMNDecisionServiceDividerLineImpl
		 * @see org.omg.spec.dmn.dmndi.impl.DMNDIPackageImpl#getDMNDecisionServiceDividerLine()
		 * @generated
		 */
		EClass DMN_DECISION_SERVICE_DIVIDER_LINE = eINSTANCE.getDMNDecisionServiceDividerLine();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmndi.impl.DMNDIImpl <em>DMNDI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmndi.impl.DMNDIImpl
		 * @see org.omg.spec.dmn.dmndi.impl.DMNDIPackageImpl#getDMNDI()
		 * @generated
		 */
		EClass DMNDI = eINSTANCE.getDMNDI();

		/**
		 * The meta object literal for the '<em><b>DMN Diagram</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMNDI__DMN_DIAGRAM = eINSTANCE.getDMNDI_DMNDiagram();

		/**
		 * The meta object literal for the '<em><b>DMN Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMNDI__DMN_STYLE = eINSTANCE.getDMNDI_DMNStyle();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmndi.impl.DMNDiagramImpl <em>DMN Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmndi.impl.DMNDiagramImpl
		 * @see org.omg.spec.dmn.dmndi.impl.DMNDIPackageImpl#getDMNDiagram()
		 * @generated
		 */
		EClass DMN_DIAGRAM = eINSTANCE.getDMNDiagram();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_DIAGRAM__SIZE = eINSTANCE.getDMNDiagram_Size();

		/**
		 * The meta object literal for the '<em><b>DMN Diagram Element Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMN_DIAGRAM__DMN_DIAGRAM_ELEMENT_GROUP = eINSTANCE.getDMNDiagram_DMNDiagramElementGroup();

		/**
		 * The meta object literal for the '<em><b>DMN Diagram Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_DIAGRAM__DMN_DIAGRAM_ELEMENT = eINSTANCE.getDMNDiagram_DMNDiagramElement();

		/**
		 * The meta object literal for the '<em><b>Use Alternative Input Data Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMN_DIAGRAM__USE_ALTERNATIVE_INPUT_DATA_SHAPE = eINSTANCE.getDMNDiagram_UseAlternativeInputDataShape();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmndi.impl.DMNEdgeImpl <em>DMN Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmndi.impl.DMNEdgeImpl
		 * @see org.omg.spec.dmn.dmndi.impl.DMNDIPackageImpl#getDMNEdge()
		 * @generated
		 */
		EClass DMN_EDGE = eINSTANCE.getDMNEdge();

		/**
		 * The meta object literal for the '<em><b>DMN Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_EDGE__DMN_LABEL = eINSTANCE.getDMNEdge_DMNLabel();

		/**
		 * The meta object literal for the '<em><b>Dmn Element Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMN_EDGE__DMN_ELEMENT_REF = eINSTANCE.getDMNEdge_DmnElementRef();

		/**
		 * The meta object literal for the '<em><b>Source Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMN_EDGE__SOURCE_ELEMENT = eINSTANCE.getDMNEdge_SourceElement();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMN_EDGE__TARGET_ELEMENT = eINSTANCE.getDMNEdge_TargetElement();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmndi.impl.DMNLabelImpl <em>DMN Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmndi.impl.DMNLabelImpl
		 * @see org.omg.spec.dmn.dmndi.impl.DMNDIPackageImpl#getDMNLabel()
		 * @generated
		 */
		EClass DMN_LABEL = eINSTANCE.getDMNLabel();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMN_LABEL__TEXT = eINSTANCE.getDMNLabel_Text();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmndi.impl.DMNShapeImpl <em>DMN Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmndi.impl.DMNShapeImpl
		 * @see org.omg.spec.dmn.dmndi.impl.DMNDIPackageImpl#getDMNShape()
		 * @generated
		 */
		EClass DMN_SHAPE = eINSTANCE.getDMNShape();

		/**
		 * The meta object literal for the '<em><b>DMN Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_SHAPE__DMN_LABEL = eINSTANCE.getDMNShape_DMNLabel();

		/**
		 * The meta object literal for the '<em><b>DMN Decision Service Divider Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_SHAPE__DMN_DECISION_SERVICE_DIVIDER_LINE = eINSTANCE.getDMNShape_DMNDecisionServiceDividerLine();

		/**
		 * The meta object literal for the '<em><b>Dmn Element Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMN_SHAPE__DMN_ELEMENT_REF = eINSTANCE.getDMNShape_DmnElementRef();

		/**
		 * The meta object literal for the '<em><b>Is Collapsed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMN_SHAPE__IS_COLLAPSED = eINSTANCE.getDMNShape_IsCollapsed();

		/**
		 * The meta object literal for the '<em><b>Is Listed Input Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMN_SHAPE__IS_LISTED_INPUT_DATA = eINSTANCE.getDMNShape_IsListedInputData();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmndi.impl.DMNStyleImpl <em>DMN Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmndi.impl.DMNStyleImpl
		 * @see org.omg.spec.dmn.dmndi.impl.DMNDIPackageImpl#getDMNStyle()
		 * @generated
		 */
		EClass DMN_STYLE = eINSTANCE.getDMNStyle();

		/**
		 * The meta object literal for the '<em><b>Fill Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_STYLE__FILL_COLOR = eINSTANCE.getDMNStyle_FillColor();

		/**
		 * The meta object literal for the '<em><b>Stroke Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_STYLE__STROKE_COLOR = eINSTANCE.getDMNStyle_StrokeColor();

		/**
		 * The meta object literal for the '<em><b>Font Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_STYLE__FONT_COLOR = eINSTANCE.getDMNStyle_FontColor();

		/**
		 * The meta object literal for the '<em><b>Font Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMN_STYLE__FONT_BOLD = eINSTANCE.getDMNStyle_FontBold();

		/**
		 * The meta object literal for the '<em><b>Font Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMN_STYLE__FONT_FAMILY = eINSTANCE.getDMNStyle_FontFamily();

		/**
		 * The meta object literal for the '<em><b>Font Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMN_STYLE__FONT_ITALIC = eINSTANCE.getDMNStyle_FontItalic();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMN_STYLE__FONT_SIZE = eINSTANCE.getDMNStyle_FontSize();

		/**
		 * The meta object literal for the '<em><b>Font Strike Through</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMN_STYLE__FONT_STRIKE_THROUGH = eINSTANCE.getDMNStyle_FontStrikeThrough();

		/**
		 * The meta object literal for the '<em><b>Font Underline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMN_STYLE__FONT_UNDERLINE = eINSTANCE.getDMNStyle_FontUnderline();

		/**
		 * The meta object literal for the '<em><b>Label Horizontal Alignement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMN_STYLE__LABEL_HORIZONTAL_ALIGNEMENT = eINSTANCE.getDMNStyle_LabelHorizontalAlignement();

		/**
		 * The meta object literal for the '<em><b>Label Vertical Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMN_STYLE__LABEL_VERTICAL_ALIGNMENT = eINSTANCE.getDMNStyle_LabelVerticalAlignment();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmndi.impl.DMNDIRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmndi.impl.DMNDIRootImpl
		 * @see org.omg.spec.dmn.dmndi.impl.DMNDIPackageImpl#getDMNDIRoot()
		 * @generated
		 */
		EClass DMNDI_ROOT = eINSTANCE.getDMNDIRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMNDI_ROOT__MIXED = eINSTANCE.getDMNDIRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMNDI_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDMNDIRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMNDI_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDMNDIRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>DMN Decision Service Divider Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMNDI_ROOT__DMN_DECISION_SERVICE_DIVIDER_LINE = eINSTANCE.getDMNDIRoot_DMNDecisionServiceDividerLine();

		/**
		 * The meta object literal for the '<em><b>DMNDI</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMNDI_ROOT__DMNDI = eINSTANCE.getDMNDIRoot_DMNDI();

		/**
		 * The meta object literal for the '<em><b>DMN Diagram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMNDI_ROOT__DMN_DIAGRAM = eINSTANCE.getDMNDIRoot_DMNDiagram();

		/**
		 * The meta object literal for the '<em><b>DMN Diagram Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMNDI_ROOT__DMN_DIAGRAM_ELEMENT = eINSTANCE.getDMNDIRoot_DMNDiagramElement();

		/**
		 * The meta object literal for the '<em><b>DMN Edge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMNDI_ROOT__DMN_EDGE = eINSTANCE.getDMNDIRoot_DMNEdge();

		/**
		 * The meta object literal for the '<em><b>DMN Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMNDI_ROOT__DMN_LABEL = eINSTANCE.getDMNDIRoot_DMNLabel();

		/**
		 * The meta object literal for the '<em><b>DMN Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMNDI_ROOT__DMN_SHAPE = eINSTANCE.getDMNDIRoot_DMNShape();

		/**
		 * The meta object literal for the '<em><b>DMN Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMNDI_ROOT__DMN_STYLE = eINSTANCE.getDMNDIRoot_DMNStyle();

	}

} //DMNDIPackage
