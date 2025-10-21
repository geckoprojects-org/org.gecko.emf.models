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

import de.xoev.domea.domea.AnwendungsspezifischeErweiterungType;
import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.FeldType;
import de.xoev.domea.domea.FeldgruppeType;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

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
 * An implementation of the model object '<em><b>Anwendungsspezifische Erweiterung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.AnwendungsspezifischeErweiterungTypeImpl#getKennung <em>Kennung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AnwendungsspezifischeErweiterungTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AnwendungsspezifischeErweiterungTypeImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AnwendungsspezifischeErweiterungTypeImpl#getVersionsnummer <em>Versionsnummer</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AnwendungsspezifischeErweiterungTypeImpl#getVersionsdatum <em>Versionsdatum</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AnwendungsspezifischeErweiterungTypeImpl#getFeldgruppe <em>Feldgruppe</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AnwendungsspezifischeErweiterungTypeImpl#getFeld <em>Feld</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnwendungsspezifischeErweiterungTypeImpl extends MinimalEObjectImpl.Container implements AnwendungsspezifischeErweiterungType {
	/**
	 * The default value of the '{@link #getKennung() <em>Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKennung()
	 * @generated
	 * @ordered
	 */
	protected static final String KENNUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKennung() <em>Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKennung()
	 * @generated
	 * @ordered
	 */
	protected String kennung = KENNUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected static final String BESCHREIBUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected String beschreibung = BESCHREIBUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionsnummer() <em>Versionsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionsnummer()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSIONSNUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionsnummer() <em>Versionsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionsnummer()
	 * @generated
	 * @ordered
	 */
	protected String versionsnummer = VERSIONSNUMMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionsdatum() <em>Versionsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionsdatum()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar VERSIONSDATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionsdatum() <em>Versionsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionsdatum()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar versionsdatum = VERSIONSDATUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeldgruppe() <em>Feldgruppe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeldgruppe()
	 * @generated
	 * @ordered
	 */
	protected EList<FeldgruppeType> feldgruppe;

	/**
	 * The cached value of the '{@link #getFeld() <em>Feld</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeld()
	 * @generated
	 * @ordered
	 */
	protected EList<FeldType> feld;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnwendungsspezifischeErweiterungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKennung() {
		return kennung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKennung(String newKennung) {
		String oldKennung = kennung;
		kennung = newKennung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__KENNUNG, oldKennung, kennung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeschreibung() {
		return beschreibung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeschreibung(String newBeschreibung) {
		String oldBeschreibung = beschreibung;
		beschreibung = newBeschreibung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__BESCHREIBUNG, oldBeschreibung, beschreibung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersionsnummer() {
		return versionsnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersionsnummer(String newVersionsnummer) {
		String oldVersionsnummer = versionsnummer;
		versionsnummer = newVersionsnummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__VERSIONSNUMMER, oldVersionsnummer, versionsnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getVersionsdatum() {
		return versionsdatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersionsdatum(XMLGregorianCalendar newVersionsdatum) {
		XMLGregorianCalendar oldVersionsdatum = versionsdatum;
		versionsdatum = newVersionsdatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__VERSIONSDATUM, oldVersionsdatum, versionsdatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeldgruppeType> getFeldgruppe() {
		if (feldgruppe == null) {
			feldgruppe = new EObjectContainmentEList<FeldgruppeType>(FeldgruppeType.class, this, DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__FELDGRUPPE);
		}
		return feldgruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeldType> getFeld() {
		if (feld == null) {
			feld = new EObjectContainmentEList<FeldType>(FeldType.class, this, DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__FELD);
		}
		return feld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__FELDGRUPPE:
				return ((InternalEList<?>)getFeldgruppe()).basicRemove(otherEnd, msgs);
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__FELD:
				return ((InternalEList<?>)getFeld()).basicRemove(otherEnd, msgs);
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
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__KENNUNG:
				return getKennung();
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__NAME:
				return getName();
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__BESCHREIBUNG:
				return getBeschreibung();
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__VERSIONSNUMMER:
				return getVersionsnummer();
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__VERSIONSDATUM:
				return getVersionsdatum();
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__FELDGRUPPE:
				return getFeldgruppe();
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__FELD:
				return getFeld();
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
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__KENNUNG:
				setKennung((String)newValue);
				return;
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__NAME:
				setName((String)newValue);
				return;
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__BESCHREIBUNG:
				setBeschreibung((String)newValue);
				return;
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__VERSIONSNUMMER:
				setVersionsnummer((String)newValue);
				return;
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__VERSIONSDATUM:
				setVersionsdatum((XMLGregorianCalendar)newValue);
				return;
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__FELDGRUPPE:
				getFeldgruppe().clear();
				getFeldgruppe().addAll((Collection<? extends FeldgruppeType>)newValue);
				return;
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__FELD:
				getFeld().clear();
				getFeld().addAll((Collection<? extends FeldType>)newValue);
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
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__KENNUNG:
				setKennung(KENNUNG_EDEFAULT);
				return;
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__BESCHREIBUNG:
				setBeschreibung(BESCHREIBUNG_EDEFAULT);
				return;
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__VERSIONSNUMMER:
				setVersionsnummer(VERSIONSNUMMER_EDEFAULT);
				return;
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__VERSIONSDATUM:
				setVersionsdatum(VERSIONSDATUM_EDEFAULT);
				return;
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__FELDGRUPPE:
				getFeldgruppe().clear();
				return;
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__FELD:
				getFeld().clear();
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
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__KENNUNG:
				return KENNUNG_EDEFAULT == null ? kennung != null : !KENNUNG_EDEFAULT.equals(kennung);
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__BESCHREIBUNG:
				return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__VERSIONSNUMMER:
				return VERSIONSNUMMER_EDEFAULT == null ? versionsnummer != null : !VERSIONSNUMMER_EDEFAULT.equals(versionsnummer);
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__VERSIONSDATUM:
				return VERSIONSDATUM_EDEFAULT == null ? versionsdatum != null : !VERSIONSDATUM_EDEFAULT.equals(versionsdatum);
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__FELDGRUPPE:
				return feldgruppe != null && !feldgruppe.isEmpty();
			case DomeaPackage.ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__FELD:
				return feld != null && !feld.isEmpty();
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
		result.append(" (kennung: ");
		result.append(kennung);
		result.append(", name: ");
		result.append(name);
		result.append(", beschreibung: ");
		result.append(beschreibung);
		result.append(", versionsnummer: ");
		result.append(versionsnummer);
		result.append(", versionsdatum: ");
		result.append(versionsdatum);
		result.append(')');
		return result.toString();
	}

} //AnwendungsspezifischeErweiterungTypeImpl
