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
package de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl;

import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenQuittung0011Type;

import de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allgemeinenachrichten Quittung0011 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeinenachrichtenQuittung0011TypeImpl#getIdentifikationNachricht <em>Identifikation Nachricht</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllgemeinenachrichtenQuittung0011TypeImpl extends NachrichtTypeImpl implements AllgemeinenachrichtenQuittung0011Type {
	/**
	 * The cached value of the '{@link #getIdentifikationNachricht() <em>Identifikation Nachricht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifikationNachricht()
	 * @generated
	 * @ordered
	 */
	protected IdentifikationNachrichtType identifikationNachricht;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllgemeinenachrichtenQuittung0011TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllgemeineNachrichtenPackage.Literals.ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifikationNachrichtType getIdentifikationNachricht() {
		return identifikationNachricht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifikationNachricht(IdentifikationNachrichtType newIdentifikationNachricht, NotificationChain msgs) {
		IdentifikationNachrichtType oldIdentifikationNachricht = identifikationNachricht;
		identifikationNachricht = newIdentifikationNachricht;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE__IDENTIFIKATION_NACHRICHT, oldIdentifikationNachricht, newIdentifikationNachricht);
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
	public void setIdentifikationNachricht(IdentifikationNachrichtType newIdentifikationNachricht) {
		if (newIdentifikationNachricht != identifikationNachricht) {
			NotificationChain msgs = null;
			if (identifikationNachricht != null)
				msgs = ((InternalEObject)identifikationNachricht).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE__IDENTIFIKATION_NACHRICHT, null, msgs);
			if (newIdentifikationNachricht != null)
				msgs = ((InternalEObject)newIdentifikationNachricht).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE__IDENTIFIKATION_NACHRICHT, null, msgs);
			msgs = basicSetIdentifikationNachricht(newIdentifikationNachricht, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE__IDENTIFIKATION_NACHRICHT, newIdentifikationNachricht, newIdentifikationNachricht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE__IDENTIFIKATION_NACHRICHT:
				return basicSetIdentifikationNachricht(null, msgs);
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
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE__IDENTIFIKATION_NACHRICHT:
				return getIdentifikationNachricht();
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
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE__IDENTIFIKATION_NACHRICHT:
				setIdentifikationNachricht((IdentifikationNachrichtType)newValue);
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
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE__IDENTIFIKATION_NACHRICHT:
				setIdentifikationNachricht((IdentifikationNachrichtType)null);
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
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE__IDENTIFIKATION_NACHRICHT:
				return identifikationNachricht != null;
		}
		return super.eIsSet(featureID);
	}

} //AllgemeinenachrichtenQuittung0011TypeImpl
