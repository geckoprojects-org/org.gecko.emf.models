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
package de.xoev.xfamilie.geburt._1.geburt.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import de.xoev.xfamilie.geburt._1.geburt.AngabenZumKindType;
import de.xoev.xfamilie.geburt._1.geburt.GeburtPackage;
import de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angaben Zum Kind Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumKindTypeImpl#getNachgeburtlicheAngabenZumKind <em>Nachgeburtliche Angaben Zum Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumKindTypeImpl#getAngabenZumKindVorGeburt <em>Angaben Zum Kind Vor Geburt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngabenZumKindTypeImpl extends MinimalEObjectImpl.Container implements AngabenZumKindType {
	/**
	 * The cached value of the '{@link #getNachgeburtlicheAngabenZumKind() <em>Nachgeburtliche Angaben Zum Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachgeburtlicheAngabenZumKind()
	 * @generated
	 * @ordered
	 */
	protected NachgeburtlicheAngabenZumKindType nachgeburtlicheAngabenZumKind;

	/**
	 * The cached value of the '{@link #getAngabenZumKindVorGeburt() <em>Angaben Zum Kind Vor Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZumKindVorGeburt()
	 * @generated
	 * @ordered
	 */
	protected TeilbekanntesDatumType angabenZumKindVorGeburt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngabenZumKindTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeburtPackage.Literals.ANGABEN_ZUM_KIND_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachgeburtlicheAngabenZumKindType getNachgeburtlicheAngabenZumKind() {
		return nachgeburtlicheAngabenZumKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachgeburtlicheAngabenZumKind(NachgeburtlicheAngabenZumKindType newNachgeburtlicheAngabenZumKind, NotificationChain msgs) {
		NachgeburtlicheAngabenZumKindType oldNachgeburtlicheAngabenZumKind = nachgeburtlicheAngabenZumKind;
		nachgeburtlicheAngabenZumKind = newNachgeburtlicheAngabenZumKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_ZUM_KIND_TYPE__NACHGEBURTLICHE_ANGABEN_ZUM_KIND, oldNachgeburtlicheAngabenZumKind, newNachgeburtlicheAngabenZumKind);
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
	public void setNachgeburtlicheAngabenZumKind(NachgeburtlicheAngabenZumKindType newNachgeburtlicheAngabenZumKind) {
		if (newNachgeburtlicheAngabenZumKind != nachgeburtlicheAngabenZumKind) {
			NotificationChain msgs = null;
			if (nachgeburtlicheAngabenZumKind != null)
				msgs = ((InternalEObject)nachgeburtlicheAngabenZumKind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_ZUM_KIND_TYPE__NACHGEBURTLICHE_ANGABEN_ZUM_KIND, null, msgs);
			if (newNachgeburtlicheAngabenZumKind != null)
				msgs = ((InternalEObject)newNachgeburtlicheAngabenZumKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_ZUM_KIND_TYPE__NACHGEBURTLICHE_ANGABEN_ZUM_KIND, null, msgs);
			msgs = basicSetNachgeburtlicheAngabenZumKind(newNachgeburtlicheAngabenZumKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_ZUM_KIND_TYPE__NACHGEBURTLICHE_ANGABEN_ZUM_KIND, newNachgeburtlicheAngabenZumKind, newNachgeburtlicheAngabenZumKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeilbekanntesDatumType getAngabenZumKindVorGeburt() {
		return angabenZumKindVorGeburt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenZumKindVorGeburt(TeilbekanntesDatumType newAngabenZumKindVorGeburt, NotificationChain msgs) {
		TeilbekanntesDatumType oldAngabenZumKindVorGeburt = angabenZumKindVorGeburt;
		angabenZumKindVorGeburt = newAngabenZumKindVorGeburt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_ZUM_KIND_TYPE__ANGABEN_ZUM_KIND_VOR_GEBURT, oldAngabenZumKindVorGeburt, newAngabenZumKindVorGeburt);
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
	public void setAngabenZumKindVorGeburt(TeilbekanntesDatumType newAngabenZumKindVorGeburt) {
		if (newAngabenZumKindVorGeburt != angabenZumKindVorGeburt) {
			NotificationChain msgs = null;
			if (angabenZumKindVorGeburt != null)
				msgs = ((InternalEObject)angabenZumKindVorGeburt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_ZUM_KIND_TYPE__ANGABEN_ZUM_KIND_VOR_GEBURT, null, msgs);
			if (newAngabenZumKindVorGeburt != null)
				msgs = ((InternalEObject)newAngabenZumKindVorGeburt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_ZUM_KIND_TYPE__ANGABEN_ZUM_KIND_VOR_GEBURT, null, msgs);
			msgs = basicSetAngabenZumKindVorGeburt(newAngabenZumKindVorGeburt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_ZUM_KIND_TYPE__ANGABEN_ZUM_KIND_VOR_GEBURT, newAngabenZumKindVorGeburt, newAngabenZumKindVorGeburt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeburtPackage.ANGABEN_ZUM_KIND_TYPE__NACHGEBURTLICHE_ANGABEN_ZUM_KIND:
				return basicSetNachgeburtlicheAngabenZumKind(null, msgs);
			case GeburtPackage.ANGABEN_ZUM_KIND_TYPE__ANGABEN_ZUM_KIND_VOR_GEBURT:
				return basicSetAngabenZumKindVorGeburt(null, msgs);
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
			case GeburtPackage.ANGABEN_ZUM_KIND_TYPE__NACHGEBURTLICHE_ANGABEN_ZUM_KIND:
				return getNachgeburtlicheAngabenZumKind();
			case GeburtPackage.ANGABEN_ZUM_KIND_TYPE__ANGABEN_ZUM_KIND_VOR_GEBURT:
				return getAngabenZumKindVorGeburt();
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
			case GeburtPackage.ANGABEN_ZUM_KIND_TYPE__NACHGEBURTLICHE_ANGABEN_ZUM_KIND:
				setNachgeburtlicheAngabenZumKind((NachgeburtlicheAngabenZumKindType)newValue);
				return;
			case GeburtPackage.ANGABEN_ZUM_KIND_TYPE__ANGABEN_ZUM_KIND_VOR_GEBURT:
				setAngabenZumKindVorGeburt((TeilbekanntesDatumType)newValue);
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
			case GeburtPackage.ANGABEN_ZUM_KIND_TYPE__NACHGEBURTLICHE_ANGABEN_ZUM_KIND:
				setNachgeburtlicheAngabenZumKind((NachgeburtlicheAngabenZumKindType)null);
				return;
			case GeburtPackage.ANGABEN_ZUM_KIND_TYPE__ANGABEN_ZUM_KIND_VOR_GEBURT:
				setAngabenZumKindVorGeburt((TeilbekanntesDatumType)null);
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
			case GeburtPackage.ANGABEN_ZUM_KIND_TYPE__NACHGEBURTLICHE_ANGABEN_ZUM_KIND:
				return nachgeburtlicheAngabenZumKind != null;
			case GeburtPackage.ANGABEN_ZUM_KIND_TYPE__ANGABEN_ZUM_KIND_VOR_GEBURT:
				return angabenZumKindVorGeburt != null;
		}
		return super.eIsSet(featureID);
	}

} //AngabenZumKindTypeImpl
