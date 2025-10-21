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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.FontType;
import de.online.adv.namespaces.adv.sk.xml.skadv.HaloType;
import de.online.adv.namespaces.adv.sk.xml.skadv.HorizontalAlignmentType;
import de.online.adv.namespaces.adv.sk.xml.skadv.LabelTextType;
import de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3;
import de.online.adv.namespaces.adv.sk.xml.skadv.TextBodyFillType;
import de.online.adv.namespaces.adv.sk.xml.skadv.TextDecorationType;
import de.online.adv.namespaces.adv.sk.xml.skadv.VerticalAlignmentType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.LabelType3Impl#getLabelText <em>Label Text</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.LabelType3Impl#getSize <em>Size</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.LabelType3Impl#getTextDecoration <em>Text Decoration</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.LabelType3Impl#getSpacing <em>Spacing</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.LabelType3Impl#getScalefactor <em>Scalefactor</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.LabelType3Impl#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.LabelType3Impl#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.LabelType3Impl#getFont <em>Font</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.LabelType3Impl#getTextBodyFill <em>Text Body Fill</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.LabelType3Impl#getHalo <em>Halo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelType3Impl extends MinimalEObjectImpl.Container implements LabelType3 {
	/**
	 * The cached value of the '{@link #getLabelText() <em>Label Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelText()
	 * @generated
	 * @ordered
	 */
	protected LabelTextType labelText;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final double SIZE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected double size = SIZE_EDEFAULT;

	/**
	 * This is true if the Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeESet;

	/**
	 * The default value of the '{@link #getTextDecoration() <em>Text Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextDecoration()
	 * @generated
	 * @ordered
	 */
	protected static final TextDecorationType TEXT_DECORATION_EDEFAULT = TextDecorationType.NONE;

	/**
	 * The cached value of the '{@link #getTextDecoration() <em>Text Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextDecoration()
	 * @generated
	 * @ordered
	 */
	protected TextDecorationType textDecoration = TEXT_DECORATION_EDEFAULT;

	/**
	 * This is true if the Text Decoration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textDecorationESet;

	/**
	 * The default value of the '{@link #getSpacing() <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final double SPACING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpacing() <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacing()
	 * @generated
	 * @ordered
	 */
	protected double spacing = SPACING_EDEFAULT;

	/**
	 * This is true if the Spacing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spacingESet;

	/**
	 * The default value of the '{@link #getScalefactor() <em>Scalefactor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalefactor()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALEFACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScalefactor() <em>Scalefactor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalefactor()
	 * @generated
	 * @ordered
	 */
	protected double scalefactor = SCALEFACTOR_EDEFAULT;

	/**
	 * This is true if the Scalefactor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scalefactorESet;

	/**
	 * The default value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final HorizontalAlignmentType HORIZONTAL_ALIGNMENT_EDEFAULT = HorizontalAlignmentType.LEFT;

	/**
	 * The cached value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected HorizontalAlignmentType horizontalAlignment = HORIZONTAL_ALIGNMENT_EDEFAULT;

	/**
	 * This is true if the Horizontal Alignment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean horizontalAlignmentESet;

	/**
	 * The default value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final VerticalAlignmentType VERTICAL_ALIGNMENT_EDEFAULT = VerticalAlignmentType.TOP;

	/**
	 * The cached value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected VerticalAlignmentType verticalAlignment = VERTICAL_ALIGNMENT_EDEFAULT;

	/**
	 * This is true if the Vertical Alignment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verticalAlignmentESet;

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected FontType font;

	/**
	 * The cached value of the '{@link #getTextBodyFill() <em>Text Body Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextBodyFill()
	 * @generated
	 * @ordered
	 */
	protected TextBodyFillType textBodyFill;

	/**
	 * The cached value of the '{@link #getHalo() <em>Halo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHalo()
	 * @generated
	 * @ordered
	 */
	protected HaloType halo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelType3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getLabelType3();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelTextType getLabelText() {
		return labelText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelText(LabelTextType newLabelText, NotificationChain msgs) {
		LabelTextType oldLabelText = labelText;
		labelText = newLabelText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.LABEL_TYPE3__LABEL_TEXT, oldLabelText, newLabelText);
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
	public void setLabelText(LabelTextType newLabelText) {
		if (newLabelText != labelText) {
			NotificationChain msgs = null;
			if (labelText != null)
				msgs = ((InternalEObject)labelText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.LABEL_TYPE3__LABEL_TEXT, null, msgs);
			if (newLabelText != null)
				msgs = ((InternalEObject)newLabelText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.LABEL_TYPE3__LABEL_TEXT, null, msgs);
			msgs = basicSetLabelText(newLabelText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.LABEL_TYPE3__LABEL_TEXT, newLabelText, newLabelText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(double newSize) {
		double oldSize = size;
		size = newSize;
		boolean oldSizeESet = sizeESet;
		sizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.LABEL_TYPE3__SIZE, oldSize, size, !oldSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSize() {
		double oldSize = size;
		boolean oldSizeESet = sizeESet;
		size = SIZE_EDEFAULT;
		sizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.LABEL_TYPE3__SIZE, oldSize, SIZE_EDEFAULT, oldSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSize() {
		return sizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextDecorationType getTextDecoration() {
		return textDecoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextDecoration(TextDecorationType newTextDecoration) {
		TextDecorationType oldTextDecoration = textDecoration;
		textDecoration = newTextDecoration == null ? TEXT_DECORATION_EDEFAULT : newTextDecoration;
		boolean oldTextDecorationESet = textDecorationESet;
		textDecorationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.LABEL_TYPE3__TEXT_DECORATION, oldTextDecoration, textDecoration, !oldTextDecorationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTextDecoration() {
		TextDecorationType oldTextDecoration = textDecoration;
		boolean oldTextDecorationESet = textDecorationESet;
		textDecoration = TEXT_DECORATION_EDEFAULT;
		textDecorationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.LABEL_TYPE3__TEXT_DECORATION, oldTextDecoration, TEXT_DECORATION_EDEFAULT, oldTextDecorationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTextDecoration() {
		return textDecorationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSpacing() {
		return spacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpacing(double newSpacing) {
		double oldSpacing = spacing;
		spacing = newSpacing;
		boolean oldSpacingESet = spacingESet;
		spacingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.LABEL_TYPE3__SPACING, oldSpacing, spacing, !oldSpacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSpacing() {
		double oldSpacing = spacing;
		boolean oldSpacingESet = spacingESet;
		spacing = SPACING_EDEFAULT;
		spacingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.LABEL_TYPE3__SPACING, oldSpacing, SPACING_EDEFAULT, oldSpacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSpacing() {
		return spacingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getScalefactor() {
		return scalefactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScalefactor(double newScalefactor) {
		double oldScalefactor = scalefactor;
		scalefactor = newScalefactor;
		boolean oldScalefactorESet = scalefactorESet;
		scalefactorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.LABEL_TYPE3__SCALEFACTOR, oldScalefactor, scalefactor, !oldScalefactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetScalefactor() {
		double oldScalefactor = scalefactor;
		boolean oldScalefactorESet = scalefactorESet;
		scalefactor = SCALEFACTOR_EDEFAULT;
		scalefactorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.LABEL_TYPE3__SCALEFACTOR, oldScalefactor, SCALEFACTOR_EDEFAULT, oldScalefactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetScalefactor() {
		return scalefactorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HorizontalAlignmentType getHorizontalAlignment() {
		return horizontalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHorizontalAlignment(HorizontalAlignmentType newHorizontalAlignment) {
		HorizontalAlignmentType oldHorizontalAlignment = horizontalAlignment;
		horizontalAlignment = newHorizontalAlignment == null ? HORIZONTAL_ALIGNMENT_EDEFAULT : newHorizontalAlignment;
		boolean oldHorizontalAlignmentESet = horizontalAlignmentESet;
		horizontalAlignmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.LABEL_TYPE3__HORIZONTAL_ALIGNMENT, oldHorizontalAlignment, horizontalAlignment, !oldHorizontalAlignmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHorizontalAlignment() {
		HorizontalAlignmentType oldHorizontalAlignment = horizontalAlignment;
		boolean oldHorizontalAlignmentESet = horizontalAlignmentESet;
		horizontalAlignment = HORIZONTAL_ALIGNMENT_EDEFAULT;
		horizontalAlignmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.LABEL_TYPE3__HORIZONTAL_ALIGNMENT, oldHorizontalAlignment, HORIZONTAL_ALIGNMENT_EDEFAULT, oldHorizontalAlignmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHorizontalAlignment() {
		return horizontalAlignmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalAlignmentType getVerticalAlignment() {
		return verticalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalAlignment(VerticalAlignmentType newVerticalAlignment) {
		VerticalAlignmentType oldVerticalAlignment = verticalAlignment;
		verticalAlignment = newVerticalAlignment == null ? VERTICAL_ALIGNMENT_EDEFAULT : newVerticalAlignment;
		boolean oldVerticalAlignmentESet = verticalAlignmentESet;
		verticalAlignmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.LABEL_TYPE3__VERTICAL_ALIGNMENT, oldVerticalAlignment, verticalAlignment, !oldVerticalAlignmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVerticalAlignment() {
		VerticalAlignmentType oldVerticalAlignment = verticalAlignment;
		boolean oldVerticalAlignmentESet = verticalAlignmentESet;
		verticalAlignment = VERTICAL_ALIGNMENT_EDEFAULT;
		verticalAlignmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.LABEL_TYPE3__VERTICAL_ALIGNMENT, oldVerticalAlignment, VERTICAL_ALIGNMENT_EDEFAULT, oldVerticalAlignmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVerticalAlignment() {
		return verticalAlignmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FontType getFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFont(FontType newFont, NotificationChain msgs) {
		FontType oldFont = font;
		font = newFont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.LABEL_TYPE3__FONT, oldFont, newFont);
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
	public void setFont(FontType newFont) {
		if (newFont != font) {
			NotificationChain msgs = null;
			if (font != null)
				msgs = ((InternalEObject)font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.LABEL_TYPE3__FONT, null, msgs);
			if (newFont != null)
				msgs = ((InternalEObject)newFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.LABEL_TYPE3__FONT, null, msgs);
			msgs = basicSetFont(newFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.LABEL_TYPE3__FONT, newFont, newFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextBodyFillType getTextBodyFill() {
		return textBodyFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextBodyFill(TextBodyFillType newTextBodyFill, NotificationChain msgs) {
		TextBodyFillType oldTextBodyFill = textBodyFill;
		textBodyFill = newTextBodyFill;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.LABEL_TYPE3__TEXT_BODY_FILL, oldTextBodyFill, newTextBodyFill);
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
	public void setTextBodyFill(TextBodyFillType newTextBodyFill) {
		if (newTextBodyFill != textBodyFill) {
			NotificationChain msgs = null;
			if (textBodyFill != null)
				msgs = ((InternalEObject)textBodyFill).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.LABEL_TYPE3__TEXT_BODY_FILL, null, msgs);
			if (newTextBodyFill != null)
				msgs = ((InternalEObject)newTextBodyFill).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.LABEL_TYPE3__TEXT_BODY_FILL, null, msgs);
			msgs = basicSetTextBodyFill(newTextBodyFill, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.LABEL_TYPE3__TEXT_BODY_FILL, newTextBodyFill, newTextBodyFill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HaloType getHalo() {
		return halo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHalo(HaloType newHalo, NotificationChain msgs) {
		HaloType oldHalo = halo;
		halo = newHalo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.LABEL_TYPE3__HALO, oldHalo, newHalo);
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
	public void setHalo(HaloType newHalo) {
		if (newHalo != halo) {
			NotificationChain msgs = null;
			if (halo != null)
				msgs = ((InternalEObject)halo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.LABEL_TYPE3__HALO, null, msgs);
			if (newHalo != null)
				msgs = ((InternalEObject)newHalo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.LABEL_TYPE3__HALO, null, msgs);
			msgs = basicSetHalo(newHalo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.LABEL_TYPE3__HALO, newHalo, newHalo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.LABEL_TYPE3__LABEL_TEXT:
				return basicSetLabelText(null, msgs);
			case AAAPackage.LABEL_TYPE3__FONT:
				return basicSetFont(null, msgs);
			case AAAPackage.LABEL_TYPE3__TEXT_BODY_FILL:
				return basicSetTextBodyFill(null, msgs);
			case AAAPackage.LABEL_TYPE3__HALO:
				return basicSetHalo(null, msgs);
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
			case AAAPackage.LABEL_TYPE3__LABEL_TEXT:
				return getLabelText();
			case AAAPackage.LABEL_TYPE3__SIZE:
				return getSize();
			case AAAPackage.LABEL_TYPE3__TEXT_DECORATION:
				return getTextDecoration();
			case AAAPackage.LABEL_TYPE3__SPACING:
				return getSpacing();
			case AAAPackage.LABEL_TYPE3__SCALEFACTOR:
				return getScalefactor();
			case AAAPackage.LABEL_TYPE3__HORIZONTAL_ALIGNMENT:
				return getHorizontalAlignment();
			case AAAPackage.LABEL_TYPE3__VERTICAL_ALIGNMENT:
				return getVerticalAlignment();
			case AAAPackage.LABEL_TYPE3__FONT:
				return getFont();
			case AAAPackage.LABEL_TYPE3__TEXT_BODY_FILL:
				return getTextBodyFill();
			case AAAPackage.LABEL_TYPE3__HALO:
				return getHalo();
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
			case AAAPackage.LABEL_TYPE3__LABEL_TEXT:
				setLabelText((LabelTextType)newValue);
				return;
			case AAAPackage.LABEL_TYPE3__SIZE:
				setSize((Double)newValue);
				return;
			case AAAPackage.LABEL_TYPE3__TEXT_DECORATION:
				setTextDecoration((TextDecorationType)newValue);
				return;
			case AAAPackage.LABEL_TYPE3__SPACING:
				setSpacing((Double)newValue);
				return;
			case AAAPackage.LABEL_TYPE3__SCALEFACTOR:
				setScalefactor((Double)newValue);
				return;
			case AAAPackage.LABEL_TYPE3__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment((HorizontalAlignmentType)newValue);
				return;
			case AAAPackage.LABEL_TYPE3__VERTICAL_ALIGNMENT:
				setVerticalAlignment((VerticalAlignmentType)newValue);
				return;
			case AAAPackage.LABEL_TYPE3__FONT:
				setFont((FontType)newValue);
				return;
			case AAAPackage.LABEL_TYPE3__TEXT_BODY_FILL:
				setTextBodyFill((TextBodyFillType)newValue);
				return;
			case AAAPackage.LABEL_TYPE3__HALO:
				setHalo((HaloType)newValue);
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
			case AAAPackage.LABEL_TYPE3__LABEL_TEXT:
				setLabelText((LabelTextType)null);
				return;
			case AAAPackage.LABEL_TYPE3__SIZE:
				unsetSize();
				return;
			case AAAPackage.LABEL_TYPE3__TEXT_DECORATION:
				unsetTextDecoration();
				return;
			case AAAPackage.LABEL_TYPE3__SPACING:
				unsetSpacing();
				return;
			case AAAPackage.LABEL_TYPE3__SCALEFACTOR:
				unsetScalefactor();
				return;
			case AAAPackage.LABEL_TYPE3__HORIZONTAL_ALIGNMENT:
				unsetHorizontalAlignment();
				return;
			case AAAPackage.LABEL_TYPE3__VERTICAL_ALIGNMENT:
				unsetVerticalAlignment();
				return;
			case AAAPackage.LABEL_TYPE3__FONT:
				setFont((FontType)null);
				return;
			case AAAPackage.LABEL_TYPE3__TEXT_BODY_FILL:
				setTextBodyFill((TextBodyFillType)null);
				return;
			case AAAPackage.LABEL_TYPE3__HALO:
				setHalo((HaloType)null);
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
			case AAAPackage.LABEL_TYPE3__LABEL_TEXT:
				return labelText != null;
			case AAAPackage.LABEL_TYPE3__SIZE:
				return isSetSize();
			case AAAPackage.LABEL_TYPE3__TEXT_DECORATION:
				return isSetTextDecoration();
			case AAAPackage.LABEL_TYPE3__SPACING:
				return isSetSpacing();
			case AAAPackage.LABEL_TYPE3__SCALEFACTOR:
				return isSetScalefactor();
			case AAAPackage.LABEL_TYPE3__HORIZONTAL_ALIGNMENT:
				return isSetHorizontalAlignment();
			case AAAPackage.LABEL_TYPE3__VERTICAL_ALIGNMENT:
				return isSetVerticalAlignment();
			case AAAPackage.LABEL_TYPE3__FONT:
				return font != null;
			case AAAPackage.LABEL_TYPE3__TEXT_BODY_FILL:
				return textBodyFill != null;
			case AAAPackage.LABEL_TYPE3__HALO:
				return halo != null;
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
		result.append(" (size: ");
		if (sizeESet) result.append(size); else result.append("<unset>");
		result.append(", textDecoration: ");
		if (textDecorationESet) result.append(textDecoration); else result.append("<unset>");
		result.append(", spacing: ");
		if (spacingESet) result.append(spacing); else result.append("<unset>");
		result.append(", scalefactor: ");
		if (scalefactorESet) result.append(scalefactor); else result.append("<unset>");
		result.append(", horizontalAlignment: ");
		if (horizontalAlignmentESet) result.append(horizontalAlignment); else result.append("<unset>");
		result.append(", verticalAlignment: ");
		if (verticalAlignmentESet) result.append(verticalAlignment); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LabelType3Impl
