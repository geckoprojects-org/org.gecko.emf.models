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
package org.omg.spec.cmmn.dc;


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
 * @see org.omg.spec.cmmn.dc.DCFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = DCPackage.eNS_URI, genModel = "/model/CMMN11.genmodel", genModelSourceLocations = {"model/CMMN11.genmodel","org.omg.cmmn.model/model/CMMN11.genmodel"}, ecore="/model/dc.ecore", ecoreSourceLocations="/model/dc.ecore")
public interface DCPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/CMMN/20151109/DC";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DCPackage eINSTANCE = org.omg.spec.cmmn.dc.impl.DCPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.dc.impl.BoundsImpl <em>Bounds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.dc.impl.BoundsImpl
	 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getBounds()
	 * @generated
	 */
	int BOUNDS = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__HEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__WIDTH = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__X = 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__Y = 3;

	/**
	 * The number of structural features of the '<em>Bounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.dc.impl.ColorImpl <em>Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.dc.impl.ColorImpl
	 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 1;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__BLUE = 0;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__GREEN = 1;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__RED = 2;

	/**
	 * The number of structural features of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.dc.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.dc.impl.DimensionImpl
	 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__HEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__WIDTH = 1;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.dc.impl.DCRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.dc.impl.DCRootImpl
	 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getDCRoot()
	 * @generated
	 */
	int DC_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_ROOT__BOUNDS = 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_ROOT__COLOR = 4;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_ROOT__DIMENSION = 5;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_ROOT__POINT = 6;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_ROOT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DC_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.dc.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.dc.impl.PointImpl
	 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.dc.AlignmentKind <em>Alignment Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.dc.AlignmentKind
	 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getAlignmentKind()
	 * @generated
	 */
	int ALIGNMENT_KIND = 5;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.dc.KnownColor <em>Known Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.dc.KnownColor
	 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getKnownColor()
	 * @generated
	 */
	int KNOWN_COLOR = 6;

	/**
	 * The meta object id for the '<em>Alignment Kind Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.dc.AlignmentKind
	 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getAlignmentKindObject()
	 * @generated
	 */
	int ALIGNMENT_KIND_OBJECT = 7;

	/**
	 * The meta object id for the '<em>Known Color Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.dc.KnownColor
	 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getKnownColorObject()
	 * @generated
	 */
	int KNOWN_COLOR_OBJECT = 8;

	/**
	 * The meta object id for the '<em>Rgb</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getRgb()
	 * @generated
	 */
	int RGB = 9;

	/**
	 * The meta object id for the '<em>Rgb Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getRgbObject()
	 * @generated
	 */
	int RGB_OBJECT = 10;


	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.dc.Bounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounds</em>'.
	 * @see org.omg.spec.cmmn.dc.Bounds
	 * @generated
	 */
	EClass getBounds();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.dc.Bounds#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.omg.spec.cmmn.dc.Bounds#getHeight()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.dc.Bounds#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.omg.spec.cmmn.dc.Bounds#getWidth()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.dc.Bounds#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.omg.spec.cmmn.dc.Bounds#getX()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_X();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.dc.Bounds#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.omg.spec.cmmn.dc.Bounds#getY()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_Y();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.dc.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see org.omg.spec.cmmn.dc.Color
	 * @generated
	 */
	EClass getColor();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.dc.Color#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see org.omg.spec.cmmn.dc.Color#getBlue()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Blue();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.dc.Color#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see org.omg.spec.cmmn.dc.Color#getGreen()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Green();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.dc.Color#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see org.omg.spec.cmmn.dc.Color#getRed()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Red();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.dc.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see org.omg.spec.cmmn.dc.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.dc.Dimension#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.omg.spec.cmmn.dc.Dimension#getHeight()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.dc.Dimension#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.omg.spec.cmmn.dc.Dimension#getWidth()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Width();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.dc.DCRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see org.omg.spec.cmmn.dc.DCRoot
	 * @generated
	 */
	EClass getDCRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.cmmn.dc.DCRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.omg.spec.cmmn.dc.DCRoot#getMixed()
	 * @see #getDCRoot()
	 * @generated
	 */
	EAttribute getDCRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.omg.spec.cmmn.dc.DCRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.omg.spec.cmmn.dc.DCRoot#getXMLNSPrefixMap()
	 * @see #getDCRoot()
	 * @generated
	 */
	EReference getDCRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.omg.spec.cmmn.dc.DCRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.omg.spec.cmmn.dc.DCRoot#getXSISchemaLocation()
	 * @see #getDCRoot()
	 * @generated
	 */
	EReference getDCRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.dc.DCRoot#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see org.omg.spec.cmmn.dc.DCRoot#getBounds()
	 * @see #getDCRoot()
	 * @generated
	 */
	EReference getDCRoot_Bounds();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.dc.DCRoot#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color</em>'.
	 * @see org.omg.spec.cmmn.dc.DCRoot#getColor()
	 * @see #getDCRoot()
	 * @generated
	 */
	EReference getDCRoot_Color();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.dc.DCRoot#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimension</em>'.
	 * @see org.omg.spec.cmmn.dc.DCRoot#getDimension()
	 * @see #getDCRoot()
	 * @generated
	 */
	EReference getDCRoot_Dimension();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.dc.DCRoot#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point</em>'.
	 * @see org.omg.spec.cmmn.dc.DCRoot#getPoint()
	 * @see #getDCRoot()
	 * @generated
	 */
	EReference getDCRoot_Point();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.dc.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see org.omg.spec.cmmn.dc.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.dc.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.omg.spec.cmmn.dc.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.dc.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.omg.spec.cmmn.dc.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.cmmn.dc.AlignmentKind <em>Alignment Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alignment Kind</em>'.
	 * @see org.omg.spec.cmmn.dc.AlignmentKind
	 * @generated
	 */
	EEnum getAlignmentKind();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.cmmn.dc.KnownColor <em>Known Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Known Color</em>'.
	 * @see org.omg.spec.cmmn.dc.KnownColor
	 * @generated
	 */
	EEnum getKnownColor();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.cmmn.dc.AlignmentKind <em>Alignment Kind Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Alignment Kind Object</em>'.
	 * @see org.omg.spec.cmmn.dc.AlignmentKind
	 * @model instanceClass="org.omg.spec.cmmn.dc.AlignmentKind"
	 *        extendedMetaData="name='AlignmentKind:Object' baseType='AlignmentKind'"
	 * @generated
	 */
	EDataType getAlignmentKindObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.cmmn.dc.KnownColor <em>Known Color Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Known Color Object</em>'.
	 * @see org.omg.spec.cmmn.dc.KnownColor
	 * @model instanceClass="org.omg.spec.cmmn.dc.KnownColor"
	 *        extendedMetaData="name='KnownColor:Object' baseType='KnownColor'"
	 * @generated
	 */
	EDataType getKnownColorObject();

	/**
	 * Returns the meta object for data type '<em>Rgb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rgb</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='rgb' baseType='http://www.eclipse.org/emf/2003/XMLType#int' minInclusive='0' maxInclusive='255'"
	 * @generated
	 */
	EDataType getRgb();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Rgb Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rgb Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='rgb:Object' baseType='rgb'"
	 * @generated
	 */
	EDataType getRgbObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DCFactory getDCFactory();

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
		 * The meta object literal for the '{@link org.omg.spec.cmmn.dc.impl.BoundsImpl <em>Bounds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.dc.impl.BoundsImpl
		 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getBounds()
		 * @generated
		 */
		EClass BOUNDS = eINSTANCE.getBounds();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__HEIGHT = eINSTANCE.getBounds_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__WIDTH = eINSTANCE.getBounds_Width();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__X = eINSTANCE.getBounds_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__Y = eINSTANCE.getBounds_Y();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.dc.impl.ColorImpl <em>Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.dc.impl.ColorImpl
		 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getColor()
		 * @generated
		 */
		EClass COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__BLUE = eINSTANCE.getColor_Blue();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__GREEN = eINSTANCE.getColor_Green();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__RED = eINSTANCE.getColor_Red();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.dc.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.dc.impl.DimensionImpl
		 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__HEIGHT = eINSTANCE.getDimension_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__WIDTH = eINSTANCE.getDimension_Width();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.dc.impl.DCRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.dc.impl.DCRootImpl
		 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getDCRoot()
		 * @generated
		 */
		EClass DC_ROOT = eINSTANCE.getDCRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DC_ROOT__MIXED = eINSTANCE.getDCRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DC_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDCRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DC_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDCRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DC_ROOT__BOUNDS = eINSTANCE.getDCRoot_Bounds();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DC_ROOT__COLOR = eINSTANCE.getDCRoot_Color();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DC_ROOT__DIMENSION = eINSTANCE.getDCRoot_Dimension();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DC_ROOT__POINT = eINSTANCE.getDCRoot_Point();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.dc.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.dc.impl.PointImpl
		 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.dc.AlignmentKind <em>Alignment Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.dc.AlignmentKind
		 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getAlignmentKind()
		 * @generated
		 */
		EEnum ALIGNMENT_KIND = eINSTANCE.getAlignmentKind();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.dc.KnownColor <em>Known Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.dc.KnownColor
		 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getKnownColor()
		 * @generated
		 */
		EEnum KNOWN_COLOR = eINSTANCE.getKnownColor();

		/**
		 * The meta object literal for the '<em>Alignment Kind Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.dc.AlignmentKind
		 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getAlignmentKindObject()
		 * @generated
		 */
		EDataType ALIGNMENT_KIND_OBJECT = eINSTANCE.getAlignmentKindObject();

		/**
		 * The meta object literal for the '<em>Known Color Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.dc.KnownColor
		 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getKnownColorObject()
		 * @generated
		 */
		EDataType KNOWN_COLOR_OBJECT = eINSTANCE.getKnownColorObject();

		/**
		 * The meta object literal for the '<em>Rgb</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getRgb()
		 * @generated
		 */
		EDataType RGB = eINSTANCE.getRgb();

		/**
		 * The meta object literal for the '<em>Rgb Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.omg.spec.cmmn.dc.impl.DCPackageImpl#getRgbObject()
		 * @generated
		 */
		EDataType RGB_OBJECT = eINSTANCE.getRgbObject();

	}

} //DCPackage
