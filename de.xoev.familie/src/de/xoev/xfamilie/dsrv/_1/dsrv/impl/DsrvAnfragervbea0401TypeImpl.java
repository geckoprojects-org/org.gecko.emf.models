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
package de.xoev.xfamilie.dsrv._1.dsrv.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.GeburtGeburtsortOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl;

import de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage;
import de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsrv Anfragervbea0401 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvAnfragervbea0401TypeImpl#getAbfrageID <em>Abfrage ID</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvAnfragervbea0401TypeImpl#getAnforderungsgrund <em>Anforderungsgrund</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvAnfragervbea0401TypeImpl#getEinkommensDatenBisDatum <em>Einkommens Daten Bis Datum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvAnfragervbea0401TypeImpl#getEinkommensDatenVonDatum <em>Einkommens Daten Von Datum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvAnfragervbea0401TypeImpl#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvAnfragervbea0401TypeImpl#getNameNatuerlichePerson <em>Name Natuerliche Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvAnfragervbea0401TypeImpl#getAnschrift <em>Anschrift</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DsrvAnfragervbea0401TypeImpl extends NachrichtTypeImpl implements DsrvAnfragervbea0401Type {
	/**
	 * The default value of the '{@link #getAbfrageID() <em>Abfrage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbfrageID()
	 * @generated
	 * @ordered
	 */
	protected static final String ABFRAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbfrageID() <em>Abfrage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbfrageID()
	 * @generated
	 * @ordered
	 */
	protected String abfrageID = ABFRAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnforderungsgrund() <em>Anforderungsgrund</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnforderungsgrund()
	 * @generated
	 * @ordered
	 */
	protected static final String ANFORDERUNGSGRUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnforderungsgrund() <em>Anforderungsgrund</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnforderungsgrund()
	 * @generated
	 * @ordered
	 */
	protected String anforderungsgrund = ANFORDERUNGSGRUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getEinkommensDatenBisDatum() <em>Einkommens Daten Bis Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkommensDatenBisDatum()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EINKOMMENS_DATEN_BIS_DATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEinkommensDatenBisDatum() <em>Einkommens Daten Bis Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkommensDatenBisDatum()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar einkommensDatenBisDatum = EINKOMMENS_DATEN_BIS_DATUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getEinkommensDatenVonDatum() <em>Einkommens Daten Von Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkommensDatenVonDatum()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EINKOMMENS_DATEN_VON_DATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEinkommensDatenVonDatum() <em>Einkommens Daten Von Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkommensDatenVonDatum()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar einkommensDatenVonDatum = EINKOMMENS_DATEN_VON_DATUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeburt() <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburt()
	 * @generated
	 * @ordered
	 */
	protected GeburtGeburtsortOptionalType geburt;

	/**
	 * The cached value of the '{@link #getNameNatuerlichePerson() <em>Name Natuerliche Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameNatuerlichePerson()
	 * @generated
	 * @ordered
	 */
	protected NameNatuerlichePersonType nameNatuerlichePerson;

	/**
	 * The cached value of the '{@link #getAnschrift() <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschrift()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftBasisType anschrift;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DsrvAnfragervbea0401TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSRVPackage.Literals.DSRV_ANFRAGERVBEA0401_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbfrageID() {
		return abfrageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbfrageID(String newAbfrageID) {
		String oldAbfrageID = abfrageID;
		abfrageID = newAbfrageID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__ABFRAGE_ID, oldAbfrageID, abfrageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnforderungsgrund() {
		return anforderungsgrund;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnforderungsgrund(String newAnforderungsgrund) {
		String oldAnforderungsgrund = anforderungsgrund;
		anforderungsgrund = newAnforderungsgrund;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__ANFORDERUNGSGRUND, oldAnforderungsgrund, anforderungsgrund));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getEinkommensDatenBisDatum() {
		return einkommensDatenBisDatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinkommensDatenBisDatum(XMLGregorianCalendar newEinkommensDatenBisDatum) {
		XMLGregorianCalendar oldEinkommensDatenBisDatum = einkommensDatenBisDatum;
		einkommensDatenBisDatum = newEinkommensDatenBisDatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__EINKOMMENS_DATEN_BIS_DATUM, oldEinkommensDatenBisDatum, einkommensDatenBisDatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getEinkommensDatenVonDatum() {
		return einkommensDatenVonDatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinkommensDatenVonDatum(XMLGregorianCalendar newEinkommensDatenVonDatum) {
		XMLGregorianCalendar oldEinkommensDatenVonDatum = einkommensDatenVonDatum;
		einkommensDatenVonDatum = newEinkommensDatenVonDatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__EINKOMMENS_DATEN_VON_DATUM, oldEinkommensDatenVonDatum, einkommensDatenVonDatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtGeburtsortOptionalType getGeburt() {
		return geburt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeburt(GeburtGeburtsortOptionalType newGeburt, NotificationChain msgs) {
		GeburtGeburtsortOptionalType oldGeburt = geburt;
		geburt = newGeburt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__GEBURT, oldGeburt, newGeburt);
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
	public void setGeburt(GeburtGeburtsortOptionalType newGeburt) {
		if (newGeburt != geburt) {
			NotificationChain msgs = null;
			if (geburt != null)
				msgs = ((InternalEObject)geburt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__GEBURT, null, msgs);
			if (newGeburt != null)
				msgs = ((InternalEObject)newGeburt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__GEBURT, null, msgs);
			msgs = basicSetGeburt(newGeburt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__GEBURT, newGeburt, newGeburt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonType getNameNatuerlichePerson() {
		return nameNatuerlichePerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameNatuerlichePerson(NameNatuerlichePersonType newNameNatuerlichePerson, NotificationChain msgs) {
		NameNatuerlichePersonType oldNameNatuerlichePerson = nameNatuerlichePerson;
		nameNatuerlichePerson = newNameNatuerlichePerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__NAME_NATUERLICHE_PERSON, oldNameNatuerlichePerson, newNameNatuerlichePerson);
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
	public void setNameNatuerlichePerson(NameNatuerlichePersonType newNameNatuerlichePerson) {
		if (newNameNatuerlichePerson != nameNatuerlichePerson) {
			NotificationChain msgs = null;
			if (nameNatuerlichePerson != null)
				msgs = ((InternalEObject)nameNatuerlichePerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__NAME_NATUERLICHE_PERSON, null, msgs);
			if (newNameNatuerlichePerson != null)
				msgs = ((InternalEObject)newNameNatuerlichePerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__NAME_NATUERLICHE_PERSON, null, msgs);
			msgs = basicSetNameNatuerlichePerson(newNameNatuerlichePerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__NAME_NATUERLICHE_PERSON, newNameNatuerlichePerson, newNameNatuerlichePerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftBasisType getAnschrift() {
		return anschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschrift(PostalischeInlandsanschriftBasisType newAnschrift, NotificationChain msgs) {
		PostalischeInlandsanschriftBasisType oldAnschrift = anschrift;
		anschrift = newAnschrift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__ANSCHRIFT, oldAnschrift, newAnschrift);
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
	public void setAnschrift(PostalischeInlandsanschriftBasisType newAnschrift) {
		if (newAnschrift != anschrift) {
			NotificationChain msgs = null;
			if (anschrift != null)
				msgs = ((InternalEObject)anschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__ANSCHRIFT, null, msgs);
			if (newAnschrift != null)
				msgs = ((InternalEObject)newAnschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__ANSCHRIFT, null, msgs);
			msgs = basicSetAnschrift(newAnschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__ANSCHRIFT, newAnschrift, newAnschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__GEBURT:
				return basicSetGeburt(null, msgs);
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__NAME_NATUERLICHE_PERSON:
				return basicSetNameNatuerlichePerson(null, msgs);
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__ANSCHRIFT:
				return basicSetAnschrift(null, msgs);
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
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__ABFRAGE_ID:
				return getAbfrageID();
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__ANFORDERUNGSGRUND:
				return getAnforderungsgrund();
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__EINKOMMENS_DATEN_BIS_DATUM:
				return getEinkommensDatenBisDatum();
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__EINKOMMENS_DATEN_VON_DATUM:
				return getEinkommensDatenVonDatum();
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__GEBURT:
				return getGeburt();
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__NAME_NATUERLICHE_PERSON:
				return getNameNatuerlichePerson();
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__ANSCHRIFT:
				return getAnschrift();
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
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__ABFRAGE_ID:
				setAbfrageID((String)newValue);
				return;
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__ANFORDERUNGSGRUND:
				setAnforderungsgrund((String)newValue);
				return;
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__EINKOMMENS_DATEN_BIS_DATUM:
				setEinkommensDatenBisDatum((XMLGregorianCalendar)newValue);
				return;
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__EINKOMMENS_DATEN_VON_DATUM:
				setEinkommensDatenVonDatum((XMLGregorianCalendar)newValue);
				return;
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__GEBURT:
				setGeburt((GeburtGeburtsortOptionalType)newValue);
				return;
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__NAME_NATUERLICHE_PERSON:
				setNameNatuerlichePerson((NameNatuerlichePersonType)newValue);
				return;
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__ANSCHRIFT:
				setAnschrift((PostalischeInlandsanschriftBasisType)newValue);
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
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__ABFRAGE_ID:
				setAbfrageID(ABFRAGE_ID_EDEFAULT);
				return;
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__ANFORDERUNGSGRUND:
				setAnforderungsgrund(ANFORDERUNGSGRUND_EDEFAULT);
				return;
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__EINKOMMENS_DATEN_BIS_DATUM:
				setEinkommensDatenBisDatum(EINKOMMENS_DATEN_BIS_DATUM_EDEFAULT);
				return;
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__EINKOMMENS_DATEN_VON_DATUM:
				setEinkommensDatenVonDatum(EINKOMMENS_DATEN_VON_DATUM_EDEFAULT);
				return;
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__GEBURT:
				setGeburt((GeburtGeburtsortOptionalType)null);
				return;
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__NAME_NATUERLICHE_PERSON:
				setNameNatuerlichePerson((NameNatuerlichePersonType)null);
				return;
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__ANSCHRIFT:
				setAnschrift((PostalischeInlandsanschriftBasisType)null);
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
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__ABFRAGE_ID:
				return ABFRAGE_ID_EDEFAULT == null ? abfrageID != null : !ABFRAGE_ID_EDEFAULT.equals(abfrageID);
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__ANFORDERUNGSGRUND:
				return ANFORDERUNGSGRUND_EDEFAULT == null ? anforderungsgrund != null : !ANFORDERUNGSGRUND_EDEFAULT.equals(anforderungsgrund);
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__EINKOMMENS_DATEN_BIS_DATUM:
				return EINKOMMENS_DATEN_BIS_DATUM_EDEFAULT == null ? einkommensDatenBisDatum != null : !EINKOMMENS_DATEN_BIS_DATUM_EDEFAULT.equals(einkommensDatenBisDatum);
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__EINKOMMENS_DATEN_VON_DATUM:
				return EINKOMMENS_DATEN_VON_DATUM_EDEFAULT == null ? einkommensDatenVonDatum != null : !EINKOMMENS_DATEN_VON_DATUM_EDEFAULT.equals(einkommensDatenVonDatum);
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__GEBURT:
				return geburt != null;
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__NAME_NATUERLICHE_PERSON:
				return nameNatuerlichePerson != null;
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE__ANSCHRIFT:
				return anschrift != null;
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
		result.append(" (abfrageID: ");
		result.append(abfrageID);
		result.append(", anforderungsgrund: ");
		result.append(anforderungsgrund);
		result.append(", einkommensDatenBisDatum: ");
		result.append(einkommensDatenBisDatum);
		result.append(", einkommensDatenVonDatum: ");
		result.append(einkommensDatenVonDatum);
		result.append(')');
		return result.toString();
	}

} //DsrvAnfragervbea0401TypeImpl
