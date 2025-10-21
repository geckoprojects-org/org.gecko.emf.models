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

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BestaetigungAngabenType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unterhaltsvorschussantrag Nachweisnachricht0311 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragNachweisnachricht0311TypeImpl#getNachweis <em>Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragNachweisnachricht0311TypeImpl#getZugehoerigerAntrag <em>Zugehoeriger Antrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragNachweisnachricht0311TypeImpl#getGesamtZahlDerNachrichten <em>Gesamt Zahl Der Nachrichten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragNachweisnachricht0311TypeImpl#isArtSignaturDigital <em>Art Signatur Digital</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragNachweisnachricht0311TypeImpl#getBestaetigungAngaben <em>Bestaetigung Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragNachweisnachricht0311TypeImpl#isMerkblattUVG <em>Merkblatt UVG</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnterhaltsvorschussantragNachweisnachricht0311TypeImpl extends NachrichtTypeImpl implements UnterhaltsvorschussantragNachweisnachricht0311Type {
	/**
	 * The cached value of the '{@link #getNachweis() <em>Nachweis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweis()
	 * @generated
	 * @ordered
	 */
	protected NachweisdokumentType nachweis;

	/**
	 * The default value of the '{@link #getZugehoerigerAntrag() <em>Zugehoeriger Antrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZugehoerigerAntrag()
	 * @generated
	 * @ordered
	 */
	protected static final String ZUGEHOERIGER_ANTRAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZugehoerigerAntrag() <em>Zugehoeriger Antrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZugehoerigerAntrag()
	 * @generated
	 * @ordered
	 */
	protected String zugehoerigerAntrag = ZUGEHOERIGER_ANTRAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getGesamtZahlDerNachrichten() <em>Gesamt Zahl Der Nachrichten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGesamtZahlDerNachrichten()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger GESAMT_ZAHL_DER_NACHRICHTEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGesamtZahlDerNachrichten() <em>Gesamt Zahl Der Nachrichten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGesamtZahlDerNachrichten()
	 * @generated
	 * @ordered
	 */
	protected BigInteger gesamtZahlDerNachrichten = GESAMT_ZAHL_DER_NACHRICHTEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isArtSignaturDigital() <em>Art Signatur Digital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArtSignaturDigital()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ART_SIGNATUR_DIGITAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArtSignaturDigital() <em>Art Signatur Digital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArtSignaturDigital()
	 * @generated
	 * @ordered
	 */
	protected boolean artSignaturDigital = ART_SIGNATUR_DIGITAL_EDEFAULT;

	/**
	 * This is true if the Art Signatur Digital attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean artSignaturDigitalESet;

	/**
	 * The cached value of the '{@link #getBestaetigungAngaben() <em>Bestaetigung Angaben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestaetigungAngaben()
	 * @generated
	 * @ordered
	 */
	protected BestaetigungAngabenType bestaetigungAngaben;

	/**
	 * The default value of the '{@link #isMerkblattUVG() <em>Merkblatt UVG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMerkblattUVG()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MERKBLATT_UVG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMerkblattUVG() <em>Merkblatt UVG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMerkblattUVG()
	 * @generated
	 * @ordered
	 */
	protected boolean merkblattUVG = MERKBLATT_UVG_EDEFAULT;

	/**
	 * This is true if the Merkblatt UVG attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean merkblattUVGESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnterhaltsvorschussantragNachweisnachricht0311TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getUnterhaltsvorschussantragNachweisnachricht0311Type();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisdokumentType getNachweis() {
		return nachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachweis(NachweisdokumentType newNachweis, NotificationChain msgs) {
		NachweisdokumentType oldNachweis = nachweis;
		nachweis = newNachweis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__NACHWEIS, oldNachweis, newNachweis);
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
	public void setNachweis(NachweisdokumentType newNachweis) {
		if (newNachweis != nachweis) {
			NotificationChain msgs = null;
			if (nachweis != null)
				msgs = ((InternalEObject)nachweis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__NACHWEIS, null, msgs);
			if (newNachweis != null)
				msgs = ((InternalEObject)newNachweis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__NACHWEIS, null, msgs);
			msgs = basicSetNachweis(newNachweis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__NACHWEIS, newNachweis, newNachweis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZugehoerigerAntrag() {
		return zugehoerigerAntrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZugehoerigerAntrag(String newZugehoerigerAntrag) {
		String oldZugehoerigerAntrag = zugehoerigerAntrag;
		zugehoerigerAntrag = newZugehoerigerAntrag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__ZUGEHOERIGER_ANTRAG, oldZugehoerigerAntrag, zugehoerigerAntrag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getGesamtZahlDerNachrichten() {
		return gesamtZahlDerNachrichten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGesamtZahlDerNachrichten(BigInteger newGesamtZahlDerNachrichten) {
		BigInteger oldGesamtZahlDerNachrichten = gesamtZahlDerNachrichten;
		gesamtZahlDerNachrichten = newGesamtZahlDerNachrichten;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__GESAMT_ZAHL_DER_NACHRICHTEN, oldGesamtZahlDerNachrichten, gesamtZahlDerNachrichten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isArtSignaturDigital() {
		return artSignaturDigital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtSignaturDigital(boolean newArtSignaturDigital) {
		boolean oldArtSignaturDigital = artSignaturDigital;
		artSignaturDigital = newArtSignaturDigital;
		boolean oldArtSignaturDigitalESet = artSignaturDigitalESet;
		artSignaturDigitalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__ART_SIGNATUR_DIGITAL, oldArtSignaturDigital, artSignaturDigital, !oldArtSignaturDigitalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetArtSignaturDigital() {
		boolean oldArtSignaturDigital = artSignaturDigital;
		boolean oldArtSignaturDigitalESet = artSignaturDigitalESet;
		artSignaturDigital = ART_SIGNATUR_DIGITAL_EDEFAULT;
		artSignaturDigitalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__ART_SIGNATUR_DIGITAL, oldArtSignaturDigital, ART_SIGNATUR_DIGITAL_EDEFAULT, oldArtSignaturDigitalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetArtSignaturDigital() {
		return artSignaturDigitalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BestaetigungAngabenType getBestaetigungAngaben() {
		return bestaetigungAngaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBestaetigungAngaben(BestaetigungAngabenType newBestaetigungAngaben, NotificationChain msgs) {
		BestaetigungAngabenType oldBestaetigungAngaben = bestaetigungAngaben;
		bestaetigungAngaben = newBestaetigungAngaben;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__BESTAETIGUNG_ANGABEN, oldBestaetigungAngaben, newBestaetigungAngaben);
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
	public void setBestaetigungAngaben(BestaetigungAngabenType newBestaetigungAngaben) {
		if (newBestaetigungAngaben != bestaetigungAngaben) {
			NotificationChain msgs = null;
			if (bestaetigungAngaben != null)
				msgs = ((InternalEObject)bestaetigungAngaben).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__BESTAETIGUNG_ANGABEN, null, msgs);
			if (newBestaetigungAngaben != null)
				msgs = ((InternalEObject)newBestaetigungAngaben).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__BESTAETIGUNG_ANGABEN, null, msgs);
			msgs = basicSetBestaetigungAngaben(newBestaetigungAngaben, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__BESTAETIGUNG_ANGABEN, newBestaetigungAngaben, newBestaetigungAngaben));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMerkblattUVG() {
		return merkblattUVG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerkblattUVG(boolean newMerkblattUVG) {
		boolean oldMerkblattUVG = merkblattUVG;
		merkblattUVG = newMerkblattUVG;
		boolean oldMerkblattUVGESet = merkblattUVGESet;
		merkblattUVGESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__MERKBLATT_UVG, oldMerkblattUVG, merkblattUVG, !oldMerkblattUVGESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMerkblattUVG() {
		boolean oldMerkblattUVG = merkblattUVG;
		boolean oldMerkblattUVGESet = merkblattUVGESet;
		merkblattUVG = MERKBLATT_UVG_EDEFAULT;
		merkblattUVGESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__MERKBLATT_UVG, oldMerkblattUVG, MERKBLATT_UVG_EDEFAULT, oldMerkblattUVGESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMerkblattUVG() {
		return merkblattUVGESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__NACHWEIS:
				return basicSetNachweis(null, msgs);
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__BESTAETIGUNG_ANGABEN:
				return basicSetBestaetigungAngaben(null, msgs);
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
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__NACHWEIS:
				return getNachweis();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__ZUGEHOERIGER_ANTRAG:
				return getZugehoerigerAntrag();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__GESAMT_ZAHL_DER_NACHRICHTEN:
				return getGesamtZahlDerNachrichten();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__ART_SIGNATUR_DIGITAL:
				return isArtSignaturDigital();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__BESTAETIGUNG_ANGABEN:
				return getBestaetigungAngaben();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__MERKBLATT_UVG:
				return isMerkblattUVG();
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
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__NACHWEIS:
				setNachweis((NachweisdokumentType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__ZUGEHOERIGER_ANTRAG:
				setZugehoerigerAntrag((String)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__GESAMT_ZAHL_DER_NACHRICHTEN:
				setGesamtZahlDerNachrichten((BigInteger)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__ART_SIGNATUR_DIGITAL:
				setArtSignaturDigital((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__BESTAETIGUNG_ANGABEN:
				setBestaetigungAngaben((BestaetigungAngabenType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__MERKBLATT_UVG:
				setMerkblattUVG((Boolean)newValue);
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
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__NACHWEIS:
				setNachweis((NachweisdokumentType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__ZUGEHOERIGER_ANTRAG:
				setZugehoerigerAntrag(ZUGEHOERIGER_ANTRAG_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__GESAMT_ZAHL_DER_NACHRICHTEN:
				setGesamtZahlDerNachrichten(GESAMT_ZAHL_DER_NACHRICHTEN_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__ART_SIGNATUR_DIGITAL:
				unsetArtSignaturDigital();
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__BESTAETIGUNG_ANGABEN:
				setBestaetigungAngaben((BestaetigungAngabenType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__MERKBLATT_UVG:
				unsetMerkblattUVG();
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
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__NACHWEIS:
				return nachweis != null;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__ZUGEHOERIGER_ANTRAG:
				return ZUGEHOERIGER_ANTRAG_EDEFAULT == null ? zugehoerigerAntrag != null : !ZUGEHOERIGER_ANTRAG_EDEFAULT.equals(zugehoerigerAntrag);
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__GESAMT_ZAHL_DER_NACHRICHTEN:
				return GESAMT_ZAHL_DER_NACHRICHTEN_EDEFAULT == null ? gesamtZahlDerNachrichten != null : !GESAMT_ZAHL_DER_NACHRICHTEN_EDEFAULT.equals(gesamtZahlDerNachrichten);
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__ART_SIGNATUR_DIGITAL:
				return isSetArtSignaturDigital();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__BESTAETIGUNG_ANGABEN:
				return bestaetigungAngaben != null;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__MERKBLATT_UVG:
				return isSetMerkblattUVG();
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
		result.append(" (zugehoerigerAntrag: ");
		result.append(zugehoerigerAntrag);
		result.append(", gesamtZahlDerNachrichten: ");
		result.append(gesamtZahlDerNachrichten);
		result.append(", artSignaturDigital: ");
		if (artSignaturDigitalESet) result.append(artSignaturDigital); else result.append("<unset>");
		result.append(", merkblattUVG: ");
		if (merkblattUVGESet) result.append(merkblattUVG); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UnterhaltsvorschussantragNachweisnachricht0311TypeImpl
