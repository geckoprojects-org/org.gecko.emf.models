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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeGesamteinkommenType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesamteinkommenType;

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
 * An implementation of the model object '<em><b>Gesamteinkommen Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GesamteinkommenTypeImpl#getGesamteinkommen <em>Gesamteinkommen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GesamteinkommenTypeImpl#getNachweisGesamteinkommen <em>Nachweis Gesamteinkommen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GesamteinkommenTypeImpl extends MinimalEObjectImpl.Container implements GesamteinkommenType {
	/**
	 * The cached value of the '{@link #getGesamteinkommen() <em>Gesamteinkommen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGesamteinkommen()
	 * @generated
	 * @ordered
	 */
	protected CodeGesamteinkommenType gesamteinkommen;

	/**
	 * The cached value of the '{@link #getNachweisGesamteinkommen() <em>Nachweis Gesamteinkommen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisGesamteinkommen()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisGesamteinkommen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GesamteinkommenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getGesamteinkommenType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeGesamteinkommenType getGesamteinkommen() {
		return gesamteinkommen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGesamteinkommen(CodeGesamteinkommenType newGesamteinkommen, NotificationChain msgs) {
		CodeGesamteinkommenType oldGesamteinkommen = gesamteinkommen;
		gesamteinkommen = newGesamteinkommen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GESAMTEINKOMMEN_TYPE__GESAMTEINKOMMEN, oldGesamteinkommen, newGesamteinkommen);
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
	public void setGesamteinkommen(CodeGesamteinkommenType newGesamteinkommen) {
		if (newGesamteinkommen != gesamteinkommen) {
			NotificationChain msgs = null;
			if (gesamteinkommen != null)
				msgs = ((InternalEObject)gesamteinkommen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.GESAMTEINKOMMEN_TYPE__GESAMTEINKOMMEN, null, msgs);
			if (newGesamteinkommen != null)
				msgs = ((InternalEObject)newGesamteinkommen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.GESAMTEINKOMMEN_TYPE__GESAMTEINKOMMEN, null, msgs);
			msgs = basicSetGesamteinkommen(newGesamteinkommen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GESAMTEINKOMMEN_TYPE__GESAMTEINKOMMEN, newGesamteinkommen, newGesamteinkommen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisGesamteinkommen() {
		if (nachweisGesamteinkommen == null) {
			nachweisGesamteinkommen = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.GESAMTEINKOMMEN_TYPE__NACHWEIS_GESAMTEINKOMMEN);
		}
		return nachweisGesamteinkommen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.GESAMTEINKOMMEN_TYPE__GESAMTEINKOMMEN:
				return basicSetGesamteinkommen(null, msgs);
			case ElterngeldPackage.GESAMTEINKOMMEN_TYPE__NACHWEIS_GESAMTEINKOMMEN:
				return ((InternalEList<?>)getNachweisGesamteinkommen()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.GESAMTEINKOMMEN_TYPE__GESAMTEINKOMMEN:
				return getGesamteinkommen();
			case ElterngeldPackage.GESAMTEINKOMMEN_TYPE__NACHWEIS_GESAMTEINKOMMEN:
				return getNachweisGesamteinkommen();
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
			case ElterngeldPackage.GESAMTEINKOMMEN_TYPE__GESAMTEINKOMMEN:
				setGesamteinkommen((CodeGesamteinkommenType)newValue);
				return;
			case ElterngeldPackage.GESAMTEINKOMMEN_TYPE__NACHWEIS_GESAMTEINKOMMEN:
				getNachweisGesamteinkommen().clear();
				getNachweisGesamteinkommen().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.GESAMTEINKOMMEN_TYPE__GESAMTEINKOMMEN:
				setGesamteinkommen((CodeGesamteinkommenType)null);
				return;
			case ElterngeldPackage.GESAMTEINKOMMEN_TYPE__NACHWEIS_GESAMTEINKOMMEN:
				getNachweisGesamteinkommen().clear();
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
			case ElterngeldPackage.GESAMTEINKOMMEN_TYPE__GESAMTEINKOMMEN:
				return gesamteinkommen != null;
			case ElterngeldPackage.GESAMTEINKOMMEN_TYPE__NACHWEIS_GESAMTEINKOMMEN:
				return nachweisGesamteinkommen != null && !nachweisGesamteinkommen.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GesamteinkommenTypeImpl
