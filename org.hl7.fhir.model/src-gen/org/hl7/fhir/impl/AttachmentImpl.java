/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Attachment;
import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Code;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Integer64;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Url;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AttachmentImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AttachmentImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AttachmentImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AttachmentImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AttachmentImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AttachmentImpl#getHash <em>Hash</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AttachmentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AttachmentImpl#getCreation <em>Creation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AttachmentImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AttachmentImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AttachmentImpl#getFrames <em>Frames</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AttachmentImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AttachmentImpl#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentImpl extends DataTypeImpl implements Attachment {
	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected Code contentType;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Code language;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary data;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Url url;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Integer64 size;

	/**
	 * The cached value of the '{@link #getHash() <em>Hash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHash()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary hash;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String title;

	/**
	 * The cached value of the '{@link #getCreation() <em>Creation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreation()
	 * @generated
	 * @ordered
	 */
	protected DateTime creation;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt height;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt width;

	/**
	 * The cached value of the '{@link #getFrames() <em>Frames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrames()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt frames;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Decimal duration;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt pages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getAttachment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentType(Code newContentType, NotificationChain msgs) {
		Code oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__CONTENT_TYPE, oldContentType, newContentType);
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
	public void setContentType(Code newContentType) {
		if (newContentType != contentType) {
			NotificationChain msgs = null;
			if (contentType != null)
				msgs = ((InternalEObject)contentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__CONTENT_TYPE, null, msgs);
			if (newContentType != null)
				msgs = ((InternalEObject)newContentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__CONTENT_TYPE, null, msgs);
			msgs = basicSetContentType(newContentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__CONTENT_TYPE, newContentType, newContentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(Code newLanguage, NotificationChain msgs) {
		Code oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__LANGUAGE, oldLanguage, newLanguage);
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
	public void setLanguage(Code newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__LANGUAGE, newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64Binary getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(Base64Binary newData, NotificationChain msgs) {
		Base64Binary oldData = data;
		data = newData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__DATA, oldData, newData);
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
	public void setData(Base64Binary newData) {
		if (newData != data) {
			NotificationChain msgs = null;
			if (data != null)
				msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__DATA, null, msgs);
			if (newData != null)
				msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__DATA, null, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__DATA, newData, newData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Url getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Url newUrl, NotificationChain msgs) {
		Url oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__URL, oldUrl, newUrl);
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
	public void setUrl(Url newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer64 getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(Integer64 newSize, NotificationChain msgs) {
		Integer64 oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__SIZE, oldSize, newSize);
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
	public void setSize(Integer64 newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64Binary getHash() {
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHash(Base64Binary newHash, NotificationChain msgs) {
		Base64Binary oldHash = hash;
		hash = newHash;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__HASH, oldHash, newHash);
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
	public void setHash(Base64Binary newHash) {
		if (newHash != hash) {
			NotificationChain msgs = null;
			if (hash != null)
				msgs = ((InternalEObject)hash).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__HASH, null, msgs);
			if (newHash != null)
				msgs = ((InternalEObject)newHash).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__HASH, null, msgs);
			msgs = basicSetHash(newHash, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__HASH, newHash, newHash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__TITLE, oldTitle, newTitle);
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
	public void setTitle(org.hl7.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getCreation() {
		return creation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreation(DateTime newCreation, NotificationChain msgs) {
		DateTime oldCreation = creation;
		creation = newCreation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__CREATION, oldCreation, newCreation);
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
	public void setCreation(DateTime newCreation) {
		if (newCreation != creation) {
			NotificationChain msgs = null;
			if (creation != null)
				msgs = ((InternalEObject)creation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__CREATION, null, msgs);
			if (newCreation != null)
				msgs = ((InternalEObject)newCreation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__CREATION, null, msgs);
			msgs = basicSetCreation(newCreation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__CREATION, newCreation, newCreation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeight(PositiveInt newHeight, NotificationChain msgs) {
		PositiveInt oldHeight = height;
		height = newHeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__HEIGHT, oldHeight, newHeight);
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
	public void setHeight(PositiveInt newHeight) {
		if (newHeight != height) {
			NotificationChain msgs = null;
			if (height != null)
				msgs = ((InternalEObject)height).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__HEIGHT, null, msgs);
			if (newHeight != null)
				msgs = ((InternalEObject)newHeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__HEIGHT, null, msgs);
			msgs = basicSetHeight(newHeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__HEIGHT, newHeight, newHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWidth(PositiveInt newWidth, NotificationChain msgs) {
		PositiveInt oldWidth = width;
		width = newWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__WIDTH, oldWidth, newWidth);
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
	public void setWidth(PositiveInt newWidth) {
		if (newWidth != width) {
			NotificationChain msgs = null;
			if (width != null)
				msgs = ((InternalEObject)width).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__WIDTH, null, msgs);
			if (newWidth != null)
				msgs = ((InternalEObject)newWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__WIDTH, null, msgs);
			msgs = basicSetWidth(newWidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__WIDTH, newWidth, newWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getFrames() {
		return frames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrames(PositiveInt newFrames, NotificationChain msgs) {
		PositiveInt oldFrames = frames;
		frames = newFrames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__FRAMES, oldFrames, newFrames);
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
	public void setFrames(PositiveInt newFrames) {
		if (newFrames != frames) {
			NotificationChain msgs = null;
			if (frames != null)
				msgs = ((InternalEObject)frames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__FRAMES, null, msgs);
			if (newFrames != null)
				msgs = ((InternalEObject)newFrames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__FRAMES, null, msgs);
			msgs = basicSetFrames(newFrames, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__FRAMES, newFrames, newFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(Decimal newDuration, NotificationChain msgs) {
		Decimal oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__DURATION, oldDuration, newDuration);
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
	public void setDuration(Decimal newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getPages() {
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPages(PositiveInt newPages, NotificationChain msgs) {
		PositiveInt oldPages = pages;
		pages = newPages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__PAGES, oldPages, newPages);
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
	public void setPages(PositiveInt newPages) {
		if (newPages != pages) {
			NotificationChain msgs = null;
			if (pages != null)
				msgs = ((InternalEObject)pages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__PAGES, null, msgs);
			if (newPages != null)
				msgs = ((InternalEObject)newPages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ATTACHMENT__PAGES, null, msgs);
			msgs = basicSetPages(newPages, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ATTACHMENT__PAGES, newPages, newPages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.ATTACHMENT__CONTENT_TYPE:
				return basicSetContentType(null, msgs);
			case FHIRPackage.ATTACHMENT__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case FHIRPackage.ATTACHMENT__DATA:
				return basicSetData(null, msgs);
			case FHIRPackage.ATTACHMENT__URL:
				return basicSetUrl(null, msgs);
			case FHIRPackage.ATTACHMENT__SIZE:
				return basicSetSize(null, msgs);
			case FHIRPackage.ATTACHMENT__HASH:
				return basicSetHash(null, msgs);
			case FHIRPackage.ATTACHMENT__TITLE:
				return basicSetTitle(null, msgs);
			case FHIRPackage.ATTACHMENT__CREATION:
				return basicSetCreation(null, msgs);
			case FHIRPackage.ATTACHMENT__HEIGHT:
				return basicSetHeight(null, msgs);
			case FHIRPackage.ATTACHMENT__WIDTH:
				return basicSetWidth(null, msgs);
			case FHIRPackage.ATTACHMENT__FRAMES:
				return basicSetFrames(null, msgs);
			case FHIRPackage.ATTACHMENT__DURATION:
				return basicSetDuration(null, msgs);
			case FHIRPackage.ATTACHMENT__PAGES:
				return basicSetPages(null, msgs);
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
			case FHIRPackage.ATTACHMENT__CONTENT_TYPE:
				return getContentType();
			case FHIRPackage.ATTACHMENT__LANGUAGE:
				return getLanguage();
			case FHIRPackage.ATTACHMENT__DATA:
				return getData();
			case FHIRPackage.ATTACHMENT__URL:
				return getUrl();
			case FHIRPackage.ATTACHMENT__SIZE:
				return getSize();
			case FHIRPackage.ATTACHMENT__HASH:
				return getHash();
			case FHIRPackage.ATTACHMENT__TITLE:
				return getTitle();
			case FHIRPackage.ATTACHMENT__CREATION:
				return getCreation();
			case FHIRPackage.ATTACHMENT__HEIGHT:
				return getHeight();
			case FHIRPackage.ATTACHMENT__WIDTH:
				return getWidth();
			case FHIRPackage.ATTACHMENT__FRAMES:
				return getFrames();
			case FHIRPackage.ATTACHMENT__DURATION:
				return getDuration();
			case FHIRPackage.ATTACHMENT__PAGES:
				return getPages();
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
			case FHIRPackage.ATTACHMENT__CONTENT_TYPE:
				setContentType((Code)newValue);
				return;
			case FHIRPackage.ATTACHMENT__LANGUAGE:
				setLanguage((Code)newValue);
				return;
			case FHIRPackage.ATTACHMENT__DATA:
				setData((Base64Binary)newValue);
				return;
			case FHIRPackage.ATTACHMENT__URL:
				setUrl((Url)newValue);
				return;
			case FHIRPackage.ATTACHMENT__SIZE:
				setSize((Integer64)newValue);
				return;
			case FHIRPackage.ATTACHMENT__HASH:
				setHash((Base64Binary)newValue);
				return;
			case FHIRPackage.ATTACHMENT__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.ATTACHMENT__CREATION:
				setCreation((DateTime)newValue);
				return;
			case FHIRPackage.ATTACHMENT__HEIGHT:
				setHeight((PositiveInt)newValue);
				return;
			case FHIRPackage.ATTACHMENT__WIDTH:
				setWidth((PositiveInt)newValue);
				return;
			case FHIRPackage.ATTACHMENT__FRAMES:
				setFrames((PositiveInt)newValue);
				return;
			case FHIRPackage.ATTACHMENT__DURATION:
				setDuration((Decimal)newValue);
				return;
			case FHIRPackage.ATTACHMENT__PAGES:
				setPages((PositiveInt)newValue);
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
			case FHIRPackage.ATTACHMENT__CONTENT_TYPE:
				setContentType((Code)null);
				return;
			case FHIRPackage.ATTACHMENT__LANGUAGE:
				setLanguage((Code)null);
				return;
			case FHIRPackage.ATTACHMENT__DATA:
				setData((Base64Binary)null);
				return;
			case FHIRPackage.ATTACHMENT__URL:
				setUrl((Url)null);
				return;
			case FHIRPackage.ATTACHMENT__SIZE:
				setSize((Integer64)null);
				return;
			case FHIRPackage.ATTACHMENT__HASH:
				setHash((Base64Binary)null);
				return;
			case FHIRPackage.ATTACHMENT__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.ATTACHMENT__CREATION:
				setCreation((DateTime)null);
				return;
			case FHIRPackage.ATTACHMENT__HEIGHT:
				setHeight((PositiveInt)null);
				return;
			case FHIRPackage.ATTACHMENT__WIDTH:
				setWidth((PositiveInt)null);
				return;
			case FHIRPackage.ATTACHMENT__FRAMES:
				setFrames((PositiveInt)null);
				return;
			case FHIRPackage.ATTACHMENT__DURATION:
				setDuration((Decimal)null);
				return;
			case FHIRPackage.ATTACHMENT__PAGES:
				setPages((PositiveInt)null);
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
			case FHIRPackage.ATTACHMENT__CONTENT_TYPE:
				return contentType != null;
			case FHIRPackage.ATTACHMENT__LANGUAGE:
				return language != null;
			case FHIRPackage.ATTACHMENT__DATA:
				return data != null;
			case FHIRPackage.ATTACHMENT__URL:
				return url != null;
			case FHIRPackage.ATTACHMENT__SIZE:
				return size != null;
			case FHIRPackage.ATTACHMENT__HASH:
				return hash != null;
			case FHIRPackage.ATTACHMENT__TITLE:
				return title != null;
			case FHIRPackage.ATTACHMENT__CREATION:
				return creation != null;
			case FHIRPackage.ATTACHMENT__HEIGHT:
				return height != null;
			case FHIRPackage.ATTACHMENT__WIDTH:
				return width != null;
			case FHIRPackage.ATTACHMENT__FRAMES:
				return frames != null;
			case FHIRPackage.ATTACHMENT__DURATION:
				return duration != null;
			case FHIRPackage.ATTACHMENT__PAGES:
				return pages != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentImpl
