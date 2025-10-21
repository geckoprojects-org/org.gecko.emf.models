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
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenPflegeType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SignaturType;

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

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
 * An implementation of the model object '<em><b>Alterssicherung Pflegeperson Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AlterssicherungPflegepersonTypeImpl#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AlterssicherungPflegepersonTypeImpl#getAllgemeineAngaben <em>Allgemeine Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AlterssicherungPflegepersonTypeImpl#getAntragdetailsAlterssicherung <em>Antragdetails Alterssicherung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AlterssicherungPflegepersonTypeImpl#getPflegekinder <em>Pflegekinder</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AlterssicherungPflegepersonTypeImpl#getNachweise <em>Nachweise</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AlterssicherungPflegepersonTypeImpl#getDatenschutzDerFachbehoerde <em>Datenschutz Der Fachbehoerde</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AlterssicherungPflegepersonTypeImpl#getSignatur <em>Signatur</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AlterssicherungPflegepersonTypeImpl#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlterssicherungPflegepersonTypeImpl extends MinimalEObjectImpl.Container implements AlterssicherungPflegepersonType {
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
	 * The cached value of the '{@link #getAllgemeineAngaben() <em>Allgemeine Angaben</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllgemeineAngaben()
	 * @generated
	 * @ordered
	 */
	protected EList<AllgemeineAngabenPflegeType> allgemeineAngaben;

	/**
	 * The cached value of the '{@link #getAntragdetailsAlterssicherung() <em>Antragdetails Alterssicherung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntragdetailsAlterssicherung()
	 * @generated
	 * @ordered
	 */
	protected AntragdetailsAlterssicherungType antragdetailsAlterssicherung;

	/**
	 * The cached value of the '{@link #getPflegekinder() <em>Pflegekinder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPflegekinder()
	 * @generated
	 * @ordered
	 */
	protected EList<PflegekindType> pflegekinder;

	/**
	 * The cached value of the '{@link #getNachweise() <em>Nachweise</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweise()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweise;

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
	protected AlterssicherungPflegepersonTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.ALTERSSICHERUNG_PFLEGEPERSON_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, oldDatenschutzUndEinwilligung, newDatenschutzUndEinwilligung);
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
				msgs = ((InternalEObject)datenschutzUndEinwilligung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, null, msgs);
			if (newDatenschutzUndEinwilligung != null)
				msgs = ((InternalEObject)newDatenschutzUndEinwilligung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, null, msgs);
			msgs = basicSetDatenschutzUndEinwilligung(newDatenschutzUndEinwilligung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, newDatenschutzUndEinwilligung, newDatenschutzUndEinwilligung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AllgemeineAngabenPflegeType> getAllgemeineAngaben() {
		if (allgemeineAngaben == null) {
			allgemeineAngaben = new EObjectContainmentEList<AllgemeineAngabenPflegeType>(AllgemeineAngabenPflegeType.class, this, AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__ALLGEMEINE_ANGABEN);
		}
		return allgemeineAngaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragdetailsAlterssicherungType getAntragdetailsAlterssicherung() {
		return antragdetailsAlterssicherung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAntragdetailsAlterssicherung(AntragdetailsAlterssicherungType newAntragdetailsAlterssicherung, NotificationChain msgs) {
		AntragdetailsAlterssicherungType oldAntragdetailsAlterssicherung = antragdetailsAlterssicherung;
		antragdetailsAlterssicherung = newAntragdetailsAlterssicherung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__ANTRAGDETAILS_ALTERSSICHERUNG, oldAntragdetailsAlterssicherung, newAntragdetailsAlterssicherung);
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
	public void setAntragdetailsAlterssicherung(AntragdetailsAlterssicherungType newAntragdetailsAlterssicherung) {
		if (newAntragdetailsAlterssicherung != antragdetailsAlterssicherung) {
			NotificationChain msgs = null;
			if (antragdetailsAlterssicherung != null)
				msgs = ((InternalEObject)antragdetailsAlterssicherung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__ANTRAGDETAILS_ALTERSSICHERUNG, null, msgs);
			if (newAntragdetailsAlterssicherung != null)
				msgs = ((InternalEObject)newAntragdetailsAlterssicherung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__ANTRAGDETAILS_ALTERSSICHERUNG, null, msgs);
			msgs = basicSetAntragdetailsAlterssicherung(newAntragdetailsAlterssicherung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__ANTRAGDETAILS_ALTERSSICHERUNG, newAntragdetailsAlterssicherung, newAntragdetailsAlterssicherung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PflegekindType> getPflegekinder() {
		if (pflegekinder == null) {
			pflegekinder = new EObjectContainmentEList<PflegekindType>(PflegekindType.class, this, AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__PFLEGEKINDER);
		}
		return pflegekinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweise() {
		if (nachweise == null) {
			nachweise = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__NACHWEISE);
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
			datenschutzDerFachbehoerde = new EObjectContainmentEList<DatenschutzUndEinwilligungType>(DatenschutzUndEinwilligungType.class, this, AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__SIGNATUR, oldSignatur, newSignatur);
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
				msgs = ((InternalEObject)signatur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__SIGNATUR, null, msgs);
			if (newSignatur != null)
				msgs = ((InternalEObject)newSignatur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__SIGNATUR, null, msgs);
			msgs = basicSetSignatur(newSignatur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__SIGNATUR, newSignatur, newSignatur));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL, oldDigitalerRueckkanal, newDigitalerRueckkanal);
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
				msgs = ((InternalEObject)digitalerRueckkanal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL, null, msgs);
			if (newDigitalerRueckkanal != null)
				msgs = ((InternalEObject)newDigitalerRueckkanal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL, null, msgs);
			msgs = basicSetDigitalerRueckkanal(newDigitalerRueckkanal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL, newDigitalerRueckkanal, newDigitalerRueckkanal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				return basicSetDatenschutzUndEinwilligung(null, msgs);
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__ALLGEMEINE_ANGABEN:
				return ((InternalEList<?>)getAllgemeineAngaben()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__ANTRAGDETAILS_ALTERSSICHERUNG:
				return basicSetAntragdetailsAlterssicherung(null, msgs);
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__PFLEGEKINDER:
				return ((InternalEList<?>)getPflegekinder()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__NACHWEISE:
				return ((InternalEList<?>)getNachweise()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				return ((InternalEList<?>)getDatenschutzDerFachbehoerde()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__SIGNATUR:
				return basicSetSignatur(null, msgs);
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL:
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
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				return getDatenschutzUndEinwilligung();
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__ALLGEMEINE_ANGABEN:
				return getAllgemeineAngaben();
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__ANTRAGDETAILS_ALTERSSICHERUNG:
				return getAntragdetailsAlterssicherung();
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__PFLEGEKINDER:
				return getPflegekinder();
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__NACHWEISE:
				return getNachweise();
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				return getDatenschutzDerFachbehoerde();
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__SIGNATUR:
				return getSignatur();
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL:
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
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				setDatenschutzUndEinwilligung((DatenschutzUndEinwilligungType)newValue);
				return;
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__ALLGEMEINE_ANGABEN:
				getAllgemeineAngaben().clear();
				getAllgemeineAngaben().addAll((Collection<? extends AllgemeineAngabenPflegeType>)newValue);
				return;
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__ANTRAGDETAILS_ALTERSSICHERUNG:
				setAntragdetailsAlterssicherung((AntragdetailsAlterssicherungType)newValue);
				return;
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__PFLEGEKINDER:
				getPflegekinder().clear();
				getPflegekinder().addAll((Collection<? extends PflegekindType>)newValue);
				return;
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__NACHWEISE:
				getNachweise().clear();
				getNachweise().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				getDatenschutzDerFachbehoerde().clear();
				getDatenschutzDerFachbehoerde().addAll((Collection<? extends DatenschutzUndEinwilligungType>)newValue);
				return;
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__SIGNATUR:
				setSignatur((SignaturType)newValue);
				return;
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL:
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
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				setDatenschutzUndEinwilligung((DatenschutzUndEinwilligungType)null);
				return;
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__ALLGEMEINE_ANGABEN:
				getAllgemeineAngaben().clear();
				return;
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__ANTRAGDETAILS_ALTERSSICHERUNG:
				setAntragdetailsAlterssicherung((AntragdetailsAlterssicherungType)null);
				return;
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__PFLEGEKINDER:
				getPflegekinder().clear();
				return;
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__NACHWEISE:
				getNachweise().clear();
				return;
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				getDatenschutzDerFachbehoerde().clear();
				return;
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__SIGNATUR:
				setSignatur((SignaturType)null);
				return;
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL:
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
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				return datenschutzUndEinwilligung != null;
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__ALLGEMEINE_ANGABEN:
				return allgemeineAngaben != null && !allgemeineAngaben.isEmpty();
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__ANTRAGDETAILS_ALTERSSICHERUNG:
				return antragdetailsAlterssicherung != null;
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__PFLEGEKINDER:
				return pflegekinder != null && !pflegekinder.isEmpty();
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__NACHWEISE:
				return nachweise != null && !nachweise.isEmpty();
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				return datenschutzDerFachbehoerde != null && !datenschutzDerFachbehoerde.isEmpty();
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__SIGNATUR:
				return signatur != null;
			case AdoptionPackage.ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL:
				return digitalerRueckkanal != null;
		}
		return super.eIsSet(featureID);
	}

} //AlterssicherungPflegepersonTypeImpl
