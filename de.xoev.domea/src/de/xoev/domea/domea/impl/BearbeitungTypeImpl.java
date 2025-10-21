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

import de.xoev.domea.domea.BearbeitungType;
import de.xoev.domea.domea.DokumentOderDokumentMitSchriftstueckType;
import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.KontaktType;

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
 * An implementation of the model object '<em><b>Bearbeitung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.BearbeitungTypeImpl#getBearbeiter <em>Bearbeiter</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.BearbeitungTypeImpl#getDatum <em>Datum</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.BearbeitungTypeImpl#getUhrzeit <em>Uhrzeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.BearbeitungTypeImpl#getVermerk <em>Vermerk</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.BearbeitungTypeImpl#getNotiz <em>Notiz</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.BearbeitungTypeImpl#getAnlage <em>Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BearbeitungTypeImpl extends MinimalEObjectImpl.Container implements BearbeitungType {
	/**
	 * The cached value of the '{@link #getBearbeiter() <em>Bearbeiter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBearbeiter()
	 * @generated
	 * @ordered
	 */
	protected KontaktType bearbeiter;

	/**
	 * The default value of the '{@link #getDatum() <em>Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatum()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatum() <em>Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatum()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar datum = DATUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getUhrzeit() <em>Uhrzeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUhrzeit()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar UHRZEIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUhrzeit() <em>Uhrzeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUhrzeit()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar uhrzeit = UHRZEIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVermerk() <em>Vermerk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVermerk()
	 * @generated
	 * @ordered
	 */
	protected static final String VERMERK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVermerk() <em>Vermerk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVermerk()
	 * @generated
	 * @ordered
	 */
	protected String vermerk = VERMERK_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotiz() <em>Notiz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotiz()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTIZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotiz() <em>Notiz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotiz()
	 * @generated
	 * @ordered
	 */
	protected String notiz = NOTIZ_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnlage() <em>Anlage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnlage()
	 * @generated
	 * @ordered
	 */
	protected EList<DokumentOderDokumentMitSchriftstueckType> anlage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BearbeitungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.BEARBEITUNG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KontaktType getBearbeiter() {
		return bearbeiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBearbeiter(KontaktType newBearbeiter, NotificationChain msgs) {
		KontaktType oldBearbeiter = bearbeiter;
		bearbeiter = newBearbeiter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.BEARBEITUNG_TYPE__BEARBEITER, oldBearbeiter, newBearbeiter);
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
	public void setBearbeiter(KontaktType newBearbeiter) {
		if (newBearbeiter != bearbeiter) {
			NotificationChain msgs = null;
			if (bearbeiter != null)
				msgs = ((InternalEObject)bearbeiter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.BEARBEITUNG_TYPE__BEARBEITER, null, msgs);
			if (newBearbeiter != null)
				msgs = ((InternalEObject)newBearbeiter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.BEARBEITUNG_TYPE__BEARBEITER, null, msgs);
			msgs = basicSetBearbeiter(newBearbeiter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.BEARBEITUNG_TYPE__BEARBEITER, newBearbeiter, newBearbeiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getDatum() {
		return datum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatum(XMLGregorianCalendar newDatum) {
		XMLGregorianCalendar oldDatum = datum;
		datum = newDatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.BEARBEITUNG_TYPE__DATUM, oldDatum, datum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getUhrzeit() {
		return uhrzeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUhrzeit(XMLGregorianCalendar newUhrzeit) {
		XMLGregorianCalendar oldUhrzeit = uhrzeit;
		uhrzeit = newUhrzeit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.BEARBEITUNG_TYPE__UHRZEIT, oldUhrzeit, uhrzeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVermerk() {
		return vermerk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVermerk(String newVermerk) {
		String oldVermerk = vermerk;
		vermerk = newVermerk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.BEARBEITUNG_TYPE__VERMERK, oldVermerk, vermerk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotiz() {
		return notiz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotiz(String newNotiz) {
		String oldNotiz = notiz;
		notiz = newNotiz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.BEARBEITUNG_TYPE__NOTIZ, oldNotiz, notiz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DokumentOderDokumentMitSchriftstueckType> getAnlage() {
		if (anlage == null) {
			anlage = new EObjectContainmentEList<DokumentOderDokumentMitSchriftstueckType>(DokumentOderDokumentMitSchriftstueckType.class, this, DomeaPackage.BEARBEITUNG_TYPE__ANLAGE);
		}
		return anlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.BEARBEITUNG_TYPE__BEARBEITER:
				return basicSetBearbeiter(null, msgs);
			case DomeaPackage.BEARBEITUNG_TYPE__ANLAGE:
				return ((InternalEList<?>)getAnlage()).basicRemove(otherEnd, msgs);
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
			case DomeaPackage.BEARBEITUNG_TYPE__BEARBEITER:
				return getBearbeiter();
			case DomeaPackage.BEARBEITUNG_TYPE__DATUM:
				return getDatum();
			case DomeaPackage.BEARBEITUNG_TYPE__UHRZEIT:
				return getUhrzeit();
			case DomeaPackage.BEARBEITUNG_TYPE__VERMERK:
				return getVermerk();
			case DomeaPackage.BEARBEITUNG_TYPE__NOTIZ:
				return getNotiz();
			case DomeaPackage.BEARBEITUNG_TYPE__ANLAGE:
				return getAnlage();
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
			case DomeaPackage.BEARBEITUNG_TYPE__BEARBEITER:
				setBearbeiter((KontaktType)newValue);
				return;
			case DomeaPackage.BEARBEITUNG_TYPE__DATUM:
				setDatum((XMLGregorianCalendar)newValue);
				return;
			case DomeaPackage.BEARBEITUNG_TYPE__UHRZEIT:
				setUhrzeit((XMLGregorianCalendar)newValue);
				return;
			case DomeaPackage.BEARBEITUNG_TYPE__VERMERK:
				setVermerk((String)newValue);
				return;
			case DomeaPackage.BEARBEITUNG_TYPE__NOTIZ:
				setNotiz((String)newValue);
				return;
			case DomeaPackage.BEARBEITUNG_TYPE__ANLAGE:
				getAnlage().clear();
				getAnlage().addAll((Collection<? extends DokumentOderDokumentMitSchriftstueckType>)newValue);
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
			case DomeaPackage.BEARBEITUNG_TYPE__BEARBEITER:
				setBearbeiter((KontaktType)null);
				return;
			case DomeaPackage.BEARBEITUNG_TYPE__DATUM:
				setDatum(DATUM_EDEFAULT);
				return;
			case DomeaPackage.BEARBEITUNG_TYPE__UHRZEIT:
				setUhrzeit(UHRZEIT_EDEFAULT);
				return;
			case DomeaPackage.BEARBEITUNG_TYPE__VERMERK:
				setVermerk(VERMERK_EDEFAULT);
				return;
			case DomeaPackage.BEARBEITUNG_TYPE__NOTIZ:
				setNotiz(NOTIZ_EDEFAULT);
				return;
			case DomeaPackage.BEARBEITUNG_TYPE__ANLAGE:
				getAnlage().clear();
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
			case DomeaPackage.BEARBEITUNG_TYPE__BEARBEITER:
				return bearbeiter != null;
			case DomeaPackage.BEARBEITUNG_TYPE__DATUM:
				return DATUM_EDEFAULT == null ? datum != null : !DATUM_EDEFAULT.equals(datum);
			case DomeaPackage.BEARBEITUNG_TYPE__UHRZEIT:
				return UHRZEIT_EDEFAULT == null ? uhrzeit != null : !UHRZEIT_EDEFAULT.equals(uhrzeit);
			case DomeaPackage.BEARBEITUNG_TYPE__VERMERK:
				return VERMERK_EDEFAULT == null ? vermerk != null : !VERMERK_EDEFAULT.equals(vermerk);
			case DomeaPackage.BEARBEITUNG_TYPE__NOTIZ:
				return NOTIZ_EDEFAULT == null ? notiz != null : !NOTIZ_EDEFAULT.equals(notiz);
			case DomeaPackage.BEARBEITUNG_TYPE__ANLAGE:
				return anlage != null && !anlage.isEmpty();
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
		result.append(" (datum: ");
		result.append(datum);
		result.append(", uhrzeit: ");
		result.append(uhrzeit);
		result.append(", vermerk: ");
		result.append(vermerk);
		result.append(", notiz: ");
		result.append(notiz);
		result.append(')');
		return result.toString();
	}

} //BearbeitungTypeImpl
