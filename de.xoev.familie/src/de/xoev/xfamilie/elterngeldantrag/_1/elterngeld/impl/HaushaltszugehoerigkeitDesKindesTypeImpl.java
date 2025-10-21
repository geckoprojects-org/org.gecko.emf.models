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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitZeitraumType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.HaushaltszugehoerigkeitDesKindesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Haushaltszugehoerigkeit Des Kindes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.HaushaltszugehoerigkeitDesKindesTypeImpl#getBetreuungUndErziehungImEigenenHaushalt <em>Betreuung Und Erziehung Im Eigenen Haushalt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HaushaltszugehoerigkeitDesKindesTypeImpl extends MinimalEObjectImpl.Container implements HaushaltszugehoerigkeitDesKindesType {
	/**
	 * The cached value of the '{@link #getBetreuungUndErziehungImEigenenHaushalt() <em>Betreuung Und Erziehung Im Eigenen Haushalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetreuungUndErziehungImEigenenHaushalt()
	 * @generated
	 * @ordered
	 */
	protected TatsacheMitZeitraumType betreuungUndErziehungImEigenenHaushalt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HaushaltszugehoerigkeitDesKindesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getHaushaltszugehoerigkeitDesKindesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TatsacheMitZeitraumType getBetreuungUndErziehungImEigenenHaushalt() {
		return betreuungUndErziehungImEigenenHaushalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBetreuungUndErziehungImEigenenHaushalt(TatsacheMitZeitraumType newBetreuungUndErziehungImEigenenHaushalt, NotificationChain msgs) {
		TatsacheMitZeitraumType oldBetreuungUndErziehungImEigenenHaushalt = betreuungUndErziehungImEigenenHaushalt;
		betreuungUndErziehungImEigenenHaushalt = newBetreuungUndErziehungImEigenenHaushalt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.HAUSHALTSZUGEHOERIGKEIT_DES_KINDES_TYPE__BETREUUNG_UND_ERZIEHUNG_IM_EIGENEN_HAUSHALT, oldBetreuungUndErziehungImEigenenHaushalt, newBetreuungUndErziehungImEigenenHaushalt);
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
	public void setBetreuungUndErziehungImEigenenHaushalt(TatsacheMitZeitraumType newBetreuungUndErziehungImEigenenHaushalt) {
		if (newBetreuungUndErziehungImEigenenHaushalt != betreuungUndErziehungImEigenenHaushalt) {
			NotificationChain msgs = null;
			if (betreuungUndErziehungImEigenenHaushalt != null)
				msgs = ((InternalEObject)betreuungUndErziehungImEigenenHaushalt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.HAUSHALTSZUGEHOERIGKEIT_DES_KINDES_TYPE__BETREUUNG_UND_ERZIEHUNG_IM_EIGENEN_HAUSHALT, null, msgs);
			if (newBetreuungUndErziehungImEigenenHaushalt != null)
				msgs = ((InternalEObject)newBetreuungUndErziehungImEigenenHaushalt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.HAUSHALTSZUGEHOERIGKEIT_DES_KINDES_TYPE__BETREUUNG_UND_ERZIEHUNG_IM_EIGENEN_HAUSHALT, null, msgs);
			msgs = basicSetBetreuungUndErziehungImEigenenHaushalt(newBetreuungUndErziehungImEigenenHaushalt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.HAUSHALTSZUGEHOERIGKEIT_DES_KINDES_TYPE__BETREUUNG_UND_ERZIEHUNG_IM_EIGENEN_HAUSHALT, newBetreuungUndErziehungImEigenenHaushalt, newBetreuungUndErziehungImEigenenHaushalt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.HAUSHALTSZUGEHOERIGKEIT_DES_KINDES_TYPE__BETREUUNG_UND_ERZIEHUNG_IM_EIGENEN_HAUSHALT:
				return basicSetBetreuungUndErziehungImEigenenHaushalt(null, msgs);
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
			case ElterngeldPackage.HAUSHALTSZUGEHOERIGKEIT_DES_KINDES_TYPE__BETREUUNG_UND_ERZIEHUNG_IM_EIGENEN_HAUSHALT:
				return getBetreuungUndErziehungImEigenenHaushalt();
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
			case ElterngeldPackage.HAUSHALTSZUGEHOERIGKEIT_DES_KINDES_TYPE__BETREUUNG_UND_ERZIEHUNG_IM_EIGENEN_HAUSHALT:
				setBetreuungUndErziehungImEigenenHaushalt((TatsacheMitZeitraumType)newValue);
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
			case ElterngeldPackage.HAUSHALTSZUGEHOERIGKEIT_DES_KINDES_TYPE__BETREUUNG_UND_ERZIEHUNG_IM_EIGENEN_HAUSHALT:
				setBetreuungUndErziehungImEigenenHaushalt((TatsacheMitZeitraumType)null);
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
			case ElterngeldPackage.HAUSHALTSZUGEHOERIGKEIT_DES_KINDES_TYPE__BETREUUNG_UND_ERZIEHUNG_IM_EIGENEN_HAUSHALT:
				return betreuungUndErziehungImEigenenHaushalt != null;
		}
		return super.eIsSet(featureID);
	}

} //HaushaltszugehoerigkeitDesKindesTypeImpl
