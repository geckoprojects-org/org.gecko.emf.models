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
package org.omg.spec.dmn.di;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * The Diagram Interchange (DI) package enables interchange of graphical information that language users have control over, such as position of nodes and line routing points. Language specifications specialize elements of DI to define diagram interchange elements for a language.
 * <!-- end-model-doc -->
 * @see org.omg.spec.dmn.di.DIFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = DIPackage.eNS_URI, genModel = "/model/DMN16.genmodel", genModelSourceLocations = {"model/DMN16.genmodel","org.omg.dmn.model/model/DMN16.genmodel"}, ecore="/model/di.ecore", ecoreSourceLocations="/model/di.ecore")
public interface DIPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "di";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/DMN/20180521/DI/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "di";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DIPackage eINSTANCE = org.omg.spec.dmn.di.impl.DIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.di.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.di.impl.DiagramElementImpl
	 * @see org.omg.spec.dmn.di.impl.DIPackageImpl#getDiagramElement()
	 * @generated
	 */
	int DIAGRAM_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Style Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__STYLE_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__STYLE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__ID = 3;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__SHARED_STYLE = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.di.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.di.impl.DiagramImpl
	 * @see org.omg.spec.dmn.di.impl.DIPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__EXTENSION = DIAGRAM_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Style Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__STYLE_GROUP = DIAGRAM_ELEMENT__STYLE_GROUP;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__STYLE = DIAGRAM_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ID = DIAGRAM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__SHARED_STYLE = DIAGRAM_ELEMENT__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ANY_ATTRIBUTE = DIAGRAM_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DOCUMENTATION = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__RESOLUTION = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.di.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.di.impl.EdgeImpl
	 * @see org.omg.spec.dmn.di.impl.DIPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 2;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__EXTENSION = DIAGRAM_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Style Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__STYLE_GROUP = DIAGRAM_ELEMENT__STYLE_GROUP;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__STYLE = DIAGRAM_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ID = DIAGRAM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SHARED_STYLE = DIAGRAM_ELEMENT__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ANY_ATTRIBUTE = DIAGRAM_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__WAYPOINT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.di.impl.ExtensionTypeImpl <em>Extension Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.di.impl.ExtensionTypeImpl
	 * @see org.omg.spec.dmn.di.impl.DIPackageImpl#getExtensionType()
	 * @generated
	 */
	int EXTENSION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.di.impl.ExtensionType1Impl <em>Extension Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.di.impl.ExtensionType1Impl
	 * @see org.omg.spec.dmn.di.impl.DIPackageImpl#getExtensionType1()
	 * @generated
	 */
	int EXTENSION_TYPE1 = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE1__ANY = 0;

	/**
	 * The number of structural features of the '<em>Extension Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Extension Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.di.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.di.impl.ShapeImpl
	 * @see org.omg.spec.dmn.di.impl.DIPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 5;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__EXTENSION = DIAGRAM_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Style Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__STYLE_GROUP = DIAGRAM_ELEMENT__STYLE_GROUP;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__STYLE = DIAGRAM_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ID = DIAGRAM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__SHARED_STYLE = DIAGRAM_ELEMENT__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ANY_ATTRIBUTE = DIAGRAM_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__BOUNDS = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.di.impl.StyleImpl <em>Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.di.impl.StyleImpl
	 * @see org.omg.spec.dmn.di.impl.DIPackageImpl#getStyle()
	 * @generated
	 */
	int STYLE = 6;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__ID = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.di.impl.DIRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.di.impl.DIRootImpl
	 * @see org.omg.spec.dmn.di.impl.DIPackageImpl#getDIRoot()
	 * @generated
	 */
	int DI_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DI_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DI_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DI_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DI_ROOT__STYLE = 3;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DI_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DI_ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.di.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see org.omg.spec.dmn.di.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.di.Diagram#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.omg.spec.dmn.di.Diagram#getDocumentation()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.di.Diagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.dmn.di.Diagram#getName()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.di.Diagram#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see org.omg.spec.dmn.di.Diagram#getResolution()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Resolution();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.di.DiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Element</em>'.
	 * @see org.omg.spec.dmn.di.DiagramElement
	 * @generated
	 */
	EClass getDiagramElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.di.DiagramElement#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see org.omg.spec.dmn.di.DiagramElement#getExtension()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_Extension();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.dmn.di.DiagramElement#getStyleGroup <em>Style Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Style Group</em>'.
	 * @see org.omg.spec.dmn.di.DiagramElement#getStyleGroup()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EAttribute getDiagramElement_StyleGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.di.DiagramElement#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.omg.spec.dmn.di.DiagramElement#getStyle()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.di.DiagramElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.omg.spec.dmn.di.DiagramElement#getId()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EAttribute getDiagramElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.di.DiagramElement#getSharedStyle <em>Shared Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared Style</em>'.
	 * @see org.omg.spec.dmn.di.DiagramElement#getSharedStyle()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EAttribute getDiagramElement_SharedStyle();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.dmn.di.DiagramElement#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.omg.spec.dmn.di.DiagramElement#getAnyAttribute()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EAttribute getDiagramElement_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.di.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see org.omg.spec.dmn.di.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.di.Edge#getWaypoint <em>Waypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Waypoint</em>'.
	 * @see org.omg.spec.dmn.di.Edge#getWaypoint()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Waypoint();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.di.ExtensionType <em>Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Type</em>'.
	 * @see org.omg.spec.dmn.di.ExtensionType
	 * @generated
	 */
	EClass getExtensionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.dmn.di.ExtensionType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.omg.spec.dmn.di.ExtensionType#getAny()
	 * @see #getExtensionType()
	 * @generated
	 */
	EAttribute getExtensionType_Any();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.di.ExtensionType1 <em>Extension Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Type1</em>'.
	 * @see org.omg.spec.dmn.di.ExtensionType1
	 * @generated
	 */
	EClass getExtensionType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.dmn.di.ExtensionType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.omg.spec.dmn.di.ExtensionType1#getAny()
	 * @see #getExtensionType1()
	 * @generated
	 */
	EAttribute getExtensionType1_Any();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.di.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see org.omg.spec.dmn.di.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.di.Shape#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see org.omg.spec.dmn.di.Shape#getBounds()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_Bounds();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.di.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style</em>'.
	 * @see org.omg.spec.dmn.di.Style
	 * @generated
	 */
	EClass getStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.di.Style#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see org.omg.spec.dmn.di.Style#getExtension()
	 * @see #getStyle()
	 * @generated
	 */
	EReference getStyle_Extension();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.di.Style#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.omg.spec.dmn.di.Style#getId()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Id();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.dmn.di.Style#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.omg.spec.dmn.di.Style#getAnyAttribute()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.di.DIRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see org.omg.spec.dmn.di.DIRoot
	 * @generated
	 */
	EClass getDIRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.dmn.di.DIRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.omg.spec.dmn.di.DIRoot#getMixed()
	 * @see #getDIRoot()
	 * @generated
	 */
	EAttribute getDIRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.omg.spec.dmn.di.DIRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.omg.spec.dmn.di.DIRoot#getXMLNSPrefixMap()
	 * @see #getDIRoot()
	 * @generated
	 */
	EReference getDIRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.omg.spec.dmn.di.DIRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.omg.spec.dmn.di.DIRoot#getXSISchemaLocation()
	 * @see #getDIRoot()
	 * @generated
	 */
	EReference getDIRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.di.DIRoot#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.omg.spec.dmn.di.DIRoot#getStyle()
	 * @see #getDIRoot()
	 * @generated
	 */
	EReference getDIRoot_Style();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DIFactory getDIFactory();

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
		 * The meta object literal for the '{@link org.omg.spec.dmn.di.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.di.impl.DiagramImpl
		 * @see org.omg.spec.dmn.di.impl.DIPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__DOCUMENTATION = eINSTANCE.getDiagram_Documentation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__NAME = eINSTANCE.getDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__RESOLUTION = eINSTANCE.getDiagram_Resolution();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.di.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.di.impl.DiagramElementImpl
		 * @see org.omg.spec.dmn.di.impl.DIPackageImpl#getDiagramElement()
		 * @generated
		 */
		EClass DIAGRAM_ELEMENT = eINSTANCE.getDiagramElement();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__EXTENSION = eINSTANCE.getDiagramElement_Extension();

		/**
		 * The meta object literal for the '<em><b>Style Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_ELEMENT__STYLE_GROUP = eINSTANCE.getDiagramElement_StyleGroup();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__STYLE = eINSTANCE.getDiagramElement_Style();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_ELEMENT__ID = eINSTANCE.getDiagramElement_Id();

		/**
		 * The meta object literal for the '<em><b>Shared Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_ELEMENT__SHARED_STYLE = eINSTANCE.getDiagramElement_SharedStyle();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_ELEMENT__ANY_ATTRIBUTE = eINSTANCE.getDiagramElement_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.di.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.di.impl.EdgeImpl
		 * @see org.omg.spec.dmn.di.impl.DIPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Waypoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__WAYPOINT = eINSTANCE.getEdge_Waypoint();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.di.impl.ExtensionTypeImpl <em>Extension Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.di.impl.ExtensionTypeImpl
		 * @see org.omg.spec.dmn.di.impl.DIPackageImpl#getExtensionType()
		 * @generated
		 */
		EClass EXTENSION_TYPE = eINSTANCE.getExtensionType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_TYPE__ANY = eINSTANCE.getExtensionType_Any();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.di.impl.ExtensionType1Impl <em>Extension Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.di.impl.ExtensionType1Impl
		 * @see org.omg.spec.dmn.di.impl.DIPackageImpl#getExtensionType1()
		 * @generated
		 */
		EClass EXTENSION_TYPE1 = eINSTANCE.getExtensionType1();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_TYPE1__ANY = eINSTANCE.getExtensionType1_Any();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.di.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.di.impl.ShapeImpl
		 * @see org.omg.spec.dmn.di.impl.DIPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__BOUNDS = eINSTANCE.getShape_Bounds();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.di.impl.StyleImpl <em>Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.di.impl.StyleImpl
		 * @see org.omg.spec.dmn.di.impl.DIPackageImpl#getStyle()
		 * @generated
		 */
		EClass STYLE = eINSTANCE.getStyle();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE__EXTENSION = eINSTANCE.getStyle_Extension();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__ID = eINSTANCE.getStyle_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__ANY_ATTRIBUTE = eINSTANCE.getStyle_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.di.impl.DIRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.di.impl.DIRootImpl
		 * @see org.omg.spec.dmn.di.impl.DIPackageImpl#getDIRoot()
		 * @generated
		 */
		EClass DI_ROOT = eINSTANCE.getDIRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DI_ROOT__MIXED = eINSTANCE.getDIRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DI_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDIRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DI_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDIRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DI_ROOT__STYLE = eINSTANCE.getDIRoot_Style();

	}

} //DIPackage
