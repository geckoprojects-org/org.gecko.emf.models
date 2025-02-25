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
package org.openmicroscopy.ome.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openmicroscopy.ome.AffineTransform;
import org.openmicroscopy.ome.AnnotationRefType;
import org.openmicroscopy.ome.FillRuleType;
import org.openmicroscopy.ome.FontFamilyType;
import org.openmicroscopy.ome.FontStyleType;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.Shape;
import org.openmicroscopy.ome.UnitsLength;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.ShapeImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ShapeImpl#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ShapeImpl#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ShapeImpl#getFillRule <em>Fill Rule</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ShapeImpl#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ShapeImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ShapeImpl#getFontSizeUnit <em>Font Size Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ShapeImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ShapeImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ShapeImpl#isLocked <em>Locked</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ShapeImpl#getStrokeColor <em>Stroke Color</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ShapeImpl#getStrokeDashArray <em>Stroke Dash Array</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ShapeImpl#getStrokeWidth <em>Stroke Width</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ShapeImpl#getStrokeWidthUnit <em>Stroke Width Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ShapeImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ShapeImpl#getTheC <em>The C</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ShapeImpl#getTheT <em>The T</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ShapeImpl#getTheZ <em>The Z</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShapeImpl extends MinimalEObjectImpl.Container implements Shape {
	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected AffineTransform transform;

	/**
	 * The cached value of the '{@link #getAnnotationRef() <em>Annotation Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationRef()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationRefType> annotationRef;

	/**
	 * The default value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
	protected static final int FILL_COLOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
	protected int fillColor = FILL_COLOR_EDEFAULT;

	/**
	 * This is true if the Fill Color attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fillColorESet;

	/**
	 * The default value of the '{@link #getFillRule() <em>Fill Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillRule()
	 * @generated
	 * @ordered
	 */
	protected static final FillRuleType FILL_RULE_EDEFAULT = FillRuleType.EVEN_ODD;

	/**
	 * The cached value of the '{@link #getFillRule() <em>Fill Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillRule()
	 * @generated
	 * @ordered
	 */
	protected FillRuleType fillRule = FILL_RULE_EDEFAULT;

	/**
	 * This is true if the Fill Rule attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fillRuleESet;

	/**
	 * The default value of the '{@link #getFontFamily() <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamily()
	 * @generated
	 * @ordered
	 */
	protected static final FontFamilyType FONT_FAMILY_EDEFAULT = FontFamilyType.SERIF;

	/**
	 * The cached value of the '{@link #getFontFamily() <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamily()
	 * @generated
	 * @ordered
	 */
	protected FontFamilyType fontFamily = FONT_FAMILY_EDEFAULT;

	/**
	 * This is true if the Font Family attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontFamilyESet;

	/**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final int FONT_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected int fontSize = FONT_SIZE_EDEFAULT;

	/**
	 * This is true if the Font Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontSizeESet;

	/**
	 * The default value of the '{@link #getFontSizeUnit() <em>Font Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSizeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength FONT_SIZE_UNIT_EDEFAULT = UnitsLength.PT;

	/**
	 * The cached value of the '{@link #getFontSizeUnit() <em>Font Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSizeUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength fontSizeUnit = FONT_SIZE_UNIT_EDEFAULT;

	/**
	 * This is true if the Font Size Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontSizeUnitESet;

	/**
	 * The default value of the '{@link #getFontStyle() <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyle()
	 * @generated
	 * @ordered
	 */
	protected static final FontStyleType FONT_STYLE_EDEFAULT = FontStyleType.BOLD;

	/**
	 * The cached value of the '{@link #getFontStyle() <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyle()
	 * @generated
	 * @ordered
	 */
	protected FontStyleType fontStyle = FONT_STYLE_EDEFAULT;

	/**
	 * This is true if the Font Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontStyleESet;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocked()
	 * @generated
	 * @ordered
	 */
	protected boolean locked = LOCKED_EDEFAULT;

	/**
	 * This is true if the Locked attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lockedESet;

	/**
	 * The default value of the '{@link #getStrokeColor() <em>Stroke Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeColor()
	 * @generated
	 * @ordered
	 */
	protected static final int STROKE_COLOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStrokeColor() <em>Stroke Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeColor()
	 * @generated
	 * @ordered
	 */
	protected int strokeColor = STROKE_COLOR_EDEFAULT;

	/**
	 * This is true if the Stroke Color attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeColorESet;

	/**
	 * The default value of the '{@link #getStrokeDashArray() <em>Stroke Dash Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDashArray()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_DASH_ARRAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrokeDashArray() <em>Stroke Dash Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDashArray()
	 * @generated
	 * @ordered
	 */
	protected String strokeDashArray = STROKE_DASH_ARRAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrokeWidth() <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected static final float STROKE_WIDTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStrokeWidth() <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected float strokeWidth = STROKE_WIDTH_EDEFAULT;

	/**
	 * This is true if the Stroke Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeWidthESet;

	/**
	 * The default value of the '{@link #getStrokeWidthUnit() <em>Stroke Width Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeWidthUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength STROKE_WIDTH_UNIT_EDEFAULT = UnitsLength.PIXEL;

	/**
	 * The cached value of the '{@link #getStrokeWidthUnit() <em>Stroke Width Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeWidthUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength strokeWidthUnit = STROKE_WIDTH_UNIT_EDEFAULT;

	/**
	 * This is true if the Stroke Width Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeWidthUnitESet;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTheC() <em>The C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheC()
	 * @generated
	 * @ordered
	 */
	protected static final int THE_C_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTheC() <em>The C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheC()
	 * @generated
	 * @ordered
	 */
	protected int theC = THE_C_EDEFAULT;

	/**
	 * This is true if the The C attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean theCESet;

	/**
	 * The default value of the '{@link #getTheT() <em>The T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheT()
	 * @generated
	 * @ordered
	 */
	protected static final int THE_T_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTheT() <em>The T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheT()
	 * @generated
	 * @ordered
	 */
	protected int theT = THE_T_EDEFAULT;

	/**
	 * This is true if the The T attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean theTESet;

	/**
	 * The default value of the '{@link #getTheZ() <em>The Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheZ()
	 * @generated
	 * @ordered
	 */
	protected static final int THE_Z_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTheZ() <em>The Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheZ()
	 * @generated
	 * @ordered
	 */
	protected int theZ = THE_Z_EDEFAULT;

	/**
	 * This is true if the The Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean theZESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getShape();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffineTransform getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransform(AffineTransform newTransform, NotificationChain msgs) {
		AffineTransform oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.SHAPE__TRANSFORM, oldTransform, newTransform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransform(AffineTransform newTransform) {
		if (newTransform != transform) {
			NotificationChain msgs = null;
			if (transform != null)
				msgs = ((InternalEObject)transform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.SHAPE__TRANSFORM, null, msgs);
			if (newTransform != null)
				msgs = ((InternalEObject)newTransform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.SHAPE__TRANSFORM, null, msgs);
			msgs = basicSetTransform(newTransform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SHAPE__TRANSFORM, newTransform, newTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationRefType> getAnnotationRef() {
		if (annotationRef == null) {
			annotationRef = new EObjectContainmentEList<AnnotationRefType>(AnnotationRefType.class, this, OMEPackage.SHAPE__ANNOTATION_REF);
		}
		return annotationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFillColor() {
		return fillColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFillColor(int newFillColor) {
		int oldFillColor = fillColor;
		fillColor = newFillColor;
		boolean oldFillColorESet = fillColorESet;
		fillColorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SHAPE__FILL_COLOR, oldFillColor, fillColor, !oldFillColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFillColor() {
		int oldFillColor = fillColor;
		boolean oldFillColorESet = fillColorESet;
		fillColor = FILL_COLOR_EDEFAULT;
		fillColorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.SHAPE__FILL_COLOR, oldFillColor, FILL_COLOR_EDEFAULT, oldFillColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFillColor() {
		return fillColorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FillRuleType getFillRule() {
		return fillRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFillRule(FillRuleType newFillRule) {
		FillRuleType oldFillRule = fillRule;
		fillRule = newFillRule == null ? FILL_RULE_EDEFAULT : newFillRule;
		boolean oldFillRuleESet = fillRuleESet;
		fillRuleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SHAPE__FILL_RULE, oldFillRule, fillRule, !oldFillRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFillRule() {
		FillRuleType oldFillRule = fillRule;
		boolean oldFillRuleESet = fillRuleESet;
		fillRule = FILL_RULE_EDEFAULT;
		fillRuleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.SHAPE__FILL_RULE, oldFillRule, FILL_RULE_EDEFAULT, oldFillRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFillRule() {
		return fillRuleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FontFamilyType getFontFamily() {
		return fontFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontFamily(FontFamilyType newFontFamily) {
		FontFamilyType oldFontFamily = fontFamily;
		fontFamily = newFontFamily == null ? FONT_FAMILY_EDEFAULT : newFontFamily;
		boolean oldFontFamilyESet = fontFamilyESet;
		fontFamilyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SHAPE__FONT_FAMILY, oldFontFamily, fontFamily, !oldFontFamilyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFontFamily() {
		FontFamilyType oldFontFamily = fontFamily;
		boolean oldFontFamilyESet = fontFamilyESet;
		fontFamily = FONT_FAMILY_EDEFAULT;
		fontFamilyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.SHAPE__FONT_FAMILY, oldFontFamily, FONT_FAMILY_EDEFAULT, oldFontFamilyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFontFamily() {
		return fontFamilyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFontSize() {
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontSize(int newFontSize) {
		int oldFontSize = fontSize;
		fontSize = newFontSize;
		boolean oldFontSizeESet = fontSizeESet;
		fontSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SHAPE__FONT_SIZE, oldFontSize, fontSize, !oldFontSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFontSize() {
		int oldFontSize = fontSize;
		boolean oldFontSizeESet = fontSizeESet;
		fontSize = FONT_SIZE_EDEFAULT;
		fontSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.SHAPE__FONT_SIZE, oldFontSize, FONT_SIZE_EDEFAULT, oldFontSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFontSize() {
		return fontSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getFontSizeUnit() {
		return fontSizeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontSizeUnit(UnitsLength newFontSizeUnit) {
		UnitsLength oldFontSizeUnit = fontSizeUnit;
		fontSizeUnit = newFontSizeUnit == null ? FONT_SIZE_UNIT_EDEFAULT : newFontSizeUnit;
		boolean oldFontSizeUnitESet = fontSizeUnitESet;
		fontSizeUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SHAPE__FONT_SIZE_UNIT, oldFontSizeUnit, fontSizeUnit, !oldFontSizeUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFontSizeUnit() {
		UnitsLength oldFontSizeUnit = fontSizeUnit;
		boolean oldFontSizeUnitESet = fontSizeUnitESet;
		fontSizeUnit = FONT_SIZE_UNIT_EDEFAULT;
		fontSizeUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.SHAPE__FONT_SIZE_UNIT, oldFontSizeUnit, FONT_SIZE_UNIT_EDEFAULT, oldFontSizeUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFontSizeUnit() {
		return fontSizeUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FontStyleType getFontStyle() {
		return fontStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontStyle(FontStyleType newFontStyle) {
		FontStyleType oldFontStyle = fontStyle;
		fontStyle = newFontStyle == null ? FONT_STYLE_EDEFAULT : newFontStyle;
		boolean oldFontStyleESet = fontStyleESet;
		fontStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SHAPE__FONT_STYLE, oldFontStyle, fontStyle, !oldFontStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFontStyle() {
		FontStyleType oldFontStyle = fontStyle;
		boolean oldFontStyleESet = fontStyleESet;
		fontStyle = FONT_STYLE_EDEFAULT;
		fontStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.SHAPE__FONT_STYLE, oldFontStyle, FONT_STYLE_EDEFAULT, oldFontStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFontStyle() {
		return fontStyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SHAPE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLocked() {
		return locked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocked(boolean newLocked) {
		boolean oldLocked = locked;
		locked = newLocked;
		boolean oldLockedESet = lockedESet;
		lockedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SHAPE__LOCKED, oldLocked, locked, !oldLockedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLocked() {
		boolean oldLocked = locked;
		boolean oldLockedESet = lockedESet;
		locked = LOCKED_EDEFAULT;
		lockedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.SHAPE__LOCKED, oldLocked, LOCKED_EDEFAULT, oldLockedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLocked() {
		return lockedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStrokeColor() {
		return strokeColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrokeColor(int newStrokeColor) {
		int oldStrokeColor = strokeColor;
		strokeColor = newStrokeColor;
		boolean oldStrokeColorESet = strokeColorESet;
		strokeColorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SHAPE__STROKE_COLOR, oldStrokeColor, strokeColor, !oldStrokeColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStrokeColor() {
		int oldStrokeColor = strokeColor;
		boolean oldStrokeColorESet = strokeColorESet;
		strokeColor = STROKE_COLOR_EDEFAULT;
		strokeColorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.SHAPE__STROKE_COLOR, oldStrokeColor, STROKE_COLOR_EDEFAULT, oldStrokeColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStrokeColor() {
		return strokeColorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStrokeDashArray() {
		return strokeDashArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrokeDashArray(String newStrokeDashArray) {
		String oldStrokeDashArray = strokeDashArray;
		strokeDashArray = newStrokeDashArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SHAPE__STROKE_DASH_ARRAY, oldStrokeDashArray, strokeDashArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getStrokeWidth() {
		return strokeWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrokeWidth(float newStrokeWidth) {
		float oldStrokeWidth = strokeWidth;
		strokeWidth = newStrokeWidth;
		boolean oldStrokeWidthESet = strokeWidthESet;
		strokeWidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SHAPE__STROKE_WIDTH, oldStrokeWidth, strokeWidth, !oldStrokeWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStrokeWidth() {
		float oldStrokeWidth = strokeWidth;
		boolean oldStrokeWidthESet = strokeWidthESet;
		strokeWidth = STROKE_WIDTH_EDEFAULT;
		strokeWidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.SHAPE__STROKE_WIDTH, oldStrokeWidth, STROKE_WIDTH_EDEFAULT, oldStrokeWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStrokeWidth() {
		return strokeWidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getStrokeWidthUnit() {
		return strokeWidthUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrokeWidthUnit(UnitsLength newStrokeWidthUnit) {
		UnitsLength oldStrokeWidthUnit = strokeWidthUnit;
		strokeWidthUnit = newStrokeWidthUnit == null ? STROKE_WIDTH_UNIT_EDEFAULT : newStrokeWidthUnit;
		boolean oldStrokeWidthUnitESet = strokeWidthUnitESet;
		strokeWidthUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SHAPE__STROKE_WIDTH_UNIT, oldStrokeWidthUnit, strokeWidthUnit, !oldStrokeWidthUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStrokeWidthUnit() {
		UnitsLength oldStrokeWidthUnit = strokeWidthUnit;
		boolean oldStrokeWidthUnitESet = strokeWidthUnitESet;
		strokeWidthUnit = STROKE_WIDTH_UNIT_EDEFAULT;
		strokeWidthUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.SHAPE__STROKE_WIDTH_UNIT, oldStrokeWidthUnit, STROKE_WIDTH_UNIT_EDEFAULT, oldStrokeWidthUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStrokeWidthUnit() {
		return strokeWidthUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SHAPE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTheC() {
		return theC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTheC(int newTheC) {
		int oldTheC = theC;
		theC = newTheC;
		boolean oldTheCESet = theCESet;
		theCESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SHAPE__THE_C, oldTheC, theC, !oldTheCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTheC() {
		int oldTheC = theC;
		boolean oldTheCESet = theCESet;
		theC = THE_C_EDEFAULT;
		theCESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.SHAPE__THE_C, oldTheC, THE_C_EDEFAULT, oldTheCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTheC() {
		return theCESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTheT() {
		return theT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTheT(int newTheT) {
		int oldTheT = theT;
		theT = newTheT;
		boolean oldTheTESet = theTESet;
		theTESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SHAPE__THE_T, oldTheT, theT, !oldTheTESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTheT() {
		int oldTheT = theT;
		boolean oldTheTESet = theTESet;
		theT = THE_T_EDEFAULT;
		theTESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.SHAPE__THE_T, oldTheT, THE_T_EDEFAULT, oldTheTESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTheT() {
		return theTESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTheZ() {
		return theZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTheZ(int newTheZ) {
		int oldTheZ = theZ;
		theZ = newTheZ;
		boolean oldTheZESet = theZESet;
		theZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SHAPE__THE_Z, oldTheZ, theZ, !oldTheZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTheZ() {
		int oldTheZ = theZ;
		boolean oldTheZESet = theZESet;
		theZ = THE_Z_EDEFAULT;
		theZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.SHAPE__THE_Z, oldTheZ, THE_Z_EDEFAULT, oldTheZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTheZ() {
		return theZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.SHAPE__TRANSFORM:
				return basicSetTransform(null, msgs);
			case OMEPackage.SHAPE__ANNOTATION_REF:
				return ((InternalEList<?>)getAnnotationRef()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMEPackage.SHAPE__TRANSFORM:
				return getTransform();
			case OMEPackage.SHAPE__ANNOTATION_REF:
				return getAnnotationRef();
			case OMEPackage.SHAPE__FILL_COLOR:
				return getFillColor();
			case OMEPackage.SHAPE__FILL_RULE:
				return getFillRule();
			case OMEPackage.SHAPE__FONT_FAMILY:
				return getFontFamily();
			case OMEPackage.SHAPE__FONT_SIZE:
				return getFontSize();
			case OMEPackage.SHAPE__FONT_SIZE_UNIT:
				return getFontSizeUnit();
			case OMEPackage.SHAPE__FONT_STYLE:
				return getFontStyle();
			case OMEPackage.SHAPE__ID:
				return getID();
			case OMEPackage.SHAPE__LOCKED:
				return isLocked();
			case OMEPackage.SHAPE__STROKE_COLOR:
				return getStrokeColor();
			case OMEPackage.SHAPE__STROKE_DASH_ARRAY:
				return getStrokeDashArray();
			case OMEPackage.SHAPE__STROKE_WIDTH:
				return getStrokeWidth();
			case OMEPackage.SHAPE__STROKE_WIDTH_UNIT:
				return getStrokeWidthUnit();
			case OMEPackage.SHAPE__TEXT:
				return getText();
			case OMEPackage.SHAPE__THE_C:
				return getTheC();
			case OMEPackage.SHAPE__THE_T:
				return getTheT();
			case OMEPackage.SHAPE__THE_Z:
				return getTheZ();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OMEPackage.SHAPE__TRANSFORM:
				setTransform((AffineTransform)newValue);
				return;
			case OMEPackage.SHAPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				getAnnotationRef().addAll((Collection<? extends AnnotationRefType>)newValue);
				return;
			case OMEPackage.SHAPE__FILL_COLOR:
				setFillColor((Integer)newValue);
				return;
			case OMEPackage.SHAPE__FILL_RULE:
				setFillRule((FillRuleType)newValue);
				return;
			case OMEPackage.SHAPE__FONT_FAMILY:
				setFontFamily((FontFamilyType)newValue);
				return;
			case OMEPackage.SHAPE__FONT_SIZE:
				setFontSize((Integer)newValue);
				return;
			case OMEPackage.SHAPE__FONT_SIZE_UNIT:
				setFontSizeUnit((UnitsLength)newValue);
				return;
			case OMEPackage.SHAPE__FONT_STYLE:
				setFontStyle((FontStyleType)newValue);
				return;
			case OMEPackage.SHAPE__ID:
				setID((String)newValue);
				return;
			case OMEPackage.SHAPE__LOCKED:
				setLocked((Boolean)newValue);
				return;
			case OMEPackage.SHAPE__STROKE_COLOR:
				setStrokeColor((Integer)newValue);
				return;
			case OMEPackage.SHAPE__STROKE_DASH_ARRAY:
				setStrokeDashArray((String)newValue);
				return;
			case OMEPackage.SHAPE__STROKE_WIDTH:
				setStrokeWidth((Float)newValue);
				return;
			case OMEPackage.SHAPE__STROKE_WIDTH_UNIT:
				setStrokeWidthUnit((UnitsLength)newValue);
				return;
			case OMEPackage.SHAPE__TEXT:
				setText((String)newValue);
				return;
			case OMEPackage.SHAPE__THE_C:
				setTheC((Integer)newValue);
				return;
			case OMEPackage.SHAPE__THE_T:
				setTheT((Integer)newValue);
				return;
			case OMEPackage.SHAPE__THE_Z:
				setTheZ((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OMEPackage.SHAPE__TRANSFORM:
				setTransform((AffineTransform)null);
				return;
			case OMEPackage.SHAPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				return;
			case OMEPackage.SHAPE__FILL_COLOR:
				unsetFillColor();
				return;
			case OMEPackage.SHAPE__FILL_RULE:
				unsetFillRule();
				return;
			case OMEPackage.SHAPE__FONT_FAMILY:
				unsetFontFamily();
				return;
			case OMEPackage.SHAPE__FONT_SIZE:
				unsetFontSize();
				return;
			case OMEPackage.SHAPE__FONT_SIZE_UNIT:
				unsetFontSizeUnit();
				return;
			case OMEPackage.SHAPE__FONT_STYLE:
				unsetFontStyle();
				return;
			case OMEPackage.SHAPE__ID:
				setID(ID_EDEFAULT);
				return;
			case OMEPackage.SHAPE__LOCKED:
				unsetLocked();
				return;
			case OMEPackage.SHAPE__STROKE_COLOR:
				unsetStrokeColor();
				return;
			case OMEPackage.SHAPE__STROKE_DASH_ARRAY:
				setStrokeDashArray(STROKE_DASH_ARRAY_EDEFAULT);
				return;
			case OMEPackage.SHAPE__STROKE_WIDTH:
				unsetStrokeWidth();
				return;
			case OMEPackage.SHAPE__STROKE_WIDTH_UNIT:
				unsetStrokeWidthUnit();
				return;
			case OMEPackage.SHAPE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case OMEPackage.SHAPE__THE_C:
				unsetTheC();
				return;
			case OMEPackage.SHAPE__THE_T:
				unsetTheT();
				return;
			case OMEPackage.SHAPE__THE_Z:
				unsetTheZ();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OMEPackage.SHAPE__TRANSFORM:
				return transform != null;
			case OMEPackage.SHAPE__ANNOTATION_REF:
				return annotationRef != null && !annotationRef.isEmpty();
			case OMEPackage.SHAPE__FILL_COLOR:
				return isSetFillColor();
			case OMEPackage.SHAPE__FILL_RULE:
				return isSetFillRule();
			case OMEPackage.SHAPE__FONT_FAMILY:
				return isSetFontFamily();
			case OMEPackage.SHAPE__FONT_SIZE:
				return isSetFontSize();
			case OMEPackage.SHAPE__FONT_SIZE_UNIT:
				return isSetFontSizeUnit();
			case OMEPackage.SHAPE__FONT_STYLE:
				return isSetFontStyle();
			case OMEPackage.SHAPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OMEPackage.SHAPE__LOCKED:
				return isSetLocked();
			case OMEPackage.SHAPE__STROKE_COLOR:
				return isSetStrokeColor();
			case OMEPackage.SHAPE__STROKE_DASH_ARRAY:
				return STROKE_DASH_ARRAY_EDEFAULT == null ? strokeDashArray != null : !STROKE_DASH_ARRAY_EDEFAULT.equals(strokeDashArray);
			case OMEPackage.SHAPE__STROKE_WIDTH:
				return isSetStrokeWidth();
			case OMEPackage.SHAPE__STROKE_WIDTH_UNIT:
				return isSetStrokeWidthUnit();
			case OMEPackage.SHAPE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case OMEPackage.SHAPE__THE_C:
				return isSetTheC();
			case OMEPackage.SHAPE__THE_T:
				return isSetTheT();
			case OMEPackage.SHAPE__THE_Z:
				return isSetTheZ();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (fillColor: ");
		if (fillColorESet) result.append(fillColor); else result.append("<unset>");
		result.append(", fillRule: ");
		if (fillRuleESet) result.append(fillRule); else result.append("<unset>");
		result.append(", fontFamily: ");
		if (fontFamilyESet) result.append(fontFamily); else result.append("<unset>");
		result.append(", fontSize: ");
		if (fontSizeESet) result.append(fontSize); else result.append("<unset>");
		result.append(", fontSizeUnit: ");
		if (fontSizeUnitESet) result.append(fontSizeUnit); else result.append("<unset>");
		result.append(", fontStyle: ");
		if (fontStyleESet) result.append(fontStyle); else result.append("<unset>");
		result.append(", iD: ");
		result.append(iD);
		result.append(", locked: ");
		if (lockedESet) result.append(locked); else result.append("<unset>");
		result.append(", strokeColor: ");
		if (strokeColorESet) result.append(strokeColor); else result.append("<unset>");
		result.append(", strokeDashArray: ");
		result.append(strokeDashArray);
		result.append(", strokeWidth: ");
		if (strokeWidthESet) result.append(strokeWidth); else result.append("<unset>");
		result.append(", strokeWidthUnit: ");
		if (strokeWidthUnitESet) result.append(strokeWidthUnit); else result.append("<unset>");
		result.append(", text: ");
		result.append(text);
		result.append(", theC: ");
		if (theCESet) result.append(theC); else result.append("<unset>");
		result.append(", theT: ");
		if (theTESet) result.append(theT); else result.append("<unset>");
		result.append(", theZ: ");
		if (theZESet) result.append(theZ); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ShapeImpl
