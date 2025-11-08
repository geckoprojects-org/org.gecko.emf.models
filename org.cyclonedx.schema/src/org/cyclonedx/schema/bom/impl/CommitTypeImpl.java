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
package org.cyclonedx.schema.bom.impl;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.CommitType;
import org.cyclonedx.schema.bom.IdentifiableActionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CommitTypeImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CommitTypeImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CommitTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CommitTypeImpl#getCommitter <em>Committer</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CommitTypeImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CommitTypeImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommitTypeImpl extends MinimalEObjectImpl.Container implements CommitType {
	/**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected String uid = UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected IdentifiableActionType author;

	/**
	 * The cached value of the '{@link #getCommitter() <em>Committer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitter()
	 * @generated
	 * @ordered
	 */
	protected IdentifiableActionType committer;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getCommitType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUid(String newUid) {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMMIT_TYPE__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMMIT_TYPE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifiableActionType getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(IdentifiableActionType newAuthor, NotificationChain msgs) {
		IdentifiableActionType oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMMIT_TYPE__AUTHOR, oldAuthor, newAuthor);
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
	public void setAuthor(IdentifiableActionType newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMMIT_TYPE__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMMIT_TYPE__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMMIT_TYPE__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifiableActionType getCommitter() {
		return committer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommitter(IdentifiableActionType newCommitter, NotificationChain msgs) {
		IdentifiableActionType oldCommitter = committer;
		committer = newCommitter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMMIT_TYPE__COMMITTER, oldCommitter, newCommitter);
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
	public void setCommitter(IdentifiableActionType newCommitter) {
		if (newCommitter != committer) {
			NotificationChain msgs = null;
			if (committer != null)
				msgs = ((InternalEObject)committer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMMIT_TYPE__COMMITTER, null, msgs);
			if (newCommitter != null)
				msgs = ((InternalEObject)newCommitter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMMIT_TYPE__COMMITTER, null, msgs);
			msgs = basicSetCommitter(newCommitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMMIT_TYPE__COMMITTER, newCommitter, newCommitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMMIT_TYPE__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.COMMIT_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.COMMIT_TYPE__AUTHOR:
				return basicSetAuthor(null, msgs);
			case BOMPackage.COMMIT_TYPE__COMMITTER:
				return basicSetCommitter(null, msgs);
			case BOMPackage.COMMIT_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case BOMPackage.COMMIT_TYPE__UID:
				return getUid();
			case BOMPackage.COMMIT_TYPE__URL:
				return getUrl();
			case BOMPackage.COMMIT_TYPE__AUTHOR:
				return getAuthor();
			case BOMPackage.COMMIT_TYPE__COMMITTER:
				return getCommitter();
			case BOMPackage.COMMIT_TYPE__MESSAGE:
				return getMessage();
			case BOMPackage.COMMIT_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
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
			case BOMPackage.COMMIT_TYPE__UID:
				setUid((String)newValue);
				return;
			case BOMPackage.COMMIT_TYPE__URL:
				setUrl((String)newValue);
				return;
			case BOMPackage.COMMIT_TYPE__AUTHOR:
				setAuthor((IdentifiableActionType)newValue);
				return;
			case BOMPackage.COMMIT_TYPE__COMMITTER:
				setCommitter((IdentifiableActionType)newValue);
				return;
			case BOMPackage.COMMIT_TYPE__MESSAGE:
				setMessage((String)newValue);
				return;
			case BOMPackage.COMMIT_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
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
			case BOMPackage.COMMIT_TYPE__UID:
				setUid(UID_EDEFAULT);
				return;
			case BOMPackage.COMMIT_TYPE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case BOMPackage.COMMIT_TYPE__AUTHOR:
				setAuthor((IdentifiableActionType)null);
				return;
			case BOMPackage.COMMIT_TYPE__COMMITTER:
				setCommitter((IdentifiableActionType)null);
				return;
			case BOMPackage.COMMIT_TYPE__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case BOMPackage.COMMIT_TYPE__ANY:
				getAny().clear();
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
			case BOMPackage.COMMIT_TYPE__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case BOMPackage.COMMIT_TYPE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case BOMPackage.COMMIT_TYPE__AUTHOR:
				return author != null;
			case BOMPackage.COMMIT_TYPE__COMMITTER:
				return committer != null;
			case BOMPackage.COMMIT_TYPE__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case BOMPackage.COMMIT_TYPE__ANY:
				return any != null && !any.isEmpty();
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
		result.append(" (uid: ");
		result.append(uid);
		result.append(", url: ");
		result.append(url);
		result.append(", message: ");
		result.append(message);
		result.append(", any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //CommitTypeImpl
