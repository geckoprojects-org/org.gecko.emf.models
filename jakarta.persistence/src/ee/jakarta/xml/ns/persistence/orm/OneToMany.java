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
package ee.jakarta.xml.ns.persistence.orm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One To Many</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         @Target({METHOD, FIELD}) @Retention(RUNTIME)
 *         public @interface OneToMany {
 *           Class<?> targetEntity() default void.class;
 *           CascadeType[] cascade() default {};
 *           FetchType fetch() default FetchType.LAZY;
 *           String mappedBy() default "";
 *           boolean orphanRemoval() default false;
 *         }
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getOrderBy <em>Order By</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getOrderColumn <em>Order Column</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKey <em>Map Key</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyClass <em>Map Key Class</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyTemporal <em>Map Key Temporal</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyEnumerated <em>Map Key Enumerated</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyAttributeOverride <em>Map Key Attribute Override</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyConvert <em>Map Key Convert</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyColumn <em>Map Key Column</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyJoinColumn <em>Map Key Join Column</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyForeignKey <em>Map Key Foreign Key</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getJoinTable <em>Join Table</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getJoinColumn <em>Join Column</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getCascade <em>Cascade</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getAccess <em>Access</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getFetch <em>Fetch</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMappedBy <em>Mapped By</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getName <em>Name</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#isOrphanRemoval <em>Orphan Removal</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 *
 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany()
 * @model extendedMetaData="name='one-to-many' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface OneToMany extends EObject {
	/**
	 * Returns the value of the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order By</em>' attribute.
	 * @see #setOrderBy(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany_OrderBy()
	 * @model dataType="ee.jakarta.xml.ns.persistence.orm.OrderBy"
	 *        extendedMetaData="kind='element' name='order-by' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrderBy();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getOrderBy <em>Order By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order By</em>' attribute.
	 * @see #getOrderBy()
	 * @generated
	 */
	void setOrderBy(String value);

	/**
	 * Returns the value of the '<em><b>Order Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Column</em>' containment reference.
	 * @see #setOrderColumn(OrderColumn)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany_OrderColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='order-column' namespace='##targetNamespace'"
	 * @generated
	 */
	OrderColumn getOrderColumn();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getOrderColumn <em>Order Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Column</em>' containment reference.
	 * @see #getOrderColumn()
	 * @generated
	 */
	void setOrderColumn(OrderColumn value);

	/**
	 * Returns the value of the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Key</em>' containment reference.
	 * @see #setMapKey(MapKey)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany_MapKey()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='map-key' namespace='##targetNamespace'"
	 * @generated
	 */
	MapKey getMapKey();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKey <em>Map Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Key</em>' containment reference.
	 * @see #getMapKey()
	 * @generated
	 */
	void setMapKey(MapKey value);

	/**
	 * Returns the value of the '<em><b>Map Key Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Key Class</em>' containment reference.
	 * @see #setMapKeyClass(MapKeyClass)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany_MapKeyClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='map-key-class' namespace='##targetNamespace'"
	 * @generated
	 */
	MapKeyClass getMapKeyClass();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyClass <em>Map Key Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Key Class</em>' containment reference.
	 * @see #getMapKeyClass()
	 * @generated
	 */
	void setMapKeyClass(MapKeyClass value);

	/**
	 * Returns the value of the '<em><b>Map Key Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Key Temporal</em>' attribute.
	 * @see #setMapKeyTemporal(TemporalType)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany_MapKeyTemporal()
	 * @model dataType="ee.jakarta.xml.ns.persistence.orm.Temporal"
	 *        extendedMetaData="kind='element' name='map-key-temporal' namespace='##targetNamespace'"
	 * @generated
	 */
	TemporalType getMapKeyTemporal();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyTemporal <em>Map Key Temporal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Key Temporal</em>' attribute.
	 * @see #getMapKeyTemporal()
	 * @generated
	 */
	void setMapKeyTemporal(TemporalType value);

	/**
	 * Returns the value of the '<em><b>Map Key Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Key Enumerated</em>' attribute.
	 * @see #setMapKeyEnumerated(EnumType)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany_MapKeyEnumerated()
	 * @model dataType="ee.jakarta.xml.ns.persistence.orm.Enumerated"
	 *        extendedMetaData="kind='element' name='map-key-enumerated' namespace='##targetNamespace'"
	 * @generated
	 */
	EnumType getMapKeyEnumerated();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyEnumerated <em>Map Key Enumerated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Key Enumerated</em>' attribute.
	 * @see #getMapKeyEnumerated()
	 * @generated
	 */
	void setMapKeyEnumerated(EnumType value);

	/**
	 * Returns the value of the '<em><b>Map Key Attribute Override</b></em>' containment reference list.
	 * The list contents are of type {@link ee.jakarta.xml.ns.persistence.orm.AttributeOverride}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Key Attribute Override</em>' containment reference list.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany_MapKeyAttributeOverride()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='map-key-attribute-override' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AttributeOverride> getMapKeyAttributeOverride();

	/**
	 * Returns the value of the '<em><b>Map Key Convert</b></em>' containment reference list.
	 * The list contents are of type {@link ee.jakarta.xml.ns.persistence.orm.Convert}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Key Convert</em>' containment reference list.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany_MapKeyConvert()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='map-key-convert' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Convert> getMapKeyConvert();

	/**
	 * Returns the value of the '<em><b>Map Key Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Key Column</em>' containment reference.
	 * @see #setMapKeyColumn(MapKeyColumn)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany_MapKeyColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='map-key-column' namespace='##targetNamespace'"
	 * @generated
	 */
	MapKeyColumn getMapKeyColumn();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyColumn <em>Map Key Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Key Column</em>' containment reference.
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	void setMapKeyColumn(MapKeyColumn value);

	/**
	 * Returns the value of the '<em><b>Map Key Join Column</b></em>' containment reference list.
	 * The list contents are of type {@link ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Key Join Column</em>' containment reference list.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany_MapKeyJoinColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='map-key-join-column' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MapKeyJoinColumn> getMapKeyJoinColumn();

	/**
	 * Returns the value of the '<em><b>Map Key Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Key Foreign Key</em>' containment reference.
	 * @see #setMapKeyForeignKey(ForeignKey)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany_MapKeyForeignKey()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='map-key-foreign-key' namespace='##targetNamespace'"
	 * @generated
	 */
	ForeignKey getMapKeyForeignKey();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyForeignKey <em>Map Key Foreign Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Key Foreign Key</em>' containment reference.
	 * @see #getMapKeyForeignKey()
	 * @generated
	 */
	void setMapKeyForeignKey(ForeignKey value);

	/**
	 * Returns the value of the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Table</em>' containment reference.
	 * @see #setJoinTable(JoinTable)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany_JoinTable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='join-table' namespace='##targetNamespace'"
	 * @generated
	 */
	JoinTable getJoinTable();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getJoinTable <em>Join Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Table</em>' containment reference.
	 * @see #getJoinTable()
	 * @generated
	 */
	void setJoinTable(JoinTable value);

	/**
	 * Returns the value of the '<em><b>Join Column</b></em>' containment reference list.
	 * The list contents are of type {@link ee.jakarta.xml.ns.persistence.orm.JoinColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Column</em>' containment reference list.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany_JoinColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='join-column' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<JoinColumn> getJoinColumn();

	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key</em>' containment reference.
	 * @see #setForeignKey(ForeignKey)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany_ForeignKey()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='foreign-key' namespace='##targetNamespace'"
	 * @generated
	 */
	ForeignKey getForeignKey();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getForeignKey <em>Foreign Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key</em>' containment reference.
	 * @see #getForeignKey()
	 * @generated
	 */
	void setForeignKey(ForeignKey value);

	/**
	 * Returns the value of the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade</em>' containment reference.
	 * @see #setCascade(CascadeType)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany_Cascade()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cascade' namespace='##targetNamespace'"
	 * @generated
	 */
	CascadeType getCascade();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getCascade <em>Cascade</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade</em>' containment reference.
	 * @see #getCascade()
	 * @generated
	 */
	void setCascade(CascadeType value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * The literals are from the enumeration {@link ee.jakarta.xml.ns.persistence.orm.AccessType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see ee.jakarta.xml.ns.persistence.orm.AccessType
	 * @see #isSetAccess()
	 * @see #unsetAccess()
	 * @see #setAccess(AccessType)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany_Access()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='access'"
	 * @generated
	 */
	AccessType getAccess();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see ee.jakarta.xml.ns.persistence.orm.AccessType
	 * @see #isSetAccess()
	 * @see #unsetAccess()
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(AccessType value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccess()
	 * @see #getAccess()
	 * @see #setAccess(AccessType)
	 * @generated
	 */
	void unsetAccess();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getAccess <em>Access</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Access</em>' attribute is set.
	 * @see #unsetAccess()
	 * @see #getAccess()
	 * @see #setAccess(AccessType)
	 * @generated
	 */
	boolean isSetAccess();

	/**
	 * Returns the value of the '<em><b>Fetch</b></em>' attribute.
	 * The literals are from the enumeration {@link ee.jakarta.xml.ns.persistence.orm.FetchType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fetch</em>' attribute.
	 * @see ee.jakarta.xml.ns.persistence.orm.FetchType
	 * @see #isSetFetch()
	 * @see #unsetFetch()
	 * @see #setFetch(FetchType)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany_Fetch()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fetch'"
	 * @generated
	 */
	FetchType getFetch();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getFetch <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fetch</em>' attribute.
	 * @see ee.jakarta.xml.ns.persistence.orm.FetchType
	 * @see #isSetFetch()
	 * @see #unsetFetch()
	 * @see #getFetch()
	 * @generated
	 */
	void setFetch(FetchType value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getFetch <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFetch()
	 * @see #getFetch()
	 * @see #setFetch(FetchType)
	 * @generated
	 */
	void unsetFetch();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getFetch <em>Fetch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fetch</em>' attribute is set.
	 * @see #unsetFetch()
	 * @see #getFetch()
	 * @see #setFetch(FetchType)
	 * @generated
	 */
	boolean isSetFetch();

	/**
	 * Returns the value of the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped By</em>' attribute.
	 * @see #setMappedBy(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany_MappedBy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mapped-by'"
	 * @generated
	 */
	String getMappedBy();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMappedBy <em>Mapped By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped By</em>' attribute.
	 * @see #getMappedBy()
	 * @generated
	 */
	void setMappedBy(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Orphan Removal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orphan Removal</em>' attribute.
	 * @see #isSetOrphanRemoval()
	 * @see #unsetOrphanRemoval()
	 * @see #setOrphanRemoval(boolean)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany_OrphanRemoval()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='orphan-removal'"
	 * @generated
	 */
	boolean isOrphanRemoval();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#isOrphanRemoval <em>Orphan Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orphan Removal</em>' attribute.
	 * @see #isSetOrphanRemoval()
	 * @see #unsetOrphanRemoval()
	 * @see #isOrphanRemoval()
	 * @generated
	 */
	void setOrphanRemoval(boolean value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#isOrphanRemoval <em>Orphan Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrphanRemoval()
	 * @see #isOrphanRemoval()
	 * @see #setOrphanRemoval(boolean)
	 * @generated
	 */
	void unsetOrphanRemoval();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#isOrphanRemoval <em>Orphan Removal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Orphan Removal</em>' attribute is set.
	 * @see #unsetOrphanRemoval()
	 * @see #isOrphanRemoval()
	 * @see #setOrphanRemoval(boolean)
	 * @generated
	 */
	boolean isSetOrphanRemoval();

	/**
	 * Returns the value of the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Entity</em>' attribute.
	 * @see #setTargetEntity(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getOneToMany_TargetEntity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='target-entity'"
	 * @generated
	 */
	String getTargetEntity();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getTargetEntity <em>Target Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Entity</em>' attribute.
	 * @see #getTargetEntity()
	 * @generated
	 */
	void setTargetEntity(String value);

} // OneToMany
