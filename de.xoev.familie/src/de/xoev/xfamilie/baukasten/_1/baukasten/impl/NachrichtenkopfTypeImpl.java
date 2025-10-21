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
import de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerErreichbarType;
import de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostkorbHandleType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nachrichtenkopf Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtenkopfTypeImpl#getIdentifikationNachricht <em>Identifikation Nachricht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtenkopfTypeImpl#getLeser <em>Leser</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtenkopfTypeImpl#getAutor <em>Autor</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtenkopfTypeImpl#getPostkorbHandle <em>Postkorb Handle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NachrichtenkopfTypeImpl extends MinimalEObjectImpl.Container implements NachrichtenkopfType {
	/**
	 * The cached value of the '{@link #getIdentifikationNachricht() <em>Identifikation Nachricht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifikationNachricht()
	 * @generated
	 * @ordered
	 */
	protected IdentifikationNachrichtType identifikationNachricht;

	/**
	 * The cached value of the '{@link #getLeser() <em>Leser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeser()
	 * @generated
	 * @ordered
	 */
	protected KommunikationspartnerType leser;

	/**
	 * The cached value of the '{@link #getAutor() <em>Autor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutor()
	 * @generated
	 * @ordered
	 */
	protected KommunikationspartnerErreichbarType autor;

	/**
	 * The cached value of the '{@link #getPostkorbHandle() <em>Postkorb Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostkorbHandle()
	 * @generated
	 * @ordered
	 */
	protected PostkorbHandleType postkorbHandle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NachrichtenkopfTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.NACHRICHTENKOPF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifikationNachrichtType getIdentifikationNachricht() {
		return identifikationNachricht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifikationNachricht(IdentifikationNachrichtType newIdentifikationNachricht, NotificationChain msgs) {
		IdentifikationNachrichtType oldIdentifikationNachricht = identifikationNachricht;
		identifikationNachricht = newIdentifikationNachricht;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT, oldIdentifikationNachricht, newIdentifikationNachricht);
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
	public void setIdentifikationNachricht(IdentifikationNachrichtType newIdentifikationNachricht) {
		if (newIdentifikationNachricht != identifikationNachricht) {
			NotificationChain msgs = null;
			if (identifikationNachricht != null)
				msgs = ((InternalEObject)identifikationNachricht).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT, null, msgs);
			if (newIdentifikationNachricht != null)
				msgs = ((InternalEObject)newIdentifikationNachricht).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT, null, msgs);
			msgs = basicSetIdentifikationNachricht(newIdentifikationNachricht, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT, newIdentifikationNachricht, newIdentifikationNachricht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KommunikationspartnerType getLeser() {
		return leser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeser(KommunikationspartnerType newLeser, NotificationChain msgs) {
		KommunikationspartnerType oldLeser = leser;
		leser = newLeser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHRICHTENKOPF_TYPE__LESER, oldLeser, newLeser);
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
	public void setLeser(KommunikationspartnerType newLeser) {
		if (newLeser != leser) {
			NotificationChain msgs = null;
			if (leser != null)
				msgs = ((InternalEObject)leser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.NACHRICHTENKOPF_TYPE__LESER, null, msgs);
			if (newLeser != null)
				msgs = ((InternalEObject)newLeser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.NACHRICHTENKOPF_TYPE__LESER, null, msgs);
			msgs = basicSetLeser(newLeser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHRICHTENKOPF_TYPE__LESER, newLeser, newLeser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KommunikationspartnerErreichbarType getAutor() {
		return autor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutor(KommunikationspartnerErreichbarType newAutor, NotificationChain msgs) {
		KommunikationspartnerErreichbarType oldAutor = autor;
		autor = newAutor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHRICHTENKOPF_TYPE__AUTOR, oldAutor, newAutor);
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
	public void setAutor(KommunikationspartnerErreichbarType newAutor) {
		if (newAutor != autor) {
			NotificationChain msgs = null;
			if (autor != null)
				msgs = ((InternalEObject)autor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.NACHRICHTENKOPF_TYPE__AUTOR, null, msgs);
			if (newAutor != null)
				msgs = ((InternalEObject)newAutor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.NACHRICHTENKOPF_TYPE__AUTOR, null, msgs);
			msgs = basicSetAutor(newAutor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHRICHTENKOPF_TYPE__AUTOR, newAutor, newAutor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostkorbHandleType getPostkorbHandle() {
		return postkorbHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostkorbHandle(PostkorbHandleType newPostkorbHandle, NotificationChain msgs) {
		PostkorbHandleType oldPostkorbHandle = postkorbHandle;
		postkorbHandle = newPostkorbHandle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHRICHTENKOPF_TYPE__POSTKORB_HANDLE, oldPostkorbHandle, newPostkorbHandle);
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
	public void setPostkorbHandle(PostkorbHandleType newPostkorbHandle) {
		if (newPostkorbHandle != postkorbHandle) {
			NotificationChain msgs = null;
			if (postkorbHandle != null)
				msgs = ((InternalEObject)postkorbHandle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.NACHRICHTENKOPF_TYPE__POSTKORB_HANDLE, null, msgs);
			if (newPostkorbHandle != null)
				msgs = ((InternalEObject)newPostkorbHandle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.NACHRICHTENKOPF_TYPE__POSTKORB_HANDLE, null, msgs);
			msgs = basicSetPostkorbHandle(newPostkorbHandle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHRICHTENKOPF_TYPE__POSTKORB_HANDLE, newPostkorbHandle, newPostkorbHandle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT:
				return basicSetIdentifikationNachricht(null, msgs);
			case BaukastenPackage.NACHRICHTENKOPF_TYPE__LESER:
				return basicSetLeser(null, msgs);
			case BaukastenPackage.NACHRICHTENKOPF_TYPE__AUTOR:
				return basicSetAutor(null, msgs);
			case BaukastenPackage.NACHRICHTENKOPF_TYPE__POSTKORB_HANDLE:
				return basicSetPostkorbHandle(null, msgs);
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
			case BaukastenPackage.NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT:
				return getIdentifikationNachricht();
			case BaukastenPackage.NACHRICHTENKOPF_TYPE__LESER:
				return getLeser();
			case BaukastenPackage.NACHRICHTENKOPF_TYPE__AUTOR:
				return getAutor();
			case BaukastenPackage.NACHRICHTENKOPF_TYPE__POSTKORB_HANDLE:
				return getPostkorbHandle();
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
			case BaukastenPackage.NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT:
				setIdentifikationNachricht((IdentifikationNachrichtType)newValue);
				return;
			case BaukastenPackage.NACHRICHTENKOPF_TYPE__LESER:
				setLeser((KommunikationspartnerType)newValue);
				return;
			case BaukastenPackage.NACHRICHTENKOPF_TYPE__AUTOR:
				setAutor((KommunikationspartnerErreichbarType)newValue);
				return;
			case BaukastenPackage.NACHRICHTENKOPF_TYPE__POSTKORB_HANDLE:
				setPostkorbHandle((PostkorbHandleType)newValue);
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
			case BaukastenPackage.NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT:
				setIdentifikationNachricht((IdentifikationNachrichtType)null);
				return;
			case BaukastenPackage.NACHRICHTENKOPF_TYPE__LESER:
				setLeser((KommunikationspartnerType)null);
				return;
			case BaukastenPackage.NACHRICHTENKOPF_TYPE__AUTOR:
				setAutor((KommunikationspartnerErreichbarType)null);
				return;
			case BaukastenPackage.NACHRICHTENKOPF_TYPE__POSTKORB_HANDLE:
				setPostkorbHandle((PostkorbHandleType)null);
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
			case BaukastenPackage.NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT:
				return identifikationNachricht != null;
			case BaukastenPackage.NACHRICHTENKOPF_TYPE__LESER:
				return leser != null;
			case BaukastenPackage.NACHRICHTENKOPF_TYPE__AUTOR:
				return autor != null;
			case BaukastenPackage.NACHRICHTENKOPF_TYPE__POSTKORB_HANDLE:
				return postkorbHandle != null;
		}
		return super.eIsSet(featureID);
	}

} //NachrichtenkopfTypeImpl
