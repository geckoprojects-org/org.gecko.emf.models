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
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nachweisdokument Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachweisdokumentTypeImpl#getDokumentid <em>Dokumentid</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachweisdokumentTypeImpl#getDateiname <em>Dateiname</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachweisdokumentTypeImpl#getMimetype <em>Mimetype</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachweisdokumentTypeImpl#getKategorie <em>Kategorie</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NachweisdokumentTypeImpl extends MinimalEObjectImpl.Container implements NachweisdokumentType {
	/**
	 * The default value of the '{@link #getDokumentid() <em>Dokumentid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDokumentid()
	 * @generated
	 * @ordered
	 */
	protected static final String DOKUMENTID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDokumentid() <em>Dokumentid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDokumentid()
	 * @generated
	 * @ordered
	 */
	protected String dokumentid = DOKUMENTID_EDEFAULT;

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
	 * The default value of the '{@link #getMimetype() <em>Mimetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimetype()
	 * @generated
	 * @ordered
	 */
	protected static final String MIMETYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimetype() <em>Mimetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimetype()
	 * @generated
	 * @ordered
	 */
	protected String mimetype = MIMETYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKategorie() <em>Kategorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKategorie()
	 * @generated
	 * @ordered
	 */
	protected static final String KATEGORIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKategorie() <em>Kategorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKategorie()
	 * @generated
	 * @ordered
	 */
	protected String kategorie = KATEGORIE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NachweisdokumentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.NACHWEISDOKUMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDokumentid() {
		return dokumentid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDokumentid(String newDokumentid) {
		String oldDokumentid = dokumentid;
		dokumentid = newDokumentid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHWEISDOKUMENT_TYPE__DOKUMENTID, oldDokumentid, dokumentid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHWEISDOKUMENT_TYPE__DATEINAME, oldDateiname, dateiname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMimetype() {
		return mimetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMimetype(String newMimetype) {
		String oldMimetype = mimetype;
		mimetype = newMimetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHWEISDOKUMENT_TYPE__MIMETYPE, oldMimetype, mimetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKategorie() {
		return kategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKategorie(String newKategorie) {
		String oldKategorie = kategorie;
		kategorie = newKategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHWEISDOKUMENT_TYPE__KATEGORIE, oldKategorie, kategorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BaukastenPackage.NACHWEISDOKUMENT_TYPE__DOKUMENTID:
				return getDokumentid();
			case BaukastenPackage.NACHWEISDOKUMENT_TYPE__DATEINAME:
				return getDateiname();
			case BaukastenPackage.NACHWEISDOKUMENT_TYPE__MIMETYPE:
				return getMimetype();
			case BaukastenPackage.NACHWEISDOKUMENT_TYPE__KATEGORIE:
				return getKategorie();
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
			case BaukastenPackage.NACHWEISDOKUMENT_TYPE__DOKUMENTID:
				setDokumentid((String)newValue);
				return;
			case BaukastenPackage.NACHWEISDOKUMENT_TYPE__DATEINAME:
				setDateiname((String)newValue);
				return;
			case BaukastenPackage.NACHWEISDOKUMENT_TYPE__MIMETYPE:
				setMimetype((String)newValue);
				return;
			case BaukastenPackage.NACHWEISDOKUMENT_TYPE__KATEGORIE:
				setKategorie((String)newValue);
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
			case BaukastenPackage.NACHWEISDOKUMENT_TYPE__DOKUMENTID:
				setDokumentid(DOKUMENTID_EDEFAULT);
				return;
			case BaukastenPackage.NACHWEISDOKUMENT_TYPE__DATEINAME:
				setDateiname(DATEINAME_EDEFAULT);
				return;
			case BaukastenPackage.NACHWEISDOKUMENT_TYPE__MIMETYPE:
				setMimetype(MIMETYPE_EDEFAULT);
				return;
			case BaukastenPackage.NACHWEISDOKUMENT_TYPE__KATEGORIE:
				setKategorie(KATEGORIE_EDEFAULT);
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
			case BaukastenPackage.NACHWEISDOKUMENT_TYPE__DOKUMENTID:
				return DOKUMENTID_EDEFAULT == null ? dokumentid != null : !DOKUMENTID_EDEFAULT.equals(dokumentid);
			case BaukastenPackage.NACHWEISDOKUMENT_TYPE__DATEINAME:
				return DATEINAME_EDEFAULT == null ? dateiname != null : !DATEINAME_EDEFAULT.equals(dateiname);
			case BaukastenPackage.NACHWEISDOKUMENT_TYPE__MIMETYPE:
				return MIMETYPE_EDEFAULT == null ? mimetype != null : !MIMETYPE_EDEFAULT.equals(mimetype);
			case BaukastenPackage.NACHWEISDOKUMENT_TYPE__KATEGORIE:
				return KATEGORIE_EDEFAULT == null ? kategorie != null : !KATEGORIE_EDEFAULT.equals(kategorie);
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
		result.append(" (dokumentid: ");
		result.append(dokumentid);
		result.append(", dateiname: ");
		result.append(dateiname);
		result.append(", mimetype: ");
		result.append(mimetype);
		result.append(", kategorie: ");
		result.append(kategorie);
		result.append(')');
		return result.toString();
	}

} //NachweisdokumentTypeImpl
