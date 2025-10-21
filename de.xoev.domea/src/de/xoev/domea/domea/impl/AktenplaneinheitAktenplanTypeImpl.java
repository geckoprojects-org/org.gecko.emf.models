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

import de.xoev.domea.domea.AktenplaneinheitAktenplanType;
import de.xoev.domea.domea.AnwendungsspezifischeErweiterungType;
import de.xoev.domea.domea.AnwendungsspezifischeErweiterungXMLType;
import de.xoev.domea.domea.AufbewahrungsdauerType;
import de.xoev.domea.domea.AussonderungsartType;
import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.ZeitraumType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aktenplaneinheit Aktenplan Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.AktenplaneinheitAktenplanTypeImpl#getAussonderungsart <em>Aussonderungsart</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AktenplaneinheitAktenplanTypeImpl#getGueltigkeit <em>Gueltigkeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AktenplaneinheitAktenplanTypeImpl#isStillgelegt <em>Stillgelegt</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AktenplaneinheitAktenplanTypeImpl#getAufbewahrungsdauer <em>Aufbewahrungsdauer</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AktenplaneinheitAktenplanTypeImpl#getEinheit <em>Einheit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AktenplaneinheitAktenplanTypeImpl#getVerweisAktenplaneinheit <em>Verweis Aktenplaneinheit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AktenplaneinheitAktenplanTypeImpl#getAnwendungsspezifischeErweiterung <em>Anwendungsspezifische Erweiterung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AktenplaneinheitAktenplanTypeImpl#getAnwendungsspezifischeErweiterungXML <em>Anwendungsspezifische Erweiterung XML</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AktenplaneinheitAktenplanTypeImpl extends AktenplaneinheitTypeImpl implements AktenplaneinheitAktenplanType {
	/**
	 * The cached value of the '{@link #getAussonderungsart() <em>Aussonderungsart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAussonderungsart()
	 * @generated
	 * @ordered
	 */
	protected AussonderungsartType aussonderungsart;

	/**
	 * The cached value of the '{@link #getGueltigkeit() <em>Gueltigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGueltigkeit()
	 * @generated
	 * @ordered
	 */
	protected ZeitraumType gueltigkeit;

	/**
	 * The default value of the '{@link #isStillgelegt() <em>Stillgelegt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStillgelegt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STILLGELEGT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStillgelegt() <em>Stillgelegt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStillgelegt()
	 * @generated
	 * @ordered
	 */
	protected boolean stillgelegt = STILLGELEGT_EDEFAULT;

	/**
	 * This is true if the Stillgelegt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stillgelegtESet;

	/**
	 * The cached value of the '{@link #getAufbewahrungsdauer() <em>Aufbewahrungsdauer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufbewahrungsdauer()
	 * @generated
	 * @ordered
	 */
	protected AufbewahrungsdauerType aufbewahrungsdauer;

	/**
	 * The cached value of the '{@link #getEinheit() <em>Einheit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinheit()
	 * @generated
	 * @ordered
	 */
	protected EList<AktenplaneinheitAktenplanType> einheit;

	/**
	 * The cached value of the '{@link #getVerweisAktenplaneinheit() <em>Verweis Aktenplaneinheit</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerweisAktenplaneinheit()
	 * @generated
	 * @ordered
	 */
	protected EList<String> verweisAktenplaneinheit;

	/**
	 * The cached value of the '{@link #getAnwendungsspezifischeErweiterung() <em>Anwendungsspezifische Erweiterung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnwendungsspezifischeErweiterung()
	 * @generated
	 * @ordered
	 */
	protected EList<AnwendungsspezifischeErweiterungType> anwendungsspezifischeErweiterung;

	/**
	 * The cached value of the '{@link #getAnwendungsspezifischeErweiterungXML() <em>Anwendungsspezifische Erweiterung XML</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnwendungsspezifischeErweiterungXML()
	 * @generated
	 * @ordered
	 */
	protected AnwendungsspezifischeErweiterungXMLType anwendungsspezifischeErweiterungXML;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AktenplaneinheitAktenplanTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.AKTENPLANEINHEIT_AKTENPLAN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AussonderungsartType getAussonderungsart() {
		return aussonderungsart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAussonderungsart(AussonderungsartType newAussonderungsart, NotificationChain msgs) {
		AussonderungsartType oldAussonderungsart = aussonderungsart;
		aussonderungsart = newAussonderungsart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUSSONDERUNGSART, oldAussonderungsart, newAussonderungsart);
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
	public void setAussonderungsart(AussonderungsartType newAussonderungsart) {
		if (newAussonderungsart != aussonderungsart) {
			NotificationChain msgs = null;
			if (aussonderungsart != null)
				msgs = ((InternalEObject)aussonderungsart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUSSONDERUNGSART, null, msgs);
			if (newAussonderungsart != null)
				msgs = ((InternalEObject)newAussonderungsart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUSSONDERUNGSART, null, msgs);
			msgs = basicSetAussonderungsart(newAussonderungsart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUSSONDERUNGSART, newAussonderungsart, newAussonderungsart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZeitraumType getGueltigkeit() {
		return gueltigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGueltigkeit(ZeitraumType newGueltigkeit, NotificationChain msgs) {
		ZeitraumType oldGueltigkeit = gueltigkeit;
		gueltigkeit = newGueltigkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__GUELTIGKEIT, oldGueltigkeit, newGueltigkeit);
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
	public void setGueltigkeit(ZeitraumType newGueltigkeit) {
		if (newGueltigkeit != gueltigkeit) {
			NotificationChain msgs = null;
			if (gueltigkeit != null)
				msgs = ((InternalEObject)gueltigkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__GUELTIGKEIT, null, msgs);
			if (newGueltigkeit != null)
				msgs = ((InternalEObject)newGueltigkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__GUELTIGKEIT, null, msgs);
			msgs = basicSetGueltigkeit(newGueltigkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__GUELTIGKEIT, newGueltigkeit, newGueltigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStillgelegt() {
		return stillgelegt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStillgelegt(boolean newStillgelegt) {
		boolean oldStillgelegt = stillgelegt;
		stillgelegt = newStillgelegt;
		boolean oldStillgelegtESet = stillgelegtESet;
		stillgelegtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__STILLGELEGT, oldStillgelegt, stillgelegt, !oldStillgelegtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStillgelegt() {
		boolean oldStillgelegt = stillgelegt;
		boolean oldStillgelegtESet = stillgelegtESet;
		stillgelegt = STILLGELEGT_EDEFAULT;
		stillgelegtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__STILLGELEGT, oldStillgelegt, STILLGELEGT_EDEFAULT, oldStillgelegtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStillgelegt() {
		return stillgelegtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AufbewahrungsdauerType getAufbewahrungsdauer() {
		return aufbewahrungsdauer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAufbewahrungsdauer(AufbewahrungsdauerType newAufbewahrungsdauer, NotificationChain msgs) {
		AufbewahrungsdauerType oldAufbewahrungsdauer = aufbewahrungsdauer;
		aufbewahrungsdauer = newAufbewahrungsdauer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUFBEWAHRUNGSDAUER, oldAufbewahrungsdauer, newAufbewahrungsdauer);
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
	public void setAufbewahrungsdauer(AufbewahrungsdauerType newAufbewahrungsdauer) {
		if (newAufbewahrungsdauer != aufbewahrungsdauer) {
			NotificationChain msgs = null;
			if (aufbewahrungsdauer != null)
				msgs = ((InternalEObject)aufbewahrungsdauer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUFBEWAHRUNGSDAUER, null, msgs);
			if (newAufbewahrungsdauer != null)
				msgs = ((InternalEObject)newAufbewahrungsdauer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUFBEWAHRUNGSDAUER, null, msgs);
			msgs = basicSetAufbewahrungsdauer(newAufbewahrungsdauer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUFBEWAHRUNGSDAUER, newAufbewahrungsdauer, newAufbewahrungsdauer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AktenplaneinheitAktenplanType> getEinheit() {
		if (einheit == null) {
			einheit = new EObjectContainmentEList<AktenplaneinheitAktenplanType>(AktenplaneinheitAktenplanType.class, this, DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__EINHEIT);
		}
		return einheit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getVerweisAktenplaneinheit() {
		if (verweisAktenplaneinheit == null) {
			verweisAktenplaneinheit = new EDataTypeEList<String>(String.class, this, DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__VERWEIS_AKTENPLANEINHEIT);
		}
		return verweisAktenplaneinheit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnwendungsspezifischeErweiterungType> getAnwendungsspezifischeErweiterung() {
		if (anwendungsspezifischeErweiterung == null) {
			anwendungsspezifischeErweiterung = new EObjectContainmentEList<AnwendungsspezifischeErweiterungType>(AnwendungsspezifischeErweiterungType.class, this, DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG);
		}
		return anwendungsspezifischeErweiterung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnwendungsspezifischeErweiterungXMLType getAnwendungsspezifischeErweiterungXML() {
		return anwendungsspezifischeErweiterungXML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnwendungsspezifischeErweiterungXML(AnwendungsspezifischeErweiterungXMLType newAnwendungsspezifischeErweiterungXML, NotificationChain msgs) {
		AnwendungsspezifischeErweiterungXMLType oldAnwendungsspezifischeErweiterungXML = anwendungsspezifischeErweiterungXML;
		anwendungsspezifischeErweiterungXML = newAnwendungsspezifischeErweiterungXML;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML, oldAnwendungsspezifischeErweiterungXML, newAnwendungsspezifischeErweiterungXML);
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
	public void setAnwendungsspezifischeErweiterungXML(AnwendungsspezifischeErweiterungXMLType newAnwendungsspezifischeErweiterungXML) {
		if (newAnwendungsspezifischeErweiterungXML != anwendungsspezifischeErweiterungXML) {
			NotificationChain msgs = null;
			if (anwendungsspezifischeErweiterungXML != null)
				msgs = ((InternalEObject)anwendungsspezifischeErweiterungXML).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML, null, msgs);
			if (newAnwendungsspezifischeErweiterungXML != null)
				msgs = ((InternalEObject)newAnwendungsspezifischeErweiterungXML).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML, null, msgs);
			msgs = basicSetAnwendungsspezifischeErweiterungXML(newAnwendungsspezifischeErweiterungXML, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML, newAnwendungsspezifischeErweiterungXML, newAnwendungsspezifischeErweiterungXML));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUSSONDERUNGSART:
				return basicSetAussonderungsart(null, msgs);
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__GUELTIGKEIT:
				return basicSetGueltigkeit(null, msgs);
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUFBEWAHRUNGSDAUER:
				return basicSetAufbewahrungsdauer(null, msgs);
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__EINHEIT:
				return ((InternalEList<?>)getEinheit()).basicRemove(otherEnd, msgs);
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				return ((InternalEList<?>)getAnwendungsspezifischeErweiterung()).basicRemove(otherEnd, msgs);
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				return basicSetAnwendungsspezifischeErweiterungXML(null, msgs);
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
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUSSONDERUNGSART:
				return getAussonderungsart();
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__GUELTIGKEIT:
				return getGueltigkeit();
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__STILLGELEGT:
				return isStillgelegt();
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUFBEWAHRUNGSDAUER:
				return getAufbewahrungsdauer();
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__EINHEIT:
				return getEinheit();
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__VERWEIS_AKTENPLANEINHEIT:
				return getVerweisAktenplaneinheit();
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				return getAnwendungsspezifischeErweiterung();
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				return getAnwendungsspezifischeErweiterungXML();
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
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUSSONDERUNGSART:
				setAussonderungsart((AussonderungsartType)newValue);
				return;
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__GUELTIGKEIT:
				setGueltigkeit((ZeitraumType)newValue);
				return;
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__STILLGELEGT:
				setStillgelegt((Boolean)newValue);
				return;
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUFBEWAHRUNGSDAUER:
				setAufbewahrungsdauer((AufbewahrungsdauerType)newValue);
				return;
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__EINHEIT:
				getEinheit().clear();
				getEinheit().addAll((Collection<? extends AktenplaneinheitAktenplanType>)newValue);
				return;
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__VERWEIS_AKTENPLANEINHEIT:
				getVerweisAktenplaneinheit().clear();
				getVerweisAktenplaneinheit().addAll((Collection<? extends String>)newValue);
				return;
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				getAnwendungsspezifischeErweiterung().clear();
				getAnwendungsspezifischeErweiterung().addAll((Collection<? extends AnwendungsspezifischeErweiterungType>)newValue);
				return;
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				setAnwendungsspezifischeErweiterungXML((AnwendungsspezifischeErweiterungXMLType)newValue);
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
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUSSONDERUNGSART:
				setAussonderungsart((AussonderungsartType)null);
				return;
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__GUELTIGKEIT:
				setGueltigkeit((ZeitraumType)null);
				return;
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__STILLGELEGT:
				unsetStillgelegt();
				return;
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUFBEWAHRUNGSDAUER:
				setAufbewahrungsdauer((AufbewahrungsdauerType)null);
				return;
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__EINHEIT:
				getEinheit().clear();
				return;
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__VERWEIS_AKTENPLANEINHEIT:
				getVerweisAktenplaneinheit().clear();
				return;
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				getAnwendungsspezifischeErweiterung().clear();
				return;
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				setAnwendungsspezifischeErweiterungXML((AnwendungsspezifischeErweiterungXMLType)null);
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
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUSSONDERUNGSART:
				return aussonderungsart != null;
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__GUELTIGKEIT:
				return gueltigkeit != null;
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__STILLGELEGT:
				return isSetStillgelegt();
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUFBEWAHRUNGSDAUER:
				return aufbewahrungsdauer != null;
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__EINHEIT:
				return einheit != null && !einheit.isEmpty();
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__VERWEIS_AKTENPLANEINHEIT:
				return verweisAktenplaneinheit != null && !verweisAktenplaneinheit.isEmpty();
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				return anwendungsspezifischeErweiterung != null && !anwendungsspezifischeErweiterung.isEmpty();
			case DomeaPackage.AKTENPLANEINHEIT_AKTENPLAN_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				return anwendungsspezifischeErweiterungXML != null;
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
		result.append(" (stillgelegt: ");
		if (stillgelegtESet) result.append(stillgelegt); else result.append("<unset>");
		result.append(", verweisAktenplaneinheit: ");
		result.append(verweisAktenplaneinheit);
		result.append(')');
		return result.toString();
	}

} //AktenplaneinheitAktenplanTypeImpl
