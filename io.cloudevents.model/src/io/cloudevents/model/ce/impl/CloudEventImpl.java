/*
 */
package io.cloudevents.model.ce.impl;

import io.cloudevents.model.ce.CloudEvent;
import io.cloudevents.model.ce.CloudEventsPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.cloudevents.model.ce.impl.CloudEventImpl#getEventId <em>Event Id</em>}</li>
 *   <li>{@link io.cloudevents.model.ce.impl.CloudEventImpl#getSource <em>Source</em>}</li>
 *   <li>{@link io.cloudevents.model.ce.impl.CloudEventImpl#getSpecVersion <em>Spec Version</em>}</li>
 *   <li>{@link io.cloudevents.model.ce.impl.CloudEventImpl#getType <em>Type</em>}</li>
 *   <li>{@link io.cloudevents.model.ce.impl.CloudEventImpl#getDatacontenttype <em>Datacontenttype</em>}</li>
 *   <li>{@link io.cloudevents.model.ce.impl.CloudEventImpl#getDataschema <em>Dataschema</em>}</li>
 *   <li>{@link io.cloudevents.model.ce.impl.CloudEventImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link io.cloudevents.model.ce.impl.CloudEventImpl#getTime <em>Time</em>}</li>
 *   <li>{@link io.cloudevents.model.ce.impl.CloudEventImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link io.cloudevents.model.ce.impl.CloudEventImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudEventImpl extends MinimalEObjectImpl.Container implements CloudEvent {
	/**
	 * The default value of the '{@link #getEventId() <em>Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventId()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventId() <em>Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventId()
	 * @generated
	 * @ordered
	 */
	protected String eventId = EVENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecVersion() <em>Spec Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEC_VERSION_EDEFAULT = "1.0";

	/**
	 * The cached value of the '{@link #getSpecVersion() <em>Spec Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecVersion()
	 * @generated
	 * @ordered
	 */
	protected String specVersion = SPEC_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatacontenttype() <em>Datacontenttype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacontenttype()
	 * @generated
	 * @ordered
	 */
	protected static final String DATACONTENTTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatacontenttype() <em>Datacontenttype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacontenttype()
	 * @generated
	 * @ordered
	 */
	protected String datacontenttype = DATACONTENTTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataschema() <em>Dataschema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataschema()
	 * @generated
	 * @ordered
	 */
	protected static final String DATASCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataschema() <em>Dataschema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataschema()
	 * @generated
	 * @ordered
	 */
	protected String dataschema = DATASCHEMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected String subject = SUBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Date time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> extensions;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EObject data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudEventsPackage.Literals.CLOUD_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEventId() {
		return eventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventId(String newEventId) {
		String oldEventId = eventId;
		eventId = newEventId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudEventsPackage.CLOUD_EVENT__EVENT_ID, oldEventId, eventId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudEventsPackage.CLOUD_EVENT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecVersion() {
		return specVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecVersion(String newSpecVersion) {
		String oldSpecVersion = specVersion;
		specVersion = newSpecVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudEventsPackage.CLOUD_EVENT__SPEC_VERSION, oldSpecVersion, specVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudEventsPackage.CLOUD_EVENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatacontenttype() {
		return datacontenttype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatacontenttype(String newDatacontenttype) {
		String oldDatacontenttype = datacontenttype;
		datacontenttype = newDatacontenttype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudEventsPackage.CLOUD_EVENT__DATACONTENTTYPE, oldDatacontenttype, datacontenttype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataschema() {
		return dataschema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataschema(String newDataschema) {
		String oldDataschema = dataschema;
		dataschema = newDataschema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudEventsPackage.CLOUD_EVENT__DATASCHEMA, oldDataschema, dataschema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(String newSubject) {
		String oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudEventsPackage.CLOUD_EVENT__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudEventsPackage.CLOUD_EVENT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getExtensions() {
		if (extensions == null) {
			extensions = new EcoreEMap<String,String>(CloudEventsPackage.Literals.EXTENSION_ATTRIBUTE, ExtensionAttributeImpl.class, this, CloudEventsPackage.CLOUD_EVENT__EXTENSIONS);
		}
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(EObject newData, NotificationChain msgs) {
		EObject oldData = data;
		data = newData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloudEventsPackage.CLOUD_EVENT__DATA, oldData, newData);
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
	public void setData(EObject newData) {
		if (newData != data) {
			NotificationChain msgs = null;
			if (data != null)
				msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CloudEventsPackage.CLOUD_EVENT__DATA, null, msgs);
			if (newData != null)
				msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CloudEventsPackage.CLOUD_EVENT__DATA, null, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudEventsPackage.CLOUD_EVENT__DATA, newData, newData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudEventsPackage.CLOUD_EVENT__EXTENSIONS:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
			case CloudEventsPackage.CLOUD_EVENT__DATA:
				return basicSetData(null, msgs);
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
			case CloudEventsPackage.CLOUD_EVENT__EVENT_ID:
				return getEventId();
			case CloudEventsPackage.CLOUD_EVENT__SOURCE:
				return getSource();
			case CloudEventsPackage.CLOUD_EVENT__SPEC_VERSION:
				return getSpecVersion();
			case CloudEventsPackage.CLOUD_EVENT__TYPE:
				return getType();
			case CloudEventsPackage.CLOUD_EVENT__DATACONTENTTYPE:
				return getDatacontenttype();
			case CloudEventsPackage.CLOUD_EVENT__DATASCHEMA:
				return getDataschema();
			case CloudEventsPackage.CLOUD_EVENT__SUBJECT:
				return getSubject();
			case CloudEventsPackage.CLOUD_EVENT__TIME:
				return getTime();
			case CloudEventsPackage.CLOUD_EVENT__EXTENSIONS:
				if (coreType) return getExtensions();
				else return getExtensions().map();
			case CloudEventsPackage.CLOUD_EVENT__DATA:
				return getData();
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
			case CloudEventsPackage.CLOUD_EVENT__EVENT_ID:
				setEventId((String)newValue);
				return;
			case CloudEventsPackage.CLOUD_EVENT__SOURCE:
				setSource((String)newValue);
				return;
			case CloudEventsPackage.CLOUD_EVENT__SPEC_VERSION:
				setSpecVersion((String)newValue);
				return;
			case CloudEventsPackage.CLOUD_EVENT__TYPE:
				setType((String)newValue);
				return;
			case CloudEventsPackage.CLOUD_EVENT__DATACONTENTTYPE:
				setDatacontenttype((String)newValue);
				return;
			case CloudEventsPackage.CLOUD_EVENT__DATASCHEMA:
				setDataschema((String)newValue);
				return;
			case CloudEventsPackage.CLOUD_EVENT__SUBJECT:
				setSubject((String)newValue);
				return;
			case CloudEventsPackage.CLOUD_EVENT__TIME:
				setTime((Date)newValue);
				return;
			case CloudEventsPackage.CLOUD_EVENT__EXTENSIONS:
				((EStructuralFeature.Setting)getExtensions()).set(newValue);
				return;
			case CloudEventsPackage.CLOUD_EVENT__DATA:
				setData((EObject)newValue);
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
			case CloudEventsPackage.CLOUD_EVENT__EVENT_ID:
				setEventId(EVENT_ID_EDEFAULT);
				return;
			case CloudEventsPackage.CLOUD_EVENT__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case CloudEventsPackage.CLOUD_EVENT__SPEC_VERSION:
				setSpecVersion(SPEC_VERSION_EDEFAULT);
				return;
			case CloudEventsPackage.CLOUD_EVENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CloudEventsPackage.CLOUD_EVENT__DATACONTENTTYPE:
				setDatacontenttype(DATACONTENTTYPE_EDEFAULT);
				return;
			case CloudEventsPackage.CLOUD_EVENT__DATASCHEMA:
				setDataschema(DATASCHEMA_EDEFAULT);
				return;
			case CloudEventsPackage.CLOUD_EVENT__SUBJECT:
				setSubject(SUBJECT_EDEFAULT);
				return;
			case CloudEventsPackage.CLOUD_EVENT__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case CloudEventsPackage.CLOUD_EVENT__EXTENSIONS:
				getExtensions().clear();
				return;
			case CloudEventsPackage.CLOUD_EVENT__DATA:
				setData((EObject)null);
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
			case CloudEventsPackage.CLOUD_EVENT__EVENT_ID:
				return EVENT_ID_EDEFAULT == null ? eventId != null : !EVENT_ID_EDEFAULT.equals(eventId);
			case CloudEventsPackage.CLOUD_EVENT__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case CloudEventsPackage.CLOUD_EVENT__SPEC_VERSION:
				return SPEC_VERSION_EDEFAULT == null ? specVersion != null : !SPEC_VERSION_EDEFAULT.equals(specVersion);
			case CloudEventsPackage.CLOUD_EVENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case CloudEventsPackage.CLOUD_EVENT__DATACONTENTTYPE:
				return DATACONTENTTYPE_EDEFAULT == null ? datacontenttype != null : !DATACONTENTTYPE_EDEFAULT.equals(datacontenttype);
			case CloudEventsPackage.CLOUD_EVENT__DATASCHEMA:
				return DATASCHEMA_EDEFAULT == null ? dataschema != null : !DATASCHEMA_EDEFAULT.equals(dataschema);
			case CloudEventsPackage.CLOUD_EVENT__SUBJECT:
				return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
			case CloudEventsPackage.CLOUD_EVENT__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case CloudEventsPackage.CLOUD_EVENT__EXTENSIONS:
				return extensions != null && !extensions.isEmpty();
			case CloudEventsPackage.CLOUD_EVENT__DATA:
				return data != null;
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
		result.append(" (eventId: ");
		result.append(eventId);
		result.append(", source: ");
		result.append(source);
		result.append(", specVersion: ");
		result.append(specVersion);
		result.append(", type: ");
		result.append(type);
		result.append(", datacontenttype: ");
		result.append(datacontenttype);
		result.append(", dataschema: ");
		result.append(dataschema);
		result.append(", subject: ");
		result.append(subject);
		result.append(", time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //CloudEventImpl
