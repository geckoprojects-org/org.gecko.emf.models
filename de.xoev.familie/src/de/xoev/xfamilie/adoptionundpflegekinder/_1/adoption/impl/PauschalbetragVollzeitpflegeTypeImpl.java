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
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontoinformationenType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweisType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindBasisType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonBasisType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SignaturType;

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
 * An implementation of the model object '<em><b>Pauschalbetrag Vollzeitpflege Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PauschalbetragVollzeitpflegeTypeImpl#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PauschalbetragVollzeitpflegeTypeImpl#getAngabenPflegekind <em>Angaben Pflegekind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PauschalbetragVollzeitpflegeTypeImpl#getPflegeperson <em>Pflegeperson</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PauschalbetragVollzeitpflegeTypeImpl#getKinder <em>Kinder</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PauschalbetragVollzeitpflegeTypeImpl#getKontoinformationen <em>Kontoinformationen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PauschalbetragVollzeitpflegeTypeImpl#getNachweise <em>Nachweise</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PauschalbetragVollzeitpflegeTypeImpl#getDatenschutzDerFachbehoerde <em>Datenschutz Der Fachbehoerde</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PauschalbetragVollzeitpflegeTypeImpl#getSignatur <em>Signatur</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PauschalbetragVollzeitpflegeTypeImpl#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PauschalbetragVollzeitpflegeTypeImpl extends MinimalEObjectImpl.Container implements PauschalbetragVollzeitpflegeType {
	/**
	 * The cached value of the '{@link #getDatenschutzUndEinwilligung() <em>Datenschutz Und Einwilligung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenschutzUndEinwilligung()
	 * @generated
	 * @ordered
	 */
	protected DatenschutzUndEinwilligungType datenschutzUndEinwilligung;

	/**
	 * The cached value of the '{@link #getAngabenPflegekind() <em>Angaben Pflegekind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenPflegekind()
	 * @generated
	 * @ordered
	 */
	protected AngabenPflegekindType angabenPflegekind;

	/**
	 * The cached value of the '{@link #getPflegeperson() <em>Pflegeperson</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPflegeperson()
	 * @generated
	 * @ordered
	 */
	protected EList<PflegepersonBasisType> pflegeperson;

	/**
	 * The cached value of the '{@link #getKinder() <em>Kinder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKinder()
	 * @generated
	 * @ordered
	 */
	protected EList<PflegekindBasisType> kinder;

	/**
	 * The cached value of the '{@link #getKontoinformationen() <em>Kontoinformationen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKontoinformationen()
	 * @generated
	 * @ordered
	 */
	protected KontoinformationenType kontoinformationen;

	/**
	 * The cached value of the '{@link #getNachweise() <em>Nachweise</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweise()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisType> nachweise;

	/**
	 * The cached value of the '{@link #getDatenschutzDerFachbehoerde() <em>Datenschutz Der Fachbehoerde</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenschutzDerFachbehoerde()
	 * @generated
	 * @ordered
	 */
	protected EList<DatenschutzUndEinwilligungType> datenschutzDerFachbehoerde;

	/**
	 * The cached value of the '{@link #getSignatur() <em>Signatur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatur()
	 * @generated
	 * @ordered
	 */
	protected SignaturType signatur;

	/**
	 * The cached value of the '{@link #getDigitalerRueckkanal() <em>Digitaler Rueckkanal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigitalerRueckkanal()
	 * @generated
	 * @ordered
	 */
	protected DigitalerRueckkanalType digitalerRueckkanal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PauschalbetragVollzeitpflegeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatenschutzUndEinwilligungType getDatenschutzUndEinwilligung() {
		return datenschutzUndEinwilligung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatenschutzUndEinwilligung(DatenschutzUndEinwilligungType newDatenschutzUndEinwilligung, NotificationChain msgs) {
		DatenschutzUndEinwilligungType oldDatenschutzUndEinwilligung = datenschutzUndEinwilligung;
		datenschutzUndEinwilligung = newDatenschutzUndEinwilligung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, oldDatenschutzUndEinwilligung, newDatenschutzUndEinwilligung);
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
	public void setDatenschutzUndEinwilligung(DatenschutzUndEinwilligungType newDatenschutzUndEinwilligung) {
		if (newDatenschutzUndEinwilligung != datenschutzUndEinwilligung) {
			NotificationChain msgs = null;
			if (datenschutzUndEinwilligung != null)
				msgs = ((InternalEObject)datenschutzUndEinwilligung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, null, msgs);
			if (newDatenschutzUndEinwilligung != null)
				msgs = ((InternalEObject)newDatenschutzUndEinwilligung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, null, msgs);
			msgs = basicSetDatenschutzUndEinwilligung(newDatenschutzUndEinwilligung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, newDatenschutzUndEinwilligung, newDatenschutzUndEinwilligung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenPflegekindType getAngabenPflegekind() {
		return angabenPflegekind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenPflegekind(AngabenPflegekindType newAngabenPflegekind, NotificationChain msgs) {
		AngabenPflegekindType oldAngabenPflegekind = angabenPflegekind;
		angabenPflegekind = newAngabenPflegekind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__ANGABEN_PFLEGEKIND, oldAngabenPflegekind, newAngabenPflegekind);
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
	public void setAngabenPflegekind(AngabenPflegekindType newAngabenPflegekind) {
		if (newAngabenPflegekind != angabenPflegekind) {
			NotificationChain msgs = null;
			if (angabenPflegekind != null)
				msgs = ((InternalEObject)angabenPflegekind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__ANGABEN_PFLEGEKIND, null, msgs);
			if (newAngabenPflegekind != null)
				msgs = ((InternalEObject)newAngabenPflegekind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__ANGABEN_PFLEGEKIND, null, msgs);
			msgs = basicSetAngabenPflegekind(newAngabenPflegekind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__ANGABEN_PFLEGEKIND, newAngabenPflegekind, newAngabenPflegekind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PflegepersonBasisType> getPflegeperson() {
		if (pflegeperson == null) {
			pflegeperson = new EObjectContainmentEList<PflegepersonBasisType>(PflegepersonBasisType.class, this, AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__PFLEGEPERSON);
		}
		return pflegeperson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PflegekindBasisType> getKinder() {
		if (kinder == null) {
			kinder = new EObjectContainmentEList<PflegekindBasisType>(PflegekindBasisType.class, this, AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__KINDER);
		}
		return kinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KontoinformationenType getKontoinformationen() {
		return kontoinformationen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKontoinformationen(KontoinformationenType newKontoinformationen, NotificationChain msgs) {
		KontoinformationenType oldKontoinformationen = kontoinformationen;
		kontoinformationen = newKontoinformationen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__KONTOINFORMATIONEN, oldKontoinformationen, newKontoinformationen);
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
	public void setKontoinformationen(KontoinformationenType newKontoinformationen) {
		if (newKontoinformationen != kontoinformationen) {
			NotificationChain msgs = null;
			if (kontoinformationen != null)
				msgs = ((InternalEObject)kontoinformationen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__KONTOINFORMATIONEN, null, msgs);
			if (newKontoinformationen != null)
				msgs = ((InternalEObject)newKontoinformationen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__KONTOINFORMATIONEN, null, msgs);
			msgs = basicSetKontoinformationen(newKontoinformationen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__KONTOINFORMATIONEN, newKontoinformationen, newKontoinformationen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisType> getNachweise() {
		if (nachweise == null) {
			nachweise = new EObjectContainmentEList<NachweisType>(NachweisType.class, this, AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__NACHWEISE);
		}
		return nachweise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatenschutzUndEinwilligungType> getDatenschutzDerFachbehoerde() {
		if (datenschutzDerFachbehoerde == null) {
			datenschutzDerFachbehoerde = new EObjectContainmentEList<DatenschutzUndEinwilligungType>(DatenschutzUndEinwilligungType.class, this, AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE);
		}
		return datenschutzDerFachbehoerde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignaturType getSignatur() {
		return signatur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignatur(SignaturType newSignatur, NotificationChain msgs) {
		SignaturType oldSignatur = signatur;
		signatur = newSignatur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__SIGNATUR, oldSignatur, newSignatur);
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
	public void setSignatur(SignaturType newSignatur) {
		if (newSignatur != signatur) {
			NotificationChain msgs = null;
			if (signatur != null)
				msgs = ((InternalEObject)signatur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__SIGNATUR, null, msgs);
			if (newSignatur != null)
				msgs = ((InternalEObject)newSignatur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__SIGNATUR, null, msgs);
			msgs = basicSetSignatur(newSignatur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__SIGNATUR, newSignatur, newSignatur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DigitalerRueckkanalType getDigitalerRueckkanal() {
		return digitalerRueckkanal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDigitalerRueckkanal(DigitalerRueckkanalType newDigitalerRueckkanal, NotificationChain msgs) {
		DigitalerRueckkanalType oldDigitalerRueckkanal = digitalerRueckkanal;
		digitalerRueckkanal = newDigitalerRueckkanal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DIGITALER_RUECKKANAL, oldDigitalerRueckkanal, newDigitalerRueckkanal);
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
	public void setDigitalerRueckkanal(DigitalerRueckkanalType newDigitalerRueckkanal) {
		if (newDigitalerRueckkanal != digitalerRueckkanal) {
			NotificationChain msgs = null;
			if (digitalerRueckkanal != null)
				msgs = ((InternalEObject)digitalerRueckkanal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DIGITALER_RUECKKANAL, null, msgs);
			if (newDigitalerRueckkanal != null)
				msgs = ((InternalEObject)newDigitalerRueckkanal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DIGITALER_RUECKKANAL, null, msgs);
			msgs = basicSetDigitalerRueckkanal(newDigitalerRueckkanal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DIGITALER_RUECKKANAL, newDigitalerRueckkanal, newDigitalerRueckkanal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				return basicSetDatenschutzUndEinwilligung(null, msgs);
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__ANGABEN_PFLEGEKIND:
				return basicSetAngabenPflegekind(null, msgs);
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__PFLEGEPERSON:
				return ((InternalEList<?>)getPflegeperson()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__KINDER:
				return ((InternalEList<?>)getKinder()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__KONTOINFORMATIONEN:
				return basicSetKontoinformationen(null, msgs);
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__NACHWEISE:
				return ((InternalEList<?>)getNachweise()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				return ((InternalEList<?>)getDatenschutzDerFachbehoerde()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__SIGNATUR:
				return basicSetSignatur(null, msgs);
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DIGITALER_RUECKKANAL:
				return basicSetDigitalerRueckkanal(null, msgs);
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
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				return getDatenschutzUndEinwilligung();
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__ANGABEN_PFLEGEKIND:
				return getAngabenPflegekind();
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__PFLEGEPERSON:
				return getPflegeperson();
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__KINDER:
				return getKinder();
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__KONTOINFORMATIONEN:
				return getKontoinformationen();
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__NACHWEISE:
				return getNachweise();
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				return getDatenschutzDerFachbehoerde();
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__SIGNATUR:
				return getSignatur();
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DIGITALER_RUECKKANAL:
				return getDigitalerRueckkanal();
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
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				setDatenschutzUndEinwilligung((DatenschutzUndEinwilligungType)newValue);
				return;
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__ANGABEN_PFLEGEKIND:
				setAngabenPflegekind((AngabenPflegekindType)newValue);
				return;
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__PFLEGEPERSON:
				getPflegeperson().clear();
				getPflegeperson().addAll((Collection<? extends PflegepersonBasisType>)newValue);
				return;
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__KINDER:
				getKinder().clear();
				getKinder().addAll((Collection<? extends PflegekindBasisType>)newValue);
				return;
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__KONTOINFORMATIONEN:
				setKontoinformationen((KontoinformationenType)newValue);
				return;
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__NACHWEISE:
				getNachweise().clear();
				getNachweise().addAll((Collection<? extends NachweisType>)newValue);
				return;
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				getDatenschutzDerFachbehoerde().clear();
				getDatenschutzDerFachbehoerde().addAll((Collection<? extends DatenschutzUndEinwilligungType>)newValue);
				return;
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__SIGNATUR:
				setSignatur((SignaturType)newValue);
				return;
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DIGITALER_RUECKKANAL:
				setDigitalerRueckkanal((DigitalerRueckkanalType)newValue);
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
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				setDatenschutzUndEinwilligung((DatenschutzUndEinwilligungType)null);
				return;
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__ANGABEN_PFLEGEKIND:
				setAngabenPflegekind((AngabenPflegekindType)null);
				return;
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__PFLEGEPERSON:
				getPflegeperson().clear();
				return;
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__KINDER:
				getKinder().clear();
				return;
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__KONTOINFORMATIONEN:
				setKontoinformationen((KontoinformationenType)null);
				return;
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__NACHWEISE:
				getNachweise().clear();
				return;
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				getDatenschutzDerFachbehoerde().clear();
				return;
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__SIGNATUR:
				setSignatur((SignaturType)null);
				return;
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DIGITALER_RUECKKANAL:
				setDigitalerRueckkanal((DigitalerRueckkanalType)null);
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
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				return datenschutzUndEinwilligung != null;
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__ANGABEN_PFLEGEKIND:
				return angabenPflegekind != null;
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__PFLEGEPERSON:
				return pflegeperson != null && !pflegeperson.isEmpty();
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__KINDER:
				return kinder != null && !kinder.isEmpty();
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__KONTOINFORMATIONEN:
				return kontoinformationen != null;
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__NACHWEISE:
				return nachweise != null && !nachweise.isEmpty();
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				return datenschutzDerFachbehoerde != null && !datenschutzDerFachbehoerde.isEmpty();
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__SIGNATUR:
				return signatur != null;
			case AdoptionPackage.PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DIGITALER_RUECKKANAL:
				return digitalerRueckkanal != null;
		}
		return super.eIsSet(featureID);
	}

} //PauschalbetragVollzeitpflegeTypeImpl
