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
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontakformularType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adoptionundpflegekinder Adoption0901 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionundpflegekinderAdoption0901TypeImpl#getKontaktformular <em>Kontaktformular</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionundpflegekinderAdoption0901TypeImpl#getNachweiseEinreichen <em>Nachweise Einreichen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionundpflegekinderAdoption0901TypeImpl#getStiefkindadoption <em>Stiefkindadoption</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionundpflegekinderAdoption0901TypeImpl#getVerwandtenadoption <em>Verwandtenadoption</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionundpflegekinderAdoption0901TypeImpl#getFremdkindadoption <em>Fremdkindadoption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdoptionundpflegekinderAdoption0901TypeImpl extends NachrichtTypeImpl implements AdoptionundpflegekinderAdoption0901Type {
	/**
	 * The cached value of the '{@link #getKontaktformular() <em>Kontaktformular</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKontaktformular()
	 * @generated
	 * @ordered
	 */
	protected KontakformularType kontaktformular;

	/**
	 * The cached value of the '{@link #getNachweiseEinreichen() <em>Nachweise Einreichen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweiseEinreichen()
	 * @generated
	 * @ordered
	 */
	protected NachweiseEinreichenType nachweiseEinreichen;

	/**
	 * The cached value of the '{@link #getStiefkindadoption() <em>Stiefkindadoption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStiefkindadoption()
	 * @generated
	 * @ordered
	 */
	protected StiefkindadoptionType stiefkindadoption;

	/**
	 * The cached value of the '{@link #getVerwandtenadoption() <em>Verwandtenadoption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerwandtenadoption()
	 * @generated
	 * @ordered
	 */
	protected VerwandtenadoptionType verwandtenadoption;

	/**
	 * The cached value of the '{@link #getFremdkindadoption() <em>Fremdkindadoption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFremdkindadoption()
	 * @generated
	 * @ordered
	 */
	protected FremdkindadoptionType fremdkindadoption;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdoptionundpflegekinderAdoption0901TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KontakformularType getKontaktformular() {
		return kontaktformular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKontaktformular(KontakformularType newKontaktformular, NotificationChain msgs) {
		KontakformularType oldKontaktformular = kontaktformular;
		kontaktformular = newKontaktformular;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__KONTAKTFORMULAR, oldKontaktformular, newKontaktformular);
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
	public void setKontaktformular(KontakformularType newKontaktformular) {
		if (newKontaktformular != kontaktformular) {
			NotificationChain msgs = null;
			if (kontaktformular != null)
				msgs = ((InternalEObject)kontaktformular).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__KONTAKTFORMULAR, null, msgs);
			if (newKontaktformular != null)
				msgs = ((InternalEObject)newKontaktformular).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__KONTAKTFORMULAR, null, msgs);
			msgs = basicSetKontaktformular(newKontaktformular, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__KONTAKTFORMULAR, newKontaktformular, newKontaktformular));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweiseEinreichenType getNachweiseEinreichen() {
		return nachweiseEinreichen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachweiseEinreichen(NachweiseEinreichenType newNachweiseEinreichen, NotificationChain msgs) {
		NachweiseEinreichenType oldNachweiseEinreichen = nachweiseEinreichen;
		nachweiseEinreichen = newNachweiseEinreichen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__NACHWEISE_EINREICHEN, oldNachweiseEinreichen, newNachweiseEinreichen);
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
	public void setNachweiseEinreichen(NachweiseEinreichenType newNachweiseEinreichen) {
		if (newNachweiseEinreichen != nachweiseEinreichen) {
			NotificationChain msgs = null;
			if (nachweiseEinreichen != null)
				msgs = ((InternalEObject)nachweiseEinreichen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__NACHWEISE_EINREICHEN, null, msgs);
			if (newNachweiseEinreichen != null)
				msgs = ((InternalEObject)newNachweiseEinreichen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__NACHWEISE_EINREICHEN, null, msgs);
			msgs = basicSetNachweiseEinreichen(newNachweiseEinreichen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__NACHWEISE_EINREICHEN, newNachweiseEinreichen, newNachweiseEinreichen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StiefkindadoptionType getStiefkindadoption() {
		return stiefkindadoption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStiefkindadoption(StiefkindadoptionType newStiefkindadoption, NotificationChain msgs) {
		StiefkindadoptionType oldStiefkindadoption = stiefkindadoption;
		stiefkindadoption = newStiefkindadoption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__STIEFKINDADOPTION, oldStiefkindadoption, newStiefkindadoption);
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
	public void setStiefkindadoption(StiefkindadoptionType newStiefkindadoption) {
		if (newStiefkindadoption != stiefkindadoption) {
			NotificationChain msgs = null;
			if (stiefkindadoption != null)
				msgs = ((InternalEObject)stiefkindadoption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__STIEFKINDADOPTION, null, msgs);
			if (newStiefkindadoption != null)
				msgs = ((InternalEObject)newStiefkindadoption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__STIEFKINDADOPTION, null, msgs);
			msgs = basicSetStiefkindadoption(newStiefkindadoption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__STIEFKINDADOPTION, newStiefkindadoption, newStiefkindadoption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerwandtenadoptionType getVerwandtenadoption() {
		return verwandtenadoption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerwandtenadoption(VerwandtenadoptionType newVerwandtenadoption, NotificationChain msgs) {
		VerwandtenadoptionType oldVerwandtenadoption = verwandtenadoption;
		verwandtenadoption = newVerwandtenadoption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__VERWANDTENADOPTION, oldVerwandtenadoption, newVerwandtenadoption);
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
	public void setVerwandtenadoption(VerwandtenadoptionType newVerwandtenadoption) {
		if (newVerwandtenadoption != verwandtenadoption) {
			NotificationChain msgs = null;
			if (verwandtenadoption != null)
				msgs = ((InternalEObject)verwandtenadoption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__VERWANDTENADOPTION, null, msgs);
			if (newVerwandtenadoption != null)
				msgs = ((InternalEObject)newVerwandtenadoption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__VERWANDTENADOPTION, null, msgs);
			msgs = basicSetVerwandtenadoption(newVerwandtenadoption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__VERWANDTENADOPTION, newVerwandtenadoption, newVerwandtenadoption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FremdkindadoptionType getFremdkindadoption() {
		return fremdkindadoption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFremdkindadoption(FremdkindadoptionType newFremdkindadoption, NotificationChain msgs) {
		FremdkindadoptionType oldFremdkindadoption = fremdkindadoption;
		fremdkindadoption = newFremdkindadoption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__FREMDKINDADOPTION, oldFremdkindadoption, newFremdkindadoption);
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
	public void setFremdkindadoption(FremdkindadoptionType newFremdkindadoption) {
		if (newFremdkindadoption != fremdkindadoption) {
			NotificationChain msgs = null;
			if (fremdkindadoption != null)
				msgs = ((InternalEObject)fremdkindadoption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__FREMDKINDADOPTION, null, msgs);
			if (newFremdkindadoption != null)
				msgs = ((InternalEObject)newFremdkindadoption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__FREMDKINDADOPTION, null, msgs);
			msgs = basicSetFremdkindadoption(newFremdkindadoption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__FREMDKINDADOPTION, newFremdkindadoption, newFremdkindadoption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__KONTAKTFORMULAR:
				return basicSetKontaktformular(null, msgs);
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__NACHWEISE_EINREICHEN:
				return basicSetNachweiseEinreichen(null, msgs);
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__STIEFKINDADOPTION:
				return basicSetStiefkindadoption(null, msgs);
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__VERWANDTENADOPTION:
				return basicSetVerwandtenadoption(null, msgs);
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__FREMDKINDADOPTION:
				return basicSetFremdkindadoption(null, msgs);
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
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__KONTAKTFORMULAR:
				return getKontaktformular();
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__NACHWEISE_EINREICHEN:
				return getNachweiseEinreichen();
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__STIEFKINDADOPTION:
				return getStiefkindadoption();
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__VERWANDTENADOPTION:
				return getVerwandtenadoption();
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__FREMDKINDADOPTION:
				return getFremdkindadoption();
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
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__KONTAKTFORMULAR:
				setKontaktformular((KontakformularType)newValue);
				return;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__NACHWEISE_EINREICHEN:
				setNachweiseEinreichen((NachweiseEinreichenType)newValue);
				return;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__STIEFKINDADOPTION:
				setStiefkindadoption((StiefkindadoptionType)newValue);
				return;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__VERWANDTENADOPTION:
				setVerwandtenadoption((VerwandtenadoptionType)newValue);
				return;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__FREMDKINDADOPTION:
				setFremdkindadoption((FremdkindadoptionType)newValue);
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
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__KONTAKTFORMULAR:
				setKontaktformular((KontakformularType)null);
				return;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__NACHWEISE_EINREICHEN:
				setNachweiseEinreichen((NachweiseEinreichenType)null);
				return;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__STIEFKINDADOPTION:
				setStiefkindadoption((StiefkindadoptionType)null);
				return;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__VERWANDTENADOPTION:
				setVerwandtenadoption((VerwandtenadoptionType)null);
				return;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__FREMDKINDADOPTION:
				setFremdkindadoption((FremdkindadoptionType)null);
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
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__KONTAKTFORMULAR:
				return kontaktformular != null;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__NACHWEISE_EINREICHEN:
				return nachweiseEinreichen != null;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__STIEFKINDADOPTION:
				return stiefkindadoption != null;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__VERWANDTENADOPTION:
				return verwandtenadoption != null;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__FREMDKINDADOPTION:
				return fremdkindadoption != null;
		}
		return super.eIsSet(featureID);
	}

} //AdoptionundpflegekinderAdoption0901TypeImpl
