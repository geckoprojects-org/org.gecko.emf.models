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

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AusbildungAndererElternteilType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeAusbildungType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ausbildung Anderer Elternteil Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AusbildungAndererElternteilTypeImpl#getArt <em>Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AusbildungAndererElternteilTypeImpl#getZusaetzlicheInformationen <em>Zusaetzliche Informationen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AusbildungAndererElternteilTypeImpl extends MinimalEObjectImpl.Container implements AusbildungAndererElternteilType {
	/**
	 * The cached value of the '{@link #getArt() <em>Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArt()
	 * @generated
	 * @ordered
	 */
	protected CodeAusbildungType art;

	/**
	 * The cached value of the '{@link #getZusaetzlicheInformationen() <em>Zusaetzliche Informationen</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusaetzlicheInformationen()
	 * @generated
	 * @ordered
	 */
	protected EList<String> zusaetzlicheInformationen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AusbildungAndererElternteilTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getAusbildungAndererElternteilType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeAusbildungType getArt() {
		return art;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArt(CodeAusbildungType newArt, NotificationChain msgs) {
		CodeAusbildungType oldArt = art;
		art = newArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.AUSBILDUNG_ANDERER_ELTERNTEIL_TYPE__ART, oldArt, newArt);
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
	public void setArt(CodeAusbildungType newArt) {
		if (newArt != art) {
			NotificationChain msgs = null;
			if (art != null)
				msgs = ((InternalEObject)art).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.AUSBILDUNG_ANDERER_ELTERNTEIL_TYPE__ART, null, msgs);
			if (newArt != null)
				msgs = ((InternalEObject)newArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.AUSBILDUNG_ANDERER_ELTERNTEIL_TYPE__ART, null, msgs);
			msgs = basicSetArt(newArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.AUSBILDUNG_ANDERER_ELTERNTEIL_TYPE__ART, newArt, newArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getZusaetzlicheInformationen() {
		if (zusaetzlicheInformationen == null) {
			zusaetzlicheInformationen = new EDataTypeEList<String>(String.class, this, UnterhaltsvorschussPackage.AUSBILDUNG_ANDERER_ELTERNTEIL_TYPE__ZUSAETZLICHE_INFORMATIONEN);
		}
		return zusaetzlicheInformationen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.AUSBILDUNG_ANDERER_ELTERNTEIL_TYPE__ART:
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
			case UnterhaltsvorschussPackage.AUSBILDUNG_ANDERER_ELTERNTEIL_TYPE__ART:
				return getArt();
			case UnterhaltsvorschussPackage.AUSBILDUNG_ANDERER_ELTERNTEIL_TYPE__ZUSAETZLICHE_INFORMATIONEN:
				return getZusaetzlicheInformationen();
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
			case UnterhaltsvorschussPackage.AUSBILDUNG_ANDERER_ELTERNTEIL_TYPE__ART:
				setArt((CodeAusbildungType)newValue);
				return;
			case UnterhaltsvorschussPackage.AUSBILDUNG_ANDERER_ELTERNTEIL_TYPE__ZUSAETZLICHE_INFORMATIONEN:
				getZusaetzlicheInformationen().clear();
				getZusaetzlicheInformationen().addAll((Collection<? extends String>)newValue);
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
			case UnterhaltsvorschussPackage.AUSBILDUNG_ANDERER_ELTERNTEIL_TYPE__ART:
				setArt((CodeAusbildungType)null);
				return;
			case UnterhaltsvorschussPackage.AUSBILDUNG_ANDERER_ELTERNTEIL_TYPE__ZUSAETZLICHE_INFORMATIONEN:
				getZusaetzlicheInformationen().clear();
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
			case UnterhaltsvorschussPackage.AUSBILDUNG_ANDERER_ELTERNTEIL_TYPE__ART:
				return art != null;
			case UnterhaltsvorschussPackage.AUSBILDUNG_ANDERER_ELTERNTEIL_TYPE__ZUSAETZLICHE_INFORMATIONEN:
				return zusaetzlicheInformationen != null && !zusaetzlicheInformationen.isEmpty();
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

} //AusbildungAndererElternteilTypeImpl
