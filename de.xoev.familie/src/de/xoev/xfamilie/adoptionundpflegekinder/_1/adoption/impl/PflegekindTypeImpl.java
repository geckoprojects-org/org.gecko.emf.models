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
package de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl;

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragGezahltVonType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pflegekind Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegekindTypeImpl#getInPflegeSeit <em>In Pflege Seit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegekindTypeImpl#getPflegeform <em>Pflegeform</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegekindTypeImpl#getPauschalbetragGezahltVon <em>Pauschalbetrag Gezahlt Von</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PflegekindTypeImpl extends PflegekindBasisTypeImpl implements PflegekindType {
	/**
	 * The default value of the '{@link #getInPflegeSeit() <em>In Pflege Seit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPflegeSeit()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar IN_PFLEGE_SEIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInPflegeSeit() <em>In Pflege Seit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPflegeSeit()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar inPflegeSeit = IN_PFLEGE_SEIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPflegeform() <em>Pflegeform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPflegeform()
	 * @generated
	 * @ordered
	 */
	protected EObject pflegeform;

	/**
	 * The cached value of the '{@link #getPauschalbetragGezahltVon() <em>Pauschalbetrag Gezahlt Von</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPauschalbetragGezahltVon()
	 * @generated
	 * @ordered
	 */
	protected PauschalbetragGezahltVonType pauschalbetragGezahltVon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PflegekindTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.PFLEGEKIND_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getInPflegeSeit() {
		return inPflegeSeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInPflegeSeit(XMLGregorianCalendar newInPflegeSeit) {
		XMLGregorianCalendar oldInPflegeSeit = inPflegeSeit;
		inPflegeSeit = newInPflegeSeit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.PFLEGEKIND_TYPE__IN_PFLEGE_SEIT, oldInPflegeSeit, inPflegeSeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getPflegeform() {
		return pflegeform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPflegeform(EObject newPflegeform, NotificationChain msgs) {
		EObject oldPflegeform = pflegeform;
		pflegeform = newPflegeform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.PFLEGEKIND_TYPE__PFLEGEFORM, oldPflegeform, newPflegeform);
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
	public void setPflegeform(EObject newPflegeform) {
		if (newPflegeform != pflegeform) {
			NotificationChain msgs = null;
			if (pflegeform != null)
				msgs = ((InternalEObject)pflegeform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PFLEGEKIND_TYPE__PFLEGEFORM, null, msgs);
			if (newPflegeform != null)
				msgs = ((InternalEObject)newPflegeform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PFLEGEKIND_TYPE__PFLEGEFORM, null, msgs);
			msgs = basicSetPflegeform(newPflegeform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.PFLEGEKIND_TYPE__PFLEGEFORM, newPflegeform, newPflegeform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PauschalbetragGezahltVonType getPauschalbetragGezahltVon() {
		return pauschalbetragGezahltVon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPauschalbetragGezahltVon(PauschalbetragGezahltVonType newPauschalbetragGezahltVon, NotificationChain msgs) {
		PauschalbetragGezahltVonType oldPauschalbetragGezahltVon = pauschalbetragGezahltVon;
		pauschalbetragGezahltVon = newPauschalbetragGezahltVon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.PFLEGEKIND_TYPE__PAUSCHALBETRAG_GEZAHLT_VON, oldPauschalbetragGezahltVon, newPauschalbetragGezahltVon);
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
	public void setPauschalbetragGezahltVon(PauschalbetragGezahltVonType newPauschalbetragGezahltVon) {
		if (newPauschalbetragGezahltVon != pauschalbetragGezahltVon) {
			NotificationChain msgs = null;
			if (pauschalbetragGezahltVon != null)
				msgs = ((InternalEObject)pauschalbetragGezahltVon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PFLEGEKIND_TYPE__PAUSCHALBETRAG_GEZAHLT_VON, null, msgs);
			if (newPauschalbetragGezahltVon != null)
				msgs = ((InternalEObject)newPauschalbetragGezahltVon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PFLEGEKIND_TYPE__PAUSCHALBETRAG_GEZAHLT_VON, null, msgs);
			msgs = basicSetPauschalbetragGezahltVon(newPauschalbetragGezahltVon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.PFLEGEKIND_TYPE__PAUSCHALBETRAG_GEZAHLT_VON, newPauschalbetragGezahltVon, newPauschalbetragGezahltVon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.PFLEGEKIND_TYPE__PFLEGEFORM:
				return basicSetPflegeform(null, msgs);
			case AdoptionPackage.PFLEGEKIND_TYPE__PAUSCHALBETRAG_GEZAHLT_VON:
				return basicSetPauschalbetragGezahltVon(null, msgs);
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
			case AdoptionPackage.PFLEGEKIND_TYPE__IN_PFLEGE_SEIT:
				return getInPflegeSeit();
			case AdoptionPackage.PFLEGEKIND_TYPE__PFLEGEFORM:
				return getPflegeform();
			case AdoptionPackage.PFLEGEKIND_TYPE__PAUSCHALBETRAG_GEZAHLT_VON:
				return getPauschalbetragGezahltVon();
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
			case AdoptionPackage.PFLEGEKIND_TYPE__IN_PFLEGE_SEIT:
				setInPflegeSeit((XMLGregorianCalendar)newValue);
				return;
			case AdoptionPackage.PFLEGEKIND_TYPE__PFLEGEFORM:
				setPflegeform((EObject)newValue);
				return;
			case AdoptionPackage.PFLEGEKIND_TYPE__PAUSCHALBETRAG_GEZAHLT_VON:
				setPauschalbetragGezahltVon((PauschalbetragGezahltVonType)newValue);
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
			case AdoptionPackage.PFLEGEKIND_TYPE__IN_PFLEGE_SEIT:
				setInPflegeSeit(IN_PFLEGE_SEIT_EDEFAULT);
				return;
			case AdoptionPackage.PFLEGEKIND_TYPE__PFLEGEFORM:
				setPflegeform((EObject)null);
				return;
			case AdoptionPackage.PFLEGEKIND_TYPE__PAUSCHALBETRAG_GEZAHLT_VON:
				setPauschalbetragGezahltVon((PauschalbetragGezahltVonType)null);
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
			case AdoptionPackage.PFLEGEKIND_TYPE__IN_PFLEGE_SEIT:
				return IN_PFLEGE_SEIT_EDEFAULT == null ? inPflegeSeit != null : !IN_PFLEGE_SEIT_EDEFAULT.equals(inPflegeSeit);
			case AdoptionPackage.PFLEGEKIND_TYPE__PFLEGEFORM:
				return pflegeform != null;
			case AdoptionPackage.PFLEGEKIND_TYPE__PAUSCHALBETRAG_GEZAHLT_VON:
				return pauschalbetragGezahltVon != null;
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
		result.append(" (inPflegeSeit: ");
		result.append(inPflegeSeit);
		result.append(')');
		return result.toString();
	}

} //PflegekindTypeImpl
