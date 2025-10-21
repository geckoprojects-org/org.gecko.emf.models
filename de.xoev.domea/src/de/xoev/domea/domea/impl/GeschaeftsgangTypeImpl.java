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
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.BeteiligungsschrittType;
import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.GeschaeftsgangType;
import de.xoev.domea.domea.IdentifikationObjektType;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geschaeftsgang Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.GeschaeftsgangTypeImpl#getIdentifikation <em>Identifikation</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.GeschaeftsgangTypeImpl#getBeteiligungsschritt <em>Beteiligungsschritt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeschaeftsgangTypeImpl extends MinimalEObjectImpl.Container implements GeschaeftsgangType {
	/**
	 * The cached value of the '{@link #getIdentifikation() <em>Identifikation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifikation()
	 * @generated
	 * @ordered
	 */
	protected IdentifikationObjektType identifikation;

	/**
	 * The cached value of the '{@link #getBeteiligungsschritt() <em>Beteiligungsschritt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeteiligungsschritt()
	 * @generated
	 * @ordered
	 */
	protected EList<BeteiligungsschrittType> beteiligungsschritt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeschaeftsgangTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.GESCHAEFTSGANG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifikationObjektType getIdentifikation() {
		return identifikation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifikation(IdentifikationObjektType newIdentifikation, NotificationChain msgs) {
		IdentifikationObjektType oldIdentifikation = identifikation;
		identifikation = newIdentifikation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.GESCHAEFTSGANG_TYPE__IDENTIFIKATION, oldIdentifikation, newIdentifikation);
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
	public void setIdentifikation(IdentifikationObjektType newIdentifikation) {
		if (newIdentifikation != identifikation) {
			NotificationChain msgs = null;
			if (identifikation != null)
				msgs = ((InternalEObject)identifikation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.GESCHAEFTSGANG_TYPE__IDENTIFIKATION, null, msgs);
			if (newIdentifikation != null)
				msgs = ((InternalEObject)newIdentifikation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.GESCHAEFTSGANG_TYPE__IDENTIFIKATION, null, msgs);
			msgs = basicSetIdentifikation(newIdentifikation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.GESCHAEFTSGANG_TYPE__IDENTIFIKATION, newIdentifikation, newIdentifikation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BeteiligungsschrittType> getBeteiligungsschritt() {
		if (beteiligungsschritt == null) {
			beteiligungsschritt = new EObjectContainmentEList<BeteiligungsschrittType>(BeteiligungsschrittType.class, this, DomeaPackage.GESCHAEFTSGANG_TYPE__BETEILIGUNGSSCHRITT);
		}
		return beteiligungsschritt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.GESCHAEFTSGANG_TYPE__IDENTIFIKATION:
				return basicSetIdentifikation(null, msgs);
			case DomeaPackage.GESCHAEFTSGANG_TYPE__BETEILIGUNGSSCHRITT:
				return ((InternalEList<?>)getBeteiligungsschritt()).basicRemove(otherEnd, msgs);
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
			case DomeaPackage.GESCHAEFTSGANG_TYPE__IDENTIFIKATION:
				return getIdentifikation();
			case DomeaPackage.GESCHAEFTSGANG_TYPE__BETEILIGUNGSSCHRITT:
				return getBeteiligungsschritt();
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
			case DomeaPackage.GESCHAEFTSGANG_TYPE__IDENTIFIKATION:
				setIdentifikation((IdentifikationObjektType)newValue);
				return;
			case DomeaPackage.GESCHAEFTSGANG_TYPE__BETEILIGUNGSSCHRITT:
				getBeteiligungsschritt().clear();
				getBeteiligungsschritt().addAll((Collection<? extends BeteiligungsschrittType>)newValue);
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
			case DomeaPackage.GESCHAEFTSGANG_TYPE__IDENTIFIKATION:
				setIdentifikation((IdentifikationObjektType)null);
				return;
			case DomeaPackage.GESCHAEFTSGANG_TYPE__BETEILIGUNGSSCHRITT:
				getBeteiligungsschritt().clear();
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
			case DomeaPackage.GESCHAEFTSGANG_TYPE__IDENTIFIKATION:
				return identifikation != null;
			case DomeaPackage.GESCHAEFTSGANG_TYPE__BETEILIGUNGSSCHRITT:
				return beteiligungsschritt != null && !beteiligungsschritt.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GeschaeftsgangTypeImpl
