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
import de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color CMYK Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.ColorCMYKTypeImpl#getCyan <em>Cyan</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.ColorCMYKTypeImpl#getMagenta <em>Magenta</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.ColorCMYKTypeImpl#getYellow <em>Yellow</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.ColorCMYKTypeImpl#getBlack <em>Black</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColorCMYKTypeImpl extends ColorType2Impl implements ColorCMYKType {
	/**
	 * The default value of the '{@link #getCyan() <em>Cyan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCyan()
	 * @generated
	 * @ordered
	 */
	protected static final double CYAN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCyan() <em>Cyan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCyan()
	 * @generated
	 * @ordered
	 */
	protected double cyan = CYAN_EDEFAULT;

	/**
	 * This is true if the Cyan attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cyanESet;

	/**
	 * The default value of the '{@link #getMagenta() <em>Magenta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagenta()
	 * @generated
	 * @ordered
	 */
	protected static final double MAGENTA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMagenta() <em>Magenta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagenta()
	 * @generated
	 * @ordered
	 */
	protected double magenta = MAGENTA_EDEFAULT;

	/**
	 * This is true if the Magenta attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean magentaESet;

	/**
	 * The default value of the '{@link #getYellow() <em>Yellow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYellow()
	 * @generated
	 * @ordered
	 */
	protected static final double YELLOW_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYellow() <em>Yellow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYellow()
	 * @generated
	 * @ordered
	 */
	protected double yellow = YELLOW_EDEFAULT;

	/**
	 * This is true if the Yellow attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yellowESet;

	/**
	 * The default value of the '{@link #getBlack() <em>Black</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlack()
	 * @generated
	 * @ordered
	 */
	protected static final double BLACK_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBlack() <em>Black</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlack()
	 * @generated
	 * @ordered
	 */
	protected double black = BLACK_EDEFAULT;

	/**
	 * This is true if the Black attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean blackESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorCMYKTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getColorCMYKType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCyan() {
		return cyan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCyan(double newCyan) {
		double oldCyan = cyan;
		cyan = newCyan;
		boolean oldCyanESet = cyanESet;
		cyanESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.COLOR_CMYK_TYPE__CYAN, oldCyan, cyan, !oldCyanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCyan() {
		double oldCyan = cyan;
		boolean oldCyanESet = cyanESet;
		cyan = CYAN_EDEFAULT;
		cyanESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.COLOR_CMYK_TYPE__CYAN, oldCyan, CYAN_EDEFAULT, oldCyanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCyan() {
		return cyanESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMagenta() {
		return magenta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMagenta(double newMagenta) {
		double oldMagenta = magenta;
		magenta = newMagenta;
		boolean oldMagentaESet = magentaESet;
		magentaESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.COLOR_CMYK_TYPE__MAGENTA, oldMagenta, magenta, !oldMagentaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMagenta() {
		double oldMagenta = magenta;
		boolean oldMagentaESet = magentaESet;
		magenta = MAGENTA_EDEFAULT;
		magentaESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.COLOR_CMYK_TYPE__MAGENTA, oldMagenta, MAGENTA_EDEFAULT, oldMagentaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMagenta() {
		return magentaESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getYellow() {
		return yellow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYellow(double newYellow) {
		double oldYellow = yellow;
		yellow = newYellow;
		boolean oldYellowESet = yellowESet;
		yellowESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.COLOR_CMYK_TYPE__YELLOW, oldYellow, yellow, !oldYellowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetYellow() {
		double oldYellow = yellow;
		boolean oldYellowESet = yellowESet;
		yellow = YELLOW_EDEFAULT;
		yellowESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.COLOR_CMYK_TYPE__YELLOW, oldYellow, YELLOW_EDEFAULT, oldYellowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetYellow() {
		return yellowESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBlack() {
		return black;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlack(double newBlack) {
		double oldBlack = black;
		black = newBlack;
		boolean oldBlackESet = blackESet;
		blackESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.COLOR_CMYK_TYPE__BLACK, oldBlack, black, !oldBlackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBlack() {
		double oldBlack = black;
		boolean oldBlackESet = blackESet;
		black = BLACK_EDEFAULT;
		blackESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.COLOR_CMYK_TYPE__BLACK, oldBlack, BLACK_EDEFAULT, oldBlackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBlack() {
		return blackESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AAAPackage.COLOR_CMYK_TYPE__CYAN:
				return getCyan();
			case AAAPackage.COLOR_CMYK_TYPE__MAGENTA:
				return getMagenta();
			case AAAPackage.COLOR_CMYK_TYPE__YELLOW:
				return getYellow();
			case AAAPackage.COLOR_CMYK_TYPE__BLACK:
				return getBlack();
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
			case AAAPackage.COLOR_CMYK_TYPE__CYAN:
				setCyan((Double)newValue);
				return;
			case AAAPackage.COLOR_CMYK_TYPE__MAGENTA:
				setMagenta((Double)newValue);
				return;
			case AAAPackage.COLOR_CMYK_TYPE__YELLOW:
				setYellow((Double)newValue);
				return;
			case AAAPackage.COLOR_CMYK_TYPE__BLACK:
				setBlack((Double)newValue);
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
			case AAAPackage.COLOR_CMYK_TYPE__CYAN:
				unsetCyan();
				return;
			case AAAPackage.COLOR_CMYK_TYPE__MAGENTA:
				unsetMagenta();
				return;
			case AAAPackage.COLOR_CMYK_TYPE__YELLOW:
				unsetYellow();
				return;
			case AAAPackage.COLOR_CMYK_TYPE__BLACK:
				unsetBlack();
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
			case AAAPackage.COLOR_CMYK_TYPE__CYAN:
				return isSetCyan();
			case AAAPackage.COLOR_CMYK_TYPE__MAGENTA:
				return isSetMagenta();
			case AAAPackage.COLOR_CMYK_TYPE__YELLOW:
				return isSetYellow();
			case AAAPackage.COLOR_CMYK_TYPE__BLACK:
				return isSetBlack();
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
		result.append(" (cyan: ");
		if (cyanESet) result.append(cyan); else result.append("<unset>");
		result.append(", magenta: ");
		if (magentaESet) result.append(magenta); else result.append("<unset>");
		result.append(", yellow: ");
		if (yellowESet) result.append(yellow); else result.append("<unset>");
		result.append(", black: ");
		if (blackESet) result.append(black); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ColorCMYKTypeImpl
