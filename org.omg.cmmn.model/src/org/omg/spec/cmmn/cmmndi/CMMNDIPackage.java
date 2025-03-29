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
package org.omg.spec.cmmn.cmmndi;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.omg.spec.cmmn.di.DIPackage;

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
 * @see org.omg.spec.cmmn.cmmndi.CMMNDIFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = CMMNDIPackage.eNS_URI, genModel = "/model/CMMN11.genmodel", genModelSourceLocations = {"model/CMMN11.genmodel","org.omg.cmmn.model/model/CMMN11.genmodel"}, ecore="/model/cmmndi.ecore", ecoreSourceLocations="/model/cmmndi.ecore")
public interface CMMNDIPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cmmndi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/CMMN/20151109/CMMNDI";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cmmndi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CMMNDIPackage eINSTANCE = org.omg.spec.cmmn.cmmndi.impl.CMMNDIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDIImpl <em>CMMNDI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNDIImpl
	 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNDIPackageImpl#getCMMNDI()
	 * @generated
	 */
	int CMMNDI = 0;

	/**
	 * The feature id for the '<em><b>CMMN Diagram</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMNDI__CMMN_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>CMMN Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMNDI__CMMN_STYLE = 1;

	/**
	 * The number of structural features of the '<em>CMMNDI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMNDI_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>CMMNDI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMNDI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDiagramImpl <em>CMMN Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNDiagramImpl
	 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNDIPackageImpl#getCMMNDiagram()
	 * @generated
	 */
	int CMMN_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM__EXTENSION = DIPackage.DIAGRAM__EXTENSION;

	/**
	 * The feature id for the '<em><b>Style Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM__STYLE_GROUP = DIPackage.DIAGRAM__STYLE_GROUP;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM__STYLE = DIPackage.DIAGRAM__STYLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM__ID = DIPackage.DIAGRAM__ID;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM__SHARED_STYLE = DIPackage.DIAGRAM__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM__ANY_ATTRIBUTE = DIPackage.DIAGRAM__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM__DOCUMENTATION = DIPackage.DIAGRAM__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM__NAME = DIPackage.DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM__RESOLUTION = DIPackage.DIAGRAM__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM__SIZE = DIPackage.DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CMMN Diagram Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM__CMMN_DIAGRAM_ELEMENT_GROUP = DIPackage.DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CMMN Diagram Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM__CMMN_DIAGRAM_ELEMENT = DIPackage.DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cmmn Element Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM__CMMN_ELEMENT_REF = DIPackage.DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>CMMN Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM_FEATURE_COUNT = DIPackage.DIAGRAM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>CMMN Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_DIAGRAM_OPERATION_COUNT = DIPackage.DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.cmmndi.impl.CMMNEdgeImpl <em>CMMN Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNEdgeImpl
	 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNDIPackageImpl#getCMMNEdge()
	 * @generated
	 */
	int CMMN_EDGE = 2;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_EDGE__EXTENSION = DIPackage.EDGE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Style Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_EDGE__STYLE_GROUP = DIPackage.EDGE__STYLE_GROUP;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_EDGE__STYLE = DIPackage.EDGE__STYLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_EDGE__ID = DIPackage.EDGE__ID;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_EDGE__SHARED_STYLE = DIPackage.EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_EDGE__ANY_ATTRIBUTE = DIPackage.EDGE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_EDGE__WAYPOINT = DIPackage.EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>CMMN Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_EDGE__CMMN_LABEL = DIPackage.EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cmmn Element Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_EDGE__CMMN_ELEMENT_REF = DIPackage.EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Standard Event Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_EDGE__IS_STANDARD_EVENT_VISIBLE = DIPackage.EDGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source CMMN Element Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_EDGE__SOURCE_CMMN_ELEMENT_REF = DIPackage.EDGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target CMMN Element Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_EDGE__TARGET_CMMN_ELEMENT_REF = DIPackage.EDGE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>CMMN Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_EDGE_FEATURE_COUNT = DIPackage.EDGE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>CMMN Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_EDGE_OPERATION_COUNT = DIPackage.EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.cmmndi.impl.CMMNLabelImpl <em>CMMN Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNLabelImpl
	 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNDIPackageImpl#getCMMNLabel()
	 * @generated
	 */
	int CMMN_LABEL = 3;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_LABEL__EXTENSION = DIPackage.SHAPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Style Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_LABEL__STYLE_GROUP = DIPackage.SHAPE__STYLE_GROUP;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_LABEL__STYLE = DIPackage.SHAPE__STYLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_LABEL__ID = DIPackage.SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_LABEL__SHARED_STYLE = DIPackage.SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_LABEL__ANY_ATTRIBUTE = DIPackage.SHAPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_LABEL__BOUNDS = DIPackage.SHAPE__BOUNDS;

	/**
	 * The number of structural features of the '<em>CMMN Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_LABEL_FEATURE_COUNT = DIPackage.SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CMMN Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_LABEL_OPERATION_COUNT = DIPackage.SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.cmmndi.impl.CMMNShapeImpl <em>CMMN Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNShapeImpl
	 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNDIPackageImpl#getCMMNShape()
	 * @generated
	 */
	int CMMN_SHAPE = 4;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_SHAPE__EXTENSION = DIPackage.SHAPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Style Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_SHAPE__STYLE_GROUP = DIPackage.SHAPE__STYLE_GROUP;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_SHAPE__STYLE = DIPackage.SHAPE__STYLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_SHAPE__ID = DIPackage.SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_SHAPE__SHARED_STYLE = DIPackage.SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_SHAPE__ANY_ATTRIBUTE = DIPackage.SHAPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_SHAPE__BOUNDS = DIPackage.SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>CMMN Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_SHAPE__CMMN_LABEL = DIPackage.SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cmmn Element Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_SHAPE__CMMN_ELEMENT_REF = DIPackage.SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Collapsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_SHAPE__IS_COLLAPSED = DIPackage.SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Planning Table Collapsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_SHAPE__IS_PLANNING_TABLE_COLLAPSED = DIPackage.SHAPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>CMMN Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_SHAPE_FEATURE_COUNT = DIPackage.SHAPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>CMMN Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_SHAPE_OPERATION_COUNT = DIPackage.SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.cmmndi.impl.CMMNStyleImpl <em>CMMN Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNStyleImpl
	 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNDIPackageImpl#getCMMNStyle()
	 * @generated
	 */
	int CMMN_STYLE = 5;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_STYLE__EXTENSION = DIPackage.STYLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_STYLE__ID = DIPackage.STYLE__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_STYLE__ANY_ATTRIBUTE = DIPackage.STYLE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_STYLE__FILL_COLOR = DIPackage.STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stroke Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_STYLE__STROKE_COLOR = DIPackage.STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_STYLE__FONT_COLOR = DIPackage.STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Font Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_STYLE__FONT_BOLD = DIPackage.STYLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_STYLE__FONT_FAMILY = DIPackage.STYLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Font Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_STYLE__FONT_ITALIC = DIPackage.STYLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_STYLE__FONT_SIZE = DIPackage.STYLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Font Strike Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_STYLE__FONT_STRIKE_THROUGH = DIPackage.STYLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Font Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_STYLE__FONT_UNDERLINE = DIPackage.STYLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Label Horizontal Alignement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_STYLE__LABEL_HORIZONTAL_ALIGNEMENT = DIPackage.STYLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Label Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_STYLE__LABEL_VERTICAL_ALIGNMENT = DIPackage.STYLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>CMMN Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_STYLE_FEATURE_COUNT = DIPackage.STYLE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>CMMN Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMN_STYLE_OPERATION_COUNT = DIPackage.STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDIRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNDIRootImpl
	 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNDIPackageImpl#getCMMNDIRoot()
	 * @generated
	 */
	int CMMNDI_ROOT = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMNDI_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMNDI_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMNDI_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>CMMNDI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMNDI_ROOT__CMMNDI = 3;

	/**
	 * The feature id for the '<em><b>CMMN Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMNDI_ROOT__CMMN_DIAGRAM = 4;

	/**
	 * The feature id for the '<em><b>CMMN Diagram Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMNDI_ROOT__CMMN_DIAGRAM_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>CMMN Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMNDI_ROOT__CMMN_EDGE = 6;

	/**
	 * The feature id for the '<em><b>CMMN Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMNDI_ROOT__CMMN_LABEL = 7;

	/**
	 * The feature id for the '<em><b>CMMN Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMNDI_ROOT__CMMN_SHAPE = 8;

	/**
	 * The feature id for the '<em><b>CMMN Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMNDI_ROOT__CMMN_STYLE = 9;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMNDI_ROOT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMMNDI_ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.cmmndi.CMMNDI <em>CMMNDI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CMMNDI</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDI
	 * @generated
	 */
	EClass getCMMNDI();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.cmmndi.CMMNDI#getCMMNDiagram <em>CMMN Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CMMN Diagram</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDI#getCMMNDiagram()
	 * @see #getCMMNDI()
	 * @generated
	 */
	EReference getCMMNDI_CMMNDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.cmmndi.CMMNDI#getCMMNStyle <em>CMMN Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CMMN Style</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDI#getCMMNStyle()
	 * @see #getCMMNDI()
	 * @generated
	 */
	EReference getCMMNDI_CMMNStyle();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.cmmndi.CMMNDiagram <em>CMMN Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CMMN Diagram</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDiagram
	 * @generated
	 */
	EClass getCMMNDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.cmmndi.CMMNDiagram#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDiagram#getSize()
	 * @see #getCMMNDiagram()
	 * @generated
	 */
	EReference getCMMNDiagram_Size();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.cmmn.cmmndi.CMMNDiagram#getCMMNDiagramElementGroup <em>CMMN Diagram Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>CMMN Diagram Element Group</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDiagram#getCMMNDiagramElementGroup()
	 * @see #getCMMNDiagram()
	 * @generated
	 */
	EAttribute getCMMNDiagram_CMMNDiagramElementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.cmmndi.CMMNDiagram#getCMMNDiagramElement <em>CMMN Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CMMN Diagram Element</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDiagram#getCMMNDiagramElement()
	 * @see #getCMMNDiagram()
	 * @generated
	 */
	EReference getCMMNDiagram_CMMNDiagramElement();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.cmmndi.CMMNDiagram#getCmmnElementRef <em>Cmmn Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmmn Element Ref</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDiagram#getCmmnElementRef()
	 * @see #getCMMNDiagram()
	 * @generated
	 */
	EAttribute getCMMNDiagram_CmmnElementRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.cmmndi.CMMNEdge <em>CMMN Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CMMN Edge</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNEdge
	 * @generated
	 */
	EClass getCMMNEdge();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.cmmndi.CMMNEdge#getCMMNLabel <em>CMMN Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CMMN Label</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNEdge#getCMMNLabel()
	 * @see #getCMMNEdge()
	 * @generated
	 */
	EReference getCMMNEdge_CMMNLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.cmmndi.CMMNEdge#getCmmnElementRef <em>Cmmn Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmmn Element Ref</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNEdge#getCmmnElementRef()
	 * @see #getCMMNEdge()
	 * @generated
	 */
	EAttribute getCMMNEdge_CmmnElementRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.cmmndi.CMMNEdge#isIsStandardEventVisible <em>Is Standard Event Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Standard Event Visible</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNEdge#isIsStandardEventVisible()
	 * @see #getCMMNEdge()
	 * @generated
	 */
	EAttribute getCMMNEdge_IsStandardEventVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.cmmndi.CMMNEdge#getSourceCMMNElementRef <em>Source CMMN Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source CMMN Element Ref</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNEdge#getSourceCMMNElementRef()
	 * @see #getCMMNEdge()
	 * @generated
	 */
	EAttribute getCMMNEdge_SourceCMMNElementRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.cmmndi.CMMNEdge#getTargetCMMNElementRef <em>Target CMMN Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target CMMN Element Ref</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNEdge#getTargetCMMNElementRef()
	 * @see #getCMMNEdge()
	 * @generated
	 */
	EAttribute getCMMNEdge_TargetCMMNElementRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.cmmndi.CMMNLabel <em>CMMN Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CMMN Label</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNLabel
	 * @generated
	 */
	EClass getCMMNLabel();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.cmmndi.CMMNShape <em>CMMN Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CMMN Shape</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNShape
	 * @generated
	 */
	EClass getCMMNShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.cmmndi.CMMNShape#getCMMNLabel <em>CMMN Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CMMN Label</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNShape#getCMMNLabel()
	 * @see #getCMMNShape()
	 * @generated
	 */
	EReference getCMMNShape_CMMNLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.cmmndi.CMMNShape#getCmmnElementRef <em>Cmmn Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmmn Element Ref</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNShape#getCmmnElementRef()
	 * @see #getCMMNShape()
	 * @generated
	 */
	EAttribute getCMMNShape_CmmnElementRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.cmmndi.CMMNShape#isIsCollapsed <em>Is Collapsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collapsed</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNShape#isIsCollapsed()
	 * @see #getCMMNShape()
	 * @generated
	 */
	EAttribute getCMMNShape_IsCollapsed();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.cmmndi.CMMNShape#isIsPlanningTableCollapsed <em>Is Planning Table Collapsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Planning Table Collapsed</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNShape#isIsPlanningTableCollapsed()
	 * @see #getCMMNShape()
	 * @generated
	 */
	EAttribute getCMMNShape_IsPlanningTableCollapsed();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle <em>CMMN Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CMMN Style</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNStyle
	 * @generated
	 */
	EClass getCMMNStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getFillColor <em>Fill Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fill Color</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNStyle#getFillColor()
	 * @see #getCMMNStyle()
	 * @generated
	 */
	EReference getCMMNStyle_FillColor();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getStrokeColor <em>Stroke Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stroke Color</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNStyle#getStrokeColor()
	 * @see #getCMMNStyle()
	 * @generated
	 */
	EReference getCMMNStyle_StrokeColor();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getFontColor <em>Font Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font Color</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNStyle#getFontColor()
	 * @see #getCMMNStyle()
	 * @generated
	 */
	EReference getCMMNStyle_FontColor();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontBold <em>Font Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Bold</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontBold()
	 * @see #getCMMNStyle()
	 * @generated
	 */
	EAttribute getCMMNStyle_FontBold();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getFontFamily <em>Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNStyle#getFontFamily()
	 * @see #getCMMNStyle()
	 * @generated
	 */
	EAttribute getCMMNStyle_FontFamily();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontItalic <em>Font Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Italic</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontItalic()
	 * @see #getCMMNStyle()
	 * @generated
	 */
	EAttribute getCMMNStyle_FontItalic();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNStyle#getFontSize()
	 * @see #getCMMNStyle()
	 * @generated
	 */
	EAttribute getCMMNStyle_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontStrikeThrough <em>Font Strike Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Strike Through</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontStrikeThrough()
	 * @see #getCMMNStyle()
	 * @generated
	 */
	EAttribute getCMMNStyle_FontStrikeThrough();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontUnderline <em>Font Underline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Underline</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontUnderline()
	 * @see #getCMMNStyle()
	 * @generated
	 */
	EAttribute getCMMNStyle_FontUnderline();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getLabelHorizontalAlignement <em>Label Horizontal Alignement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Horizontal Alignement</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNStyle#getLabelHorizontalAlignement()
	 * @see #getCMMNStyle()
	 * @generated
	 */
	EAttribute getCMMNStyle_LabelHorizontalAlignement();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getLabelVerticalAlignment <em>Label Vertical Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Vertical Alignment</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNStyle#getLabelVerticalAlignment()
	 * @see #getCMMNStyle()
	 * @generated
	 */
	EAttribute getCMMNStyle_LabelVerticalAlignment();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIRoot
	 * @generated
	 */
	EClass getCMMNDIRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getMixed()
	 * @see #getCMMNDIRoot()
	 * @generated
	 */
	EAttribute getCMMNDIRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getXMLNSPrefixMap()
	 * @see #getCMMNDIRoot()
	 * @generated
	 */
	EReference getCMMNDIRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getXSISchemaLocation()
	 * @see #getCMMNDIRoot()
	 * @generated
	 */
	EReference getCMMNDIRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNDI <em>CMMNDI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CMMNDI</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNDI()
	 * @see #getCMMNDIRoot()
	 * @generated
	 */
	EReference getCMMNDIRoot_CMMNDI();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNDiagram <em>CMMN Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CMMN Diagram</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNDiagram()
	 * @see #getCMMNDIRoot()
	 * @generated
	 */
	EReference getCMMNDIRoot_CMMNDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNDiagramElement <em>CMMN Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CMMN Diagram Element</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNDiagramElement()
	 * @see #getCMMNDIRoot()
	 * @generated
	 */
	EReference getCMMNDIRoot_CMMNDiagramElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNEdge <em>CMMN Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CMMN Edge</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNEdge()
	 * @see #getCMMNDIRoot()
	 * @generated
	 */
	EReference getCMMNDIRoot_CMMNEdge();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNLabel <em>CMMN Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CMMN Label</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNLabel()
	 * @see #getCMMNDIRoot()
	 * @generated
	 */
	EReference getCMMNDIRoot_CMMNLabel();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNShape <em>CMMN Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CMMN Shape</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNShape()
	 * @see #getCMMNDIRoot()
	 * @generated
	 */
	EReference getCMMNDIRoot_CMMNShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNStyle <em>CMMN Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CMMN Style</em>'.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNStyle()
	 * @see #getCMMNDIRoot()
	 * @generated
	 */
	EReference getCMMNDIRoot_CMMNStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CMMNDIFactory getCMMNDIFactory();

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
		 * The meta object literal for the '{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDIImpl <em>CMMNDI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNDIImpl
		 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNDIPackageImpl#getCMMNDI()
		 * @generated
		 */
		EClass CMMNDI = eINSTANCE.getCMMNDI();

		/**
		 * The meta object literal for the '<em><b>CMMN Diagram</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMMNDI__CMMN_DIAGRAM = eINSTANCE.getCMMNDI_CMMNDiagram();

		/**
		 * The meta object literal for the '<em><b>CMMN Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMMNDI__CMMN_STYLE = eINSTANCE.getCMMNDI_CMMNStyle();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDiagramImpl <em>CMMN Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNDiagramImpl
		 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNDIPackageImpl#getCMMNDiagram()
		 * @generated
		 */
		EClass CMMN_DIAGRAM = eINSTANCE.getCMMNDiagram();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMMN_DIAGRAM__SIZE = eINSTANCE.getCMMNDiagram_Size();

		/**
		 * The meta object literal for the '<em><b>CMMN Diagram Element Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMN_DIAGRAM__CMMN_DIAGRAM_ELEMENT_GROUP = eINSTANCE.getCMMNDiagram_CMMNDiagramElementGroup();

		/**
		 * The meta object literal for the '<em><b>CMMN Diagram Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMMN_DIAGRAM__CMMN_DIAGRAM_ELEMENT = eINSTANCE.getCMMNDiagram_CMMNDiagramElement();

		/**
		 * The meta object literal for the '<em><b>Cmmn Element Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMN_DIAGRAM__CMMN_ELEMENT_REF = eINSTANCE.getCMMNDiagram_CmmnElementRef();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.cmmndi.impl.CMMNEdgeImpl <em>CMMN Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNEdgeImpl
		 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNDIPackageImpl#getCMMNEdge()
		 * @generated
		 */
		EClass CMMN_EDGE = eINSTANCE.getCMMNEdge();

		/**
		 * The meta object literal for the '<em><b>CMMN Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMMN_EDGE__CMMN_LABEL = eINSTANCE.getCMMNEdge_CMMNLabel();

		/**
		 * The meta object literal for the '<em><b>Cmmn Element Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMN_EDGE__CMMN_ELEMENT_REF = eINSTANCE.getCMMNEdge_CmmnElementRef();

		/**
		 * The meta object literal for the '<em><b>Is Standard Event Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMN_EDGE__IS_STANDARD_EVENT_VISIBLE = eINSTANCE.getCMMNEdge_IsStandardEventVisible();

		/**
		 * The meta object literal for the '<em><b>Source CMMN Element Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMN_EDGE__SOURCE_CMMN_ELEMENT_REF = eINSTANCE.getCMMNEdge_SourceCMMNElementRef();

		/**
		 * The meta object literal for the '<em><b>Target CMMN Element Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMN_EDGE__TARGET_CMMN_ELEMENT_REF = eINSTANCE.getCMMNEdge_TargetCMMNElementRef();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.cmmndi.impl.CMMNLabelImpl <em>CMMN Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNLabelImpl
		 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNDIPackageImpl#getCMMNLabel()
		 * @generated
		 */
		EClass CMMN_LABEL = eINSTANCE.getCMMNLabel();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.cmmndi.impl.CMMNShapeImpl <em>CMMN Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNShapeImpl
		 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNDIPackageImpl#getCMMNShape()
		 * @generated
		 */
		EClass CMMN_SHAPE = eINSTANCE.getCMMNShape();

		/**
		 * The meta object literal for the '<em><b>CMMN Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMMN_SHAPE__CMMN_LABEL = eINSTANCE.getCMMNShape_CMMNLabel();

		/**
		 * The meta object literal for the '<em><b>Cmmn Element Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMN_SHAPE__CMMN_ELEMENT_REF = eINSTANCE.getCMMNShape_CmmnElementRef();

		/**
		 * The meta object literal for the '<em><b>Is Collapsed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMN_SHAPE__IS_COLLAPSED = eINSTANCE.getCMMNShape_IsCollapsed();

		/**
		 * The meta object literal for the '<em><b>Is Planning Table Collapsed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMN_SHAPE__IS_PLANNING_TABLE_COLLAPSED = eINSTANCE.getCMMNShape_IsPlanningTableCollapsed();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.cmmndi.impl.CMMNStyleImpl <em>CMMN Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNStyleImpl
		 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNDIPackageImpl#getCMMNStyle()
		 * @generated
		 */
		EClass CMMN_STYLE = eINSTANCE.getCMMNStyle();

		/**
		 * The meta object literal for the '<em><b>Fill Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMMN_STYLE__FILL_COLOR = eINSTANCE.getCMMNStyle_FillColor();

		/**
		 * The meta object literal for the '<em><b>Stroke Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMMN_STYLE__STROKE_COLOR = eINSTANCE.getCMMNStyle_StrokeColor();

		/**
		 * The meta object literal for the '<em><b>Font Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMMN_STYLE__FONT_COLOR = eINSTANCE.getCMMNStyle_FontColor();

		/**
		 * The meta object literal for the '<em><b>Font Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMN_STYLE__FONT_BOLD = eINSTANCE.getCMMNStyle_FontBold();

		/**
		 * The meta object literal for the '<em><b>Font Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMN_STYLE__FONT_FAMILY = eINSTANCE.getCMMNStyle_FontFamily();

		/**
		 * The meta object literal for the '<em><b>Font Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMN_STYLE__FONT_ITALIC = eINSTANCE.getCMMNStyle_FontItalic();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMN_STYLE__FONT_SIZE = eINSTANCE.getCMMNStyle_FontSize();

		/**
		 * The meta object literal for the '<em><b>Font Strike Through</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMN_STYLE__FONT_STRIKE_THROUGH = eINSTANCE.getCMMNStyle_FontStrikeThrough();

		/**
		 * The meta object literal for the '<em><b>Font Underline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMN_STYLE__FONT_UNDERLINE = eINSTANCE.getCMMNStyle_FontUnderline();

		/**
		 * The meta object literal for the '<em><b>Label Horizontal Alignement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMN_STYLE__LABEL_HORIZONTAL_ALIGNEMENT = eINSTANCE.getCMMNStyle_LabelHorizontalAlignement();

		/**
		 * The meta object literal for the '<em><b>Label Vertical Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMN_STYLE__LABEL_VERTICAL_ALIGNMENT = eINSTANCE.getCMMNStyle_LabelVerticalAlignment();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDIRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNDIRootImpl
		 * @see org.omg.spec.cmmn.cmmndi.impl.CMMNDIPackageImpl#getCMMNDIRoot()
		 * @generated
		 */
		EClass CMMNDI_ROOT = eINSTANCE.getCMMNDIRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMMNDI_ROOT__MIXED = eINSTANCE.getCMMNDIRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMMNDI_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getCMMNDIRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMMNDI_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getCMMNDIRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>CMMNDI</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMMNDI_ROOT__CMMNDI = eINSTANCE.getCMMNDIRoot_CMMNDI();

		/**
		 * The meta object literal for the '<em><b>CMMN Diagram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMMNDI_ROOT__CMMN_DIAGRAM = eINSTANCE.getCMMNDIRoot_CMMNDiagram();

		/**
		 * The meta object literal for the '<em><b>CMMN Diagram Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMMNDI_ROOT__CMMN_DIAGRAM_ELEMENT = eINSTANCE.getCMMNDIRoot_CMMNDiagramElement();

		/**
		 * The meta object literal for the '<em><b>CMMN Edge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMMNDI_ROOT__CMMN_EDGE = eINSTANCE.getCMMNDIRoot_CMMNEdge();

		/**
		 * The meta object literal for the '<em><b>CMMN Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMMNDI_ROOT__CMMN_LABEL = eINSTANCE.getCMMNDIRoot_CMMNLabel();

		/**
		 * The meta object literal for the '<em><b>CMMN Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMMNDI_ROOT__CMMN_SHAPE = eINSTANCE.getCMMNDIRoot_CMMNShape();

		/**
		 * The meta object literal for the '<em><b>CMMN Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMMNDI_ROOT__CMMN_STYLE = eINSTANCE.getCMMNDIRoot_CMMNStyle();

	}

} //CMMNDIPackage
