/**
 */
package org.w3.owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.w3.owl.Datatype;
import org.w3.owl.OwlPackage;
import org.w3.rdf.RDFType;
import org.w3.rdf.RDFValue;
import org.w3.rdf.RdfPackage;
import org.w3.rdfs.IsDefinedBy;
import org.w3.rdfs.Member;
import org.w3.rdfs.RDFClass;
import org.w3.rdfs.RDFComment;
import org.w3.rdfs.RDFDatatype;
import org.w3.rdfs.RDFLabel;
import org.w3.rdfs.RDFResource;
import org.w3.rdfs.RdfsPackage;
import org.w3.rdfs.SeeAlso;
import org.w3.rdfs.SubClassOf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.owl.impl.DatatypeImpl#getRdfComment <em>Rdf Comment</em>}</li>
 *   <li>{@link org.w3.owl.impl.DatatypeImpl#getIsDefinedBy <em>Is Defined By</em>}</li>
 *   <li>{@link org.w3.owl.impl.DatatypeImpl#getSeeAlso <em>See Also</em>}</li>
 *   <li>{@link org.w3.owl.impl.DatatypeImpl#getRdfMembers <em>Rdf Members</em>}</li>
 *   <li>{@link org.w3.owl.impl.DatatypeImpl#getRdfLabel <em>Rdf Label</em>}</li>
 *   <li>{@link org.w3.owl.impl.DatatypeImpl#getRdfType <em>Rdf Type</em>}</li>
 *   <li>{@link org.w3.owl.impl.DatatypeImpl#getRdfValue <em>Rdf Value</em>}</li>
 *   <li>{@link org.w3.owl.impl.DatatypeImpl#getSubClassOf <em>Sub Class Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatatypeImpl extends TypeImpl implements Datatype {
	/**
	 * The cached value of the '{@link #getRdfComment() <em>Rdf Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdfComment()
	 * @generated
	 * @ordered
	 */
	protected RDFComment rdfComment;

	/**
	 * The cached value of the '{@link #getIsDefinedBy() <em>Is Defined By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefinedBy()
	 * @generated
	 * @ordered
	 */
	protected IsDefinedBy isDefinedBy;

	/**
	 * The cached value of the '{@link #getSeeAlso() <em>See Also</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeeAlso()
	 * @generated
	 * @ordered
	 */
	protected SeeAlso seeAlso;

	/**
	 * The cached value of the '{@link #getRdfMembers() <em>Rdf Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdfMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Member> rdfMembers;

	/**
	 * The cached value of the '{@link #getRdfLabel() <em>Rdf Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdfLabel()
	 * @generated
	 * @ordered
	 */
	protected RDFLabel rdfLabel;

	/**
	 * The cached value of the '{@link #getRdfType() <em>Rdf Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdfType()
	 * @generated
	 * @ordered
	 */
	protected RDFType rdfType;

	/**
	 * The cached value of the '{@link #getRdfValue() <em>Rdf Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdfValue()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFValue> rdfValue;

	/**
	 * The cached value of the '{@link #getSubClassOf() <em>Sub Class Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClassOf()
	 * @generated
	 * @ordered
	 */
	protected SubClassOf subClassOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.DATATYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFComment getRdfComment() {
		return rdfComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdfComment(RDFComment newRdfComment, NotificationChain msgs) {
		RDFComment oldRdfComment = rdfComment;
		rdfComment = newRdfComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlPackage.DATATYPE__RDF_COMMENT, oldRdfComment, newRdfComment);
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
	public void setRdfComment(RDFComment newRdfComment) {
		if (newRdfComment != rdfComment) {
			NotificationChain msgs = null;
			if (rdfComment != null)
				msgs = ((InternalEObject)rdfComment).eInverseRemove(this, RdfsPackage.RDF_COMMENT__RESOURCE, RDFComment.class, msgs);
			if (newRdfComment != null)
				msgs = ((InternalEObject)newRdfComment).eInverseAdd(this, RdfsPackage.RDF_COMMENT__RESOURCE, RDFComment.class, msgs);
			msgs = basicSetRdfComment(newRdfComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATATYPE__RDF_COMMENT, newRdfComment, newRdfComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsDefinedBy getIsDefinedBy() {
		if (isDefinedBy != null && isDefinedBy.eIsProxy()) {
			InternalEObject oldIsDefinedBy = (InternalEObject)isDefinedBy;
			isDefinedBy = (IsDefinedBy)eResolveProxy(oldIsDefinedBy);
			if (isDefinedBy != oldIsDefinedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.DATATYPE__IS_DEFINED_BY, oldIsDefinedBy, isDefinedBy));
			}
		}
		return isDefinedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsDefinedBy basicGetIsDefinedBy() {
		return isDefinedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDefinedBy(IsDefinedBy newIsDefinedBy) {
		IsDefinedBy oldIsDefinedBy = isDefinedBy;
		isDefinedBy = newIsDefinedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATATYPE__IS_DEFINED_BY, oldIsDefinedBy, isDefinedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeeAlso getSeeAlso() {
		if (seeAlso != null && seeAlso.eIsProxy()) {
			InternalEObject oldSeeAlso = (InternalEObject)seeAlso;
			seeAlso = (SeeAlso)eResolveProxy(oldSeeAlso);
			if (seeAlso != oldSeeAlso) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.DATATYPE__SEE_ALSO, oldSeeAlso, seeAlso));
			}
		}
		return seeAlso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeeAlso basicGetSeeAlso() {
		return seeAlso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeeAlso(SeeAlso newSeeAlso, NotificationChain msgs) {
		SeeAlso oldSeeAlso = seeAlso;
		seeAlso = newSeeAlso;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlPackage.DATATYPE__SEE_ALSO, oldSeeAlso, newSeeAlso);
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
	public void setSeeAlso(SeeAlso newSeeAlso) {
		if (newSeeAlso != seeAlso) {
			NotificationChain msgs = null;
			if (seeAlso != null)
				msgs = ((InternalEObject)seeAlso).eInverseRemove(this, RdfsPackage.SEE_ALSO__RESOURCE, SeeAlso.class, msgs);
			if (newSeeAlso != null)
				msgs = ((InternalEObject)newSeeAlso).eInverseAdd(this, RdfsPackage.SEE_ALSO__RESOURCE, SeeAlso.class, msgs);
			msgs = basicSetSeeAlso(newSeeAlso, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATATYPE__SEE_ALSO, newSeeAlso, newSeeAlso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Member> getRdfMembers() {
		if (rdfMembers == null) {
			rdfMembers = new EObjectWithInverseResolvingEList<Member>(Member.class, this, OwlPackage.DATATYPE__RDF_MEMBERS, RdfsPackage.MEMBER__RESOURCE);
		}
		return rdfMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFLabel getRdfLabel() {
		return rdfLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdfLabel(RDFLabel newRdfLabel, NotificationChain msgs) {
		RDFLabel oldRdfLabel = rdfLabel;
		rdfLabel = newRdfLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlPackage.DATATYPE__RDF_LABEL, oldRdfLabel, newRdfLabel);
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
	public void setRdfLabel(RDFLabel newRdfLabel) {
		if (newRdfLabel != rdfLabel) {
			NotificationChain msgs = null;
			if (rdfLabel != null)
				msgs = ((InternalEObject)rdfLabel).eInverseRemove(this, RdfsPackage.RDF_LABEL__RESOURCE, RDFLabel.class, msgs);
			if (newRdfLabel != null)
				msgs = ((InternalEObject)newRdfLabel).eInverseAdd(this, RdfsPackage.RDF_LABEL__RESOURCE, RDFLabel.class, msgs);
			msgs = basicSetRdfLabel(newRdfLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATATYPE__RDF_LABEL, newRdfLabel, newRdfLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFType getRdfType() {
		if (rdfType != null && rdfType.eIsProxy()) {
			InternalEObject oldRdfType = (InternalEObject)rdfType;
			rdfType = (RDFType)eResolveProxy(oldRdfType);
			if (rdfType != oldRdfType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.DATATYPE__RDF_TYPE, oldRdfType, rdfType));
			}
		}
		return rdfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFType basicGetRdfType() {
		return rdfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdfType(RDFType newRdfType, NotificationChain msgs) {
		RDFType oldRdfType = rdfType;
		rdfType = newRdfType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlPackage.DATATYPE__RDF_TYPE, oldRdfType, newRdfType);
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
	public void setRdfType(RDFType newRdfType) {
		if (newRdfType != rdfType) {
			NotificationChain msgs = null;
			if (rdfType != null)
				msgs = ((InternalEObject)rdfType).eInverseRemove(this, RdfPackage.RDF_TYPE__RESOURCE, RDFType.class, msgs);
			if (newRdfType != null)
				msgs = ((InternalEObject)newRdfType).eInverseAdd(this, RdfPackage.RDF_TYPE__RESOURCE, RDFType.class, msgs);
			msgs = basicSetRdfType(newRdfType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATATYPE__RDF_TYPE, newRdfType, newRdfType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RDFValue> getRdfValue() {
		if (rdfValue == null) {
			rdfValue = new EObjectResolvingEList<RDFValue>(RDFValue.class, this, OwlPackage.DATATYPE__RDF_VALUE);
		}
		return rdfValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubClassOf getSubClassOf() {
		if (subClassOf != null && subClassOf.eIsProxy()) {
			InternalEObject oldSubClassOf = (InternalEObject)subClassOf;
			subClassOf = (SubClassOf)eResolveProxy(oldSubClassOf);
			if (subClassOf != oldSubClassOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.DATATYPE__SUB_CLASS_OF, oldSubClassOf, subClassOf));
			}
		}
		return subClassOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubClassOf basicGetSubClassOf() {
		return subClassOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubClassOf(SubClassOf newSubClassOf, NotificationChain msgs) {
		SubClassOf oldSubClassOf = subClassOf;
		subClassOf = newSubClassOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlPackage.DATATYPE__SUB_CLASS_OF, oldSubClassOf, newSubClassOf);
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
	public void setSubClassOf(SubClassOf newSubClassOf) {
		if (newSubClassOf != subClassOf) {
			NotificationChain msgs = null;
			if (subClassOf != null)
				msgs = ((InternalEObject)subClassOf).eInverseRemove(this, RdfsPackage.SUB_CLASS_OF__RDF_CLASS, SubClassOf.class, msgs);
			if (newSubClassOf != null)
				msgs = ((InternalEObject)newSubClassOf).eInverseAdd(this, RdfsPackage.SUB_CLASS_OF__RDF_CLASS, SubClassOf.class, msgs);
			msgs = basicSetSubClassOf(newSubClassOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATATYPE__SUB_CLASS_OF, newSubClassOf, newSubClassOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OwlPackage.DATATYPE__RDF_COMMENT:
				if (rdfComment != null)
					msgs = ((InternalEObject)rdfComment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OwlPackage.DATATYPE__RDF_COMMENT, null, msgs);
				return basicSetRdfComment((RDFComment)otherEnd, msgs);
			case OwlPackage.DATATYPE__SEE_ALSO:
				if (seeAlso != null)
					msgs = ((InternalEObject)seeAlso).eInverseRemove(this, RdfsPackage.SEE_ALSO__RESOURCE, SeeAlso.class, msgs);
				return basicSetSeeAlso((SeeAlso)otherEnd, msgs);
			case OwlPackage.DATATYPE__RDF_MEMBERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRdfMembers()).basicAdd(otherEnd, msgs);
			case OwlPackage.DATATYPE__RDF_LABEL:
				if (rdfLabel != null)
					msgs = ((InternalEObject)rdfLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OwlPackage.DATATYPE__RDF_LABEL, null, msgs);
				return basicSetRdfLabel((RDFLabel)otherEnd, msgs);
			case OwlPackage.DATATYPE__RDF_TYPE:
				if (rdfType != null)
					msgs = ((InternalEObject)rdfType).eInverseRemove(this, RdfPackage.RDF_TYPE__RESOURCE, RDFType.class, msgs);
				return basicSetRdfType((RDFType)otherEnd, msgs);
			case OwlPackage.DATATYPE__SUB_CLASS_OF:
				if (subClassOf != null)
					msgs = ((InternalEObject)subClassOf).eInverseRemove(this, RdfsPackage.SUB_CLASS_OF__RDF_CLASS, SubClassOf.class, msgs);
				return basicSetSubClassOf((SubClassOf)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OwlPackage.DATATYPE__RDF_COMMENT:
				return basicSetRdfComment(null, msgs);
			case OwlPackage.DATATYPE__SEE_ALSO:
				return basicSetSeeAlso(null, msgs);
			case OwlPackage.DATATYPE__RDF_MEMBERS:
				return ((InternalEList<?>)getRdfMembers()).basicRemove(otherEnd, msgs);
			case OwlPackage.DATATYPE__RDF_LABEL:
				return basicSetRdfLabel(null, msgs);
			case OwlPackage.DATATYPE__RDF_TYPE:
				return basicSetRdfType(null, msgs);
			case OwlPackage.DATATYPE__SUB_CLASS_OF:
				return basicSetSubClassOf(null, msgs);
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
			case OwlPackage.DATATYPE__RDF_COMMENT:
				return getRdfComment();
			case OwlPackage.DATATYPE__IS_DEFINED_BY:
				if (resolve) return getIsDefinedBy();
				return basicGetIsDefinedBy();
			case OwlPackage.DATATYPE__SEE_ALSO:
				if (resolve) return getSeeAlso();
				return basicGetSeeAlso();
			case OwlPackage.DATATYPE__RDF_MEMBERS:
				return getRdfMembers();
			case OwlPackage.DATATYPE__RDF_LABEL:
				return getRdfLabel();
			case OwlPackage.DATATYPE__RDF_TYPE:
				if (resolve) return getRdfType();
				return basicGetRdfType();
			case OwlPackage.DATATYPE__RDF_VALUE:
				return getRdfValue();
			case OwlPackage.DATATYPE__SUB_CLASS_OF:
				if (resolve) return getSubClassOf();
				return basicGetSubClassOf();
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
			case OwlPackage.DATATYPE__RDF_COMMENT:
				setRdfComment((RDFComment)newValue);
				return;
			case OwlPackage.DATATYPE__IS_DEFINED_BY:
				setIsDefinedBy((IsDefinedBy)newValue);
				return;
			case OwlPackage.DATATYPE__SEE_ALSO:
				setSeeAlso((SeeAlso)newValue);
				return;
			case OwlPackage.DATATYPE__RDF_MEMBERS:
				getRdfMembers().clear();
				getRdfMembers().addAll((Collection<? extends Member>)newValue);
				return;
			case OwlPackage.DATATYPE__RDF_LABEL:
				setRdfLabel((RDFLabel)newValue);
				return;
			case OwlPackage.DATATYPE__RDF_TYPE:
				setRdfType((RDFType)newValue);
				return;
			case OwlPackage.DATATYPE__RDF_VALUE:
				getRdfValue().clear();
				getRdfValue().addAll((Collection<? extends RDFValue>)newValue);
				return;
			case OwlPackage.DATATYPE__SUB_CLASS_OF:
				setSubClassOf((SubClassOf)newValue);
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
			case OwlPackage.DATATYPE__RDF_COMMENT:
				setRdfComment((RDFComment)null);
				return;
			case OwlPackage.DATATYPE__IS_DEFINED_BY:
				setIsDefinedBy((IsDefinedBy)null);
				return;
			case OwlPackage.DATATYPE__SEE_ALSO:
				setSeeAlso((SeeAlso)null);
				return;
			case OwlPackage.DATATYPE__RDF_MEMBERS:
				getRdfMembers().clear();
				return;
			case OwlPackage.DATATYPE__RDF_LABEL:
				setRdfLabel((RDFLabel)null);
				return;
			case OwlPackage.DATATYPE__RDF_TYPE:
				setRdfType((RDFType)null);
				return;
			case OwlPackage.DATATYPE__RDF_VALUE:
				getRdfValue().clear();
				return;
			case OwlPackage.DATATYPE__SUB_CLASS_OF:
				setSubClassOf((SubClassOf)null);
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
			case OwlPackage.DATATYPE__RDF_COMMENT:
				return rdfComment != null;
			case OwlPackage.DATATYPE__IS_DEFINED_BY:
				return isDefinedBy != null;
			case OwlPackage.DATATYPE__SEE_ALSO:
				return seeAlso != null;
			case OwlPackage.DATATYPE__RDF_MEMBERS:
				return rdfMembers != null && !rdfMembers.isEmpty();
			case OwlPackage.DATATYPE__RDF_LABEL:
				return rdfLabel != null;
			case OwlPackage.DATATYPE__RDF_TYPE:
				return rdfType != null;
			case OwlPackage.DATATYPE__RDF_VALUE:
				return rdfValue != null && !rdfValue.isEmpty();
			case OwlPackage.DATATYPE__SUB_CLASS_OF:
				return subClassOf != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == RDFResource.class) {
			switch (derivedFeatureID) {
				case OwlPackage.DATATYPE__RDF_COMMENT: return RdfsPackage.RDF_RESOURCE__RDF_COMMENT;
				case OwlPackage.DATATYPE__IS_DEFINED_BY: return RdfsPackage.RDF_RESOURCE__IS_DEFINED_BY;
				case OwlPackage.DATATYPE__SEE_ALSO: return RdfsPackage.RDF_RESOURCE__SEE_ALSO;
				case OwlPackage.DATATYPE__RDF_MEMBERS: return RdfsPackage.RDF_RESOURCE__RDF_MEMBERS;
				case OwlPackage.DATATYPE__RDF_LABEL: return RdfsPackage.RDF_RESOURCE__RDF_LABEL;
				case OwlPackage.DATATYPE__RDF_TYPE: return RdfsPackage.RDF_RESOURCE__RDF_TYPE;
				case OwlPackage.DATATYPE__RDF_VALUE: return RdfsPackage.RDF_RESOURCE__RDF_VALUE;
				default: return -1;
			}
		}
		if (baseClass == RDFClass.class) {
			switch (derivedFeatureID) {
				case OwlPackage.DATATYPE__SUB_CLASS_OF: return RdfsPackage.RDF_CLASS__SUB_CLASS_OF;
				default: return -1;
			}
		}
		if (baseClass == RDFDatatype.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == RDFResource.class) {
			switch (baseFeatureID) {
				case RdfsPackage.RDF_RESOURCE__RDF_COMMENT: return OwlPackage.DATATYPE__RDF_COMMENT;
				case RdfsPackage.RDF_RESOURCE__IS_DEFINED_BY: return OwlPackage.DATATYPE__IS_DEFINED_BY;
				case RdfsPackage.RDF_RESOURCE__SEE_ALSO: return OwlPackage.DATATYPE__SEE_ALSO;
				case RdfsPackage.RDF_RESOURCE__RDF_MEMBERS: return OwlPackage.DATATYPE__RDF_MEMBERS;
				case RdfsPackage.RDF_RESOURCE__RDF_LABEL: return OwlPackage.DATATYPE__RDF_LABEL;
				case RdfsPackage.RDF_RESOURCE__RDF_TYPE: return OwlPackage.DATATYPE__RDF_TYPE;
				case RdfsPackage.RDF_RESOURCE__RDF_VALUE: return OwlPackage.DATATYPE__RDF_VALUE;
				default: return -1;
			}
		}
		if (baseClass == RDFClass.class) {
			switch (baseFeatureID) {
				case RdfsPackage.RDF_CLASS__SUB_CLASS_OF: return OwlPackage.DATATYPE__SUB_CLASS_OF;
				default: return -1;
			}
		}
		if (baseClass == RDFDatatype.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DatatypeImpl
