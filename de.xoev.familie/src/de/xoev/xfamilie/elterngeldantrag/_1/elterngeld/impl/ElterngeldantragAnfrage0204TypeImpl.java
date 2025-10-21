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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.BehoerdenkennungType;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.AntragsnachrichtTypeImpl;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeAnfragegrundType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrage0204Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elterngeldantrag Anfrage0204 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAnfrage0204TypeImpl#getAnfrageID <em>Anfrage ID</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAnfrage0204TypeImpl#getAntragsReferenz <em>Antrags Referenz</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAnfrage0204TypeImpl#getAnfragegrund <em>Anfragegrund</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAnfrage0204TypeImpl#getAnfrageparameter <em>Anfrageparameter</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAnfrage0204TypeImpl#getAnfragendesSystem <em>Anfragendes System</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAnfrage0204TypeImpl#getAnfragerOrganisationsID <em>Anfrager Organisations ID</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAnfrage0204TypeImpl#getAntwortAbweichenderEmpfaenger <em>Antwort Abweichender Empfaenger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElterngeldantragAnfrage0204TypeImpl extends AntragsnachrichtTypeImpl implements ElterngeldantragAnfrage0204Type {
	/**
	 * The default value of the '{@link #getAnfrageID() <em>Anfrage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnfrageID()
	 * @generated
	 * @ordered
	 */
	protected static final String ANFRAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnfrageID() <em>Anfrage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnfrageID()
	 * @generated
	 * @ordered
	 */
	protected String anfrageID = ANFRAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAntragsReferenz() <em>Antrags Referenz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntragsReferenz()
	 * @generated
	 * @ordered
	 */
	protected static final String ANTRAGS_REFERENZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAntragsReferenz() <em>Antrags Referenz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntragsReferenz()
	 * @generated
	 * @ordered
	 */
	protected String antragsReferenz = ANTRAGS_REFERENZ_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnfragegrund() <em>Anfragegrund</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnfragegrund()
	 * @generated
	 * @ordered
	 */
	protected CodeAnfragegrundType anfragegrund;

	/**
	 * The cached value of the '{@link #getAnfrageparameter() <em>Anfrageparameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnfrageparameter()
	 * @generated
	 * @ordered
	 */
	protected EObject anfrageparameter;

	/**
	 * The default value of the '{@link #getAnfragendesSystem() <em>Anfragendes System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnfragendesSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String ANFRAGENDES_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnfragendesSystem() <em>Anfragendes System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnfragendesSystem()
	 * @generated
	 * @ordered
	 */
	protected String anfragendesSystem = ANFRAGENDES_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnfragerOrganisationsID() <em>Anfrager Organisations ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnfragerOrganisationsID()
	 * @generated
	 * @ordered
	 */
	protected static final String ANFRAGER_ORGANISATIONS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnfragerOrganisationsID() <em>Anfrager Organisations ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnfragerOrganisationsID()
	 * @generated
	 * @ordered
	 */
	protected String anfragerOrganisationsID = ANFRAGER_ORGANISATIONS_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAntwortAbweichenderEmpfaenger() <em>Antwort Abweichender Empfaenger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntwortAbweichenderEmpfaenger()
	 * @generated
	 * @ordered
	 */
	protected BehoerdenkennungType antwortAbweichenderEmpfaenger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElterngeldantragAnfrage0204TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getElterngeldantragAnfrage0204Type();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnfrageID() {
		return anfrageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnfrageID(String newAnfrageID) {
		String oldAnfrageID = anfrageID;
		anfrageID = newAnfrageID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGE_ID, oldAnfrageID, anfrageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAntragsReferenz() {
		return antragsReferenz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAntragsReferenz(String newAntragsReferenz) {
		String oldAntragsReferenz = antragsReferenz;
		antragsReferenz = newAntragsReferenz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANTRAGS_REFERENZ, oldAntragsReferenz, antragsReferenz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeAnfragegrundType getAnfragegrund() {
		return anfragegrund;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnfragegrund(CodeAnfragegrundType newAnfragegrund, NotificationChain msgs) {
		CodeAnfragegrundType oldAnfragegrund = anfragegrund;
		anfragegrund = newAnfragegrund;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGEGRUND, oldAnfragegrund, newAnfragegrund);
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
	public void setAnfragegrund(CodeAnfragegrundType newAnfragegrund) {
		if (newAnfragegrund != anfragegrund) {
			NotificationChain msgs = null;
			if (anfragegrund != null)
				msgs = ((InternalEObject)anfragegrund).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGEGRUND, null, msgs);
			if (newAnfragegrund != null)
				msgs = ((InternalEObject)newAnfragegrund).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGEGRUND, null, msgs);
			msgs = basicSetAnfragegrund(newAnfragegrund, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGEGRUND, newAnfragegrund, newAnfragegrund));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getAnfrageparameter() {
		return anfrageparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnfrageparameter(EObject newAnfrageparameter, NotificationChain msgs) {
		EObject oldAnfrageparameter = anfrageparameter;
		anfrageparameter = newAnfrageparameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGEPARAMETER, oldAnfrageparameter, newAnfrageparameter);
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
	public void setAnfrageparameter(EObject newAnfrageparameter) {
		if (newAnfrageparameter != anfrageparameter) {
			NotificationChain msgs = null;
			if (anfrageparameter != null)
				msgs = ((InternalEObject)anfrageparameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGEPARAMETER, null, msgs);
			if (newAnfrageparameter != null)
				msgs = ((InternalEObject)newAnfrageparameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGEPARAMETER, null, msgs);
			msgs = basicSetAnfrageparameter(newAnfrageparameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGEPARAMETER, newAnfrageparameter, newAnfrageparameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnfragendesSystem() {
		return anfragendesSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnfragendesSystem(String newAnfragendesSystem) {
		String oldAnfragendesSystem = anfragendesSystem;
		anfragendesSystem = newAnfragendesSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGENDES_SYSTEM, oldAnfragendesSystem, anfragendesSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnfragerOrganisationsID() {
		return anfragerOrganisationsID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnfragerOrganisationsID(String newAnfragerOrganisationsID) {
		String oldAnfragerOrganisationsID = anfragerOrganisationsID;
		anfragerOrganisationsID = newAnfragerOrganisationsID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGER_ORGANISATIONS_ID, oldAnfragerOrganisationsID, anfragerOrganisationsID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehoerdenkennungType getAntwortAbweichenderEmpfaenger() {
		return antwortAbweichenderEmpfaenger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAntwortAbweichenderEmpfaenger(BehoerdenkennungType newAntwortAbweichenderEmpfaenger, NotificationChain msgs) {
		BehoerdenkennungType oldAntwortAbweichenderEmpfaenger = antwortAbweichenderEmpfaenger;
		antwortAbweichenderEmpfaenger = newAntwortAbweichenderEmpfaenger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANTWORT_ABWEICHENDER_EMPFAENGER, oldAntwortAbweichenderEmpfaenger, newAntwortAbweichenderEmpfaenger);
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
	public void setAntwortAbweichenderEmpfaenger(BehoerdenkennungType newAntwortAbweichenderEmpfaenger) {
		if (newAntwortAbweichenderEmpfaenger != antwortAbweichenderEmpfaenger) {
			NotificationChain msgs = null;
			if (antwortAbweichenderEmpfaenger != null)
				msgs = ((InternalEObject)antwortAbweichenderEmpfaenger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANTWORT_ABWEICHENDER_EMPFAENGER, null, msgs);
			if (newAntwortAbweichenderEmpfaenger != null)
				msgs = ((InternalEObject)newAntwortAbweichenderEmpfaenger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANTWORT_ABWEICHENDER_EMPFAENGER, null, msgs);
			msgs = basicSetAntwortAbweichenderEmpfaenger(newAntwortAbweichenderEmpfaenger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANTWORT_ABWEICHENDER_EMPFAENGER, newAntwortAbweichenderEmpfaenger, newAntwortAbweichenderEmpfaenger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGEGRUND:
				return basicSetAnfragegrund(null, msgs);
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGEPARAMETER:
				return basicSetAnfrageparameter(null, msgs);
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANTWORT_ABWEICHENDER_EMPFAENGER:
				return basicSetAntwortAbweichenderEmpfaenger(null, msgs);
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
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGE_ID:
				return getAnfrageID();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANTRAGS_REFERENZ:
				return getAntragsReferenz();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGEGRUND:
				return getAnfragegrund();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGEPARAMETER:
				return getAnfrageparameter();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGENDES_SYSTEM:
				return getAnfragendesSystem();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGER_ORGANISATIONS_ID:
				return getAnfragerOrganisationsID();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANTWORT_ABWEICHENDER_EMPFAENGER:
				return getAntwortAbweichenderEmpfaenger();
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
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGE_ID:
				setAnfrageID((String)newValue);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANTRAGS_REFERENZ:
				setAntragsReferenz((String)newValue);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGEGRUND:
				setAnfragegrund((CodeAnfragegrundType)newValue);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGEPARAMETER:
				setAnfrageparameter((EObject)newValue);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGENDES_SYSTEM:
				setAnfragendesSystem((String)newValue);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGER_ORGANISATIONS_ID:
				setAnfragerOrganisationsID((String)newValue);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANTWORT_ABWEICHENDER_EMPFAENGER:
				setAntwortAbweichenderEmpfaenger((BehoerdenkennungType)newValue);
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
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGE_ID:
				setAnfrageID(ANFRAGE_ID_EDEFAULT);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANTRAGS_REFERENZ:
				setAntragsReferenz(ANTRAGS_REFERENZ_EDEFAULT);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGEGRUND:
				setAnfragegrund((CodeAnfragegrundType)null);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGEPARAMETER:
				setAnfrageparameter((EObject)null);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGENDES_SYSTEM:
				setAnfragendesSystem(ANFRAGENDES_SYSTEM_EDEFAULT);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGER_ORGANISATIONS_ID:
				setAnfragerOrganisationsID(ANFRAGER_ORGANISATIONS_ID_EDEFAULT);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANTWORT_ABWEICHENDER_EMPFAENGER:
				setAntwortAbweichenderEmpfaenger((BehoerdenkennungType)null);
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
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGE_ID:
				return ANFRAGE_ID_EDEFAULT == null ? anfrageID != null : !ANFRAGE_ID_EDEFAULT.equals(anfrageID);
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANTRAGS_REFERENZ:
				return ANTRAGS_REFERENZ_EDEFAULT == null ? antragsReferenz != null : !ANTRAGS_REFERENZ_EDEFAULT.equals(antragsReferenz);
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGEGRUND:
				return anfragegrund != null;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGEPARAMETER:
				return anfrageparameter != null;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGENDES_SYSTEM:
				return ANFRAGENDES_SYSTEM_EDEFAULT == null ? anfragendesSystem != null : !ANFRAGENDES_SYSTEM_EDEFAULT.equals(anfragendesSystem);
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGER_ORGANISATIONS_ID:
				return ANFRAGER_ORGANISATIONS_ID_EDEFAULT == null ? anfragerOrganisationsID != null : !ANFRAGER_ORGANISATIONS_ID_EDEFAULT.equals(anfragerOrganisationsID);
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANTWORT_ABWEICHENDER_EMPFAENGER:
				return antwortAbweichenderEmpfaenger != null;
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
		result.append(" (anfrageID: ");
		result.append(anfrageID);
		result.append(", antragsReferenz: ");
		result.append(antragsReferenz);
		result.append(", anfragendesSystem: ");
		result.append(anfragendesSystem);
		result.append(", anfragerOrganisationsID: ");
		result.append(anfragerOrganisationsID);
		result.append(')');
		return result.toString();
	}

} //ElterngeldantragAnfrage0204TypeImpl
