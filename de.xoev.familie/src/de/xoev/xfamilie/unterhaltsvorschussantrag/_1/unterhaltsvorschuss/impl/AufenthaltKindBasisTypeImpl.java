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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeKindWohnhaftBeiType;
import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aufenthalt Kind Basis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AufenthaltKindBasisTypeImpl#getArt <em>Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AufenthaltKindBasisTypeImpl#isAufenthaltsortGeheimHalten <em>Aufenthaltsort Geheim Halten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AufenthaltKindBasisTypeImpl#getAuslandsschuljahr <em>Auslandsschuljahr</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AufenthaltKindBasisTypeImpl#getSeitWann <em>Seit Wann</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AufenthaltKindBasisTypeImpl#getAufenthaltHeim <em>Aufenthalt Heim</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AufenthaltKindBasisTypeImpl extends MinimalEObjectImpl.Container implements AufenthaltKindBasisType {
	/**
	 * The cached value of the '{@link #getArt() <em>Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArt()
	 * @generated
	 * @ordered
	 */
	protected CodeKindWohnhaftBeiType art;

	/**
	 * The default value of the '{@link #isAufenthaltsortGeheimHalten() <em>Aufenthaltsort Geheim Halten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAufenthaltsortGeheimHalten()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUFENTHALTSORT_GEHEIM_HALTEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAufenthaltsortGeheimHalten() <em>Aufenthaltsort Geheim Halten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAufenthaltsortGeheimHalten()
	 * @generated
	 * @ordered
	 */
	protected boolean aufenthaltsortGeheimHalten = AUFENTHALTSORT_GEHEIM_HALTEN_EDEFAULT;

	/**
	 * This is true if the Aufenthaltsort Geheim Halten attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aufenthaltsortGeheimHaltenESet;

	/**
	 * The cached value of the '{@link #getAuslandsschuljahr() <em>Auslandsschuljahr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuslandsschuljahr()
	 * @generated
	 * @ordered
	 */
	protected ZeitraumType auslandsschuljahr;

	/**
	 * The default value of the '{@link #getSeitWann() <em>Seit Wann</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeitWann()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar SEIT_WANN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeitWann() <em>Seit Wann</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeitWann()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar seitWann = SEIT_WANN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAufenthaltHeim() <em>Aufenthalt Heim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufenthaltHeim()
	 * @generated
	 * @ordered
	 */
	protected static final String AUFENTHALT_HEIM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAufenthaltHeim() <em>Aufenthalt Heim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufenthaltHeim()
	 * @generated
	 * @ordered
	 */
	protected String aufenthaltHeim = AUFENTHALT_HEIM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AufenthaltKindBasisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getAufenthaltKindBasisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeKindWohnhaftBeiType getArt() {
		return art;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArt(CodeKindWohnhaftBeiType newArt, NotificationChain msgs) {
		CodeKindWohnhaftBeiType oldArt = art;
		art = newArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__ART, oldArt, newArt);
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
	public void setArt(CodeKindWohnhaftBeiType newArt) {
		if (newArt != art) {
			NotificationChain msgs = null;
			if (art != null)
				msgs = ((InternalEObject)art).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__ART, null, msgs);
			if (newArt != null)
				msgs = ((InternalEObject)newArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__ART, null, msgs);
			msgs = basicSetArt(newArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__ART, newArt, newArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAufenthaltsortGeheimHalten() {
		return aufenthaltsortGeheimHalten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAufenthaltsortGeheimHalten(boolean newAufenthaltsortGeheimHalten) {
		boolean oldAufenthaltsortGeheimHalten = aufenthaltsortGeheimHalten;
		aufenthaltsortGeheimHalten = newAufenthaltsortGeheimHalten;
		boolean oldAufenthaltsortGeheimHaltenESet = aufenthaltsortGeheimHaltenESet;
		aufenthaltsortGeheimHaltenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__AUFENTHALTSORT_GEHEIM_HALTEN, oldAufenthaltsortGeheimHalten, aufenthaltsortGeheimHalten, !oldAufenthaltsortGeheimHaltenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAufenthaltsortGeheimHalten() {
		boolean oldAufenthaltsortGeheimHalten = aufenthaltsortGeheimHalten;
		boolean oldAufenthaltsortGeheimHaltenESet = aufenthaltsortGeheimHaltenESet;
		aufenthaltsortGeheimHalten = AUFENTHALTSORT_GEHEIM_HALTEN_EDEFAULT;
		aufenthaltsortGeheimHaltenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__AUFENTHALTSORT_GEHEIM_HALTEN, oldAufenthaltsortGeheimHalten, AUFENTHALTSORT_GEHEIM_HALTEN_EDEFAULT, oldAufenthaltsortGeheimHaltenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAufenthaltsortGeheimHalten() {
		return aufenthaltsortGeheimHaltenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZeitraumType getAuslandsschuljahr() {
		return auslandsschuljahr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuslandsschuljahr(ZeitraumType newAuslandsschuljahr, NotificationChain msgs) {
		ZeitraumType oldAuslandsschuljahr = auslandsschuljahr;
		auslandsschuljahr = newAuslandsschuljahr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__AUSLANDSSCHULJAHR, oldAuslandsschuljahr, newAuslandsschuljahr);
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
	public void setAuslandsschuljahr(ZeitraumType newAuslandsschuljahr) {
		if (newAuslandsschuljahr != auslandsschuljahr) {
			NotificationChain msgs = null;
			if (auslandsschuljahr != null)
				msgs = ((InternalEObject)auslandsschuljahr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__AUSLANDSSCHULJAHR, null, msgs);
			if (newAuslandsschuljahr != null)
				msgs = ((InternalEObject)newAuslandsschuljahr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__AUSLANDSSCHULJAHR, null, msgs);
			msgs = basicSetAuslandsschuljahr(newAuslandsschuljahr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__AUSLANDSSCHULJAHR, newAuslandsschuljahr, newAuslandsschuljahr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getSeitWann() {
		return seitWann;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeitWann(XMLGregorianCalendar newSeitWann) {
		XMLGregorianCalendar oldSeitWann = seitWann;
		seitWann = newSeitWann;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__SEIT_WANN, oldSeitWann, seitWann));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAufenthaltHeim() {
		return aufenthaltHeim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAufenthaltHeim(String newAufenthaltHeim) {
		String oldAufenthaltHeim = aufenthaltHeim;
		aufenthaltHeim = newAufenthaltHeim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__AUFENTHALT_HEIM, oldAufenthaltHeim, aufenthaltHeim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__ART:
				return basicSetArt(null, msgs);
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__AUSLANDSSCHULJAHR:
				return basicSetAuslandsschuljahr(null, msgs);
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
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__ART:
				return getArt();
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__AUFENTHALTSORT_GEHEIM_HALTEN:
				return isAufenthaltsortGeheimHalten();
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__AUSLANDSSCHULJAHR:
				return getAuslandsschuljahr();
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__SEIT_WANN:
				return getSeitWann();
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__AUFENTHALT_HEIM:
				return getAufenthaltHeim();
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
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__ART:
				setArt((CodeKindWohnhaftBeiType)newValue);
				return;
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__AUFENTHALTSORT_GEHEIM_HALTEN:
				setAufenthaltsortGeheimHalten((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__AUSLANDSSCHULJAHR:
				setAuslandsschuljahr((ZeitraumType)newValue);
				return;
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__SEIT_WANN:
				setSeitWann((XMLGregorianCalendar)newValue);
				return;
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__AUFENTHALT_HEIM:
				setAufenthaltHeim((String)newValue);
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
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__ART:
				setArt((CodeKindWohnhaftBeiType)null);
				return;
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__AUFENTHALTSORT_GEHEIM_HALTEN:
				unsetAufenthaltsortGeheimHalten();
				return;
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__AUSLANDSSCHULJAHR:
				setAuslandsschuljahr((ZeitraumType)null);
				return;
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__SEIT_WANN:
				setSeitWann(SEIT_WANN_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__AUFENTHALT_HEIM:
				setAufenthaltHeim(AUFENTHALT_HEIM_EDEFAULT);
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
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__ART:
				return art != null;
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__AUFENTHALTSORT_GEHEIM_HALTEN:
				return isSetAufenthaltsortGeheimHalten();
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__AUSLANDSSCHULJAHR:
				return auslandsschuljahr != null;
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__SEIT_WANN:
				return SEIT_WANN_EDEFAULT == null ? seitWann != null : !SEIT_WANN_EDEFAULT.equals(seitWann);
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE__AUFENTHALT_HEIM:
				return AUFENTHALT_HEIM_EDEFAULT == null ? aufenthaltHeim != null : !AUFENTHALT_HEIM_EDEFAULT.equals(aufenthaltHeim);
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
		result.append(" (aufenthaltsortGeheimHalten: ");
		if (aufenthaltsortGeheimHaltenESet) result.append(aufenthaltsortGeheimHalten); else result.append("<unset>");
		result.append(", seitWann: ");
		result.append(seitWann);
		result.append(", aufenthaltHeim: ");
		result.append(aufenthaltHeim);
		result.append(')');
		return result.toString();
	}

} //AufenthaltKindBasisTypeImpl
