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
import de.xoev.domea.domea.HistorienProtokollInformationType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Historien Protokoll Information Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.HistorienProtokollInformationTypeImpl#getMetadatumName <em>Metadatum Name</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.HistorienProtokollInformationTypeImpl#getMetadatumAlterWert <em>Metadatum Alter Wert</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.HistorienProtokollInformationTypeImpl#getMetadatumNeuerWert <em>Metadatum Neuer Wert</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.HistorienProtokollInformationTypeImpl#getAkteur <em>Akteur</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.HistorienProtokollInformationTypeImpl#getDatumUhrzeit <em>Datum Uhrzeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.HistorienProtokollInformationTypeImpl#getBemerkung <em>Bemerkung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.HistorienProtokollInformationTypeImpl#getAktion <em>Aktion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistorienProtokollInformationTypeImpl extends MinimalEObjectImpl.Container implements HistorienProtokollInformationType {
	/**
	 * The default value of the '{@link #getMetadatumName() <em>Metadatum Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadatumName()
	 * @generated
	 * @ordered
	 */
	protected static final String METADATUM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetadatumName() <em>Metadatum Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadatumName()
	 * @generated
	 * @ordered
	 */
	protected String metadatumName = METADATUM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetadatumAlterWert() <em>Metadatum Alter Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadatumAlterWert()
	 * @generated
	 * @ordered
	 */
	protected static final String METADATUM_ALTER_WERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetadatumAlterWert() <em>Metadatum Alter Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadatumAlterWert()
	 * @generated
	 * @ordered
	 */
	protected String metadatumAlterWert = METADATUM_ALTER_WERT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetadatumNeuerWert() <em>Metadatum Neuer Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadatumNeuerWert()
	 * @generated
	 * @ordered
	 */
	protected static final String METADATUM_NEUER_WERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetadatumNeuerWert() <em>Metadatum Neuer Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadatumNeuerWert()
	 * @generated
	 * @ordered
	 */
	protected String metadatumNeuerWert = METADATUM_NEUER_WERT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAkteur() <em>Akteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAkteur()
	 * @generated
	 * @ordered
	 */
	protected static final String AKTEUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAkteur() <em>Akteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAkteur()
	 * @generated
	 * @ordered
	 */
	protected String akteur = AKTEUR_EDEFAULT;

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
	 * The default value of the '{@link #getBemerkung() <em>Bemerkung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBemerkung()
	 * @generated
	 * @ordered
	 */
	protected static final String BEMERKUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBemerkung() <em>Bemerkung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBemerkung()
	 * @generated
	 * @ordered
	 */
	protected String bemerkung = BEMERKUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getAktion() <em>Aktion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktion()
	 * @generated
	 * @ordered
	 */
	protected static final String AKTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAktion() <em>Aktion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktion()
	 * @generated
	 * @ordered
	 */
	protected String aktion = AKTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistorienProtokollInformationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.HISTORIEN_PROTOKOLL_INFORMATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMetadatumName() {
		return metadatumName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadatumName(String newMetadatumName) {
		String oldMetadatumName = metadatumName;
		metadatumName = newMetadatumName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_NAME, oldMetadatumName, metadatumName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMetadatumAlterWert() {
		return metadatumAlterWert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadatumAlterWert(String newMetadatumAlterWert) {
		String oldMetadatumAlterWert = metadatumAlterWert;
		metadatumAlterWert = newMetadatumAlterWert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_ALTER_WERT, oldMetadatumAlterWert, metadatumAlterWert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMetadatumNeuerWert() {
		return metadatumNeuerWert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadatumNeuerWert(String newMetadatumNeuerWert) {
		String oldMetadatumNeuerWert = metadatumNeuerWert;
		metadatumNeuerWert = newMetadatumNeuerWert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_NEUER_WERT, oldMetadatumNeuerWert, metadatumNeuerWert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAkteur() {
		return akteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAkteur(String newAkteur) {
		String oldAkteur = akteur;
		akteur = newAkteur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__AKTEUR, oldAkteur, akteur));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__DATUM_UHRZEIT, oldDatumUhrzeit, datumUhrzeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBemerkung() {
		return bemerkung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBemerkung(String newBemerkung) {
		String oldBemerkung = bemerkung;
		bemerkung = newBemerkung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__BEMERKUNG, oldBemerkung, bemerkung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAktion() {
		return aktion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAktion(String newAktion) {
		String oldAktion = aktion;
		aktion = newAktion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__AKTION, oldAktion, aktion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_NAME:
				return getMetadatumName();
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_ALTER_WERT:
				return getMetadatumAlterWert();
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_NEUER_WERT:
				return getMetadatumNeuerWert();
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__AKTEUR:
				return getAkteur();
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__DATUM_UHRZEIT:
				return getDatumUhrzeit();
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__BEMERKUNG:
				return getBemerkung();
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__AKTION:
				return getAktion();
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
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_NAME:
				setMetadatumName((String)newValue);
				return;
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_ALTER_WERT:
				setMetadatumAlterWert((String)newValue);
				return;
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_NEUER_WERT:
				setMetadatumNeuerWert((String)newValue);
				return;
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__AKTEUR:
				setAkteur((String)newValue);
				return;
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__DATUM_UHRZEIT:
				setDatumUhrzeit((XMLGregorianCalendar)newValue);
				return;
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__BEMERKUNG:
				setBemerkung((String)newValue);
				return;
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__AKTION:
				setAktion((String)newValue);
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
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_NAME:
				setMetadatumName(METADATUM_NAME_EDEFAULT);
				return;
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_ALTER_WERT:
				setMetadatumAlterWert(METADATUM_ALTER_WERT_EDEFAULT);
				return;
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_NEUER_WERT:
				setMetadatumNeuerWert(METADATUM_NEUER_WERT_EDEFAULT);
				return;
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__AKTEUR:
				setAkteur(AKTEUR_EDEFAULT);
				return;
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__DATUM_UHRZEIT:
				setDatumUhrzeit(DATUM_UHRZEIT_EDEFAULT);
				return;
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__BEMERKUNG:
				setBemerkung(BEMERKUNG_EDEFAULT);
				return;
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__AKTION:
				setAktion(AKTION_EDEFAULT);
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
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_NAME:
				return METADATUM_NAME_EDEFAULT == null ? metadatumName != null : !METADATUM_NAME_EDEFAULT.equals(metadatumName);
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_ALTER_WERT:
				return METADATUM_ALTER_WERT_EDEFAULT == null ? metadatumAlterWert != null : !METADATUM_ALTER_WERT_EDEFAULT.equals(metadatumAlterWert);
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_NEUER_WERT:
				return METADATUM_NEUER_WERT_EDEFAULT == null ? metadatumNeuerWert != null : !METADATUM_NEUER_WERT_EDEFAULT.equals(metadatumNeuerWert);
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__AKTEUR:
				return AKTEUR_EDEFAULT == null ? akteur != null : !AKTEUR_EDEFAULT.equals(akteur);
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__DATUM_UHRZEIT:
				return DATUM_UHRZEIT_EDEFAULT == null ? datumUhrzeit != null : !DATUM_UHRZEIT_EDEFAULT.equals(datumUhrzeit);
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__BEMERKUNG:
				return BEMERKUNG_EDEFAULT == null ? bemerkung != null : !BEMERKUNG_EDEFAULT.equals(bemerkung);
			case DomeaPackage.HISTORIEN_PROTOKOLL_INFORMATION_TYPE__AKTION:
				return AKTION_EDEFAULT == null ? aktion != null : !AKTION_EDEFAULT.equals(aktion);
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
		result.append(" (metadatumName: ");
		result.append(metadatumName);
		result.append(", metadatumAlterWert: ");
		result.append(metadatumAlterWert);
		result.append(", metadatumNeuerWert: ");
		result.append(metadatumNeuerWert);
		result.append(", akteur: ");
		result.append(akteur);
		result.append(", datumUhrzeit: ");
		result.append(datumUhrzeit);
		result.append(", bemerkung: ");
		result.append(bemerkung);
		result.append(", aktion: ");
		result.append(aktion);
		result.append(')');
		return result.toString();
	}

} //HistorienProtokollInformationTypeImpl
