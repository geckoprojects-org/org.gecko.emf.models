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
package org.omg.spec.dd.dc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.omg.spec.dd.dc.DCPackage;
import org.omg.spec.dd.dc.Font;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dd.dc.impl.FontImpl#isIsBold <em>Is Bold</em>}</li>
 *   <li>{@link org.omg.spec.dd.dc.impl.FontImpl#isIsItalic <em>Is Italic</em>}</li>
 *   <li>{@link org.omg.spec.dd.dc.impl.FontImpl#isIsStrikeThrough <em>Is Strike Through</em>}</li>
 *   <li>{@link org.omg.spec.dd.dc.impl.FontImpl#isIsUnderline <em>Is Underline</em>}</li>
 *   <li>{@link org.omg.spec.dd.dc.impl.FontImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.spec.dd.dc.impl.FontImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FontImpl extends MinimalEObjectImpl.Container implements Font {
	/**
	 * The default value of the '{@link #isIsBold() <em>Is Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBold() <em>Is Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBold()
	 * @generated
	 * @ordered
	 */
	protected boolean isBold = IS_BOLD_EDEFAULT;

	/**
	 * This is true if the Is Bold attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isBoldESet;

	/**
	 * The default value of the '{@link #isIsItalic() <em>Is Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsItalic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ITALIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsItalic() <em>Is Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsItalic()
	 * @generated
	 * @ordered
	 */
	protected boolean isItalic = IS_ITALIC_EDEFAULT;

	/**
	 * This is true if the Is Italic attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isItalicESet;

	/**
	 * The default value of the '{@link #isIsStrikeThrough() <em>Is Strike Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStrikeThrough()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STRIKE_THROUGH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStrikeThrough() <em>Is Strike Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStrikeThrough()
	 * @generated
	 * @ordered
	 */
	protected boolean isStrikeThrough = IS_STRIKE_THROUGH_EDEFAULT;

	/**
	 * This is true if the Is Strike Through attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isStrikeThroughESet;

	/**
	 * The default value of the '{@link #isIsUnderline() <em>Is Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnderline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNDERLINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnderline() <em>Is Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnderline()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnderline = IS_UNDERLINE_EDEFAULT;

	/**
	 * This is true if the Is Underline attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isUnderlineESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DCPackage.Literals.FONT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsBold() {
		return isBold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsBold(boolean newIsBold) {
		boolean oldIsBold = isBold;
		isBold = newIsBold;
		boolean oldIsBoldESet = isBoldESet;
		isBoldESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.FONT__IS_BOLD, oldIsBold, isBold, !oldIsBoldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsBold() {
		boolean oldIsBold = isBold;
		boolean oldIsBoldESet = isBoldESet;
		isBold = IS_BOLD_EDEFAULT;
		isBoldESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DCPackage.FONT__IS_BOLD, oldIsBold, IS_BOLD_EDEFAULT, oldIsBoldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsBold() {
		return isBoldESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsItalic() {
		return isItalic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsItalic(boolean newIsItalic) {
		boolean oldIsItalic = isItalic;
		isItalic = newIsItalic;
		boolean oldIsItalicESet = isItalicESet;
		isItalicESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.FONT__IS_ITALIC, oldIsItalic, isItalic, !oldIsItalicESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsItalic() {
		boolean oldIsItalic = isItalic;
		boolean oldIsItalicESet = isItalicESet;
		isItalic = IS_ITALIC_EDEFAULT;
		isItalicESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DCPackage.FONT__IS_ITALIC, oldIsItalic, IS_ITALIC_EDEFAULT, oldIsItalicESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsItalic() {
		return isItalicESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsStrikeThrough() {
		return isStrikeThrough;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsStrikeThrough(boolean newIsStrikeThrough) {
		boolean oldIsStrikeThrough = isStrikeThrough;
		isStrikeThrough = newIsStrikeThrough;
		boolean oldIsStrikeThroughESet = isStrikeThroughESet;
		isStrikeThroughESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.FONT__IS_STRIKE_THROUGH, oldIsStrikeThrough, isStrikeThrough, !oldIsStrikeThroughESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsStrikeThrough() {
		boolean oldIsStrikeThrough = isStrikeThrough;
		boolean oldIsStrikeThroughESet = isStrikeThroughESet;
		isStrikeThrough = IS_STRIKE_THROUGH_EDEFAULT;
		isStrikeThroughESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DCPackage.FONT__IS_STRIKE_THROUGH, oldIsStrikeThrough, IS_STRIKE_THROUGH_EDEFAULT, oldIsStrikeThroughESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsStrikeThrough() {
		return isStrikeThroughESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsUnderline() {
		return isUnderline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsUnderline(boolean newIsUnderline) {
		boolean oldIsUnderline = isUnderline;
		isUnderline = newIsUnderline;
		boolean oldIsUnderlineESet = isUnderlineESet;
		isUnderlineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.FONT__IS_UNDERLINE, oldIsUnderline, isUnderline, !oldIsUnderlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsUnderline() {
		boolean oldIsUnderline = isUnderline;
		boolean oldIsUnderlineESet = isUnderlineESet;
		isUnderline = IS_UNDERLINE_EDEFAULT;
		isUnderlineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DCPackage.FONT__IS_UNDERLINE, oldIsUnderline, IS_UNDERLINE_EDEFAULT, oldIsUnderlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsUnderline() {
		return isUnderlineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.FONT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.FONT__SIZE, oldSize, size, !oldSizeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DCPackage.FONT__SIZE, oldSize, SIZE_EDEFAULT, oldSizeESet));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DCPackage.FONT__IS_BOLD:
				return isIsBold();
			case DCPackage.FONT__IS_ITALIC:
				return isIsItalic();
			case DCPackage.FONT__IS_STRIKE_THROUGH:
				return isIsStrikeThrough();
			case DCPackage.FONT__IS_UNDERLINE:
				return isIsUnderline();
			case DCPackage.FONT__NAME:
				return getName();
			case DCPackage.FONT__SIZE:
				return getSize();
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
			case DCPackage.FONT__IS_BOLD:
				setIsBold((Boolean)newValue);
				return;
			case DCPackage.FONT__IS_ITALIC:
				setIsItalic((Boolean)newValue);
				return;
			case DCPackage.FONT__IS_STRIKE_THROUGH:
				setIsStrikeThrough((Boolean)newValue);
				return;
			case DCPackage.FONT__IS_UNDERLINE:
				setIsUnderline((Boolean)newValue);
				return;
			case DCPackage.FONT__NAME:
				setName((String)newValue);
				return;
			case DCPackage.FONT__SIZE:
				setSize((Double)newValue);
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
			case DCPackage.FONT__IS_BOLD:
				unsetIsBold();
				return;
			case DCPackage.FONT__IS_ITALIC:
				unsetIsItalic();
				return;
			case DCPackage.FONT__IS_STRIKE_THROUGH:
				unsetIsStrikeThrough();
				return;
			case DCPackage.FONT__IS_UNDERLINE:
				unsetIsUnderline();
				return;
			case DCPackage.FONT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DCPackage.FONT__SIZE:
				unsetSize();
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
			case DCPackage.FONT__IS_BOLD:
				return isSetIsBold();
			case DCPackage.FONT__IS_ITALIC:
				return isSetIsItalic();
			case DCPackage.FONT__IS_STRIKE_THROUGH:
				return isSetIsStrikeThrough();
			case DCPackage.FONT__IS_UNDERLINE:
				return isSetIsUnderline();
			case DCPackage.FONT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DCPackage.FONT__SIZE:
				return isSetSize();
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
		result.append(" (isBold: ");
		if (isBoldESet) result.append(isBold); else result.append("<unset>");
		result.append(", isItalic: ");
		if (isItalicESet) result.append(isItalic); else result.append("<unset>");
		result.append(", isStrikeThrough: ");
		if (isStrikeThroughESet) result.append(isStrikeThrough); else result.append("<unset>");
		result.append(", isUnderline: ");
		if (isUnderlineESet) result.append(isUnderline); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", size: ");
		if (sizeESet) result.append(size); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FontImpl
