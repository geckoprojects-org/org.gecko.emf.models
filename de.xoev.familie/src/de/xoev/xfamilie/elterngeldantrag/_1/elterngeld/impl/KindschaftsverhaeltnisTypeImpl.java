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

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeKindschaftsverhaeltnisType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindschaftsverhaeltnisType;

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
 * An implementation of the model object '<em><b>Kindschaftsverhaeltnis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KindschaftsverhaeltnisTypeImpl#getKindschaftsverhaeltnis <em>Kindschaftsverhaeltnis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KindschaftsverhaeltnisTypeImpl#getNachweis <em>Nachweis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KindschaftsverhaeltnisTypeImpl extends MinimalEObjectImpl.Container implements KindschaftsverhaeltnisType {
	/**
	 * The cached value of the '{@link #getKindschaftsverhaeltnis() <em>Kindschaftsverhaeltnis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindschaftsverhaeltnis()
	 * @generated
	 * @ordered
	 */
	protected CodeKindschaftsverhaeltnisType kindschaftsverhaeltnis;

	/**
	 * The cached value of the '{@link #getNachweis() <em>Nachweis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KindschaftsverhaeltnisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getKindschaftsverhaeltnisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeKindschaftsverhaeltnisType getKindschaftsverhaeltnis() {
		return kindschaftsverhaeltnis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKindschaftsverhaeltnis(CodeKindschaftsverhaeltnisType newKindschaftsverhaeltnis, NotificationChain msgs) {
		CodeKindschaftsverhaeltnisType oldKindschaftsverhaeltnis = kindschaftsverhaeltnis;
		kindschaftsverhaeltnis = newKindschaftsverhaeltnis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KINDSCHAFTSVERHAELTNIS_TYPE__KINDSCHAFTSVERHAELTNIS, oldKindschaftsverhaeltnis, newKindschaftsverhaeltnis);
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
	public void setKindschaftsverhaeltnis(CodeKindschaftsverhaeltnisType newKindschaftsverhaeltnis) {
		if (newKindschaftsverhaeltnis != kindschaftsverhaeltnis) {
			NotificationChain msgs = null;
			if (kindschaftsverhaeltnis != null)
				msgs = ((InternalEObject)kindschaftsverhaeltnis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KINDSCHAFTSVERHAELTNIS_TYPE__KINDSCHAFTSVERHAELTNIS, null, msgs);
			if (newKindschaftsverhaeltnis != null)
				msgs = ((InternalEObject)newKindschaftsverhaeltnis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KINDSCHAFTSVERHAELTNIS_TYPE__KINDSCHAFTSVERHAELTNIS, null, msgs);
			msgs = basicSetKindschaftsverhaeltnis(newKindschaftsverhaeltnis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KINDSCHAFTSVERHAELTNIS_TYPE__KINDSCHAFTSVERHAELTNIS, newKindschaftsverhaeltnis, newKindschaftsverhaeltnis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweis() {
		if (nachweis == null) {
			nachweis = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.KINDSCHAFTSVERHAELTNIS_TYPE__NACHWEIS);
		}
		return nachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.KINDSCHAFTSVERHAELTNIS_TYPE__KINDSCHAFTSVERHAELTNIS:
				return basicSetKindschaftsverhaeltnis(null, msgs);
			case ElterngeldPackage.KINDSCHAFTSVERHAELTNIS_TYPE__NACHWEIS:
				return ((InternalEList<?>)getNachweis()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.KINDSCHAFTSVERHAELTNIS_TYPE__KINDSCHAFTSVERHAELTNIS:
				return getKindschaftsverhaeltnis();
			case ElterngeldPackage.KINDSCHAFTSVERHAELTNIS_TYPE__NACHWEIS:
				return getNachweis();
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
			case ElterngeldPackage.KINDSCHAFTSVERHAELTNIS_TYPE__KINDSCHAFTSVERHAELTNIS:
				setKindschaftsverhaeltnis((CodeKindschaftsverhaeltnisType)newValue);
				return;
			case ElterngeldPackage.KINDSCHAFTSVERHAELTNIS_TYPE__NACHWEIS:
				getNachweis().clear();
				getNachweis().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.KINDSCHAFTSVERHAELTNIS_TYPE__KINDSCHAFTSVERHAELTNIS:
				setKindschaftsverhaeltnis((CodeKindschaftsverhaeltnisType)null);
				return;
			case ElterngeldPackage.KINDSCHAFTSVERHAELTNIS_TYPE__NACHWEIS:
				getNachweis().clear();
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
			case ElterngeldPackage.KINDSCHAFTSVERHAELTNIS_TYPE__KINDSCHAFTSVERHAELTNIS:
				return kindschaftsverhaeltnis != null;
			case ElterngeldPackage.KINDSCHAFTSVERHAELTNIS_TYPE__NACHWEIS:
				return nachweis != null && !nachweis.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KindschaftsverhaeltnisTypeImpl
