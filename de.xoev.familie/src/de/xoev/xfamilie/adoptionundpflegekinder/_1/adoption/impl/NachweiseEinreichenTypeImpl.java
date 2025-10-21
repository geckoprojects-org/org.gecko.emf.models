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
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweisType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType;

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
 * An implementation of the model object '<em><b>Nachweise Einreichen Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.NachweiseEinreichenTypeImpl#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.NachweiseEinreichenTypeImpl#getAntragsteller <em>Antragsteller</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.NachweiseEinreichenTypeImpl#getNachweise <em>Nachweise</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.NachweiseEinreichenTypeImpl#getDatenschutzDerFachbehoerde <em>Datenschutz Der Fachbehoerde</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.NachweiseEinreichenTypeImpl#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NachweiseEinreichenTypeImpl extends MinimalEObjectImpl.Container implements NachweiseEinreichenType {
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
	 * The cached value of the '{@link #getAntragsteller() <em>Antragsteller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntragsteller()
	 * @generated
	 * @ordered
	 */
	protected AntragstellerType antragsteller;

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
	protected NachweiseEinreichenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.NACHWEISE_EINREICHEN_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, oldDatenschutzUndEinwilligung, newDatenschutzUndEinwilligung);
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
				msgs = ((InternalEObject)datenschutzUndEinwilligung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, null, msgs);
			if (newDatenschutzUndEinwilligung != null)
				msgs = ((InternalEObject)newDatenschutzUndEinwilligung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, null, msgs);
			msgs = basicSetDatenschutzUndEinwilligung(newDatenschutzUndEinwilligung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, newDatenschutzUndEinwilligung, newDatenschutzUndEinwilligung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragstellerType getAntragsteller() {
		return antragsteller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAntragsteller(AntragstellerType newAntragsteller, NotificationChain msgs) {
		AntragstellerType oldAntragsteller = antragsteller;
		antragsteller = newAntragsteller;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__ANTRAGSTELLER, oldAntragsteller, newAntragsteller);
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
	public void setAntragsteller(AntragstellerType newAntragsteller) {
		if (newAntragsteller != antragsteller) {
			NotificationChain msgs = null;
			if (antragsteller != null)
				msgs = ((InternalEObject)antragsteller).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__ANTRAGSTELLER, null, msgs);
			if (newAntragsteller != null)
				msgs = ((InternalEObject)newAntragsteller).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__ANTRAGSTELLER, null, msgs);
			msgs = basicSetAntragsteller(newAntragsteller, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__ANTRAGSTELLER, newAntragsteller, newAntragsteller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisType> getNachweise() {
		if (nachweise == null) {
			nachweise = new EObjectContainmentEList<NachweisType>(NachweisType.class, this, AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__NACHWEISE);
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
			datenschutzDerFachbehoerde = new EObjectContainmentEList<DatenschutzUndEinwilligungType>(DatenschutzUndEinwilligungType.class, this, AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE);
		}
		return datenschutzDerFachbehoerde;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DIGITALER_RUECKKANAL, oldDigitalerRueckkanal, newDigitalerRueckkanal);
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
				msgs = ((InternalEObject)digitalerRueckkanal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DIGITALER_RUECKKANAL, null, msgs);
			if (newDigitalerRueckkanal != null)
				msgs = ((InternalEObject)newDigitalerRueckkanal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DIGITALER_RUECKKANAL, null, msgs);
			msgs = basicSetDigitalerRueckkanal(newDigitalerRueckkanal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DIGITALER_RUECKKANAL, newDigitalerRueckkanal, newDigitalerRueckkanal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				return basicSetDatenschutzUndEinwilligung(null, msgs);
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__ANTRAGSTELLER:
				return basicSetAntragsteller(null, msgs);
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__NACHWEISE:
				return ((InternalEList<?>)getNachweise()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				return ((InternalEList<?>)getDatenschutzDerFachbehoerde()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DIGITALER_RUECKKANAL:
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
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				return getDatenschutzUndEinwilligung();
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__ANTRAGSTELLER:
				return getAntragsteller();
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__NACHWEISE:
				return getNachweise();
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				return getDatenschutzDerFachbehoerde();
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DIGITALER_RUECKKANAL:
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
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				setDatenschutzUndEinwilligung((DatenschutzUndEinwilligungType)newValue);
				return;
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__ANTRAGSTELLER:
				setAntragsteller((AntragstellerType)newValue);
				return;
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__NACHWEISE:
				getNachweise().clear();
				getNachweise().addAll((Collection<? extends NachweisType>)newValue);
				return;
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				getDatenschutzDerFachbehoerde().clear();
				getDatenschutzDerFachbehoerde().addAll((Collection<? extends DatenschutzUndEinwilligungType>)newValue);
				return;
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DIGITALER_RUECKKANAL:
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
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				setDatenschutzUndEinwilligung((DatenschutzUndEinwilligungType)null);
				return;
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__ANTRAGSTELLER:
				setAntragsteller((AntragstellerType)null);
				return;
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__NACHWEISE:
				getNachweise().clear();
				return;
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				getDatenschutzDerFachbehoerde().clear();
				return;
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DIGITALER_RUECKKANAL:
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
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				return datenschutzUndEinwilligung != null;
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__ANTRAGSTELLER:
				return antragsteller != null;
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__NACHWEISE:
				return nachweise != null && !nachweise.isEmpty();
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				return datenschutzDerFachbehoerde != null && !datenschutzDerFachbehoerde.isEmpty();
			case AdoptionPackage.NACHWEISE_EINREICHEN_TYPE__DIGITALER_RUECKKANAL:
				return digitalerRueckkanal != null;
		}
		return super.eIsSet(featureID);
	}

} //NachweiseEinreichenTypeImpl
