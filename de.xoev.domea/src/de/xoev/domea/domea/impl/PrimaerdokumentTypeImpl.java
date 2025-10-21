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
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.HashType;
import de.xoev.domea.domea.PrimaerdokumentType;
import de.xoev.domea.domea.SignaturSiegelType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primaerdokument Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.PrimaerdokumentTypeImpl#getDateiname <em>Dateiname</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.PrimaerdokumentTypeImpl#getDateinameOriginal <em>Dateiname Original</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.PrimaerdokumentTypeImpl#getErsteller <em>Ersteller</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.PrimaerdokumentTypeImpl#getDatumUhrzeit <em>Datum Uhrzeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.PrimaerdokumentTypeImpl#getSignaturSiegel <em>Signatur Siegel</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.PrimaerdokumentTypeImpl#getZeitpunktLetzteAenderung <em>Zeitpunkt Letzte Aenderung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.PrimaerdokumentTypeImpl#getHash <em>Hash</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaerdokumentTypeImpl extends MinimalEObjectImpl.Container implements PrimaerdokumentType {
	/**
	 * The default value of the '{@link #getDateiname() <em>Dateiname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateiname()
	 * @generated
	 * @ordered
	 */
	protected static final String DATEINAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateiname() <em>Dateiname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateiname()
	 * @generated
	 * @ordered
	 */
	protected String dateiname = DATEINAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateinameOriginal() <em>Dateiname Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateinameOriginal()
	 * @generated
	 * @ordered
	 */
	protected static final String DATEINAME_ORIGINAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateinameOriginal() <em>Dateiname Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateinameOriginal()
	 * @generated
	 * @ordered
	 */
	protected String dateinameOriginal = DATEINAME_ORIGINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getErsteller() <em>Ersteller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErsteller()
	 * @generated
	 * @ordered
	 */
	protected static final String ERSTELLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErsteller() <em>Ersteller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErsteller()
	 * @generated
	 * @ordered
	 */
	protected String ersteller = ERSTELLER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatumUhrzeit() <em>Datum Uhrzeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatumUhrzeit()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATUM_UHRZEIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatumUhrzeit() <em>Datum Uhrzeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatumUhrzeit()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar datumUhrzeit = DATUM_UHRZEIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSignaturSiegel() <em>Signatur Siegel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignaturSiegel()
	 * @generated
	 * @ordered
	 */
	protected SignaturSiegelType signaturSiegel;

	/**
	 * The default value of the '{@link #getZeitpunktLetzteAenderung() <em>Zeitpunkt Letzte Aenderung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitpunktLetzteAenderung()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ZEITPUNKT_LETZTE_AENDERUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZeitpunktLetzteAenderung() <em>Zeitpunkt Letzte Aenderung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitpunktLetzteAenderung()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar zeitpunktLetzteAenderung = ZEITPUNKT_LETZTE_AENDERUNG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHash() <em>Hash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHash()
	 * @generated
	 * @ordered
	 */
	protected HashType hash;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaerdokumentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.PRIMAERDOKUMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDateiname() {
		return dateiname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateiname(String newDateiname) {
		String oldDateiname = dateiname;
		dateiname = newDateiname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.PRIMAERDOKUMENT_TYPE__DATEINAME, oldDateiname, dateiname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDateinameOriginal() {
		return dateinameOriginal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateinameOriginal(String newDateinameOriginal) {
		String oldDateinameOriginal = dateinameOriginal;
		dateinameOriginal = newDateinameOriginal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.PRIMAERDOKUMENT_TYPE__DATEINAME_ORIGINAL, oldDateinameOriginal, dateinameOriginal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getErsteller() {
		return ersteller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErsteller(String newErsteller) {
		String oldErsteller = ersteller;
		ersteller = newErsteller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.PRIMAERDOKUMENT_TYPE__ERSTELLER, oldErsteller, ersteller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getDatumUhrzeit() {
		return datumUhrzeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatumUhrzeit(XMLGregorianCalendar newDatumUhrzeit) {
		XMLGregorianCalendar oldDatumUhrzeit = datumUhrzeit;
		datumUhrzeit = newDatumUhrzeit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.PRIMAERDOKUMENT_TYPE__DATUM_UHRZEIT, oldDatumUhrzeit, datumUhrzeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignaturSiegelType getSignaturSiegel() {
		return signaturSiegel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignaturSiegel(SignaturSiegelType newSignaturSiegel, NotificationChain msgs) {
		SignaturSiegelType oldSignaturSiegel = signaturSiegel;
		signaturSiegel = newSignaturSiegel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.PRIMAERDOKUMENT_TYPE__SIGNATUR_SIEGEL, oldSignaturSiegel, newSignaturSiegel);
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
	public void setSignaturSiegel(SignaturSiegelType newSignaturSiegel) {
		if (newSignaturSiegel != signaturSiegel) {
			NotificationChain msgs = null;
			if (signaturSiegel != null)
				msgs = ((InternalEObject)signaturSiegel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.PRIMAERDOKUMENT_TYPE__SIGNATUR_SIEGEL, null, msgs);
			if (newSignaturSiegel != null)
				msgs = ((InternalEObject)newSignaturSiegel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.PRIMAERDOKUMENT_TYPE__SIGNATUR_SIEGEL, null, msgs);
			msgs = basicSetSignaturSiegel(newSignaturSiegel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.PRIMAERDOKUMENT_TYPE__SIGNATUR_SIEGEL, newSignaturSiegel, newSignaturSiegel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getZeitpunktLetzteAenderung() {
		return zeitpunktLetzteAenderung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZeitpunktLetzteAenderung(XMLGregorianCalendar newZeitpunktLetzteAenderung) {
		XMLGregorianCalendar oldZeitpunktLetzteAenderung = zeitpunktLetzteAenderung;
		zeitpunktLetzteAenderung = newZeitpunktLetzteAenderung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.PRIMAERDOKUMENT_TYPE__ZEITPUNKT_LETZTE_AENDERUNG, oldZeitpunktLetzteAenderung, zeitpunktLetzteAenderung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HashType getHash() {
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHash(HashType newHash, NotificationChain msgs) {
		HashType oldHash = hash;
		hash = newHash;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.PRIMAERDOKUMENT_TYPE__HASH, oldHash, newHash);
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
	public void setHash(HashType newHash) {
		if (newHash != hash) {
			NotificationChain msgs = null;
			if (hash != null)
				msgs = ((InternalEObject)hash).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.PRIMAERDOKUMENT_TYPE__HASH, null, msgs);
			if (newHash != null)
				msgs = ((InternalEObject)newHash).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.PRIMAERDOKUMENT_TYPE__HASH, null, msgs);
			msgs = basicSetHash(newHash, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.PRIMAERDOKUMENT_TYPE__HASH, newHash, newHash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__SIGNATUR_SIEGEL:
				return basicSetSignaturSiegel(null, msgs);
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__HASH:
				return basicSetHash(null, msgs);
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
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__DATEINAME:
				return getDateiname();
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__DATEINAME_ORIGINAL:
				return getDateinameOriginal();
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__ERSTELLER:
				return getErsteller();
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__DATUM_UHRZEIT:
				return getDatumUhrzeit();
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__SIGNATUR_SIEGEL:
				return getSignaturSiegel();
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__ZEITPUNKT_LETZTE_AENDERUNG:
				return getZeitpunktLetzteAenderung();
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__HASH:
				return getHash();
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
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__DATEINAME:
				setDateiname((String)newValue);
				return;
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__DATEINAME_ORIGINAL:
				setDateinameOriginal((String)newValue);
				return;
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__ERSTELLER:
				setErsteller((String)newValue);
				return;
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__DATUM_UHRZEIT:
				setDatumUhrzeit((XMLGregorianCalendar)newValue);
				return;
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__SIGNATUR_SIEGEL:
				setSignaturSiegel((SignaturSiegelType)newValue);
				return;
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__ZEITPUNKT_LETZTE_AENDERUNG:
				setZeitpunktLetzteAenderung((XMLGregorianCalendar)newValue);
				return;
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__HASH:
				setHash((HashType)newValue);
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
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__DATEINAME:
				setDateiname(DATEINAME_EDEFAULT);
				return;
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__DATEINAME_ORIGINAL:
				setDateinameOriginal(DATEINAME_ORIGINAL_EDEFAULT);
				return;
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__ERSTELLER:
				setErsteller(ERSTELLER_EDEFAULT);
				return;
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__DATUM_UHRZEIT:
				setDatumUhrzeit(DATUM_UHRZEIT_EDEFAULT);
				return;
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__SIGNATUR_SIEGEL:
				setSignaturSiegel((SignaturSiegelType)null);
				return;
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__ZEITPUNKT_LETZTE_AENDERUNG:
				setZeitpunktLetzteAenderung(ZEITPUNKT_LETZTE_AENDERUNG_EDEFAULT);
				return;
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__HASH:
				setHash((HashType)null);
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
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__DATEINAME:
				return DATEINAME_EDEFAULT == null ? dateiname != null : !DATEINAME_EDEFAULT.equals(dateiname);
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__DATEINAME_ORIGINAL:
				return DATEINAME_ORIGINAL_EDEFAULT == null ? dateinameOriginal != null : !DATEINAME_ORIGINAL_EDEFAULT.equals(dateinameOriginal);
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__ERSTELLER:
				return ERSTELLER_EDEFAULT == null ? ersteller != null : !ERSTELLER_EDEFAULT.equals(ersteller);
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__DATUM_UHRZEIT:
				return DATUM_UHRZEIT_EDEFAULT == null ? datumUhrzeit != null : !DATUM_UHRZEIT_EDEFAULT.equals(datumUhrzeit);
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__SIGNATUR_SIEGEL:
				return signaturSiegel != null;
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__ZEITPUNKT_LETZTE_AENDERUNG:
				return ZEITPUNKT_LETZTE_AENDERUNG_EDEFAULT == null ? zeitpunktLetzteAenderung != null : !ZEITPUNKT_LETZTE_AENDERUNG_EDEFAULT.equals(zeitpunktLetzteAenderung);
			case DomeaPackage.PRIMAERDOKUMENT_TYPE__HASH:
				return hash != null;
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
		result.append(" (dateiname: ");
		result.append(dateiname);
		result.append(", dateinameOriginal: ");
		result.append(dateinameOriginal);
		result.append(", ersteller: ");
		result.append(ersteller);
		result.append(", datumUhrzeit: ");
		result.append(datumUhrzeit);
		result.append(", zeitpunktLetzteAenderung: ");
		result.append(zeitpunktLetzteAenderung);
		result.append(')');
		return result.toString();
	}

} //PrimaerdokumentTypeImpl
