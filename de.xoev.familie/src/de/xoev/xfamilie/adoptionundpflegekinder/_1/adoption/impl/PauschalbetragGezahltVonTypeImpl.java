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
package de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl;

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragGezahltVonType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pauschalbetrag Gezahlt Von Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PauschalbetragGezahltVonTypeImpl#getStadt <em>Stadt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PauschalbetragGezahltVonTypeImpl#getBezirkStadtteil <em>Bezirk Stadtteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PauschalbetragGezahltVonTypeImpl#getAktenzeichenWirtschaftlicheJugendhilfe <em>Aktenzeichen Wirtschaftliche Jugendhilfe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PauschalbetragGezahltVonTypeImpl extends MinimalEObjectImpl.Container implements PauschalbetragGezahltVonType {
	/**
	 * The default value of the '{@link #getStadt() <em>Stadt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStadt()
	 * @generated
	 * @ordered
	 */
	protected static final String STADT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStadt() <em>Stadt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStadt()
	 * @generated
	 * @ordered
	 */
	protected String stadt = STADT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBezirkStadtteil() <em>Bezirk Stadtteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezirkStadtteil()
	 * @generated
	 * @ordered
	 */
	protected static final String BEZIRK_STADTTEIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBezirkStadtteil() <em>Bezirk Stadtteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezirkStadtteil()
	 * @generated
	 * @ordered
	 */
	protected String bezirkStadtteil = BEZIRK_STADTTEIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAktenzeichenWirtschaftlicheJugendhilfe() <em>Aktenzeichen Wirtschaftliche Jugendhilfe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenzeichenWirtschaftlicheJugendhilfe()
	 * @generated
	 * @ordered
	 */
	protected static final String AKTENZEICHEN_WIRTSCHAFTLICHE_JUGENDHILFE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAktenzeichenWirtschaftlicheJugendhilfe() <em>Aktenzeichen Wirtschaftliche Jugendhilfe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenzeichenWirtschaftlicheJugendhilfe()
	 * @generated
	 * @ordered
	 */
	protected String aktenzeichenWirtschaftlicheJugendhilfe = AKTENZEICHEN_WIRTSCHAFTLICHE_JUGENDHILFE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PauschalbetragGezahltVonTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.PAUSCHALBETRAG_GEZAHLT_VON_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStadt() {
		return stadt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStadt(String newStadt) {
		String oldStadt = stadt;
		stadt = newStadt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.PAUSCHALBETRAG_GEZAHLT_VON_TYPE__STADT, oldStadt, stadt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBezirkStadtteil() {
		return bezirkStadtteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBezirkStadtteil(String newBezirkStadtteil) {
		String oldBezirkStadtteil = bezirkStadtteil;
		bezirkStadtteil = newBezirkStadtteil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.PAUSCHALBETRAG_GEZAHLT_VON_TYPE__BEZIRK_STADTTEIL, oldBezirkStadtteil, bezirkStadtteil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAktenzeichenWirtschaftlicheJugendhilfe() {
		return aktenzeichenWirtschaftlicheJugendhilfe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAktenzeichenWirtschaftlicheJugendhilfe(String newAktenzeichenWirtschaftlicheJugendhilfe) {
		String oldAktenzeichenWirtschaftlicheJugendhilfe = aktenzeichenWirtschaftlicheJugendhilfe;
		aktenzeichenWirtschaftlicheJugendhilfe = newAktenzeichenWirtschaftlicheJugendhilfe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.PAUSCHALBETRAG_GEZAHLT_VON_TYPE__AKTENZEICHEN_WIRTSCHAFTLICHE_JUGENDHILFE, oldAktenzeichenWirtschaftlicheJugendhilfe, aktenzeichenWirtschaftlicheJugendhilfe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdoptionPackage.PAUSCHALBETRAG_GEZAHLT_VON_TYPE__STADT:
				return getStadt();
			case AdoptionPackage.PAUSCHALBETRAG_GEZAHLT_VON_TYPE__BEZIRK_STADTTEIL:
				return getBezirkStadtteil();
			case AdoptionPackage.PAUSCHALBETRAG_GEZAHLT_VON_TYPE__AKTENZEICHEN_WIRTSCHAFTLICHE_JUGENDHILFE:
				return getAktenzeichenWirtschaftlicheJugendhilfe();
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
			case AdoptionPackage.PAUSCHALBETRAG_GEZAHLT_VON_TYPE__STADT:
				setStadt((String)newValue);
				return;
			case AdoptionPackage.PAUSCHALBETRAG_GEZAHLT_VON_TYPE__BEZIRK_STADTTEIL:
				setBezirkStadtteil((String)newValue);
				return;
			case AdoptionPackage.PAUSCHALBETRAG_GEZAHLT_VON_TYPE__AKTENZEICHEN_WIRTSCHAFTLICHE_JUGENDHILFE:
				setAktenzeichenWirtschaftlicheJugendhilfe((String)newValue);
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
			case AdoptionPackage.PAUSCHALBETRAG_GEZAHLT_VON_TYPE__STADT:
				setStadt(STADT_EDEFAULT);
				return;
			case AdoptionPackage.PAUSCHALBETRAG_GEZAHLT_VON_TYPE__BEZIRK_STADTTEIL:
				setBezirkStadtteil(BEZIRK_STADTTEIL_EDEFAULT);
				return;
			case AdoptionPackage.PAUSCHALBETRAG_GEZAHLT_VON_TYPE__AKTENZEICHEN_WIRTSCHAFTLICHE_JUGENDHILFE:
				setAktenzeichenWirtschaftlicheJugendhilfe(AKTENZEICHEN_WIRTSCHAFTLICHE_JUGENDHILFE_EDEFAULT);
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
			case AdoptionPackage.PAUSCHALBETRAG_GEZAHLT_VON_TYPE__STADT:
				return STADT_EDEFAULT == null ? stadt != null : !STADT_EDEFAULT.equals(stadt);
			case AdoptionPackage.PAUSCHALBETRAG_GEZAHLT_VON_TYPE__BEZIRK_STADTTEIL:
				return BEZIRK_STADTTEIL_EDEFAULT == null ? bezirkStadtteil != null : !BEZIRK_STADTTEIL_EDEFAULT.equals(bezirkStadtteil);
			case AdoptionPackage.PAUSCHALBETRAG_GEZAHLT_VON_TYPE__AKTENZEICHEN_WIRTSCHAFTLICHE_JUGENDHILFE:
				return AKTENZEICHEN_WIRTSCHAFTLICHE_JUGENDHILFE_EDEFAULT == null ? aktenzeichenWirtschaftlicheJugendhilfe != null : !AKTENZEICHEN_WIRTSCHAFTLICHE_JUGENDHILFE_EDEFAULT.equals(aktenzeichenWirtschaftlicheJugendhilfe);
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
		result.append(" (stadt: ");
		result.append(stadt);
		result.append(", bezirkStadtteil: ");
		result.append(bezirkStadtteil);
		result.append(", aktenzeichenWirtschaftlicheJugendhilfe: ");
		result.append(aktenzeichenWirtschaftlicheJugendhilfe);
		result.append(')');
		return result.toString();
	}

} //PauschalbetragGezahltVonTypeImpl
