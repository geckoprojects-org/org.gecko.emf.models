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
import de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtType;
import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geburt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.GeburtTypeImpl#getGeburtsort <em>Geburtsort</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.GeburtTypeImpl#getGeburtsortStaat <em>Geburtsort Staat</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.GeburtTypeImpl#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeburtTypeImpl extends MinimalEObjectImpl.Container implements GeburtType {
	/**
	 * The default value of the '{@link #getGeburtsort() <em>Geburtsort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsort()
	 * @generated
	 * @ordered
	 */
	protected static final String GEBURTSORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeburtsort() <em>Geburtsort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsort()
	 * @generated
	 * @ordered
	 */
	protected String geburtsort = GEBURTSORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeburtsortStaat() <em>Geburtsort Staat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsortStaat()
	 * @generated
	 * @ordered
	 */
	protected CodeStaatType geburtsortStaat;

	/**
	 * The cached value of the '{@link #getGeburtsdatum() <em>Geburtsdatum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsdatum()
	 * @generated
	 * @ordered
	 */
	protected TeilbekanntesDatumType geburtsdatum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeburtTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.GEBURT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeburtsort() {
		return geburtsort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeburtsort(String newGeburtsort) {
		String oldGeburtsort = geburtsort;
		geburtsort = newGeburtsort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.GEBURT_TYPE__GEBURTSORT, oldGeburtsort, geburtsort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeStaatType getGeburtsortStaat() {
		return geburtsortStaat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeburtsortStaat(CodeStaatType newGeburtsortStaat, NotificationChain msgs) {
		CodeStaatType oldGeburtsortStaat = geburtsortStaat;
		geburtsortStaat = newGeburtsortStaat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.GEBURT_TYPE__GEBURTSORT_STAAT, oldGeburtsortStaat, newGeburtsortStaat);
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
	public void setGeburtsortStaat(CodeStaatType newGeburtsortStaat) {
		if (newGeburtsortStaat != geburtsortStaat) {
			NotificationChain msgs = null;
			if (geburtsortStaat != null)
				msgs = ((InternalEObject)geburtsortStaat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.GEBURT_TYPE__GEBURTSORT_STAAT, null, msgs);
			if (newGeburtsortStaat != null)
				msgs = ((InternalEObject)newGeburtsortStaat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.GEBURT_TYPE__GEBURTSORT_STAAT, null, msgs);
			msgs = basicSetGeburtsortStaat(newGeburtsortStaat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.GEBURT_TYPE__GEBURTSORT_STAAT, newGeburtsortStaat, newGeburtsortStaat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeilbekanntesDatumType getGeburtsdatum() {
		return geburtsdatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeburtsdatum(TeilbekanntesDatumType newGeburtsdatum, NotificationChain msgs) {
		TeilbekanntesDatumType oldGeburtsdatum = geburtsdatum;
		geburtsdatum = newGeburtsdatum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.GEBURT_TYPE__GEBURTSDATUM, oldGeburtsdatum, newGeburtsdatum);
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
	public void setGeburtsdatum(TeilbekanntesDatumType newGeburtsdatum) {
		if (newGeburtsdatum != geburtsdatum) {
			NotificationChain msgs = null;
			if (geburtsdatum != null)
				msgs = ((InternalEObject)geburtsdatum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.GEBURT_TYPE__GEBURTSDATUM, null, msgs);
			if (newGeburtsdatum != null)
				msgs = ((InternalEObject)newGeburtsdatum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.GEBURT_TYPE__GEBURTSDATUM, null, msgs);
			msgs = basicSetGeburtsdatum(newGeburtsdatum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.GEBURT_TYPE__GEBURTSDATUM, newGeburtsdatum, newGeburtsdatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.GEBURT_TYPE__GEBURTSORT_STAAT:
				return basicSetGeburtsortStaat(null, msgs);
			case BaukastenPackage.GEBURT_TYPE__GEBURTSDATUM:
				return basicSetGeburtsdatum(null, msgs);
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
			case BaukastenPackage.GEBURT_TYPE__GEBURTSORT:
				return getGeburtsort();
			case BaukastenPackage.GEBURT_TYPE__GEBURTSORT_STAAT:
				return getGeburtsortStaat();
			case BaukastenPackage.GEBURT_TYPE__GEBURTSDATUM:
				return getGeburtsdatum();
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
			case BaukastenPackage.GEBURT_TYPE__GEBURTSORT:
				setGeburtsort((String)newValue);
				return;
			case BaukastenPackage.GEBURT_TYPE__GEBURTSORT_STAAT:
				setGeburtsortStaat((CodeStaatType)newValue);
				return;
			case BaukastenPackage.GEBURT_TYPE__GEBURTSDATUM:
				setGeburtsdatum((TeilbekanntesDatumType)newValue);
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
			case BaukastenPackage.GEBURT_TYPE__GEBURTSORT:
				setGeburtsort(GEBURTSORT_EDEFAULT);
				return;
			case BaukastenPackage.GEBURT_TYPE__GEBURTSORT_STAAT:
				setGeburtsortStaat((CodeStaatType)null);
				return;
			case BaukastenPackage.GEBURT_TYPE__GEBURTSDATUM:
				setGeburtsdatum((TeilbekanntesDatumType)null);
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
			case BaukastenPackage.GEBURT_TYPE__GEBURTSORT:
				return GEBURTSORT_EDEFAULT == null ? geburtsort != null : !GEBURTSORT_EDEFAULT.equals(geburtsort);
			case BaukastenPackage.GEBURT_TYPE__GEBURTSORT_STAAT:
				return geburtsortStaat != null;
			case BaukastenPackage.GEBURT_TYPE__GEBURTSDATUM:
				return geburtsdatum != null;
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
		result.append(" (geburtsort: ");
		result.append(geburtsort);
		result.append(')');
		return result.toString();
	}

} //GeburtTypeImpl
