package com.api.domain.entity;
/** Updated by nguyethtm
 * Date: 04/08/2023
 * Time: 05:40
 * */

import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Service entity.
 */
@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class UserService {
  private Long id;

  /** <code>service_id</code>. */
  private Long serviceId;

  /** <code>user_id</code>. */
  private Long userId;

  /** <code>user_id</code>. */
  private Integer status;

  /** <code>quantity</code>. */
  private Integer quantity;

  /** <code>created_at</code>. */
  private OffsetDateTime createdAt;

  /** <code>created_by</code>. */
  private String createdBy;

  /** <code>updated_at</code>. */
  private OffsetDateTime updatedAt;

  /** <code>updated_by</code>. */
  private String updatedBy;

  /** <code>deleted_at</code>. */
  private OffsetDateTime deletedAt;

  /** <code>deleted_by</code>. */
  private String deletedBy;
}
