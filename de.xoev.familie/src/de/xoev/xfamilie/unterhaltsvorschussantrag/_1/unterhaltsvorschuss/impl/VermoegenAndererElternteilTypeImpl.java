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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeVermoegensartType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VermoegenAndererElternteilType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vermoegen Anderer Elternteil Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VermoegenAndererElternteilTypeImpl#getArt <em>Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VermoegenAndererElternteilTypeImpl#getZusaetzlicheInformationen <em>Zusaetzliche Informationen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VermoegenAndererElternteilTypeImpl extends MinimalEObjectImpl.Container implements VermoegenAndererElternteilType {
	/**
	 * The cached value of the '{@link #getArt() <em>Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArt()
	 * @generated
	 * @ordered
	 */
	protected CodeVermoegensartType art;

	/**
	 * The default value of the '{@link #getZusaetzlicheInformationen() <em>Zusaetzliche Informationen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusaetzlicheInformationen()
	 * @generated
	 * @ordered
	 */
	protected static final String ZUSAETZLICHE_INFORMATIONEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZusaetzlicheInformationen() <em>Zusaetzliche Informationen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusaetzlicheInformationen()
	 * @generated
	 * @ordered
	 */
	protected String zusaetzlicheInformationen = ZUSAETZLICHE_INFORMATIONEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VermoegenAndererElternteilTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getVermoegenAndererElternteilType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeVermoegensartType getArt() {
		return art;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArt(CodeVermoegensartType newArt, NotificationChain msgs) {
		CodeVermoegensartType oldArt = art;
		art = newArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERMOEGEN_ANDERER_ELTERNTEIL_TYPE__ART, oldArt, newArt);
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
	public void setArt(CodeVermoegensartType newArt) {
		if (newArt != art) {
			NotificationChain msgs = null;
			if (art != null)
				msgs = ((InternalEObject)art).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERMOEGEN_ANDERER_ELTERNTEIL_TYPE__ART, null, msgs);
			if (newArt != null)
				msgs = ((InternalEObject)newArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERMOEGEN_ANDERER_ELTERNTEIL_TYPE__ART, null, msgs);
			msgs = basicSetArt(newArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERMOEGEN_ANDERER_ELTERNTEIL_TYPE__ART, newArt, newArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZusaetzlicheInformationen() {
		return zusaetzlicheInformationen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZusaetzlicheInformationen(String newZusaetzlicheInformationen) {
		String oldZusaetzlicheInformationen = zusaetzlicheInformationen;
		zusaetzlicheInformationen = newZusaetzlicheInformationen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERMOEGEN_ANDERER_ELTERNTEIL_TYPE__ZUSAETZLICHE_INFORMATIONEN, oldZusaetzlicheInformationen, zusaetzlicheInformationen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.VERMOEGEN_ANDERER_ELTERNTEIL_TYPE__ART:
				return basicSetArt(null, msgs);
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
			case UnterhaltsvorschussPackage.VERMOEGEN_ANDERER_ELTERNTEIL_TYPE__ART:
				return getArt();
			case UnterhaltsvorschussPackage.VERMOEGEN_ANDERER_ELTERNTEIL_TYPE__ZUSAETZLICHE_INFORMATIONEN:
				return getZusaetzlicheInformationen();
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
			case UnterhaltsvorschussPackage.VERMOEGEN_ANDERER_ELTERNTEIL_TYPE__ART:
				setArt((CodeVermoegensartType)newValue);
				return;
			case UnterhaltsvorschussPackage.VERMOEGEN_ANDERER_ELTERNTEIL_TYPE__ZUSAETZLICHE_INFORMATIONEN:
				setZusaetzlicheInformationen((String)newValue);
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
			case UnterhaltsvorschussPackage.VERMOEGEN_ANDERER_ELTERNTEIL_TYPE__ART:
				setArt((CodeVermoegensartType)null);
				return;
			case UnterhaltsvorschussPackage.VERMOEGEN_ANDERER_ELTERNTEIL_TYPE__ZUSAETZLICHE_INFORMATIONEN:
				setZusaetzlicheInformationen(ZUSAETZLICHE_INFORMATIONEN_EDEFAULT);
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
			case UnterhaltsvorschussPackage.VERMOEGEN_ANDERER_ELTERNTEIL_TYPE__ART:
				return art != null;
			case UnterhaltsvorschussPackage.VERMOEGEN_ANDERER_ELTERNTEIL_TYPE__ZUSAETZLICHE_INFORMATIONEN:
				return ZUSAETZLICHE_INFORMATIONEN_EDEFAULT == null ? zusaetzlicheInformationen != null : !ZUSAETZLICHE_INFORMATIONEN_EDEFAULT.equals(zusaetzlicheInformationen);
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
		result.append(" (zusaetzlicheInformationen: ");
		result.append(zusaetzlicheInformationen);
		result.append(')');
		return result.toString();
	}

} //VermoegenAndererElternteilTypeImpl
