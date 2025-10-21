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
package de.xoev.xfamilie.baukasten._1.baukasten.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postalische Inlandsanschrift Postfachanschrift Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftPostfachanschriftTypeImpl#getPostfach <em>Postfach</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftPostfachanschriftTypeImpl#getWohnort <em>Wohnort</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftPostfachanschriftTypeImpl#getPostleitzahl <em>Postleitzahl</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftPostfachanschriftTypeImpl#getZusatzangaben <em>Zusatzangaben</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostalischeInlandsanschriftPostfachanschriftTypeImpl extends MinimalEObjectImpl.Container implements PostalischeInlandsanschriftPostfachanschriftType {
	/**
	 * The default value of the '{@link #getPostfach() <em>Postfach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostfach()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTFACH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostfach() <em>Postfach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostfach()
	 * @generated
	 * @ordered
	 */
	protected String postfach = POSTFACH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWohnort() <em>Wohnort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnort()
	 * @generated
	 * @ordered
	 */
	protected static final String WOHNORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWohnort() <em>Wohnort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnort()
	 * @generated
	 * @ordered
	 */
	protected String wohnort = WOHNORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostleitzahl() <em>Postleitzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostleitzahl()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTLEITZAHL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostleitzahl() <em>Postleitzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostleitzahl()
	 * @generated
	 * @ordered
	 */
	protected String postleitzahl = POSTLEITZAHL_EDEFAULT;

	/**
	 * The default value of the '{@link #getZusatzangaben() <em>Zusatzangaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusatzangaben()
	 * @generated
	 * @ordered
	 */
	protected static final String ZUSATZANGABEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZusatzangaben() <em>Zusatzangaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusatzangaben()
	 * @generated
	 * @ordered
	 */
	protected String zusatzangaben = ZUSATZANGABEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostalischeInlandsanschriftPostfachanschriftTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostfach() {
		return postfach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostfach(String newPostfach) {
		String oldPostfach = postfach;
		postfach = newPostfach;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__POSTFACH, oldPostfach, postfach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWohnort() {
		return wohnort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWohnort(String newWohnort) {
		String oldWohnort = wohnort;
		wohnort = newWohnort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__WOHNORT, oldWohnort, wohnort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostleitzahl() {
		return postleitzahl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostleitzahl(String newPostleitzahl) {
		String oldPostleitzahl = postleitzahl;
		postleitzahl = newPostleitzahl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__POSTLEITZAHL, oldPostleitzahl, postleitzahl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZusatzangaben() {
		return zusatzangaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZusatzangaben(String newZusatzangaben) {
		String oldZusatzangaben = zusatzangaben;
		zusatzangaben = newZusatzangaben;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__ZUSATZANGABEN, oldZusatzangaben, zusatzangaben));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__POSTFACH:
				return getPostfach();
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__WOHNORT:
				return getWohnort();
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__POSTLEITZAHL:
				return getPostleitzahl();
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__ZUSATZANGABEN:
				return getZusatzangaben();
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
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__POSTFACH:
				setPostfach((String)newValue);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__WOHNORT:
				setWohnort((String)newValue);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__POSTLEITZAHL:
				setPostleitzahl((String)newValue);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__ZUSATZANGABEN:
				setZusatzangaben((String)newValue);
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
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__POSTFACH:
				setPostfach(POSTFACH_EDEFAULT);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__WOHNORT:
				setWohnort(WOHNORT_EDEFAULT);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__POSTLEITZAHL:
				setPostleitzahl(POSTLEITZAHL_EDEFAULT);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__ZUSATZANGABEN:
				setZusatzangaben(ZUSATZANGABEN_EDEFAULT);
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
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__POSTFACH:
				return POSTFACH_EDEFAULT == null ? postfach != null : !POSTFACH_EDEFAULT.equals(postfach);
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__WOHNORT:
				return WOHNORT_EDEFAULT == null ? wohnort != null : !WOHNORT_EDEFAULT.equals(wohnort);
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__POSTLEITZAHL:
				return POSTLEITZAHL_EDEFAULT == null ? postleitzahl != null : !POSTLEITZAHL_EDEFAULT.equals(postleitzahl);
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__ZUSATZANGABEN:
				return ZUSATZANGABEN_EDEFAULT == null ? zusatzangaben != null : !ZUSATZANGABEN_EDEFAULT.equals(zusatzangaben);
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
		result.append(" (postfach: ");
		result.append(postfach);
		result.append(", wohnort: ");
		result.append(wohnort);
		result.append(", postleitzahl: ");
		result.append(postleitzahl);
		result.append(", zusatzangaben: ");
		result.append(zusatzangaben);
		result.append(')');
		return result.toString();
	}

} //PostalischeInlandsanschriftPostfachanschriftTypeImpl
