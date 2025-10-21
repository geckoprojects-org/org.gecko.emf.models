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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;
import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unterhaltsvorauszahlungen Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorauszahlungenTypeImpl#getZeitraumDerVorauszahlung <em>Zeitraum Der Vorauszahlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorauszahlungenTypeImpl#getBetragDerVorausZahlung <em>Betrag Der Voraus Zahlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorauszahlungenTypeImpl#getDatumDerVorauszahlung <em>Datum Der Vorauszahlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorauszahlungenTypeImpl#isZahlungenDritter <em>Zahlungen Dritter</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorauszahlungenTypeImpl#getPersonZahlungenDritter <em>Person Zahlungen Dritter</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorauszahlungenTypeImpl#getHoeheZahlungenDritter <em>Hoehe Zahlungen Dritter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnterhaltsvorauszahlungenTypeImpl extends MinimalEObjectImpl.Container implements UnterhaltsvorauszahlungenType {
	/**
	 * The cached value of the '{@link #getZeitraumDerVorauszahlung() <em>Zeitraum Der Vorauszahlung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraumDerVorauszahlung()
	 * @generated
	 * @ordered
	 */
	protected ZeitraumType zeitraumDerVorauszahlung;

	/**
	 * The default value of the '{@link #getBetragDerVorausZahlung() <em>Betrag Der Voraus Zahlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetragDerVorausZahlung()
	 * @generated
	 * @ordered
	 */
	protected static final String BETRAG_DER_VORAUS_ZAHLUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBetragDerVorausZahlung() <em>Betrag Der Voraus Zahlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetragDerVorausZahlung()
	 * @generated
	 * @ordered
	 */
	protected String betragDerVorausZahlung = BETRAG_DER_VORAUS_ZAHLUNG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatumDerVorauszahlung() <em>Datum Der Vorauszahlung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatumDerVorauszahlung()
	 * @generated
	 * @ordered
	 */
	protected TeilbekanntesDatumType datumDerVorauszahlung;

	/**
	 * The default value of the '{@link #isZahlungenDritter() <em>Zahlungen Dritter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZahlungenDritter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZAHLUNGEN_DRITTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZahlungenDritter() <em>Zahlungen Dritter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZahlungenDritter()
	 * @generated
	 * @ordered
	 */
	protected boolean zahlungenDritter = ZAHLUNGEN_DRITTER_EDEFAULT;

	/**
	 * This is true if the Zahlungen Dritter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zahlungenDritterESet;

	/**
	 * The default value of the '{@link #getPersonZahlungenDritter() <em>Person Zahlungen Dritter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonZahlungenDritter()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSON_ZAHLUNGEN_DRITTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonZahlungenDritter() <em>Person Zahlungen Dritter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonZahlungenDritter()
	 * @generated
	 * @ordered
	 */
	protected String personZahlungenDritter = PERSON_ZAHLUNGEN_DRITTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoeheZahlungenDritter() <em>Hoehe Zahlungen Dritter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoeheZahlungenDritter()
	 * @generated
	 * @ordered
	 */
	protected static final String HOEHE_ZAHLUNGEN_DRITTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHoeheZahlungenDritter() <em>Hoehe Zahlungen Dritter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoeheZahlungenDritter()
	 * @generated
	 * @ordered
	 */
	protected String hoeheZahlungenDritter = HOEHE_ZAHLUNGEN_DRITTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnterhaltsvorauszahlungenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getUnterhaltsvorauszahlungenType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZeitraumType getZeitraumDerVorauszahlung() {
		return zeitraumDerVorauszahlung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZeitraumDerVorauszahlung(ZeitraumType newZeitraumDerVorauszahlung, NotificationChain msgs) {
		ZeitraumType oldZeitraumDerVorauszahlung = zeitraumDerVorauszahlung;
		zeitraumDerVorauszahlung = newZeitraumDerVorauszahlung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__ZEITRAUM_DER_VORAUSZAHLUNG, oldZeitraumDerVorauszahlung, newZeitraumDerVorauszahlung);
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
	public void setZeitraumDerVorauszahlung(ZeitraumType newZeitraumDerVorauszahlung) {
		if (newZeitraumDerVorauszahlung != zeitraumDerVorauszahlung) {
			NotificationChain msgs = null;
			if (zeitraumDerVorauszahlung != null)
				msgs = ((InternalEObject)zeitraumDerVorauszahlung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__ZEITRAUM_DER_VORAUSZAHLUNG, null, msgs);
			if (newZeitraumDerVorauszahlung != null)
				msgs = ((InternalEObject)newZeitraumDerVorauszahlung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__ZEITRAUM_DER_VORAUSZAHLUNG, null, msgs);
			msgs = basicSetZeitraumDerVorauszahlung(newZeitraumDerVorauszahlung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__ZEITRAUM_DER_VORAUSZAHLUNG, newZeitraumDerVorauszahlung, newZeitraumDerVorauszahlung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBetragDerVorausZahlung() {
		return betragDerVorausZahlung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBetragDerVorausZahlung(String newBetragDerVorausZahlung) {
		String oldBetragDerVorausZahlung = betragDerVorausZahlung;
		betragDerVorausZahlung = newBetragDerVorausZahlung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__BETRAG_DER_VORAUS_ZAHLUNG, oldBetragDerVorausZahlung, betragDerVorausZahlung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeilbekanntesDatumType getDatumDerVorauszahlung() {
		return datumDerVorauszahlung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatumDerVorauszahlung(TeilbekanntesDatumType newDatumDerVorauszahlung, NotificationChain msgs) {
		TeilbekanntesDatumType oldDatumDerVorauszahlung = datumDerVorauszahlung;
		datumDerVorauszahlung = newDatumDerVorauszahlung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__DATUM_DER_VORAUSZAHLUNG, oldDatumDerVorauszahlung, newDatumDerVorauszahlung);
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
	public void setDatumDerVorauszahlung(TeilbekanntesDatumType newDatumDerVorauszahlung) {
		if (newDatumDerVorauszahlung != datumDerVorauszahlung) {
			NotificationChain msgs = null;
			if (datumDerVorauszahlung != null)
				msgs = ((InternalEObject)datumDerVorauszahlung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__DATUM_DER_VORAUSZAHLUNG, null, msgs);
			if (newDatumDerVorauszahlung != null)
				msgs = ((InternalEObject)newDatumDerVorauszahlung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__DATUM_DER_VORAUSZAHLUNG, null, msgs);
			msgs = basicSetDatumDerVorauszahlung(newDatumDerVorauszahlung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__DATUM_DER_VORAUSZAHLUNG, newDatumDerVorauszahlung, newDatumDerVorauszahlung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZahlungenDritter() {
		return zahlungenDritter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZahlungenDritter(boolean newZahlungenDritter) {
		boolean oldZahlungenDritter = zahlungenDritter;
		zahlungenDritter = newZahlungenDritter;
		boolean oldZahlungenDritterESet = zahlungenDritterESet;
		zahlungenDritterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__ZAHLUNGEN_DRITTER, oldZahlungenDritter, zahlungenDritter, !oldZahlungenDritterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZahlungenDritter() {
		boolean oldZahlungenDritter = zahlungenDritter;
		boolean oldZahlungenDritterESet = zahlungenDritterESet;
		zahlungenDritter = ZAHLUNGEN_DRITTER_EDEFAULT;
		zahlungenDritterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__ZAHLUNGEN_DRITTER, oldZahlungenDritter, ZAHLUNGEN_DRITTER_EDEFAULT, oldZahlungenDritterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZahlungenDritter() {
		return zahlungenDritterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPersonZahlungenDritter() {
		return personZahlungenDritter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersonZahlungenDritter(String newPersonZahlungenDritter) {
		String oldPersonZahlungenDritter = personZahlungenDritter;
		personZahlungenDritter = newPersonZahlungenDritter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__PERSON_ZAHLUNGEN_DRITTER, oldPersonZahlungenDritter, personZahlungenDritter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHoeheZahlungenDritter() {
		return hoeheZahlungenDritter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHoeheZahlungenDritter(String newHoeheZahlungenDritter) {
		String oldHoeheZahlungenDritter = hoeheZahlungenDritter;
		hoeheZahlungenDritter = newHoeheZahlungenDritter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__HOEHE_ZAHLUNGEN_DRITTER, oldHoeheZahlungenDritter, hoeheZahlungenDritter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__ZEITRAUM_DER_VORAUSZAHLUNG:
				return basicSetZeitraumDerVorauszahlung(null, msgs);
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__DATUM_DER_VORAUSZAHLUNG:
				return basicSetDatumDerVorauszahlung(null, msgs);
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
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__ZEITRAUM_DER_VORAUSZAHLUNG:
				return getZeitraumDerVorauszahlung();
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__BETRAG_DER_VORAUS_ZAHLUNG:
				return getBetragDerVorausZahlung();
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__DATUM_DER_VORAUSZAHLUNG:
				return getDatumDerVorauszahlung();
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__ZAHLUNGEN_DRITTER:
				return isZahlungenDritter();
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__PERSON_ZAHLUNGEN_DRITTER:
				return getPersonZahlungenDritter();
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__HOEHE_ZAHLUNGEN_DRITTER:
				return getHoeheZahlungenDritter();
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
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__ZEITRAUM_DER_VORAUSZAHLUNG:
				setZeitraumDerVorauszahlung((ZeitraumType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__BETRAG_DER_VORAUS_ZAHLUNG:
				setBetragDerVorausZahlung((String)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__DATUM_DER_VORAUSZAHLUNG:
				setDatumDerVorauszahlung((TeilbekanntesDatumType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__ZAHLUNGEN_DRITTER:
				setZahlungenDritter((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__PERSON_ZAHLUNGEN_DRITTER:
				setPersonZahlungenDritter((String)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__HOEHE_ZAHLUNGEN_DRITTER:
				setHoeheZahlungenDritter((String)newValue);
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
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__ZEITRAUM_DER_VORAUSZAHLUNG:
				setZeitraumDerVorauszahlung((ZeitraumType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__BETRAG_DER_VORAUS_ZAHLUNG:
				setBetragDerVorausZahlung(BETRAG_DER_VORAUS_ZAHLUNG_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__DATUM_DER_VORAUSZAHLUNG:
				setDatumDerVorauszahlung((TeilbekanntesDatumType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__ZAHLUNGEN_DRITTER:
				unsetZahlungenDritter();
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__PERSON_ZAHLUNGEN_DRITTER:
				setPersonZahlungenDritter(PERSON_ZAHLUNGEN_DRITTER_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__HOEHE_ZAHLUNGEN_DRITTER:
				setHoeheZahlungenDritter(HOEHE_ZAHLUNGEN_DRITTER_EDEFAULT);
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
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__ZEITRAUM_DER_VORAUSZAHLUNG:
				return zeitraumDerVorauszahlung != null;
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__BETRAG_DER_VORAUS_ZAHLUNG:
				return BETRAG_DER_VORAUS_ZAHLUNG_EDEFAULT == null ? betragDerVorausZahlung != null : !BETRAG_DER_VORAUS_ZAHLUNG_EDEFAULT.equals(betragDerVorausZahlung);
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__DATUM_DER_VORAUSZAHLUNG:
				return datumDerVorauszahlung != null;
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__ZAHLUNGEN_DRITTER:
				return isSetZahlungenDritter();
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__PERSON_ZAHLUNGEN_DRITTER:
				return PERSON_ZAHLUNGEN_DRITTER_EDEFAULT == null ? personZahlungenDritter != null : !PERSON_ZAHLUNGEN_DRITTER_EDEFAULT.equals(personZahlungenDritter);
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE__HOEHE_ZAHLUNGEN_DRITTER:
				return HOEHE_ZAHLUNGEN_DRITTER_EDEFAULT == null ? hoeheZahlungenDritter != null : !HOEHE_ZAHLUNGEN_DRITTER_EDEFAULT.equals(hoeheZahlungenDritter);
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
		result.append(" (betragDerVorausZahlung: ");
		result.append(betragDerVorausZahlung);
		result.append(", zahlungenDritter: ");
		if (zahlungenDritterESet) result.append(zahlungenDritter); else result.append("<unset>");
		result.append(", personZahlungenDritter: ");
		result.append(personZahlungenDritter);
		result.append(", hoeheZahlungenDritter: ");
		result.append(hoeheZahlungenDritter);
		result.append(')');
		return result.toString();
	}

} //UnterhaltsvorauszahlungenTypeImpl
