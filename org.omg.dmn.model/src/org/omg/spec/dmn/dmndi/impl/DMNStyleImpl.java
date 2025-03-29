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
package org.omg.spec.dmn.dmndi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.spec.dmn.dc.AlignmentKind;
import org.omg.spec.dmn.dc.Color;

import org.omg.spec.dmn.di.impl.StyleImpl;

import org.omg.spec.dmn.dmndi.DMNDIPackage;
import org.omg.spec.dmn.dmndi.DMNStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DMN Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNStyleImpl#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNStyleImpl#getStrokeColor <em>Stroke Color</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNStyleImpl#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNStyleImpl#isFontBold <em>Font Bold</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNStyleImpl#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNStyleImpl#isFontItalic <em>Font Italic</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNStyleImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNStyleImpl#isFontStrikeThrough <em>Font Strike Through</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNStyleImpl#isFontUnderline <em>Font Underline</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNStyleImpl#getLabelHorizontalAlignement <em>Label Horizontal Alignement</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNStyleImpl#getLabelVerticalAlignment <em>Label Vertical Alignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DMNStyleImpl extends StyleImpl implements DMNStyle {
	/**
	 * The cached value of the '{@link #getFillColor() <em>Fill Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
	protected Color fillColor;

	/**
	 * The cached value of the '{@link #getStrokeColor() <em>Stroke Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeColor()
	 * @generated
	 * @ordered
	 */
	protected Color strokeColor;

	/**
	 * The cached value of the '{@link #getFontColor() <em>Font Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontColor()
	 * @generated
	 * @ordered
	 */
	protected Color fontColor;

	/**
	 * The default value of the '{@link #isFontBold() <em>Font Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFontBold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FONT_BOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFontBold() <em>Font Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFontBold()
	 * @generated
	 * @ordered
	 */
	protected boolean fontBold = FONT_BOLD_EDEFAULT;

	/**
	 * This is true if the Font Bold attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontBoldESet;

	/**
	 * The default value of the '{@link #getFontFamily() <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontFamily() <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamily()
	 * @generated
	 * @ordered
	 */
	protected String fontFamily = FONT_FAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #isFontItalic() <em>Font Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFontItalic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FONT_ITALIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFontItalic() <em>Font Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFontItalic()
	 * @generated
	 * @ordered
	 */
	protected boolean fontItalic = FONT_ITALIC_EDEFAULT;

	/**
	 * This is true if the Font Italic attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontItalicESet;

	/**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final double FONT_SIZE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected double fontSize = FONT_SIZE_EDEFAULT;

	/**
	 * This is true if the Font Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontSizeESet;

	/**
	 * The default value of the '{@link #isFontStrikeThrough() <em>Font Strike Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFontStrikeThrough()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FONT_STRIKE_THROUGH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFontStrikeThrough() <em>Font Strike Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFontStrikeThrough()
	 * @generated
	 * @ordered
	 */
	protected boolean fontStrikeThrough = FONT_STRIKE_THROUGH_EDEFAULT;

	/**
	 * This is true if the Font Strike Through attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontStrikeThroughESet;

	/**
	 * The default value of the '{@link #isFontUnderline() <em>Font Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFontUnderline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FONT_UNDERLINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFontUnderline() <em>Font Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFontUnderline()
	 * @generated
	 * @ordered
	 */
	protected boolean fontUnderline = FONT_UNDERLINE_EDEFAULT;

	/**
	 * This is true if the Font Underline attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontUnderlineESet;

	/**
	 * The default value of the '{@link #getLabelHorizontalAlignement() <em>Label Horizontal Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelHorizontalAlignement()
	 * @generated
	 * @ordered
	 */
	protected static final AlignmentKind LABEL_HORIZONTAL_ALIGNEMENT_EDEFAULT = AlignmentKind.START;

	/**
	 * The cached value of the '{@link #getLabelHorizontalAlignement() <em>Label Horizontal Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelHorizontalAlignement()
	 * @generated
	 * @ordered
	 */
	protected AlignmentKind labelHorizontalAlignement = LABEL_HORIZONTAL_ALIGNEMENT_EDEFAULT;

	/**
	 * This is true if the Label Horizontal Alignement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean labelHorizontalAlignementESet;

	/**
	 * The default value of the '{@link #getLabelVerticalAlignment() <em>Label Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final AlignmentKind LABEL_VERTICAL_ALIGNMENT_EDEFAULT = AlignmentKind.START;

	/**
	 * The cached value of the '{@link #getLabelVerticalAlignment() <em>Label Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected AlignmentKind labelVerticalAlignment = LABEL_VERTICAL_ALIGNMENT_EDEFAULT;

	/**
	 * This is true if the Label Vertical Alignment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean labelVerticalAlignmentESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DMNStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNDIPackage.Literals.DMN_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getFillColor() {
		return fillColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFillColor(Color newFillColor, NotificationChain msgs) {
		Color oldFillColor = fillColor;
		fillColor = newFillColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_STYLE__FILL_COLOR, oldFillColor, newFillColor);
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
	public void setFillColor(Color newFillColor) {
		if (newFillColor != fillColor) {
			NotificationChain msgs = null;
			if (fillColor != null)
				msgs = ((InternalEObject)fillColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNDIPackage.DMN_STYLE__FILL_COLOR, null, msgs);
			if (newFillColor != null)
				msgs = ((InternalEObject)newFillColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNDIPackage.DMN_STYLE__FILL_COLOR, null, msgs);
			msgs = basicSetFillColor(newFillColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_STYLE__FILL_COLOR, newFillColor, newFillColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getStrokeColor() {
		return strokeColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrokeColor(Color newStrokeColor, NotificationChain msgs) {
		Color oldStrokeColor = strokeColor;
		strokeColor = newStrokeColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_STYLE__STROKE_COLOR, oldStrokeColor, newStrokeColor);
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
	public void setStrokeColor(Color newStrokeColor) {
		if (newStrokeColor != strokeColor) {
			NotificationChain msgs = null;
			if (strokeColor != null)
				msgs = ((InternalEObject)strokeColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNDIPackage.DMN_STYLE__STROKE_COLOR, null, msgs);
			if (newStrokeColor != null)
				msgs = ((InternalEObject)newStrokeColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNDIPackage.DMN_STYLE__STROKE_COLOR, null, msgs);
			msgs = basicSetStrokeColor(newStrokeColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_STYLE__STROKE_COLOR, newStrokeColor, newStrokeColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getFontColor() {
		return fontColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFontColor(Color newFontColor, NotificationChain msgs) {
		Color oldFontColor = fontColor;
		fontColor = newFontColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_STYLE__FONT_COLOR, oldFontColor, newFontColor);
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
	public void setFontColor(Color newFontColor) {
		if (newFontColor != fontColor) {
			NotificationChain msgs = null;
			if (fontColor != null)
				msgs = ((InternalEObject)fontColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNDIPackage.DMN_STYLE__FONT_COLOR, null, msgs);
			if (newFontColor != null)
				msgs = ((InternalEObject)newFontColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNDIPackage.DMN_STYLE__FONT_COLOR, null, msgs);
			msgs = basicSetFontColor(newFontColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_STYLE__FONT_COLOR, newFontColor, newFontColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFontBold() {
		return fontBold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontBold(boolean newFontBold) {
		boolean oldFontBold = fontBold;
		fontBold = newFontBold;
		boolean oldFontBoldESet = fontBoldESet;
		fontBoldESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_STYLE__FONT_BOLD, oldFontBold, fontBold, !oldFontBoldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFontBold() {
		boolean oldFontBold = fontBold;
		boolean oldFontBoldESet = fontBoldESet;
		fontBold = FONT_BOLD_EDEFAULT;
		fontBoldESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DMNDIPackage.DMN_STYLE__FONT_BOLD, oldFontBold, FONT_BOLD_EDEFAULT, oldFontBoldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFontBold() {
		return fontBoldESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFontFamily() {
		return fontFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontFamily(String newFontFamily) {
		String oldFontFamily = fontFamily;
		fontFamily = newFontFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_STYLE__FONT_FAMILY, oldFontFamily, fontFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFontItalic() {
		return fontItalic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontItalic(boolean newFontItalic) {
		boolean oldFontItalic = fontItalic;
		fontItalic = newFontItalic;
		boolean oldFontItalicESet = fontItalicESet;
		fontItalicESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_STYLE__FONT_ITALIC, oldFontItalic, fontItalic, !oldFontItalicESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFontItalic() {
		boolean oldFontItalic = fontItalic;
		boolean oldFontItalicESet = fontItalicESet;
		fontItalic = FONT_ITALIC_EDEFAULT;
		fontItalicESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DMNDIPackage.DMN_STYLE__FONT_ITALIC, oldFontItalic, FONT_ITALIC_EDEFAULT, oldFontItalicESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFontItalic() {
		return fontItalicESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFontSize() {
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontSize(double newFontSize) {
		double oldFontSize = fontSize;
		fontSize = newFontSize;
		boolean oldFontSizeESet = fontSizeESet;
		fontSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_STYLE__FONT_SIZE, oldFontSize, fontSize, !oldFontSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFontSize() {
		double oldFontSize = fontSize;
		boolean oldFontSizeESet = fontSizeESet;
		fontSize = FONT_SIZE_EDEFAULT;
		fontSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DMNDIPackage.DMN_STYLE__FONT_SIZE, oldFontSize, FONT_SIZE_EDEFAULT, oldFontSizeESet));
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
	public boolean isFontStrikeThrough() {
		return fontStrikeThrough;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontStrikeThrough(boolean newFontStrikeThrough) {
		boolean oldFontStrikeThrough = fontStrikeThrough;
		fontStrikeThrough = newFontStrikeThrough;
		boolean oldFontStrikeThroughESet = fontStrikeThroughESet;
		fontStrikeThroughESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_STYLE__FONT_STRIKE_THROUGH, oldFontStrikeThrough, fontStrikeThrough, !oldFontStrikeThroughESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFontStrikeThrough() {
		boolean oldFontStrikeThrough = fontStrikeThrough;
		boolean oldFontStrikeThroughESet = fontStrikeThroughESet;
		fontStrikeThrough = FONT_STRIKE_THROUGH_EDEFAULT;
		fontStrikeThroughESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DMNDIPackage.DMN_STYLE__FONT_STRIKE_THROUGH, oldFontStrikeThrough, FONT_STRIKE_THROUGH_EDEFAULT, oldFontStrikeThroughESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFontStrikeThrough() {
		return fontStrikeThroughESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFontUnderline() {
		return fontUnderline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontUnderline(boolean newFontUnderline) {
		boolean oldFontUnderline = fontUnderline;
		fontUnderline = newFontUnderline;
		boolean oldFontUnderlineESet = fontUnderlineESet;
		fontUnderlineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_STYLE__FONT_UNDERLINE, oldFontUnderline, fontUnderline, !oldFontUnderlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFontUnderline() {
		boolean oldFontUnderline = fontUnderline;
		boolean oldFontUnderlineESet = fontUnderlineESet;
		fontUnderline = FONT_UNDERLINE_EDEFAULT;
		fontUnderlineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DMNDIPackage.DMN_STYLE__FONT_UNDERLINE, oldFontUnderline, FONT_UNDERLINE_EDEFAULT, oldFontUnderlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFontUnderline() {
		return fontUnderlineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlignmentKind getLabelHorizontalAlignement() {
		return labelHorizontalAlignement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelHorizontalAlignement(AlignmentKind newLabelHorizontalAlignement) {
		AlignmentKind oldLabelHorizontalAlignement = labelHorizontalAlignement;
		labelHorizontalAlignement = newLabelHorizontalAlignement == null ? LABEL_HORIZONTAL_ALIGNEMENT_EDEFAULT : newLabelHorizontalAlignement;
		boolean oldLabelHorizontalAlignementESet = labelHorizontalAlignementESet;
		labelHorizontalAlignementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_STYLE__LABEL_HORIZONTAL_ALIGNEMENT, oldLabelHorizontalAlignement, labelHorizontalAlignement, !oldLabelHorizontalAlignementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLabelHorizontalAlignement() {
		AlignmentKind oldLabelHorizontalAlignement = labelHorizontalAlignement;
		boolean oldLabelHorizontalAlignementESet = labelHorizontalAlignementESet;
		labelHorizontalAlignement = LABEL_HORIZONTAL_ALIGNEMENT_EDEFAULT;
		labelHorizontalAlignementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DMNDIPackage.DMN_STYLE__LABEL_HORIZONTAL_ALIGNEMENT, oldLabelHorizontalAlignement, LABEL_HORIZONTAL_ALIGNEMENT_EDEFAULT, oldLabelHorizontalAlignementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLabelHorizontalAlignement() {
		return labelHorizontalAlignementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlignmentKind getLabelVerticalAlignment() {
		return labelVerticalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelVerticalAlignment(AlignmentKind newLabelVerticalAlignment) {
		AlignmentKind oldLabelVerticalAlignment = labelVerticalAlignment;
		labelVerticalAlignment = newLabelVerticalAlignment == null ? LABEL_VERTICAL_ALIGNMENT_EDEFAULT : newLabelVerticalAlignment;
		boolean oldLabelVerticalAlignmentESet = labelVerticalAlignmentESet;
		labelVerticalAlignmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_STYLE__LABEL_VERTICAL_ALIGNMENT, oldLabelVerticalAlignment, labelVerticalAlignment, !oldLabelVerticalAlignmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLabelVerticalAlignment() {
		AlignmentKind oldLabelVerticalAlignment = labelVerticalAlignment;
		boolean oldLabelVerticalAlignmentESet = labelVerticalAlignmentESet;
		labelVerticalAlignment = LABEL_VERTICAL_ALIGNMENT_EDEFAULT;
		labelVerticalAlignmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DMNDIPackage.DMN_STYLE__LABEL_VERTICAL_ALIGNMENT, oldLabelVerticalAlignment, LABEL_VERTICAL_ALIGNMENT_EDEFAULT, oldLabelVerticalAlignmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLabelVerticalAlignment() {
		return labelVerticalAlignmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNDIPackage.DMN_STYLE__FILL_COLOR:
				return basicSetFillColor(null, msgs);
			case DMNDIPackage.DMN_STYLE__STROKE_COLOR:
				return basicSetStrokeColor(null, msgs);
			case DMNDIPackage.DMN_STYLE__FONT_COLOR:
				return basicSetFontColor(null, msgs);
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
			case DMNDIPackage.DMN_STYLE__FILL_COLOR:
				return getFillColor();
			case DMNDIPackage.DMN_STYLE__STROKE_COLOR:
				return getStrokeColor();
			case DMNDIPackage.DMN_STYLE__FONT_COLOR:
				return getFontColor();
			case DMNDIPackage.DMN_STYLE__FONT_BOLD:
				return isFontBold();
			case DMNDIPackage.DMN_STYLE__FONT_FAMILY:
				return getFontFamily();
			case DMNDIPackage.DMN_STYLE__FONT_ITALIC:
				return isFontItalic();
			case DMNDIPackage.DMN_STYLE__FONT_SIZE:
				return getFontSize();
			case DMNDIPackage.DMN_STYLE__FONT_STRIKE_THROUGH:
				return isFontStrikeThrough();
			case DMNDIPackage.DMN_STYLE__FONT_UNDERLINE:
				return isFontUnderline();
			case DMNDIPackage.DMN_STYLE__LABEL_HORIZONTAL_ALIGNEMENT:
				return getLabelHorizontalAlignement();
			case DMNDIPackage.DMN_STYLE__LABEL_VERTICAL_ALIGNMENT:
				return getLabelVerticalAlignment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DMNDIPackage.DMN_STYLE__FILL_COLOR:
				setFillColor((Color)newValue);
				return;
			case DMNDIPackage.DMN_STYLE__STROKE_COLOR:
				setStrokeColor((Color)newValue);
				return;
			case DMNDIPackage.DMN_STYLE__FONT_COLOR:
				setFontColor((Color)newValue);
				return;
			case DMNDIPackage.DMN_STYLE__FONT_BOLD:
				setFontBold((Boolean)newValue);
				return;
			case DMNDIPackage.DMN_STYLE__FONT_FAMILY:
				setFontFamily((String)newValue);
				return;
			case DMNDIPackage.DMN_STYLE__FONT_ITALIC:
				setFontItalic((Boolean)newValue);
				return;
			case DMNDIPackage.DMN_STYLE__FONT_SIZE:
				setFontSize((Double)newValue);
				return;
			case DMNDIPackage.DMN_STYLE__FONT_STRIKE_THROUGH:
				setFontStrikeThrough((Boolean)newValue);
				return;
			case DMNDIPackage.DMN_STYLE__FONT_UNDERLINE:
				setFontUnderline((Boolean)newValue);
				return;
			case DMNDIPackage.DMN_STYLE__LABEL_HORIZONTAL_ALIGNEMENT:
				setLabelHorizontalAlignement((AlignmentKind)newValue);
				return;
			case DMNDIPackage.DMN_STYLE__LABEL_VERTICAL_ALIGNMENT:
				setLabelVerticalAlignment((AlignmentKind)newValue);
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
			case DMNDIPackage.DMN_STYLE__FILL_COLOR:
				setFillColor((Color)null);
				return;
			case DMNDIPackage.DMN_STYLE__STROKE_COLOR:
				setStrokeColor((Color)null);
				return;
			case DMNDIPackage.DMN_STYLE__FONT_COLOR:
				setFontColor((Color)null);
				return;
			case DMNDIPackage.DMN_STYLE__FONT_BOLD:
				unsetFontBold();
				return;
			case DMNDIPackage.DMN_STYLE__FONT_FAMILY:
				setFontFamily(FONT_FAMILY_EDEFAULT);
				return;
			case DMNDIPackage.DMN_STYLE__FONT_ITALIC:
				unsetFontItalic();
				return;
			case DMNDIPackage.DMN_STYLE__FONT_SIZE:
				unsetFontSize();
				return;
			case DMNDIPackage.DMN_STYLE__FONT_STRIKE_THROUGH:
				unsetFontStrikeThrough();
				return;
			case DMNDIPackage.DMN_STYLE__FONT_UNDERLINE:
				unsetFontUnderline();
				return;
			case DMNDIPackage.DMN_STYLE__LABEL_HORIZONTAL_ALIGNEMENT:
				unsetLabelHorizontalAlignement();
				return;
			case DMNDIPackage.DMN_STYLE__LABEL_VERTICAL_ALIGNMENT:
				unsetLabelVerticalAlignment();
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
			case DMNDIPackage.DMN_STYLE__FILL_COLOR:
				return fillColor != null;
			case DMNDIPackage.DMN_STYLE__STROKE_COLOR:
				return strokeColor != null;
			case DMNDIPackage.DMN_STYLE__FONT_COLOR:
				return fontColor != null;
			case DMNDIPackage.DMN_STYLE__FONT_BOLD:
				return isSetFontBold();
			case DMNDIPackage.DMN_STYLE__FONT_FAMILY:
				return FONT_FAMILY_EDEFAULT == null ? fontFamily != null : !FONT_FAMILY_EDEFAULT.equals(fontFamily);
			case DMNDIPackage.DMN_STYLE__FONT_ITALIC:
				return isSetFontItalic();
			case DMNDIPackage.DMN_STYLE__FONT_SIZE:
				return isSetFontSize();
			case DMNDIPackage.DMN_STYLE__FONT_STRIKE_THROUGH:
				return isSetFontStrikeThrough();
			case DMNDIPackage.DMN_STYLE__FONT_UNDERLINE:
				return isSetFontUnderline();
			case DMNDIPackage.DMN_STYLE__LABEL_HORIZONTAL_ALIGNEMENT:
				return isSetLabelHorizontalAlignement();
			case DMNDIPackage.DMN_STYLE__LABEL_VERTICAL_ALIGNMENT:
				return isSetLabelVerticalAlignment();
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
		result.append(" (fontBold: ");
		if (fontBoldESet) result.append(fontBold); else result.append("<unset>");
		result.append(", fontFamily: ");
		result.append(fontFamily);
		result.append(", fontItalic: ");
		if (fontItalicESet) result.append(fontItalic); else result.append("<unset>");
		result.append(", fontSize: ");
		if (fontSizeESet) result.append(fontSize); else result.append("<unset>");
		result.append(", fontStrikeThrough: ");
		if (fontStrikeThroughESet) result.append(fontStrikeThrough); else result.append("<unset>");
		result.append(", fontUnderline: ");
		if (fontUnderlineESet) result.append(fontUnderline); else result.append("<unset>");
		result.append(", labelHorizontalAlignement: ");
		if (labelHorizontalAlignementESet) result.append(labelHorizontalAlignement); else result.append("<unset>");
		result.append(", labelVerticalAlignment: ");
		if (labelVerticalAlignmentESet) result.append(labelVerticalAlignment); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DMNStyleImpl
